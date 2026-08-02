package com.vk.movika.sdk.android.defaultplayer.control;

import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vk.core.view.components.context.menu.e;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.home.HomeFragment2;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.b;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedAudioSnackBarManager;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.alb0;
import xsna.bwt0;
import xsna.cai0;
import xsna.cb30;
import xsna.cd10;
import xsna.cq;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.e420;
import xsna.epx;
import xsna.fhc0;
import xsna.g5b0;
import xsna.ggc0;
import xsna.gzs;
import xsna.hwl;
import xsna.i97;
import xsna.ikv0;
import xsna.izs;
import xsna.j5g;
import xsna.j5h;
import xsna.jbc0;
import xsna.jw5;
import xsna.k9q0;
import xsna.kd4;
import xsna.l4k0;
import xsna.l4x;
import xsna.lg90;
import xsna.lws0;
import xsna.muv0;
import xsna.mws0;
import xsna.n34;
import xsna.ne7;
import xsna.or;
import xsna.p3t;
import xsna.q630;
import xsna.qq5;
import xsna.qri;
import xsna.rrv0;
import xsna.s3q0;
import xsna.sy90;
import xsna.szw;
import xsna.tet0;
import xsna.tny;
import xsna.tts0;
import xsna.txj0;
import xsna.v0r;
import xsna.vmx0;
import xsna.wlb0;
import xsna.wss0;
import xsna.wzs;
import xsna.xn50;
import xsna.xpy;
import xsna.ylu0;
import xsna.yqv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        long j;
        androidx.compose.runtime.a aVar;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z;
        VideoMinimizableDiscoveryFragment.b bVar;
        VideoMinimizableDiscoveryFragment.b bVar2;
        MiniPlayerControllersWrapper miniPlayerControllersWrapper;
        mws0 mws0Var;
        boolean z2;
        VideoDiscoveryRelatedAudioSnackBarManager videoDiscoveryRelatedAudioSnackBarManager;
        ikv0 ikv0Var;
        io.reactivex.rxjava3.disposables.c cVar;
        int i = this.b;
        int i2 = 9;
        int i3 = 1;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((u) obj3).p.setTypeface((Typeface) obj2);
                return Boolean.TRUE;
            case 1:
                ((Integer) obj2).getClass();
                ((kd4) obj3).f(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2004448985, intValue, -1, "com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreen.<anonymous> (BookingMastersScreen.kt:89)");
                    }
                    String N = d370.N(R.string.booking_accessability_back, 0, aVar2);
                    com.vk.core.compose.component.semantics.a b = cq.b("back_button", null, 3);
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new i97(izsVar, i3);
                        aVar2.R(x);
                    }
                    TopBar$Before.e a = e.a.a((gzs) x, N, null, null, b, aVar2, 196608, 12);
                    TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.booking_master_pick_title, 0, aVar2), null, null, null, null, aVar2, 196608, 30), null, null, cq.b("screen_title", null, 3), aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                    }
                    lg90 b2 = or.b(aVar2, 861936997, R.drawable.vk_icon_cancel_outline_28, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N2 = d370.N(R.string.booking_accessability_close, 0, aVar2);
                    boolean J2 = aVar2.J(izsVar);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new qq5(izsVar, i3);
                        aVar2.R(x2);
                    }
                    muv0.h(a2, null, null, null, a, null, d.a.a(d.c.C0760d.a.a(b2, N2, (gzs) x2, null, null, null, aVar2, 1572872, 56), null, null, cq.b("close_button", null, 3), aVar2, 24576, 6), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 8110);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((j5h) obj3).s6(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                DeliveryPoint.OpenStatus openStatus = (DeliveryPoint.OpenStatus) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1317406461, intValue2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointOpenStatus.<anonymous> (DeliveryPointDetails.kt:142)");
                    }
                    q630 f = txj0.f(q630.a.a, 1.0f);
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, f);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a3, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    String str = openStatus.c;
                    DeliveryPoint.OpenStatus.Status status = openStatus.b;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1680231392, 0, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.getTitleColor (DeliveryPointDetails.kt:280)");
                    }
                    int i4 = hwl.a.$EnumSwitchMapping$0[status.ordinal()];
                    if (i4 == 1) {
                        aVar3.K(-2070261431);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.q().e;
                        aVar3.j();
                    } else if (i4 == 2) {
                        aVar3.K(-2070154357);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.q().m;
                        aVar3.j();
                    } else if (i4 == 3) {
                        aVar3.K(-2070049112);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var3.q().g;
                        aVar3.j();
                    } else {
                        if (i4 != 4) {
                            throw alb0.c(-205331550, aVar3);
                        }
                        aVar3.K(-2069939031);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var4 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var4.getText().p;
                        aVar3.j();
                    }
                    long j6 = j;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, null, j6, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(aVar3).M, aVar3, 0, 48, 6138);
                    String str2 = openStatus.d;
                    if (str2 == null) {
                        aVar3.K(1351226521);
                        aVar3.j();
                        aVar = aVar3;
                    } else {
                        aVar3.K(1351226522);
                        String concat = " · ".concat(str2);
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        aVar = aVar3;
                        yqv0.c(concat, new xpy(1.0f, true), wlb0.h(aVar3).getText().p, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(aVar3).X, aVar, 100663296, 48, 5880);
                        aVar.j();
                    }
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((v0r) obj3).h(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                final HomeFragment2 homeFragment2 = (HomeFragment2) obj3;
                final int intValue3 = ((Integer) obj).intValue();
                final int intValue4 = ((Integer) obj2).intValue();
                int i5 = HomeFragment2.x0;
                ((fhc0) homeFragment2.q0.getValue()).a().a(PostingMetricsCreationEntryPoint.FeedPlus);
                jbc0 jbc0Var = (jbc0) homeFragment2.p0.getValue();
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                ggc0 ggc0Var = homeFragment2.o0;
                if (ggc0Var != null) {
                    ggc0Var.b(PostingCreationEntryPoint.FeedPlus, new gzs() { // from class: xsna.tbv
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.gzs
                        public final Object invoke() {
                            T t;
                            int i6 = HomeFragment2.x0;
                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            HomeFragment2 homeFragment22 = HomeFragment2.this;
                            AppBarLayout appBarLayout = homeFragment22.Q;
                            if (appBarLayout != null) {
                                int i7 = intValue3;
                                int i8 = intValue4;
                                Rect rect = new Rect(i7, i7, i8, i8);
                                int l = krv0.l(R.attr.vk_ui_icon_accent);
                                appBarLayout.getContext();
                                e.c cVar2 = new e.c(null, rect, appBarLayout, l, 1);
                                cVar2.m = cn70.b(4);
                                cVar2.n = cn70.b(64);
                                cVar2.l = new bsj0(new td0(19, ref$ObjectRef, homeFragment22));
                                t = cVar2.l(false);
                            } else {
                                t = 0;
                            }
                            ref$ObjectRef.element = t;
                            return s3q0.a;
                        }
                    });
                }
                return s3q0.a;
            case 7:
                tny tnyVar = (tny) obj3;
                tny a4 = ((cai0) obj).a();
                tny a5 = ((cai0) obj2).a();
                long j7 = 0;
                if (a4 != null) {
                    j4 = tnyVar.w(a4, 0L);
                    j2 = 4294967295L;
                    j3 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 >> 32)) + ((int) (a4.a() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 & 4294967295L)) + ((int) (a4.a() & 4294967295L))) & 4294967295L);
                } else {
                    j2 = 4294967295L;
                    j3 = 0;
                    j4 = 0;
                }
                if (a5 != null) {
                    j7 = tnyVar.w(a5, 0L);
                    j5 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 >> 32)) + ((int) (a5.a() >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & j2)) + ((int) (a5.a() & j2))) & j2);
                } else {
                    j5 = 0;
                }
                int i6 = (int) (j3 & j2);
                int i7 = (int) (j4 & j2);
                float intBitsToFloat = Float.intBitsToFloat(i6) - Float.intBitsToFloat(i7);
                int i8 = (int) (j3 >> 32);
                int i9 = (int) (j4 >> 32);
                float intBitsToFloat2 = Float.intBitsToFloat(i8) - Float.intBitsToFloat(i9);
                int i10 = (int) (j5 & j2);
                int i11 = (int) (j7 & j2);
                float intBitsToFloat3 = Float.intBitsToFloat(i10) - Float.intBitsToFloat(i11);
                int i12 = (int) (j5 >> 32);
                int i13 = (int) (j7 >> 32);
                float intBitsToFloat4 = Float.intBitsToFloat(i12) - Float.intBitsToFloat(i13);
                float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i10)) - Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i11)));
                float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i12)) - Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i13)));
                boolean z3 = max >= intBitsToFloat * 0.5f || max >= intBitsToFloat3 * 0.5f;
                if (max2 < intBitsToFloat2 * 0.5f && max2 < intBitsToFloat4 * 0.5f) {
                    r7 = true;
                }
                return Integer.valueOf((z3 && r7) ? jw5.b(Float.valueOf(Float.intBitsToFloat(i9)), Float.valueOf(Float.intBitsToFloat(i13))) : jw5.b(Float.valueOf(Float.intBitsToFloat(i7)), Float.valueOf(Float.intBitsToFloat(i11))));
            case 8:
                int intValue5 = ((Integer) obj).intValue();
                Integer num = (Integer) obj2;
                int i14 = StoryMediaPickerFragment.d0;
                p3t go = ((StoryMediaPickerFragment) obj3).go();
                if (go != null) {
                    go.Qg(intValue5, num);
                }
                return s3q0.a;
            case 9:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj3;
                VideoMinimizableState videoMinimizableState = (VideoMinimizableState) obj;
                com.vk.video.ui.discovery.minimizable.b bVar3 = (com.vk.video.ui.discovery.minimizable.b) obj2;
                int i15 = VideoMinimizableDiscoveryFragment.p1;
                ((VideoMinimizablePlayerComponent) videoMinimizableDiscoveryFragment.ko().a.getValue()).b3().onNext(videoMinimizableState);
                tts0 tts0Var = videoMinimizableDiscoveryFragment.V;
                if (tts0Var == null) {
                    tts0Var = null;
                }
                tts0Var.c(videoMinimizableState);
                MiniPlayerControllersWrapper miniPlayerControllersWrapper2 = videoMinimizableDiscoveryFragment.X;
                if (miniPlayerControllersWrapper2 != null) {
                    miniPlayerControllersWrapper2.Q(videoMinimizableState);
                }
                com.vk.video.ui.discovery.minimizable.announce.a aVar5 = videoMinimizableDiscoveryFragment.W;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                boolean z4 = videoMinimizableState instanceof VideoMinimizableState.Animating;
                if (z4) {
                    aVar5.d.invoke();
                } else {
                    aVar5.e.invoke();
                }
                aVar5.f(videoMinimizableState, aVar5.n);
                aVar5.m = videoMinimizableState;
                VideoMinimizableDiscoveryFragment.b bVar4 = videoMinimizableDiscoveryFragment.U;
                if (bVar4 == null) {
                    bVar4 = null;
                }
                cb30 cb30Var = bVar4.b;
                cb30Var.g.b.T4(videoMinimizableState);
                cb30Var.h.d.T4(videoMinimizableState);
                boolean d = com.vk.libvideo.api.minimizable.a.d(videoMinimizableState);
                if (z4) {
                    VideoMinimizableState.Animating animating = (VideoMinimizableState.Animating) videoMinimizableState;
                    if (com.vk.libvideo.api.minimizable.a.i(animating, new wss0(i3), new l4k0(i2)) | com.vk.libvideo.api.minimizable.a.i(animating, new cd10(25), new e420(29))) {
                        z = true;
                        r7 = !d || z;
                        bVar = videoMinimizableDiscoveryFragment.U;
                        if (bVar == null) {
                            bVar = null;
                        }
                        bwt0.p0(bVar.c, r7);
                        bVar2 = videoMinimizableDiscoveryFragment.U;
                        if (bVar2 == null) {
                            bVar2 = null;
                        }
                        bwt0.p0(bVar2.d, r7);
                        if (videoMinimizableState.equals(VideoMinimizableState.Pip.b) && (videoDiscoveryRelatedAudioSnackBarManager = videoMinimizableDiscoveryFragment.h0) != null) {
                            ikv0Var = videoDiscoveryRelatedAudioSnackBarManager.b;
                            if (ikv0Var != null) {
                                ikv0Var.a();
                            }
                            videoDiscoveryRelatedAudioSnackBarManager.b = null;
                            videoDiscoveryRelatedAudioSnackBarManager.c = null;
                            cVar = videoDiscoveryRelatedAudioSnackBarManager.d;
                            if (cVar != null) {
                                cVar.dispose();
                            }
                            videoDiscoveryRelatedAudioSnackBarManager.d = null;
                        }
                        xn50.a.c(videoMinimizableDiscoveryFragment, new c.r(videoMinimizableState, bVar3));
                        miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                        if (miniPlayerControllersWrapper != null) {
                            miniPlayerControllersWrapper.ba(bVar3);
                        }
                        mws0Var = videoMinimizableDiscoveryFragment.K0;
                        if (mws0Var != null) {
                            if (!epx.f(mws0Var.d, bVar3) && bVar3.equals(b.a.a)) {
                                lws0 lws0Var = mws0Var.e;
                                Iterator it = j5g.y0(lws0Var.b()).iterator();
                                while (it.hasNext()) {
                                    lws0Var.c(((Fragment) it.next()).getTag());
                                }
                            }
                            mws0Var.d = bVar3;
                        }
                        z2 = !(bVar3 instanceof b.a);
                        if (videoMinimizableDiscoveryFragment.M0 != z2) {
                            videoMinimizableDiscoveryFragment.M0 = z2;
                            tts0 tts0Var2 = videoMinimizableDiscoveryFragment.V;
                            tts0 tts0Var3 = tts0Var2 != null ? tts0Var2 : null;
                            l4x l4xVar = videoMinimizableDiscoveryFragment.N0;
                            g5b0 g5b0Var = tts0Var3.k;
                            if (g5b0Var != null) {
                                g5b0Var.a(l4xVar);
                            }
                        }
                        return s3q0.a;
                    }
                }
                z = false;
                if (d) {
                }
                bVar = videoMinimizableDiscoveryFragment.U;
                if (bVar == null) {
                }
                bwt0.p0(bVar.c, r7);
                bVar2 = videoMinimizableDiscoveryFragment.U;
                if (bVar2 == null) {
                }
                bwt0.p0(bVar2.d, r7);
                if (videoMinimizableState.equals(VideoMinimizableState.Pip.b)) {
                    ikv0Var = videoDiscoveryRelatedAudioSnackBarManager.b;
                    if (ikv0Var != null) {
                    }
                    videoDiscoveryRelatedAudioSnackBarManager.b = null;
                    videoDiscoveryRelatedAudioSnackBarManager.c = null;
                    cVar = videoDiscoveryRelatedAudioSnackBarManager.d;
                    if (cVar != null) {
                    }
                    videoDiscoveryRelatedAudioSnackBarManager.d = null;
                }
                xn50.a.c(videoMinimizableDiscoveryFragment, new c.r(videoMinimizableState, bVar3));
                miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                if (miniPlayerControllersWrapper != null) {
                }
                mws0Var = videoMinimizableDiscoveryFragment.K0;
                if (mws0Var != null) {
                }
                z2 = !(bVar3 instanceof b.a);
                if (videoMinimizableDiscoveryFragment.M0 != z2) {
                }
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((tet0) obj3).z(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                return vmx0.B((vmx0) obj3, (androidx.compose.runtime.a) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ n(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
