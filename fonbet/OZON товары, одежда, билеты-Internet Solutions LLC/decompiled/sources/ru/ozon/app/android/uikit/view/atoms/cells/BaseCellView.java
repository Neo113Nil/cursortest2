package ru.ozon.app.android.uikit.view.atoms.cells;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u001f\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0004¢\u0006\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00078\u0004X\u0085\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010'R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b4\u0010)R(\u0010<\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010B\u001a\u0004\u0018\u00010=2\b\u00107\u001a\u0004\u0018\u00010=8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isEnabled", "", "setEnabled", "(Z)V", "color", "colorDisabledAsEnabled", "setTitleTextColor", "(IZ)V", "maxLines", "setTitleMaxLines", "(I)V", "resetTitleMaxLines", "()V", "hideSeparator", "", "testId", "setTestId", "(Ljava/lang/String;)V", "alignActionViewTopVertical", "alignActionViewCenterVertical", "Landroid/widget/TextView;", "textView", "setMaxLines", "(Landroid/widget/TextView;I)V", "resetMaxLines", "(Landroid/widget/TextView;)V", "disabledTextColor", "I", "getDisabledTextColor", "()I", "titleTextColor", "Z", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTextAtomView", "Landroid/view/View;", "getSeparatorView", "()Landroid/view/View;", "separatorView", "getActionViewId", "actionViewId", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroid/text/method/MovementMethod;", "getTitleMovementMethod", "()Landroid/text/method/MovementMethod;", "setTitleMovementMethod", "(Landroid/text/method/MovementMethod;)V", "titleMovementMethod", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseCellView extends ConstraintLayout implements AtomView {
    private boolean colorDisabledAsEnabled;
    private final int disabledTextColor;
    private int titleTextColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseCellView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setTitleTextColor$default(BaseCellView baseCellView, int i11, boolean z11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTitleTextColor");
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        baseCellView.setTitleTextColor(i11, z11);
    }

    public void alignActionViewCenterVertical() {
        d dVar = new d();
        dVar.p(this);
        dVar.s(getActionViewId(), 3, 0, 3);
        dVar.s(getActionViewId(), 4, 0, 4);
        dVar.f(this);
    }

    public void alignActionViewTopVertical() {
        d dVar = new d();
        dVar.p(this);
        dVar.s(getActionViewId(), 3, R$id.titleTav, 3);
        dVar.o(getActionViewId(), 4);
        dVar.f(this);
    }

    public abstract int getActionViewId();

    protected final int getDisabledTextColor() {
        return this.disabledTextColor;
    }

    @NotNull
    /* renamed from: getSeparatorView */
    public abstract View getSeparator();

    @NotNull
    /* renamed from: getTitleTextAtomView */
    public abstract TextAtomView getTitleTav();

    public final void hideSeparator(boolean hideSeparator) {
        ViewExtKt.showOrGone(getSeparator(), Boolean.valueOf(!hideSeparator));
    }

    protected final void resetMaxLines(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setEllipsize(null);
    }

    public final void resetTitleMaxLines() {
        resetMaxLines(getTitleTav());
    }

    @Override // android.view.View
    public void setEnabled(boolean isEnabled) {
        super.setEnabled(isEnabled);
        if (isEnabled || this.colorDisabledAsEnabled) {
            getTitleTav().setTextColor(this.titleTextColor);
        } else {
            getTitleTav().setTextColor(this.disabledTextColor);
        }
    }

    protected final void setMaxLines(@NotNull TextView textView, int maxLines) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setMaxLines(maxLines);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void setTestId(String testId) {
        getTitleTav().setContentDescription(testId);
    }

    public final void setTitle(CharSequence charSequence) {
        getTitleTav().setText(charSequence);
    }

    public final void setTitleMaxLines(int maxLines) {
        setMaxLines(getTitleTav(), maxLines);
    }

    public final void setTitleMovementMethod(MovementMethod movementMethod) {
        getTitleTav().setMovementMethod(movementMethod);
    }

    public final void setTitleTextColor(int color, boolean colorDisabledAsEnabled) {
        this.titleTextColor = color;
        this.colorDisabledAsEnabled = colorDisabledAsEnabled;
        if (isEnabled() || colorDisabledAsEnabled) {
            TextAtomView titleTav = getTitleTav();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            titleTav.setLinkTextColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_accent_primary));
            getTitleTav().setTextColor(color);
        }
    }

    public /* synthetic */ BaseCellView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCellView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.disabledTextColor = a.getColor(context, R$color.oz_gray_60);
        setMinHeight(ResourceExtKt.toPx(44));
    }
}
