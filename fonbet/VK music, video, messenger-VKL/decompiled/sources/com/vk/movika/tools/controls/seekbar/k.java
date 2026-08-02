package com.vk.movika.tools.controls.seekbar;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.core.compose.utils.swipable.DismissValue;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.im.Image;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.libvideo.bottomsheet.about.delegate.h0;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.search.models.VkRelation;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.acn;
import xsna.c490;
import xsna.cib0;
import xsna.dde;
import xsna.dhr0;
import xsna.drm0;
import xsna.e64;
import xsna.eip;
import xsna.em50;
import xsna.epx;
import xsna.f15;
import xsna.f3k0;
import xsna.fx5;
import xsna.g3h;
import xsna.gzs;
import xsna.hmn0;
import xsna.jai;
import xsna.jeq0;
import xsna.jjq;
import xsna.js2;
import xsna.kai;
import xsna.kkm;
import xsna.ln20;
import xsna.lv90;
import xsna.ne7;
import xsna.pp00;
import xsna.q9x;
import xsna.rrv0;
import xsna.rvi;
import xsna.s3q0;
import xsna.sl50;
import xsna.sq60;
import xsna.sti;
import xsna.u44;
import xsna.vf60;
import xsna.vm30;
import xsna.vxq0;
import xsna.wzs;
import xsna.x9g0;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        final Integer num;
        View findViewByPosition;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        final Integer num2 = null;
        r8 = 0;
        int i2 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView defaultSeekBarView = (DefaultSeekBarView) obj3;
                int intValue = ((Integer) obj2).intValue();
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                defaultSeekBarView.e(defaultSeekBarView.getSeekIsDisabledAlpha(), intValue);
                return Boolean.TRUE;
            case 1:
                ((sti) obj).a(new u44(((AttachedClipsFragmentInternalComponent) obj3).a.a, (sl50) obj2));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((f15) obj3).g(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((dde) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((g3h) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                ImSettingsDialogThemeFragment imSettingsDialogThemeFragment = (ImSettingsDialogThemeFragment) obj3;
                int i3 = ImSettingsDialogThemeFragment.c0;
                kkm kkmVar = imSettingsDialogThemeFragment.Z;
                String str = dhr0.M() ? kkmVar.a.c.d : kkmVar.a.c.c;
                boolean z = drm0.N(str) || str.equals(BuildConfig.FLAVOR);
                ColorDrawable colorDrawable = z ? new ColorDrawable(dhr0.t.c(R.attr.im_bg_chat)) : null;
                if (z) {
                    VKEnhancedImageView vKEnhancedImageView = imSettingsDialogThemeFragment.V;
                    if (vKEnhancedImageView != null) {
                        vKEnhancedImageView.o0(null, null);
                    }
                } else {
                    VKEnhancedImageView vKEnhancedImageView2 = imSettingsDialogThemeFragment.V;
                    if (vKEnhancedImageView2 != null) {
                        Image image = new Image(str);
                        Object obj4 = fx5.a;
                        fx5.b(jeq0.g(str), (x9g0) imSettingsDialogThemeFragment.a0.getValue());
                        vKEnhancedImageView2.setLocalImage(image);
                    }
                }
                VKEnhancedImageView vKEnhancedImageView3 = imSettingsDialogThemeFragment.V;
                if (vKEnhancedImageView3 != null) {
                    vKEnhancedImageView3.setBackground(colorDrawable);
                }
                jjq jjqVar = imSettingsDialogThemeFragment.S;
                if (jjqVar != null) {
                    boolean z2 = !z;
                    if (jjqVar.n != null) {
                        jjqVar.X0(jjqVar.r);
                        vm30 vm30Var = jjqVar.n;
                        (vm30Var != null ? vm30Var : null).p(z2);
                    }
                }
                return s3q0.a;
            case 6:
                return ((em50) obj).a((e64) obj3, (vf60) obj2);
            case 7:
                ((Integer) obj).intValue();
                zak0 zak0Var = (zak0) ((lv90) obj3).l1;
                VkPeopleSearchParams copy = ((VkPeopleSearchParams) zak0Var.getValue()).copy();
                copy.f = (VkRelation) obj2;
                zak0Var.setValue(copy);
                return s3q0.a;
            case 8:
                cib0 cib0Var = (cib0) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(553942724, intValue2, -1, "com.vk.music.podcast.impl.ui.page.PodcastPageErrorViewController.show.<anonymous> (PodcastPageErrorViewController.kt:47)");
                    }
                    KidsModeRestrictionRenderer.Source source = KidsModeRestrictionRenderer.Source.ADULT_CONTENT;
                    boolean y = aVar2.y(cib0Var);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        x = new pp00(cib0Var, 18);
                        aVar2.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y2 = aVar2.y(cib0Var);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new ln20(cib0Var, 11);
                        aVar2.R(x2);
                    }
                    KidsModeRestrictionRenderer.b.a(source, gzsVar, (gzs) x2, cib0Var.b, aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 9:
                final PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) obj3;
                final sq60 sq60Var = (sq60) obj2;
                RecyclerView recyclerView = postsFromNotificationsFragment.Z;
                if (recyclerView == null) {
                    return s3q0.a;
                }
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (sq60Var.e) {
                    num = Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(num.intValue())) != null) {
                        i2 = findViewByPosition.getTop();
                    }
                    num2 = Integer.valueOf(i2);
                }
                postsFromNotificationsFragment.eo().a().H0(recyclerView, new js2(4, postsFromNotificationsFragment, sq60Var), new Runnable() { // from class: xsna.tuc0
                    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Integer num3;
                        qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                        sq60 sq60Var2 = sq60.this;
                        Integer num4 = sq60Var2.g;
                        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                        if (num4 == null || num4.intValue() < 0) {
                            Integer num5 = num;
                            if (num5 != null && (num3 = num2) != null && num5.intValue() >= 0 && linearLayoutManager2 != null) {
                                linearLayoutManager2.K(num5.intValue(), num3.intValue());
                            }
                        } else if (linearLayoutManager2 != null) {
                            linearLayoutManager2.K(num4.intValue(), 0);
                        }
                        boolean z3 = sq60Var2.d;
                        PostsFromNotificationsFragment postsFromNotificationsFragment2 = postsFromNotificationsFragment;
                        if (z3) {
                            RecyclerView recyclerView2 = postsFromNotificationsFragment2.Z;
                            RecyclerView.o layoutManager2 = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                            LinearLayoutManager linearLayoutManager3 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                            if (linearLayoutManager3 != null) {
                                linearLayoutManager3.K(0, 0);
                            }
                        }
                        ((o170) postsFromNotificationsFragment2.eo().a.V.getValue()).b(postsFromNotificationsFragment2.Z);
                        postsFromNotificationsFragment2.eo().b().a(sq60Var2.a);
                        ehv ehvVar = (ehv) postsFromNotificationsFragment2.eo().e.b;
                        if (ehvVar != null) {
                            ehvVar.r();
                        }
                    }
                }, sq60Var.a, sq60Var.c);
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                f3k0.a((UIBlockPlaceholder) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 11:
                List list = (List) obj3;
                long j = ((q9x) obj2).a;
                float f = (int) (j >> 32);
                float f2 = (int) (j & 4294967295L);
                int i4 = hmn0.a.$EnumSwitchMapping$0[((DismissValue) obj).ordinal()];
                if (i4 == 1) {
                    if (list.contains(acn.d.a)) {
                        return Float.valueOf(f);
                    }
                    return null;
                }
                if (i4 == 2) {
                    if (list.contains(acn.b.a)) {
                        return Float.valueOf(-f);
                    }
                    return null;
                }
                if (i4 == 3) {
                    if (list.contains(acn.e.a)) {
                        return Float.valueOf(f2);
                    }
                    return null;
                }
                if (i4 != 4) {
                    if (i4 == 5) {
                        return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (list.contains(acn.a.a)) {
                    return Float.valueOf(-f2);
                }
                return null;
            case 12:
                ((vxq0) obj3).r((eip) obj2);
                return s3q0.a;
            case 13:
                h0.a aVar3 = (h0.a) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1810687557, intValue3, -1, "com.vk.libvideo.bottomsheet.about.delegate.VideoInfoDelegate.ViewHolder.<anonymous> (VideoInfoDelegate.kt:75)");
                    }
                    l lVar = new l(aVar3, 17);
                    aVar4.K(-1697287492);
                    boolean J = aVar4.J(lVar);
                    Object x3 = aVar4.x();
                    if (J || x3 == c0012a) {
                        h0.a.C1218a c1218a = new h0.a.C1218a(2, lVar, epx.a.class, "invoke", "lambda$11$lambda$10$invoke$9(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 0);
                        aVar4.R(c1218a);
                        x3 = c1218a;
                    }
                    rrv0.e(true, null, null, null, null, null, (wzs) x3, aVar4, 6, 62);
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1690567820, intValue4, -1, "com.vk.core.compose.modal.VkThemeWithoutOverscroll.<anonymous> (VkThemeWithoutOverscroll.kt:26)");
                    }
                    rvi.a(c490.a.b(null), kai.c(-496971724, new m(jaiVar, 16), aVar5), aVar5, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ k(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
