package x70;

import Kk.C3532b;
import c8.C5766e;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: x70.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10675b {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C10675b f105096e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f105097f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f105098a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f105099b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String[] f105100c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f105101d;

    /* renamed from: x70.b$a */
    public static final class a {
        @NotNull
        public static C10675b a() {
            return C10675b.f105096e;
        }
    }

    static {
        new C10675b(true, false, new String[0], Integer.valueOf(R.color.oz_semantic_bg_secondary));
        f105096e = new C10675b(false, true, new String[0], null);
    }

    public C10675b(boolean z11, boolean z12, @NotNull String[] onboardingAdvertisingText, Integer num) {
        Intrinsics.checkNotNullParameter(onboardingAdvertisingText, "onboardingAdvertisingText");
        this.f105098a = z11;
        this.f105099b = z12;
        this.f105100c = onboardingAdvertisingText;
        this.f105101d = num;
    }

    public final boolean b() {
        return this.f105099b;
    }

    public final boolean c() {
        return this.f105098a;
    }

    public final Integer d() {
        return this.f105101d;
    }

    @NotNull
    public final String[] e() {
        return this.f105100c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10675b)) {
            return false;
        }
        C10675b c10675b = (C10675b) obj;
        return this.f105098a == c10675b.f105098a && this.f105099b == c10675b.f105099b && this.f105100c.equals(c10675b.f105100c) && Intrinsics.d(this.f105101d, c10675b.f105101d);
    }

    public final int hashCode() {
        int a11 = (C3532b.a(Boolean.hashCode(this.f105098a) * 31, 31, this.f105099b) + Arrays.hashCode(this.f105100c)) * 887503681;
        Integer num = this.f105101d;
        return a11 + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toString() {
        String arrays = Arrays.toString(this.f105100c);
        StringBuilder sb2 = new StringBuilder("OnBoardingConfig(enabled=");
        sb2.append(this.f105098a);
        sb2.append(", allowNativeOnboardingSlides=");
        C5766e.a(", onboardingAdvertisingText=", arrays, ", getHelloOzonBankLottie=null, ultraBackground=null, getProgressLottie=null, logoResource=null, onBoardingDrawable=null, onBoardingColor=", sb2, this.f105099b);
        return Ep.a.c(sb2, this.f105101d, ")");
    }
}
