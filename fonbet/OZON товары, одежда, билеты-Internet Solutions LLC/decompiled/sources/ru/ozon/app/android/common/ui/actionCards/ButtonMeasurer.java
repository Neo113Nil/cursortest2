package ru.ozon.app.android.common.ui.actionCards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/common/ui/actionCards/ButtonMeasurer;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "", "measure", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)I", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "buttonView", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "action-cards_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonMeasurer {

    @NotNull
    private final SmallButtonView buttonView;

    @NotNull
    private final Context context;

    public ButtonMeasurer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        SmallButtonView smallButtonView = (SmallButtonView) q.f64554a.g(N.b(SmallButtonView.class), context);
        smallButtonView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.buttonView = smallButtonView;
    }

    public final int measure(@NotNull ButtonV3Atom.SmallButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        WrappedButtonHolderKt.bind$default(this.buttonView, button, null, 2, null);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.buttonView.measure(makeMeasureSpec, makeMeasureSpec);
        return this.buttonView.getMeasuredWidth();
    }
}
