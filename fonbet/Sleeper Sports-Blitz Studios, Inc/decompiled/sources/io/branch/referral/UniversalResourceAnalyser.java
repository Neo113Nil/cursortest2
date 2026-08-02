package io.branch.referral;

import android.content.Context;
import android.net.TrafficStats;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
class UniversalResourceAnalyser {
    private static final String SKIP_LIST_KEY = "uri_skip_list";
    private static final String SKIP_URL_FORMATS_KEY = "skip_url_format_key";
    private static final String UPDATE_URL_PATH = "%sdk/uriskiplist_v#.json";
    private static final String VERSION_KEY = "version";
    private static UniversalResourceAnalyser instance;
    private static JSONObject skipURLFormats;
    private final JSONObject DEFAULT_SKIP_URL_LIST;
    private final ArrayList<String> acceptURLFormats;

    public static UniversalResourceAnalyser getInstance(Context context) {
        if (instance == null) {
            instance = new UniversalResourceAnalyser(context);
        }
        return instance;
    }

    private UniversalResourceAnalyser(Context context) {
        JSONObject jSONObject = new JSONObject();
        this.DEFAULT_SKIP_URL_LIST = jSONObject;
        try {
            jSONObject.putOpt("version", 0);
            JSONArray jSONArray = new JSONArray();
            jSONObject.putOpt(SKIP_LIST_KEY, jSONArray);
            jSONArray.put("^fb\\d+:");
            jSONArray.put("^li\\d+:");
            jSONArray.put("^pdk\\d+:");
            jSONArray.put("^twitterkit-.*:");
            jSONArray.put("^com\\.googleusercontent\\.apps\\.\\d+-.*:\\/oauth");
            jSONArray.put("^(?i)(?!(http|https):).*(:|:.*\\b)(password|o?auth|o?auth.?token|access|access.?token)\\b");
            jSONArray.put("^(?i)((http|https):\\/\\/).*[\\/|?|#].*\\b(password|o?auth|o?auth.?token|access|access.?token)\\b");
        } catch (JSONException unused) {
        }
        skipURLFormats = retrieveSkipURLFormats(context);
        this.acceptURLFormats = new ArrayList<>();
    }

    private JSONObject retrieveSkipURLFormats(Context context) {
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        JSONObject jSONObject = new JSONObject();
        String string = prefHelper.getString(SKIP_URL_FORMATS_KEY);
        if (TextUtils.isEmpty(string) || PrefHelper.NO_STRING_VALUE.equals(string)) {
            return this.DEFAULT_SKIP_URL_LIST;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    void addToSkipURLFormats(String str) {
        JSONArray optJSONArray = skipURLFormats.optJSONArray(SKIP_LIST_KEY);
        if (optJSONArray == null) {
            try {
                optJSONArray = new JSONArray();
                skipURLFormats.put(SKIP_LIST_KEY, optJSONArray);
            } catch (Exception unused) {
                return;
            }
        }
        optJSONArray.put(str);
    }

    void addToAcceptURLFormats(String str) {
        this.acceptURLFormats.add(str);
    }

    void addToAcceptURLFormats(List<String> list) {
        this.acceptURLFormats.addAll(list);
    }

    void checkAndUpdateSkipURLFormats(Context context) {
        try {
            new UrlSkipListUpdateTask(context).executeTask(new Void[0]);
        } catch (Throwable unused) {
        }
    }

    String getStrippedURL(String str) {
        String str2;
        try {
            JSONArray optJSONArray = skipURLFormats.optJSONArray(SKIP_LIST_KEY);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        str2 = optJSONArray.getString(i);
                    } catch (JSONException unused) {
                    }
                    if (Pattern.compile(str2).matcher(str).find()) {
                        break;
                    }
                }
            }
            str2 = null;
            if (str2 == null) {
                if (this.acceptURLFormats.size() <= 0) {
                    return str;
                }
                Iterator<String> it = this.acceptURLFormats.iterator();
                while (it.hasNext()) {
                    if (str.matches(it.next())) {
                        return str;
                    }
                }
            }
            return str2;
        } catch (Exception unused2) {
            return str;
        }
    }

    private static class UrlSkipListUpdateTask extends BranchAsyncTask<Void, Void, JSONObject> {
        private final int TIME_OUT;
        private final PrefHelper prefHelper;

        private UrlSkipListUpdateTask(Context context) {
            this.TIME_OUT = 1500;
            this.prefHelper = PrefHelper.getInstance(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public JSONObject doInBackground(Void... voidArr) {
            TrafficStats.setThreadStatsTag(0);
            JSONObject jSONObject = new JSONObject();
            HttpsURLConnection httpsURLConnection = null;
            try {
                HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(UniversalResourceAnalyser.UPDATE_URL_PATH.replace("%", PrefHelper.getCDNBaseUrl()).replace("#", Integer.toString(UniversalResourceAnalyser.skipURLFormats.optInt("version") + 1))).openConnection();
                try {
                    httpsURLConnection2.setConnectTimeout(1500);
                    httpsURLConnection2.setReadTimeout(1500);
                    if (httpsURLConnection2.getResponseCode() == 200 && httpsURLConnection2.getInputStream() != null) {
                        jSONObject = new JSONObject(new BufferedReader(new InputStreamReader(httpsURLConnection2.getInputStream())).readLine());
                    }
                    if (httpsURLConnection2 != null) {
                        httpsURLConnection2.disconnect();
                    }
                    return jSONObject;
                } catch (Throwable unused) {
                    httpsURLConnection = httpsURLConnection2;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    return jSONObject;
                }
            } catch (Throwable unused2) {
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(JSONObject jSONObject) {
            super.onPostExecute((UrlSkipListUpdateTask) jSONObject);
            if (jSONObject.optInt("version") > UniversalResourceAnalyser.skipURLFormats.optInt("version")) {
                JSONObject unused = UniversalResourceAnalyser.skipURLFormats = jSONObject;
                this.prefHelper.setString(UniversalResourceAnalyser.SKIP_URL_FORMATS_KEY, UniversalResourceAnalyser.skipURLFormats.toString());
            }
        }
    }
}
