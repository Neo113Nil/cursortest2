package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation;

import GZ.g;
import Sc.InterfaceC4008j;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.LargeIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpWidgetProductGalleryV2ImageItemBinding;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.PdpGalleryPagerIndicator;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapperKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetGalleryProductButton360Binding;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetGalleryProductButtonBinding;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetGalleryProductButtonPlayBinding;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetProductGalleryV2Binding;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation.GalleryV2VO;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation.GalleryV2ViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.LargeIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003RSTB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0010*\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J#\u0010\u001b\u001a\u00020\u0010*\u00020\u00032\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010&\u001a\u00020%*\u00020\u00032\u0006\u0010!\u001a\u00020\u00192\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\"H\u0002¢\u0006\u0004\b&\u0010'J/\u0010)\u001a\u00020(*\u00020(2\u0006\u0010!\u001a\u00020\u00192\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\"H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R(\u00104\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0018\u0010C\u001a\u00060BR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010HR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010Q\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010M¨\u0006U"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2Wrapper;", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetProductGalleryV2Binding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LGZ/g;", "ozonRouter", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetProductGalleryV2Binding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LGZ/g;)V", "item", "Ll20/d;", "info", "", "initGallery", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetProductGalleryV2Binding;Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2Wrapper;Ll20/d;)V", "bindClassified", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetProductGalleryV2Binding;Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2Wrapper;)V", "hideClassified", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetProductGalleryV2Binding;)V", "disableGallery", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "buttons", "renderButtons", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetProductGalleryV2Binding;Ljava/util/List;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$GalleryItem;", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "toGalleryV2Item", "(Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$GalleryItem;)Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "iconButtonDTO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Landroid/view/View;", "getGalleryButton", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetProductGalleryV2Binding;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;Lkotlin/jvm/functions/Function1;)Landroid/view/View;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/LargeIconButtonView;", "configure", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/LargeIconButtonView;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/LargeIconButtonView;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ImageGalleryItem;", "trackGalleryItemViewEvent", "(Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ImageGalleryItem;)V", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2Wrapper;Ll20/d;)V", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetProductGalleryV2Binding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "LGZ/g;", "allItems", "Ljava/util/List;", "getAllItems", "()Ljava/util/List;", "setAllItems", "(Ljava/util/List;)V", "galleryV2Wrapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2Wrapper;", "getGalleryV2Wrapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2Wrapper;", "setGalleryV2Wrapper", "(Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2Wrapper;)V", "currentItem", "Ll20/d;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2ViewHolder$ProductGalleryAdapter;", "galleryAdapter", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2ViewHolder$ProductGalleryAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lkotlin/jvm/functions/Function1;", "", "icPlayResName$delegate", "LSc/j;", "getIcPlayResName", "()Ljava/lang/String;", "icPlayResName", "ic360ResName$delegate", "getIc360ResName", "ic360ResName", "Companion", "GalleryViewPagerListener", "ProductGalleryAdapter", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV2ViewHolder extends k<GalleryV2Wrapper> {
    private static final int DP_24 = ResourceExtKt.toPx(24);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    public List<? extends GalleryV2VO.GalleryItem> allItems;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final PdpWidgetProductGalleryV2Binding binding;
    private GalleryV2Wrapper currentItem;

    @NotNull
    private final ProductGalleryAdapter galleryAdapter;
    public GalleryV2Wrapper galleryV2Wrapper;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;

    /* renamed from: ic360ResName$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ic360ResName;

    /* renamed from: icPlayResName$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j icPlayResName;
    private d info;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2ViewHolder$GalleryViewPagerListener;", "Landroidx/viewpager/widget/ViewPager$m;", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2ViewHolder;)V", "", "position", "", "onPageSelected", "(I)V", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class GalleryViewPagerListener extends ViewPager.m {
        public GalleryViewPagerListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int position) {
            GalleryV2ViewHolder galleryV2ViewHolder = GalleryV2ViewHolder.this;
            galleryV2ViewHolder.trackGalleryItemViewEvent((GalleryV2VO.ImageGalleryItem) C7714v.Q(position, galleryV2ViewHolder.galleryAdapter.getItems()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010#R6\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2ViewHolder$ProductGalleryAdapter;", "Landroidx/viewpager/widget/a;", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2ViewHolder;)V", "Landroid/view/ViewGroup;", "container", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ImageGalleryItem;", "item", "", "id", "Landroid/view/View;", "initPhoto", "(Landroid/view/ViewGroup;Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$ImageGalleryItem;J)Landroid/view/View;", "voId", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$GalleryItem;", "valueItem", "Lkotlin/Pair;", "", "makeTag", "(JLru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2VO$GalleryItem;)Lkotlin/Pair;", "", "obj", "getItemPosition", "(Ljava/lang/Object;)I", "position", "instantiateItem", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "view", "", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "getCount", "()I", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class ProductGalleryAdapter extends androidx.viewpager.widget.a {

        @NotNull
        private List<GalleryV2VO.ImageGalleryItem> items = K.f71697a;

        public ProductGalleryAdapter() {
        }

        private final View initPhoto(ViewGroup container, final GalleryV2VO.ImageGalleryItem item, long id2) {
            PdpWidgetProductGalleryV2ImageItemBinding inflate = PdpWidgetProductGalleryV2ImageItemBinding.inflate(LayoutInflater.from(container.getContext()), container, false);
            final GalleryV2ViewHolder galleryV2ViewHolder = GalleryV2ViewHolder.this;
            ImageView imageIv = inflate.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
            ImageViewExtKt.load$default(imageIv, item.getImageUrl(), null, null, null, null, false, null, 126, null);
            inflate.imageIv.setAlpha(item.getImageAlpha());
            if (item.getIsBorderless()) {
                inflate.imageIv.setPadding(0, 0, 0, 0);
            } else {
                inflate.imageIv.setPadding(GalleryV2ViewHolder.DP_24, GalleryV2ViewHolder.DP_24, GalleryV2ViewHolder.DP_24, 0);
            }
            View galleryParandjaV = inflate.galleryParandjaV;
            Intrinsics.checkNotNullExpressionValue(galleryParandjaV, "galleryParandjaV");
            ViewExtKt.showOrGone(galleryParandjaV, Boolean.valueOf(item.getIsParandjaEnabled()));
            container.addView(inflate.getConstraintLayout(), 0);
            inflate.getConstraintLayout().setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GalleryV2ViewHolder.ProductGalleryAdapter.initPhoto$lambda$5$lambda$4(GalleryV2ViewHolder.this, item, view);
                }
            });
            inflate.getConstraintLayout().setTag(makeTag(id2, item));
            FrameLayout constraintLayout = inflate.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            return constraintLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initPhoto$lambda$5$lambda$4(GalleryV2ViewHolder galleryV2ViewHolder, GalleryV2VO.ImageGalleryItem imageGalleryItem, View view) {
            HandlersInhibitor.run$default(galleryV2ViewHolder.handlersInhibitor, 0L, new GalleryV2ViewHolder$ProductGalleryAdapter$initPhoto$1$1$1(galleryV2ViewHolder, imageGalleryItem), 1, null);
            t tokenizedEvent = imageGalleryItem.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(galleryV2ViewHolder.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }

        private final Pair<Long, Integer> makeTag(long voId, GalleryV2VO.GalleryItem valueItem) {
            return new Pair<>(Long.valueOf(voId), Integer.valueOf(valueItem.hashCode()));
        }

        @Override // androidx.viewpager.widget.a
        public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object view) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(view, "view");
            container.removeView((View) view);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return this.items.size();
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@NotNull Object obj) {
            List<GalleryV2VO.GalleryItem> items;
            Intrinsics.checkNotNullParameter(obj, "obj");
            Object tag = ((View) obj).getTag();
            Intrinsics.g(tag, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            Pair pair = (Pair) tag;
            GalleryV2ViewHolder galleryV2ViewHolder = GalleryV2ViewHolder.this;
            Object a11 = pair.a();
            GalleryV2Wrapper galleryV2Wrapper = galleryV2ViewHolder.currentItem;
            if (!Intrinsics.d(a11, galleryV2Wrapper != null ? Long.valueOf(galleryV2Wrapper.getId()) : null)) {
                pair = null;
            }
            if (pair != null) {
                GalleryV2ViewHolder galleryV2ViewHolder2 = GalleryV2ViewHolder.this;
                Object b11 = pair.b();
                GalleryV2Wrapper galleryV2Wrapper2 = galleryV2ViewHolder2.currentItem;
                if (galleryV2Wrapper2 != null && (items = galleryV2Wrapper2.getItems()) != null) {
                    Iterator<GalleryV2VO.GalleryItem> it = items.iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = -1;
                            break;
                        }
                        int hashCode = it.next().hashCode();
                        if ((b11 instanceof Integer) && hashCode == ((Number) b11).intValue()) {
                            break;
                        }
                        i11++;
                    }
                    Integer valueOf = Integer.valueOf(i11);
                    Integer num = valueOf.intValue() != -1 ? valueOf : null;
                    if (num != null) {
                        return num.intValue();
                    }
                }
            }
            return -2;
        }

        @NotNull
        public final List<GalleryV2VO.ImageGalleryItem> getItems() {
            return this.items;
        }

        @Override // androidx.viewpager.widget.a
        @NotNull
        public Object instantiateItem(@NotNull ViewGroup container, int position) {
            Intrinsics.checkNotNullParameter(container, "container");
            GalleryV2VO.ImageGalleryItem imageGalleryItem = this.items.get(position);
            GalleryV2Wrapper galleryV2Wrapper = GalleryV2ViewHolder.this.currentItem;
            return initPhoto(container, imageGalleryItem, galleryV2Wrapper != null ? galleryV2Wrapper.getId() : -1L);
        }

        @Override // androidx.viewpager.widget.a
        public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(obj, "obj");
            return Intrinsics.d(view, obj);
        }

        public final void setItems(@NotNull List<GalleryV2VO.ImageGalleryItem> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.items = value;
            notifyDataSetChanged();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GalleryV2ViewHolder(@NotNull PdpWidgetProductGalleryV2Binding binding, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor handlersInhibitor, @NotNull g ozonRouter) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.handlersInhibitor = handlersInhibitor;
        this.ozonRouter = ozonRouter;
        ProductGalleryAdapter productGalleryAdapter = new ProductGalleryAdapter();
        this.galleryAdapter = productGalleryAdapter;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        this.icPlayResName = DelegatesKt.lazyUnsafe(new GalleryV2ViewHolder$icPlayResName$2(this));
        this.ic360ResName = DelegatesKt.lazyUnsafe(new GalleryV2ViewHolder$ic360ResName$2(this));
        ViewPager viewPager = binding.galleryVp;
        viewPager.setAdapter(productGalleryAdapter);
        viewPager.addOnPageChangeListener(new GalleryViewPagerListener());
        binding.atomBadgeLayout.setAdapter(atomsAdapter);
        atomsAdapter.setOnAction(buildHandler);
    }

    private final void bindClassified(PdpWidgetProductGalleryV2Binding pdpWidgetProductGalleryV2Binding, GalleryV2Wrapper galleryV2Wrapper) {
        WaveView waveView = pdpWidgetProductGalleryV2Binding.waveV;
        if (galleryV2Wrapper.isClassified()) {
            waveView.bind(new WaveModel(waveView.getContext().getResources().getDisplayMetrics().widthPixels / 12, 0, 2, null));
            ViewExtKt.show(waveView);
        } else {
            Intrinsics.f(waveView);
            ViewExtKt.gone(waveView);
        }
        GalleryV2VO.ClassifiedInfoVO classifiedInfo = galleryV2Wrapper.getClassifiedInfo();
        if (classifiedInfo == null) {
            hideClassified(pdpWidgetProductGalleryV2Binding);
            Unit unit = Unit.f71690a;
            return;
        }
        TextAtomV2View classifiedTv = pdpWidgetProductGalleryV2Binding.classifiedTv;
        Intrinsics.checkNotNullExpressionValue(classifiedTv, "classifiedTv");
        TextHolderKt.bindOrGone$default(classifiedTv, classifiedInfo.getClassifiedText(), null, 2, null);
        View view = pdpWidgetProductGalleryV2Binding.classifiedBackgroundV;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, classifiedInfo.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId());
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(parseColor);
        }
        Float backgroundAlpha = classifiedInfo.getBackgroundAlpha();
        view.setAlpha(backgroundAlpha != null ? backgroundAlpha.floatValue() : 0.9f);
        ViewExtKt.show(view);
    }

    private final LargeIconButtonView configure(LargeIconButtonView largeIconButtonView, ButtonV3Atom.LargeIconButton largeIconButton, Function1<? super AtomAction, Unit> function1) {
        LargeIconButtonHolderKt.bind$default(largeIconButtonView, largeIconButton, function1, false, 4, null);
        largeIconButtonView.setPadding(0, 0, 0, 0);
        if (largeIconButton.getTintColor() == null) {
            Context context = largeIconButtonView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(largeIconButtonView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicPrimaryOnLight)));
        }
        return largeIconButtonView;
    }

    private final void disableGallery(PdpWidgetProductGalleryV2Binding pdpWidgetProductGalleryV2Binding) {
        PdpGalleryPagerIndicator pagerIndicator = pdpWidgetProductGalleryV2Binding.pagerIndicator;
        Intrinsics.checkNotNullExpressionValue(pagerIndicator, "pagerIndicator");
        ViewExtKt.invisible(pagerIndicator);
        ImageView emptyGalleryIv = pdpWidgetProductGalleryV2Binding.emptyGalleryIv;
        Intrinsics.checkNotNullExpressionValue(emptyGalleryIv, "emptyGalleryIv");
        ViewExtKt.show(emptyGalleryIv);
        ViewPager galleryVp = pdpWidgetProductGalleryV2Binding.galleryVp;
        Intrinsics.checkNotNullExpressionValue(galleryVp, "galleryVp");
        ViewExtKt.gone(galleryVp);
        WaveView waveV = pdpWidgetProductGalleryV2Binding.waveV;
        Intrinsics.checkNotNullExpressionValue(waveV, "waveV");
        ViewExtKt.gone(waveV);
        hideClassified(pdpWidgetProductGalleryV2Binding);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View getGalleryButton(PdpWidgetProductGalleryV2Binding pdpWidgetProductGalleryV2Binding, ButtonV3Atom.LargeIconButton largeIconButton, Function1<? super AtomAction, Unit> function1) {
        PdpWidgetGalleryProductButtonBinding pdpWidgetGalleryProductButtonBinding;
        String icon = largeIconButton.getIcon();
        if (Intrinsics.d(icon, getIcPlayResName())) {
            PdpWidgetGalleryProductButtonPlayBinding inflate = PdpWidgetGalleryProductButtonPlayBinding.inflate(LayoutInflater.from(pdpWidgetProductGalleryV2Binding.getConstraintLayout().getContext()), pdpWidgetProductGalleryV2Binding.getConstraintLayout(), false);
            LargeIconButtonView iconButtonPlay = inflate.iconButtonPlay;
            Intrinsics.checkNotNullExpressionValue(iconButtonPlay, "iconButtonPlay");
            configure(iconButtonPlay, largeIconButton, function1);
            Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
            pdpWidgetGalleryProductButtonBinding = inflate;
        } else if (Intrinsics.d(icon, getIc360ResName())) {
            PdpWidgetGalleryProductButton360Binding inflate2 = PdpWidgetGalleryProductButton360Binding.inflate(LayoutInflater.from(pdpWidgetProductGalleryV2Binding.getConstraintLayout().getContext()), pdpWidgetProductGalleryV2Binding.getConstraintLayout(), false);
            LargeIconButtonView iconButton360 = inflate2.iconButton360;
            Intrinsics.checkNotNullExpressionValue(iconButton360, "iconButton360");
            configure(iconButton360, largeIconButton, function1);
            Intrinsics.checkNotNullExpressionValue(inflate2, "apply(...)");
            pdpWidgetGalleryProductButtonBinding = inflate2;
        } else {
            PdpWidgetGalleryProductButtonBinding inflate3 = PdpWidgetGalleryProductButtonBinding.inflate(LayoutInflater.from(pdpWidgetProductGalleryV2Binding.getConstraintLayout().getContext()), pdpWidgetProductGalleryV2Binding.getConstraintLayout(), false);
            LargeIconButtonView iconButton = inflate3.iconButton;
            Intrinsics.checkNotNullExpressionValue(iconButton, "iconButton");
            configure(iconButton, largeIconButton, function1);
            Intrinsics.checkNotNullExpressionValue(inflate3, "apply(...)");
            pdpWidgetGalleryProductButtonBinding = inflate3;
        }
        View constraintLayout = pdpWidgetGalleryProductButtonBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    private final String getIc360ResName() {
        Object value = this.ic360ResName.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }

    private final String getIcPlayResName() {
        Object value = this.icPlayResName.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }

    private final void hideClassified(PdpWidgetProductGalleryV2Binding pdpWidgetProductGalleryV2Binding) {
        TextAtomV2View classifiedTv = pdpWidgetProductGalleryV2Binding.classifiedTv;
        Intrinsics.checkNotNullExpressionValue(classifiedTv, "classifiedTv");
        ViewExtKt.gone(classifiedTv);
        View classifiedBackgroundV = pdpWidgetProductGalleryV2Binding.classifiedBackgroundV;
        Intrinsics.checkNotNullExpressionValue(classifiedBackgroundV, "classifiedBackgroundV");
        ViewExtKt.gone(classifiedBackgroundV);
    }

    private final void initGallery(PdpWidgetProductGalleryV2Binding pdpWidgetProductGalleryV2Binding, GalleryV2Wrapper galleryV2Wrapper, d dVar) {
        t galleryTokenizedEvent = galleryV2Wrapper.getGalleryTokenizedEvent();
        if (galleryTokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), galleryTokenizedEvent, null, 2, null);
        }
        int parseColor = StyleParser.INSTANCE.parseColor(getContext(), galleryV2Wrapper.getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId());
        pdpWidgetProductGalleryV2Binding.pdpGalleryRootCl.setBackgroundColor(parseColor);
        pdpWidgetProductGalleryV2Binding.pagerIndicator.setBackgroundColor(parseColor);
        this.currentItem = galleryV2Wrapper;
        this.info = dVar;
        setAllItems(galleryV2Wrapper.getItems());
        setGalleryV2Wrapper(galleryV2Wrapper);
        ArrayList H11 = C7714v.H(galleryV2Wrapper.getItems(), GalleryV2VO.ImageGalleryItem.class);
        this.galleryAdapter.setItems(H11);
        PdpGalleryPagerIndicator pagerIndicator = pdpWidgetProductGalleryV2Binding.pagerIndicator;
        Intrinsics.checkNotNullExpressionValue(pagerIndicator, "pagerIndicator");
        ViewPager galleryVp = pdpWidgetProductGalleryV2Binding.galleryVp;
        Intrinsics.checkNotNullExpressionValue(galleryVp, "galleryVp");
        ViewPagerWrapperKt.setViewPager1(pagerIndicator, galleryVp);
        PdpGalleryPagerIndicator pagerIndicator2 = pdpWidgetProductGalleryV2Binding.pagerIndicator;
        Intrinsics.checkNotNullExpressionValue(pagerIndicator2, "pagerIndicator");
        pagerIndicator2.setVisibility(H11.size() > 1 ? 0 : 8);
        HorizontalFlexAtomsLayout atomBadgeLayout = pdpWidgetProductGalleryV2Binding.atomBadgeLayout;
        Intrinsics.checkNotNullExpressionValue(atomBadgeLayout, "atomBadgeLayout");
        List<Badge> badges = galleryV2Wrapper.getBadges();
        atomBadgeLayout.setVisibility((badges == null || badges.isEmpty()) ? 8 : 0);
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = getContext();
        List<Badge> badges2 = galleryV2Wrapper.getBadges();
        if (badges2 == null) {
            badges2 = K.f71697a;
        }
        atomsAdapter.bind(context, badges2);
        ImageView emptyGalleryIv = pdpWidgetProductGalleryV2Binding.emptyGalleryIv;
        Intrinsics.checkNotNullExpressionValue(emptyGalleryIv, "emptyGalleryIv");
        ViewExtKt.showOrGone(emptyGalleryIv, Boolean.valueOf(H11.isEmpty()));
        ViewPager galleryVp2 = pdpWidgetProductGalleryV2Binding.galleryVp;
        Intrinsics.checkNotNullExpressionValue(galleryVp2, "galleryVp");
        ViewExtKt.showOrGone(galleryVp2, Boolean.valueOf(!H11.isEmpty()));
        bindClassified(pdpWidgetProductGalleryV2Binding, galleryV2Wrapper);
        Float ratio = galleryV2Wrapper.getRatio();
        if (ratio != null) {
            float floatValue = ratio.floatValue();
            int i11 = ContextExtKt.getAppUsableScreenSize(getContext()).x;
            ViewPager galleryVp3 = pdpWidgetProductGalleryV2Binding.galleryVp;
            Intrinsics.checkNotNullExpressionValue(galleryVp3, "galleryVp");
            ViewGroup.LayoutParams layoutParams = galleryVp3.getLayoutParams();
            int i12 = layoutParams.height;
            int i13 = (int) (i11 * floatValue);
            layoutParams.height = i13;
            if (i12 != i13) {
                galleryVp3.setLayoutParams(layoutParams);
            }
        }
        renderButtons(pdpWidgetProductGalleryV2Binding, galleryV2Wrapper.getButtons());
    }

    private final void renderButtons(PdpWidgetProductGalleryV2Binding pdpWidgetProductGalleryV2Binding, List<ButtonV3Atom.LargeIconButton> list) {
        int[] referencedIds = pdpWidgetProductGalleryV2Binding.buttonsFlow.getReferencedIds();
        Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
        for (int i11 : referencedIds) {
            pdpWidgetProductGalleryV2Binding.getConstraintLayout().removeView(pdpWidgetProductGalleryV2Binding.getConstraintLayout().findViewById(i11));
        }
        if (list == null) {
            list = K.f71697a;
        }
        List<ButtonV3Atom.LargeIconButton> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(getGalleryButton(pdpWidgetProductGalleryV2Binding, (ButtonV3Atom.LargeIconButton) it.next(), this.actionHandler));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            pdpWidgetProductGalleryV2Binding.getConstraintLayout().addView((View) it2.next());
        }
        Flow flow = pdpWidgetProductGalleryV2Binding.buttonsFlow;
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((View) it3.next()).getId()));
        }
        flow.setReferencedIds(C7714v.T0(arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GalleryRequest.GalleryItem toGalleryV2Item(GalleryV2VO.GalleryItem galleryItem) {
        if (galleryItem instanceof GalleryV2VO.ImageGalleryItem) {
            GalleryV2VO.ImageGalleryItem imageGalleryItem = (GalleryV2VO.ImageGalleryItem) galleryItem;
            return new GalleryRequest.GalleryItem.Image(imageGalleryItem.getImageUrl(), imageGalleryItem.getPreviewImageUrl(), false, 4, null);
        }
        if (!(galleryItem instanceof GalleryV2VO.Photo360Item)) {
            throw new IllegalStateException("Unsupported GalleryVO item type");
        }
        GalleryV2VO.Photo360Item photo360Item = (GalleryV2VO.Photo360Item) galleryItem;
        return new GalleryRequest.GalleryItem.Photo360(photo360Item.getImageUrl(), photo360Item.getDescription(), photo360Item.getButton(), photo360Item.getButtonEvent(), false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackGalleryItemViewEvent(GalleryV2VO.ImageGalleryItem item) {
        t tokenizedEvent;
        if (item == null || (tokenizedEvent = item.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
    }

    @NotNull
    public final List<GalleryV2VO.GalleryItem> getAllItems() {
        List list = this.allItems;
        if (list != null) {
            return list;
        }
        Intrinsics.n("allItems");
        throw null;
    }

    @NotNull
    public final GalleryV2Wrapper getGalleryV2Wrapper() {
        GalleryV2Wrapper galleryV2Wrapper = this.galleryV2Wrapper;
        if (galleryV2Wrapper != null) {
            return galleryV2Wrapper;
        }
        Intrinsics.n("galleryV2Wrapper");
        throw null;
    }

    public final void setAllItems(@NotNull List<? extends GalleryV2VO.GalleryItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.allItems = list;
    }

    public final void setGalleryV2Wrapper(@NotNull GalleryV2Wrapper galleryV2Wrapper) {
        Intrinsics.checkNotNullParameter(galleryV2Wrapper, "<set-?>");
        this.galleryV2Wrapper = galleryV2Wrapper;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull GalleryV2Wrapper item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        PdpWidgetProductGalleryV2Binding pdpWidgetProductGalleryV2Binding = this.binding;
        if (item.isEmptyGallery()) {
            disableGallery(pdpWidgetProductGalleryV2Binding);
        } else {
            initGallery(pdpWidgetProductGalleryV2Binding, item, info);
            trackGalleryItemViewEvent((GalleryV2VO.ImageGalleryItem) C7714v.M(this.galleryAdapter.getItems()));
        }
    }
}
