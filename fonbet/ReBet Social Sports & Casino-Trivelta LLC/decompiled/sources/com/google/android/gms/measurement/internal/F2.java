package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public final class F2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final S6 f33396a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33397b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33398c;

    public F2(S6 s62) {
        AbstractC3191o.m(s62);
        this.f33396a = s62;
    }

    public final void a() {
        S6 s62 = this.f33396a;
        s62.O0();
        s62.b().h();
        if (this.f33397b) {
            return;
        }
        s62.d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f33398c = s62.E0().m();
        s62.a().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f33398c));
        this.f33397b = true;
    }

    public final void b() {
        S6 s62 = this.f33396a;
        s62.O0();
        s62.b().h();
        s62.b().h();
        if (this.f33397b) {
            s62.a().w().a("Unregistering connectivity change receiver");
            this.f33397b = false;
            this.f33398c = false;
            try {
                s62.d().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f33396a.a().o().b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final /* synthetic */ S6 c() {
        return this.f33396a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        S6 s62 = this.f33396a;
        s62.O0();
        String action = intent.getAction();
        s62.a().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            s62.a().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean m10 = s62.E0().m();
        if (this.f33398c != m10) {
            this.f33398c = m10;
            s62.b().t(new E2(this, m10));
        }
    }
}
