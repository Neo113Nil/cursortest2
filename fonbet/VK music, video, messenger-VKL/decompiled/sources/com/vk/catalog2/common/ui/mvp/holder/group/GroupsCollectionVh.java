package com.vk.catalog2.common.ui.mvp.holder.group;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCollection;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.GroupsCollectionLayout;
import com.vk.catalog2.common.ui.mvp.holder.group.delegate.SimpleGroupItemDelegate;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.awt0;
import xsna.b5a;
import xsna.bt1;
import xsna.c5g;
import xsna.c98;
import xsna.cn70;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.e43;
import xsna.f4m;
import xsna.fnj;
import xsna.iah0;
import xsna.j5g;
import xsna.q3a;
import xsna.s01;
import xsna.s0w0;
import xsna.xwk;

/* compiled from: GroupsCollectionVh.kt */
/* loaded from: classes16.dex */
public class GroupsCollectionVh implements CatalogViewHolder {
    public final b5a b;
    public final q3a c;
    public final SearchStatInfoProvider d;
    public GroupsCollectionLayout e;
    public TextView f;
    public TextView g;
    public VKImageView h;
    public TextView i;
    public ArrayList j;
    public UIBlockGroupsCollection k;

    public GroupsCollectionVh(SearchStatInfoProvider searchStatInfoProvider, q3a q3aVar, b5a b5aVar) {
        this.b = b5aVar;
        this.c = q3aVar;
        this.d = searchStatInfoProvider;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            arrayList = null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SimpleGroupItemDelegate) it.next()).L();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r9.isEmpty() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0176 A[LOOP:3: B:109:0x0170->B:111:0x0176, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0141  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N6(UIBlock uIBlock) {
        ImageSize Cb;
        VKImageView vKImageView;
        TextView textView;
        TextView textView2;
        ArrayList arrayList;
        Iterator it;
        String str;
        if (!(uIBlock instanceof UIBlockGroupsCollection)) {
            return;
        }
        UIBlockGroupsCollection uIBlockGroupsCollection = (UIBlockGroupsCollection) uIBlock;
        this.k = uIBlockGroupsCollection;
        GroupsCollectionLayout groupsCollectionLayout = this.e;
        if (groupsCollectionLayout == null) {
            groupsCollectionLayout = null;
        }
        int i = uIBlockGroupsCollection.H;
        String str2 = uIBlockGroupsCollection.G;
        String str3 = uIBlockGroupsCollection.B;
        String str4 = uIBlockGroupsCollection.z;
        Image image = uIBlockGroupsCollection.E;
        List<UIBlockGroup> list = uIBlockGroupsCollection.F;
        groupsCollectionLayout.setTotalItemsCount(i);
        if (1 <= i && i < 3) {
            ArrayList arrayList2 = image != null ? image.b : null;
            if (arrayList2 != null) {
            }
        }
        image = uIBlockGroupsCollection.D;
        if (i != 1) {
            GroupsCollectionLayout groupsCollectionLayout2 = this.e;
            if (groupsCollectionLayout2 == null) {
                groupsCollectionLayout2 = null;
            }
            Context context = groupsCollectionLayout2.getContext();
            HashSet hashSet = iah0.a;
            if (!fnj.d(context)) {
                VKImageView vKImageView2 = this.h;
                VKImageView vKImageView3 = vKImageView2 != null ? vKImageView2 : null;
                if (image != null) {
                    if (vKImageView2 == null) {
                        vKImageView2 = null;
                    }
                    ImageSize Cb2 = image.Cb(e3m.a(R.dimen.catalog_event_cover_width, vKImageView2.getContext()), true, false);
                    if (Cb2 != null) {
                        str = Cb2.d.d;
                        vKImageView3.load(str);
                        vKImageView = this.h;
                        if (vKImageView == null) {
                            vKImageView = null;
                        }
                        vKImageView.setContentDescription(str4 + " " + str3);
                        textView = this.f;
                        if (textView == null) {
                            textView = null;
                        }
                        textView.setText(str4);
                        textView2 = this.g;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        textView2.setText(str3);
                        if (i == 1) {
                            GroupsCollectionLayout groupsCollectionLayout3 = this.e;
                            if (groupsCollectionLayout3 == null) {
                                groupsCollectionLayout3 = null;
                            }
                            Context context2 = groupsCollectionLayout3.getContext();
                            HashSet hashSet2 = iah0.a;
                            if (fnj.d(context2) && list.size() >= 6) {
                                int i2 = 0;
                                for (Object obj : j5g.H0(list, 6)) {
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        e43.t();
                                        throw null;
                                    }
                                    UIBlockGroup uIBlockGroup = (UIBlockGroup) obj;
                                    ArrayList arrayList3 = this.j;
                                    if (arrayList3 == null) {
                                        arrayList3 = null;
                                    }
                                    ((SimpleGroupItemDelegate) arrayList3.get(i2)).N6(uIBlockGroup);
                                    i2 = i3;
                                }
                                ArrayList arrayList4 = this.j;
                                if (arrayList4 == null) {
                                    arrayList4 = null;
                                }
                                Iterator it2 = j5g.I0(3, arrayList4).iterator();
                                while (it2.hasNext()) {
                                    awt0.v(((SimpleGroupItemDelegate) it2.next()).h, true);
                                }
                                if (!drm0.N(str2)) {
                                    TextView textView3 = this.i;
                                    f4m.j(textView3 != null ? textView3 : null);
                                    return;
                                }
                                TextView textView4 = this.i;
                                if (textView4 == null) {
                                    textView4 = null;
                                }
                                textView4.setText(str2);
                                TextView textView5 = this.i;
                                (textView5 != null ? textView5 : null).setVisibility(0);
                                return;
                            }
                        }
                        int i4 = 0;
                        for (Object obj2 : j5g.H0(list, 3)) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                e43.t();
                                throw null;
                            }
                            UIBlockGroup uIBlockGroup2 = (UIBlockGroup) obj2;
                            ArrayList arrayList5 = this.j;
                            if (arrayList5 == null) {
                                arrayList5 = null;
                            }
                            ((SimpleGroupItemDelegate) arrayList5.get(i4)).N6(uIBlockGroup2);
                            i4 = i5;
                        }
                        arrayList = this.j;
                        if (arrayList == null) {
                            arrayList = null;
                        }
                        it = j5g.I0(3, arrayList).iterator();
                        while (it.hasNext()) {
                            awt0.v(((SimpleGroupItemDelegate) it.next()).h, false);
                        }
                        if (!drm0.N(str2)) {
                        }
                    }
                }
                str = null;
                vKImageView3.load(str);
                vKImageView = this.h;
                if (vKImageView == null) {
                }
                vKImageView.setContentDescription(str4 + " " + str3);
                textView = this.f;
                if (textView == null) {
                }
                textView.setText(str4);
                textView2 = this.g;
                if (textView2 == null) {
                }
                textView2.setText(str3);
                if (i == 1) {
                }
                int i42 = 0;
                while (r2.hasNext()) {
                }
                arrayList = this.j;
                if (arrayList == null) {
                }
                it = j5g.I0(3, arrayList).iterator();
                while (it.hasNext()) {
                }
                if (!drm0.N(str2)) {
                }
            }
        }
        VKImageView vKImageView4 = this.h;
        if (vKImageView4 == null) {
            vKImageView4 = null;
        }
        vKImageView4.load((image == null || (Cb = image.Cb(iah0.f().widthPixels, true, false)) == null) ? null : Cb.d.d);
        vKImageView = this.h;
        if (vKImageView == null) {
        }
        vKImageView.setContentDescription(str4 + " " + str3);
        textView = this.f;
        if (textView == null) {
        }
        textView.setText(str4);
        textView2 = this.g;
        if (textView2 == null) {
        }
        textView2.setText(str3);
        if (i == 1) {
        }
        int i422 = 0;
        while (r2.hasNext()) {
        }
        arrayList = this.j;
        if (arrayList == null) {
        }
        it = j5g.I0(3, arrayList).iterator();
        while (it.hasNext()) {
        }
        if (!drm0.N(str2)) {
        }
    }

    public void a(View view) {
        UIBlockGroupsCollection uIBlockGroupsCollection = this.k;
        if (uIBlockGroupsCollection == null) {
            return;
        }
        xwk.d().e().a(view.getContext(), uIBlockGroupsCollection.C);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.catalog_groups_collection_list_item, viewGroup, false);
        this.f = (TextView) inflate.findViewById(R.id.title_tv);
        this.g = (TextView) inflate.findViewById(R.id.subtitle_tv);
        this.h = (VKImageView) inflate.findViewById(R.id.cover_iv);
        this.i = (TextView) inflate.findViewById(R.id.view_all_tv);
        int c = dhr0.t.c(R.attr.vk_ui_image_placeholder);
        VKImageView vKImageView = this.h;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.setPlaceholderColor(c);
        vKImageView.setClipToOutline(true);
        vKImageView.setOutlineProvider(new s0w0(cn70.a() * 16.0f, 6));
        vKImageView.setOnClickListener(new c98(new s01(this, 4), 1));
        vKImageView.setActualScaleType(bt1.a);
        List l = e43.l(Integer.valueOf(R.id.group_item_1), Integer.valueOf(R.id.group_item_2), Integer.valueOf(R.id.group_item_3), Integer.valueOf(R.id.group_item_4), Integer.valueOf(R.id.group_item_5), Integer.valueOf(R.id.group_item_6));
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        for (Object obj : l) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            arrayList.add(new SimpleGroupItemDelegate(inflate.findViewById(((Number) obj).intValue()), this.b, this.c, this.d));
            i = i2;
        }
        this.j = arrayList;
        GroupsCollectionLayout groupsCollectionLayout = (GroupsCollectionLayout) inflate;
        this.e = groupsCollectionLayout;
        return groupsCollectionLayout;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
