package com.ironsource;

import android.content.Context;
import com.ironsource.Ve;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.zcl;

/* renamed from: com.ironsource.h9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4350h9 {
    public static final a a = new a(null);

    /* renamed from: com.ironsource.h9$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        public final boolean b(Context context) {
            C4630x3 d = d(context);
            return d.d().length() > 0 && d.e().length() > 0;
        }

        public final Ve c(Context context) {
            C4630x3 d = d(context);
            if (d.d().length() <= 0 || d.e().length() <= 0) {
                d = null;
            }
            if (d == null) {
                return null;
            }
            Ve ve = new Ve(context, d.d(), d.f(), d.e());
            ve.a(Ve.a.CACHE);
            return ve;
        }

        public final C4630x3 d(Context context) {
            JSONObject a = a(context);
            return new C4630x3(a.optString("appKey"), a.optString("userId"), a.optString("response"));
        }

        private a() {
        }
    }

    public static final boolean a(Context context) {
        return a.b(context);
    }

    public static final Ve b(Context context) {
        return a.c(context);
    }

    public static final C4630x3 c(Context context) {
        return a.d(context);
    }
}
