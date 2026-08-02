package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Og extends Rg {
    public Og(X4 x42) {
        super(x42);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        String value = p52.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            xo xoVar = this.f12818a.f13159t;
            synchronized (xoVar) {
                xoVar.c(xoVar.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            p52.f12739n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        xo xoVar = this.f12818a.f13159t;
        synchronized (xoVar) {
            xoVar.a(xoVar.a() + 1);
        }
        this.f12818a.z();
        M8 m82 = this.f12818a.f13152l;
        if (m82.f12575c == null) {
            m82.a();
        }
        O8 o82 = m82.f12575c;
        o82.getClass();
        o82.f12683b = new HashSet();
        o82.f12685d = 0;
        O8 o83 = m82.f12575c;
        o83.f12682a = true;
        R8 r82 = m82.f12574b;
        IBinaryDataHelper iBinaryDataHelper = r82.f12810c;
        Q8 q82 = r82.f12809b;
        r82.f12808a.getClass();
        iBinaryDataHelper.insert("event_hashes", q82.toByteArray((Q8) P8.a(o83)));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C0320m2 c0320m2 = this.f12818a.t().f13775y;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c0320m2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C0320m2 c0320m2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c0320m2 == null) {
            return false;
        }
        for (Pair pair : c0320m2.f14223a) {
            if (lo.a(pair.first, str) && ((obj = pair.second) == null || ((C0295l2) obj).f14162a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
