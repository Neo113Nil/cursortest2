package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.util.g1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ g1 c;
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ com.fyber.inneractive.sdk.click.o f;
    public final /* synthetic */ b0 g;

    public y(b0 b0Var, Context context, String str, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z, com.fyber.inneractive.sdk.click.o oVar) {
        this.g = b0Var;
        this.a = context;
        this.b = str;
        this.c = g1Var;
        this.d = gVar;
        this.e = z;
        this.f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.a(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
