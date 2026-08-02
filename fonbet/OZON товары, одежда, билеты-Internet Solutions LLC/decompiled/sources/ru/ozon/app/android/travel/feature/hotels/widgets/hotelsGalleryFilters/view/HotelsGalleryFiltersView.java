package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.view;

import Am.C2438a;
import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersVI;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020!0%J\b\u0010'\u001a\u00020!H\u0002J\b\u0010(\u001a\u00020!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/view/HotelsGalleryFiltersView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "ds", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dp88", "", "dp100", "aspect", "Lru/ozon/uni/android/atom/aspect/AspectView;", "getAspect", "()Lru/ozon/uni/android/atom/aspect/AspectView;", "aspect$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "image", "Landroidx/appcompat/widget/AppCompatImageView;", "getImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "image$delegate", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badge$delegate", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitle", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "title$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$FiltersItem;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "addViews", "setupConstraints", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFiltersView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsGalleryFiltersView.class, "aspect", "getAspect()Lru/ozon/uni/android/atom/aspect/AspectView;", 0), C2438a.c(HotelsGalleryFiltersView.class, "image", "getImage()Landroidx/appcompat/widget/AppCompatImageView;", 0), C2438a.c(HotelsGalleryFiltersView.class, "badge", "getBadge()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(HotelsGalleryFiltersView.class, SelectionItemFormDTO.TITLE_FIELD_NAME, "getTitle()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;

    /* renamed from: aspect$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate aspect;

    /* renamed from: badge$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate badge;
    private final int dp100;
    private final int dp88;

    @NotNull
    private final DesignSystemDimensProvider ds;

    /* renamed from: image$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate image;

    /* renamed from: title$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFiltersView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ds = new DesignSystemDimensProvider(context, null, 2, null);
        this.dp88 = ResourceExtKt.toPx(88, context);
        this.dp100 = ResourceExtKt.toPx(100, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.aspect = new PreCreationViewPoolDelegate(context2, N.b(AspectView.class), new HotelsGalleryFiltersView$special$$inlined$preCreationViewPool$default$1(this), new HotelsGalleryFiltersView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.image = new PreCreationViewPoolDelegate(context3, N.b(AppCompatImageView.class), new HotelsGalleryFiltersView$special$$inlined$preCreationViewPool$default$3(this), new HotelsGalleryFiltersView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.badge = new PreCreationViewPoolDelegate(context4, N.b(BadgeView.class), new HotelsGalleryFiltersView$special$$inlined$preCreationViewPool$default$5(this), new HotelsGalleryFiltersView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.title = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new HotelsGalleryFiltersView$special$$inlined$preCreationViewPool$default$7(this), new HotelsGalleryFiltersView$special$$inlined$preCreationViewPool$default$8());
        addViews();
        setupConstraints();
    }

    private final void addViews() {
        addView(getAspect());
        addView(getImage());
        addView(getBadge());
        addView(getTitle());
    }

    private final AspectView getAspect() {
        return (AspectView) this.aspect.getValue(this, $$delegatedProperties[0]);
    }

    private final BadgeView getBadge() {
        return (BadgeView) this.badge.getValue(this, $$delegatedProperties[2]);
    }

    private final AppCompatImageView getImage() {
        return (AppCompatImageView) this.image.getValue(this, $$delegatedProperties[1]);
    }

    private final TextAtomV2View getTitle() {
        return (TextAtomV2View) this.title.getValue(this, $$delegatedProperties[3]);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.topToParent(dVar, getAspect());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getAspect());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getAspect());
        ConstraintLayoutExtensionsKt.startToStart(dVar, getImage(), getAspect());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getImage(), getAspect());
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getImage(), getAspect());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getImage(), getAspect());
        ConstraintLayoutExtensionsKt.endToEnd(dVar, getBadge(), getAspect(), this.ds.getMargin10());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getBadge(), getAspect(), this.ds.getMargin10());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getTitle());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getTitle(), getAspect(), this.ds.getMargin8());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getTitle());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getTitle());
        dVar.f(this);
    }

    public final void bind(@NotNull HotelsGalleryFiltersVI.FiltersItem item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        AspectHolderKt.bind(getAspect(), item.getAspect(), onAction);
        ImageViewExtKt.load$default(getImage(), item.getImage(), C7714v.b0(ImageTransformation.CenterCrop.INSTANCE, new ImageTransformation.RoundedCorners((int) this.ds.getRadius10(), ImageTransformation.RoundedCorners.CornerType.ALL)), null, null, null, false, null, 124, null);
        BadgeHolderKt.bind$default(getBadge(), item.getBadge(), (Function1) null, 2, (Object) null);
        TextHolderKt.bind$default(getTitle(), item.getTitle(), null, 2, null);
    }
}
