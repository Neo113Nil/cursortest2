package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbq;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class M2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbq f33550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceConnection f33551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N2 f33552c;

    public M2(N2 n22, zzbq zzbqVar, ServiceConnection serviceConnection) {
        this.f33550a = zzbqVar;
        this.f33551b = serviceConnection;
        Objects.requireNonNull(n22);
        this.f33552c = n22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        N2 n22 = this.f33552c;
        O2 o22 = n22.f33565b;
        C3298l3 c3298l3 = o22.f33577a;
        c3298l3.b().h();
        Bundle bundle2 = new Bundle();
        String a10 = n22.a();
        bundle2.putString("package_name", a10);
        try {
            bundle = this.f33550a.zze(bundle2);
        } catch (Exception e10) {
            o22.f33577a.a().o().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (bundle == null) {
            c3298l3.a().o().a("Install Referrer Service returned a null response");
            bundle = null;
        }
        C3298l3 c3298l32 = o22.f33577a;
        c3298l32.b().h();
        C3298l3.q();
        if (bundle != null) {
            long j10 = bundle.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                c3298l32.a().r().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c3298l32.a().o().a("No referrer defined in Install Referrer response");
                } else {
                    c3298l32.a().w().b("InstallReferrer API result", string);
                    Bundle s02 = c3298l32.C().s0(Uri.parse("?".concat(string)));
                    if (s02 == null) {
                        c3298l32.a().o().a("No campaign params defined in Install Referrer result");
                    } else {
                        List asList = Arrays.asList(((String) AbstractC3209a2.f33875h1.b(null)).split(","));
                        Iterator<String> it = s02.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (asList.contains(it.next())) {
                                long j11 = bundle.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j11 > 0) {
                                    s02.putLong("click_timestamp", j11);
                                }
                            }
                        }
                        if (j10 == c3298l32.x().f33517g.a()) {
                            c3298l32.a().w().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c3298l32.g()) {
                            c3298l32.x().f33517g.b(j10);
                            c3298l32.a().w().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            s02.putString("_cis", "referrer API v2");
                            c3298l32.B().w("auto", "_cmp", s02, a10);
                        }
                    }
                }
            }
        }
        J9.b.b().c(c3298l32.d(), this.f33551b);
    }
}
