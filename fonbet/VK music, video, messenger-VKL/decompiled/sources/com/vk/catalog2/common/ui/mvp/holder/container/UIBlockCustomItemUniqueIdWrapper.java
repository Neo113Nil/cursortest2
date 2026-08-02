package com.vk.catalog2.common.ui.mvp.holder.container;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;

/* compiled from: HorizontalLoopVh.kt */
/* loaded from: classes16.dex */
public final class UIBlockCustomItemUniqueIdWrapper extends UIBlock {
    public static final Serializer.c<UIBlockCustomItemUniqueIdWrapper> CREATOR = new a();
    public final String y;
    public final UIBlock z;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockCustomItemUniqueIdWrapper> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockCustomItemUniqueIdWrapper a(Serializer serializer) {
            return new UIBlockCustomItemUniqueIdWrapper(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockCustomItemUniqueIdWrapper[i];
        }
    }

    public UIBlockCustomItemUniqueIdWrapper(String str, UIBlock uIBlock) {
        super(uIBlock.b, uIBlock.d, uIBlock.e, uIBlock.f, uIBlock.g, uIBlock.h, uIBlock.Db(), uIBlock.j, null, null, null, null, null, null, null, 32512, null);
        this.y = str;
        this.z = uIBlock;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.y);
        serializer.e0(this.z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockCustomItemUniqueIdWrapper) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockCustomItemUniqueIdWrapper uIBlockCustomItemUniqueIdWrapper = (UIBlockCustomItemUniqueIdWrapper) obj;
        return epx.f(this.y, uIBlockCustomItemUniqueIdWrapper.y) && epx.f(this.z, uIBlockCustomItemUniqueIdWrapper.z);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(this.y, Integer.valueOf(this.z.hashCode()));
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return this.z.toString();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockCustomItemUniqueIdWrapper(this.y, this.z.zb());
    }

    public UIBlockCustomItemUniqueIdWrapper(Serializer serializer) {
        this(serializer.H(), (UIBlock) serializer.G(UIBlock.class.getClassLoader()));
    }
}
