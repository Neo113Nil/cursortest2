package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view;

import D3.h;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionVO;
import ru.ozon.app.android.travel.utils.extensions.TextDTOExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u001a\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0016J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionContentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp12", "dp16", "checkboxView", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "stateChangeListener", "Lkotlin/Function2;", "", "bindCheckbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "setUp", "addChildren", "setConstraints", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionContentView extends ConstraintLayout {
    public static final int $stable = TextAtomV2View.$stable | CheckBoxView.$stable;

    @NotNull
    private final CheckBoxView checkboxView;
    private final int dp12;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSubscriptionContentView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp12 = UiExtKt.toPx(12, context);
        this.dp16 = UiExtKt.toPx(16, context);
        CheckBoxView checkBoxView = new CheckBoxView(context, null, 0, 6, null);
        checkBoxView.setId(View.generateViewId());
        checkBoxView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.checkboxView = checkBoxView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        h.f(0, -2, textAtomV2View);
        this.textView = textAtomV2View;
        setUp();
        addChildren();
        setConstraints();
    }

    private final void addChildren() {
        addView(this.checkboxView);
        addView(this.textView);
    }

    private final void setConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new NotificationSubscriptionContentView$setConstraints$1(this));
    }

    private final void setUp() {
        int i11 = this.dp16;
        int i12 = this.dp12;
        setPadding(i11, i12, i11, i12);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }

    public final void bind(@NotNull NotificationSubscriptionVO.Loaded item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super AtomAction, ? super Boolean, Unit> stateChangeListener) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(stateChangeListener, "stateChangeListener");
        CheckBoxHolderKt.bind$default(this.checkboxView, item.getCheckbox(), null, 2, null);
        this.checkboxView.setOnStateChangeListener(new NotificationSubscriptionContentView$bind$1(stateChangeListener, item));
        TextHolderKt.bind$default(this.textView, TextDTOExtensionsKt.withNavigationLinksHandling(item.getText(), this.textView, actionHandler), null, 2, null);
    }

    public final void bindCheckbox(@NotNull CheckBoxDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CheckBoxHolderKt.bind$default(this.checkboxView, item, null, 2, null);
    }
}
