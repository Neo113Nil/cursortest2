package com.vk.comments.impl;

import android.os.Parcel;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Attachment;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.f1y0;
import xsna.jmr0;
import xsna.leg;
import xsna.m200;
import xsna.opz0;
import xsna.ouf0;
import xsna.plz0;
import xsna.s1y0;
import xsna.soz0;
import xsna.uzw;

/* compiled from: MarketItemCommentSource.kt */
/* loaded from: classes17.dex */
public final class a implements s1y0, ouf0 {
    public final Object b;

    public /* synthetic */ a(Object obj) {
        this.b = obj;
    }

    public static ArrayList e(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((Attachment) obj) instanceof StickerAttachment)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Attachment) it.next()).toString());
        }
        return arrayList2;
    }

    @Override // xsna.s1y0
    public void a(f1y0 f1y0Var) {
        ((leg) this.b).m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.common.api.a aVar = opz0.a;
        soz0 soz0Var = (soz0) ((plz0) obj).getService();
        zab zabVar = (zab) this.b;
        Parcel zaa = soz0Var.zaa();
        zac.zab(zaa, zabVar);
        soz0Var.zad(1, zaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // xsna.s1y0
    public void b(f1y0 f1y0Var) {
        a(f1y0Var);
    }

    @Override // xsna.s1y0
    public boolean c() {
        return false;
    }

    public long d(long j) {
        androidx.compose.ui.input.pointer.util.a aVar = (androidx.compose.ui.input.pointer.util.a) this.b;
        aVar.getClass();
        if (jmr0.b(j) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || jmr0.c(j) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            uzw.b("maximumVelocity should be a positive value. You specified=" + ((Object) jmr0.g(j)));
        }
        return m200.b(aVar.a.b(jmr0.b(j)), aVar.b.b(jmr0.c(j)));
    }

    public a() {
        this.b = new androidx.compose.ui.input.pointer.util.a();
    }
}
