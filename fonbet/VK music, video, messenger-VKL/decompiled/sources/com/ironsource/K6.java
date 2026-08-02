package com.ironsource;

import android.app.Activity;
import com.ironsource.C4525r6;
import com.ironsource.InterfaceC4615w6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* loaded from: classes13.dex */
public final class K6 implements InterfaceC4615w6, C4525r6.b, C4525r6.a {
    private final C4484p0 a;
    private final InterfaceC4615w6.a b;
    private final InterfaceC4543s6 c;
    private final InterfaceC4579u6 d;
    private final InterfaceC4597v6 e;
    private C4525r6 f;

    public K6(C4484p0 c4484p0, InterfaceC4615w6.a aVar, InterfaceC4543s6 interfaceC4543s6, InterfaceC4579u6 interfaceC4579u6, InterfaceC4597v6 interfaceC4597v6) {
        this.a = c4484p0;
        this.b = aVar;
        this.c = interfaceC4543s6;
        this.d = interfaceC4579u6;
        this.e = interfaceC4597v6;
    }

    public final C4484p0 a() {
        return this.a;
    }

    public final InterfaceC4615w6.a b() {
        return this.b;
    }

    @Override // com.ironsource.C4525r6.b
    public void c(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.e.onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4615w6
    public void loadAd() {
        C4525r6 a = this.c.a(true, this.d);
        a.a(this);
        this.f = a;
    }

    @Override // com.ironsource.InterfaceC4615w6
    public void a(Activity activity) {
        C4525r6 c4525r6 = this.f;
        if (c4525r6 != null) {
            c4525r6.a(activity, this);
        }
    }

    @Override // com.ironsource.C4525r6.b
    public void b(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.e.b(levelPlayAdInfo);
    }

    @Override // com.ironsource.C4525r6.b
    public void a(C4525r6 c4525r6) {
        this.f = null;
        this.e.a();
    }

    @Override // com.ironsource.C4525r6.b
    public void b(C4525r6 c4525r6, IronSourceError ironSourceError) {
        this.e.a(ironSourceError);
    }

    @Override // com.ironsource.C4525r6.a
    public void a(C4525r6 c4525r6, LevelPlayAdInfo levelPlayAdInfo) {
        this.e.a(levelPlayAdInfo);
    }

    @Override // com.ironsource.C4525r6.a
    public void a(C4525r6 c4525r6, IronSourceError ironSourceError) {
        this.e.c(ironSourceError);
    }
}
