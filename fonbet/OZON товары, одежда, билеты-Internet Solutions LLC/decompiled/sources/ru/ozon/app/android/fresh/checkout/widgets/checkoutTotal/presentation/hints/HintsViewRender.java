package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.hints;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import androidx.recyclerview.widget.RecyclerView;
import hk0.C6969b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.holders.AnnotationAtom;
import ru.ozon.app.android.atoms.af.holders.TextAtomHolder;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.rv.DefaultPaddingDecorator;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolderDelegate;
import ru.ozon.app.android.atoms.rv.factory.AtomRecyclerFactory;
import ru.ozon.uikit.recycler.delegate.ItemListLayoutManager;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Annotation;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\b\u0001\u0018\u0000  2\u00020\u0001:\u0002 !B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u000b\u001a\u00020\n2\u001a\u0010\u0010\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00062\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0018\u0010\u001e\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/HintsViewRender;", "", "Landroidx/recyclerview/widget/RecyclerView;", "interactionHintsRV", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/HintsViewRender$CommonComponents;", "commonComponents", "", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/af/Atom$AtomConfiguration;", "additionConfigs", "Lhk0/b;", "Lru/ozon/app/android/uikit/recycler/ItemListAdapter;", "createAdapter", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/HintsViewRender$CommonComponents;Ljava/util/Map;)Lhk0/b;", "commonInit", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/HintsViewRender$CommonComponents;)V", "getInteractionsTextConfigs", "()Ljava/util/Map;", "", "hints", "bindInteractionsHints", "(Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView;", "interactionsHintsAdapter", "Lhk0/b;", "Companion", "CommonComponents", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HintsViewRender {

    @NotNull
    private final RecyclerView interactionHintsRV;

    @NotNull
    private final C6969b interactionsHintsAdapter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R)\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00150\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/HintsViewRender$CommonComponents;", "", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$u;", "getRecycledViewPool", "()Landroidx/recyclerview/widget/RecyclerView$u;", "Lru/ozon/app/android/atoms/rv/DefaultPaddingDecorator;", "defaultPaddingDecorator", "Lru/ozon/app/android/atoms/rv/DefaultPaddingDecorator;", "getDefaultPaddingDecorator", "()Lru/ozon/app/android/atoms/rv/DefaultPaddingDecorator;", "", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/data/deprecated/Annotation;", "Lru/ozon/app/android/atoms/af/holders/AnnotationAtom$Configuration;", "annotationConfig", "Ljava/util/Map;", "getAnnotationConfig", "()Ljava/util/Map;", "Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "atomFactory", "Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "getAtomFactory", "()Lru/ozon/app/android/atoms/rv/factory/AtomRecyclerFactory;", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "viewInitializerBlock", "Lkotlin/jvm/functions/Function1;", "getViewInitializerBlock", "()Lkotlin/jvm/functions/Function1;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class CommonComponents {

        @NotNull
        private final Map<Class<Annotation>, AnnotationAtom.Configuration> annotationConfig;

        @NotNull
        private final AtomRecyclerFactory atomFactory;

        @NotNull
        private final DefaultPaddingDecorator defaultPaddingDecorator;

        @NotNull
        private final RecyclerView.u recycledViewPool;

        @NotNull
        private final Function1<AtomItemViewHolder, Unit> viewInitializerBlock;

        public CommonComponents(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            this.recycledViewPool = new RecyclerView.u();
            this.defaultPaddingDecorator = new DefaultPaddingDecorator();
            this.annotationConfig = U.i(new Pair(Annotation.class, new AnnotationAtom.Configuration(0, 0, 0, 0, R$drawable.shape_round_bgprimary, null, 0, null, null, 492, null)));
            this.atomFactory = new AtomRecyclerFactory() { // from class: ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.hints.HintsViewRender$CommonComponents$atomFactory$1
                @Override // ru.ozon.app.android.atoms.rv.factory.AtomRecyclerFactory
                public Atom<? extends AtomDTO, ? extends Atom.AtomConfiguration> createCustomAtom(Context context, d<? extends AtomDTO> viewType, Function1<? super AtomAction, Unit> actionHandler2) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(viewType, "viewType");
                    if (Intrinsics.d(viewType, N.b(CommonText.TextMedium.class)) || Intrinsics.d(viewType, N.b(CommonText.TextSmall.class)) || Intrinsics.d(viewType, N.b(CommonText.TextFooter.class))) {
                        return new TextAtomHolder(new TextAtom(context, null, 0, 6, null), (String) null);
                    }
                    return null;
                }
            };
            this.viewInitializerBlock = new HintsViewRender$CommonComponents$viewInitializerBlock$1(actionHandler);
        }

        @NotNull
        public final Map<Class<Annotation>, AnnotationAtom.Configuration> getAnnotationConfig() {
            return this.annotationConfig;
        }

        @NotNull
        public final AtomRecyclerFactory getAtomFactory() {
            return this.atomFactory;
        }

        @NotNull
        public final DefaultPaddingDecorator getDefaultPaddingDecorator() {
            return this.defaultPaddingDecorator;
        }

        @NotNull
        public final RecyclerView.u getRecycledViewPool() {
            return this.recycledViewPool;
        }

        @NotNull
        public final Function1<AtomItemViewHolder, Unit> getViewInitializerBlock() {
            return this.viewInitializerBlock;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutTotal/presentation/hints/HintsViewRender$Companion;", "", "<init>", "()V", "HINTS_MARGIN", "", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HintsViewRender(@NotNull RecyclerView interactionHintsRV, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(interactionHintsRV, "interactionHintsRV");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.interactionHintsRV = interactionHintsRV;
        CommonComponents commonComponents = new CommonComponents(actionHandler);
        C6969b createAdapter = createAdapter(commonComponents, getInteractionsTextConfigs());
        this.interactionsHintsAdapter = createAdapter;
        commonInit(interactionHintsRV, commonComponents);
        interactionHintsRV.setAdapter(createAdapter);
        interactionHintsRV.addItemDecoration(new InteractionsHintsVDecorator());
    }

    private final void commonInit(RecyclerView recyclerView, CommonComponents commonComponents) {
        recyclerView.setRecycledViewPool(commonComponents.getRecycledViewPool());
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setLayoutManager(new ItemListLayoutManager(context));
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(commonComponents.getDefaultPaddingDecorator());
    }

    private final C6969b createAdapter(CommonComponents commonComponents, Map<Class<? extends AtomDTO>, ? extends Atom.AtomConfiguration> additionConfigs) {
        return new C6969b(new AtomItemViewHolderDelegate(commonComponents.getViewInitializerBlock(), commonComponents.getAtomFactory(), U.m(commonComponents.getAnnotationConfig(), additionConfigs)));
    }

    private final Map<Class<? extends AtomDTO>, Atom.AtomConfiguration> getInteractionsTextConfigs() {
        return U.j(new Pair(CommonText.TextSmall.class, new TextAtom.Configuration(8, 8, 0, 0, R$style.TextStyle_Caption, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, LinkMovementMethod.getInstance(), null, 393196, null)), new Pair(CommonText.TextMedium.class, new TextAtom.Configuration(8, 8, 0, 0, R$style.TextStyle_Caption, 0, 0, null, 0, false, false, 0, null, null, 0, 0, null, LinkMovementMethod.getInstance(), null, 393196, null)));
    }

    public final void bindInteractionsHints(List<? extends AtomDTO> hints) {
        ViewExtKt.showOrGone(this.interactionHintsRV, Boolean.valueOf(hints != null));
        C6969b c6969b = this.interactionsHintsAdapter;
        if (hints == null) {
            hints = K.f71697a;
        }
        c6969b.submitList(hints);
    }
}
