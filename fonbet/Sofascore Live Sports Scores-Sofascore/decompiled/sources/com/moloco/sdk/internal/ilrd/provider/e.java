package com.moloco.sdk.internal.ilrd.provider;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.h1;
import com.moloco.sdk.i1;
import com.moloco.sdk.internal.ilrd.l;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import defpackage.ad2;
import defpackage.i3l;
import defpackage.p2g;
import defpackage.s9a;
import defpackage.w2g;
import defpackage.xw3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e implements LevelPlayImpressionDataListener {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // com.unity3d.mediation.impression.LevelPlayImpressionDataListener
    public final void onImpressionSuccess(LevelPlayImpressionData levelPlayImpressionData) {
        levelPlayImpressionData.getClass();
        f fVar = this.a;
        ad2 ad2Var = fVar.b;
        if (s9a.w(ad2Var)) {
            h1 i = i1.i();
            try {
                p2g p2gVar = w2g.b;
                String auctionId = levelPlayImpressionData.getAuctionId();
                if (auctionId != null) {
                    i.i(auctionId);
                }
            } catch (Throwable unused) {
                p2g p2gVar2 = w2g.b;
            }
            try {
                String adFormat = levelPlayImpressionData.getAdFormat();
                if (adFormat != null) {
                    i.h(adFormat);
                }
            } catch (Throwable unused2) {
                p2g p2gVar3 = w2g.b;
            }
            try {
                String adNetwork = levelPlayImpressionData.getAdNetwork();
                if (adNetwork != null) {
                    i.o(adNetwork);
                }
            } catch (Throwable unused3) {
                p2g p2gVar4 = w2g.b;
            }
            try {
                String instanceName = levelPlayImpressionData.getInstanceName();
                if (instanceName != null) {
                    i.n(instanceName);
                }
            } catch (Throwable unused4) {
                p2g p2gVar5 = w2g.b;
            }
            try {
                String instanceId = levelPlayImpressionData.getInstanceId();
                if (instanceId != null) {
                    i.m(instanceId);
                }
            } catch (Throwable unused5) {
                p2g p2gVar6 = w2g.b;
            }
            try {
                String country = levelPlayImpressionData.getCountry();
                if (country != null) {
                    i.j(country);
                }
            } catch (Throwable unused6) {
                p2g p2gVar7 = w2g.b;
            }
            try {
                String placement = levelPlayImpressionData.getPlacement();
                if (placement != null) {
                    i.p(placement);
                }
            } catch (Throwable unused7) {
                p2g p2gVar8 = w2g.b;
            }
            try {
                Double revenue = levelPlayImpressionData.getRevenue();
                if (revenue != null) {
                    i.r(revenue.doubleValue());
                }
            } catch (Throwable unused8) {
                p2g p2gVar9 = w2g.b;
            }
            try {
                String precision = levelPlayImpressionData.getPrecision();
                if (precision != null) {
                    i.q(precision);
                }
            } catch (Throwable unused9) {
                p2g p2gVar10 = w2g.b;
            }
            try {
                String ab = levelPlayImpressionData.getAb();
                if (ab != null) {
                    i.d(ab);
                }
            } catch (Throwable unused10) {
                p2g p2gVar11 = w2g.b;
            }
            try {
                String segmentName = levelPlayImpressionData.getSegmentName();
                if (segmentName != null) {
                    i.s(segmentName);
                }
            } catch (Throwable unused11) {
                p2g p2gVar12 = w2g.b;
            }
            try {
                String encryptedCPM = levelPlayImpressionData.getEncryptedCPM();
                if (encryptedCPM != null) {
                    i.l(encryptedCPM);
                }
            } catch (Throwable unused12) {
                p2g p2gVar13 = w2g.b;
            }
            try {
                String creativeId = levelPlayImpressionData.getCreativeId();
                if (creativeId != null) {
                    i.k(creativeId);
                }
            } catch (Throwable unused13) {
                p2g p2gVar14 = w2g.b;
            }
            GeneratedMessageLite build = i.build();
            build.getClass();
            xw3.L(ad2Var, null, null, new i3l(fVar, new l((i1) build), null, 20), 3);
        }
    }
}
