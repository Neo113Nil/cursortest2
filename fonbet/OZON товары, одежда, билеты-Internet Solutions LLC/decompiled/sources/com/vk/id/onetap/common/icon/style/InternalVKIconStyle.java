package com.vk.id.onetap.common.icon.style;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/vk/id/onetap/common/icon/style/InternalVKIconStyle;", "", "Lcom/vk/id/onetap/common/icon/style/InternalVKIconColorStyle;", "colorStyle", "Lcom/vk/id/onetap/common/icon/style/InternalVKIconSizeStyle;", "sizeStyle", "<init>", "(Lcom/vk/id/onetap/common/icon/style/InternalVKIconColorStyle;Lcom/vk/id/onetap/common/icon/style/InternalVKIconSizeStyle;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vk/id/onetap/common/icon/style/InternalVKIconColorStyle;", "getColorStyle", "()Lcom/vk/id/onetap/common/icon/style/InternalVKIconColorStyle;", "Lcom/vk/id/onetap/common/icon/style/InternalVKIconSizeStyle;", "getSizeStyle", "()Lcom/vk/id/onetap/common/icon/style/InternalVKIconSizeStyle;", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InternalVKIconStyle {

    @NotNull
    private final InternalVKIconColorStyle colorStyle;

    @NotNull
    private final InternalVKIconSizeStyle sizeStyle;

    public InternalVKIconStyle(@NotNull InternalVKIconColorStyle colorStyle, @NotNull InternalVKIconSizeStyle sizeStyle) {
        Intrinsics.checkNotNullParameter(colorStyle, "colorStyle");
        Intrinsics.checkNotNullParameter(sizeStyle, "sizeStyle");
        this.colorStyle = colorStyle;
        this.sizeStyle = sizeStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVKIconStyle)) {
            return false;
        }
        InternalVKIconStyle internalVKIconStyle = (InternalVKIconStyle) other;
        return this.colorStyle == internalVKIconStyle.colorStyle && this.sizeStyle == internalVKIconStyle.sizeStyle;
    }

    @NotNull
    public final InternalVKIconColorStyle getColorStyle() {
        return this.colorStyle;
    }

    @NotNull
    public final InternalVKIconSizeStyle getSizeStyle() {
        return this.sizeStyle;
    }

    public int hashCode() {
        return this.sizeStyle.hashCode() + (this.colorStyle.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "InternalVKIconStyle(colorStyle=" + this.colorStyle + ", sizeStyle=" + this.sizeStyle + ")";
    }
}
