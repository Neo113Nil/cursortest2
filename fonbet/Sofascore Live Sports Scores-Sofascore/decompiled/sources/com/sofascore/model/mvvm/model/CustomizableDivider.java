package com.sofascore.model.mvvm.model;

import defpackage.dmi;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/sofascore/model/mvvm/model/CustomizableDivider;", "Ljava/io/Serializable;", "dividerVisible", "", "heightDp", "", "isTransparent", "tint", "<init>", "(ZIZLjava/lang/Integer;)V", "getDividerVisible", "()Z", "getHeightDp", "()I", "getTint", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ZIZLjava/lang/Integer;)Lcom/sofascore/model/mvvm/model/CustomizableDivider;", "equals", "other", "", "hashCode", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomizableDivider implements Serializable {
    private final boolean dividerVisible;
    private final int heightDp;
    private final boolean isTransparent;

    @Nullable
    private final Integer tint;

    public /* synthetic */ CustomizableDivider(boolean z, int i, boolean z2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? 8 : i, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : num);
    }

    public static /* synthetic */ CustomizableDivider copy$default(CustomizableDivider customizableDivider, boolean z, int i, boolean z2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = customizableDivider.dividerVisible;
        }
        if ((i2 & 2) != 0) {
            i = customizableDivider.heightDp;
        }
        if ((i2 & 4) != 0) {
            z2 = customizableDivider.isTransparent;
        }
        if ((i2 & 8) != 0) {
            num = customizableDivider.tint;
        }
        return customizableDivider.copy(z, i, z2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDividerVisible() {
        return this.dividerVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeightDp() {
        return this.heightDp;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsTransparent() {
        return this.isTransparent;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTint() {
        return this.tint;
    }

    @NotNull
    public final CustomizableDivider copy(boolean dividerVisible, int heightDp, boolean isTransparent, @Nullable Integer tint) {
        return new CustomizableDivider(dividerVisible, heightDp, isTransparent, tint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomizableDivider)) {
            return false;
        }
        CustomizableDivider customizableDivider = (CustomizableDivider) other;
        return this.dividerVisible == customizableDivider.dividerVisible && this.heightDp == customizableDivider.heightDp && this.isTransparent == customizableDivider.isTransparent && Intrinsics.c(this.tint, customizableDivider.tint);
    }

    public final boolean getDividerVisible() {
        return this.dividerVisible;
    }

    public final int getHeightDp() {
        return this.heightDp;
    }

    @Nullable
    public final Integer getTint() {
        return this.tint;
    }

    public int hashCode() {
        int e = dmi.e(wv8.a(this.heightDp, Boolean.hashCode(this.dividerVisible) * 31, 31), 31, this.isTransparent);
        Integer num = this.tint;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final boolean isTransparent() {
        return this.isTransparent;
    }

    @NotNull
    public String toString() {
        return "CustomizableDivider(dividerVisible=" + this.dividerVisible + ", heightDp=" + this.heightDp + ", isTransparent=" + this.isTransparent + ", tint=" + this.tint + ")";
    }

    public CustomizableDivider(boolean z, int i) {
        this(z, i, false, null, 12, null);
    }

    public CustomizableDivider(boolean z, int i, boolean z2) {
        this(z, i, z2, null, 8, null);
    }

    public CustomizableDivider(boolean z, int i, boolean z2, @Nullable Integer num) {
        this.dividerVisible = z;
        this.heightDp = i;
        this.isTransparent = z2;
        this.tint = num;
    }

    public CustomizableDivider(boolean z) {
        this(z, 0, false, null, 14, null);
    }
}
