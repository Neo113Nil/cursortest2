package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class B6 implements G6 {

    @NotNull
    private final A6 a;

    @Nullable
    private final C4231o6 b;
    private final boolean c;

    public B6(@NotNull A6 a6, @Nullable C4231o6 c4231o6, boolean z) {
        a6.getClass();
        this.a = a6;
        this.b = c4231o6;
        this.c = z;
    }

    @Override // com.ironsource.G6
    public void a(@NotNull Activity activity) {
        activity.getClass();
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.G6
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.a(this.c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.G6
    public void c(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.a(this.c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.G6
    public void loadAd() {
        C4231o6 a = this.a.b().a(true, this.a.c());
        A6 a6 = this.a;
        a6.a(new F6(a6, a));
        a.a(this.a);
    }

    public /* synthetic */ B6(A6 a6, C4231o6 c4231o6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(a6, c4231o6, (i & 4) != 0 ? false : z);
    }

    @Override // com.ironsource.G6
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a(this.c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.G6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.a.a(this.c ? "show failed on expired ad" : "show failed before load called");
    }

    @Override // com.ironsource.G6
    public void a() {
        this.a.a(this.c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.G6
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.a(this.c ? "show success on expired ad" : "show success before load called");
    }
}
