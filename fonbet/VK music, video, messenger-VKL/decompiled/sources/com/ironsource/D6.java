package com.ironsource;

import android.app.Activity;
import com.ironsource.C4525r6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class D6 implements InterfaceC4615w6, C4525r6.b, C4525r6.a {
    public static final a f = new a(null);
    public static final String g = "Fullscreen ProgressiveOnShown Strategy";
    private final C4484p0 a;
    private final InterfaceC4543s6 b;
    private final InterfaceC4579u6 c;
    private final InterfaceC4597v6 d;
    private J6 e = new E6(this, null, false, 4, null);

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public D6(C4484p0 c4484p0, InterfaceC4543s6 interfaceC4543s6, InterfaceC4579u6 interfaceC4579u6, InterfaceC4597v6 interfaceC4597v6) {
        this.a = c4484p0;
        this.b = interfaceC4543s6;
        this.c = interfaceC4579u6;
        this.d = interfaceC4597v6;
    }

    public final C4484p0 a() {
        return this.a;
    }

    public final InterfaceC4543s6 b() {
        return this.b;
    }

    public final InterfaceC4579u6 c() {
        return this.c;
    }

    public final InterfaceC4597v6 d() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4615w6
    public void loadAd() {
        this.e.loadAd();
    }

    @Override // com.ironsource.InterfaceC4615w6
    public void a(Activity activity) {
        this.e.a(activity);
    }

    @Override // com.ironsource.C4525r6.b
    public void b(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.e.c(levelPlayAdInfo);
    }

    @Override // com.ironsource.C4525r6.b
    public void c(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.e.b(levelPlayAdInfo);
    }

    public final void a(J6 j6) {
        this.e = j6;
    }

    @Override // com.ironsource.C4525r6.b
    public void b(C4525r6 c4525r6, IronSourceError ironSourceError) {
        this.e.a(ironSourceError);
    }

    public final void a(String str) {
        this.a.d().h().f("Fullscreen ProgressiveOnShown Strategy - ".concat(str));
    }

    @Override // com.ironsource.C4525r6.a
    public void a(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.e.a(levelPlayAdInfo);
    }

    @Override // com.ironsource.C4525r6.a
    public void a(C4525r6 c4525r6, IronSourceError ironSourceError) {
        this.e.c(ironSourceError);
    }

    @Override // com.ironsource.C4525r6.b
    public void a(C4525r6 c4525r6) {
        this.e.a();
    }
}
