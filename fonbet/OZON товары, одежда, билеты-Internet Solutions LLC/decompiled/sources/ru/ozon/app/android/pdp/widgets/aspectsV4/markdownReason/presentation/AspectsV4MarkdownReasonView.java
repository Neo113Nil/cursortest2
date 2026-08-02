package ru.ozon.app.android.pdp.widgets.aspectsV4.markdownReason.presentation;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/markdownReason/presentation/AspectsV4MarkdownReasonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/aspectsV4/markdownReason/presentation/AspectsV4MarkdownReasonVO;", "action", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4MarkdownReasonView extends LinearLayout {
    public static final int $stable = ButtonV3View.$stable | TextAtomV2View.$stable;

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsV4MarkdownReasonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.aspectsV4MarkdownReasonTextV);
        this.textView = textAtomV2View;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setId(R$id.aspectsV4MarkdownReasonButtonV);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.leftMargin = dimens.getDP_4();
        layoutParams.rightMargin = dimens.getDP_16();
        buttonV3View.setLayoutParams(layoutParams);
        this.buttonView = buttonV3View;
        setId(R$id.aspectsV4MarkdownReasonV);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(textAtomV2View);
        addView(buttonV3View);
    }

    public final void bind(@NotNull AspectsV4MarkdownReasonVO item, @NotNull Function1<? super AtomAction, Unit> action) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(action, "action");
        TextHolderKt.bind$default(this.textView, item.getText(), null, 2, null);
        ButtonV3HolderKt.bindOrGone(this.buttonView, item.getButton(), action);
    }
}
