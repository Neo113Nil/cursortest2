package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.w6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4374w6 implements InterfaceC4428z6 {

    @NotNull
    private final C4338u6 a;

    @NotNull
    private final C4231o6 b;

    @Nullable
    private C4231o6 c;
    private boolean d;

    public C4374w6(@NotNull C4338u6 c4338u6, @NotNull C4231o6 c4231o6, @Nullable C4231o6 c4231o62, boolean z) {
        c4338u6.getClass();
        c4231o6.getClass();
        this.a = c4338u6;
        this.b = c4231o6;
        this.c = c4231o62;
        this.d = z;
    }

    private final void a() {
        InterfaceC4428z6 c4392x6;
        C4231o6 c4231o6 = this.c;
        if (c4231o6 == null) {
            C4338u6 c4338u6 = this.a;
            c4338u6.a(new C4356v6(c4338u6));
        } else {
            LevelPlayAdInfo e = c4231o6.e();
            C4338u6 c4338u62 = this.a;
            if (e != null) {
                C4231o6 c4231o62 = this.c;
                c4231o62.getClass();
                c4392x6 = new C4374w6(c4338u62, c4231o62, null, false, 8, null);
            } else {
                C4231o6 c4231o63 = this.c;
                c4231o63.getClass();
                c4392x6 = new C4392x6(c4338u62, c4231o63, false);
            }
            this.a.a(c4392x6);
        }
        this.a.d().a();
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void b(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        if (Intrinsics.c(c4231o6, this.c)) {
            this.c = null;
        } else {
            this.a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void c(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        if (Intrinsics.c(c4231o6, this.b)) {
            this.a.d().onAdInfoChanged(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void loadAd() {
        Unit unit;
        if (this.d) {
            this.a.a("load called while current ad is loaded");
            return;
        }
        this.d = true;
        LevelPlayAdInfo e = this.b.e();
        if (e != null) {
            this.a.d().b(e);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.a.a("current ad is loaded without ad info");
        } else if (this.c == null) {
            C4231o6 a = this.a.b().a(false, this.a.c());
            this.c = a;
            a.a(this.a);
        }
    }

    public /* synthetic */ C4374w6(C4338u6 c4338u6, C4231o6 c4231o6, C4231o6 c4231o62, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4338u6, c4231o6, c4231o62, (i & 8) != 0 ? false : z);
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void b(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        if (Intrinsics.c(this.b, c4231o6)) {
            this.a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        boolean c = Intrinsics.c(c4231o6, this.b);
        C4338u6 c4338u6 = this.a;
        if (c) {
            c4338u6.a("show success when loaded");
        } else {
            c4338u6.a("progressive show success while current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        boolean c = Intrinsics.c(c4231o6, this.b);
        C4338u6 c4338u6 = this.a;
        if (c) {
            c4338u6.a("show failed when loaded");
        } else {
            c4338u6.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6) {
        c4231o6.getClass();
        if (Intrinsics.c(c4231o6, this.c)) {
            this.c = null;
        } else if (Intrinsics.c(c4231o6, this.b)) {
            a();
        }
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull Activity activity) {
        activity.getClass();
        this.a.a(new C4410y6(this.a, this.b, this.c));
        this.b.a(activity, this.a);
    }
}
