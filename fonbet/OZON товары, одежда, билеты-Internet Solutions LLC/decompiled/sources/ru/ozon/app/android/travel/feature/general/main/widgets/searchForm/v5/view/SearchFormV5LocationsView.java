package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view;

import Bi.b;
import Bu.e;
import D40.d;
import VD.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation.SearchFormV5VO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.app.android.travel.utils.animator.LinearFloatAnimator;
import ru.ozon.fintech.ui.pinprogress.h;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020\u0013H\u0014J2\u0010#\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010(\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020)2\u0006\u0010*\u001a\u00020%J\u0018\u0010+\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020%J*\u0010,\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010)2\u0006\u0010-\u001a\u00020\u00172\u0006\u0010*\u001a\u00020%2\u0006\u0010.\u001a\u00020%H\u0002J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u0002022\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u00104\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u000207H\u0002J<\u00108\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00172\f\u00109\u001a\b\u0012\u0004\u0012\u0002070:2\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<2\u0006\u0010.\u001a\u00020%H\u0002J\u001c\u0010?\u001a\u000200*\u00020\u00172\u0006\u0010@\u001a\u00020\r2\u0006\u0010A\u001a\u00020\rH\u0002J\u001e\u0010B\u001a\u00020\u00132\f\u00109\u001a\b\u0012\u0004\u0012\u0002070:2\u0006\u0010.\u001a\u00020%H\u0002J\b\u0010C\u001a\u00020\u0013H\u0002J \u0010D\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u0002072\u0006\u0010.\u001a\u00020%H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011j\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/view/SearchFormV5LocationsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp8", "locationMinHeight", "backgroundPaint", "Landroid/graphics/Paint;", "radius", "", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$Locations;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "processedActionHandler", "Lru/ozon/app/android/action/BuildedActionHandler;", "departureTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "destinationTextView", "separatorView", "Landroid/view/View;", "swapIconButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "destinationAnimator", "Lru/ozon/app/android/travel/utils/animator/LinearFloatAnimator;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onDetachedFromWindow", "bind", "isCrossFadeDepartureAnimated", "", "isCrossFadeDestinationAnimated", "swapLocations", "bindDeparture", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$TextField;", "isTextAnimated", "bindDestination", "bindLocation", "view", "isDepartureLocation", "rotateAnimator", "Landroid/animation/ValueAnimator;", "shrinkAnimator", "Landroid/animation/AnimatorSet;", "spreadAnimator", "bindSeparator", "showTextWithAnimation", "textView", "Lru/ozon/uni/atoms/data/text/TextDTO;", "showDestinationWithAnimation", "destinations", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "fadeTextAnimator", "from", "to", "startTypingTextAnimation", "stopTypingTextAnimation", "updateCurrentTextField", "visibleCharacters", "currentTextField", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV5LocationsView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final TextAtomV2View departureTextView;
    private LinearFloatAnimator destinationAnimator;

    @NotNull
    private final TextAtomV2View destinationTextView;
    private final int dp4;
    private final int dp8;
    private SearchFormV5VO.Content.Locations item;
    private final int locationMinHeight;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;
    private float radius;

    @NotNull
    private final View separatorView;

    @NotNull
    private final IconButtonV3View swapIconButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFormV5LocationsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        int px3 = ResourceExtKt.toPx(44, context);
        this.locationMinHeight = px3;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
        this.processedActionHandler = new SearchFormV5LocationsView$processedActionHandler$1(this);
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, 2413, 0, -2);
        d11.f41656t = 0;
        d11.f41657u = 2411;
        d11.f41636i = 0;
        d11.f41640k = 2412;
        ((ViewGroup.MarginLayoutParams) d11).bottomMargin = px;
        d11.f41662z = 0;
        d11.setMarginEnd(px2);
        textAtomV2View.setGravity(16);
        d11.f41595B = 0;
        textAtomV2View.setMinimumHeight(px3);
        textAtomV2View.setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary), px2));
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.departureTextView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, 2415, 0, -2);
        d12.f41656t = 2413;
        d12.f41658v = 2413;
        d12.f41638j = 2412;
        textAtomV2View2.setGravity(16);
        d12.f41642l = 0;
        ((ViewGroup.MarginLayoutParams) d12).topMargin = px;
        textAtomV2View2.setMinimumHeight(px3);
        textAtomV2View2.setForeground(DrawableExtensionsKt.contentlessRipple(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary), px2));
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        this.destinationTextView = textAtomV2View2;
        View view = new View(context);
        view.setId(2412);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, ResourceExtKt.toPx(1, context));
        bVar.f41656t = 0;
        bVar.f41657u = 2411;
        bVar.f41638j = 2413;
        bVar.f41640k = 2415;
        bVar.setMarginEnd(px2);
        bVar.f41595B = 0;
        view.setLayoutParams(bVar);
        this.separatorView = view;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, 2411, -2, -2);
        c11.f41636i = 0;
        c11.f41642l = 0;
        c11.f41658v = 0;
        c11.f41617X = true;
        iconButtonV3View.setLayoutParams(c11);
        this.swapIconButton = iconButtonV3View;
        setWillNotDraw(false);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(view);
        addView(iconButtonV3View);
    }

    private final void bindLocation(SearchFormV5VO.Content.TextField item, TextAtomV2View view, boolean isTextAnimated, boolean isDepartureLocation) {
        stopTypingTextAnimation();
        if (item == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (isTextAnimated) {
            showTextWithAnimation(view, item.getText());
        } else {
            List<TextDTO> destinations = item.getDestinations();
            if (destinations == null || destinations.isEmpty()) {
                TextHolderKt.bind$default(view, item.getText(), null, 2, null);
            } else {
                showDestinationWithAnimation(view, item.getDestinations(), item.getCommonControlSettings().getTrackingInfo(), isDepartureLocation);
            }
        }
        view.setOnClickListener(new a(6, item.getCommonControlSettings(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindLocation$lambda$14$lambda$13(CommonControlSettings commonControlSettings, SearchFormV5LocationsView searchFormV5LocationsView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomActionDTO action = commonControlSettings.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo()) : null;
        if (atomAction == null || (function1 = searchFormV5LocationsView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void bindSeparator(SearchFormV5VO.Content.Locations item) {
        View view = this.separatorView;
        view.setVisibility(item.getIsSeparatorVisible() ? 0 : 8);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getSeparatorColor());
        if (parseColor != null) {
            view.setBackgroundColor(parseColor.intValue());
        }
    }

    private final ValueAnimator fadeTextAnimator(TextAtomV2View textAtomV2View, float f7, float f11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f11);
        ofFloat.addUpdateListener(new h(textAtomV2View, 1));
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fadeTextAnimator$lambda$32$lambda$31(TextAtomV2View textAtomV2View, ValueAnimator valueAnimator) {
        textAtomV2View.setAlpha(((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue());
    }

    private final ValueAnimator rotateAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -180.0f);
        ofFloat.addUpdateListener(new e(this, 2));
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rotateAnimator$lambda$16$lambda$15(SearchFormV5LocationsView searchFormV5LocationsView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        IconButtonV3View iconButtonV3View = searchFormV5LocationsView.swapIconButton;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        iconButtonV3View.setRotation(((Float) animatedValue).floatValue());
    }

    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final void showDestinationWithAnimation(TextAtomV2View textView, List<TextDTO> destinations, Map<String, TokenizedTrackingInfo> trackingInfo, boolean isDepartureLocation) {
        ?? r02;
        TextDTO textDTO = (TextDTO) C7714v.M(destinations);
        int i11 = 2;
        if (textDTO != null) {
            Object obj = null;
            TextDTO copy$default = TextDTO.copy$default(textDTO, new OzonSpannableString(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
            r02 = obj;
            if (copy$default != null) {
                TextHolderKt.bind$default(textView, copy$default, null, 2, null);
                r02 = obj;
            }
        } else {
            r02 = 0;
        }
        startTypingTextAnimation(destinations, isDepartureLocation);
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(new AtomAction.ViewAction(trackingInfo, r02, i11, r02));
        }
    }

    private final void showTextWithAnimation(final TextAtomV2View textView, final TextDTO item) {
        ValueAnimator fadeTextAnimator = fadeTextAnimator(textView, 1.0f, 0.0f);
        ValueAnimator fadeTextAnimator2 = fadeTextAnimator(textView, 0.0f, 1.0f);
        fadeTextAnimator2.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView$showTextWithAnimation$fadeIn$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                TextHolderKt.bind$default(TextAtomV2View.this, item, null, 2, null);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(fadeTextAnimator, fadeTextAnimator2);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    private final AnimatorSet shrinkAnimator() {
        float height = this.departureTextView.getHeight() / 2.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, height);
        ofFloat.addUpdateListener(new yQ.a(this, height, 1));
        float height2 = this.destinationTextView.getHeight() / 2.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, -height2);
        ofFloat2.addUpdateListener(new NB.a(this, height2, 2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shrinkAnimator$lambda$18$lambda$17(SearchFormV5LocationsView searchFormV5LocationsView, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        searchFormV5LocationsView.departureTextView.setTranslationY(floatValue);
        searchFormV5LocationsView.departureTextView.setAlpha(1.0f - (floatValue / f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shrinkAnimator$lambda$20$lambda$19(SearchFormV5LocationsView searchFormV5LocationsView, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        searchFormV5LocationsView.destinationTextView.setTranslationY(floatValue);
        searchFormV5LocationsView.destinationTextView.setAlpha(1.0f - ((-floatValue) / f7));
    }

    private final AnimatorSet spreadAnimator(final SearchFormV5VO.Content.Locations item) {
        final float height = this.departureTextView.getHeight() / 2.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(height, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zQ.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchFormV5LocationsView.spreadAnimator$lambda$23$lambda$22(SearchFormV5LocationsView.this, height, valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView$spreadAnimator$moveUp$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                SearchFormV5LocationsView.this.bindDeparture(item.getDeparture(), false);
            }
        });
        final float height2 = this.destinationTextView.getHeight() / 2.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-height2, 0.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zQ.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchFormV5LocationsView.spreadAnimator$lambda$25$lambda$24(SearchFormV5LocationsView.this, height2, valueAnimator);
            }
        });
        ofFloat2.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView$spreadAnimator$moveDown$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                SearchFormV5LocationsView.this.bindDestination(item.getDestination(), false);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void spreadAnimator$lambda$23$lambda$22(SearchFormV5LocationsView searchFormV5LocationsView, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        searchFormV5LocationsView.departureTextView.setTranslationY(floatValue);
        searchFormV5LocationsView.departureTextView.setAlpha(1.0f - (floatValue / f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void spreadAnimator$lambda$25$lambda$24(SearchFormV5LocationsView searchFormV5LocationsView, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        searchFormV5LocationsView.destinationTextView.setTranslationY(floatValue);
        searchFormV5LocationsView.destinationTextView.setAlpha(1.0f - ((-floatValue) / f7));
    }

    private final void startTypingTextAnimation(List<TextDTO> destinations, boolean isDepartureLocation) {
        stopTypingTextAnimation();
        K k11 = new K();
        M m11 = new M();
        LinearFloatAnimator linearFloatAnimator = new LinearFloatAnimator();
        linearFloatAnimator.setDuration(2000L);
        linearFloatAnimator.setListener(new SearchFormV5LocationsView$startTypingTextAnimation$1$1(k11, destinations, this, isDepartureLocation, m11));
        linearFloatAnimator.start();
        this.destinationAnimator = linearFloatAnimator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopTypingTextAnimation() {
        LinearFloatAnimator linearFloatAnimator = this.destinationAnimator;
        if (linearFloatAnimator != null) {
            linearFloatAnimator.cancel();
        }
        this.destinationAnimator = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentTextField(int visibleCharacters, TextDTO currentTextField, boolean isDepartureLocation) {
        String obj = currentTextField.getText().subSequence(0, visibleCharacters).toString();
        if (isDepartureLocation) {
            this.departureTextView.setText(obj);
        } else {
            this.destinationTextView.setText(obj);
        }
    }

    public final void bind(@NotNull SearchFormV5VO.Content.Locations item, boolean isCrossFadeDepartureAnimated, boolean isCrossFadeDestinationAnimated, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.item = item;
        this.actionHandler = actionHandler;
        this.radius = item.getCornerRadius();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        if (parseColor != null) {
            this.backgroundPaint.setColor(parseColor.intValue());
        }
        bindDeparture(item.getDeparture(), isCrossFadeDepartureAnimated);
        bindDestination(item.getDestination(), isCrossFadeDestinationAnimated);
        bindSeparator(item);
        IconButtonV3HolderKt.bindOrGone(this.swapIconButton, item.getSwapButton(), this.processedActionHandler);
        invalidate();
    }

    public final void bindDeparture(@NotNull SearchFormV5VO.Content.TextField item, boolean isTextAnimated) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindLocation(item, this.departureTextView, isTextAnimated, true);
    }

    public final void bindDestination(SearchFormV5VO.Content.TextField item, boolean isTextAnimated) {
        bindLocation(item, this.destinationTextView, isTextAnimated, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopTypingTextAnimation();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        SearchFormV5VO.Content.Locations locations = this.item;
        if (locations == null || locations.getBackgroundColor() == null) {
            super.onDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float f7 = this.radius;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f7, f7, this.backgroundPaint);
    }

    public final void swapLocations(@NotNull SearchFormV5VO.Content.Locations item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(shrinkAnimator(), spreadAnimator(item));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(rotateAnimator(), animatorSet);
        animatorSet2.start();
    }
}
