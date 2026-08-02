package ru.ozon.app.android.regulardraw.widgets.morkovskBackgroundImage.presentation;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.regulardraw.utils.UtilKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskBackgroundImage/presentation/MorkovskBackgroundImageViewHolder;", "Ld20/b;", "Lru/ozon/app/android/regulardraw/widgets/morkovskBackgroundImage/presentation/MorkovskBackgroundImageVO;", "Ll10/i;", "container", "<init>", "(Ll10/i;)V", "", "backgroundImage", "Landroid/graphics/drawable/ColorDrawable;", "colorDrawable", "", "loadImage", "(Ljava/lang/String;Landroid/graphics/drawable/ColorDrawable;)V", "Landroid/graphics/drawable/Drawable;", "image", "setImage", "(Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/Drawable;)V", "Landroid/view/View;", "Lru/ozon/app/android/pikazon/image/ImageSize;", "createImageSize", "(Landroid/view/View;)Lru/ozon/app/android/pikazon/image/ImageSize;", "item", "bind", "(Lru/ozon/app/android/regulardraw/widgets/morkovskBackgroundImage/presentation/MorkovskBackgroundImageVO;)V", "Ll10/i;", "Landroid/view/ViewGroup;", "composerRootCl", "Landroid/view/ViewGroup;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskBackgroundImageViewHolder extends AbstractC6065b<MorkovskBackgroundImageVO> {

    @NotNull
    private final ViewGroup composerRootCl;

    @NotNull
    private final i container;
    private final View metricView;

    public MorkovskBackgroundImageViewHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.composerRootCl = ComposerViewExtensionKt.composerContainer(container.Y());
    }

    private final ImageSize createImageSize(View view) {
        int i11 = 0;
        int width = view.getWidth() > 0 ? view.getWidth() : view.getMeasuredWidth() > 0 ? view.getMeasuredWidth() : 0;
        if (view.getHeight() > 0) {
            i11 = view.getHeight();
        } else if (view.getMeasuredHeight() > 0) {
            i11 = view.getMeasuredHeight();
        }
        if (width <= 0 || i11 <= 0) {
            return null;
        }
        return new ImageSize(width, i11);
    }

    private final void loadImage(String backgroundImage, final ColorDrawable colorDrawable) {
        if (backgroundImage == null) {
            setImage(colorDrawable, null);
            return;
        }
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        ContextExtKt.load(L11, backgroundImage, (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskBackgroundImage.presentation.MorkovskBackgroundImageViewHolder$loadImage$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                MorkovskBackgroundImageViewHolder.this.setImage(colorDrawable, resource);
            }
        }, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : LoadPriority.HIGH, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : createImageSize(this.composerRootCl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setImage(ColorDrawable colorDrawable, Drawable image) {
        if (getLifecycle().b() == AbstractC5434v.b.DESTROYED) {
            return;
        }
        InsetDrawable insetDrawable = image != null ? new InsetDrawable(image, 0, UtilKt.getStatusBarHeight(this.container.K()), 0, 0) : null;
        ViewGroup viewGroup = this.composerRootCl;
        Drawable[] elements = {colorDrawable, insetDrawable};
        Intrinsics.checkNotNullParameter(elements, "elements");
        viewGroup.setBackground(new LayerDrawable((Drawable[]) C7705l.B(elements).toArray(new Drawable[0])));
        ViewGroup viewGroup2 = this.composerRootCl;
        viewGroup2.setPadding(viewGroup2.getPaddingLeft(), 0, viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull MorkovskBackgroundImageVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String backgroundColor = item.getBackgroundColor();
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        ColorDrawable colorDrawable = new ColorDrawable(UtilKt.parseColor(backgroundColor, L11));
        this.composerRootCl.setBackground(colorDrawable);
        loadImage(item.getBackgroundImage(), colorDrawable);
    }
}
