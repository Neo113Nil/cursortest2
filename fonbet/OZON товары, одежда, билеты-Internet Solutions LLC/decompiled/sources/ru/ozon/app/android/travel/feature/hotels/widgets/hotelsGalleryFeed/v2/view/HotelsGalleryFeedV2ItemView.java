package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.view;

import Am.C2438a;
import Sc.o;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation.HotelsGalleryFeedV2VI;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020 \u0018\u00010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/view/HotelsGalleryFeedV2ItemView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "ds", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "getDs", "()Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "getImageView", "()Lru/ozon/uni/android/atom/image/Image;", "imageView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "getIcon", "()Lru/ozon/uni/android/atom/icon/IconView;", "icon$delegate", "text", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getText", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "text$delegate", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "button$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFeedV2ItemView extends FrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsGalleryFeedV2ItemView.class, "imageView", "getImageView()Lru/ozon/uni/android/atom/image/Image;", 0), C2438a.c(HotelsGalleryFeedV2ItemView.class, "icon", "getIcon()Lru/ozon/uni/android/atom/icon/IconView;", 0), C2438a.c(HotelsGalleryFeedV2ItemView.class, "text", "getText()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(HotelsGalleryFeedV2ItemView.class, "button", "getButton()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};
    public static final int $stable;

    /* renamed from: button$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate button;

    @NotNull
    private final DesignSystemDimensProvider ds;

    /* renamed from: icon$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate icon;

    /* renamed from: imageView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate imageView;

    /* renamed from: text$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate text;

    static {
        int i11 = ButtonV3View.$stable;
        int i12 = PreCreationViewPoolDelegate.$stable;
        $stable = i11 | i12 | TextAtomV2View.$stable | i12 | IconView.$stable | i12 | Image.$stable | i12 | DesignSystemDimensProvider.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFeedV2ItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ds = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.imageView = new PreCreationViewPoolDelegate(context2, N.b(Image.class), new HotelsGalleryFeedV2ItemView$special$$inlined$preCreationViewPool$default$1(this), new HotelsGalleryFeedV2ItemView$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.icon = new PreCreationViewPoolDelegate(context3, N.b(IconView.class), new HotelsGalleryFeedV2ItemView$special$$inlined$preCreationViewPool$default$3(this), new HotelsGalleryFeedV2ItemView$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.text = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new HotelsGalleryFeedV2ItemView$special$$inlined$preCreationViewPool$default$5(this), new HotelsGalleryFeedV2ItemView$special$$inlined$preCreationViewPool$default$6());
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.button = new PreCreationViewPoolDelegate(context5, N.b(ButtonV3View.class), new HotelsGalleryFeedV2ItemView$special$$inlined$preCreationViewPool$default$7(this), new HotelsGalleryFeedV2ItemView$special$$inlined$preCreationViewPool$default$8(this));
        addView(getImageView());
        addView(getIcon());
        addView(getText());
        addView(getButton());
    }

    private final ButtonV3View getButton() {
        return (ButtonV3View) this.button.getValue(this, $$delegatedProperties[3]);
    }

    private final IconView getIcon() {
        return (IconView) this.icon.getValue(this, $$delegatedProperties[1]);
    }

    private final Image getImageView() {
        return (Image) this.imageView.getValue(this, $$delegatedProperties[0]);
    }

    private final TextAtomV2View getText() {
        return (TextAtomV2View) this.text.getValue(this, $$delegatedProperties[2]);
    }

    public final void bind(@NotNull HotelsGalleryFeedV2VI item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        ViewExtKt.gone(getImageView());
        ViewExtKt.gone(getIcon());
        ViewExtKt.gone(getText());
        ViewExtKt.gone(getButton());
        if (item instanceof HotelsGalleryFeedV2VI.GalleryImageItem) {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(getImageView());
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(getIcon());
            HotelsGalleryFeedV2VI.GalleryImageItem galleryImageItem = (HotelsGalleryFeedV2VI.GalleryImageItem) item;
            ImageHolderKt.bind$default(getImageView(), galleryImageItem.getImage(), null, 2, null);
            IconHolderKt.bindOrGone$default(getIcon(), galleryImageItem.getVideoControlIcon(), null, 2, null);
            return;
        }
        if (item instanceof HotelsGalleryFeedV2VI.TagTextItem) {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(getText());
            TextHolderKt.bind$default(getText(), ((HotelsGalleryFeedV2VI.TagTextItem) item).getText(), null, 2, null);
        } else {
            if (!(item instanceof HotelsGalleryFeedV2VI.MoreButtonItem)) {
                throw new o();
            }
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.show(getButton());
            ButtonV3HolderKt.bind(getButton(), ((HotelsGalleryFeedV2VI.MoreButtonItem) item).getButton(), onAction);
        }
    }

    @NotNull
    public final DesignSystemDimensProvider getDs() {
        return this.ds;
    }
}
