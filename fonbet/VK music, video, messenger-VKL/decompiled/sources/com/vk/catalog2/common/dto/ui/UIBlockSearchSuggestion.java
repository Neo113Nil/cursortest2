package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchSuggestionCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.SearchSuggestion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import xsna.dfp0;
import xsna.epx;
import xsna.ho8;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockSearchSuggestion.kt */
/* loaded from: classes16.dex */
public final class UIBlockSearchSuggestion extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockSearchSuggestion> CREATOR = new a();
    public final SearchSuggestion y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockSearchSuggestion> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockSearchSuggestion a(Serializer serializer) {
            return new UIBlockSearchSuggestion(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockSearchSuggestion[i];
        }
    }

    public UIBlockSearchSuggestion(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, SearchSuggestionCatalogViewStyle searchSuggestionCatalogViewStyle, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, SearchSuggestion searchSuggestion) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, null, searchSuggestionCatalogViewStyle, null, null, null, null, null, 32000, null);
        this.y = searchSuggestion;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        StringBuilder sb = new StringBuilder();
        SearchSuggestion searchSuggestion = this.y;
        sb.append(searchSuggestion.c);
        sb.append('_');
        sb.append(searchSuggestion.f);
        sb.append('_');
        sb.append(searchSuggestion.g.h());
        return sb.toString();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockSearchSuggestion) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockSearchSuggestion) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.y.k;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append('<');
        return ho8.a(sb, this.y.c, '>');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        CatalogViewStyle catalogViewStyle = this.l;
        CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
        SearchSuggestionCatalogViewStyle searchSuggestionCatalogViewStyle = copy instanceof SearchSuggestionCatalogViewStyle ? (SearchSuggestionCatalogViewStyle) copy : null;
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        UIBlockHint zb = uIBlockHint != null ? uIBlockHint.zb() : null;
        SearchSuggestion searchSuggestion = this.y;
        return new UIBlockSearchSuggestion(this.b, this.d, this.e, searchSuggestionCatalogViewStyle, this.f, a2, a3, hashSet, zb, new SearchSuggestion(searchSuggestion.b, searchSuggestion.c, searchSuggestion.d, searchSuggestion.e, searchSuggestion.f, searchSuggestion.g, searchSuggestion.h, searchSuggestion.i, searchSuggestion.j, searchSuggestion.k));
    }

    public UIBlockSearchSuggestion(Serializer serializer) {
        super(serializer);
        this.y = (SearchSuggestion) serializer.G(SearchSuggestion.class.getClassLoader());
    }
}
