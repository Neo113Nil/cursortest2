package com.inmobi.media;

import android.location.LocationManager;
import com.google.android.gms.common.api.GoogleApiClient;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.wj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3864wj extends hoi implements Function1 {
    public C3864wj(rq3 rq3Var) {
        super(1, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3864wj(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3864wj((rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        AbstractC3890xj.b.getClass();
        C3934zb c3934zb = C3934zb.a;
        if (C3934zb.d()) {
            LocationManager locationManager = C3934zb.b;
            if (locationManager != null) {
                locationManager.removeUpdates(c3934zb);
            }
            GoogleApiClient googleApiClient = C3934zb.d;
            if (googleApiClient != null) {
                googleApiClient.b();
            }
        }
        C3934zb.d = null;
        return Unit.a;
    }
}
