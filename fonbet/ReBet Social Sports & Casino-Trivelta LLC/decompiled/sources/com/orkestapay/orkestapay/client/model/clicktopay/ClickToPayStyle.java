package com.orkestapay.orkestapay.client.model.clicktopay;

import com.facebook.react.uimanager.ViewProps;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPayStyle;", "Ljava/io/Serializable;", "title", "", ViewProps.COLOR, "", "(Ljava/lang/String;I)V", "getColor", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClickToPayStyle implements Serializable {
    private final int color;

    @NotNull
    private final String title;

    public ClickToPayStyle(@NotNull String title, int i10) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.color = i10;
    }

    public static /* synthetic */ ClickToPayStyle copy$default(ClickToPayStyle clickToPayStyle, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = clickToPayStyle.title;
        }
        if ((i11 & 2) != 0) {
            i10 = clickToPayStyle.color;
        }
        return clickToPayStyle.copy(str, i10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final ClickToPayStyle copy(@NotNull String title, int color) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ClickToPayStyle(title, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickToPayStyle)) {
            return false;
        }
        ClickToPayStyle clickToPayStyle = (ClickToPayStyle) other;
        return Intrinsics.areEqual(this.title, clickToPayStyle.title) && this.color == clickToPayStyle.color;
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + Integer.hashCode(this.color);
    }

    @NotNull
    public String toString() {
        return "ClickToPayStyle(title=" + this.title + ", color=" + this.color + ')';
    }
}
