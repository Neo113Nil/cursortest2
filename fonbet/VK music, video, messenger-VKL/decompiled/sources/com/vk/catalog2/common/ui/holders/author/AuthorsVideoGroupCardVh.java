package com.vk.catalog2.common.ui.holders.author;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.c98;
import xsna.cd5;
import xsna.cn70;
import xsna.epx;
import xsna.ob5;
import xsna.q3a;
import xsna.te5;
import xsna.uqm0;
import xsna.vlw;

/* compiled from: AuthorsVideoGroupCardVh.kt */
/* loaded from: classes16.dex */
public final class AuthorsVideoGroupCardVh extends BaseGroupVh {
    public cd5 h;
    public UserId i;

    public AuthorsVideoGroupCardVh(SearchStatInfoProvider searchStatInfoProvider, q3a q3aVar, b5a b5aVar) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        ImageSize Cb;
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockGroup) {
            Group group = ((UIBlockGroup) uIBlock).y;
            boolean f = epx.f(this.i, group.c);
            this.i = group.c;
            if (f) {
                return;
            }
            cd5 cd5Var = this.h;
            if (cd5Var == null) {
                cd5Var = null;
            }
            if (cd5Var == null) {
                cd5Var = null;
            }
            if (cd5Var != null) {
                Image image = group.g;
                if (image == null || (Cb = image.Cb(cn70.b(88), true, true)) == null || (str = Cb.d.d) == null) {
                    str = "";
                }
                cd5Var.setImage(new vlw(str, null));
                cd5Var.setTextContent(new ob5(group.d, group.y.Cb(), 4));
                cd5 cd5Var2 = this.h;
                Context context = (cd5Var2 != null ? cd5Var2 : null).getContext();
                int i = group.v;
                String quantityString = context.getResources().getQuantityString(R.plurals.community_subscribers, i, uqm0.m(i));
                StringBuilder sb = new StringBuilder(quantityString);
                int i2 = -1;
                int length = quantityString.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i3 = length - 1;
                        if (quantityString.charAt(length) == ' ') {
                            i2 = length;
                            break;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            length = i3;
                        }
                    }
                }
                sb.setCharAt(i2, '\n');
                cd5Var.setSubtitle(sb.toString());
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cd5 cd5Var = new cd5(layoutInflater.getContext());
        cd5Var.setOnClickListener(new c98(new te5(0, this, cd5Var), 1));
        this.h = cd5Var;
        return cd5Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
