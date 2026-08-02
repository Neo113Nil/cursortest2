package ru.ozon.app.android.checkoutcomposer.splitdetail.presentation;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.af.holders.ButtonBaseAtom;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.atoms.af.holders.HorizontalContainerAtom;
import ru.ozon.app.android.atoms.af.holders.ImageAtom;
import ru.ozon.app.android.atoms.af.holders.VerticalContainerAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.atoms.data.deprecated.HorizontalContainer;
import ru.ozon.app.android.atoms.data.deprecated.VerticalContainer;
import ru.ozon.app.android.checkout.databinding.WidgetParcelFormBinding;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalAtomsDecorator;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Annotation;
import ru.ozon.uni.atoms.data.deprecated.Image;
import ru.ozon.uni.atoms.data.price.Price;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0017\u0018\u0019B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitdetail/presentation/SplitDetailVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/splitdetail/presentation/SplitDetailVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/checkout/databinding/WidgetParcelFormBinding;", "binding", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/checkout/databinding/WidgetParcelFormBinding;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "clickHandler", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/splitdetail/presentation/SplitDetailVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "itemsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "RootDecorator", "HeaderElementsContainerDecorator", "ProductContainerDecorator", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitDetailVH extends k<SplitDetailVO> {
    public static final int $stable = AtomsAdapter.$stable | ComposerReferences.$stable;

    @NotNull
    private final AtomsAdapter itemsAdapter;

    @NotNull
    private final ComposerReferences ref;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.splitdetail.presentation.SplitDetailVH$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<AtomAction.Click, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, SplitDetailVH.class, "clickHandler", "clickHandler(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
            invoke2(click);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction.Click p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((SplitDetailVH) this.receiver).clickHandler(p02);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitdetail/presentation/SplitDetailVH$HeaderElementsContainerDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HeaderElementsContainerDecorator extends AtomDecorator implements VerticalAtomsDecorator {
        private final int dp8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderElementsContainerDecorator(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.dp8 = toPx(8);
        }

        @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            if (data instanceof CommonButton) {
                lp.width = -2;
            }
            int i11 = this.dp8;
            lp.topMargin = i11;
            lp.bottomMargin = i11;
            if (position == 0) {
                lp.topMargin = 0;
            }
            if (last) {
                lp.bottomMargin = 0;
            }
            return lp;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitdetail/presentation/SplitDetailVH$ProductContainerDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/HorizontalAtomsDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp8", "dp16", "modifyHorizontalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "modifyVerticalLayoutParams", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductContainerDecorator extends AtomDecorator implements HorizontalAtomsDecorator, VerticalAtomsDecorator {
        private final int dp16;
        private final int dp4;
        private final int dp8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductContainerDecorator(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.dp4 = toPx(4);
            this.dp8 = toPx(8);
            this.dp16 = toPx(16);
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
            if (data instanceof Annotation) {
                lp.topMargin = this.dp4;
            } else if (data instanceof CommonText.TextMedium) {
                if (!Intrinsics.d(((CommonText.TextMedium) data).getContext(), "premiumLabel")) {
                    lp.topMargin = this.dp8;
                }
            } else if (data instanceof Price) {
                lp.setMarginStart(this.dp16);
            }
            if (position == 0) {
                lp.topMargin = 0;
            }
            if (last) {
                lp.bottomMargin = 0;
            }
            return lp;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitdetail/presentation/SplitDetailVH$RootDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp13", "dp24", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RootDecorator extends AtomDecorator implements VerticalAtomsDecorator {
        private final int dp13;
        private final int dp2;
        private final int dp24;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RootDecorator(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.dp2 = toPx(2);
            this.dp13 = toPx(13);
            this.dp24 = toPx(24);
        }

        @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            int i11 = this.dp2;
            lp.topMargin = i11;
            lp.bottomMargin = i11;
            if (data instanceof Header) {
                String text = ((Header) data).getText();
                if (text == null || h.K(text)) {
                    lp.topMargin = 0;
                    lp.bottomMargin = 0;
                } else {
                    lp.topMargin = this.dp13;
                    lp.bottomMargin = this.dp2;
                }
            }
            if (position == 0) {
                lp.topMargin = this.dp24;
            }
            if (last) {
                lp.bottomMargin = this.dp24;
            }
            return lp;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SplitDetailVH(@NotNull ComposerReferences ref, @NotNull WidgetParcelFormBinding binding) {
        super(r3);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(binding, "binding");
        VerticalAtomsLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.ref = ref;
        int i11 = 0;
        int i12 = 0;
        int i13 = 16;
        int i14 = 16;
        int i15 = 16;
        int i16 = 16;
        int i17 = 16;
        int i18 = 16;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.j(new Pair(new Atom.ConfCondition(VerticalContainer.class, null, 2, null), new VerticalContainerAtom.Configuration(i11, i12, i13, i14, null, 0, Integer.valueOf(ThemeExtKt.themeColorRes(getContext(), R$attr.layerFloor1)), 51, null)), new Pair(new Atom.ConfCondition(Header.class, "noTopPadding"), new HeaderAtom.Configuration(0, 0, 0, 10, null, null, Integer.valueOf(R$style.TextStyle_Body_M_Bold), 0, false, null, 819, null)), new Pair(new Atom.ConfCondition(Header.class, "topPadding"), new HeaderAtom.Configuration(0, 0, 10, 10, null, null, Integer.valueOf(R$style.TextStyle_Body_M_Bold), 0, false, null, 819, null)), new Pair(new Atom.ConfCondition(HorizontalContainer.class, null, 2, null), new HorizontalContainerAtom.Configuration(i15, i16, i17, i18, null, 0, Integer.valueOf(ThemeExtKt.themeColorRes(getContext(), R$attr.layerFloor1)), 48, null))), U.j(new Pair(new Atom.ConfCondition(VerticalContainer.class, "ATOM_CONTEXT_HEADER_ELEMENTS_CONTAINER"), U.j(new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Body_L, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 522223, null)), new Pair(new Atom.ConfCondition(CommonButton.ButtonBorderless.class, null, 2, null), new ButtonBaseAtom.Configuration(0, 0, 0, 0, false, 0, null, 124, null)))), new Pair(new Atom.ConfCondition(HorizontalContainer.class, "ATOM_CONTEXT_PRODUCTS_CONTAINER"), U.i(new Pair(new Atom.ConfCondition(Image.class, null, 2, null), new ImageAtom.Configuration(0, 0, 0, 0, 80, 80, false, 79, null)))), new Pair(new Atom.ConfCondition(VerticalContainer.class, "ATOM_CONTEXT_PRODUCTS_CONTAINER"), U.j(new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Body_L, 0, 0, null, 0, false, false, 0, null, null, 0, 0, 2, null, null, 456675, null)), new Pair(new Atom.ConfCondition(CommonText.TextSmall.class, null, 2, null), new TextAtom.Configuration(0, 0, 4, 4, R$style.TextStyle_Body_M, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, null, null, 522211, null)), new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, "premiumLabel"), new TextAtom.Configuration(0, 0, 4, 4, R$style.TextStyle_Caption, 16, 0, null, 24, false, false, 0, null, null, 0, 0, null, null, null, 521923, null))))), U.j(new Pair(new Atom.ConfCondition(VerticalContainer.class, "ATOM_CONTEXT_HEADER_ELEMENTS_CONTAINER"), new HeaderElementsContainerDecorator(getContext())), new Pair(new Atom.ConfCondition(HorizontalContainer.class, "ATOM_CONTEXT_PRODUCTS_CONTAINER"), new ProductContainerDecorator(getContext())), new Pair(new Atom.ConfCondition(VerticalContainer.class, "ATOM_CONTEXT_PRODUCTS_CONTAINER"), new ProductContainerDecorator(getContext()))), null, 8, null);
        this.itemsAdapter = atomsAdapter;
        VerticalAtomsLayout verticalAtomsLayout = binding.itemsVAL;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new RootDecorator(context));
        atomsAdapter.setOnAction(new ActionHandler.Builder(ref, this).onClick(new AnonymousClass2(this)).buildHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clickHandler(AtomAction.Click action) {
        if (Intrinsics.d(action.getId(), "goToCart")) {
            ComposerExtKt.closeFlow(this.ref.getContainer());
            String link = action.getLink();
            if (link != null) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(this.ref.getNavigator(), link, null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SplitDetailVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.itemsAdapter.bind(getContext(), item.getAtoms());
    }
}
