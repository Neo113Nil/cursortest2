package ru.ozon.app.android.uikit.view.atoms.cells;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\r*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R(\u0010*\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u00100\u001a\u0004\u0018\u00010+2\b\u0010%\u001a\u0004\u0018\u00010+8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isEnabled", "", "setEnabled", "(Z)V", "color", "colorDisabledAsEnabled", "setSubtitleTextColor", "(IZ)V", "maxLines", "setSubtitleMaxLines", "(I)V", "resetSubtitleMaxLines", "()V", "Landroidx/constraintlayout/widget/d;", "margin", "fixTextsMargins", "(Landroidx/constraintlayout/widget/d;I)V", "subtitleTextColor", "I", "Z", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getSubtitleTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitleTextAtomView", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getSubtitle", "()Ljava/lang/CharSequence;", "setSubtitle", "(Ljava/lang/CharSequence;)V", "subtitle", "Landroid/text/method/MovementMethod;", "getSubtitleMovementMethod", "()Landroid/text/method/MovementMethod;", "setSubtitleMovementMethod", "(Landroid/text/method/MovementMethod;)V", "subtitleMovementMethod", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseCellWithSubtitleView extends BaseCellView implements AtomView {
    private boolean colorDisabledAsEnabled;
    private int subtitleTextColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseCellWithSubtitleView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setSubtitleTextColor$default(BaseCellWithSubtitleView baseCellWithSubtitleView, int i11, boolean z11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSubtitleTextColor");
        }
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        baseCellWithSubtitleView.setSubtitleTextColor(i11, z11);
    }

    protected final void fixTextsMargins(@NotNull d dVar, int i11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        dVar.e0(getTitleTav().getId(), 3, i11);
        dVar.e0(getSubtitleTav().getId(), 4, i11);
        dVar.Z(getTitleTav().getId(), 4, i11);
    }

    @NotNull
    /* renamed from: getSubtitleTextAtomView */
    public abstract TextAtomView getSubtitleTav();

    public final void resetSubtitleMaxLines() {
        resetMaxLines(getSubtitleTav());
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView, android.view.View
    public void setEnabled(boolean isEnabled) {
        super.setEnabled(isEnabled);
        if (isEnabled || this.colorDisabledAsEnabled) {
            getSubtitleTav().setTextColor(this.subtitleTextColor);
        } else {
            getSubtitleTav().setTextColor(getDisabledTextColor());
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextAtomView subtitleTav = getSubtitleTav();
        subtitleTav.setText(charSequence);
        ViewExtKt.showOrGone(subtitleTav, Boolean.valueOf(charSequence != null));
    }

    public final void setSubtitleMaxLines(int maxLines) {
        setMaxLines(getSubtitleTav(), maxLines);
    }

    public final void setSubtitleMovementMethod(MovementMethod movementMethod) {
        getSubtitleTav().setMovementMethod(movementMethod);
    }

    public final void setSubtitleTextColor(int color, boolean colorDisabledAsEnabled) {
        this.subtitleTextColor = color;
        this.colorDisabledAsEnabled = colorDisabledAsEnabled;
        if (isEnabled() || colorDisabledAsEnabled) {
            TextAtomView subtitleTav = getSubtitleTav();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            subtitleTav.setLinkTextColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_accent_primary));
            getSubtitleTav().setTextColor(color);
        }
    }

    public /* synthetic */ BaseCellWithSubtitleView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCellWithSubtitleView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
