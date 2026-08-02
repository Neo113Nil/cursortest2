package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter.images;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import y7.k;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lcom/google/android/material/imageview/ShapeableImageView;", "<unused var>", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ToursSearchResultItemImageAdapterDelegateKt$toursSearchResultItemImageAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, TypedViewBinding<ShapeableImageView>> {
    public static final ToursSearchResultItemImageAdapterDelegateKt$toursSearchResultItemImageAdapterDelegate$1 INSTANCE = new ToursSearchResultItemImageAdapterDelegateKt$toursSearchResultItemImageAdapterDelegate$1();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/material/imageview/ShapeableImageView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter.images.ToursSearchResultItemImageAdapterDelegateKt$toursSearchResultItemImageAdapterDelegate$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<ShapeableImageView> {
        final /* synthetic */ ViewGroup $root;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewGroup viewGroup) {
            super(0);
            this.$root = viewGroup;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ShapeableImageView invoke() {
            ShapeableImageView shapeableImageView = new ShapeableImageView(this.$root.getContext());
            Context context = shapeableImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            shapeableImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, ResourceExtKt.toPx(164, context)));
            shapeableImageView.setClickable(true);
            shapeableImageView.setFocusable(true);
            shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            k kVar = new k();
            Context context2 = shapeableImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            shapeableImageView.setShapeAppearanceModel(kVar.o(ResourceExtKt.toPxF(12, context2)));
            return shapeableImageView;
        }
    }

    ToursSearchResultItemImageAdapterDelegateKt$toursSearchResultItemImageAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TypedViewBinding<ShapeableImageView> invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "<unused var>");
        Intrinsics.checkNotNullParameter(root, "root");
        return new TypedViewBinding<>(new AnonymousClass1(root));
    }
}
