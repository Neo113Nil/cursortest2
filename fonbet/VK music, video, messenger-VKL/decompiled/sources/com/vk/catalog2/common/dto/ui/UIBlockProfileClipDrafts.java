package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;

/* compiled from: UIBlockProfileClipDrafts.kt */
/* loaded from: classes16.dex */
public final class UIBlockProfileClipDrafts extends UIBlock {
    public static final Serializer.c<UIBlockProfileClipDrafts> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockProfileClipDrafts> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockProfileClipDrafts a(Serializer serializer) {
            return new UIBlockProfileClipDrafts(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockProfileClipDrafts[i];
        }
    }

    public UIBlockProfileClipDrafts(com.vk.catalog2.common.dto.api.ui.a aVar) {
        super(aVar);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof UIBlockProfileClipDrafts) && UIBlock.a.b(this, (UIBlock) obj);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)));
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "UIBlockProfileClipDrafts";
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockProfileClipDrafts(Ab());
    }

    public UIBlockProfileClipDrafts(Serializer serializer) {
        super(serializer);
    }
}
