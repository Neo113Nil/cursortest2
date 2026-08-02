package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.twilio.voice.PublisherMetadata;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3362t4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f34298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f34299b;

    public RunnableC3362t4(W4 w42, Bundle bundle) {
        this.f34298a = bundle;
        Objects.requireNonNull(w42);
        this.f34299b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4 w42 = this.f34299b;
        w42.h();
        w42.j();
        Bundle bundle = this.f34298a;
        AbstractC3191o.m(bundle);
        String g10 = AbstractC3191o.g(bundle.getString("name"));
        if (!w42.f33578a.g()) {
            w42.f33578a.a().w().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            w42.f33578a.J().d0(new zzah(bundle.getString(PublisherMetadata.APP_ID), "", new zzpl(g10, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean(AppStateModule.APP_STATE_ACTIVE), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), w42.f33578a.C().R(bundle.getString(PublisherMetadata.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
