package io.appmetrica.analytics.impl;

import android.content.Intent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class bp implements H1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J1 f13476b;

    public /* synthetic */ bp(J1 j12, int i5) {
        this.f13475a = i5;
        this.f13476b = j12;
    }

    @Override // io.appmetrica.analytics.impl.H1
    public final boolean a(Intent intent) {
        switch (this.f13475a) {
            case 0:
                return J1.b(this.f13476b, intent);
            case 1:
                return J1.a(this.f13476b, intent);
            default:
                return J1.c(this.f13476b, intent);
        }
    }
}
