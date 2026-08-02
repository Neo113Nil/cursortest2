package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k {
    public final boolean a;
    public final MolocoPrivacy.PrivacySettings b;
    public final q c;
    public final d d;
    public final s e;
    public final h f;
    public final com.facebook.appevents.j g;
    public final m h;
    public final f i;
    public final a j;
    public final o k;
    public final w l;

    public k(boolean z, MolocoPrivacy.PrivacySettings privacySettings, q qVar, d dVar, s sVar, h hVar, com.facebook.appevents.j jVar, m mVar, f fVar, a aVar, o oVar, w wVar) {
        privacySettings.getClass();
        sVar.getClass();
        hVar.getClass();
        mVar.getClass();
        fVar.getClass();
        aVar.getClass();
        oVar.getClass();
        this.a = z;
        this.b = privacySettings;
        this.c = qVar;
        this.d = dVar;
        this.e = sVar;
        this.f = hVar;
        this.g = jVar;
        this.h = mVar;
        this.i = fVar;
        this.j = aVar;
        this.k = oVar;
        this.l = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && Intrinsics.c(this.b, kVar.b) && this.c.equals(kVar.c) && this.d.equals(kVar.d) && Intrinsics.c(this.e, kVar.e) && Intrinsics.c(this.f, kVar.f) && this.g.equals(kVar.g) && Intrinsics.c(this.h, kVar.h) && Intrinsics.c(this.i, kVar.i) && Intrinsics.c(this.j, kVar.j) && Intrinsics.c(this.k, kVar.k) && this.l.equals(kVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSignals(sdkInitialized=" + this.a + ", privacySettings=" + this.b + ", memoryInfo=" + this.c + ", appDirInfo=" + this.d + ", networkInfoSignal=" + this.e + ", batteryInfoSignal=" + this.f + ", adDataSignal=" + this.g + ", deviceSignal=" + this.h + ", audioSignal=" + this.i + ", accessibilitySignal=" + this.j + ", ilrdSignal=" + this.k + ", testConfigSignal=" + this.l + ')';
    }
}
