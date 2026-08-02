package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import defpackage.sub;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class C5 implements A5 {
    public volatile CrashConfig a;
    public final Kc b;
    public final List c;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5(Context context, CrashConfig crashConfig, Kc kc) {
        C5 c5;
        context.getClass();
        crashConfig.getClass();
        kc.getClass();
        this.a = crashConfig;
        this.b = kc;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        synchronizedList.getClass();
        this.c = synchronizedList;
        if (this.a.getCrashConfig().getEnabled()) {
            synchronizedList.add(new C3281a5(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.a.getAnr().getAppExitReason().getEnabled()) {
            F5.a.getClass();
            if (F5.t()) {
                c5 = this;
                synchronizedList.add(new C1(context, c5, this.a.getAnr().getAppExitReason().getIncidentWaitInterval(), this.a.getAnr().getAppExitReason().getMaxNumberOfLines()));
                if (c5.a.getAnr().getWatchdog().getEnabled()) {
                    return;
                }
                synchronizedList.add(new C3327c(c5.a.getAnr().getWatchdog().getInterval(), c5));
                return;
            }
        }
        c5 = this;
        if (c5.a.getAnr().getWatchdog().getEnabled()) {
        }
    }

    public final void a(C3312ba c3312ba) {
        int i;
        c3312ba.getClass();
        if ((c3312ba instanceof D1) && this.a.getAnr().getAppExitReason().getEnabled()) {
            i = 152;
        } else if ((c3312ba instanceof C3307b5) && this.a.getCrashConfig().getEnabled()) {
            i = 150;
        } else if (!(c3312ba instanceof C3869wo) || !this.a.getAnr().getWatchdog().getEnabled()) {
            return;
        } else {
            i = 151;
        }
        this.b.b(new N2(i, c3312ba.a, sub.d(new Pair("data", c3312ba))));
    }
}
