package com.vk.catalog2.common.dto.ui;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;

/* compiled from: UIBlockProfileVideoUploads.kt */
/* loaded from: classes16.dex */
public final class UIBlockProfileVideoUploads extends UIBlock {
    public static final Serializer.c<UIBlockProfileVideoUploads> CREATOR = new a();
    public final boolean y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockProfileVideoUploads> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockProfileVideoUploads a(Serializer serializer) {
            return new UIBlockProfileVideoUploads(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockProfileVideoUploads[i];
        }
    }

    public UIBlockProfileVideoUploads(com.vk.catalog2.common.dto.api.ui.a aVar, boolean z) {
        super(aVar);
        this.y = z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.b;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.L(this.y ? (byte) 1 : (byte) 0);
    }

    public final boolean Pb() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockProfileVideoUploads) && UIBlock.a.b(this, (UIBlock) obj)) {
            return this.y == ((UIBlockProfileVideoUploads) obj).y;
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), Boolean.valueOf(this.y));
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return "UIBlockProfileVideoUploads " + this.y;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockProfileVideoUploads(Ab(), this.y);
    }

    public UIBlockProfileVideoUploads(Serializer serializer) {
        super(serializer);
        this.y = serializer.m();
    }
}
