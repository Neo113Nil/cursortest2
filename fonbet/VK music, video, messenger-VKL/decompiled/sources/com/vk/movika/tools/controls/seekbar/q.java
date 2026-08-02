package com.vk.movika.tools.controls.seekbar;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import xsna.d5h;
import xsna.dv2;
import xsna.emq0;
import xsna.gri;
import xsna.gzs;
import xsna.iq5;
import xsna.iwo0;
import xsna.jg0;
import xsna.l7c;
import xsna.lds0;
import xsna.mj;
import xsna.naf;
import xsna.ne7;
import xsna.nni;
import xsna.q7v0;
import xsna.s3q0;
import xsna.us2;
import xsna.wzs;
import xsna.y2d;
import xsna.zak0;
import xsna.zux;
import xsna.zw80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Object remove;
        int i = this.b;
        int i2 = 9;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Float) obj2).floatValue();
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                ((DefaultSeekBarView) obj3).l();
                return Boolean.TRUE;
            case 1:
                ((zak0) ((iq5) obj3).q).setValue(Boolean.valueOf(((q7v0) obj).d((VkOnboardingCampaign) obj2)));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((y2d) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                int i3 = naf.k1;
                ((naf) obj3).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                int i4 = com.vk.attachpicker.collages.a.k1;
                ((lds0) obj3).onIsPlayingChanged(booleanValue);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((d5h.c) obj3).q6(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                mj mjVar = (mj) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(958213245, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$-1767692162.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkAccentTabRow.kt:572)");
                    }
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new dv2(i2);
                        aVar2.R(x);
                    }
                    mjVar.b(true, x, nni.g, null, aVar2, 438, 8);
                    Object x2 = aVar2.x();
                    if (x2 == c0012a) {
                        x2 = new jg0(11);
                        aVar2.R(x2);
                    }
                    mjVar.b(false, (gzs) x2, nni.h, null, aVar2, 438, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                gri.a((us2.b) obj3, (androidx.compose.runtime.a) obj, ne7.I(9));
                return s3q0.a;
            case 8:
                ListLoadingState listLoadingState = (ListLoadingState) obj2;
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = ((FaveFeedFragment) obj3).c0;
                if (swipeDrawableRefreshLayout != null) {
                    swipeDrawableRefreshLayout.setRefreshing(listLoadingState == ListLoadingState.REFRESHING);
                }
                return s3q0.a;
            case 9:
                zw80 zw80Var = (zw80) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1191666308, intValue2, -1, "com.vk.ecomm.cart.impl.checkout.ui.product.OrderProductModalBottomSheet.<anonymous>.<anonymous> (OrderProductModalBottomSheet.kt:32)");
                    }
                    l7c.e(zw80Var.a, null, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 10:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj3;
                int i5 = ((zux) obj).a;
                int i6 = ((zux) obj2).a;
                if (i5 != i6 && (remove = snapshotStateList.remove(i5)) != null) {
                    snapshotStateList.add(i6, remove);
                }
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                ((emq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                return VideoEditTimelineView.X4((VideoEditTimelineView) obj3, (iwo0) obj, (View) obj2);
        }
    }

    public /* synthetic */ q(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
