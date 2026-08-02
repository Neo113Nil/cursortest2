package com.vk.catalog2.common.ui.mvp.holder.group;

import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCategory;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.group.delegate.SimpleGroupItemDelegate;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.group.GroupsCategory;
import com.vk.imageloader.view.VKImageView;
import java.util.ArrayList;
import xsna.b5a;
import xsna.cfp0;
import xsna.cn70;
import xsna.drm0;
import xsna.e43;
import xsna.f4m;
import xsna.j5g;
import xsna.lpg0;
import xsna.nda;
import xsna.q3a;

/* compiled from: CommunitiesCategoryWithCollectionVh.kt */
/* loaded from: classes16.dex */
public final class CommunitiesCategoryWithCollectionVh extends GroupsCollectionVh {
    public final CatalogConfiguration l;
    public final nda m;
    public final com.vk.catalog2.common.ui.mvp.util.a n;
    public final b5a o;
    public final lpg0 p;
    public UIBlockGroupsCategory q;

    public CommunitiesCategoryWithCollectionVh(CatalogConfiguration catalogConfiguration, nda ndaVar, com.vk.catalog2.common.ui.mvp.util.a aVar, b5a b5aVar, lpg0 lpg0Var, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        this.l = catalogConfiguration;
        this.m = ndaVar;
        this.n = aVar;
        this.o = b5aVar;
        this.p = lpg0Var;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.group.GroupsCollectionVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ImageSize Cb;
        if (uIBlock instanceof UIBlockGroupsCategory) {
            UIBlockGroupsCategory uIBlockGroupsCategory = (UIBlockGroupsCategory) uIBlock;
            this.q = uIBlockGroupsCategory;
            GroupsCategory groupsCategory = uIBlockGroupsCategory.y;
            VKImageView vKImageView = this.h;
            if (vKImageView == null) {
                vKImageView = null;
            }
            Image image = groupsCategory.g;
            String str = groupsCategory.d;
            String str2 = groupsCategory.c;
            String str3 = groupsCategory.e;
            int i = 0;
            vKImageView.load((image == null || (Cb = image.Cb(cn70.b(307), true, false)) == null) ? null : Cb.d.d);
            VKImageView vKImageView2 = this.h;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            vKImageView2.setContentDescription(str2 + " " + str + " " + str3);
            TextView textView = this.f;
            if (textView == null) {
                textView = null;
            }
            textView.setText(str2);
            TextView textView2 = this.g;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(str);
            if (drm0.N(str3)) {
                TextView textView3 = this.i;
                if (textView3 == null) {
                    textView3 = null;
                }
                f4m.j(textView3);
            } else {
                TextView textView4 = this.i;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setText(str3);
                TextView textView5 = this.i;
                if (textView5 == null) {
                    textView5 = null;
                }
                textView5.setVisibility(0);
            }
            for (Object obj : j5g.H0(uIBlockGroupsCategory.A, 3)) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                UIBlockGroup uIBlockGroup = (UIBlockGroup) obj;
                ArrayList arrayList = this.j;
                if (arrayList == null) {
                    arrayList = null;
                }
                ((SimpleGroupItemDelegate) arrayList.get(i)).N6(uIBlockGroup);
                i = i2;
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.group.GroupsCollectionVh
    public final void a(View view) {
        UIBlockGroupsCategory uIBlockGroupsCategory = this.q;
        if (uIBlockGroupsCategory == null) {
            return;
        }
        UIBlockAction uIBlockAction = uIBlockGroupsCategory.z;
        if (!(uIBlockAction instanceof UIBlockActionOpenSection)) {
            com.vk.catalog2.common.ui.mvp.util.a.e(this.n, view.getContext(), uIBlockGroupsCategory, uIBlockAction, null, 56);
            return;
        }
        this.o.a(new cfp0(uIBlockAction, null));
        UIBlockActionOpenSection uIBlockActionOpenSection = (UIBlockActionOpenSection) uIBlockAction;
        nda.e(this.m, view.getContext(), this.l, uIBlockActionOpenSection.B, uIBlockActionOpenSection.z, uIBlockActionOpenSection.E, null, this.p, 96);
    }
}
