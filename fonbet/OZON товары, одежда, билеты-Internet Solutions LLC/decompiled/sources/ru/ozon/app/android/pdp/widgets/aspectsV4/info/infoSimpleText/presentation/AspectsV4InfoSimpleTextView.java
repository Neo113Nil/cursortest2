package ru.ozon.app.android.pdp.widgets.aspectsV4.info.infoSimpleText.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.ViewExtKt;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.base.AspectsV4InfoBaseView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000fH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/info/infoSimpleText/presentation/AspectsV4InfoSimpleTextView;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/base/AspectsV4InfoBaseView;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/infoSimpleText/presentation/AspectV4TextInfoVO;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "textView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "item", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class AspectsV4InfoSimpleTextView extends AspectsV4InfoBaseView<AspectV4TextInfoVO> {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsV4InfoSimpleTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.aspectsV4TextV);
        textAtomV2View.setTextIsSelectable(false);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.textView = textAtomV2View;
        initView();
    }

    public void bind(@NotNull AspectV4TextInfoVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        super.bind((AspectsV4InfoSimpleTextView) item, actionHandler);
        TextAtomV2View textView = getTextView();
        TextHolderKt.bind$default(textView, item.getText(), null, 2, null);
        ViewExtKt.bindClickAction(textView, item.getAtomAction(), actionHandler);
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.info.base.AspectsV4InfoBaseView
    @NotNull
    public TextAtomV2View getTextView() {
        return this.textView;
    }
}
