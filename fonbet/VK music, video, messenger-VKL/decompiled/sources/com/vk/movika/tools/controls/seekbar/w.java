package com.vk.movika.tools.controls.seekbar;

import android.graphics.Bitmap;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.dto.common.Image;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a5x;
import xsna.a94;
import xsna.ac0;
import xsna.bap;
import xsna.bly;
import xsna.bme;
import xsna.cri;
import xsna.d370;
import xsna.d64;
import xsna.dhr0;
import xsna.dme;
import xsna.dt1;
import xsna.dwh;
import xsna.eme;
import xsna.epx;
import xsna.f910;
import xsna.fkq0;
import xsna.fme;
import xsna.fwl;
import xsna.fxq0;
import xsna.gzs;
import xsna.h0b;
import xsna.hqv0;
import xsna.isi;
import xsna.ivq0;
import xsna.izs;
import xsna.jvi;
import xsna.k9q0;
import xsna.kai;
import xsna.kh00;
import xsna.krv0;
import xsna.kwl;
import xsna.lg90;
import xsna.lv90;
import xsna.muv0;
import xsna.n34;
import xsna.ne7;
import xsna.nq1;
import xsna.o4r;
import xsna.oud0;
import xsna.p510;
import xsna.pvq0;
import xsna.q630;
import xsna.qri;
import xsna.qzu0;
import xsna.rrv0;
import xsna.rwr;
import xsna.s200;
import xsna.s3q0;
import xsna.sj50;
import xsna.spx0;
import xsna.stk0;
import xsna.sy90;
import xsna.t8s;
import xsna.tho0;
import xsna.txj0;
import xsna.uvi;
import xsna.uxb;
import xsna.v1z;
import xsna.wg40;
import xsna.wh50;
import xsna.wvq;
import xsna.wzs;
import xsna.xb0;
import xsna.xk6;
import xsna.y4;
import xsna.yb0;
import xsna.ywq0;
import xsna.zb0;
import xsna.zk6;
import xsna.zq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        com.vk.core.compose.component.topbar.a aVar;
        int i;
        int i2;
        int i3 = this.b;
        int i4 = 6;
        int i5 = 2;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                long longValue = ((Long) obj2).longValue();
                DefaultSeekBarView.a aVar2 = DefaultSeekBarView.Companion;
                ((DefaultSeekBarView) obj3).c = new a0(longValue);
                return Boolean.TRUE;
            case 1:
                List list = (List) obj;
                int intValue = ((Integer) obj2).intValue();
                Object obj4 = ((zk6) obj3).o;
                Object obj5 = obj4;
                if (obj4 == null) {
                    obj5 = null;
                }
                ((oud0) obj5).d0(intValue, list);
                return s3q0.a;
            case 2:
                dme dmeVar = (dme) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i6 = dme.m1;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1651437765, intValue2, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.ClipsMyDescriptionEditView.ThemedContent.<anonymous> (ClipsMyDescriptionEditView.kt:57)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1524873356, 0, -1, "com.vk.clips.viewer.impl.grid.toolbar.profile.ClipsMyDescriptionEditView.EditDescriptionContent (ClipsMyDescriptionEditView.kt:63)");
                    }
                    spx0 spx0Var = (spx0) aVar3.r(uvi.u);
                    Object x = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new rwr();
                        aVar3.R(x);
                    }
                    rwr rwrVar = (rwr) x;
                    Object x2 = aVar3.x();
                    if (x2 == c0012a) {
                        String str = dmeVar.j1;
                        if (str == null) {
                            str = null;
                        }
                        x2 = androidx.compose.runtime.k.b(new tho0(str, 0L, 6));
                        aVar3.R(x2);
                    }
                    wh50 wh50Var = (wh50) x2;
                    Object x3 = aVar3.x();
                    if (x3 == c0012a) {
                        String str2 = dmeVar.j1;
                        if (str2 == null) {
                            str2 = null;
                        }
                        x3 = androidx.compose.runtime.k.b(dmeVar.eo(str2.length()));
                        aVar3.R(x3);
                    }
                    wh50 wh50Var2 = (wh50) x3;
                    Object x4 = aVar3.x();
                    if (x4 == c0012a) {
                        String str3 = dmeVar.j1;
                        if (str3 == null) {
                            str3 = null;
                        }
                        x4 = io.reactivex.rxjava3.internal.operators.mixed.j.d(str3.length() <= 1000, aVar3);
                    }
                    wh50 wh50Var3 = (wh50) x4;
                    q630.a aVar4 = q630.a.a;
                    q630 d = txj0.d(aVar4, 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, d);
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
                    String N = d370.N(R.string.accessibility_cancel, 0, aVar3);
                    boolean y = aVar3.y(dmeVar);
                    Object x5 = aVar3.x();
                    if (y || x5 == c0012a) {
                        x5 = new a94(7, dmeVar, wh50Var);
                        aVar3.R(x5);
                    }
                    TopBar$Before.d a2 = TopBar$Before.d.a.a(N, (gzs) x5, null, null, aVar3, 24576, 12);
                    TopBar$Middle.Text.Title a3 = TopBar$Middle.Text.Title.b.a((String) wh50Var2.getValue(), null, null, null, null, aVar3, 196608, 30);
                    androidx.compose.runtime.a aVar6 = aVar3;
                    TopBar$Middle.Text a4 = TopBar$Middle.Text.b.a(a3, null, null, null, aVar6, 14);
                    if (((Boolean) wh50Var3.getValue()).booleanValue()) {
                        aVar6.K(-1768799509);
                        qzu0.a.getClass();
                        lg90 G = qzu0.G(aVar6);
                        String N2 = d370.N(R.string.done, 0, aVar6);
                        boolean y2 = aVar6.y(dmeVar);
                        Object x6 = aVar6.x();
                        if (y2 || x6 == c0012a) {
                            x6 = new y4(5, dmeVar, wh50Var);
                            aVar6.R(x6);
                        }
                        d.c.C0760d a5 = d.c.C0760d.a.a(G, N2, (gzs) x6, null, null, null, aVar6, 1572872, 56);
                        aVar6 = aVar6;
                        aVar = d.a.a(a5, null, null, null, aVar6, 24576, 14);
                        aVar6.j();
                    } else {
                        aVar6.K(-1768329952);
                        aVar6.j();
                        aVar = null;
                    }
                    androidx.compose.runtime.a aVar7 = aVar6;
                    muv0.h(a4, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 7), null, null, null, a2, aVar, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar7, 48, 0, 8092);
                    tho0 tho0Var = (tho0) wh50Var.getValue();
                    q630 a6 = qri.a(jvi.d(txj0.d(aVar4, 1.0f), rwrVar), a5x.a, new fme(wh50Var, r8 ? 1 : 0));
                    ClipsAuthor clipsAuthor = dmeVar.i1;
                    if (clipsAuthor == null) {
                        clipsAuthor = null;
                    }
                    if (fkq0.d(clipsAuthor.b.b)) {
                        i = -1767569305;
                        i2 = R.string.clip_grid_author_tell_about_yourself;
                    } else {
                        i = -1767463099;
                        i2 = R.string.clip_grid_group_author_add_description;
                    }
                    String a7 = zq.a(aVar7, i, i2, aVar7, 0);
                    InputSelect$State inputSelect$State = InputSelect$State.NoBorder;
                    boolean y3 = aVar7.y(dmeVar);
                    Object x7 = aVar7.x();
                    if (y3 || x7 == c0012a) {
                        bme bmeVar = new bme(dmeVar, wh50Var, wh50Var3, wh50Var2, 0);
                        aVar7.R(bmeVar);
                        x7 = bmeVar;
                    }
                    hqv0.d(tho0Var, (izs) x7, a6, a7, inputSelect$State, 0, 0, true, false, 0L, 0L, null, null, null, null, null, null, null, null, false, aVar7, 12607488, 0, 1048416);
                    aVar7.G();
                    boolean J = aVar7.J(spx0Var);
                    Object x8 = aVar7.x();
                    if (J || x8 == c0012a) {
                        x8 = new eme(spx0Var, rwrVar, null);
                        aVar7.R(x8);
                    }
                    bap.g(spx0Var, (wzs) x8, aVar7, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                dwh.a aVar8 = (dwh.a) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(599432137, intValue3, -1, "com.vk.profile.community.impl.ui.item.header.rebooking.CommunityReBookingBannerItem.ViewHolder.<anonymous> (CommunityReBookingBannerItem.kt:51)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1255110866, new xk6(aVar8, i5), aVar9), aVar9, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 4:
                DeliveryPoint deliveryPoint = (DeliveryPoint) obj3;
                DeliveryPoint.PlaceMark placeMark = (DeliveryPoint.PlaceMark) obj;
                float floatValue = ((Float) obj2).floatValue();
                Image image = placeMark.d;
                Bitmap b = image != null ? fwl.b(image, floatValue) : null;
                kwl kwlVar = kwl.a;
                int a8 = stk0.a(placeMark, deliveryPoint.e);
                kwlVar.getClass();
                return kwl.a(b, a8, floatValue, true);
            case 5:
                ImageView imageView = (ImageView) obj3;
                dhr0.a.l0(imageView, R.drawable.vk_icon_education_12, R.attr.vk_ui_icon_accent_themed);
                dhr0.f0(R.drawable.bg_white_circle, R.attr.vk_ui_background_secondary, imageView);
                imageView.setVisibility(0);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((wvq) obj3).k(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((o4r) obj3).fo(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                t8s.n((v1z) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((bly) obj3).a(q630.a.a, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((kh00) obj3).k(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 11:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) obj3;
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i7 = MarketEditAlbumGoodsFragment.c1;
                if (aVar10.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1387429150, intValue4, -1, "com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment.initTopBar.<anonymous> (MarketEditAlbumGoodsFragment.kt:290)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-898657767, new nq1(marketEditAlbumGoodsFragment, i4), aVar10), aVar10, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                p510.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 13:
                f910 f910Var = (f910) obj3;
                androidx.compose.runtime.a aVar11 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar11.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1777722656, intValue5, -1, "com.vk.ecomm.products_multipicker.impl.presentation.view.MarketMultiSelectPickerView.configureSaveResultButtonHolder.<anonymous> (MarketMultiSelectPickerView.kt:162)");
                    }
                    TypedValue typedValue = krv0.a;
                    rrv0.e(epx.f(krv0.i(f910Var.c), Boolean.TRUE), null, null, null, null, null, kai.c(1579358621, new uxb(f910Var, i4), aVar11), aVar11, 1572864, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar11.h();
                }
                return s3q0.a;
            case 14:
                return wg40.z((wg40) obj3, (androidx.compose.runtime.a) obj, ((Integer) obj2).intValue());
            case 15:
                ((Integer) obj2).getClass();
                ((lv90) obj3).ho(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 16:
                ((Integer) obj2).getClass();
                ((TopBar$Middle.Cell.Middle.Text.Title.a.b) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                fxq0 fxq0Var = (fxq0) obj3;
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                h0b h0bVar = fxq0Var.g;
                final d64 a9 = isiVar.a(new ac0(sj50Var, h0bVar));
                final d64 a10 = isiVar.a(new xb0(sj50Var, h0bVar));
                final d64 a11 = isiVar.a(new yb0(sj50Var, h0bVar));
                final d64 a12 = isiVar.a(new zb0(h0bVar, fxq0Var.f, sj50Var));
                final d64 a13 = isiVar.a(new ivq0(sj50Var));
                final d64 a14 = isiVar.a(new ywq0(sj50Var));
                isiVar.c = new wzs() { // from class: xsna.fwq0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj6, Object obj7) {
                        rj50 rj50Var = (rj50) obj6;
                        pvq0 pvq0Var = (pvq0) obj7;
                        if (pvq0Var instanceof pvq0.c) {
                            return rj50Var.a(d64.this, pvq0Var);
                        }
                        if (pvq0Var instanceof pvq0.b) {
                            return rj50Var.a(a11, pvq0Var);
                        }
                        if (pvq0Var instanceof pvq0.a) {
                            return rj50Var.a(a10, pvq0Var);
                        }
                        if (pvq0Var instanceof qvq0) {
                            return rj50Var.a(a12, pvq0Var);
                        }
                        if (pvq0Var instanceof pvq0.e) {
                            return rj50Var.a(a13, pvq0Var);
                        }
                        if (pvq0Var instanceof pvq0.d) {
                            return rj50Var.a(a14, pvq0Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
        }
    }

    public /* synthetic */ w(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }

    public /* synthetic */ w(fwl fwlVar, DeliveryPoint deliveryPoint) {
        this.b = 4;
        this.c = deliveryPoint;
    }
}
