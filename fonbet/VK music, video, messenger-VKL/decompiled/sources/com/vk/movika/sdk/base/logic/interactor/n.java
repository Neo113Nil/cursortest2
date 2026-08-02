package com.vk.movika.sdk.base.logic.interactor;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.tips.Tooltip;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.sdk.base.model.actions.e;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.EcosystemProfileView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.List;
import kotlin.random.XorWowRandom;
import xsna.awr0;
import xsna.bpf0;
import xsna.c3i0;
import xsna.cpp;
import xsna.dqt0;
import xsna.e3m;
import xsna.f35;
import xsna.fpf0;
import xsna.grt0;
import xsna.gzs;
import xsna.i0q0;
import xsna.iah0;
import xsna.izs;
import xsna.j7q;
import xsna.p490;
import xsna.qgp0;
import xsna.qx;
import xsna.rfc;
import xsna.s3q0;
import xsna.sp;
import xsna.tny;
import xsna.tvh;
import xsna.wbu0;
import xsna.wml0;
import xsna.wp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        com.vk.core.tips.b k;
        switch (this.b) {
            case 0:
                o oVar = (o) this.c;
                com.vk.ecomm.catalog.impl.geo.a aVar = (com.vk.ecomm.catalog.impl.geo.a) this.d;
                XorWowRandom xorWowRandom = (XorWowRandom) this.e;
                boolean z = oVar.a;
                rfc a = fpf0.a(e.b.class);
                ?? r9 = oVar.d;
                break;
            case 1:
                EcosystemProfileView ecosystemProfileView = (EcosystemProfileView) this.c;
                Context context = (Context) this.d;
                String str = (String) this.e;
                c3i0 c3i0Var = ecosystemProfileView.g;
                View findViewById = ecosystemProfileView.findViewById(R.id.notification_icon);
                com.vk.core.tips.b bVar = c3i0Var.a;
                if (bVar != null) {
                    bVar.b(false);
                }
                k = new Tooltip(context, new String(), str, null, null, null, null, e3m.f(R.attr.vk_ui_background_modal_inverse, context), e3m.f(R.attr.vk_ui_text_contrast_themed, context), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 80, 0, false, null, 0, false, null, null, null, null, null, null, new wp(28), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, Integer.valueOf(iah0.a(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE)), null, null, -8391048, 14).k(context, (r15 & 2) != 0, true, (r15 & 8) != 0, true, false, new tvh(findViewById, 2), r5);
                c3i0Var.a = k;
                break;
            case 2:
                com.vk.auth.enterphone.a aVar2 = (com.vk.auth.enterphone.a) this.c;
                Throwable th = (Throwable) this.d;
                String str2 = (String) this.e;
                Context context2 = aVar2.b;
                wbu0.a a2 = wbu0.a(context2, th, true);
                boolean z2 = th instanceof VKApiExecutionException;
                if (z2 && ((VKApiExecutionException) th).s() == 1004) {
                    aVar2.o0(str2, null, aVar2.z, a2.a);
                } else if (z2 && ((VKApiExecutionException) th).s() == 1000) {
                    cpp cppVar = (cpp) aVar2.a;
                    if (cppVar != null) {
                        cppVar.xd();
                    }
                } else if (z2 && f35.d((VKApiExecutionException) th)) {
                    sp.v(aVar2.a, context2, null);
                } else {
                    cpp cppVar2 = (cpp) aVar2.a;
                    if (cppVar2 != null) {
                        cppVar2.vf(a2);
                    }
                }
                break;
            case 3:
                break;
            case 4:
                ((izs) this.c).invoke(new wml0.a.c((String) this.d, (String) this.e));
                break;
            case 5:
                List list = (List) this.c;
                qgp0 qgp0Var = (qgp0) this.d;
                UserId userId = (UserId) this.e;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "size=" + list.size()});
                }
                break;
            case 6:
                ((izs) this.c).invoke(new awr0.e(((dqt0) this.d).b, p490.C((tny) ((bpf0) this.e).a())));
                break;
            default:
                File file = (File) this.c;
                grt0 grt0Var = (grt0) this.d;
                j7q j7qVar = (j7q) this.e;
                String absolutePath = file.getAbsolutePath();
                i0q0.f(new qx(grt0Var, j7qVar, absolutePath, absolutePath, 5));
                break;
        }
        return s3q0.a;
    }
}
