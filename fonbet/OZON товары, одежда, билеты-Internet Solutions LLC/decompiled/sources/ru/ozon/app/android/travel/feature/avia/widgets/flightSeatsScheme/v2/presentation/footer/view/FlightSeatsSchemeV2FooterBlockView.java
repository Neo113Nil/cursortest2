package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view;

import Am.C2438a;
import CG.b;
import CG.c;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.FlightSeatsSchemeV2PassengersAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.FlightSeatsSchemeV2PassengersBlockItemDecoration;
import ru.ozon.app.android.travel.utils.CenterSmoothScroller;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.M;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010!J\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010%J\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010!R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R,\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00105R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010D\u001a\u0004\bO\u0010PR\u001b\u0010T\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010D\u001a\u0004\bS\u0010KR\u001b\u0010W\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010D\u001a\u0004\bV\u0010FR!\u0010]\u001a\b\u0012\u0004\u0012\u00020?0X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\¨\u0006^"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2FooterBlockView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function2;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "", "onPassengerSelectedListener", "setUp", "(Lkotlin/jvm/functions/Function2;)V", "Lxe/M;", "scope", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bind", "(Lxe/M;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;Lkotlin/jvm/functions/Function1;)V", "position", "", "payload", "updateItem", "(ILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;Ljava/lang/Object;)V", "scrollToPassengerTab", "(I)V", "getItemOrNull", "(I)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "showShimmer", "()V", "", "isSeparatorVisible", "showPassengers", "(Z)V", "showEmptyState", "isVisible", "setFooterGroupViewsVisible", "addViews", "setConstraints", "dp1", "I", "dp2", "dp4", "dp8", "dp12", "dp16", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/adapter/FlightSeatsSchemeV2PassengersAdapter;", "passengersAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/adapter/FlightSeatsSchemeV2PassengersAdapter;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/Function0;", "onInfoClick", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2FooterBlockShimmerView;", "shimmerV", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2FooterBlockShimmerView;", "Landroidx/recyclerview/widget/RecyclerView;", "passengersRV", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/View;", "separator", "Landroid/view/View;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "submitButtonV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getSubmitButtonV", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "submitButtonV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "captionTV$delegate", "getCaptionTV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "captionTV", "Landroidx/appcompat/widget/AppCompatImageView;", "infoButtonV$delegate", "getInfoButtonV", "()Landroidx/appcompat/widget/AppCompatImageView;", "infoButtonV", "priceTV$delegate", "getPriceTV", "priceTV", "skipButtonV$delegate", "getSkipButtonV", "skipButtonV", "", "footerGroupViews$delegate", "LSc/j;", "getFooterGroupViews", "()Ljava/util/List;", "footerGroupViews", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2FooterBlockView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(FlightSeatsSchemeV2FooterBlockView.class, "submitButtonV", "getSubmitButtonV()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0), C2438a.c(FlightSeatsSchemeV2FooterBlockView.class, "captionTV", "getCaptionTV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightSeatsSchemeV2FooterBlockView.class, "infoButtonV", "getInfoButtonV()Landroidx/appcompat/widget/AppCompatImageView;", 0), C2438a.c(FlightSeatsSchemeV2FooterBlockView.class, "priceTV", "getPriceTV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(FlightSeatsSchemeV2FooterBlockView.class, "skipButtonV", "getSkipButtonV()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0)};
    public static final int $stable = 8;

    /* renamed from: captionTV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate captionTV;
    private final int dp1;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final int dp8;

    /* renamed from: footerGroupViews$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j footerGroupViews;

    /* renamed from: infoButtonV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate infoButtonV;
    private Function0<Unit> onInfoClick;
    private Function2<? super Integer, ? super FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, Unit> onPassengerSelectedListener;

    @NotNull
    private final FlightSeatsSchemeV2PassengersAdapter passengersAdapter;

    @NotNull
    private final RecyclerView passengersRV;

    /* renamed from: priceTV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate priceTV;

    @NotNull
    private final View separator;

    @NotNull
    private final FlightSeatsSchemeV2FooterBlockShimmerView shimmerV;

    /* renamed from: skipButtonV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate skipButtonV;

    /* renamed from: submitButtonV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate submitButtonV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeV2FooterBlockView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        int px3 = ResourceExtKt.toPx(16, context);
        this.dp16 = px3;
        FlightSeatsSchemeV2PassengersAdapter flightSeatsSchemeV2PassengersAdapter = new FlightSeatsSchemeV2PassengersAdapter(new FlightSeatsSchemeV2FooterBlockView$passengersAdapter$1(this));
        this.passengersAdapter = flightSeatsSchemeV2PassengersAdapter;
        FlightSeatsSchemeV2FooterBlockShimmerView flightSeatsSchemeV2FooterBlockShimmerView = new FlightSeatsSchemeV2FooterBlockShimmerView(context);
        flightSeatsSchemeV2FooterBlockShimmerView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.setMarginStart(px3);
        flightSeatsSchemeV2FooterBlockShimmerView.setLayoutParams(bVar);
        flightSeatsSchemeV2FooterBlockShimmerView.setVisibility(8);
        this.shimmerV = flightSeatsSchemeV2FooterBlockShimmerView;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(View.generateViewId());
        recyclerView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(flightSeatsSchemeV2PassengersAdapter);
        recyclerView.addItemDecoration(new FlightSeatsSchemeV2PassengersBlockItemDecoration(context));
        this.passengersRV = recyclerView;
        View view = new View(context);
        view.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-1, px);
        ((ViewGroup.MarginLayoutParams) bVar2).topMargin = px2;
        bVar2.setMarginStart(px3);
        bVar2.setMarginEnd(px3);
        view.setLayoutParams(bVar2);
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.separator = view;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.submitButtonV = new PreCreationViewPoolDelegate(context2, N.b(ButtonV3View.class), new FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$1(this), new FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.captionTV = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$3(this), new FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.infoButtonV = new PreCreationViewPoolDelegate(context4, N.b(AppCompatImageView.class), new FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$5(this), new FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$6(context, this));
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.priceTV = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$7(this), new FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$8(this));
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        this.skipButtonV = new PreCreationViewPoolDelegate(context6, N.b(ButtonV3View.class), new FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$9(this), new FlightSeatsSchemeV2FooterBlockView$special$$inlined$preCreationViewPool$default$10(this));
        this.footerGroupViews = LazyUtilsKt.unsafeLazy(new FlightSeatsSchemeV2FooterBlockView$footerGroupViews$2(this));
        addViews();
        setConstraints();
        getInfoButtonV().setOnClickListener(new b(this, 9));
        getCaptionTV().setOnClickListener(new c(this, 7));
        setClickable(true);
        setFocusable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$15(FlightSeatsSchemeV2FooterBlockView flightSeatsSchemeV2FooterBlockView, View view) {
        Function0<Unit> function0 = flightSeatsSchemeV2FooterBlockView.onInfoClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$16(FlightSeatsSchemeV2FooterBlockView flightSeatsSchemeV2FooterBlockView, View view) {
        Function0<Unit> function0 = flightSeatsSchemeV2FooterBlockView.onInfoClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void addViews() {
        addView(this.shimmerV);
        addView(this.passengersRV);
        addView(this.separator);
        addView(getSubmitButtonV());
        addView(getCaptionTV());
        addView(getInfoButtonV());
        addView(getPriceTV());
        addView(getSkipButtonV());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getCaptionTV() {
        return (TextAtomV2View) this.captionTV.getValue(this, $$delegatedProperties[1]);
    }

    private final List<View> getFooterGroupViews() {
        return (List) this.footerGroupViews.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatImageView getInfoButtonV() {
        return (AppCompatImageView) this.infoButtonV.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomV2View getPriceTV() {
        return (TextAtomV2View) this.priceTV.getValue(this, $$delegatedProperties[3]);
    }

    private final ButtonV3View getSkipButtonV() {
        return (ButtonV3View) this.skipButtonV.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonV3View getSubmitButtonV() {
        return (ButtonV3View) this.submitButtonV.getValue(this, $$delegatedProperties[0]);
    }

    private final void setConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.shimmerV);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.shimmerV);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.passengersRV);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.passengersRV);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.passengersRV, this.shimmerV);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.separator);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.separator);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.separator, this.passengersRV);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getSubmitButtonV(), this.separator);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getSubmitButtonV());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getSubmitButtonV());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getCaptionTV(), this.separator);
        ConstraintLayoutExtensionsKt.startToParent(dVar, getCaptionTV());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getCaptionTV(), getInfoButtonV());
        ConstraintLayoutExtensionsKt.topToTop(dVar, getInfoButtonV(), getCaptionTV());
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, getInfoButtonV(), getCaptionTV());
        ConstraintLayoutExtensionsKt.startToEnd(dVar, getInfoButtonV(), getCaptionTV());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getInfoButtonV(), getSubmitButtonV());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getPriceTV(), getCaptionTV());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getPriceTV());
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getPriceTV());
        ConstraintLayoutExtensionsKt.endToStart(dVar, getPriceTV(), getSubmitButtonV());
        ConstraintLayoutExtensionsKt.topToBottom(dVar, getSkipButtonV(), this.separator);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, getSkipButtonV());
        ConstraintLayoutExtensionsKt.startToParent(dVar, getSkipButtonV());
        ConstraintLayoutExtensionsKt.endToParent(dVar, getSkipButtonV());
        dVar.f(this);
    }

    private final void setFooterGroupViewsVisible(boolean isVisible) {
        Iterator<T> it = getFooterGroupViews().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(isVisible ? 0 : 8);
        }
    }

    public final void bind(@NotNull M scope, @NotNull FlightSeatsSchemeV2FooterBlockVI item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.onInfoClick = new FlightSeatsSchemeV2FooterBlockView$bind$1(item, actionHandler);
        this.passengersAdapter.submitList(scope, item.getPassengers(), new FlightSeatsSchemeV2FooterBlockView$bind$2(item, this));
        if (item.getHideInfo()) {
            setFooterGroupViewsVisible(false);
            ButtonV3HolderKt.bindOrGone(getSkipButtonV(), item.getSkipButton(), actionHandler);
            return;
        }
        setFooterGroupViewsVisible(true);
        ViewExtKt.gone(getSkipButtonV());
        TextHolderKt.bind$default(getCaptionTV(), item.getCaption(), null, 2, null);
        TextHolderKt.bind$default(getPriceTV(), item.getPrice(), null, 2, null);
        ButtonV3HolderKt.bind(getSubmitButtonV(), item.getSubmitButton(), actionHandler);
        AppCompatImageView infoButtonV = getInfoButtonV();
        CommonAtomIconDTO infoIcon = item.getInfoIcon();
        ImageViewExtKt.loadImageOrGone(infoButtonV, infoIcon != null ? infoIcon.getIcon() : null);
        AppCompatImageView infoButtonV2 = getInfoButtonV();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CommonAtomIconDTO infoIcon2 = item.getInfoIcon();
        ThemeExtKt.tint(infoButtonV2, styleParser.parseColor(context, infoIcon2 != null ? infoIcon2.getTintColor() : null));
    }

    public final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI getItemOrNull(int position) {
        return this.passengersAdapter.getItemOrNull(position);
    }

    public final void scrollToPassengerTab(int position) {
        RecyclerView.o layoutManager = this.passengersRV.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(context);
        centerSmoothScroller.setTargetPosition(position);
        layoutManager.startSmoothScroll(centerSmoothScroller);
    }

    public final void setUp(@NotNull Function2<? super Integer, ? super FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, Unit> onPassengerSelectedListener) {
        Intrinsics.checkNotNullParameter(onPassengerSelectedListener, "onPassengerSelectedListener");
        this.onPassengerSelectedListener = onPassengerSelectedListener;
    }

    public final void showEmptyState() {
        ViewExtKt.gone(this.shimmerV);
        ViewExtKt.gone(this.passengersRV);
        ViewExtKt.gone(this.separator);
    }

    public final void showPassengers(boolean isSeparatorVisible) {
        ViewExtKt.show(this.passengersRV);
        this.separator.setVisibility(isSeparatorVisible ? 0 : 8);
        ViewExtKt.gone(this.shimmerV);
    }

    public final void showShimmer() {
        ViewExtKt.show(this.shimmerV);
        ViewExtKt.gone(this.passengersRV);
        ViewExtKt.show(this.separator);
    }

    public final void updateItem(int position, @NotNull FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.passengersAdapter.updateItem(position, new FlightSeatsSchemeV2FooterBlockView$updateItem$1(item), payload);
    }
}
