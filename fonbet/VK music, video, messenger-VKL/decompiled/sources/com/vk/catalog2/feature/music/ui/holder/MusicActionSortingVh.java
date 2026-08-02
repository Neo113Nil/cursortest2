package com.vk.catalog2.feature.music.ui.holder;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.feature.music.holders.MusicActionColorfulVkButtonVh;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.b5a;
import xsna.cfp0;
import xsna.eda;
import xsna.i4a;
import xsna.j5g;
import xsna.x4c;

/* compiled from: MusicActionSortingVh.kt */
/* loaded from: classes16.dex */
public final class MusicActionSortingVh extends MusicActionColorfulVkButtonVh {
    public final eda f;
    public final b5a g;
    public c h;
    public UIBlockActionShowFilters i;
    public final ArrayList j;

    public MusicActionSortingVh(eda edaVar, b5a b5aVar) {
        super(new MusicActionColorfulVkButtonVh.b.C0519b(""), new MusicActionColorfulVkButtonVh.a(R.drawable.vk_icon_dropdown_16, 0, 4));
        this.f = edaVar;
        this.g = b5aVar;
        this.j = new ArrayList();
    }

    @Override // com.vk.catalog2.feature.music.holders.MusicActionColorfulVkButtonVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        c cVar = this.h;
        if (cVar != null) {
            cVar.dispose();
        }
        this.h = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionShowFilters uIBlockActionShowFilters = uIBlock instanceof UIBlockActionShowFilters ? (UIBlockActionShowFilters) uIBlock : null;
        if (uIBlockActionShowFilters == null) {
            return;
        }
        this.i = uIBlockActionShowFilters;
        ArrayList arrayList = this.j;
        arrayList.clear();
        arrayList.addAll(uIBlockActionShowFilters.A);
        b(uIBlockActionShowFilters);
    }

    public final void b(UIBlockActionShowFilters uIBlockActionShowFilters) {
        Object obj;
        String str;
        ArrayList arrayList = this.j;
        CatalogFilterData catalogFilterData = (CatalogFilterData) j5g.a0(arrayList);
        if (catalogFilterData == null || !catalogFilterData.e) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((CatalogFilterData) obj).e) {
                        break;
                    }
                }
            }
            CatalogFilterData catalogFilterData2 = (CatalogFilterData) obj;
            str = catalogFilterData2 != null ? catalogFilterData2.c : null;
        } else {
            str = uIBlockActionShowFilters.B;
        }
        if (str == null) {
            str = "";
        }
        a(new MusicActionColorfulVkButtonVh.b.C0519b(str));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        UIBlockActionShowFilters uIBlockActionShowFilters;
        if (view == null || (context = view.getContext()) == null || (uIBlockActionShowFilters = this.i) == null) {
            return;
        }
        this.g.a(new cfp0(uIBlockActionShowFilters, null));
        i4a.b(context, this.j, null, new x4c(this, uIBlockActionShowFilters, context, 5));
    }
}
