package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0469s2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14610a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f14611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0494t2 f14612c;

    public RunnableC0469s2(C0494t2 c0494t2, Context context, Intent intent) {
        this.f14612c = c0494t2;
        this.f14610a = context;
        this.f14611b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14612c.f14662a.consume(this.f14610a, this.f14611b);
    }
}
