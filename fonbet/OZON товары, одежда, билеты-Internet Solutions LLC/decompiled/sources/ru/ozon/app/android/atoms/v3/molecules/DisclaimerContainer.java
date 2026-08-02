package ru.ozon.app.android.atoms.v3.molecules;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.databinding.AtomDisclaimerBinding;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.AtomConfig;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.common.ImageLoader;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@InterfaceC3999a
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u0012J1\u0010 \u001a\u00020\r2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010.\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "Landroid/widget/FrameLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "", "setText", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "color", "setTextColor", "(I)V", "setHeaderColor", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "setIcon", "(Lru/ozon/uni/atoms/data/button/Icon;)V", "setIconColor", "setCardColor", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "buttons", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "setButtons", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/atoms/databinding/AtomDisclaimerBinding;", "binding", "Lru/ozon/app/android/atoms/databinding/AtomDisclaimerBinding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getHeaderText", "()Ljava/lang/CharSequence;", "setHeaderText", "(Ljava/lang/CharSequence;)V", "headerText", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclaimerContainer extends FrameLayout implements AtomView {

    @NotNull
    private final AtomDisclaimerBinding binding;

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclaimerContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setButtons(List<ButtonV3Atom.SmallBorderlessButton> buttons, @NotNull Function1<? super AtomAction, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (buttons == null) {
            HorizontalFlexAtomsLayout buttonsFAL = this.binding.buttonsFAL;
            Intrinsics.checkNotNullExpressionValue(buttonsFAL, "buttonsFAL");
            ViewExtKt.gone(buttonsFAL);
            return;
        }
        this.buttonsAdapter.setOnAction(action);
        AtomsAdapter atomsAdapter = this.buttonsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, buttons);
        HorizontalFlexAtomsLayout buttonsFAL2 = this.binding.buttonsFAL;
        Intrinsics.checkNotNullExpressionValue(buttonsFAL2, "buttonsFAL");
        ViewExtKt.show(buttonsFAL2);
    }

    public final void setCardColor(int color) {
        this.binding.cardCv.setCardBackgroundColor(color);
    }

    public final void setHeaderColor(int color) {
        this.binding.headerTv.setTextColor(color);
    }

    public final void setHeaderText(CharSequence charSequence) {
        AppCompatTextView headerTv = this.binding.headerTv;
        Intrinsics.checkNotNullExpressionValue(headerTv, "headerTv");
        TextViewExtKt.setTextOrGone(headerTv, charSequence);
    }

    public final void setIcon(@NotNull Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        ImageLoader imageLoader = AtomConfig.INSTANCE.getImageLoader();
        AppCompatImageView iconIv = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        imageLoader.load(iconIv, icon.getImage());
    }

    public final void setIconColor(int color) {
        this.binding.iconIv.setColorFilter(color, PorterDuff.Mode.SRC_IN);
    }

    public final void setText(OzonSpannableString text) {
        AppCompatTextView textTv = this.binding.textTv;
        Intrinsics.checkNotNullExpressionValue(textTv, "textTv");
        TextViewExtKt.setTextOrGone(textTv, text);
    }

    public final void setTextColor(int color) {
        this.binding.textTv.setTextColor(color);
    }

    public /* synthetic */ DisclaimerContainer(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclaimerContainer(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonsAdapter = atomsAdapter;
        AtomDisclaimerBinding inflate = AtomDisclaimerBinding.inflate(LayoutInflater.from(context), this);
        this.binding = inflate;
        inflate.buttonsFAL.setAdapter(atomsAdapter);
        inflate.buttonsFAL.setDecorator(new DisclaimerButtonsDecorator(context));
        inflate.textTv.setMovementMethod(LinkMovementMethod.getInstance());
        inflate.textTv.setLinkTextColor(a.getColor(context, R$color.ozdt_accent_primary));
        inflate.cardCv.setRadius(ResourceExtKt.toPxF((UniGlobalConfigKt.getRoundCornersFlag(context) ? CornerRadius.RADIUS_500 : CornerRadius.RADIUS_400).getPx()));
    }
}
