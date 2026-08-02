package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.sw9;
import defpackage.ti3;
import defpackage.xbl;
import defpackage.yz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l {
    public final xbl a;

    public l(Context context) {
        xbl d;
        try {
            d = xbl.d(context);
            d.getClass();
        } catch (IllegalStateException e) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.error$default(molocoLogger, "MolocoWorkManager", "WorkManager not initialized already, performing initialization", e, false, 8, null);
            ti3 ti3Var = new ti3(new yz1(1));
            try {
                MolocoLogger.info$default(molocoLogger, "MolocoWorkManager", "Trying to initialize work manager as one is not already available", null, false, 12, null);
                xbl.e(context, ti3Var);
            } catch (IllegalStateException e2) {
                molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.error$default(molocoLogger, "MolocoWorkManager", "WorkManager initialized already at this point, retrieving instance", e2, false, 8, null);
            }
            MolocoLogger.info$default(molocoLogger, "MolocoWorkManager", "Trying to retrieve work manager instance", null, false, 12, null);
            try {
                d = xbl.d(context);
                d.getClass();
            } catch (IllegalStateException e3) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "MolocoWorkManager", "WorkManager instance couldn't be re-initialized, cannot provide WorkManager", null, false, 12, null);
                sw9.m("Cannot provide MolocoWorkManager. Failed to re-initialize WorkManager", e3);
                throw null;
            }
        }
        this.a = d;
    }
}
