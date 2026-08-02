package ru.ozon.app.android.atoms.v3.molecules.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.BxAtomConfig;
import ru.ozon.app.android.atoms.common.navigation.AtomRouter;
import ru.ozon.app.android.atoms.databinding.GalleryViewBinding;
import ru.ozon.app.android.atoms.v3.molecules.list.models.GalleryModel;
import ru.ozon.app.android.atoms.v3.molecules.list.models.MapperKt;
import ru.ozon.app.android.atoms.v3.molecules.list.models.OpenGalleryParams;
import ru.ozon.app.android.atoms.v3.molecules.list.rv.GalleryRecyclerViewAdapter;
import ru.ozon.app.android.atoms.v3.molecules.list.rv.OffsetDecorator;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.common.ImageLoader;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/GalleryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "position", "", "onPhotoClick", "(I)V", "onCounterClick", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryModel;", "model", "navigate", "(Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryModel;I)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", "", "enabled", "gradientEnabled", "(Z)V", "Lru/ozon/uni/atoms/common/ImageLoader;", "imageLoader", "setImageLoader", "(Lru/ozon/uni/atoms/common/ImageLoader;)V", "submitGalleryData", "(Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryModel;)V", "Lru/ozon/app/android/atoms/databinding/GalleryViewBinding;", "binding", "Lru/ozon/app/android/atoms/databinding/GalleryViewBinding;", "Lru/ozon/app/android/atoms/v3/molecules/list/rv/GalleryRecyclerViewAdapter;", "adapter", "Lru/ozon/app/android/atoms/v3/molecules/list/rv/GalleryRecyclerViewAdapter;", "galleryModel", "Lru/ozon/app/android/atoms/v3/molecules/list/models/GalleryModel;", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GalleryView extends ConstraintLayout implements AtomView {

    @NotNull
    private final GalleryRecyclerViewAdapter adapter;

    @NotNull
    private final GalleryViewBinding binding;
    private GalleryModel galleryModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.v3.molecules.list.GalleryView$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<Integer, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, GalleryView.class, "onPhotoClick", "onPhotoClick(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            ((GalleryView) this.receiver).onPhotoClick(i11);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.v3.molecules.list.GalleryView$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<Integer, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, GalleryView.class, "onCounterClick", "onCounterClick(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(int i11) {
            ((GalleryView) this.receiver).onCounterClick(i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void navigate(GalleryModel model, int position) {
        AtomRouter router$atoms_prodGoogleAllVendorsRelease = BxAtomConfig.INSTANCE.getRouter$atoms_prodGoogleAllVendorsRelease();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        router$atoms_prodGoogleAllVendorsRelease.navigateFirst(U.i(new Pair("ru.ozon.app.android.GalleryNavigator.OpenGalleryParams", new OpenGalleryParams(context, model.getItems(), position))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCounterClick(int position) {
        GalleryModel galleryModel = this.galleryModel;
        if (galleryModel != null) {
            navigate(galleryModel, position);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPhotoClick(int position) {
        GalleryModel galleryModel = this.galleryModel;
        if (galleryModel != null) {
            navigate(galleryModel, position);
        }
    }

    public final void gradientEnabled(boolean enabled) {
        ImageView galleryGradientRightV = this.binding.galleryGradientRightV;
        Intrinsics.checkNotNullExpressionValue(galleryGradientRightV, "galleryGradientRightV");
        ViewExtKt.showOrGone(galleryGradientRightV, Boolean.valueOf(enabled));
        ImageView galleryGradientLeftV = this.binding.galleryGradientLeftV;
        Intrinsics.checkNotNullExpressionValue(galleryGradientLeftV, "galleryGradientLeftV");
        ViewExtKt.showOrGone(galleryGradientLeftV, Boolean.valueOf(enabled));
    }

    public final void setImageLoader(@NotNull ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.adapter.setImageLoader(imageLoader);
    }

    public final void setTitle(String title) {
        TextView galleryTitle = this.binding.galleryTitle;
        Intrinsics.checkNotNullExpressionValue(galleryTitle, "galleryTitle");
        TextViewExtKt.setTextOrGone(galleryTitle, title);
    }

    public final void submitGalleryData(@NotNull GalleryModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.galleryModel = model;
        this.adapter.submitList(MapperKt.toVO(model));
    }

    public /* synthetic */ GalleryView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        GalleryViewBinding inflate = GalleryViewBinding.inflate(LayoutInflater.from(context), this);
        this.binding = inflate;
        GalleryRecyclerViewAdapter galleryRecyclerViewAdapter = new GalleryRecyclerViewAdapter(new AnonymousClass1(this), new AnonymousClass2(this));
        this.adapter = galleryRecyclerViewAdapter;
        inflate.galleryImages.setAdapter(galleryRecyclerViewAdapter);
        inflate.galleryImages.addItemDecoration(new OffsetDecorator());
        ImageView galleryGradientLeftV = inflate.galleryGradientLeftV;
        Intrinsics.checkNotNullExpressionValue(galleryGradientLeftV, "galleryGradientLeftV");
        ThemeExtKt.semanticTint(galleryGradientLeftV, R$color.oz_semantic_bg_secondary);
        ImageView galleryGradientRightV = inflate.galleryGradientRightV;
        Intrinsics.checkNotNullExpressionValue(galleryGradientRightV, "galleryGradientRightV");
        ThemeExtKt.semanticTint(galleryGradientRightV, R$color.oz_semantic_bg_secondary);
    }
}
