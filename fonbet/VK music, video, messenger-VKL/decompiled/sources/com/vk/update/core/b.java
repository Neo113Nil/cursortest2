package com.vk.update.core;

import com.vk.update.core.InAppUpdateUi;
import com.vk.update.core.a;
import com.vk.update.core.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cnh;
import xsna.fy0;
import xsna.izs;
import xsna.s3q0;
import xsna.ss3;
import xsna.v8o;
import xsna.vrw;
import xsna.wrw;

/* compiled from: InAppUpdateManager.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements izs<a.C1935a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(a.C1935a c1935a) {
        a.C1935a c1935a2 = c1935a;
        a aVar = (a) this.receiver;
        InAppUpdateUi inAppUpdateUi = aVar.c;
        aVar.g.l("on receive update event:" + c1935a2);
        vrw vrwVar = c1935a2.b;
        String a = vrwVar.a();
        wrw wrwVar = c1935a2.a;
        long j = wrwVar.b;
        int i = a.b.$EnumSwitchMapping$0[wrwVar.d.ordinal()];
        if (i == 1) {
            inAppUpdateUi.d(new fy0(12, aVar, c1935a2));
        } else if (i == 2) {
            aVar.h.a(a, new c.f(j));
            inAppUpdateUi.c(new InAppUpdateUi.DownloadInfo(new ss3(9, c1935a2, aVar), new cnh(aVar, 15), vrwVar.d() ? InAppUpdateUi.DownloadInfo.DialogType.INSTALL : InAppUpdateUi.DownloadInfo.DialogType.UPDATE));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            v8o v8oVar = wrwVar.e;
            inAppUpdateUi.b(v8oVar.a, v8oVar.b);
        }
        return s3q0.a;
    }
}
