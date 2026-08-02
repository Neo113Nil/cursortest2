package com.vk.stickers.autosuggest;

import android.content.Context;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStickersStat$TypeStickersClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vk.stickers.keyboard.StickersView;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bjc;
import xsna.c5l0;
import xsna.epx;
import xsna.f600;
import xsna.hd;
import xsna.jk5;
import xsna.kcl0;
import xsna.lhg;
import xsna.n1l0;
import xsna.uj5;
import xsna.uzp0;
import xsna.z2n0;

/* compiled from: SuggestWindowMenuListener.kt */
/* loaded from: classes5.dex */
public final class b implements f600 {
    public final Context b;
    public final c5l0 c;
    public final StickersView.c d;
    public final kcl0 e;
    public final z2n0 f;
    public final hd g;
    public final jk5 h;

    public b(Context context, c5l0 c5l0Var, StickersView.c cVar, kcl0 kcl0Var, uj5 uj5Var, hd hdVar, jk5 jk5Var) {
        this.b = context;
        this.c = c5l0Var;
        this.d = cVar;
        this.e = kcl0Var;
        this.f = uj5Var;
        this.g = hdVar;
        this.h = jk5Var;
    }

    @Override // xsna.f600
    public final void a(n1l0 n1l0Var) {
        this.c.a(true);
        int o2 = n1l0Var.o2();
        StickersDictionaryItem stickersDictionaryItem = ((AutoSuggestStickersPopupWindow) this.g.c).r;
        StickerItem zb = stickersDictionaryItem != null ? stickersDictionaryItem.zb(o2) : null;
        if (zb == null) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(lhg.a(o2, "Can't find sticker sticker item for sticker id = ")));
            return;
        }
        boolean z = false;
        if (stickersDictionaryItem != null && stickersDictionaryItem.Ab(o2)) {
            z = true;
        }
        this.f.p(zb, !z, this.b);
    }

    @Override // xsna.f600
    public final void b() {
        this.c.a(true);
    }

    @Override // xsna.f600
    public final void c(int i) {
        this.c.a(true);
        StickersDictionaryItem stickersDictionaryItem = ((AutoSuggestStickersPopupWindow) this.g.c).r;
        StickerItem zb = stickersDictionaryItem != null ? stickersDictionaryItem.zb(i) : null;
        if (zb != null) {
            this.f.L(zb);
        } else {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(lhg.a(i, "Can't find sticker sticker item for sticker id = ")));
        }
    }

    @Override // xsna.f600
    public final void d(n1l0 n1l0Var) {
        if (n1l0Var instanceof StickerItem) {
            this.c.a(true);
            StickerItem stickerItem = (StickerItem) n1l0Var;
            int i = stickerItem.b;
            kcl0 kcl0Var = this.e;
            if (kcl0Var.W0(i)) {
                kcl0Var.n0(stickerItem);
            } else {
                kcl0Var.y0(stickerItem);
            }
        }
    }

    @Override // xsna.f600
    public final void e(n1l0 n1l0Var) {
        Object obj;
        MobileOfficialAppsStickersStat$TypeStickersClickItem.ClickType clickType;
        StickerItem zb;
        if (n1l0Var instanceof StickerItem) {
            StickersDictionaryItem stickersDictionaryItem = ((AutoSuggestStickersPopupWindow) this.g.c).r;
            int i = ((StickerItem) n1l0Var).b;
            StickerStockItem x = this.e.x(i);
            Context context = this.b;
            z2n0 z2n0Var = this.f;
            if (x == null) {
                if (stickersDictionaryItem == null || (zb = stickersDictionaryItem.zb(i)) == null) {
                    return;
                }
                z2n0Var.p(zb, !stickersDictionaryItem.Ab(i), context);
                return;
            }
            int i2 = x.b;
            Iterator<T> it = z2n0Var.getItems().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                AutoSuggestStickersPopupWindow.b bVar = (AutoSuggestStickersPopupWindow.b) obj;
                if (bVar instanceof AutoSuggestStickersPopupWindow.b.d ? epx.f(((AutoSuggestStickersPopupWindow.b.d) bVar).a, n1l0Var) : false) {
                    break;
                }
            }
            AutoSuggestStickersPopupWindow.b bVar2 = (AutoSuggestStickersPopupWindow.b) obj;
            if (x.k) {
                clickType = MobileOfficialAppsStickersStat$TypeStickersClickItem.ClickType.KEYBOARD_LONG_TAP;
                this.d.n(i2);
            } else {
                clickType = MobileOfficialAppsStickersStat$TypeStickersClickItem.ClickType.LAYER_LONG_TAP;
                this.h.invoke(Integer.valueOf(i2), context);
            }
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsStickersStat$TypeStickersClickItem(clickType, ((ArrayList) z2n0Var.getItems()).indexOf(bVar2)), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
            this.c.a(true);
        }
    }
}
