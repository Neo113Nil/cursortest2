package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bai0;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockActionFilter.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionFilter extends UIBlockAction implements bai0 {
    public static final Serializer.c<UIBlockActionFilter> CREATOR = new a();
    public final String A;
    public final String B;
    public final CatalogFilterData z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionFilter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionFilter a(Serializer serializer) {
            return new UIBlockActionFilter(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionFilter[i];
        }
    }

    public UIBlockActionFilter(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, CatalogFilterData catalogFilterData, String str4, String str5, CatalogViewStyle catalogViewStyle, String str6) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, str5, catalogViewStyle, null, 2048, null);
        this.z = catalogFilterData;
        this.A = str4;
        this.B = str6;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.z);
        serializer.j0(this.A);
        serializer.j0(this.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionFilter zb() {
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
        CatalogFilterData zb2 = CatalogFilterData.zb(this.z, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        CatalogViewStyle catalogViewStyle = this.l;
        return new UIBlockActionFilter(this.b, this.d, this.e, this.f, a2, a3, hashSet, zb, this.y, zb2, this.A, this.c, catalogViewStyle != null ? catalogViewStyle.copy() : null, this.B);
    }

    public final CatalogFilterData Sb() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionFilter)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) obj;
        return epx.f(this.z, uIBlockActionFilter.z) && epx.f(this.A, uIBlockActionFilter.A) && epx.f(this.B, uIBlockActionFilter.B);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z, this.A, this.B);
    }

    @Override // xsna.bai0
    public final boolean p() {
        return this.z.e;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + '[' + this.d + "]: " + this.b;
    }

    public UIBlockActionFilter(Serializer serializer) {
        super(serializer);
        this.z = (CatalogFilterData) serializer.G(CatalogFilterData.class.getClassLoader());
        this.A = serializer.H();
        this.B = serializer.H();
    }
}
