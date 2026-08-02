package ru.ozon.uni.android.uikit.extensions.view;

import android.widget.ImageView;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"setVectorDrawable", "", "Landroid/widget/ImageView;", "res", "", "setBackgroundVectorDrawable", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageViewExtKt {
    public static final void setBackgroundVectorDrawable(@NotNull ImageView imageView, int i11) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setBackground(C7232a.a(imageView.getContext(), i11));
    }

    public static final void setVectorDrawable(@NotNull ImageView imageView, int i11) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        imageView.setImageDrawable(C7232a.a(imageView.getContext(), i11));
    }
}
