package com.facebook.internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ com.facebook.appevents.m b;

    public /* synthetic */ v(com.facebook.appevents.m mVar) {
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        com.facebook.appevents.m mVar = this.b;
        switch (i) {
            case 0:
                mVar.getClass();
                break;
            default:
                mVar.getClass();
                q.a(new com.facebook.t(8), o.AAM);
                q.a(new com.facebook.t(23), o.RestrictiveDataFiltering);
                q.a(new com.facebook.t(24), o.PrivacyProtection);
                q.a(new com.facebook.t(9), o.EventDeactivation);
                q.a(new com.facebook.t(10), o.BannedParamFiltering);
                q.a(new com.facebook.t(11), o.IapLogging);
                q.a(new com.facebook.t(12), o.StdParamEnforcement);
                q.a(new com.facebook.t(13), o.ProtectedMode);
                q.a(new com.facebook.t(14), o.MACARuleMatching);
                q.a(new com.facebook.t(15), o.BlocklistEvents);
                q.a(new com.facebook.t(16), o.FilterRedactedEvents);
                q.a(new com.facebook.t(17), o.FilterSensitiveParams);
                q.a(new com.facebook.t(18), o.CloudBridge);
                q.a(new com.facebook.t(19), o.GPSARATriggers);
                q.a(new com.facebook.t(20), o.GPSPACAProcessing);
                q.a(new com.facebook.t(21), o.GPSTopicsObservation);
                q.a(new com.facebook.t(22), o.VVP);
                break;
        }
    }

    public /* synthetic */ v(com.facebook.appevents.m mVar, u uVar) {
        this.b = mVar;
    }
}
