package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class T extends d0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f32671d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f32672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC3179c f32673f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(AbstractC3179c abstractC3179c, int i10, Bundle bundle) {
        super(abstractC3179c, Boolean.TRUE);
        Objects.requireNonNull(abstractC3179c);
        this.f32673f = abstractC3179c;
        this.f32671d = i10;
        this.f32672e = bundle;
    }

    @Override // com.google.android.gms.common.internal.d0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f32671d;
        if (i10 != 0) {
            this.f32673f.zzd(1, null);
            Bundle bundle = this.f32672e;
            f(new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC3179c.KEY_PENDING_INTENT) : null));
        } else {
            if (e()) {
                return;
            }
            this.f32673f.zzd(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    public abstract boolean e();

    public abstract void f(ConnectionResult connectionResult);
}
