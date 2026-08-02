package vg;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: vg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10317a {

    /* renamed from: a, reason: collision with root package name */
    private final String f102888a;

    /* renamed from: b, reason: collision with root package name */
    private final Kg.a f102889b;

    /* renamed from: vg.a$a, reason: collision with other inner class name */
    public static final class C2232a {

        /* renamed from: a, reason: collision with root package name */
        private String f102890a;

        /* renamed from: b, reason: collision with root package name */
        private Kg.a f102891b;

        public final String a() {
            return this.f102890a;
        }

        public final Kg.a b() {
            return this.f102891b;
        }

        @NotNull
        public final void c(@NotNull String featureName) {
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            this.f102890a = featureName;
        }

        @NotNull
        public final void d(@NotNull Kg.a limits) {
            Intrinsics.checkNotNullParameter(limits, "limits");
            this.f102891b = limits;
        }
    }

    public C10317a(C2232a c2232a) {
        this.f102888a = c2232a.a();
        this.f102889b = c2232a.b();
    }

    public final void a(String str, String str2) {
        Kg.a aVar;
        if (str2 == null || h.K(str2)) {
            return;
        }
        try {
            JSONObject responseObject = new JSONObject(str2);
            Intrinsics.checkNotNullParameter(responseObject, "responseObject");
            JSONObject optJSONObject = responseObject.optJSONObject("commands");
            if (optJSONObject == null || (aVar = this.f102889b) == null) {
                return;
            }
            long optLong = optJSONObject.optLong("globalShutdownMs");
            Long valueOf = Long.valueOf(optJSONObject.optLong("featureShutdownMs"));
            String str3 = this.f102888a;
            if (str3 == null) {
                valueOf = null;
            }
            optJSONObject.optLong("tagShutdownMs");
            aVar.c(Long.valueOf(optLong), str3, valueOf);
        } catch (Exception unused) {
            Log.w("Tracer", "Cannot parse content with Content-Type: " + str);
        }
    }
}
