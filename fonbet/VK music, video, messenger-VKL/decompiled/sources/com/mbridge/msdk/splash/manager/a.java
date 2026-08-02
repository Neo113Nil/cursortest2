package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.splash.view.MBSplashNativeView;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.pzl;

/* compiled from: BaseNativeViewRenderManager.java */
/* loaded from: classes14.dex */
public class a {

    /* compiled from: BaseNativeViewRenderManager.java */
    /* renamed from: com.mbridge.msdk.splash.manager.a$a, reason: collision with other inner class name */
    public class C0324a implements com.mbridge.msdk.foundation.feedback.a {
        final /* synthetic */ com.mbridge.msdk.splash.middle.a a;
        final /* synthetic */ int b;

        public C0324a(com.mbridge.msdk.splash.middle.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            this.a.a(2, this.b);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            this.a.a(2, this.b);
        }
    }

    public void a(List<String> list, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, com.mbridge.msdk.splash.inter.a aVar) {
        throw null;
    }

    public void a(MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, com.mbridge.msdk.splash.inter.a aVar) {
        Context context = mBSplashView.getContext();
        if (context == null) {
            context = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        if (cVar == null && aVar != null) {
            aVar.onError("The render parameters is unavailable.");
            return;
        }
        String a = (cVar == null || cVar.b() == null) ? "" : z.a(cVar.b().getAdZip());
        if (TextUtils.isEmpty(a)) {
            a(context, mBSplashView, cVar, aVar);
            return;
        }
        if (cVar == null || cVar.b() == null) {
            return;
        }
        if (TextUtils.isEmpty(cVar.b().getAdZip())) {
            a(context, mBSplashView, cVar, aVar);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(a);
            a(arrayList, mBSplashView, cVar, aVar);
        } catch (Exception unused) {
            a(context, mBSplashView, cVar, aVar);
        }
    }

    public void a(com.mbridge.msdk.splash.middle.a aVar, CampaignEx campaignEx, com.mbridge.msdk.dycreator.viewdata.base.a aVar2) {
        if (campaignEx != null) {
            String campaignUnitId = campaignEx.getCampaignUnitId();
            String requestId = campaignEx.getRequestId();
            int currentCountDown = aVar2 != null ? aVar2.getEffectData().getCurrentCountDown() : 0;
            aVar.a(1, currentCountDown);
            com.mbridge.msdk.foundation.feedback.bean.a b = com.mbridge.msdk.foundation.feedback.b.b().b(campaignUnitId + BundleUtil.UNDERLINE_TAG + requestId);
            if (b != null) {
                b.a(campaignEx);
                com.mbridge.msdk.foundation.feedback.b.b().a(pzl.b(campaignUnitId, BundleUtil.UNDERLINE_TAG, requestId), new C0324a(aVar, currentCountDown));
                b.p();
            }
        }
    }

    public void a(com.mbridge.msdk.dycreator.viewdata.base.a aVar, com.mbridge.msdk.splash.middle.a aVar2, CampaignEx campaignEx) {
        float f;
        int i;
        float f2;
        if (aVar == null || !(aVar instanceof MBSplashData)) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            i = 0;
            f2 = 0.0f;
        } else {
            MBSplashData mBSplashData = (MBSplashData) aVar;
            f = mBSplashData.getxInScreen();
            f2 = mBSplashData.getyInScreen();
            i = mBSplashData.getClickType();
        }
        if (aVar2 != null) {
            try {
                aVar2.a(com.mbridge.msdk.splash.common.util.a.a(com.mbridge.msdk.splash.common.util.a.a(i, f, f2), campaignEx));
            } catch (Throwable th) {
                th.printStackTrace();
                aVar2.a(campaignEx);
            }
        }
    }

    public void a(Context context, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, com.mbridge.msdk.splash.inter.a aVar) {
        try {
            MBSplashNativeView mBSplashNativeView = new MBSplashNativeView(context, mBSplashView, cVar);
            if (aVar != null) {
                aVar.a(mBSplashNativeView);
            }
        } catch (Throwable unused) {
            if (aVar != null) {
                aVar.onError("View render error.");
            }
        }
    }
}
