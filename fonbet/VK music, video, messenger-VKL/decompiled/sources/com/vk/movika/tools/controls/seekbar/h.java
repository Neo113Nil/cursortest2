package com.vk.movika.tools.controls.seekbar;

import android.content.Intent;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.user.UserProfile;
import com.vk.instantjobs.components.appstate.AppState;
import com.vk.lists.DefaultErrorView;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.profile.core.npo.OrganizationModalVariant;
import com.vk.search.ui.api.SearchInputMethod;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.ahn;
import xsna.bhu0;
import xsna.c1h;
import xsna.c490;
import xsna.d370;
import xsna.e670;
import xsna.ets;
import xsna.f510;
import xsna.f870;
import xsna.fcy;
import xsna.g4g;
import xsna.g670;
import xsna.g8u;
import xsna.go20;
import xsna.gzs;
import xsna.ic3;
import xsna.iyk0;
import xsna.jai;
import xsna.kai;
import xsna.lg90;
import xsna.ne7;
import xsna.oal;
import xsna.or;
import xsna.q630;
import xsna.rpg;
import xsna.rrv0;
import xsna.rvi;
import xsna.s3q0;
import xsna.txj0;
import xsna.vqv;
import xsna.vyh0;
import xsna.wzs;
import xsna.ylu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        OrganizationModalVariant organizationModalVariant;
        Object bVar;
        e670 e670Var;
        String string;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Float f = (Float) obj2;
                f.floatValue();
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                ((DefaultSeekBarView) obj3).h(f);
                break;
            case 1:
                AiAssistantCardVh aiAssistantCardVh = (AiAssistantCardVh) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-36850374, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh.createComposeView.<anonymous>.<anonymous> (AiAssistantCardVh.kt:154)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1314616843, new i(aiAssistantCardVh, 3), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((rpg) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                oal oalVar = (oal) obj3;
                AppState appState = (AppState) obj2;
                Handler handler = oal.j;
                handler.removeCallbacksAndMessages(oal.l);
                handler.postAtTime(new ic3(oalVar, 5), oal.n, SystemClock.uptimeMillis() + oal.m);
                oalVar.h(appState, oal.d((AppState) obj, appState));
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.vk.donut.design.compose.banner.b.h((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((ets) obj3).h.invoke((UserProfile) obj, (Boolean) obj2);
                break;
            case 6:
                g8u g8uVar = (g8u) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-773912431, intValue2, -1, "com.vk.ecomm.market.good.marketitemreviews.GoodReviewsComposeHolder.setupFeedbackBlock.<anonymous>.<anonymous> (GoodReviewsComposeHolder.kt:303)");
                    }
                    q630 E = ahn.E(txj0.f(q630.a.a, 1.0f), "reviews_info_create_reviews_btn");
                    String N = d370.N(R.string.good_review_item_write_feedback, 0, aVar3);
                    ButtonSize buttonSize = ButtonSize.Medium;
                    ButtonStyle buttonStyle = ButtonStyle.Secondary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean y = aVar3.y(g8uVar);
                    Object x = aVar3.x();
                    if (y || x == c0012a) {
                        x = new g4g(g8uVar, 22);
                        aVar3.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar3, 28080, 0, 0, 4190176);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 7:
                ((f510) obj3).startActivityForResult((Intent) obj, ((Integer) obj2).intValue());
                break;
            case 8:
                ((Ref$BooleanRef) obj3).element = ((MediaFormat) obj2) != null;
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((go20) obj3).g(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 10:
                e670 e670Var2 = (e670) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1982986431, intValue3, -1, "com.vk.profile.core.npo.NonProfitOrganizationBottomSheet.ThemedContent.<anonymous> (NonProfitOrganizationBottomSheet.kt:40)");
                    }
                    aVar4.K(-2126170550);
                    Bundle arguments = e670Var2.getArguments();
                    if (arguments == null || (string = arguments.getString("organization_modal_variant")) == null || (organizationModalVariant = OrganizationModalVariant.valueOf(string)) == null) {
                        organizationModalVariant = OrganizationModalVariant.NON_PROFIT;
                    }
                    boolean y2 = aVar4.y(e670Var2);
                    Object x2 = aVar4.x();
                    if (y2 || x2 == c0012a) {
                        bVar = new e670.b(0, e670Var2, e670.class, "onActionClick", "onActionClick()V", 0);
                        e670Var = e670Var2;
                        aVar4.R(bVar);
                    } else {
                        bVar = x2;
                        e670Var = e670Var2;
                    }
                    gzs gzsVar = (gzs) ((fcy) bVar);
                    boolean y3 = aVar4.y(e670Var);
                    Object x3 = aVar4.x();
                    if (y3 || x3 == c0012a) {
                        e670.c cVar = new e670.c(0, e670Var, e670.class, "dismiss", "dismiss()V", 0);
                        aVar4.R(cVar);
                        x3 = cVar;
                    }
                    g670.a(organizationModalVariant, gzsVar, (gzs) ((fcy) x3), null, aVar4, 0);
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 11:
                c1h c1hVar = (c1h) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-370129303, intValue4, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.GroupDetailsContentHeader.<anonymous>.<anonymous> (SearchCommunitiesOnMapDetailsView.kt:271)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                    }
                    lg90 b = or.b(aVar5, 1833859693, R.drawable.vk_icon_cancel_24, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N2 = d370.N(R.string.cancel, 0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar5.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().c;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar5.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vqv.a(b, N2, null, f870.D(j, ylu0Var2.getIcon().l, c1hVar.k()), aVar5, 8, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 12:
                StickerCatalogRootVh stickerCatalogRootVh = (StickerCatalogRootVh) obj3;
                String str = (String) obj;
                SearchInputMethod searchInputMethod = (SearchInputMethod) obj2;
                if (stickerCatalogRootVh.F.r instanceof vyh0) {
                    stickerCatalogRootVh.x = str;
                    stickerCatalogRootVh.y = null;
                    SearchResultsVh.cb(stickerCatalogRootVh.A, str, null, null, false, searchInputMethod, false, 46);
                }
                break;
            case 13:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                DefaultErrorView defaultErrorView = ((SuggestedPostsFragment) obj3).e0;
                if (defaultErrorView != null) {
                    defaultErrorView.setVisibility(booleanValue ? 0 : 8);
                }
                break;
            default:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-357101162, intValue5, -1, "com.vk.core.compose.modal.VkThemeWithoutOverscroll.<anonymous> (VkThemeWithoutOverscroll.kt:13)");
                    }
                    rvi.a(c490.a.b(null), kai.c(-480467370, new j(jaiVar, 16), aVar6), aVar6, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ h(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
