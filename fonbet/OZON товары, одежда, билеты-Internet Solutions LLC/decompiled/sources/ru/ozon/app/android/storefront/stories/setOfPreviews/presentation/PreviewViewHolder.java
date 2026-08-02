package ru.ozon.app.android.storefront.stories.setOfPreviews.presentation;

import WZ.l;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonItemVO;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.ItemVH;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.PreviewItemVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewViewHolder;", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/ItemVH;", "Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewView;", "view", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/PreviewItemVO;", "", "", "onImageLoaded", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewView;Lkotlin/jvm/functions/Function2;LWZ/l;)V", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonItemVO;", "item", "position", "bindItem", "(Lru/ozon/app/android/storefront/stories/setContainer/data/CommonItemVO;I)V", "Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewView;", "Lkotlin/jvm/functions/Function2;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreviewViewHolder extends ItemVH {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<ImageTransformation> transformations = C7714v.b0(ImageTransformation.CenterCrop.INSTANCE, new ImageTransformation.RoundedCorners(ResourceExtKt.toPx(12), null, 2, null));

    @NotNull
    private final Function2<PreviewItemVO, Integer, Unit> onImageLoaded;

    @NotNull
    private final PreviewView view;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/setOfPreviews/presentation/PreviewViewHolder$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewViewHolder(@NotNull PreviewView view, @NotNull Function2<? super PreviewItemVO, ? super Integer, Unit> onImageLoaded, @NotNull l tokenizedAnalytics) {
        super(view, tokenizedAnalytics);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onImageLoaded, "onImageLoaded");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.onImageLoaded = onImageLoaded;
    }

    @Override // ru.ozon.app.android.storefront.stories.setContainer.presentation.ItemVH
    public void bindItem(@NotNull final CommonItemVO item, final int position) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof PreviewItemVO) {
            super.bindItem(item, position);
            PreviewView previewView = this.view;
            previewView.setContentDescription(StringProvider.getString(R$string.storefront_story_preview_android, Integer.valueOf(position)));
            PreviewItemVO previewItemVO = (PreviewItemVO) item;
            previewView.setTransitionName(String.valueOf(previewItemVO.hashCode()));
            ImageViewExtKt.load$default(previewView, previewItemVO.getImage(), transformations, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.storefront.stories.setOfPreviews.presentation.PreviewViewHolder$bindItem$1$1
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception exc) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    Function2 function2;
                    function2 = PreviewViewHolder.this.onImageLoaded;
                    function2.invoke(item, Integer.valueOf(position));
                }
            }, null, null, false, null, 120, null);
            previewView.setHideFrame(previewItemVO.getHideFrame());
        }
    }
}
