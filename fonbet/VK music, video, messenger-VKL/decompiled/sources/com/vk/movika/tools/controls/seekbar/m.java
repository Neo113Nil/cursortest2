package com.vk.movika.tools.controls.seekbar;

import android.content.Intent;
import androidx.compose.runtime.a;
import com.vk.auth.ui.carousel.UserCarouselView;
import com.vk.avatarchange.OnboardingType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityPerson;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.profile.design.view.silentmodebanner.SilentModeBannerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a030;
import xsna.a6o0;
import xsna.afe;
import xsna.b6o0;
import xsna.cq;
import xsna.dia0;
import xsna.dxq0;
import xsna.ecm0;
import xsna.ei80;
import xsna.epx;
import xsna.es60;
import xsna.f64;
import xsna.fco0;
import xsna.fkq0;
import xsna.g5c0;
import xsna.g6c0;
import xsna.gzs;
import xsna.hb;
import xsna.hb0;
import xsna.iq5;
import xsna.izs;
import xsna.jai;
import xsna.kai;
import xsna.l6c0;
import xsna.ne7;
import xsna.nn50;
import xsna.om9;
import xsna.p1c0;
import xsna.q2c0;
import xsna.q630;
import xsna.rpo0;
import xsna.rrv0;
import xsna.rui;
import xsna.s3q0;
import xsna.s5c0;
import xsna.t5c0;
import xsna.vxq0;
import xsna.w2c0;
import xsna.wh50;
import xsna.wzd0;
import xsna.wzs;
import xsna.x2c0;
import xsna.x5o0;
import xsna.y5o0;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Pair pair;
        CatalogProfileLocalState.FollowSource followSource;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView defaultSeekBarView = (DefaultSeekBarView) obj3;
                ((Boolean) obj2).booleanValue();
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                defaultSeekBarView.e(defaultSeekBarView.getSeekIsDisabledAlpha(), defaultSeekBarView.getSeekIsEnabledAlpha());
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((xsna.u) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                iq5 iq5Var = (iq5) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(402437945, intValue, -1, "com.vk.avatarchange.AvatarChangePublishFragment.switchWithHighlight.<anonymous>.<anonymous>.<anonymous> (AvatarChangePublishFragment.kt:134)");
                    }
                    boolean booleanValue = ((Boolean) ((zak0) iq5Var.p).getValue()).booleanValue();
                    OnboardingType onboardingType = ((Boolean) ((zak0) iq5Var.q).getValue()).booleanValue() ? OnboardingType.SUBTITLE : OnboardingType.NONE;
                    boolean y = aVar2.y(iq5Var);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new xsna.q(iq5Var, 5);
                        aVar2.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y2 = aVar2.y(iq5Var);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new hb(iq5Var, 8);
                        aVar2.R(x2);
                    }
                    ecm0.a(null, booleanValue, onboardingType, false, false, gzsVar, (izs) x2, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                ((afe) obj3).a.h2((ClipGridParams.Data) obj, (ClipCameraParams) obj2);
                break;
            case 4:
                wzd0 wzd0Var = (wzd0) obj3;
                UIBlock uIBlock = (UIBlock) obj2;
                boolean z = uIBlock instanceof UIBlockGroup;
                if (z) {
                    UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
                    pair = new Pair(uIBlockGroup.y, uIBlockGroup.A);
                } else if (uIBlock instanceof UIBlockMarketGroupInfoItem) {
                    pair = new Pair(((UIBlockMarketGroupInfoItem) uIBlock).z, null);
                } else if (uIBlock instanceof UIBlockSearchAuthor) {
                    UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) uIBlock;
                    pair = new Pair(uIBlockSearchAuthor.y.b(), uIBlockSearchAuthor.C);
                } else {
                    pair = uIBlock instanceof UIBlockSearchEntityPerson ? new Pair(((UIBlockSearchEntityPerson) uIBlock).C.b(), null) : new Pair(null, null);
                }
                Group group = (Group) pair.d();
                CatalogProfileLocalState catalogProfileLocalState = (CatalogProfileLocalState) pair.g();
                if (group != null) {
                    UserId userId = group.c;
                    UserId userId2 = wzd0Var.b;
                    boolean z2 = wzd0Var.c;
                    if (epx.f(userId, fkq0.e(userId2))) {
                        boolean h = (catalogProfileLocalState == null || (followSource = catalogProfileLocalState.b) == null) ? false : followSource.h();
                        if (catalogProfileLocalState != null) {
                            catalogProfileLocalState.b = (z2 && h) ? CatalogProfileLocalState.FollowSource.Internal : z2 ? CatalogProfileLocalState.FollowSource.External : CatalogProfileLocalState.FollowSource.None;
                        }
                        if ((group.C() || group.n()) && z2 && !fkq0.c(group.L)) {
                            group.j = false;
                            group.C = 4;
                        } else {
                            group.j = z2;
                            group.C = z2 ? 1 : -1;
                        }
                        UIBlockGroup uIBlockGroup2 = z ? (UIBlockGroup) uIBlock : null;
                        if (uIBlockGroup2 != null) {
                            uIBlockGroup2.B = true;
                        }
                    }
                }
                break;
            case 5:
                CommunityStaticCover communityStaticCover = (CommunityStaticCover) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = CommunityStaticCover.g;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1809935319, intValue2, -1, "com.vk.community.design.view.cover.CommunityStaticCover.<anonymous> (CommunityStaticCover.kt:86)");
                    }
                    rrv0.d(null, null, null, null, kai.c(608657316, new om9(communityStaticCover, 3), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 6:
                break;
            case 7:
                ((Integer) obj2).getClass();
                a030.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ei80.c((wh50) obj3, (androidx.compose.runtime.a) obj, ne7.I(55));
                break;
            case 9:
                ((Integer) obj).getClass();
                Intent intent = (Intent) obj2;
                intent.putExtra("gallery_picker_source_configuration", new GalleryPickerSourceConfiguration(false, false, null, false, false, true, false, false, null, 479, null));
                hb0<Intent> hb0Var = ((dia0) obj3).c;
                if (hb0Var != null) {
                    hb0Var.a(intent);
                }
                break;
            case 10:
                com.vk.music.player.playback.c cVar = (com.vk.music.player.playback.c) obj3;
                int intValue3 = ((Integer) obj).intValue();
                int intValue4 = ((Integer) obj2).intValue();
                ArrayList arrayList = new ArrayList(cVar.n);
                Collections.swap(arrayList, intValue3, intValue4);
                cVar.n = arrayList;
                cVar.c.b(arrayList);
                break;
            case 11:
                s5c0 s5c0Var = (s5c0) obj3;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                fco0 fco0Var = new fco0();
                es60 es60Var = s5c0Var.k;
                final f64 a = ruiVar.a(new l6c0(s5c0Var, fco0Var, es60Var.k, nn50Var));
                g5c0 g5c0Var = s5c0Var.j;
                final f64 a2 = ruiVar.a(new x5o0(es60Var, g5c0Var, nn50Var));
                final f64 a3 = ruiVar.a(new x2c0(es60Var, g5c0Var, nn50Var));
                final f64 a4 = ruiVar.a(new g6c0(es60Var, g5c0Var, nn50Var));
                final f64 a5 = ruiVar.a(new y5o0(es60Var, g5c0Var, nn50Var));
                final f64 a6 = ruiVar.a(new b6o0(es60Var, g5c0Var, nn50Var));
                final f64 a7 = ruiVar.a(new w2c0(es60Var, g5c0Var, nn50Var));
                final f64 a8 = ruiVar.a(new a6o0(es60Var, g5c0Var, nn50Var));
                final f64 a9 = ruiVar.a(new q2c0(es60Var, nn50Var));
                final f64 a10 = ruiVar.a(new p1c0(es60Var, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.q5c0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        qk50 qk50Var = (qk50) obj4;
                        t5c0 t5c0Var = (t5c0) obj5;
                        if (t5c0Var instanceof t5c0.d) {
                            return qk50Var.a(f64.this, t5c0Var);
                        }
                        if (t5c0Var instanceof v5c0) {
                            return qk50Var.a(a2, t5c0Var);
                        }
                        if (t5c0Var instanceof x5c0) {
                            return qk50Var.a(a4, t5c0Var);
                        }
                        if (t5c0Var instanceof u5c0) {
                            return qk50Var.a(a3, t5c0Var);
                        }
                        if (t5c0Var instanceof w5c0) {
                            return qk50Var.a(a5, t5c0Var);
                        }
                        if (t5c0Var instanceof y5c0) {
                            return qk50Var.a(a6, t5c0Var);
                        }
                        if (t5c0Var instanceof t5c0.c) {
                            return qk50Var.a(a7, t5c0Var);
                        }
                        if (t5c0Var instanceof z5c0) {
                            return qk50Var.a(a8, t5c0Var);
                        }
                        if (t5c0Var instanceof t5c0.b) {
                            return qk50Var.a(a9, t5c0Var);
                        }
                        if (t5c0Var instanceof t5c0.a) {
                            return qk50Var.a(a10, t5c0Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                break;
            case 12:
                ((Integer) obj2).getClass();
                int i3 = SilentModeBannerView.o;
                ((SilentModeBannerView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int i4 = rpo0.l;
                ((rpo0) obj3).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 14:
                Integer num = (Integer) obj2;
                num.getClass();
                int i5 = UserCarouselView.d;
                ((w) obj3).invoke((List) obj, num);
                break;
            case 15:
                ((vxq0) obj3).j.x6(new dxq0.a.h(((Integer) obj2).intValue()));
                break;
            default:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-496971724, intValue5, -1, "com.vk.core.compose.modal.VkThemeWithoutOverscroll.<anonymous>.<anonymous> (VkThemeWithoutOverscroll.kt:27)");
                    }
                    if (cq.i(0, aVar4, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ m(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
