package ru.ozon.uni.atoms.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u001a\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/atoms/common/StubImageLoader;", "Lru/ozon/uni/atoms/common/ImageLoader;", "<init>", "()V", "load", "", "imageView", "Landroid/widget/ImageView;", ImagesContract.URL, "", "context", "Landroid/content/Context;", "imageWidth", "", "imageHeight", "block", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "loadRoundCorners", "loadCircle", "loadCropInDark", "loadCropAndRoundInDark", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StubImageLoader implements ImageLoader {
    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void load(@NotNull Context context, String url, int imageWidth, int imageHeight, @NotNull Function1<? super Drawable, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void loadCircle(@NotNull ImageView imageView, String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void loadCropAndRoundInDark(@NotNull ImageView imageView, String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void loadCropInDark(@NotNull ImageView imageView, String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void loadRoundCorners(@NotNull ImageView imageView, String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void load(@NotNull ImageView imageView, String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
    }
}
