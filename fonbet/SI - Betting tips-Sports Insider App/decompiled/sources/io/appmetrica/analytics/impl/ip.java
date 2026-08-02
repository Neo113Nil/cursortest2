package io.appmetrica.analytics.impl;

import android.app.Activity;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class ip implements InterfaceC0024ae {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wk f13987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f13988c;

    public /* synthetic */ ip(Wk wk, Activity activity, int i5) {
        this.f13986a = i5;
        this.f13987b = wk;
        this.f13988c = activity;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0024ae
    public final void consume(Object obj) {
        switch (this.f13986a) {
            case 0:
                this.f13987b.a(this.f13988c, (C0203hc) obj);
                break;
            default:
                this.f13987b.b(this.f13988c, (C0203hc) obj);
                break;
        }
    }
}
