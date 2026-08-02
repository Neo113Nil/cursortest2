package com.vk.catalog2.common.dto.ui.actions;

import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.qjg;
import xsna.vu5;

/* compiled from: UiBlockActionUploadVideoButton.kt */
/* loaded from: classes16.dex */
public final class UiBlockActionUploadVideoButton extends UIBlockActionTextButton {
    public static final Serializer.c<UiBlockActionUploadVideoButton> CREATOR = new a();
    public final int B;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UiBlockActionUploadVideoButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UiBlockActionUploadVideoButton a(Serializer serializer) {
            return new UiBlockActionUploadVideoButton(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UiBlockActionUploadVideoButton[i];
        }
    }

    public UiBlockActionUploadVideoButton(com.vk.catalog2.common.dto.api.ui.a aVar, String str, String str2, int i, String str3) {
        super(aVar, str, str2, str3);
        this.B = i;
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton, com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.S(this.B);
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton, com.vk.catalog2.common.dto.api.ui.action.UIBlockAction, com.vk.catalog2.common.dto.api.ui.UIBlock
    /* renamed from: Tb, reason: merged with bridge method [inline-methods] */
    public final UiBlockActionUploadVideoButton zb() {
        return new UiBlockActionUploadVideoButton(Ab(), this.y, this.z, this.B, this.A);
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof UiBlockActionUploadVideoButton)) {
            return this.B == ((UiBlockActionUploadVideoButton) obj).B;
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.B));
    }

    @Override // com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton, com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(qjg.a(this));
        sb.append("<[");
        sb.append(this.d);
        sb.append("]: ");
        sb.append(this.z);
        sb.append(", ");
        return vu5.b(sb, this.B, '>');
    }

    public UiBlockActionUploadVideoButton(Serializer serializer) {
        super(serializer);
        this.B = serializer.u();
    }
}
