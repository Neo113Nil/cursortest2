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
import xsna.qjg;

/* compiled from: UIBlockActionIconButton.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionIconButton extends UIBlockAction implements dfp0 {
    public static final Serializer.c<UIBlockActionIconButton> CREATOR = new a();
    public final String A;
    public final boolean z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionIconButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionIconButton a(Serializer serializer) {
            return new UIBlockActionIconButton(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionIconButton[i];
        }
    }

    public UIBlockActionIconButton(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, Set<? extends UIBlockDragDropAction> set, UIBlockHint uIBlockHint, boolean z, String str3, String str4) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, set, uIBlockHint, str3, null, null, null, 3584, null);
        this.z = z;
        this.A = str4;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.L(this.z ? (byte) 1 : (byte) 0);
        serializer.j0(this.A);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionIconButton zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        Set<UIBlockDragDropAction> Db = Db();
        HashSet hashSet = new HashSet();
        Iterator<UIBlockDragDropAction> it = Db.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().zb());
        }
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockActionIconButton(this.b, this.d, this.e, this.f, a2, a3, hashSet, uIBlockHint != null ? uIBlockHint.zb() : null, this.z, this.y, this.A);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionIconButton)) {
            return false;
        }
        UIBlockActionIconButton uIBlockActionIconButton = (UIBlockActionIconButton) obj;
        if (this.z != uIBlockActionIconButton.z || !epx.f(this.A, uIBlockActionIconButton.A)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        return UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), Boolean.valueOf(this.z), this.A);
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.A;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "<" + qjg.a(this) + ">[" + this.d + "]: blockId = " + this.b;
    }

    public UIBlockActionIconButton(Serializer serializer) {
        super(serializer);
        this.z = serializer.m();
        this.A = serializer.H();
    }
}
