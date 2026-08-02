package com.vk.movika.sdk.base.logic.processor;

import com.ironsource.X3;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.p;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import java.util.ArrayList;
import xsna.egi;
import xsna.epx;
import xsna.fwx0;
import xsna.hyg0;
import xsna.izs;
import xsna.j5g;
import xsna.qgi0;
import xsna.qyg0;
import xsna.s3q0;
import xsna.tgi0;
import xsna.uh;
import xsna.wsp;
import xsna.xsp;
import xsna.yfb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ c(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Long valueOf;
        int i;
        int i2;
        int i3;
        Integer valueOf2;
        Boolean bool;
        String l2;
        int i4;
        int i5;
        DownloadingState downloadingState;
        switch (this.b) {
            case 0:
                com.vk.movika.sdk.base.model.history.c cVar = (com.vk.movika.sdk.base.model.history.c) obj;
                return com.vk.movika.sdk.base.model.history.c.a(cVar, null, j5g.v0(new p(this.c), cVar.d), null, null, 55);
            case 1:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, this.c);
                qgi0.r(tgi0Var, "CropEditorImage");
                return s3q0.a;
            case 2:
                String str = this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM episode WHERE uid = ?");
                try {
                    V0.D3(1, str);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "uid");
                    int k3 = egi.k(V0, "mid");
                    int k4 = egi.k(V0, "track_code");
                    int k5 = egi.k(V0, "title");
                    int k6 = egi.k(V0, "artist");
                    int k7 = egi.k(V0, "url");
                    int k8 = egi.k(V0, "duration");
                    int k9 = egi.k(V0, "date");
                    int k10 = egi.k(V0, "is_explicit");
                    int k11 = egi.k(V0, "is_focus_track");
                    int k12 = egi.k(V0, "plays");
                    int k13 = egi.k(V0, "is_favorite");
                    int k14 = egi.k(V0, X3.i.L);
                    int k15 = egi.k(V0, "description");
                    int k16 = egi.k(V0, "cover");
                    int k17 = egi.k(V0, "post_id");
                    int k18 = egi.k(V0, "is_donut");
                    int k19 = egi.k(V0, "downloading_state");
                    int k20 = egi.k(V0, X3.a.k);
                    int k21 = egi.k(V0, "manifest_url");
                    int k22 = egi.k(V0, "json_raw");
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        int i6 = k12;
                        int i7 = k13;
                        int i8 = (int) V0.getLong(k);
                        UserId b = fwx0.b(V0.l2(k2));
                        String l22 = V0.l2(k3);
                        String l23 = V0.isNull(k4) ? null : V0.l2(k4);
                        String l24 = V0.isNull(k5) ? null : V0.l2(k5);
                        String l25 = V0.isNull(k6) ? null : V0.l2(k6);
                        String l26 = V0.isNull(k7) ? null : V0.l2(k7);
                        Long valueOf3 = V0.isNull(k8) ? null : Long.valueOf(V0.getLong(k8));
                        if (V0.isNull(k9)) {
                            valueOf = null;
                            i2 = k2;
                            i = k3;
                        } else {
                            valueOf = Long.valueOf(V0.getLong(k9));
                            i = k3;
                            i2 = k2;
                        }
                        boolean z = ((int) V0.getLong(k10)) != 0;
                        if (V0.isNull(k11)) {
                            i3 = k4;
                            valueOf2 = null;
                        } else {
                            i3 = k4;
                            valueOf2 = Integer.valueOf((int) V0.getLong(k11));
                        }
                        if (valueOf2 != null) {
                            bool = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i9 = k5;
                        int i10 = (int) V0.getLong(i6);
                        int i11 = i3;
                        boolean z2 = ((int) V0.getLong(i7)) != 0;
                        long j = V0.getLong(k14);
                        int i12 = k15;
                        String l27 = V0.isNull(i12) ? null : V0.l2(i12);
                        int i13 = k16;
                        Image g = yfb.g(V0.isNull(i13) ? null : V0.l2(i13));
                        int i14 = k;
                        int i15 = k17;
                        if (V0.isNull(i15)) {
                            l2 = null;
                            k17 = i15;
                            i5 = k14;
                            i4 = k18;
                        } else {
                            l2 = V0.l2(i15);
                            k17 = i15;
                            i4 = k18;
                            i5 = k14;
                        }
                        boolean z3 = ((int) V0.getLong(i4)) != 0;
                        int i16 = k19;
                        int i17 = (int) V0.getLong(i16);
                        if (i17 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i17 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i17 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i17 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i17 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        DownloadingState downloadingState2 = downloadingState;
                        int i18 = k20;
                        int i19 = k21;
                        int i20 = i4;
                        int i21 = k22;
                        arrayList.add(new xsp(i8, b, l22, l23, l24, l25, l26, valueOf3, valueOf, z, bool, i10, z2, j, l27, g, l2, z3, downloadingState2, uh.a(V0.isNull(i18) ? null : V0.l2(i18)), V0.isNull(i19) ? null : V0.l2(i19), V0.l2(i21)));
                        k19 = i16;
                        k14 = i5;
                        k16 = i13;
                        k22 = i21;
                        k21 = i19;
                        k = i14;
                        k15 = i12;
                        k18 = i20;
                        k4 = i11;
                        k3 = i;
                        k12 = i6;
                        k20 = i18;
                        k2 = i2;
                        k13 = i7;
                        k5 = i9;
                    }
                    V0.close();
                    return arrayList;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 3:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            default:
                return Boolean.valueOf(epx.f(((SuperAppWidget) obj).d().b, this.c));
        }
    }

    public /* synthetic */ c(String str, wsp wspVar) {
        this.b = 2;
        this.c = str;
    }
}
