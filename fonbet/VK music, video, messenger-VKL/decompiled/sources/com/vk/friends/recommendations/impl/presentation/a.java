package com.vk.friends.recommendations.impl.presentation;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.recommendations.impl.presentation.Item;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import xsna.drm0;
import xsna.hss;
import xsna.izo0;
import xsna.lhg;
import xsna.mf7;
import xsna.ris;
import xsna.urs;
import xsna.vif0;
import xsna.yth0;
import xsna.zoj0;

/* compiled from: FriendsRecommendationsAdapter.kt */
/* loaded from: classes16.dex */
public final class a extends zoj0<Item, RecyclerView.e0> implements mf7 {
    public final ListDataSet e;
    public final BaseFragment f;
    public final ris g;
    public String h;
    public final ArrayList<Item> i;
    public boolean j;

    public a() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(BaseFragment baseFragment, ris risVar) {
        super(r0);
        ListDataSet listDataSet = new ListDataSet();
        this.e = listDataSet;
        this.f = baseFragment;
        this.g = risVar;
        registerAdapterDataObserver(new urs(this));
        this.i = new ArrayList<>();
        this.j = true;
    }

    public final void K0() {
        String str;
        ArrayList<Item> arrayList = this.i;
        arrayList.clear();
        String str2 = this.h;
        String upperCase = str2 != null ? str2.toUpperCase(Locale.ROOT) : null;
        int E0 = E0();
        Item item = null;
        for (int i = 0; i < E0; i++) {
            Item item2 = (Item) this.c.c(i);
            Item.Type type = item2.a;
            RequestUserProfile requestUserProfile = item2.c;
            if (type == Item.Type.TITLE) {
                item = item2;
            }
            if (upperCase != null && upperCase.length() != 0 && requestUserProfile != null && (str = requestUserProfile.e) != null && drm0.D(str.toUpperCase(Locale.ROOT), upperCase, false)) {
                if (requestUserProfile.p0 && item != null) {
                    arrayList.add(item);
                    item = null;
                }
                arrayList.add(item2);
            }
        }
        this.j = false;
        notifyDataSetChanged();
        this.j = true;
    }

    @Override // xsna.zoj0, xsna.uuk
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final Item c(int i) {
        String str = this.h;
        if (str == null || str.length() == 0) {
            return (Item) super.c(i);
        }
        ArrayList<Item> arrayList = this.i;
        if (i < arrayList.size()) {
            return arrayList.get(i);
        }
        return null;
    }

    public final void N0(RecyclerView.e0 e0Var, int i, List<? extends Object> list) {
        vif0 vif0Var;
        Item c = c(i);
        if (c != null) {
            int ordinal = c.a.ordinal();
            if (ordinal == Item.Type.SEARCH_LIST.ordinal()) {
                vif0Var = e0Var instanceof yth0 ? (yth0) e0Var : null;
                if (vif0Var != null) {
                    vif0Var.V5(c);
                    return;
                }
                return;
            }
            if (ordinal == Item.Type.TITLE.ordinal()) {
                vif0Var = e0Var instanceof izo0 ? (izo0) e0Var : null;
                if (vif0Var != null) {
                    vif0Var.V5(Integer.valueOf(c.b));
                    return;
                }
                return;
            }
            if (ordinal != Item.Type.REQUEST.ordinal() && ordinal != Item.Type.FOLLOW_SUGGEST.ordinal() && ordinal != Item.Type.REQUEST_NOT_REAL.ordinal()) {
                if (ordinal == Item.Type.IMPORTS.ordinal()) {
                    vif0Var = e0Var instanceof vif0 ? (vif0) e0Var : null;
                    if (vif0Var != null) {
                        vif0Var.V5(c);
                        return;
                    }
                    return;
                }
                return;
            }
            RequestUserProfile requestUserProfile = c.c;
            if (requestUserProfile != null) {
                vif0Var = e0Var instanceof vif0 ? (vif0) e0Var : null;
                if (vif0Var != null) {
                    vif0Var.W5(requestUserProfile, list);
                }
            }
        }
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        Item.Type type;
        Item c = c(i);
        if (c == null || (type = c.a) == Item.Type.SEARCH_LIST || type == Item.Type.IMPORTS) {
            return 0;
        }
        Item c2 = c(i + 1);
        return ((c2 != null ? c2.a : null) == Item.Type.TITLE || i == E0() - 1) ? 4 : 1;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        String str = this.h;
        return (str == null || str.length() == 0) ? super.getItemCount() : this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Item.Type type;
        Item c = c(i);
        if (c == null || (type = c.a) == null) {
            return 0;
        }
        return type.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        N0(e0Var, i, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == Item.Type.SEARCH_LIST.ordinal()) {
            return new yth0(this.f, viewGroup);
        }
        if (i == Item.Type.TITLE.ordinal()) {
            return new izo0(viewGroup);
        }
        if (i == Item.Type.IMPORTS.ordinal()) {
            return new b(viewGroup);
        }
        int ordinal = Item.Type.REQUEST.ordinal();
        ris risVar = this.g;
        if (i == ordinal) {
            return risVar.a(viewGroup, new hss.a(2));
        }
        if (i == Item.Type.FOLLOW_SUGGEST.ordinal()) {
            return risVar.a(viewGroup, new hss.b(true));
        }
        if (i == Item.Type.REQUEST_NOT_REAL.ordinal()) {
            return risVar.a(viewGroup, new hss.a(true, true));
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported type: "));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        N0(e0Var, i, EmptyList.b);
    }
}
