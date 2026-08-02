package io.invertase.firebase.messaging;

import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.RemoteMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class x implements v {

    /* renamed from: a, reason: collision with root package name */
    public final String f49336a = ",";

    @Override // io.invertase.firebase.messaging.v
    public void a(String str) {
        Lg.q b10 = Lg.q.b();
        b10.d(str).apply();
        String c10 = b10.c("all_notification_ids", "");
        if (c10.isEmpty()) {
            return;
        }
        b10.e("all_notification_ids", e(str, c10));
    }

    @Override // io.invertase.firebase.messaging.v
    public WritableMap b(String str) {
        String c10 = Lg.q.b().c(str, null);
        if (c10 != null) {
            try {
                WritableMap b10 = a.b(new JSONObject(c10));
                b10.putString("to", str);
                return b10;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    @Override // io.invertase.firebase.messaging.v
    public void c(RemoteMessage remoteMessage) {
        try {
            String jSONObject = a.d(u.i(remoteMessage)).toString();
            Lg.q b10 = Lg.q.b();
            List d10 = d(b10.c("all_notification_ids", ""));
            while (d10.size() > 99) {
                a((String) d10.get(0));
                d10.remove(0);
            }
            String c10 = b10.c("all_notification_ids", "");
            b10.e(remoteMessage.j(), jSONObject);
            b10.e("all_notification_ids", c10 + remoteMessage.j() + ",");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final List d(String str) {
        return new ArrayList(Arrays.asList(str.split(",")));
    }

    public final String e(String str, String str2) {
        return str2.replace(str + ",", "");
    }
}
