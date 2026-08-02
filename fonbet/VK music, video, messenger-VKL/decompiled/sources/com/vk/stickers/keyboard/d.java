package com.vk.stickers.keyboard;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerPackPreviewModel;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.movika.tools.controls.seekbar.v;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.CommonVasStat$TypeDisplayLocationContext;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.t0;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import xsna.asu0;
import xsna.b6m;
import xsna.be50;
import xsna.cqt;
import xsna.cvk;
import xsna.dh40;
import xsna.g2v;
import xsna.gq;
import xsna.hg1;
import xsna.hj60;
import xsna.hu50;
import xsna.hzp0;
import xsna.kcl0;
import xsna.ku1;
import xsna.kwg0;
import xsna.lal0;
import xsna.lhg;
import xsna.n1l0;
import xsna.o25;
import xsna.o83;
import xsna.ri0;
import xsna.rsg0;
import xsna.sil0;
import xsna.y4l0;
import xsna.y8w0;
import xsna.zal0;

/* compiled from: StickersView.kt */
/* loaded from: classes6.dex */
public final class d implements y4l0 {
    public final /* synthetic */ StickersView a;

    public d(StickersView stickersView) {
        this.a = stickersView;
    }

    @Override // xsna.y4l0
    public final void a(int i) {
        this.a.D.n(i);
    }

    @Override // xsna.y4l0
    public final void b(UGCStickerModel uGCStickerModel) {
        this.a.D.q(uGCStickerModel);
    }

    @Override // xsna.y4l0
    public final void c() {
        lal0.a.a(this.a.getContext(), R.string.stickers_ugc_info_title, R.string.stickers_ugc_info_subtitle, R.drawable.vk_icon_ugc_chat_sticker_outline_56);
    }

    @Override // xsna.y4l0
    public final void d() {
        StickersView stickersView = this.a;
        UserId userId = (UserId) stickersView.J.invoke();
        if (userId == null) {
            return;
        }
        Long c = stickersView.D.c();
        Long d = stickersView.D.d();
        long longValue = c != null ? c.longValue() : d != null ? d.longValue() : userId.b;
        StringBuilder sb = new StringBuilder("#peer_id=");
        sb.append(longValue);
        String concat = "&ref=".concat("keyboard");
        if (concat == null) {
            concat = "";
        }
        sb.append(concat);
        g2v.d().a().F(stickersView.getContext(), sb.toString());
    }

    @Override // xsna.y4l0
    public final void e(n1l0 n1l0Var, StickerStockItem stickerStockItem, boolean z, String str) {
        Object obj;
        StickersView stickersView = this.a;
        kcl0 kcl0Var = stickersView.g;
        if (n1l0Var instanceof UGCStickerModel) {
            b((UGCStickerModel) n1l0Var);
            return;
        }
        if (z) {
            StickersView.c(stickersView, (int) n1l0Var.getProductId(), str);
            return;
        }
        int o2 = n1l0Var.o2();
        if (stickerStockItem == null) {
            stickerStockItem = kcl0Var.H(o2);
        }
        if (stickerStockItem == null) {
            kcl0Var.A();
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(lhg.a(o2, "Can't find sticker pack for sticker id = ")));
            return;
        }
        int i = stickerStockItem.b;
        if (stickerStockItem.h) {
            Iterator<T> it = stickerStockItem.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((StickerItem) obj).b == o2) {
                        break;
                    }
                }
            }
            StickerItem stickerItem = (StickerItem) obj;
            if (stickerItem != null ? stickerItem.h : false) {
                StickerItem Db = stickerStockItem.Db(o2);
                kcl0Var.a0(Db);
                stickersView.D.p(Db, i, str);
                return;
            }
        }
        stickerStockItem.O = str;
        StickersView.c(stickersView, i, str);
    }

    @Override // xsna.y4l0
    public final void f(StickerPackPreviewModel stickerPackPreviewModel) {
        StickersView stickersView = this.a;
        if (!stickersView.d) {
            cvk.u(R.string.not_allowed_to_open_stickers_store, false);
            return;
        }
        StickersView.e(stickersView, stickerPackPreviewModel.e(), true);
        stickersView.M.b(rsg0.T(new sil0(Collections.singletonList(Integer.valueOf(stickerPackPreviewModel.e())), null)).a0(asu0.a.d()).subscribe(new be50(new ku1(26, stickersView, stickerPackPreviewModel), 15), new dh40(new ri0(29, stickersView, stickerPackPreviewModel), 17)));
    }

    @Override // xsna.y4l0
    public final void g(VmojiConstructorOpenParamsModel vmojiConstructorOpenParamsModel, StickerStockItem stickerStockItem) {
        if ((stickerStockItem != null ? stickerStockItem.H : null) == null) {
            return;
        }
        y8w0 y8w0Var = new y8w0(0);
        y8w0Var.a = stickerStockItem.H.Ab();
        y8w0Var.b = vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.v0() : null;
        y8w0Var.c = vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.zb() : null;
        y8w0Var.d = vmojiConstructorOpenParamsModel != null ? vmojiConstructorOpenParamsModel.Ab() : null;
        b6m.e().b(this.a.getContext(), "keyboard_create", y8w0Var.a());
    }

    @Override // xsna.y4l0
    public final void h(int i, String str) {
        StickersView.c(this.a, i, str);
    }

    @Override // xsna.y4l0
    public final void i(Integer num, StickerStockItem stickerStockItem, String str) {
        StickersView stickersView = this.a;
        kcl0 kcl0Var = stickersView.g;
        if (stickerStockItem == null && num != null) {
            stickerStockItem = kcl0Var.H(num.intValue());
        }
        StickerStockItem stickerStockItem2 = stickerStockItem;
        if (stickerStockItem2 == null) {
            kcl0Var.A();
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(gq.d(num, "Can't find sticker pack for sticker id = ")));
            return;
        }
        ArrayList arrayList = new ArrayList(stickersView.D.h());
        ContextUser contextUser = stickersView.I;
        if (contextUser != null && contextUser.zb(stickerStockItem2)) {
            arrayList.remove(contextUser.b);
        }
        if (stickerStockItem2.i && !stickerStockItem2.Bb() && stickerStockItem2.Ib()) {
            stickersView.M.b(hg1.m(rsg0.y0(new cqt(stickerStockItem2.b), null, null, 3), stickersView.getContext(), 0L, false, 62).subscribe(new hu50(new o83(stickersView, arrayList, str, 8), 18), kwg0.b()));
        } else if (!stickersView.d) {
            cvk.u(R.string.not_allowed_to_open_stickers_store, false);
        } else {
            stickerStockItem2.O = str;
            zal0.m(g2v.d().a(), stickersView.getContext(), stickerStockItem2, stickersView.i(), stickersView.I, 32);
        }
    }

    @Override // xsna.y4l0
    public final void j(StickerStockItem stickerStockItem) {
        StickersView stickersView = this.a;
        if (!stickersView.d) {
            cvk.u(R.string.not_allowed_to_open_stickers_store, false);
        } else {
            stickerStockItem.O = "keyboard";
            stickersView.j.H7(stickerStockItem, new v(stickersView, 15));
        }
    }

    @Override // xsna.y4l0
    public final void k(StickerStockItem stickerStockItem) {
        if (stickerStockItem == null) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        String str = UiTracker.d().equals(t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY)) ? "story_answer_style_selector" : "keyboard_style_selector";
        zal0 a = g2v.d().a();
        StickersView stickersView = this.a;
        zal0.z(a, stickersView.getContext(), stickerStockItem, stickersView.i(), stickersView.I, str, null, new hj60(stickersView, 28), 32);
    }

    @Override // xsna.y4l0
    public final void l(int i) {
        StickersView stickersView = this.a;
        com.vk.stickers.keyboard.navigation.a aVar = stickersView.v;
        com.vk.stickers.keyboard.navigation.a.O0(aVar, i);
        if (stickersView.l.getCurrentItem() == stickersView.m.getItemPosition(stickersView.w)) {
            aVar.N0();
        }
    }

    @Override // xsna.y4l0
    public final void m(String str) {
        this.a.h(str);
    }

    @Override // xsna.y4l0
    public final void n(n1l0 n1l0Var) {
        kcl0 kcl0Var = this.a.g;
        if (n1l0Var instanceof StickerItem) {
            if (kcl0Var.c0().contains(n1l0Var)) {
                kcl0Var.n0((StickerItem) n1l0Var);
            } else {
                kcl0Var.y0((StickerItem) n1l0Var);
            }
        }
    }

    @Override // xsna.y4l0
    public final void o(int i, boolean z, Integer num) {
        CommonVasStat$TypeDisplayLocationContext commonVasStat$TypeDisplayLocationContext;
        CommonVasStat$TypeDisplayLocationContext commonVasStat$TypeDisplayLocationContext2;
        CommonVasStat$TypeDisplayLocationContext commonVasStat$TypeDisplayLocationContext3;
        UserId userId;
        StickersView stickersView = this.a;
        ContextUser contextUser = stickersView.I;
        Long l = null;
        if (contextUser == null) {
            contextUser = stickersView.D.e();
            if (contextUser != null) {
                stickersView.I = contextUser;
            } else {
                contextUser = null;
            }
        }
        long j = o25.a().c().b;
        b bVar = stickersView.L;
        if (!(bVar instanceof b.c.a)) {
            if (bVar instanceof b.d.a) {
                UserId userId2 = ((b.d.a) bVar).a;
                commonVasStat$TypeDisplayLocationContext2 = new CommonVasStat$TypeDisplayLocationContext(userId2 != null ? Long.valueOf(userId2.b) : null, null, 2, null);
            } else if (bVar instanceof b.d.C1800b) {
                UserId userId3 = ((b.d.C1800b) bVar).a;
                commonVasStat$TypeDisplayLocationContext2 = new CommonVasStat$TypeDisplayLocationContext(userId3 != null ? Long.valueOf(userId3.b) : null, null, 2, null);
            } else {
                commonVasStat$TypeDisplayLocationContext = new CommonVasStat$TypeDisplayLocationContext(null, null, 3, null);
            }
            commonVasStat$TypeDisplayLocationContext3 = commonVasStat$TypeDisplayLocationContext2;
            if (contextUser != null && (userId = contextUser.b) != null) {
                l = Long.valueOf(userId.b);
            }
            new hzp0.w(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null), new CommonVasStat$TypeIvasItemViews(CommonVasStat$TypeIvasItemViews.ItemType.STICKER_PACK, Collections.singletonList(Integer.valueOf(i)), null, CommonVasStat$TypeIvasItemViews.BlockType.KEYBOARD, commonVasStat$TypeDisplayLocationContext3, num, new CommonStat$TypeTrackCodeItem("recommendation_keyboard"), 2, l, Boolean.valueOf(z), null, null, 3076, null)).a();
        }
        UserId userId4 = ((b.c.a) bVar).a;
        Long valueOf = userId4 != null ? Long.valueOf(userId4.b) : null;
        commonVasStat$TypeDisplayLocationContext = ((bVar instanceof b.c.a.C1798c) && valueOf != null && valueOf.longValue() == j) ? new CommonVasStat$TypeDisplayLocationContext(Long.valueOf(j), null, 2, null) : new CommonVasStat$TypeDisplayLocationContext(valueOf, null, 2, null);
        commonVasStat$TypeDisplayLocationContext3 = commonVasStat$TypeDisplayLocationContext;
        if (contextUser != null) {
            l = Long.valueOf(userId.b);
        }
        new hzp0.w(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null), new CommonVasStat$TypeIvasItemViews(CommonVasStat$TypeIvasItemViews.ItemType.STICKER_PACK, Collections.singletonList(Integer.valueOf(i)), null, CommonVasStat$TypeIvasItemViews.BlockType.KEYBOARD, commonVasStat$TypeDisplayLocationContext3, num, new CommonStat$TypeTrackCodeItem("recommendation_keyboard"), 2, l, Boolean.valueOf(z), null, null, 3076, null)).a();
    }

    @Override // xsna.y4l0
    public final void p(StickerStockItem stickerStockItem) {
        VmojiAvatar vmojiAvatar;
        if (stickerStockItem == null || (vmojiAvatar = stickerStockItem.H) == null) {
            return;
        }
        b6m.e().c(this.a.i, vmojiAvatar);
    }

    @Override // xsna.y4l0
    public final void q(long j, UserId userId) {
        g2v.d().v().b(this.a.getContext(), userId, j);
    }
}
