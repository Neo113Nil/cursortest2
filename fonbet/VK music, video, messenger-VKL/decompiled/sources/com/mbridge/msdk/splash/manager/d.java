package com.mbridge.msdk.splash.manager;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.splash.manager.g;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.wd10;
import xsna.wga0;

/* compiled from: ResManager.java */
/* loaded from: classes14.dex */
public class d {
    private static int a = 1;
    public static com.mbridge.msdk.foundation.db.e b = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));

    /* compiled from: ResManager.java */
    public class a implements com.mbridge.msdk.videocommon.listener.a {
        final /* synthetic */ MBSplashView a;

        public a(MBSplashView mBSplashView) {
            this.a = mBSplashView;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            this.a.setVideoReady(true);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            this.a.setVideoReady(false);
        }
    }

    /* compiled from: ResManager.java */
    public class b implements com.mbridge.msdk.foundation.same.image.c {
        final /* synthetic */ com.mbridge.msdk.splash.view.nativeview.a a;
        final /* synthetic */ MBSplashView b;

        public b(com.mbridge.msdk.splash.view.nativeview.a aVar, MBSplashView mBSplashView) {
            this.a = aVar;
            this.b = mBSplashView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            com.mbridge.msdk.splash.view.nativeview.a aVar = this.a;
            if (aVar != null) {
                aVar.b();
            }
            MBSplashView mBSplashView = this.b;
            if (mBSplashView != null) {
                mBSplashView.setImageReady(false);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            com.mbridge.msdk.splash.view.nativeview.a aVar = this.a;
            if (aVar != null) {
                aVar.a();
            }
            MBSplashView mBSplashView = this.b;
            if (mBSplashView != null) {
                mBSplashView.setImageReady(true);
            }
        }
    }

    public static void a(MBSplashView mBSplashView, CampaignEx campaignEx, com.mbridge.msdk.splash.view.nativeview.a aVar) {
        wd10.b().a(campaignEx.getImageUrl(), new b(aVar, mBSplashView));
        if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
            return;
        }
        wd10.b().a(campaignEx.getIconUrl(), new c());
    }

    public static void b(String str) {
        if (b == null) {
            b = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        b.a(str, 0, a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if ((r8.getTimestamp() + (r8.getPlct() * 1000)) < r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (a(r19, r8, r20, r21, r23, r24, r26) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        return a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r8.getTimestamp() >= r11) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        if ((r8.getTimestamp() + (r8.getPlct() * 1000)) < r9) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CampaignEx a(MBSplashView mBSplashView, String str, String str2, String str3, boolean z, int i, boolean z2, boolean z3) {
        if (b == null) {
            b = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        com.mbridge.msdk.setting.g a2 = wga0.a(i.b());
        if (a2 == null) {
            a2 = i.b().a();
        }
        long c0 = a2.c0() * 1000;
        long d0 = a2.d0() * 1000;
        a(d0, str2);
        List<CampaignEx> a3 = b.a(str2, 0, 0, a, !TextUtils.isEmpty(str3));
        if (a3 != null && a3.size() > 0) {
            CampaignEx campaignEx = a3.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - c0;
            if (z2) {
                if (campaignEx.getPlct() > 0) {
                }
                if (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j) {
                    if (a(mBSplashView, campaignEx, str, str2, z, i, z3) && campaignEx.isSpareOffer(c0, d0)) {
                        return a(campaignEx);
                    }
                }
                if (a(mBSplashView, campaignEx, str, str2, z, i, z3)) {
                    return a(campaignEx);
                }
            } else {
                if (campaignEx.getPlct() > 0) {
                }
                if (campaignEx.getPlct() <= 0) {
                }
            }
        }
        return null;
    }

    private static CampaignEx a(CampaignEx campaignEx) {
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(false);
            campaignEx.setIsMraid(true);
            return campaignEx;
        }
        campaignEx.setHasMBTplMark(true);
        campaignEx.setIsMraid(false);
        return campaignEx;
    }

    public static boolean a(MBSplashView mBSplashView, CampaignEx campaignEx, String str, String str2, boolean z, int i, boolean z2) {
        boolean z3;
        if (campaignEx != null) {
            mBSplashView.clearResState();
            if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                z3 = true;
            } else {
                boolean z4 = mBSplashView.isVideoReady() || com.mbridge.msdk.videocommon.download.b.getInstance().b(297, str2, campaignEx.isBidCampaign());
                if (!z4) {
                    a(mBSplashView, campaignEx, str2);
                } else {
                    mBSplashView.setVideoReady(true);
                }
                z3 = z4;
            }
            if (!TextUtils.isEmpty(campaignEx.getAdZip()) && !mBSplashView.isH5Ready()) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip());
                if (TextUtils.isEmpty(h5ResAddress)) {
                    z3 = false;
                } else if (!z2) {
                    a(mBSplashView, h5ResAddress, campaignEx, str, str2, z, i);
                }
            }
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml()) && !mBSplashView.isH5Ready()) {
                String a2 = a(campaignEx.getAdHtml());
                if (TextUtils.isEmpty(a2)) {
                    z3 = false;
                } else if (!z2) {
                    a(mBSplashView, a2, campaignEx, str, str2, z, i);
                }
            }
            if (!campaignEx.isDynamicView()) {
                return z3;
            }
            if (!TextUtils.isEmpty(campaignEx.getImageUrl()) && !mBSplashView.isImageReady()) {
                if (!wd10.b().c(campaignEx.getImageUrl())) {
                    a(mBSplashView, campaignEx, (com.mbridge.msdk.splash.view.nativeview.a) null);
                    return z3;
                }
                mBSplashView.setImageReady(true);
                return true;
            }
        }
        return false;
    }

    /* compiled from: ResManager.java */
    public class c implements com.mbridge.msdk.foundation.same.image.c {
        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
        }
    }

    private static void a(MBSplashView mBSplashView, CampaignEx campaignEx, String str) {
        a aVar = new a(mBSplashView);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(com.mbridge.msdk.foundation.controller.c.n().d(), str, copyOnWriteArrayList, 297, aVar);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().b(297, str, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(str);
        } else {
            mBSplashView.setVideoReady(true);
        }
    }

    private static void a(MBSplashView mBSplashView, String str, CampaignEx campaignEx, String str2, String str3, boolean z, int i) {
        g.d dVar = new g.d();
        dVar.c(str3);
        dVar.b(str2);
        dVar.a(campaignEx);
        dVar.a(str);
        dVar.a(z);
        dVar.a(i);
        g.a().a(mBSplashView, dVar, null);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e) {
                e.getMessage();
                return "";
            }
        }
    }

    public static boolean a(MBSplashView mBSplashView, CampaignEx campaignEx) {
        if (mBSplashView == null) {
            return false;
        }
        boolean isVideoReady = !TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) ? mBSplashView.isVideoReady() : true;
        if (isVideoReady && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            isVideoReady = mBSplashView.isH5Ready();
        }
        if (isVideoReady && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            isVideoReady = mBSplashView.isH5Ready();
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            isVideoReady = false;
        }
        if (!campaignEx.isDynamicView()) {
            return isVideoReady;
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return false;
        }
        return mBSplashView.isImageReady();
    }

    public static void a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (b == null) {
            b = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        b.a(arrayList, str);
    }

    public static void a(long j, String str) {
        if (b == null) {
            b = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        b.a(j, str);
    }
}
