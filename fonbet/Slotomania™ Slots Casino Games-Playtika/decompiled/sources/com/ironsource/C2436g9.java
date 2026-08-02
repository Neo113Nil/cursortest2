package com.ironsource;

import android.content.Context;
import com.ironsource.Ve;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.g9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2436g9 {
    public static final a a = new a(null);

    /* renamed from: com.ironsource.g9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return IronSourceNetworkBridge.jsonObjectInit(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return IronSourceNetworkBridge.jsonObjectInit();
            }
        }

        @JvmStatic
        public final boolean b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C2734x3 d = d(context);
            return d.d().length() > 0 && d.e().length() > 0;
        }

        @JvmStatic
        public final Ve c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C2734x3 d = d(context);
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

        @JvmStatic
        public final C2734x3 d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject a = a(context);
            String cachedAppKey = a.optString("appKey");
            String cachedUserId = a.optString("userId");
            String cachedSettings = a.optString("response");
            Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new C2734x3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    @JvmStatic
    public static final boolean a(Context context) {
        return a.b(context);
    }

    @JvmStatic
    public static final Ve b(Context context) {
        return a.c(context);
    }

    @JvmStatic
    public static final C2734x3 c(Context context) {
        return a.d(context);
    }
}
