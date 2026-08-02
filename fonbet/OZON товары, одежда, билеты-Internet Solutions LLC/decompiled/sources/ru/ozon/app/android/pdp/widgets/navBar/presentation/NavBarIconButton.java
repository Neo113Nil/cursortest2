package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import BC.a;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DPS;
import ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"J1\u0010)\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001d2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&¢\u0006\u0004\b)\u0010*JZ\u00105\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u0001012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001003H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b7\u0010\u001cJ*\u00108\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u000101H\u0096\u0001¢\u0006\u0004\b8\u00109J&\u0010;\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u001d2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001003H\u0096\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b=\u0010\"J\u0019\u0010>\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b>\u0010 R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0010\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010D¨\u0006E"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarIconButton;", "Landroid/view/View;", "Lru/ozon/app/android/pdp/utils/DPS;", "Lru/ozon/app/android/pdp/widgets/navBar/NavBarUtils;", "", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/ChangeButtonState;", "Landroid/content/Context;", "context", "", "", "", "colors", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "width", "height", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "newState", "updateState", "(Z)V", "onDetach", "()V", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$NavBarButton;", "item", "visibleState", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$NavBarButton;ZLkotlin/jvm/functions/Function1;)V", "newBackgroundColorToken", "", "newCornerRadius", "newIconTintColorToken", "newIcon", "view", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;", "commonBgForIcons", "Lkotlin/Function0;", "onInvalidate", "updateButton", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Landroid/view/View;ZLru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;Lkotlin/jvm/functions/Function0;)V", "onDrawButton", "updateDrawableBounds", "(IILru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;)V", "isVisible", "animateBackgroundVisibility", "(ZLkotlin/jvm/functions/Function0;)V", "cancelAnimation", "bindInternal", "Ljava/util/Map;", "currentModel", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$NavBarButton;", "currentVisibleState", "Z", "Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class NavBarIconButton extends View implements DPS, NavBarUtils, ChangeButtonState {
    private final /* synthetic */ NavBarButtonDelegateImpl $$delegate_0;
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final Map<String, Integer> colors;
    private NavBarVO.Button.NavBarButton currentModel;
    private boolean currentVisibleState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarIconButton(@NotNull Context context, @NotNull Map<String, Integer> colors) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.$$delegate_0 = new NavBarButtonDelegateImpl(context, colors);
        this.colors = colors;
        setOnClickListener(new a(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(NavBarIconButton navBarIconButton, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        NavBarVO.Button.NavBarButton navBarButton = navBarIconButton.currentModel;
        if (navBarButton == null || (action = navBarButton.getAction()) == null || (function1 = navBarIconButton.actionHandler) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void bindInternal(boolean visibleState) {
        NavBarVO.Button.NavBarButton navBarButton = this.currentModel;
        if (navBarButton != null) {
            updateButton(navBarButton.getInvisibleStateButtonBackground(), navBarButton.getCornerRadius(), this.currentVisibleState ? navBarButton.getVisibleStateIconTintColor() : navBarButton.getInvisibleStateIconTintColor(), navBarButton.getIcon(), this, visibleState, navBarButton.getCommonBgForIcons(), new NavBarIconButton$bindInternal$1$1(this));
        }
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils
    @NotNull
    public ValueAnimator alphaAnimation(boolean z11, int i11, int i12, long j11, boolean z12, @NotNull Function1<? super Integer, Unit> function1) {
        return NavBarUtils.DefaultImpls.alphaAnimation(this, z11, i11, i12, j11, z12, function1);
    }

    public void animateBackgroundVisibility(boolean isVisible, @NotNull Function0<Unit> onInvalidate) {
        Intrinsics.checkNotNullParameter(onInvalidate, "onInvalidate");
        this.$$delegate_0.animateBackgroundVisibility(isVisible, onInvalidate);
    }

    public final void bind(@NotNull NavBarVO.Button.NavBarButton item, boolean visibleState, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.currentModel = item;
        this.currentVisibleState = visibleState;
        bindInternal(visibleState);
    }

    public void cancelAnimation() {
        this.$$delegate_0.cancelAnimation();
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.NavBarConstants
    public long getAnimationDuration() {
        return NavBarUtils.DefaultImpls.getAnimationDuration(this);
    }

    public int getDp36() {
        return DPS.DefaultImpls.getDp36(this);
    }

    public int getDp8() {
        return DPS.DefaultImpls.getDp8(this);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.presentation.ChangeButtonState
    public void onDetach() {
        cancelAnimation();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        onDrawButton(canvas);
    }

    public void onDrawButton(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.$$delegate_0.onDrawButton(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int dp36 = getDp36();
        setMeasuredDimension(View.resolveSize(dp36, widthMeasureSpec), View.resolveSize(dp36, heightMeasureSpec));
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        super.onSizeChanged(width, height, oldw, oldh);
        NavBarVO.Button.NavBarButton navBarButton = this.currentModel;
        updateDrawableBounds(width, height, navBarButton != null ? navBarButton.getCommonBgForIcons() : null);
    }

    public void updateButton(@NotNull String newBackgroundColorToken, float newCornerRadius, String newIconTintColorToken, @NotNull String newIcon, @NotNull View view, boolean visibleState, NavBarVO.CommonBgForIcon commonBgForIcons, @NotNull Function0<Unit> onInvalidate) {
        Intrinsics.checkNotNullParameter(newBackgroundColorToken, "newBackgroundColorToken");
        Intrinsics.checkNotNullParameter(newIcon, "newIcon");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onInvalidate, "onInvalidate");
        this.$$delegate_0.updateButton(newBackgroundColorToken, newCornerRadius, newIconTintColorToken, newIcon, view, visibleState, commonBgForIcons, onInvalidate);
    }

    public void updateDrawableBounds(int width, int height, NavBarVO.CommonBgForIcon commonBgForIcons) {
        this.$$delegate_0.updateDrawableBounds(width, height, commonBgForIcons);
    }

    @Override // ru.ozon.app.android.pdp.widgets.navBar.presentation.ChangeButtonState
    public void updateState(boolean newState) {
        if (this.currentVisibleState != newState) {
            this.currentVisibleState = newState;
            bindInternal(newState);
            animateBackgroundVisibility(!newState, new NavBarIconButton$updateState$1(this));
        }
    }
}
