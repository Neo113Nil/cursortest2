package com.vk.libvideo.design.compose.base.datacontent.presets;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.axq;
import xsna.egi0;
import xsna.gqe0;
import xsna.gzs;
import xsna.izs;
import xsna.jj;
import xsna.kbe;
import xsna.lg90;
import xsna.lzj0;
import xsna.mno0;
import xsna.nni;
import xsna.pg90;
import xsna.pzu0;
import xsna.q630;
import xsna.qzu0;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.us2;
import xsna.v0r;
import xsna.vmi;
import xsna.wh50;
import xsna.wmi;
import xsna.wuv0;
import xsna.xmi;
import xsna.ylu0;
import xsna.ymi;
import xsna.yqv0;
import xsna.yyn;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String a;
        VideoMetaViewState.d dVar;
        int i;
        VideoMetaViewState.c cVar;
        q630 q630Var;
        String str;
        String str2;
        q630.a aVar;
        int i2;
        int i3;
        int i4;
        boolean z;
        switch (this.b) {
            case 0:
                VideoMetaViewState.d dVar2 = (VideoMetaViewState.d) this.c;
                lzj0 lzj0Var = (lzj0) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? aVar2.J(lzj0Var) : aVar2.y(lzj0Var) ? 4 : 2;
                }
                if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1116987758, intValue, -1, "com.vk.libvideo.design.compose.base.datacontent.presets.DownloadProgressView.<anonymous>.<anonymous> (VideoMetaView.kt:302)");
                    }
                    mno0 mno0Var = dVar2.c;
                    VideoMetaViewState.c cVar2 = dVar2.d;
                    if (mno0Var == null) {
                        aVar2.K(-1224260919);
                        aVar2.j();
                        a = null;
                    } else {
                        aVar2.K(-316586952);
                        a = mno0Var.a(0, aVar2);
                        aVar2.j();
                    }
                    String a2 = dVar2.b.a(0, aVar2);
                    q630.a aVar3 = q630.a.a;
                    if (a != null) {
                        aVar2.K(-1224154371);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getText().p;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        cVar = cVar2;
                        i = intValue;
                        str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                        dVar = dVar2;
                        str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        q630Var = null;
                        yqv0.c(a, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.s0, aVar2, 0, 0, 8186);
                        aVar2 = aVar2;
                        b.g(lzj0Var, null, aVar2, i & 14);
                        aVar2.j();
                        aVar = aVar3;
                        i2 = -1;
                        i3 = 0;
                    } else {
                        dVar = dVar2;
                        i = intValue;
                        cVar = cVar2;
                        q630Var = null;
                        str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                        str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                        aVar2.K(-1223902217);
                        aVar = aVar3;
                        q630 H = s200.H(aVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            i2 = -1;
                            i3 = 0;
                            androidx.compose.runtime.b.f(-369078494, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-CheckCircleLarge16> (VkIcons.kt:1264)");
                        } else {
                            i2 = -1;
                            i3 = 0;
                        }
                        lg90 a3 = pg90.a(R.drawable.vk_icon_check_circle_large_16, i3, aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i3, i2, str2);
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        pzu0.b(a3, null, H, ylu0Var2.getIcon().l, aVar2, 440, 0);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i3, i2, str2);
                    }
                    ylu0 ylu0Var3 = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var3.getText().p;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, i3, i2, str);
                    }
                    wuv0 wuv0Var2 = (wuv0) aVar2.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.a aVar4 = aVar2;
                    q630.a aVar5 = aVar;
                    yqv0.c(a2, null, j2, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var2.s0, aVar4, 0, 0, 8186);
                    if (cVar != null) {
                        aVar4.K(-1223396576);
                        b.g(lzj0Var, q630Var, aVar4, i & 14);
                        VideoMetaViewState.c cVar3 = cVar;
                        us2 c = cVar3.a.c(aVar4);
                        kbe kbeVar = cVar3.a().c;
                        VideoMetaViewState.d dVar3 = dVar;
                        boolean J = aVar4.J(dVar3);
                        Object x = aVar4.x();
                        if (J || x == a.C0011a.a) {
                            x = new gqe0(dVar3, 20);
                            aVar4.R(x);
                        }
                        yyn.a(c, egi0.b(aVar5, false, (izs) x), kbeVar, null, 0L, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 0, 248);
                    } else {
                        aVar4.K(-1234911340);
                    }
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 1:
                wh50 wh50Var = (wh50) this.c;
                jj jjVar = (jj) obj;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar6.J(jjVar) ? 4 : 2;
                }
                if (aVar6.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(274464188, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$-2036072475.<anonymous>.<anonymous> (VkAccentTabRow.kt:604)");
                    }
                    if (((Number) wh50Var.getValue()).intValue() == 0) {
                        i4 = intValue2;
                        z = true;
                    } else {
                        i4 = intValue2;
                        z = false;
                    }
                    Object x2 = aVar6.x();
                    Object obj4 = a.C0011a.a;
                    if (x2 == obj4) {
                        x2 = new vmi(0, wh50Var);
                        aVar6.R(x2);
                    }
                    int i5 = ((i4 << 12) & 57344) | Tensorflow.FRAME_WIDTH;
                    jjVar.b(z, (gzs) x2, nni.i, null, aVar6, i5, 8);
                    boolean z2 = ((Number) wh50Var.getValue()).intValue() == 1;
                    Object x3 = aVar6.x();
                    if (x3 == obj4) {
                        x3 = new wmi(0, wh50Var);
                        aVar6.R(x3);
                    }
                    jjVar.b(z2, (gzs) x3, nni.j, null, aVar6, i5, 8);
                    boolean z3 = ((Number) wh50Var.getValue()).intValue() == 2;
                    Object x4 = aVar6.x();
                    if (x4 == obj4) {
                        x4 = new xmi(0, wh50Var);
                        aVar6.R(x4);
                    }
                    jjVar.b(z3, (gzs) x4, nni.k, null, aVar6, i5, 8);
                    boolean z4 = ((Number) wh50Var.getValue()).intValue() == 3;
                    Object x5 = aVar6.x();
                    if (x5 == obj4) {
                        x5 = new ymi(0, wh50Var);
                        aVar6.R(x5);
                    }
                    jjVar.b(z4, (gzs) x5, nni.l, null, aVar6, i5, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 2:
                axq axqVar = (axq) this.c;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar7.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2063948704, intValue3, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:75)");
                    }
                    axqVar.h(0, aVar7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                break;
            default:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if (aVar8.t(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1896240639, intValue4, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:148)");
                    }
                    v0rVar.i(0, aVar8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                break;
        }
        return s3q0.a;
    }
}
