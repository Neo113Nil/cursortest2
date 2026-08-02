package com.vk.catalog.mvi.block.video.impl.movies.detail.buttons;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.ahn;
import xsna.anp;
import xsna.bhu0;
import xsna.bp7;
import xsna.cp8;
import xsna.crx0;
import xsna.d370;
import xsna.ew3;
import xsna.fd30;
import xsna.gio0;
import xsna.gji;
import xsna.gzs;
import xsna.izs;
import xsna.k1i0;
import xsna.ks2;
import xsna.lg90;
import xsna.lqy;
import xsna.mh3;
import xsna.mm2;
import xsna.or;
import xsna.pqv;
import xsna.psn0;
import xsna.q630;
import xsna.qzu0;
import xsna.rg50;
import xsna.s3q0;
import xsna.t9d;
import xsna.txj0;
import xsna.wh50;
import xsna.xvy;
import xsna.yzs;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lg90 y;
        switch (this.b) {
            case 0:
                fd30 fd30Var = (fd30) this.d;
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (b.d()) {
                        b.f(1669402766, intValue, -1, "com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.MovieButtons.<anonymous>.<anonymous> (MovieButtonsCatalogView.kt:116)");
                    }
                    ButtonSize buttonSize = ButtonSize.Medium;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    qzu0.a.getClass();
                    pqv a = cp8.b.a.a(qzu0.d1(aVar), null, null, null, null, aVar, 196616, 30);
                    gio0 a2 = cp8.d.a.a(fd30Var.c.a(0, aVar), null, aVar, 3072, 6);
                    q630.a aVar2 = q630.a.a;
                    q630 E = ahn.E(aVar2, "movie_screen_watch_button");
                    boolean J = aVar.J(izsVar) | aVar.J(fd30Var);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new ks2(20, izsVar, fd30Var);
                        aVar.R(x);
                    }
                    bhu0.d((gzs) x, buttonStyle, buttonAppearance, E, buttonSize, null, a, a2, false, null, aVar, 28080, 3872);
                    fd30.a aVar3 = fd30Var.d;
                    if (aVar3 == null) {
                        aVar.K(1752148364);
                    } else {
                        aVar.K(1752148365);
                        ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
                        if (aVar3.a) {
                            aVar.K(154400088);
                            if (b.d()) {
                                b.f(1513554790, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Clock24> (VkIcons.kt:1540)");
                            }
                            y = or.b(aVar, 1744239815, R.drawable.vk_icon_clock_24, aVar, 0);
                            if (b.d()) {
                                b.e();
                            }
                        } else {
                            aVar.K(154400767);
                            y = qzu0.y(aVar);
                        }
                        aVar.j();
                        pqv a3 = cp8.b.a.a(y, null, null, null, null, aVar, 196616, 30);
                        gio0 a4 = aVar3.b ? cp8.d.a.a(d370.N(R.string.movie_watch_later, 0, aVar), null, aVar, 3072, 6) : null;
                        q630 E2 = ahn.E(aVar2, "movie_screen_watch_later_button");
                        boolean J2 = aVar.J(izsVar) | aVar.J(fd30Var);
                        Object x2 = aVar.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new ew3(14, izsVar, fd30Var);
                            aVar.R(x2);
                        }
                        bhu0.d((gzs) x2, buttonStyle2, buttonAppearance, E2, buttonSize, null, a3, a4, false, null, aVar, 28080, 3872);
                    }
                    aVar.j();
                    if (b.d()) {
                        b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                a.d dVar = (a.d) this.d;
                izs izsVar2 = (izs) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (b.d()) {
                        b.f(1986892914, intValue2, -1, "com.vk.ecomm.orders.impl.orderlist.presentation.compose.OrderListScreen.<anonymous> (OrderListScreen.kt:65)");
                    }
                    q630 E3 = ahn.E(q630.a.a, "order_list_content_list");
                    boolean z = dVar.c;
                    boolean J3 = aVar4.J(izsVar2);
                    Object x3 = aVar4.x();
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (J3 || x3 == c0012a2) {
                        x3 = new t9d(izsVar2, 2);
                        aVar4.R(x3);
                    }
                    xvy z2 = crx0.z(z, (gzs) x3, 1, aVar4, 3072, 52);
                    boolean J4 = aVar4.J(dVar) | aVar4.J(izsVar2);
                    Object x4 = aVar4.x();
                    if (J4 || x4 == c0012a2) {
                        x4 = new bp7(26, dVar, izsVar2);
                        aVar4.R(x4);
                    }
                    lqy.a(E3, z2, null, null, null, null, false, null, (izs) x4, aVar4, 6, IronSourceError.ERROR_CODE_INIT_FAILED);
                    mm2.f(dVar.d, null, anp.e(null, 3), anp.f(null, 3), null, gji.b, aVar4, 200064, 18);
                    if (b.d()) {
                        b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            default:
                rg50 rg50Var = (rg50) this.d;
                wh50 wh50Var = (wh50) this.c;
                k1i0 k1i0Var = (k1i0) obj;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar5.J(k1i0Var) ? 4 : 2;
                }
                boolean z3 = false;
                if (aVar5.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (b.d()) {
                        b.f(-1275442025, intValue3, -1, "com.vk.design.demo.presentation.screens.SecondaryTabsContent.<anonymous>.<anonymous>.<anonymous> (TabsScreenContent.kt:351)");
                    }
                    q630 C = txj0.C(q630.a.a, null, 3);
                    if (rg50Var.getIntValue() == 0 && ((Boolean) wh50Var.getValue()).booleanValue()) {
                        z3 = true;
                    }
                    if (b.d()) {
                        b.f(1591975853, 54, -1, "com.vk.core.compose.component.tabs.TabItem.Middle.Text.Companion.invoke (VkTabItem.kt:181)");
                    }
                    Object x5 = aVar5.x();
                    Object obj4 = a.C0011a.a;
                    if (x5 == obj4) {
                        x5 = new psn0.a("Fixed");
                        aVar5.R(x5);
                    }
                    psn0.a aVar6 = (psn0.a) x5;
                    ((zak0) aVar6.b).setValue("Fixed");
                    if (b.d()) {
                        b.e();
                    }
                    Object x6 = aVar5.x();
                    if (x6 == obj4) {
                        x6 = new mh3(28, rg50Var, wh50Var);
                        aVar5.R(x6);
                    }
                    k1i0Var.c(z3, (gzs) x6, C, aVar6, null, null, null, aVar5, ((intValue3 << 21) & 29360128) | Tensorflow.FRAME_WIDTH, 112);
                    if (b.d()) {
                        b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
        }
        return s3q0.a;
    }
}
