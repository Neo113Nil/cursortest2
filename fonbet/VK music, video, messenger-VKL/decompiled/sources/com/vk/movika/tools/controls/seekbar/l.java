package com.vk.movika.tools.controls.seekbar;

import android.content.Context;
import android.database.Cursor;
import android.os.Trace;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.libvideo.bottomsheet.about.delegate.h0;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.bi40;
import xsna.bpn0;
import xsna.cq;
import xsna.d370;
import xsna.dhr0;
import xsna.e0w;
import xsna.e8j0;
import xsna.ei80;
import xsna.f9n0;
import xsna.fcy;
import xsna.frv0;
import xsna.fyh;
import xsna.g86;
import xsna.gzs;
import xsna.hco;
import xsna.his0;
import xsna.izs;
import xsna.jai;
import xsna.kai;
import xsna.kdj;
import xsna.kqu0;
import xsna.kww;
import xsna.lg90;
import xsna.lv90;
import xsna.moi;
import xsna.muv0;
import xsna.ndp0;
import xsna.ne7;
import xsna.o4e;
import xsna.or;
import xsna.p4e;
import xsna.psu0;
import xsna.q630;
import xsna.rpo0;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.tq0;
import xsna.u;
import xsna.u5d0;
import xsna.u7n0;
import xsna.udn0;
import xsna.us2;
import xsna.wh50;
import xsna.wlb0;
import xsna.wvq;
import xsna.wzs;
import xsna.x7j0;
import xsna.xn50;
import xsna.ywh;
import xsna.zak0;
import xsna.zs9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.a aVar;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i2 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView defaultSeekBarView = (DefaultSeekBarView) obj3;
                int intValue = ((Integer) obj2).intValue();
                DefaultSeekBarView.a aVar2 = DefaultSeekBarView.Companion;
                defaultSeekBarView.e(intValue, defaultSeekBarView.getSeekIsEnabledAlpha());
                return Boolean.TRUE;
            case 1:
                xsna.u uVar = (xsna.u) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1057843057, intValue2, -1, "com.vk.profile.core.aplus.APlusModalBottomSheet.ThemedContent.<anonymous> (APlusModalBottomSheet.kt:60)");
                    }
                    aVar3.K(-2027337325);
                    boolean y = aVar3.y(uVar);
                    Object x = aVar3.x();
                    if (y || x == c0012a) {
                        x = new xsna.q(uVar, i2);
                        aVar3.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y2 = aVar3.y(uVar);
                    Object x2 = aVar3.x();
                    if (y2 || x2 == c0012a) {
                        u.c cVar = new u.c(0, uVar, xsna.u.class, "dismiss", "dismiss()V", 0);
                        aVar3.R(cVar);
                        x2 = cVar;
                    }
                    xsna.w.a(0, aVar3, gzsVar, (gzs) ((fcy) x2), null);
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 2:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(683451966, intValue3, -1, "com.vk.ecomm.onlinebooking.impl.completed.pesentation.Content.<anonymous> (BookingRecordCompletedScreen.kt:114)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                    }
                    lg90 b = or.b(aVar4, 861936997, R.drawable.vk_icon_cancel_outline_28, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.booking_accessability_close, 0, aVar4);
                    boolean J = aVar4.J(izsVar);
                    Object x3 = aVar4.x();
                    if (J || x3 == c0012a) {
                        x3 = new tq0(izsVar, r7 ? 1 : 0);
                        aVar4.R(x3);
                    }
                    muv0.h(TopBar$Middle.a.c, null, null, null, null, TopBar$Before.e.a.a(b, N, (gzs) x3, null, null, cq.b("close_button", null, 3), aVar4, 1572872, 24), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 1572870, 0, 8094);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 3:
                ((zs9) obj3).i.un();
                return s3q0.a;
            case 4:
                p4e p4eVar = (p4e) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(920666394, intValue4, -1, "com.vk.clips.favorites.impl.ui.folders.picker.content.ClipsFavoritesFoldersPickerContentView.<anonymous> (ClipsFavoritesFoldersPickerContentView.kt:87)");
                    }
                    rrv0.e(dhr0.a.c(p4eVar.a), null, null, null, null, null, kai.c(242602749, new o4e(p4eVar, i2), aVar5), aVar5, 1572864, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 5:
                ((fyh) obj3).i.c(new ywh.d(((Integer) obj).intValue()));
                return s3q0.a;
            case 6:
                kdj kdjVar = (kdj) obj3;
                Cursor d = ((e0w) obj).d((String) obj2, null);
                ArrayList arrayList = new ArrayList(d.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (d.moveToFirst()) {
                            while (!d.isAfterLast()) {
                                arrayList.add(kdjVar.r(d));
                                d.moveToNext();
                            }
                        }
                        return arrayList;
                    } finally {
                        d.close();
                    }
                } finally {
                    Trace.endSection();
                }
            case 7:
                ((Integer) obj2).getClass();
                hco.a((bi40) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                ((wvq) obj3).h(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ei80.d((wh50) obj3, (androidx.compose.runtime.a) obj, ne7.I(55));
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((lv90) obj3).jo(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 11:
                ListLoadingState listLoadingState = (ListLoadingState) obj2;
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = ((PostsFromNotificationsFragment) obj3).a0;
                if (swipeDrawableRefreshLayout != null) {
                    swipeDrawableRefreshLayout.setRefreshing(listLoadingState == ListLoadingState.REFRESHING);
                }
                return s3q0.a;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((g86) obj3).invoke(bool);
                return s3q0.a;
            case 13:
                e8j0 e8j0Var = (e8j0) obj3;
                x7j0.c cVar2 = new x7j0.c(((CharSequence) obj2).toString());
                e8j0Var.getClass();
                xn50.a.c(e8j0Var, cVar2);
                return s3q0.a;
            case 14:
                udn0 udn0Var = (udn0) obj3;
                WebAction webAction = (WebAction) obj;
                Integer num = (Integer) obj2;
                num.intValue();
                u7n0 u7n0Var = udn0Var.p;
                Context context = udn0Var.itemView.getContext();
                Object obj4 = udn0Var.l;
                u7n0Var.b(context, webAction, (f9n0) (obj4 != null ? obj4 : null), num);
                return s3q0.a;
            case 15:
                rpo0 rpo0Var = (rpo0) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i3 = rpo0.l;
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1300336235, intValue5, -1, "com.vk.core.tool.view.ThemedAbstractComposeView.Content.<anonymous> (ThemedAbstractComposeView.kt:62)");
                    }
                    rpo0Var.A(8, aVar6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 16:
                ((Integer) obj).getClass();
                int intValue6 = ((Integer) obj2).intValue();
                bpn0 bpn0Var = u5d0.a;
                return u5d0.a.b(intValue6, ((StickerStockItem) obj3).C, false);
            case 17:
                h0.a aVar7 = (h0.a) obj3;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                aVar8.K(-137287492);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-137287492, intValue7, -1, "com.vk.libvideo.bottomsheet.about.delegate.VideoInfoDelegate.ViewHolder.<anonymous>.<anonymous> (VideoInfoDelegate.kt:76)");
                }
                kww kwwVar = (kww) ((zak0) aVar7.m).getValue();
                us2 us2Var = kwwVar != null ? kwwVar.a : null;
                if (us2Var == null) {
                    aVar8.K(-1122744271);
                    aVar8.j();
                    aVar = aVar8;
                } else {
                    aVar8.K(-1122744270);
                    Object x4 = aVar8.x();
                    if (x4 == c0012a) {
                        x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                        aVar8.R(x4);
                    }
                    wh50 wh50Var = (wh50) x4;
                    boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
                    String N2 = d370.N(R.string.more, 0, aVar8);
                    long j = wlb0.h(aVar8).getText().m;
                    frv0 frv0Var = wlb0.l(aVar8).i0;
                    long j2 = wlb0.h(aVar8).getText().m;
                    frv0 frv0Var2 = wlb0.l(aVar8).k0;
                    q630 E = s200.E(q630.a.a, kqu0.b, kqu0.t);
                    boolean y3 = aVar8.y(aVar7);
                    Object x5 = aVar8.x();
                    if (y3 || x5 == c0012a) {
                        x5 = new moi(aVar7, wh50Var);
                        aVar8.R(x5);
                    }
                    aVar = aVar8;
                    psu0.e(us2Var, booleanValue, (gzs) x5, E, j2, frv0Var2, frv0Var, j, 6, 0, N2, null, 0L, null, false, null, aVar, 100663296, 0, RtpSenderHelper.AUDIO_BITRATE_MAX);
                    aVar.j();
                    r6 = s3q0.a;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return r6;
            default:
                ((Integer) obj2).getClass();
                his0.c(ne7.I(55), (androidx.compose.runtime.a) obj, (jai) obj3);
                return s3q0.a;
        }
    }

    public /* synthetic */ l(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
