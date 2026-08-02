package ru.ozon.app.android.storefront.core.socialAtoms.rightPanel;

import WZ.l;
import WZ.m;
import WZ.t;
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.b;
import java.util.ArrayList;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.core.atoms.databinding.RightPanelItemBinding;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomHolderKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ExtensionsKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001-B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\b*\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemViewHolder;", "Ljk0/j;", "Landroid/view/ViewGroup;", "parent", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "Lru/ozon/app/android/storefront/core/atoms/databinding/RightPanelItemBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;LWZ/l;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/storefront/core/atoms/databinding/RightPanelItemBinding;)V", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;", "rightPanelItem", "trackView", "(Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;)V", "Landroid/widget/ImageView;", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "loadIcon", "(Landroid/widget/ImageView;Lru/ozon/uni/atoms/data/button/Icon;)V", "", "", "colors", "loadIconWithGradient", "(Landroid/widget/ImageView;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/List;)V", "Landroid/graphics/drawable/Drawable;", "resource", "applyGradient", "(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Ljava/util/List;)V", "Landroid/graphics/Bitmap;", "originalBitmap", "", "getGradientBitmap", "(Landroid/graphics/Bitmap;[I)Landroid/graphics/Bitmap;", "", "isLastItem", "bind", "(Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemVO;Z)V", "LWZ/l;", "Lru/ozon/app/android/storefront/core/atoms/databinding/RightPanelItemBinding;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RightPanelItemViewHolder extends j {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private AtomAction action;

    @NotNull
    private final RightPanelItemBinding binding;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelItemViewHolder$1, reason: invalid class name */
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
            AtomAction atomAction = RightPanelItemViewHolder.this.action;
            if (atomAction != null) {
                this.$onAction.invoke(atomAction);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemViewHolder$Companion;", "", "<init>", "()V", "MIN_COLORS_SIZE", "", "CLICK_THROTTLE_TIME", "", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ RightPanelItemViewHolder(ViewGroup viewGroup, l lVar, Function1 function1, RightPanelItemBinding rightPanelItemBinding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, lVar, function1, (i11 & 8) != 0 ? RightPanelItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false) : rightPanelItemBinding);
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
        canvas.drawRect(0.0f, 0.0f, width, f7, paint);
        return createBitmap;
    }

    private final void loadIcon(ImageView imageView, Icon icon) {
        ViewParent parent = imageView.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).setContentDescription(icon.getImage());
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
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).setContentDescription(icon.getImage() + "_gradient");
        ThemeExtKt.tint(imageView, null);
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable loadDrawableByName = ExtensionsKt.loadDrawableByName(context, icon.getImage());
        if (loadDrawableByName != null) {
            applyGradient(imageView, loadDrawableByName, list);
        } else {
            ImageViewExtKt.load$default(imageView, icon.getImage(), null, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelItemViewHolder$loadIconWithGradient$2
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception exc) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    RightPanelItemViewHolder.this.applyGradient(imageView, resource, list);
                }
            }, null, null, false, null, 122, null);
        }
    }

    private final void trackView(RightPanelItemVO rightPanelItem) {
        t tokenizedEvent = rightPanelItem.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }

    public final void bind(@NotNull RightPanelItemVO rightPanelItem, boolean isLastItem) {
        Intrinsics.checkNotNullParameter(rightPanelItem, "rightPanelItem");
        trackView(rightPanelItem);
        this.action = rightPanelItem.getAction();
        LinearLayout linearLayout = this.binding.panelItem;
        List<String> iconGradient = rightPanelItem.getIconGradient();
        if (iconGradient == null || iconGradient.size() < 2) {
            ImageView itemImage = this.binding.itemImage;
            Intrinsics.checkNotNullExpressionValue(itemImage, "itemImage");
            loadIcon(itemImage, rightPanelItem.getIcon());
        } else {
            List<String> list = iconGradient;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (String str : list) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                arrayList.add(styleParser.parseColor(context, str));
            }
            if (arrayList.contains(null)) {
                ImageView itemImage2 = this.binding.itemImage;
                Intrinsics.checkNotNullExpressionValue(itemImage2, "itemImage");
                loadIcon(itemImage2, rightPanelItem.getIcon());
            } else {
                ImageView itemImage3 = this.binding.itemImage;
                Intrinsics.checkNotNullExpressionValue(itemImage3, "itemImage");
                loadIconWithGradient(itemImage3, rightPanelItem.getIcon(), C7714v.I(arrayList));
            }
        }
        SocialTextAtomDTO text = rightPanelItem.getText();
        if (text == null) {
            this.binding.itemText.setVisibility(8);
            int bottom_padding_no_text = isLastItem ? 0 : RightPanelConstants.INSTANCE.getBOTTOM_PADDING_NO_TEXT();
            Intrinsics.f(linearLayout);
            ViewExtKt.updatePadding$default(linearLayout, 0, 0, 0, bottom_padding_no_text, 7, null);
            return;
        }
        SocialTextAtomHolderKt.bind$default(this.binding.itemText, text, null, 2, null);
        Unit unit = Unit.f71690a;
        this.binding.itemText.setVisibility(0);
        int bottom_padding_with_text = isLastItem ? 0 : RightPanelConstants.INSTANCE.getBOTTOM_PADDING_WITH_TEXT();
        Intrinsics.f(linearLayout);
        ViewExtKt.updatePadding$default(linearLayout, 0, 0, 0, bottom_padding_with_text, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RightPanelItemViewHolder(@NotNull ViewGroup parent, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull RightPanelItemBinding binding) {
        super(r2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(binding, "binding");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.binding = binding;
        LinearLayout constraintLayout2 = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        ViewExtKt.setOnClickListenerThrottle(constraintLayout2, 800L, new AnonymousClass1(onAction));
    }
}
