package ru.ozon.app.android.geo.addresseditunavailable.presentation;

import W10.c;
import WZ.t;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.af.holders.HorizontalContainerAtom;
import ru.ozon.app.android.atoms.af.holders.ImageAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.HorizontalContainer;
import ru.ozon.app.android.atoms.data.deprecated.VerticalContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.geo.databinding.WidgetAddressEditUnavailableItemsBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Image;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/addresseditunavailable/presentation/AddressEditUnavailableWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/geo/addresseditunavailable/presentation/AddressEditUnavailableVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/geo/databinding/WidgetAddressEditUnavailableItemsBinding;", "binding", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/geo/databinding/WidgetAddressEditUnavailableItemsBinding;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/geo/addresseditunavailable/presentation/AddressEditUnavailableVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/geo/addresseditunavailable/presentation/AddressEditUnavailableVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "adapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "RootDecorator", "ProductHorizontalContainerDecorator", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditUnavailableWidgetViewHolder extends k<AddressEditUnavailableVO> {

    @NotNull
    private final AtomsAdapter adapter;

    @NotNull
    private final ComposerReferences ref;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J(\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/geo/addresseditunavailable/presentation/AddressEditUnavailableWidgetViewHolder$ProductHorizontalContainerDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "modifyHorizontalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "", "last", "", "modifyVerticalLayoutParams", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductHorizontalContainerDecorator extends AtomDecorator implements HorizontalAtomsDecorator, VerticalAtomsDecorator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductHorizontalContainerDecorator(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // ru.ozon.uni.atoms.af.HorizontalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyHorizontalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            if (last) {
                lp.width = 0;
                lp.weight = 1.0f;
            }
            return lp;
        }

        @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            if (position == 0) {
                lp.topMargin = 0;
            }
            if (last) {
                lp.bottomMargin = 0;
            }
            return lp;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/addresseditunavailable/presentation/AddressEditUnavailableWidgetViewHolder$RootDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp1", "dp76", "paint", "Landroid/graphics/Paint;", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "decorate", "", "canvas", "Landroid/graphics/Canvas;", "bounds", "Landroid/graphics/Rect;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RootDecorator extends AtomDecorator implements VerticalAtomsDecorator {
        private final int dp1;
        private final int dp2;
        private final int dp76;

        @NotNull
        private final Paint paint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RootDecorator(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.dp2 = toPx(2);
            int px = toPx(1);
            this.dp1 = px;
            this.dp76 = toPx(76);
            Paint paint = new Paint(1);
            paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
            paint.setStrokeWidth(px);
            this.paint = paint;
        }

        @Override // ru.ozon.uni.atoms.af.AtomDecorator, ru.ozon.uni.atoms.af.CommonAtomDecorator
        public void decorate(@NotNull Canvas canvas, @NotNull Rect bounds, int position, boolean last) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            int i11 = bounds.bottom;
            canvas.drawLine(bounds.left + this.dp76, i11, bounds.right, i11, this.paint);
        }

        @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            int i11 = this.dp2;
            lp.topMargin = i11;
            lp.bottomMargin = i11;
            return lp;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddressEditUnavailableWidgetViewHolder(@NotNull ComposerReferences ref, @NotNull WidgetAddressEditUnavailableItemsBinding binding) {
        super(r3);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(binding, "binding");
        VerticalAtomsLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.ref = ref;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.j(new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 12, 10, R$style.TextStyle_Body_L_Bold, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 522211, null)), new Pair(new Atom.ConfCondition(HorizontalContainer.class, null, 2, null), new HorizontalContainerAtom.Configuration(26, 16, 10, 10, null, 0, Integer.valueOf(ThemeExtKt.themeColorRes(getContext(), R$attr.layerFloor1)), 48, null))), U.j(new Pair(new Atom.ConfCondition(HorizontalContainer.class, "ATOM_CONTEXT_PRODUCTS_CONTAINER"), U.i(new Pair(new Atom.ConfCondition(Image.class, null, 2, null), new ImageAtom.Configuration(0, 7, 0, 0, 27, 35, false, 77, null)))), new Pair(new Atom.ConfCondition(VerticalContainer.class, "ATOM_CONTEXT_PRODUCTS_CONTAINER"), U.i(new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Body_L, 0, 0, null, 0, false, false, 0, null, null, 0, 0, 2, null, null, 456687, null))))), U.j(new Pair(new Atom.ConfCondition(HorizontalContainer.class, "ATOM_CONTEXT_PRODUCTS_CONTAINER"), new ProductHorizontalContainerDecorator(getContext())), new Pair(new Atom.ConfCondition(VerticalContainer.class, "ATOM_CONTEXT_PRODUCTS_CONTAINER"), new ProductHorizontalContainerDecorator(getContext()))), null, 8, null);
        this.adapter = atomsAdapter;
        atomsAdapter.setOnAction(new ActionHandler.Builder(ref, this).buildHandler());
        binding.itemsVAL.setAdapter(atomsAdapter);
        binding.itemsVAL.setDecorator(new RootDecorator(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddressEditUnavailableVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.adapter.bind(getContext(), item.getAtoms());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AddressEditUnavailableVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AddressEditUnavailableWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
