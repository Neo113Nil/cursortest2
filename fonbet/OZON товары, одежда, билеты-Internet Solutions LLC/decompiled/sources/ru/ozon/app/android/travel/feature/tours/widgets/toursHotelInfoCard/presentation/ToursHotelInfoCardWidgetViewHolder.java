package ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.presentation;

import LT.a;
import WZ.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.flexbox.FlexboxLayout;
import gk0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.tours.databinding.WidgetToursHotelInfoCardBinding;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.html.spans.OzonClickableSpan;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J#\u0010\"\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b\"\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0010088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "features", "", "bindFeatures", "(Ljava/util/List;)V", "setUpLinkMovementMethod", "()V", "Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;", "backgroundProducer", "setUpRootView", "(Lru/ozon/app/android/travel/utils/RoundedBackgroundProducer;)V", "setUpCellLayout", "item", "animateDescriptionTextView", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursHotelInfoCard/presentation/ToursHotelInfoCardVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetToursHotelInfoCardBinding;", "binding", "Lru/ozon/app/android/travel/feature/tours/databinding/WidgetToursHotelInfoCardBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "", "rootRadius", "F", "cellListRadius", "", "badgeMargin", "I", "Lkotlin/Function0;", "spanClickListener", "Lkotlin/jvm/functions/Function0;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursHotelInfoCardWidgetViewHolder extends k<ToursHotelInfoCardVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int badgeMargin;

    @NotNull
    private final WidgetToursHotelInfoCardBinding binding;

    @NotNull
    private final AtomsAdapter cellAdapter;
    private final float cellListRadius;

    @NotNull
    private final ComposerReferences references;
    private final float rootRadius;

    @NotNull
    private final Function0<Unit> spanClickListener;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursHotelInfoCardWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetToursHotelInfoCardBinding bind = WidgetToursHotelInfoCardBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.cellAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.rootRadius = ResourceExtKt.toPxF(24, getContext());
        this.cellListRadius = ResourceExtKt.toPxF(16, getContext());
        this.badgeMargin = ResourceExtKt.toPx(8, getContext());
        this.spanClickListener = new ToursHotelInfoCardWidgetViewHolder$spanClickListener$1(this);
        setUpLinkMovementMethod();
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        setUpRootView(roundedBackgroundProducer);
        setUpCellLayout(roundedBackgroundProducer);
    }

    private final void animateDescriptionTextView(final ToursHotelInfoCardVO item) {
        final AppCompatTextView toursHotelInfoDescriptionTextView = this.binding.toursHotelInfoDescriptionTextView;
        Intrinsics.checkNotNullExpressionValue(toursHotelInfoDescriptionTextView, "toursHotelInfoDescriptionTextView");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((toursHotelInfoDescriptionTextView.getWidth() - toursHotelInfoDescriptionTextView.getPaddingStart()) - toursHotelInfoDescriptionTextView.getPaddingEnd(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int height = toursHotelInfoDescriptionTextView.getHeight();
        toursHotelInfoDescriptionTextView.setText(item.getIsExpanded() ? item.getFullDescription() : item.getShortDescription());
        toursHotelInfoDescriptionTextView.measure(makeMeasureSpec, makeMeasureSpec2);
        ValueAnimator duration = ValueAnimator.ofInt(height, toursHotelInfoDescriptionTextView.getMeasuredHeight()).setDuration(200L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.presentation.ToursHotelInfoCardWidgetViewHolder$animateDescriptionTextView$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
                if (ToursHotelInfoCardVO.this.getIsExpanded()) {
                    return;
                }
                toursHotelInfoDescriptionTextView.setText(ToursHotelInfoCardVO.this.getShortDescription());
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (ToursHotelInfoCardVO.this.getIsExpanded()) {
                    return;
                }
                toursHotelInfoDescriptionTextView.setText(ToursHotelInfoCardVO.this.getFullDescription());
            }
        });
        duration.addUpdateListener(new a(toursHotelInfoDescriptionTextView, 0));
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDescriptionTextView$lambda$8$lambda$7(AppCompatTextView appCompatTextView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((Integer) animatedValue).intValue();
        appCompatTextView.setLayoutParams(layoutParams);
    }

    private final void bindFeatures(List<Badge> features) {
        FlexboxLayout flexboxLayout = this.binding.toursHotelInfoFeaturesLayout;
        flexboxLayout.removeAllViews();
        List<Badge> list = features;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (Badge badge : list) {
            q qVar = q.f64554a;
            d b11 = N.b(BadgeView.class);
            Context context = flexboxLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BadgeView badgeView = (BadgeView) qVar.g(b11, context);
            FlexboxLayout.a aVar = new FlexboxLayout.a(-2, -2);
            int i11 = this.badgeMargin;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = i11;
            aVar.setMarginEnd(i11);
            badgeView.setLayoutParams(aVar);
            BadgeHolderKt.bind(badgeView, badge, this.actionHandler);
            arrayList.add(badgeView);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            flexboxLayout.addView((View) it.next());
        }
    }

    private final void setUpCellLayout(RoundedBackgroundProducer backgroundProducer) {
        this.cellAdapter.setOnAction(this.actionHandler);
        VerticalAtomsLayout verticalAtomsLayout = this.binding.toursHotelInfoCellLayout;
        verticalAtomsLayout.setClipToOutline(true);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setBackground(backgroundProducer.produce(ThemeExtKt.themeColor(context, R$attr.bgSecondary), this.cellListRadius));
        verticalAtomsLayout.setAdapter(this.cellAdapter);
    }

    private final void setUpLinkMovementMethod() {
        this.binding.toursHotelInfoDescriptionTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private final void setUpRootView(RoundedBackgroundProducer backgroundProducer) {
        this.binding.toursHotelInfoRoot.setBackground(backgroundProducer.produce(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1), this.rootRadius));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ToursHotelInfoCardVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (Intrinsics.d(payload, "ToursHotelInfoExpandCollapsePayload")) {
            animateDescriptionTextView(item);
        } else {
            bind(item, info);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ToursHotelInfoCardVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView toursHotelInfoTitleTextView = this.binding.toursHotelInfoTitleTextView;
        Intrinsics.checkNotNullExpressionValue(toursHotelInfoTitleTextView, "toursHotelInfoTitleTextView");
        TextAtomHolderKt.bind$default(toursHotelInfoTitleTextView, item.getTitle(), null, 2, null);
        AppCompatTextView appCompatTextView = this.binding.toursHotelInfoDescriptionTextView;
        OzonClickableSpan shortClickableSpan = item.getShortClickableSpan();
        if (shortClickableSpan != null) {
            Intrinsics.f(appCompatTextView);
            shortClickableSpan.setOnClick(appCompatTextView, this.spanClickListener);
        }
        OzonClickableSpan fullClickableSpan = item.getFullClickableSpan();
        if (fullClickableSpan != null) {
            Intrinsics.f(appCompatTextView);
            fullClickableSpan.setOnClick(appCompatTextView, this.spanClickListener);
        }
        Intrinsics.f(appCompatTextView);
        appCompatTextView.setVisibility(item.getIsDescriptionVisible() ? 0 : 8);
        appCompatTextView.setText(item.getIsExpanded() ? item.getFullDescription() : item.getShortDescription());
        FlexboxLayout toursHotelInfoFeaturesLayout = this.binding.toursHotelInfoFeaturesLayout;
        Intrinsics.checkNotNullExpressionValue(toursHotelInfoFeaturesLayout, "toursHotelInfoFeaturesLayout");
        toursHotelInfoFeaturesLayout.setVisibility(item.getAreFeaturesVisible() ? 0 : 8);
        bindFeatures(item.getHotelFeatures());
        VerticalAtomsLayout toursHotelInfoCellLayout = this.binding.toursHotelInfoCellLayout;
        Intrinsics.checkNotNullExpressionValue(toursHotelInfoCellLayout, "toursHotelInfoCellLayout");
        toursHotelInfoCellLayout.setVisibility(item.getAreCellsVisible() ? 0 : 8);
        this.cellAdapter.bind(getContext(), item.getCells());
    }
}
