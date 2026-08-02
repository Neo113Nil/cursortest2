package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchModeActionStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;
import xsna.zcl;

/* compiled from: UIBlockActionSearchMode.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionSearchMode extends UIBlockAction {
    public static final Serializer.c<UIBlockActionSearchMode> CREATOR = new a();
    public final String A;
    public final SearchModeActionStyle B;
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionSearchMode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionSearchMode a(Serializer serializer) {
            return new UIBlockActionSearchMode(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionSearchMode[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UIBlockActionSearchMode(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, SearchModeActionStyle searchModeActionStyle, int i, zcl zclVar) {
        this(aVar, str, str2, str3, searchModeActionStyle);
        if ((i & 16) != 0) {
            Serializer.c<SearchModeActionStyle> cVar = SearchModeActionStyle.CREATOR;
            searchModeActionStyle = new SearchModeActionStyle(SearchModeActionStyle.Style.Expandable);
        }
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
        serializer.j0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionSearchMode zb() {
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
        CatalogViewStyle catalogViewStyle = this.l;
        CatalogViewStyle copy = catalogViewStyle != null ? catalogViewStyle.copy() : null;
        CatalogOnboardingInfo catalogOnboardingInfo = this.n;
        return new UIBlockActionSearchMode(new com.vk.catalog2.common.dto.api.ui.a(this.b, this.c, this.d, this.e, this.f, a2, a3, hashSet, zb, copy, this.m, catalogOnboardingInfo != null ? CatalogOnboardingInfo.zb(catalogOnboardingInfo) : null, this.p), this.y, this.z, this.A, new SearchModeActionStyle(this.B.b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionSearchMode)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionSearchMode uIBlockActionSearchMode = (UIBlockActionSearchMode) obj;
        return epx.f(this.z, uIBlockActionSearchMode.z) && epx.f(this.A, uIBlockActionSearchMode.A) && epx.f(this.B, uIBlockActionSearchMode.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + '[' + this.d + "]: blockId = " + this.b + ", searchType = " + this.z + ", sectionId = " + this.c;
    }

    public UIBlockActionSearchMode(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, String str3, SearchModeActionStyle searchModeActionStyle) {
        super(aVar, str);
        this.z = str2;
        this.A = str3;
        this.B = searchModeActionStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UIBlockActionSearchMode(Serializer serializer) {
        super(serializer);
        this.z = serializer.H();
        this.A = serializer.H();
        SearchModeActionStyle searchModeActionStyle = (SearchModeActionStyle) serializer.A(SearchModeActionStyle.class.getClassLoader());
        if (searchModeActionStyle == null) {
            searchModeActionStyle = new SearchModeActionStyle(null, 1, 0 == true ? 1 : 0);
        }
        this.B = searchModeActionStyle;
    }
}
