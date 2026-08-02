package ru.ozon.app.android.pdp.widgets.brand.presentation.simple;

import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import jk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.widgets.brand.presentation.SimpleBrandVO;
import ru.ozon.app.android.pdp.widgets.brand.presentation.simple.SimpleBrandBinder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.button.UncontainedIconLabelButtonView;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.UncontainedIconLabelButtonHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00160%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/simple/SimpleBrandBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/SimpleBrandVO;", "Landroid/widget/FrameLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolderOwner", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;LWZ/l;)V", "item", "Ll20/d;", "info", "", "payload", "Lkotlin/Function0;", "", "onFinish", "bind", "(Lru/ozon/app/android/pdp/widgets/brand/presentation/SimpleBrandVO;Ll20/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Landroid/widget/FrameLayout;", "Lru/ozon/composer/ui/widget/k;", "getViewHolderOwner", "()Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "Lru/ozon/uni/android/controls/button/UncontainedIconLabelButtonView;", "uncontainedButton", "Lru/ozon/uni/android/controls/button/UncontainedIconLabelButtonView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/SimpleBrandVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class SimpleBrandBinder extends BaseWidgetPlaceholderBinder<SimpleBrandVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FrameLayout containerView;
    private SimpleBrandVO item;
    private final UncontainedIconLabelButtonView uncontainedButton;

    @NotNull
    private final k<SimpleBrandVO> viewHolderOwner;

    @NotNull
    private final WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;

    public SimpleBrandBinder(@NotNull FrameLayout containerView, @NotNull ComposerReferences refs, @NotNull k<SimpleBrandVO> viewHolderOwner, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, @NotNull final l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewHolderOwner, "viewHolderOwner");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.viewHolderOwner = viewHolderOwner;
        this.widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        Object L11 = C7714v.L(ViewGroupExtKt.children(containerView));
        this.uncontainedButton = L11 instanceof UncontainedIconLabelButtonView ? (UncontainedIconLabelButtonView) L11 : null;
        this.actionHandler = new ActionHandler.Builder(refs, getViewHolderOwner()).buildHandler();
        containerView.setOnTouchListener(new View.OnTouchListener() { // from class: gD.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean _init_$lambda$1;
                _init_$lambda$1 = SimpleBrandBinder._init_$lambda$1(SimpleBrandBinder.this, tokenizedAnalytics, view, motionEvent);
                return _init_$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(SimpleBrandBinder simpleBrandBinder, l lVar, View view, MotionEvent motionEvent) {
        SimpleBrandVO simpleBrandVO;
        t tokenizedEvent;
        UncontainedIconLabelButtonDTO button;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        SimpleBrandVO simpleBrandVO2 = simpleBrandBinder.item;
        if (((simpleBrandVO2 == null || (button = simpleBrandVO2.getButton()) == null) ? null : button.getTrackingInfo()) != null || (simpleBrandVO = simpleBrandBinder.item) == null || (tokenizedEvent = simpleBrandVO.getTokenizedEvent()) == null) {
            return false;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tokenizedEvent, null, 2, null);
        return false;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder
    public /* bridge */ /* synthetic */ void bind(SimpleBrandVO simpleBrandVO, d dVar, Object obj, Function0 function0) {
        bind2(simpleBrandVO, dVar, obj, (Function0<Unit>) function0);
    }

    @NotNull
    public k<SimpleBrandVO> getViewHolderOwner() {
        return this.viewHolderOwner;
    }

    public void onVisibleAreaChanged(@NotNull q info) {
        String stateId;
        Intrinsics.checkNotNullParameter(info, "info");
        String json = getJson();
        if (json == null || (stateId = getStateId()) == null) {
            return;
        }
        Pair pair = new Pair(json, stateId);
        WidgetImagePlaceholderAdapter.cacheViewIfNeeded$default(this.widgetImagePlaceholderAdapter, this.containerView, "SimpleBrandWidget", (String) pair.b(), info, (String) pair.a(), null, 32, null);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull SimpleBrandVO item, d info, Object payload, Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((SimpleBrandBinder) item, info, payload, onFinish);
        this.item = item;
        UncontainedIconLabelButtonView uncontainedIconLabelButtonView = this.uncontainedButton;
        if (uncontainedIconLabelButtonView == null) {
            return;
        }
        UncontainedIconLabelButtonHolderKt.bind(uncontainedIconLabelButtonView, item.getButton(), this.actionHandler);
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.containerView.setBackgroundColor(ContextExtKt.parseColor(context, item.getBackground()));
        if (onFinish != null) {
            onFinish.invoke();
        }
    }
}
