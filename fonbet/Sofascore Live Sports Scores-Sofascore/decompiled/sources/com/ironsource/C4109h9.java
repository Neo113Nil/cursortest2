package com.ironsource;

import android.content.Context;
import com.ironsource.Te;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.h9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4109h9 {

    @NotNull
    public static final a a = new a(null);

    public static final boolean a(@NotNull Context context) {
        return a.b(context);
    }

    @Nullable
    public static final Te b(@NotNull Context context) {
        return a.c(context);
    }

    @NotNull
    public static final C4335u3 c(@NotNull Context context) {
        return a.d(context);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.h9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        public final boolean b(@NotNull Context context) {
            context.getClass();
            C4335u3 d = d(context);
            return d.d().length() > 0 && d.e().length() > 0;
        }

        @Nullable
        public final Te c(@NotNull Context context) {
            context.getClass();
            C4335u3 d = d(context);
            if (d.d().length() <= 0 || d.e().length() <= 0) {
                d = null;
            }
            if (d == null) {
                return null;
            }
            Te te = new Te(context, d.d(), d.f(), d.e());
            te.a(Te.a.CACHE);
            return te;
        }

        @NotNull
        public final C4335u3 d(@NotNull Context context) {
            context.getClass();
            JSONObject a = a(context);
            String optString = a.optString("appKey");
            String optString2 = a.optString("userId");
            String optString3 = a.optString("response");
            optString.getClass();
            optString2.getClass();
            optString3.getClass();
            return new C4335u3(optString, optString2, optString3);
        }

        private a() {
        }
    }
}
