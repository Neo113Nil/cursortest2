package com.vk.clips.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.BroadcastFriendsView;
import com.vk.core.compose.component.defaults.UserStackSize;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.bg8;
import xsna.cg8;
import xsna.cri;
import xsna.dt1;
import xsna.f4m;
import xsna.jai;
import xsna.q630;
import xsna.wzs;
import xsna.xcc;

/* compiled from: BroadcastFriendsView.kt */
/* loaded from: classes16.dex */
public final class BroadcastFriendsView extends FrameLayout implements cg8 {
    public static final /* synthetic */ int d = 0;
    public bg8 b;
    public final ComposeView c;

    public BroadcastFriendsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ComposeView composeView = new ComposeView(context, null, 6);
        this.c = composeView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(composeView, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(BroadcastFriendsView broadcastFriendsView, Integer num, final String str, List list, Integer num2, int i) {
        final ArrayList arrayList;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        final Integer num3 = (i & 8) != 0 ? null : num2;
        ComposeView composeView = broadcastFriendsView.c;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (UserProfile userProfile : list) {
                String str2 = userProfile.g;
                if (str2 == null) {
                    str2 = userProfile.h;
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
                final Integer num4 = num;
                final boolean z = arrayList != null;
                composeView.setContent(new jai(60994734, new wzs() { // from class: xsna.fg8
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        int i2 = BroadcastFriendsView.d;
                        if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(60994734, intValue, -1, "com.vk.clips.design.view.BroadcastFriendsView.setPrivacyInfoCellContent.<anonymous> (BroadcastFriendsView.kt:107)");
                            }
                            final List list2 = arrayList;
                            final boolean z2 = z;
                            final Integer num5 = num4;
                            final Integer num6 = num3;
                            final String str3 = str;
                            rrv0.e(true, null, null, null, null, null, kai.c(187151953, new wzs() { // from class: xsna.gg8
                                @Override // xsna.wzs
                                public final Object invoke(Object obj3, Object obj4) {
                                    androidx.compose.runtime.a aVar2;
                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    int i3 = BroadcastFriendsView.d;
                                    if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(187151953, intValue2, -1, "com.vk.clips.design.view.BroadcastFriendsView.setPrivacyInfoCellContent.<anonymous>.<anonymous> (BroadcastFriendsView.kt:108)");
                                        }
                                        q630.a aVar4 = q630.a.a;
                                        q630 f = txj0.f(aVar4, 1.0f);
                                        boolean z3 = z2;
                                        q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.j(z3 ? 32 : 52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f));
                                        a.e eVar = z3 ? androidx.compose.foundation.layout.a.e : androidx.compose.foundation.layout.a.g;
                                        dt1.a.getClass();
                                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(eVar, dt1.a.l, aVar3, 48);
                                        int hashCode = Long.hashCode(n34.n(aVar3));
                                        sy90 D = aVar3.D();
                                        q630 c = qri.c(aVar3, F);
                                        cri.h7.getClass();
                                        LayoutNode.a aVar5 = cri.a.b;
                                        if (aVar3.N() == null) {
                                            n34.r();
                                            throw null;
                                        }
                                        aVar3.H();
                                        if (aVar3.L()) {
                                            aVar3.I(aVar5);
                                        } else {
                                            aVar3.f();
                                        }
                                        k9q0.w(aVar3, a, cri.a.f);
                                        k9q0.w(aVar3, D, cri.a.e);
                                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                        k9q0.t(aVar3, cri.a.h);
                                        k9q0.w(aVar3, c, cri.a.d);
                                        Integer num7 = num5;
                                        if (num7 == null) {
                                            aVar3.K(101032560);
                                            aVar3.j();
                                        } else {
                                            aVar3.K(101032561);
                                            lg90 a2 = fko.a(new gko(num7.intValue()), aVar3);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                            }
                                            ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            pzu0.b(a2, null, null, ylu0Var.getIcon().l, aVar3, 56, 4);
                                            aVar3 = aVar3;
                                            mq.d(aVar4, kqu0.v, aVar3, 0);
                                        }
                                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                            szw.a("invalid weight; must be greater than zero");
                                        }
                                        xpy xpyVar = new xpy(1.0f, false);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                        }
                                        wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        frv0 frv0Var = wuv0Var.Y;
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                        }
                                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        androidx.compose.runtime.a aVar6 = aVar3;
                                        yqv0.c(str3, xpyVar, ylu0Var2.getText().m, null, null, 0, 0, null, 1, false, 0, Integer.MAX_VALUE, null, frv0Var, aVar6, 100663296, 48, 5880);
                                        List list3 = list2;
                                        if (list3 == null) {
                                            aVar6.K(101906946);
                                            aVar6.j();
                                            aVar2 = aVar6;
                                        } else {
                                            aVar6.K(101906947);
                                            f9t.e(txj0.v(aVar4, kqu0.v), aVar6, 0);
                                            UserStackSize userStackSize = UserStackSize.Medium;
                                            xcc.a.e eVar2 = xcc.a.e.a;
                                            boolean y = aVar6.y(list3);
                                            Integer num8 = num6;
                                            boolean J = y | aVar6.J(num8);
                                            Object x = aVar6.x();
                                            if (J || x == a.C0011a.a) {
                                                x = new d50(2, list3, num8);
                                                aVar6.R(x);
                                            }
                                            hyv0.c(null, userStackSize, eVar2, (izs) x, aVar6, 48, 1);
                                            aVar2 = aVar6;
                                            aVar2.j();
                                        }
                                        aVar2.G();
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar3.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar), aVar, 1572870, 62);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true));
                composeView.setVisibility(0);
            }
        }
        arrayList = null;
        final Integer num42 = num;
        if (arrayList != null) {
        }
        composeView.setContent(new jai(60994734, new wzs() { // from class: xsna.fg8
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = BroadcastFriendsView.d;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(60994734, intValue, -1, "com.vk.clips.design.view.BroadcastFriendsView.setPrivacyInfoCellContent.<anonymous> (BroadcastFriendsView.kt:107)");
                    }
                    final List list2 = arrayList;
                    final boolean z2 = z;
                    final Integer num5 = num42;
                    final Integer num6 = num3;
                    final String str3 = str;
                    rrv0.e(true, null, null, null, null, null, kai.c(187151953, new wzs() { // from class: xsna.gg8
                        @Override // xsna.wzs
                        public final Object invoke(Object obj3, Object obj4) {
                            androidx.compose.runtime.a aVar2;
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            int i3 = BroadcastFriendsView.d;
                            if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(187151953, intValue2, -1, "com.vk.clips.design.view.BroadcastFriendsView.setPrivacyInfoCellContent.<anonymous>.<anonymous> (BroadcastFriendsView.kt:108)");
                                }
                                q630.a aVar4 = q630.a.a;
                                q630 f = txj0.f(aVar4, 1.0f);
                                boolean z3 = z2;
                                q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.j(z3 ? 32 : 52, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f));
                                a.e eVar = z3 ? androidx.compose.foundation.layout.a.e : androidx.compose.foundation.layout.a.g;
                                dt1.a.getClass();
                                androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(eVar, dt1.a.l, aVar3, 48);
                                int hashCode = Long.hashCode(n34.n(aVar3));
                                sy90 D = aVar3.D();
                                q630 c = qri.c(aVar3, F);
                                cri.h7.getClass();
                                LayoutNode.a aVar5 = cri.a.b;
                                if (aVar3.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar3.H();
                                if (aVar3.L()) {
                                    aVar3.I(aVar5);
                                } else {
                                    aVar3.f();
                                }
                                k9q0.w(aVar3, a, cri.a.f);
                                k9q0.w(aVar3, D, cri.a.e);
                                k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                k9q0.t(aVar3, cri.a.h);
                                k9q0.w(aVar3, c, cri.a.d);
                                Integer num7 = num5;
                                if (num7 == null) {
                                    aVar3.K(101032560);
                                    aVar3.j();
                                } else {
                                    aVar3.K(101032561);
                                    lg90 a2 = fko.a(new gko(num7.intValue()), aVar3);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    pzu0.b(a2, null, null, ylu0Var.getIcon().l, aVar3, 56, 4);
                                    aVar3 = aVar3;
                                    mq.d(aVar4, kqu0.v, aVar3, 0);
                                }
                                if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                                    szw.a("invalid weight; must be greater than zero");
                                }
                                xpy xpyVar = new xpy(1.0f, false);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                }
                                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                frv0 frv0Var = wuv0Var.Y;
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                androidx.compose.runtime.a aVar6 = aVar3;
                                yqv0.c(str3, xpyVar, ylu0Var2.getText().m, null, null, 0, 0, null, 1, false, 0, Integer.MAX_VALUE, null, frv0Var, aVar6, 100663296, 48, 5880);
                                List list3 = list2;
                                if (list3 == null) {
                                    aVar6.K(101906946);
                                    aVar6.j();
                                    aVar2 = aVar6;
                                } else {
                                    aVar6.K(101906947);
                                    f9t.e(txj0.v(aVar4, kqu0.v), aVar6, 0);
                                    UserStackSize userStackSize = UserStackSize.Medium;
                                    xcc.a.e eVar2 = xcc.a.e.a;
                                    boolean y = aVar6.y(list3);
                                    Integer num8 = num6;
                                    boolean J = y | aVar6.J(num8);
                                    Object x = aVar6.x();
                                    if (J || x == a.C0011a.a) {
                                        x = new d50(2, list3, num8);
                                        aVar6.R(x);
                                    }
                                    hyv0.c(null, userStackSize, eVar2, (izs) x, aVar6, 48, 1);
                                    aVar2 = aVar6;
                                    aVar2.j();
                                }
                                aVar2.G();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), aVar, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true));
        composeView.setVisibility(0);
    }

    @Override // xsna.cg8
    public final void h(int i, List list) {
        if (i == 0) {
            f4m.j(this.c);
        } else {
            a(this, null, getContext().getString(list.size() == 1 ? R.string.live_broadcast_friends_watch_text_one : R.string.live_broadcast_friends_watch_text), list, Integer.valueOf(i), 1);
        }
    }

    @Override // xsna.cg8
    public void setGroupPrivacy(String str) {
        a(this, Integer.valueOf(R.drawable.vk_icon_lock_outline_20), str, null, null, 12);
    }

    @Override // xsna.cg8
    public void setUserVisibleFriendList(String str) {
        a(this, null, str, null, null, 12);
    }

    @Override // xsna.cg8
    public void setUserVisibleOnlyMe(String str) {
        a(this, Integer.valueOf(R.drawable.vk_icon_lock_outline_20), str, null, null, 12);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xsna.sr6
    public bg8 getPresenter() {
        return this.b;
    }

    public void setPresenter(bg8 bg8Var) {
        this.b = bg8Var;
    }
}
