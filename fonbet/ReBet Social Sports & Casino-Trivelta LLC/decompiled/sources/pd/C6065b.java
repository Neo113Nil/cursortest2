package pd;

import a1.C1908a;
import android.content.Intent;
import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.maps.model.LatLng;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import ug.AbstractC6574b;

/* renamed from: pd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6065b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public String f63127a;

    /* renamed from: b, reason: collision with root package name */
    public LatLng f63128b;

    public void a(String str, LatLng latLng) {
        this.f63127a = str;
        this.f63128b = latLng;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            String str = "https://maps.zoho.com/api/v2/search?needed_keys=%5Blat,lon,label,address%5D&address=%7B'text':'" + this.f63127a + "'%7D&size=20";
            if (this.f63128b != null) {
                str = str + "&priority_lat=" + this.f63128b.f33210a + "&priority_lon=" + this.f63128b.f33211b;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str + "&autocomplete=true&api_key=720092214-8a60a6fe3c5246f98f597cd57dadeaef").openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            LiveChatUtil.log("AutoComplete API | status code: " + responseCode);
            if (responseCode == 200) {
                try {
                    ArrayList arrayList = (ArrayList) ((Hashtable) AbstractC6574b.d(og.i.t(httpURLConnection.getInputStream()))).get("result");
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        Hashtable hashtable = (Hashtable) arrayList.get(i10);
                        String str2 = (String) hashtable.get(AnnotatedPrivateKey.LABEL);
                        String string = LiveChatUtil.getString(hashtable.get("lat"));
                        String string2 = LiveChatUtil.getString(hashtable.get("lon"));
                        String str3 = (String) hashtable.get("city");
                        if (hashtable.containsKey("address_line1")) {
                            str3 = (String) hashtable.get("address_line1");
                        } else if (hashtable.containsKey("addressline2")) {
                            str3 = (String) hashtable.get("address_line2");
                        }
                        arrayList2.add(new com.zoho.livechat.android.models.c(string, string2, str2, str3, (String) hashtable.get("state"), (String) hashtable.get("street"), (String) hashtable.get("city"), (String) hashtable.get(AdRevenueScheme.COUNTRY)));
                    }
                    Q.c(arrayList2);
                    Intent intent = new Intent("locationreceiver");
                    intent.putExtra("operation", "location_suggestions");
                    intent.putExtra("location", this.f63127a);
                    C1908a.b(MobilistenInitProvider.k()).d(intent);
                } catch (Exception e10) {
                    LiveChatUtil.log(e10);
                }
            }
        } catch (Exception e11) {
            LiveChatUtil.log(e11);
        }
    }
}
