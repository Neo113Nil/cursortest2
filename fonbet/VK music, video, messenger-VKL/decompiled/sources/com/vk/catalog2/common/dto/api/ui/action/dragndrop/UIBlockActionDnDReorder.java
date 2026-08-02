package com.vk.catalog2.common.dto.api.ui.action.dragndrop;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xsna.epx;
import xsna.i7o0;
import xsna.qjg;

/* compiled from: UIBlockActionDnDReorder.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionDnDReorder extends UIBlockDragDropAction {
    public static final Serializer.c<UIBlockActionDnDReorder> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionDnDReorder> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionDnDReorder a(Serializer serializer) {
            return new UIBlockActionDnDReorder(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionDnDReorder[i];
        }
    }

    public UIBlockActionDnDReorder(String str, CatalogViewType catalogViewType, CatalogDataType catalogDataType, String str2, UserId userId, List<String> list, UIBlockHint uIBlockHint) {
        super(str, catalogViewType, catalogDataType, str2, userId, list, uIBlockHint);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionDnDReorder zb() {
        UserId a2 = UserId.a(this.g);
        ArrayList a3 = i7o0.a(this.h);
        UIBlockHint uIBlockHint = this.j;
        return new UIBlockActionDnDReorder(this.b, this.d, this.e, this.f, a2, a3, uIBlockHint != null ? uIBlockHint.zb() : null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionDnDReorder)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        return UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + "<[" + this.d + "]>";
    }

    public UIBlockActionDnDReorder(Serializer serializer) {
        super(serializer);
    }
}
