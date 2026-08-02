package com.vk.catalog2.common.dto.ui.actions;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;
import xsna.qjg;

/* compiled from: UIBlockActionEnterEditMode.kt */
/* loaded from: classes16.dex */
public final class UIBlockActionEnterEditMode extends UIBlockAction {
    public static final Serializer.c<UIBlockActionEnterEditMode> CREATOR = new a();
    public final String z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockActionEnterEditMode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockActionEnterEditMode a(Serializer serializer) {
            return new UIBlockActionEnterEditMode(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockActionEnterEditMode[i];
        }
    }

    public UIBlockActionEnterEditMode(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2) {
        super(aVar, str);
        this.z = str2;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Rb, reason: merged with bridge method [inline-methods] */
    public final UIBlockActionEnterEditMode zb() {
        return new UIBlockActionEnterEditMode(Ab(), this.y, this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockActionEnterEditMode)) {
            return false;
        }
        UIBlockAction uIBlockAction = (UIBlockAction) obj;
        if (UIBlock.a.b(this, uIBlockAction) && epx.f(this.y, uIBlockAction.y)) {
            return epx.f(this.z, ((UIBlockActionEnterEditMode) obj).z);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(Integer.valueOf(UIBlock.a.a(this)), this.y)), this.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return qjg.a(this) + '[' + this.d + "]: blockId = " + this.b + ", reorderBlockId = " + this.z;
    }

    public UIBlockActionEnterEditMode(Serializer serializer) {
        super(serializer);
        this.z = serializer.H();
    }
}
