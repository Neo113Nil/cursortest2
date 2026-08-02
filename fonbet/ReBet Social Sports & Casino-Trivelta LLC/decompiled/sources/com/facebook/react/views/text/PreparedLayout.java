package com.facebook.react.views.text;

import android.text.Layout;
import h8.InterfaceC4488a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC4488a
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayout;", "", "layout", "Landroid/text/Layout;", "maximumNumberOfLines", "", "verticalOffset", "", "reactTags", "", "<init>", "(Landroid/text/Layout;IF[I)V", "getLayout", "()Landroid/text/Layout;", "getMaximumNumberOfLines", "()I", "getVerticalOffset", "()F", "getReactTags", "()[I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreparedLayout {

    @NotNull
    private final Layout layout;
    private final int maximumNumberOfLines;

    @NotNull
    private final int[] reactTags;
    private final float verticalOffset;

    public PreparedLayout(@NotNull Layout layout, int i10, float f10, @NotNull int[] reactTags) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(reactTags, "reactTags");
        this.layout = layout;
        this.maximumNumberOfLines = i10;
        this.verticalOffset = f10;
        this.reactTags = reactTags;
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    public final int getMaximumNumberOfLines() {
        return this.maximumNumberOfLines;
    }

    @NotNull
    public final int[] getReactTags() {
        return this.reactTags;
    }

    public final float getVerticalOffset() {
        return this.verticalOffset;
    }
}
