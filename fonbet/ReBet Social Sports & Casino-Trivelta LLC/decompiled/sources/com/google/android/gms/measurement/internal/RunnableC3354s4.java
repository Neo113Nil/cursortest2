package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3354s4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f34281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f34282b;

    public RunnableC3354s4(W4 w42, Bundle bundle) {
        this.f34281a = bundle;
        Objects.requireNonNull(w42);
        this.f34282b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4 w42 = this.f34282b;
        w42.h();
        w42.j();
        Bundle bundle = this.f34281a;
        AbstractC3191o.m(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC3191o.g(string);
        AbstractC3191o.g(string2);
        AbstractC3191o.m(bundle.get(EventKeys.VALUE_KEY));
        if (!w42.f33578a.g()) {
            w42.f33578a.a().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzpl zzplVar = new zzpl(string, bundle.getLong("triggered_timestamp"), bundle.get(EventKeys.VALUE_KEY), string2);
        try {
            C3298l3 c3298l3 = w42.f33578a;
            zzbg R10 = c3298l3.C().R(bundle.getString(PublisherMetadata.APP_ID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            w42.f33578a.J().d0(new zzah(bundle.getString(PublisherMetadata.APP_ID), string2, zzplVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c3298l3.C().R(bundle.getString(PublisherMetadata.APP_ID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), R10, bundle.getLong("time_to_live"), c3298l3.C().R(bundle.getString(PublisherMetadata.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
