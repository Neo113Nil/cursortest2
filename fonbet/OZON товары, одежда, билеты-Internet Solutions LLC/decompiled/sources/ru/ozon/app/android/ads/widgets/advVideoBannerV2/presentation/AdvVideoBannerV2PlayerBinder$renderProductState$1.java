package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import Sc.o;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.databinding.WidgetAdvVideoBannerV2NewBinding;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvBannerVideoV2VO;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.packshotProduct.AdvVideoBannerV2PackshotProductBinderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.view.AdvVideoBannerV2ViewNew;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2PlayerBinder$renderProductState$1 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
    final /* synthetic */ AdvBannerVideoV2VO $item;
    final /* synthetic */ AdvVideoBannerV2ViewModelNew.ProductState $productState;
    final /* synthetic */ AdvVideoBannerV2PlayerBinder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvVideoBannerV2ViewModelNew.ProductState.values().length];
            try {
                iArr[AdvVideoBannerV2ViewModelNew.ProductState.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvVideoBannerV2ViewModelNew.ProductState.PREVIEW_VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvVideoBannerV2ViewModelNew.ProductState.PACKSHOT_VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvVideoBannerV2ViewModelNew.ProductState.EMPTY_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2PlayerBinder$renderProductState$1(AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder, AdvVideoBannerV2ViewModelNew.ProductState productState, AdvBannerVideoV2VO advBannerVideoV2VO) {
        super(2);
        this.this$0 = advVideoBannerV2PlayerBinder;
        this.$productState = productState;
        this.$item = advBannerVideoV2VO;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AsyncFrameLayout asyncFrameLayout, View view) {
        invoke2(asyncFrameLayout, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AsyncFrameLayout invokeWhenInflated, View it) {
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding;
        AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew;
        AdvVideoBannerV2PackshotProductBinderNew advVideoBannerV2PackshotProductBinderNew2;
        AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew;
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding2;
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew;
        AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew2;
        WidgetAdvVideoBannerV2NewBinding widgetAdvVideoBannerV2NewBinding3;
        AdvVideoBannerV2ViewNew advVideoBannerV2ViewNew2;
        Intrinsics.checkNotNullParameter(invokeWhenInflated, "$this$invokeWhenInflated");
        Intrinsics.checkNotNullParameter(it, "it");
        widgetAdvVideoBannerV2NewBinding = this.this$0.binding;
        if (widgetAdvVideoBannerV2NewBinding == null) {
            return;
        }
        widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.getVolumeImageButton().setVisibility(this.$productState != AdvVideoBannerV2ViewModelNew.ProductState.PACKSHOT_VISIBLE ? 0 : 8);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.$productState.ordinal()];
        if (i11 == 1) {
            widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.hidePackshot();
            advVideoBannerV2PackshotProductBinderNew = this.this$0.packshotBinder;
            advVideoBannerV2PackshotProductBinderNew.setProductVisibility(false);
            widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.hideEmptyState();
            this.this$0.changeProductVisibility(this.$item, false);
            return;
        }
        if (i11 == 2) {
            widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.hidePackshot();
            advVideoBannerV2PackshotProductBinderNew2 = this.this$0.packshotBinder;
            advVideoBannerV2PackshotProductBinderNew2.setProductVisibility(false);
            widgetAdvVideoBannerV2NewBinding.advVideoBannerContainerNew.hideEmptyState();
            this.this$0.changeProductVisibility(this.$item, true);
            return;
        }
        ImageView imageView = null;
        if (i11 == 3) {
            final AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder = this.this$0;
            advVideoBannerV2ViewHolderNew = advVideoBannerV2PlayerBinder.widgetViewHolder;
            AdvBannerVideoV2VO boundData = advVideoBannerV2ViewHolderNew.getBoundData();
            AdvBannerVideoV2VO.PackshotOptions packshotOptions = boundData != null ? boundData.getPackshotOptions() : null;
            String lastFrameUrl = packshotOptions != null ? packshotOptions.getLastFrameUrl() : null;
            Tc.b builder = C7714v.B();
            builder.add(ImageTransformation.CenterCrop.INSTANCE);
            if (packshotOptions != null && (!packshotOptions.getIsLastFrameBlurred())) {
                builder.add(new ImageTransformation.Blur(0, 0, 3, null));
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            Tc.b B11 = builder.B();
            widgetAdvVideoBannerV2NewBinding2 = advVideoBannerV2PlayerBinder.binding;
            if (widgetAdvVideoBannerV2NewBinding2 != null && (advVideoBannerV2ViewNew = widgetAdvVideoBannerV2NewBinding2.advVideoBannerContainerNew) != null) {
                imageView = advVideoBannerV2ViewNew.getPreviewImageView();
            }
            final ImageView imageView2 = imageView;
            if (lastFrameUrl == null || imageView2 == null) {
                advVideoBannerV2PlayerBinder.setPreviewVisibleState();
                return;
            } else {
                ImageViewExtKt.load$default(imageView2, lastFrameUrl, B11, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2PlayerBinder$renderProductState$1$invoke$$inlined$loadAndBlurLastFrameIfNeeded$1
                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadFailed(Exception e11) {
                        PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, e11);
                        advVideoBannerV2PlayerBinder.setPreviewVisibleState();
                    }

                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadSuccessful(Drawable resource) {
                        AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew3;
                        AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew;
                        ViewExtKt.show(imageView2);
                        advVideoBannerV2ViewHolderNew3 = advVideoBannerV2PlayerBinder.widgetViewHolder;
                        AdvBannerVideoV2VO boundData2 = advVideoBannerV2ViewHolderNew3.getBoundData();
                        if (boundData2 != null) {
                            advVideoBannerV2ViewModelNew = advVideoBannerV2PlayerBinder.viewModel;
                            advVideoBannerV2ViewModelNew.setPackshotBlurred(boundData2.getId());
                        }
                        advVideoBannerV2PlayerBinder.setPreviewVisibleState();
                    }
                }, null, null, false, null, 120, null);
                return;
            }
        }
        if (i11 != 4) {
            throw new o();
        }
        final AdvVideoBannerV2PlayerBinder advVideoBannerV2PlayerBinder2 = this.this$0;
        advVideoBannerV2ViewHolderNew2 = advVideoBannerV2PlayerBinder2.widgetViewHolder;
        AdvBannerVideoV2VO boundData2 = advVideoBannerV2ViewHolderNew2.getBoundData();
        AdvBannerVideoV2VO.PackshotOptions packshotOptions2 = boundData2 != null ? boundData2.getPackshotOptions() : null;
        String lastFrameUrl2 = packshotOptions2 != null ? packshotOptions2.getLastFrameUrl() : null;
        Tc.b builder2 = C7714v.B();
        builder2.add(ImageTransformation.CenterCrop.INSTANCE);
        if (packshotOptions2 != null && (!packshotOptions2.getIsLastFrameBlurred())) {
            builder2.add(new ImageTransformation.Blur(0, 0, 3, null));
        }
        Intrinsics.checkNotNullParameter(builder2, "builder");
        Tc.b B12 = builder2.B();
        widgetAdvVideoBannerV2NewBinding3 = advVideoBannerV2PlayerBinder2.binding;
        if (widgetAdvVideoBannerV2NewBinding3 != null && (advVideoBannerV2ViewNew2 = widgetAdvVideoBannerV2NewBinding3.advVideoBannerContainerNew) != null) {
            imageView = advVideoBannerV2ViewNew2.getPreviewImageView();
        }
        final ImageView imageView3 = imageView;
        if (lastFrameUrl2 == null || imageView3 == null) {
            advVideoBannerV2PlayerBinder2.setEmptyState();
        } else {
            ImageViewExtKt.load$default(imageView3, lastFrameUrl2, B12, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2PlayerBinder$renderProductState$1$invoke$$inlined$loadAndBlurLastFrameIfNeeded$2
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception e11) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, e11);
                    advVideoBannerV2PlayerBinder2.setEmptyState();
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew3;
                    AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew;
                    ViewExtKt.show(imageView3);
                    advVideoBannerV2ViewHolderNew3 = advVideoBannerV2PlayerBinder2.widgetViewHolder;
                    AdvBannerVideoV2VO boundData3 = advVideoBannerV2ViewHolderNew3.getBoundData();
                    if (boundData3 != null) {
                        advVideoBannerV2ViewModelNew = advVideoBannerV2PlayerBinder2.viewModel;
                        advVideoBannerV2ViewModelNew.setPackshotBlurred(boundData3.getId());
                    }
                    advVideoBannerV2PlayerBinder2.setEmptyState();
                }
            }, null, null, false, null, 120, null);
        }
    }
}
