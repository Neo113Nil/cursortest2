package f3;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.twilio.voice.EventKeys;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4253n {

    /* renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f46375a;

    /* renamed from: b, reason: collision with root package name */
    public Intent f46376b;

    /* renamed from: c, reason: collision with root package name */
    public String f46377c = "Share";

    /* renamed from: d, reason: collision with root package name */
    public cl.json.e f46378d;

    /* renamed from: e, reason: collision with root package name */
    public ReadableMap f46379e;

    public AbstractC4253n(ReactApplicationContext reactApplicationContext) {
        this.f46375a = reactApplicationContext;
        n(new Intent("android.intent.action.SEND"));
        f().setType("text/plain");
    }

    public static boolean j(String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    public static boolean k(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String o(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    public String a() {
        return null;
    }

    public abstract String b();

    public final ComponentName[] c(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(f().getAction());
        intent.setType(f().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = this.f46375a.getPackageManager().queryIntentActivities(intent, 0);
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(string)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }

    public cl.json.e d(ReadableMap readableMap) {
        String string = j("filename", readableMap) ? readableMap.getString("filename") : null;
        Boolean bool = Boolean.FALSE;
        if (j("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        return j("type", readableMap) ? new cl.json.e(readableMap.getString(EventKeys.URL), readableMap.getString("type"), string, bool2, this.f46375a) : new cl.json.e(readableMap.getString(EventKeys.URL), string, bool2, this.f46375a);
    }

    public cl.json.f e(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (j("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
        }
        Boolean bool = Boolean.FALSE;
        if (j("useInternalStorage", readableMap)) {
            bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool2 = bool;
        return j("type", readableMap) ? new cl.json.f(readableMap.getArray("urls"), arrayList, readableMap.getString("type"), bool2, this.f46375a) : new cl.json.f(readableMap.getArray("urls"), arrayList, bool2, this.f46375a);
    }

    public Intent f() {
        return this.f46376b;
    }

    public Intent[] g(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities = this.f46375a.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[queryIntentActivities.size()];
        for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i10);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction("android.intent.action.VIEW");
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i10] = new Intent(intent2);
        }
        return intentArr;
    }

    public abstract String h();

    public abstract String i();

    public void l(ReadableMap readableMap) {
        this.f46379e = readableMap;
        if (j("isNewTask", readableMap) && readableMap.getBoolean("isNewTask")) {
            f().addFlags(268468224);
        }
        if (j("subject", readableMap)) {
            f().putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (j("email", readableMap)) {
            f().putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString("email")});
        }
        if (j("title", readableMap)) {
            this.f46377c = readableMap.getString("title");
        }
        String string = j("message", readableMap) ? readableMap.getString("message") : "";
        String string2 = j("social", readableMap) ? readableMap.getString("social") : "";
        if (string2.equals("sms")) {
            String string3 = readableMap.getString("recipient");
            if (!string3.isEmpty()) {
                f().putExtra("address", string3);
            }
        }
        if (string2.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            f().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (string2.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            f().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (j("urls", readableMap)) {
            cl.json.f e10 = e(readableMap);
            if (!e10.f()) {
                if (TextUtils.isEmpty(string)) {
                    f().putExtra("android.intent.extra.TEXT", readableMap.getArray("urls").getString(0));
                    return;
                }
                f().putExtra("android.intent.extra.TEXT", string + " " + readableMap.getArray("urls").getString(0));
                return;
            }
            ArrayList d10 = e10.d();
            ClipData clipData = new ClipData(new ClipDescription("Files", new String[]{e10.c()}), new ClipData.Item((Uri) d10.get(0)));
            for (int i10 = 1; i10 < d10.size(); i10++) {
                clipData.addItem(new ClipData.Item((Uri) d10.get(i10)));
            }
            f().setClipData(clipData);
            f().setAction("android.intent.action.SEND_MULTIPLE");
            f().setType(e10.c());
            f().putParcelableArrayListExtra("android.intent.extra.STREAM", d10);
            f().addFlags(1);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        if (!j(EventKeys.URL, readableMap)) {
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        cl.json.e d11 = d(readableMap);
        this.f46378d = d11;
        if (d11.f()) {
            Uri d12 = this.f46378d.d();
            ClipData newUri = ClipData.newUri(this.f46375a.getContentResolver(), "File", d12);
            f().setType(this.f46378d.c());
            f().setClipData(newUri);
            f().putExtra("android.intent.extra.STREAM", d12);
            f().addFlags(1);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        if (TextUtils.isEmpty(string)) {
            f().putExtra("android.intent.extra.TEXT", readableMap.getString(EventKeys.URL));
            return;
        }
        f().putExtra("android.intent.extra.TEXT", string + " " + readableMap.getString(EventKeys.URL));
    }

    public void m() {
        Intent createChooser;
        IntentSender intentSender;
        Activity currentActivity = this.f46375a.getCurrentActivity();
        if (currentActivity == null) {
            q.a("Something went wrong");
            return;
        }
        if (q.d()) {
            intentSender = q.c(this.f46375a);
            createChooser = Intent.createChooser(f(), this.f46377c, intentSender);
        } else {
            createChooser = Intent.createChooser(f(), this.f46377c);
            intentSender = null;
        }
        createChooser.addFlags(1073741824);
        if (j("showAppsToView", this.f46379e) && j(EventKeys.URL, this.f46379e)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType(this.f46378d.c());
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", g(intent, this.f46378d.d()));
        }
        if (j("excludedActivityTypes", this.f46379e)) {
            createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", c(this.f46379e.getArray("excludedActivityTypes")));
            currentActivity.startActivityForResult(createChooser, 16845);
        } else {
            currentActivity.startActivityForResult(createChooser, 16845);
        }
        if (intentSender == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("success", true);
            createMap.putString("message", "OK");
            q.b(createMap);
        }
    }

    public void n(Intent intent) {
        this.f46376b = intent;
    }
}
