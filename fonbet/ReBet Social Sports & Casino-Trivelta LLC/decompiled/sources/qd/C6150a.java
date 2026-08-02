package qd;

import a1.C1908a;
import android.content.Intent;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.Q;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;
import og.i;
import ug.AbstractC6574b;

/* renamed from: qd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6150a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public String f63465a;

    /* renamed from: b, reason: collision with root package name */
    public double f63466b;

    /* renamed from: c, reason: collision with root package name */
    public String f63467c;

    public C6150a(String str, double d10, String str2) {
        this.f63465a = str;
        this.f63466b = d10;
        this.f63467c = str2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=" + this.f63465a) + "&radius=" + this.f63466b) + "&key=" + this.f63467c).openConnection();
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setInstanceFollowRedirects(true);
            if (httpURLConnection.getResponseCode() == 200) {
                try {
                    ArrayList arrayList = (ArrayList) ((Hashtable) AbstractC6574b.d(i.t(httpURLConnection.getInputStream()))).get("results");
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        Hashtable hashtable = (Hashtable) arrayList.get(i10);
                        Hashtable hashtable2 = (Hashtable) ((Hashtable) hashtable.get("geometry")).get("location");
                        arrayList2.add(new com.zoho.livechat.android.models.c(LiveChatUtil.getString(hashtable2.get("lat")), LiveChatUtil.getString(hashtable2.get("lng")), (String) hashtable.get("icon"), (String) hashtable.get("name"), (String) hashtable.get("vicinity")));
                    }
                    Q.a(this.f63465a, arrayList2);
                    Intent intent = new Intent("locationreceiver");
                    intent.putExtra("operation", "location_suggestions");
                    intent.putExtra("location", this.f63465a);
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
