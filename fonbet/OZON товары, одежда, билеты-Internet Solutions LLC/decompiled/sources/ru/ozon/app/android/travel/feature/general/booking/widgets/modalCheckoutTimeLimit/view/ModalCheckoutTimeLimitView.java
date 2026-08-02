package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.view;

import Bi.b;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/view/ModalCheckoutTimeLimitView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "timerTextView", "bind", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "time", "updateTimerText", "newText", "addChildren", "createTitleTextView", "createTimerTextView", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalCheckoutTimeLimitView extends ConstraintLayout {

    @NotNull
    private final TextAtomV2View timerTextView;

    @NotNull
    private final TextAtomV2View titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalCheckoutTimeLimitView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.titleTextView = createTitleTextView(context);
        this.timerTextView = createTimerTextView(context);
        addChildren();
    }

    private final void addChildren() {
        addView(this.titleTextView);
        addView(this.timerTextView);
    }

    private final TextAtomV2View createTimerTextView(Context context) {
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, 5363747, -2, -2);
        d11.f41655s = 8272364;
        d11.f41644m = 8272364;
        d11.f41658v = 0;
        d11.setMarginStart(UiExtKt.toPx(12, context));
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }

    private final TextAtomV2View createTitleTextView(Context context) {
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b d11 = b.d(textAtomV2View, 8272364, -2, -2);
        d11.f41603J = 2;
        d11.f41598E = 0.0f;
        d11.f41656t = 0;
        d11.f41636i = 0;
        d11.f41657u = 5363747;
        d11.f41616W = true;
        textAtomV2View.setLayoutParams(d11);
        return textAtomV2View;
    }

    public final void bind(@NotNull TextDTO title, TextDTO time) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextHolderKt.bind$default(this.titleTextView, title, null, 2, null);
        TextHolderKt.bindOrGone$default(this.timerTextView, time, null, 2, null);
    }

    public final void updateTimerText(@NotNull TextDTO newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        TextHolderKt.bindOrGone$default(this.timerTextView, newText, null, 2, null);
    }
}
