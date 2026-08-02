package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel;

import Sc.InterfaceC4008j;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelConstants;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelItemVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 /2\u00020\u0001:\u0001/B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0018\u001a\u00020\u0006*\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010&\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/rightpanel/RightPanelItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "", "lastItemBottomInset", "()I", "Landroid/widget/ImageView;", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "loadIcon", "(Landroid/widget/ImageView;Lru/ozon/uni/atoms/data/button/Icon;)V", "", "colors", "loadIconWithGradient", "(Landroid/widget/ImageView;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/List;)V", "Landroid/graphics/drawable/Drawable;", "resource", "applyGradient", "(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Ljava/util/List;)V", "Landroid/graphics/Bitmap;", "originalBitmap", "", "getGradientBitmap", "(Landroid/graphics/Bitmap;[I)Landroid/graphics/Bitmap;", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "rightPanelItem", "", "hasTextBelow", "isLastItem", "LWZ/l;", "tokenizedAnalytics", "bind", "(Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;ZZLWZ/l;)V", "iconView$delegate", "LSc/j;", "getIconView", "()Landroid/widget/ImageView;", "iconView", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class RightPanelItemView extends LinearLayout {
    private AtomAction action;

    /* renamed from: iconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconView;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelItemView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$onAction = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AtomAction atomAction = RightPanelItemView.this.action;
            if (atomAction != null) {
                this.$onAction.invoke(atomAction);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightPanelItemView(@NotNull Context context, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.iconView = LazyUtilsKt.unsafeLazy(new RightPanelItemView$iconView$2(context, this));
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(Dimens.INSTANCE.getDP_56(), -2));
        setGravity(1);
        ViewExtKt.setOnClickListenerThrottle(this, 800L, new AnonymousClass1(onAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGradient(ImageView imageView, Drawable drawable, List<Integer> list) {
        if (!(drawable instanceof VectorDrawable)) {
            imageView.setImageDrawable(drawable);
            return;
        }
        Bitmap gradientBitmap = getGradientBitmap(b.b(drawable, 0, 0, 7), C7714v.T0(list));
        Resources resources = imageView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        imageView.setImageDrawable(new BitmapDrawable(resources, gradientBitmap));
    }

    private final Bitmap getGradientBitmap(Bitmap originalBitmap, int[] colors) {
        int width = originalBitmap.getWidth();
        int height = originalBitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(originalBitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        float f7 = height;
        paint.setShader(new LinearGradient(0.0f, 0.0f, f7, f7, colors, (float[]) null, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setAntiAlias(true);
        canvas.drawRect(0.0f, 0.0f, width, f7, paint);
        return createBitmap;
    }

    private final ImageView getIconView() {
        return (ImageView) this.iconView.getValue();
    }

    private final int lastItemBottomInset() {
        Drawable drawable = getIconView().getDrawable();
        if (drawable == null) {
            return 0;
        }
        int dp_48 = (Dimens.INSTANCE.getDP_48() - drawable.getIntrinsicHeight()) / 2;
        if (dp_48 < 0) {
            return 0;
        }
        return dp_48;
    }

    private final void loadIcon(ImageView imageView, Icon icon) {
        ViewParent parent = imageView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setContentDescription(icon.getImage());
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, icon.getTintColor()));
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable loadDrawableByName = ExtensionsKt.loadDrawableByName(context2, icon.getImage());
        if (loadDrawableByName != null) {
            imageView.setImageDrawable(loadDrawableByName);
        } else {
            ImageViewExtKt.load$default(imageView, icon.getImage(), null, null, null, null, false, null, 126, null);
        }
    }

    private final void loadIconWithGradient(final ImageView imageView, Icon icon, final List<Integer> list) {
        ViewParent parent = imageView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setContentDescription(icon.getImage() + "_gradient");
        }
        ThemeExtKt.tint(imageView, null);
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable loadDrawableByName = ExtensionsKt.loadDrawableByName(context, icon.getImage());
        if (loadDrawableByName != null) {
            applyGradient(imageView, loadDrawableByName, list);
        } else {
            ImageViewExtKt.load$default(imageView, icon.getImage(), null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.rightpanel.RightPanelItemView$loadIconWithGradient$2
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception exc) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    RightPanelItemView.this.applyGradient(imageView, resource, list);
                }
            }, null, null, false, null, 122, null);
        }
    }

    public final void bind(@NotNull RightPanelItemVO rightPanelItem, boolean hasTextBelow, boolean isLastItem, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(rightPanelItem, "rightPanelItem");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        t tokenizedEvent = rightPanelItem.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        this.action = rightPanelItem.getAction();
        List<String> iconGradient = rightPanelItem.getIconGradient();
        if (iconGradient == null || iconGradient.size() < 2) {
            loadIcon(getIconView(), rightPanelItem.getIcon());
        } else {
            List<String> list = iconGradient;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (String str : list) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                arrayList.add(styleParser.parseColor(context, str));
            }
            if (arrayList.contains(null)) {
                loadIcon(getIconView(), rightPanelItem.getIcon());
            } else {
                loadIconWithGradient(getIconView(), rightPanelItem.getIcon(), C7714v.I(arrayList));
            }
        }
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), hasTextBelow ? 0 : isLastItem ? lastItemBottomInset() : RightPanelConstants.INSTANCE.getBOTTOM_PADDING_NO_TEXT());
    }
}
