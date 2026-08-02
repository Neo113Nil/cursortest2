package com.vk.stickers.keyboard.page;

import android.content.Context;
import android.util.SparseIntArray;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerPackPreviewModel;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.agy;
import xsna.aj50;
import xsna.arb0;
import xsna.bl30;
import xsna.chy;
import xsna.dgh0;
import xsna.dhy;
import xsna.e27;
import xsna.e43;
import xsna.ghy;
import xsna.gzs;
import xsna.hfz;
import xsna.hhy;
import xsna.l7v;
import xsna.lhy;
import xsna.ofy;
import xsna.pal0;
import xsna.per;
import xsna.pf40;
import xsna.pf6;
import xsna.pla;
import xsna.qgy;
import xsna.r820;
import xsna.r8a0;
import xsna.rf6;
import xsna.rxz;
import xsna.sfy;
import xsna.skj0;
import xsna.so40;
import xsna.svk0;
import xsna.u0d;
import xsna.u4q0;
import xsna.ufy;
import xsna.ut30;
import xsna.vic;
import xsna.vv20;
import xsna.wfy;
import xsna.y4l0;
import xsna.yfy;
import xsna.yse0;
import xsna.zik0;

/* compiled from: StickersKeyboardAdapter.kt */
/* loaded from: classes6.dex */
public final class a extends pf6<rf6> implements vic, dgh0, StickersRecyclerView.a {
    public final Context i;
    public final boolean j;
    public final e27 k;
    public final u0d l;
    public y4l0 m;
    public int o;
    public int p;
    public ContextUser q;
    public vv20 s;
    public ArrayList u;
    public final boolean n = yse0.c.a();
    public final so40 r = new so40(this, 23);
    public gzs<UserId> t = pal0.b;
    public final SparseIntArray v = new SparseIntArray();

    public a(Context context, boolean z, e27 e27Var, u0d u0dVar) {
        this.i = context;
        this.j = z;
        this.k = e27Var;
        this.l = u0dVar;
        x0(hhy.class, new bl30(this, 21));
        x0(ghy.class, new aj50(this, 27));
        x0(chy.class, new arb0(this, 19));
        x0(sfy.class, new skj0(this, 2));
        x0(agy.class, new r8a0(this, 25));
        x0(yfy.class, new ut30(this, 19));
        x0(ofy.class, new svk0(this, 1));
        x0(qgy.class, new per(27));
        x0(lhy.class, new r820(this, 28));
        x0(wfy.class, new rxz(this, 28));
        x0(ufy.class, new pf40(this, 24));
    }

    public static hhy N0() {
        Map<String, String> map;
        Map<String, String> map2;
        l7v b = pla.e().b();
        HintId hintId = HintId.VMOJI_KEYBOARD_AVATAR_SUGGESTION;
        if (b.m(hintId)) {
            Hint p = pla.e().b().p(hintId.getId());
            String str = (p == null || (map2 = p.e) == null) ? null : map2.get("image_light");
            String str2 = (p == null || (map = p.e) == null) ? null : map.get("image_dark");
            if (str != null || str2 != null) {
                return new hhy(p.c, p.d, str, str2);
            }
        }
        return null;
    }

    public static boolean P0(hfz hfzVar) {
        return (hfzVar instanceof sfy) || (hfzVar instanceof hhy) || (hfzVar instanceof ofy) || (hfzVar instanceof agy) || (hfzVar instanceof yfy) || (hfzVar instanceof wfy) || (hfzVar instanceof ufy);
    }

    public final dhy L0(StickerItem stickerItem, int i, StickerStockItem stickerStockItem, String str) {
        return (stickerItem.g.V0() && this.j && this.n) ? new chy(stickerItem, i, stickerStockItem, str) : new ghy(stickerItem, i, stickerStockItem, str);
    }

    public final int O0(int i) {
        int i2 = 0;
        for (hfz hfzVar : this.h) {
            if (hfzVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.vk.stickers.keyboard.page.BaseKeyboardItem");
            }
            rf6 rf6Var = (rf6) hfzVar;
            if ((i == -1 && rf6Var.a() == -1) || (((rf6Var instanceof sfy) && ((sfy) rf6Var).c == i) || (((rf6Var instanceof ofy) && ((ofy) rf6Var).b.b == i) || (((rf6Var instanceof agy) && ((agy) rf6Var).c == i) || ((rf6Var instanceof wfy) && ((wfy) rf6Var).b.e() == i))))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final void Q0(List list, ArrayList arrayList, List list2) {
        int size = arrayList.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StickerPackPreviewModel stickerPackPreviewModel = (StickerPackPreviewModel) it.next();
            List<StickerItem> g = stickerPackPreviewModel.g();
            List<StickerItem> list3 = g;
            if (list3 != null && !list3.isEmpty()) {
                List list4 = list2;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        if (((StickerStockItem) it2.next()).b == stickerPackPreviewModel.e()) {
                            break;
                        }
                    }
                }
                arrayList.add(new wfy(stickerPackPreviewModel, stickerPackPreviewModel.h(), stickerPackPreviewModel.e(), false, "recommendation_pack_details"));
                Iterator<StickerItem> it3 = g.iterator();
                while (it3.hasNext()) {
                    dhy L0 = L0(it3.next(), stickerPackPreviewModel.e(), null, "recommendation_pack_details");
                    L0.c = true;
                    arrayList.add(L0);
                }
            }
        }
        if (arrayList.size() > size) {
            arrayList.add(new ufy("recommendation_store"));
        }
    }

    public final void R0() {
        ArrayList arrayList = new ArrayList();
        SparseIntArray sparseIntArray = this.v;
        sparseIntArray.clear();
        int i = 0;
        boolean z = N0() != null;
        for (Object obj : this.h) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            hfz hfzVar = (hfz) obj;
            if (hfzVar instanceof dhy) {
                dhy dhyVar = (dhy) hfzVar;
                if (!dhyVar.c) {
                    if (z) {
                        i = i2;
                    }
                    int size = arrayList.size();
                    u4q0 u4q0Var = zik0.a;
                    sparseIntArray.put(i, size);
                    arrayList.add(dhyVar.b());
                }
            }
            i = i2;
        }
        this.u = arrayList;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        this.u = null;
        this.v.clear();
    }

    @Override // com.vk.stickers.keyboard.page.StickersRecyclerView.a
    public final boolean i(int i) {
        if (i >= this.h.size()) {
            return false;
        }
        hfz hfzVar = this.h.get(i);
        return P0(hfzVar) || (hfzVar instanceof qgy);
    }

    @Override // xsna.dgh0
    public final int j0(float f) {
        int min = Math.min((int) (getItemCount() * f), getItemCount() - 1);
        if (min == 0) {
            return 0;
        }
        for (int i = min; -1 < i; i--) {
            if (i(i)) {
                return i;
            }
        }
        return min;
    }
}
