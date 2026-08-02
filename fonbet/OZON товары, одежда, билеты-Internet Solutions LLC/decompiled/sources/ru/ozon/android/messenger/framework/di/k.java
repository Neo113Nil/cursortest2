package ru.ozon.android.messenger.framework.di;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.common.ImageLoader;

/* loaded from: classes6.dex */
public final class k implements ImageLoader {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f88735a;

    /* renamed from: b, reason: collision with root package name */
    private final String f88736b;

    /* loaded from: classes10.dex */
    public static final class a implements PikazonLoaderCallback<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Drawable, Unit> f88737a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Drawable, Unit> function1) {
            this.f88737a = function1;
        }

        @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
        public final void onLoadFailed(Exception exc) {
            PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
        }

        @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
        public final void onLoadSuccessful(Drawable drawable) {
            Drawable drawable2 = drawable;
            PikazonLoaderCallback.DefaultImpls.onLoadSuccessful(this, drawable2);
            this.f88737a.invoke(drawable2);
        }
    }

    public k(@NotNull String namespace, String str) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        this.f88735a = namespace;
        this.f88736b = str;
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public final void load(@NotNull ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ru.ozon.android.messenger.utils.image.c.a(imageView, str, new d.a(this.f88735a, this.f88736b));
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public final void loadCircle(@NotNull ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ImageViewExtKt.loadCircleImage$default(imageView, str, null, 2, null);
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public final void loadCropAndRoundInDark(@NotNull ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!ThemeExtKt.isDarkThemeActive(context)) {
            loadRoundCorners(imageView, str);
        } else {
            ImageViewExtKt.load$default(imageView, str != null ? ru.ozon.android.messenger.utils.n.b(str, this.f88736b, this.f88735a) : null, C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(0, null, 3, null)), null, null, null, false, null, 124, null);
            ThemeExtKt.setParandjaForDarkTheme(imageView);
        }
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public final void loadCropInDark(@NotNull ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!ThemeExtKt.isDarkThemeActive(context)) {
            load(imageView, str);
        } else {
            ImageViewExtKt.load$default(imageView, str != null ? ru.ozon.android.messenger.utils.n.b(str, this.f88736b, this.f88735a) : null, C7714v.a0(ImageTransformation.CropOnWhite.INSTANCE), null, null, null, false, null, 124, null);
            ThemeExtKt.setParandjaForDarkTheme(imageView);
        }
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public final void loadRoundCorners(@NotNull ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        ImageViewExtKt.loadWithRoundCornersRes$default(imageView, str, null, 2, null);
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public final void load(@NotNull Context context, String str, int i11, int i12, @NotNull Function1<? super Drawable, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        ContextExtKt.load(context, str != null ? ru.ozon.android.messenger.utils.n.b(str, this.f88736b, this.f88735a) : null, (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new a(block), (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : new ImageSize(i11, i12));
    }
}
