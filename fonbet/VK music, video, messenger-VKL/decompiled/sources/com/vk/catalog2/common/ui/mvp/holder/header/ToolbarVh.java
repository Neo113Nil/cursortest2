package com.vk.catalog2.common.ui.mvp.holder.header;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.SearchModeActionStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToOwner;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.feature.music.dto.ui.actions.UIBlockMyAudiosSectionOptions;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.d;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.a4p0;
import xsna.b4p0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c24;
import xsna.c98;
import xsna.cn;
import xsna.dhr0;
import xsna.e3m;
import xsna.eda;
import xsna.epx;
import xsna.f4m;
import xsna.fnj;
import xsna.g2u0;
import xsna.gzs;
import xsna.h13;
import xsna.iah0;
import xsna.irc0;
import xsna.iud0;
import xsna.iwh0;
import xsna.izs;
import xsna.krv0;
import xsna.l7s;
import xsna.lfr;
import xsna.lq5;
import xsna.msy;
import xsna.n720;
import xsna.n8q;
import xsna.nda;
import xsna.nn4;
import xsna.o0r0;
import xsna.o25;
import xsna.oan0;
import xsna.q3a;
import xsna.qbc0;
import xsna.s200;
import xsna.s3q0;
import xsna.sb;
import xsna.sha;
import xsna.srh0;
import xsna.tlo0;
import xsna.u01;
import xsna.w8i;
import xsna.x16;
import xsna.xwk;
import xsna.y510;
import xsna.z3p0;
import xsna.zra;

/* compiled from: ToolbarVh.kt */
/* loaded from: classes16.dex */
public final class ToolbarVh implements TopBarVh, w8i {
    public boolean A;
    public MenuItem B;
    public MenuItem C;
    public MenuItem D;
    public MenuItem E;
    public MenuItem F;
    public io.reactivex.rxjava3.disposables.c G;
    public srh0 H;
    public ExpandableVkSearchView I;
    public boolean J;
    public final Object K;
    public final d<String> L;
    public final nda b;
    public final q3a c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final Context h;
    public final eda i;
    public boolean j;
    public final c24 k;
    public final izs<Long, s3q0> l;
    public final sha m;
    public final gzs<s3q0> n;
    public final boolean o;
    public final String p;
    public Object q;
    public final bpn0 r;
    public final bpn0 s;
    public Toolbar t;
    public VkText u;
    public VKImageView v;
    public ImageView w;
    public ViewGroup x;
    public VkContextMenu y;
    public UIBlockList z;

    /* compiled from: ToolbarVh.kt */
    public static final class a {
        public static boolean a(UIBlockList uIBlockList) {
            UIBlockActionShowFilters uIBlockActionShowFilters;
            List<CatalogFilterData> list;
            if (uIBlockList == null || (uIBlockActionShowFilters = uIBlockList.B) == null || (list = uIBlockActionShowFilters.A) == null) {
                return false;
            }
            List<CatalogFilterData> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((CatalogFilterData) it.next()).e) {
                    return true;
                }
            }
            return false;
        }
    }

    public ToolbarVh() {
        throw null;
    }

    public ToolbarVh(nda ndaVar, q3a q3aVar, String str, int i, boolean z, l7s l7sVar, eda edaVar, izs izsVar, sha shaVar, gzs gzsVar, String str2, int i2) {
        String str3 = (i2 & 4) != 0 ? null : str;
        int i3 = (i2 & 8) != 0 ? R.layout.catalog_toolbar : i;
        boolean z2 = (i2 & 16) != 0 ? true : z;
        boolean z3 = (i2 & 32) == 0;
        l7s l7sVar2 = (i2 & 64) != 0 ? null : l7sVar;
        eda edaVar2 = (i2 & 128) != 0 ? null : edaVar;
        c24 c24Var = new c24(0);
        izs izsVar2 = (i2 & 8192) != 0 ? null : izsVar;
        sha shaVar2 = (i2 & 16384) != 0 ? null : shaVar;
        gzs gzsVar2 = (65536 & i2) != 0 ? null : gzsVar;
        boolean z4 = (131072 & i2) == 0;
        String str4 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str2;
        this.b = ndaVar;
        this.c = q3aVar;
        this.d = str3;
        this.e = i3;
        this.f = z2;
        this.g = z3;
        this.h = l7sVar2;
        this.i = edaVar2;
        this.j = true;
        this.k = c24Var;
        this.l = izsVar2;
        this.m = shaVar2;
        this.n = gzsVar2;
        this.o = z4;
        this.p = str4;
        this.q = null;
        this.r = new bpn0(new h13(26));
        this.s = new bpn0(new iud0(8));
        this.K = msy.a(LazyThreadSafetyMode.NONE, new irc0(this, 19));
        this.L = d.N0();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        dhr0.a.getClass();
        dhr0.X(this);
        VkContextMenu vkContextMenu = this.y;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        this.y = null;
        this.J = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0150  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        boolean z;
        Toolbar toolbar;
        CharSequence charSequence;
        String str;
        ImageView imageView;
        List<CatalogFilterData> list;
        Object obj;
        if (uIBlock instanceof UIBlockCatalog) {
            for (UIBlockAction uIBlockAction : ((UIBlockCatalog) uIBlock).F) {
                if (uIBlockAction instanceof UIBlockMyAudiosSectionOptions) {
                    Toolbar toolbar2 = this.t;
                    if (toolbar2 == null) {
                        toolbar2 = null;
                    }
                    k(toolbar2, true);
                } else if (uIBlockAction instanceof UIBlockActionSearchMode) {
                    b((UIBlockActionSearchMode) uIBlockAction);
                } else if (uIBlockAction instanceof UIBlockDownloadAll) {
                    Toolbar toolbar3 = this.t;
                    if (toolbar3 == null) {
                        toolbar3 = null;
                    }
                    e(toolbar3, true);
                }
            }
            return;
        }
        if (uIBlock instanceof UIBlockList) {
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            String str2 = uIBlockList.z;
            if (a.a(uIBlockList)) {
                VkText vkText = this.u;
                if (vkText == null) {
                    vkText = null;
                }
                UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockList.B;
                if (uIBlockActionShowFilters != null && (list = uIBlockActionShowFilters.A) != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((CatalogFilterData) obj).e) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    CatalogFilterData catalogFilterData = (CatalogFilterData) obj;
                    if (catalogFilterData != null) {
                        str = catalogFilterData.c;
                        vkText.setText(str);
                        imageView = this.w;
                        if (imageView == null) {
                            imageView = null;
                        }
                        bwt0.p0(imageView, this.j);
                    }
                }
                str = null;
                vkText.setText(str);
                imageView = this.w;
                if (imageView == null) {
                }
                bwt0.p0(imageView, this.j);
            } else {
                VkText vkText2 = this.u;
                if (vkText2 == null) {
                    vkText2 = null;
                }
                String str3 = this.d;
                if (str3 != null) {
                    str2 = str3;
                }
                vkText2.setText(str2);
                ImageView imageView2 = this.w;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                bwt0.p0(imageView2, false);
            }
            UIBlockActionGoToOwner uIBlockActionGoToOwner = uIBlockList.D;
            if (uIBlockActionGoToOwner != null) {
                VKImageView vKImageView = this.v;
                if (vKImageView == null) {
                    vKImageView = null;
                }
                bwt0.p0(vKImageView, true);
                VKImageView vKImageView2 = this.v;
                if (vKImageView2 == null) {
                    vKImageView2 = null;
                }
                vKImageView2.load(uIBlockActionGoToOwner.Sb());
                VkText vkText3 = this.u;
                VkText vkText4 = vkText3 == null ? null : vkText3;
                UserProfile userProfile = uIBlockActionGoToOwner.z;
                if (userProfile == null || (charSequence = userProfile.e) == null) {
                    Group group = uIBlockActionGoToOwner.A;
                    charSequence = group != null ? group.d : null;
                }
                if (charSequence == null) {
                    if (vkText3 == null) {
                        vkText3 = null;
                    }
                    charSequence = vkText3.getText();
                }
                vkText4.setText(charSequence);
            } else {
                VKImageView vKImageView3 = this.v;
                if (vKImageView3 == null) {
                    vKImageView3 = null;
                }
                bwt0.p0(vKImageView3, false);
            }
            this.z = uIBlockList;
            d(this.A);
            if (((Boolean) this.r.getValue()).booleanValue() && uIBlockList.y.size() == 1) {
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator<T> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        CatalogViewType catalogViewType = ((UIBlock) it2.next()).d;
                        catalogViewType.getClass();
                        switch (CatalogViewType.b.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
                        }
                    }
                }
                z = true;
                toolbar = this.t;
                if (toolbar == null) {
                    toolbar = null;
                }
                c(toolbar, z && uIBlockList.E != null);
                b(uIBlockList.I);
                Toolbar toolbar4 = this.t;
                e(toolbar4 != null ? toolbar4 : null, uIBlockList.P != null);
            }
            z = false;
            toolbar = this.t;
            if (toolbar == null) {
            }
            c(toolbar, z && uIBlockList.E != null);
            b(uIBlockList.I);
            Toolbar toolbar42 = this.t;
            e(toolbar42 != null ? toolbar42 : null, uIBlockList.P != null);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void R9(TopBarVh.a aVar) {
        this.q = aVar;
    }

    public final void a() {
        UIBlockActionEnterEditMode uIBlockActionEnterEditMode;
        String str;
        UIBlockList uIBlockList = this.z;
        if (uIBlockList == null || (uIBlockActionEnterEditMode = uIBlockList.C) == null || (str = uIBlockActionEnterEditMode.b) == null) {
            return;
        }
        this.c.b(new zra(EditorMode.EXIT_EDITOR_MODE_DISCARD, str), true);
        d(!this.A);
        s3q0 s3q0Var = s3q0.a;
        s3q0 s3q0Var2 = s3q0.a;
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final boolean a0() {
        if (!this.A) {
            return false;
        }
        a();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.catalog2.common.ui.holders.header.TopBarVh$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.catalog2.common.ui.holders.header.TopBarVh$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.vk.core.view.components.text.VkText] */
    public final void b(UIBlockActionSearchMode uIBlockActionSearchMode) {
        ToolbarVh toolbarVh;
        if (uIBlockActionSearchMode != null && epx.f(uIBlockActionSearchMode.z, "owner_videos")) {
            if (this.l != null && this.I == null) {
                Toolbar toolbar = this.t;
                if (toolbar == null) {
                    toolbar = null;
                }
                toolbar.setPadding(0, 0, 0, 0);
                Toolbar toolbar2 = this.t;
                if (toolbar2 == null) {
                    toolbar2 = null;
                }
                ExpandableVkSearchView expandableVkSearchView = new ExpandableVkSearchView(toolbar2.getContext());
                this.I = expandableVkSearchView;
                ViewGroup viewGroup = this.x;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                viewGroup.addView(expandableVkSearchView);
                ExpandableVkSearchView expandableVkSearchView2 = this.I;
                ViewGroup.LayoutParams layoutParams = expandableVkSearchView2 != null ? expandableVkSearchView2.getLayoutParams() : null;
                ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
                if (bVar != null) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    ((ViewGroup.MarginLayoutParams) bVar).height = -2;
                    bVar.t = 0;
                    bVar.v = 0;
                    bVar.i = 0;
                    ExpandableVkSearchView expandableVkSearchView3 = this.I;
                    if (expandableVkSearchView3 != null) {
                        expandableVkSearchView3.setLayoutParams(bVar);
                    }
                }
                ExpandableVkSearchView expandableVkSearchView4 = this.I;
                if (expandableVkSearchView4 != null) {
                    expandableVkSearchView4.setHint(R.string.video_author_search_hint);
                }
                ExpandableVkSearchView expandableVkSearchView5 = this.I;
                if (expandableVkSearchView5 != null) {
                    ?? r1 = this.u;
                    expandableVkSearchView5.n5(new x16(this, 18), r1 != 0 ? r1 : null);
                }
                ExpandableVkSearchView expandableVkSearchView6 = this.I;
                if (expandableVkSearchView6 != null) {
                    expandableVkSearchView6.post(new sb(this, 13));
                    return;
                }
            }
            return;
        }
        ?? r12 = this.K;
        boolean z = this.o;
        if (z) {
            bpn0 bpn0Var = this.s;
            if ((((Boolean) bpn0Var.getValue()).booleanValue() && uIBlockActionSearchMode != null && uIBlockActionSearchMode.B.b == SearchModeActionStyle.Style.Expandable) || (!((Boolean) bpn0Var.getValue()).booleanValue() && uIBlockActionSearchMode != null)) {
                Toolbar toolbar3 = this.t;
                Toolbar toolbar4 = toolbar3 != null ? toolbar3 : null;
                if (this.J) {
                    toolbarVh = this;
                } else {
                    this.J = true;
                    n8q b = ((iwh0) r12.getValue()).b(toolbar4.getMenu(), toolbar4, toolbar4.getContext(), z);
                    srh0 srh0Var = this.H;
                    if (srh0Var != null) {
                        b.g(srh0Var.i());
                    }
                    toolbarVh = this;
                    new b4p0(0, toolbarVh, ToolbarVh.class, "searchMenuItem", "getSearchMenuItem()Lcom/vk/search/ui/api/view/SearchFeatureQueryActionMenuItem;", 0).set(b);
                    String str = toolbarVh.p;
                    if (str != null) {
                        b.P1(str);
                    }
                    b.a(new a4p0(this));
                    b.j(new lq5(this, toolbar4, b, 3));
                }
                ?? r0 = toolbarVh.q;
                if (r0 != 0) {
                    r0.B(uIBlockActionSearchMode.z);
                }
                ?? r02 = toolbarVh.q;
                if (r02 != 0) {
                    r02.o(uIBlockActionSearchMode.c);
                    return;
                }
                return;
            }
        }
        iwh0 iwh0Var = (iwh0) r12.getValue();
        Toolbar toolbar5 = this.t;
        if (toolbar5 == null) {
            toolbar5 = null;
        }
        iwh0Var.a(toolbar5.getMenu());
        this.H = null;
    }

    public final void c(Toolbar toolbar, boolean z) {
        MenuItem menuItem = this.C;
        if (menuItem == null) {
            menuItem = null;
        }
        menuItem.setIcon(dhr0.x(R.drawable.vk_icon_delete_outline_28, BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed, this.h));
        MenuItem menuItem2 = this.C;
        if (menuItem2 == null) {
            menuItem2 = null;
        }
        menuItem2.setVisible(z);
        MenuItem menuItem3 = this.C;
        n720.a(menuItem3 != null ? menuItem3 : null, toolbar.getContext().getString(R.string.accessibility_clear));
    }

    @Override // xsna.cho
    public final void d(boolean z) {
        UIBlockList uIBlockList = this.z;
        if (uIBlockList == null) {
            return;
        }
        boolean z2 = false;
        boolean z3 = uIBlockList.C != null;
        boolean z4 = z && z3;
        this.A = z4;
        boolean z5 = !z4;
        if (this.j != z5) {
            this.j = z5;
            ImageView imageView = this.w;
            if (imageView == null) {
                imageView = null;
            }
            if (!z4 && a.a(uIBlockList)) {
                z2 = true;
            }
            bwt0.p0(imageView, z2);
        }
        Toolbar toolbar = this.t;
        if (toolbar == null) {
            toolbar = null;
        }
        j(toolbar);
        Toolbar toolbar2 = this.t;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        g(toolbar2, z3);
        boolean z6 = this.A;
        MenuItem menuItem = this.F;
        (menuItem != null ? menuItem : null).setEnabled(!z6);
    }

    public final void e(Toolbar toolbar, boolean z) {
        MenuItem menuItem = this.E;
        if (menuItem == null) {
            menuItem = null;
        }
        menuItem.setIcon(dhr0.x(R.drawable.vk_icon_download_outline_28, BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed, this.h));
        MenuItem menuItem2 = this.E;
        if (menuItem2 == null) {
            menuItem2 = null;
        }
        menuItem2.setVisible(z);
        MenuItem menuItem3 = this.D;
        n720.a(menuItem3 != null ? menuItem3 : null, toolbar.getContext().getString(R.string.accessibility_actions));
    }

    public final void g(Toolbar toolbar, boolean z) {
        boolean z2 = this.A;
        int i = z2 ? R.drawable.vk_icon_done_outline_28 : R.drawable.vk_icon_edit_outline_28;
        int i2 = z2 ? R.string.accessibility_save : R.string.accessibility_edit_list;
        MenuItem menuItem = this.B;
        if (menuItem == null) {
            menuItem = null;
        }
        menuItem.setIcon(dhr0.x(i, BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed, this.h));
        MenuItem menuItem2 = this.B;
        if (menuItem2 == null) {
            menuItem2 = null;
        }
        menuItem2.setVisible(z);
        MenuItem menuItem3 = this.B;
        n720.a(menuItem3 != null ? menuItem3 : null, toolbar.getContext().getString(i2));
    }

    public final void h(Toolbar toolbar, boolean z) {
        MenuItem menuItem = this.F;
        if (menuItem == null) {
            menuItem = null;
        }
        menuItem.setIcon(dhr0.x(R.drawable.vk_icon_sort_outline_28, BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed, this.h));
        MenuItem menuItem2 = this.F;
        if (menuItem2 == null) {
            menuItem2 = null;
        }
        menuItem2.setVisible(z);
        MenuItem menuItem3 = this.F;
        n720.a(menuItem3 != null ? menuItem3 : null, toolbar.getContext().getString(R.string.accessibility_actions));
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void hide() {
        Toolbar toolbar = this.t;
        if (toolbar == null) {
            toolbar = null;
        }
        f4m.j(toolbar);
    }

    public final void j(Toolbar toolbar) {
        this.k.getClass();
        boolean z = false;
        if (Boolean.FALSE.booleanValue()) {
            toolbar.setNavigationIcon((Drawable) null);
            VKImageView vKImageView = this.v;
            if (vKImageView == null) {
                vKImageView = null;
            }
            vKImageView.setVisibility(0);
            cn o = o25.a().o();
            VKImageView vKImageView2 = this.v;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            vKImageView2.load(o.c);
            VKImageView vKImageView3 = this.v;
            if (vKImageView3 == null) {
                vKImageView3 = null;
            }
            bwt0.i0(vKImageView3, new oan0(this));
            VKImageView vKImageView4 = this.v;
            bwt0.k0(vKImageView4 != null ? vKImageView4 : null, new y510(this, 29));
            return;
        }
        VKImageView vKImageView5 = this.v;
        f4m.j(vKImageView5 != null ? vKImageView5 : null);
        boolean z2 = this.A;
        int i = z2 ? R.drawable.vk_icon_cancel_outline_28 : R.drawable.vk_icon_arrow_left_outline_28;
        int i2 = z2 ? R.string.accessibility_cancel : R.string.accessibility_toolbar_return_back;
        Activity c = g2u0.c(toolbar);
        if (c == null || s200.v(c) == null) {
            Context context = toolbar.getContext();
            HashSet hashSet = iah0.a;
            if (!fnj.d(context)) {
                z = true;
            }
        } else {
            Context context2 = toolbar.getContext();
            HashSet hashSet2 = iah0.a;
            z = !fnj.d(context2);
        }
        if ((z || this.g || this.A) && this.f) {
            BuildInfo.q();
            toolbar.setNavigationIcon(dhr0.x(i, R.attr.vk_ui_icon_accent_themed, this.h));
            toolbar.setNavigationContentDescription(toolbar.getContext().getString(i2));
        }
    }

    public final void k(Toolbar toolbar, boolean z) {
        MenuItem menuItem = this.D;
        if (menuItem == null) {
            menuItem = null;
        }
        menuItem.setIcon(dhr0.x(R.drawable.vk_icon_more_vertical_28, BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.vk_ui_icon_accent_themed, this.h));
        MenuItem menuItem2 = this.D;
        if (menuItem2 == null) {
            menuItem2 = null;
        }
        menuItem2.setVisible(z);
        MenuItem menuItem3 = this.D;
        n720.a(menuItem3 != null ? menuItem3 : null, toolbar.getContext().getString(R.string.accessibility_actions));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater b;
        Context context = this.h;
        if (context != null && (b = e3m.b(context)) != null) {
            layoutInflater = b;
        }
        final View inflate = layoutInflater.inflate(this.e, viewGroup, false);
        VkText vkText = (VkText) inflate.findViewById(R.id.title);
        vkText.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, context));
        if (BuildInfo.q()) {
            f4m.s(0, vkText);
        }
        this.u = vkText;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.title_dropdown);
        bwt0.p0(imageView, false);
        this.w = imageView;
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.owner_photo);
        vKImageView.setOnClickListener(new c98(this, 1));
        this.v = vKImageView;
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.l(R.menu.catalog_show_all_menu);
        MenuItem findItem = toolbar.getMenu().findItem(R.id.edit);
        findItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.v3p0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                UIBlockActionEnterEditMode uIBlockActionEnterEditMode;
                String str;
                ToolbarVh toolbarVh = ToolbarVh.this;
                UIBlockList uIBlockList = toolbarVh.z;
                q3a q3aVar = toolbarVh.c;
                if (uIBlockList == null || (uIBlockActionEnterEditMode = uIBlockList.C) == null || (str = uIBlockActionEnterEditMode.z) == null) {
                    return false;
                }
                if (toolbarVh.A) {
                    q3aVar.b(new qd3(str, null), true);
                    q3aVar.b(new zra(EditorMode.EXIT_EDITOR_MODE, str), true);
                } else {
                    q3aVar.b(new zra(EditorMode.ENTER_EDITOR_MODE, str), true);
                }
                toolbarVh.d(!toolbarVh.A);
                return true;
            }
        });
        this.B = findItem;
        MenuItem findItem2 = toolbar.getMenu().findItem(R.id.clear);
        findItem2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.w3p0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                UIBlockActionClearSection uIBlockActionClearSection;
                String str;
                ToolbarVh toolbarVh = ToolbarVh.this;
                UIBlockList uIBlockList = toolbarVh.z;
                if (uIBlockList == null || (uIBlockActionClearSection = uIBlockList.E) == null || (str = uIBlockActionClearSection.b) == null) {
                    return false;
                }
                fg1 fg1Var = new fg1(28, toolbarVh, str);
                sha shaVar = toolbarVh.m;
                if (shaVar != null) {
                    shaVar.a(inflate.getContext(), fg1Var).show();
                    return true;
                }
                fg1Var.invoke();
                return true;
            }
        });
        this.C = findItem2;
        MenuItem findItem3 = toolbar.getMenu().findItem(R.id.options);
        findItem3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.x3p0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                String str;
                ToolbarVh toolbarVh = ToolbarVh.this;
                UIBlockList uIBlockList = toolbarVh.z;
                if (uIBlockList == null || (str = uIBlockList.b) == null) {
                    return false;
                }
                toolbarVh.c.b(new dq80(str), true);
                return true;
            }
        });
        this.D = findItem3;
        MenuItem findItem4 = toolbar.getMenu().findItem(R.id.downloadAll);
        findItem4.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: xsna.y3p0
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ToolbarVh.this.c.b(new VkTopBarVh.b(), true);
                return true;
            }
        });
        this.E = findItem4;
        MenuItem findItem5 = toolbar.getMenu().findItem(R.id.filters);
        findItem5.setOnMenuItemClickListener(new z3p0());
        this.F = findItem5;
        j(toolbar);
        g(toolbar, false);
        c(toolbar, false);
        k(toolbar, false);
        h(toolbar, false);
        toolbar.setNavigationContentDescription(R.string.accessibility_toolbar_return_back);
        toolbar.setNavigationOnClickListener(new c98(new u01(this, 16), 1));
        toolbar.setOnClickListener(new c98(this, 1));
        this.t = toolbar;
        VkText vkText2 = this.u;
        if (vkText2 == null) {
            vkText2 = null;
        }
        String str = this.d;
        if (str == null) {
            str = "";
        }
        vkText2.setText(str);
        this.x = (ViewGroup) inflate.findViewById(R.id.content);
        dhr0.f(this);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionGoToOwner uIBlockActionGoToOwner;
        UserId userId;
        List<CatalogFilterData> list;
        int id = view.getId();
        if (id != R.id.toolbar) {
            if (id != R.id.owner_photo) {
                this.k.getClass();
                this.b.c(false);
                return;
            }
            UIBlockList uIBlockList = this.z;
            if (uIBlockList == null || (uIBlockActionGoToOwner = uIBlockList.D) == null || (userId = uIBlockActionGoToOwner.g) == null) {
                return;
            }
            xwk.e().m(view.getContext(), userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, 65534));
            return;
        }
        UIBlockList uIBlockList2 = this.z;
        if (uIBlockList2 == null) {
            return;
        }
        if (!this.j || !a.a(uIBlockList2)) {
            gzs<s3q0> gzsVar = this.n;
            if (gzsVar != null) {
                gzsVar.invoke();
                return;
            }
            return;
        }
        UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockList2.B;
        if (uIBlockActionShowFilters == null || (list = uIBlockActionShowFilters.A) == null) {
            return;
        }
        nn4 nn4Var = new nn4(this, view, uIBlockList2, 10);
        VkText vkText = this.u;
        if (vkText == null) {
            vkText = null;
        }
        VkText vkText2 = vkText;
        ListDataSet listDataSet = new ListDataSet();
        listDataSet.setItems(list);
        lfr lfrVar = new lfr(listDataSet, nn4Var);
        lfrVar.setItems(list);
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        vkText2.getContext();
        e.b bVar = new e.b(vkText2, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        bVar.l = lfrVar;
        VkContextMenu j = bVar.j();
        this.y = j;
        j.e(new qbc0(this, 20));
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        VkText vkText = this.u;
        if (vkText == null) {
            vkText = null;
        }
        vkText.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, this.h));
        Toolbar toolbar = this.t;
        if (toolbar == null) {
            toolbar = null;
        }
        j(toolbar);
        Toolbar toolbar2 = this.t;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        MenuItem menuItem = this.B;
        if (menuItem == null) {
            menuItem = null;
        }
        g(toolbar2, menuItem.isVisible());
        Toolbar toolbar3 = this.t;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        MenuItem menuItem2 = this.C;
        if (menuItem2 == null) {
            menuItem2 = null;
        }
        c(toolbar3, menuItem2.isVisible());
        Toolbar toolbar4 = this.t;
        if (toolbar4 == null) {
            toolbar4 = null;
        }
        MenuItem menuItem3 = this.D;
        if (menuItem3 == null) {
            menuItem3 = null;
        }
        k(toolbar4, menuItem3.isVisible());
        Toolbar toolbar5 = this.t;
        if (toolbar5 == null) {
            toolbar5 = null;
        }
        MenuItem menuItem4 = this.F;
        h(toolbar5, (menuItem4 != null ? menuItem4 : null).isVisible());
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void setTitle(tlo0 tlo0Var) {
        VkText vkText = this.u;
        if (vkText == null) {
            vkText = null;
        }
        vkText.setText(tlo0.b.a((tlo0.f) tlo0Var, vkText.getContext()));
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void show() {
        Toolbar toolbar = this.t;
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setVisibility(0);
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void tc(boolean z) {
        ExpandableVkSearchView expandableVkSearchView;
        ExpandableVkSearchView expandableVkSearchView2 = this.I;
        if (expandableVkSearchView2 == null || !f4m.h(expandableVkSearchView2) || (expandableVkSearchView = this.I) == null) {
            return;
        }
        expandableVkSearchView.setExpandedWithAnimation(z);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh
    public final void dm(String str) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
