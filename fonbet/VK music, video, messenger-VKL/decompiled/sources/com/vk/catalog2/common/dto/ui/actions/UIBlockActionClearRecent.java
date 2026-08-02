package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
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
import xsna.dfp0;
import xsna.epx;
import xsna.i7o0;
import xsna.j5g;
import xsna.ltl0;
import xsna.qjg;

/* compiled from: UIBlockActionClearRecent.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionClearRecent extends UIBlockAction implements dfp0 {
    public static final Serializer.c<UIBlockActionClearRecent> CREATOR = new a();
    public final String A;
    public final List<String> z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionClearRecent> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionClearRecent a(Serializer serializer) {
            return new UIBlockActionClearRecent(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionClearRecent[i];
        }
    }

    public UIBlockActionClearRecent(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, String str3, List<String> list2, String str4) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, null, null, null, 3584, null);
        this.A = str4;
        this.z = list2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.A);
        serializer.l0(this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionClearRecent zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockActionClearRecent(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, this.y, i7o0.a(this.z), this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionClearRecent)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (!UIBlock.a.b(this, uIBlockAction) || !epx.f(this.y, uIBlockAction.y)) {
            return false;
        }
        UIBlockActionClearRecent uIBlockActionClearRecent = (UIBlockActionClearRecent) obj;
        return epx.f(this.A, uIBlockActionClearRecent.A) && epx.f(this.z, uIBlockActionClearRecent.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.A, this.z);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.A;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + '[' + this.d + "]: " + j5g.g0(this.z, null, null, null, 0, new ltl0(2), 31);
    }

    public UIBlockActionClearRecent(Serializer serializer) {
        super(serializer);
        this.A = serializer.H();
        this.z = com.vk.core.serialize.a.a(serializer);
    }
}
