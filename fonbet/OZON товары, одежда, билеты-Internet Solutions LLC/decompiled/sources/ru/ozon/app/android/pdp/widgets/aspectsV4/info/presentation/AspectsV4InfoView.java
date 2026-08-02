package ru.ozon.app.android.pdp.widgets.aspectsV4.info.presentation;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.base.AspectsV4InfoBaseView;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.expandable.ExpandableTextHolderKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000fH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoView;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/base/AspectsV4InfoBaseView;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/presentation/AspectsV4InfoVO;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "textView", "Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;", "getTextView", "()Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;", "bind", "", "item", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class AspectsV4InfoView extends AspectsV4InfoBaseView<AspectsV4InfoVO> {
    public static final int $stable = ExpandableTextAtomView.$stable;

    @NotNull
    private final ExpandableTextAtomView textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsV4InfoView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ExpandableTextAtomView expandableTextAtomView = new ExpandableTextAtomView(context, null, 0, 0, 14, null);
        expandableTextAtomView.setId(R$id.aspectsV4ExpandableTextInfoV);
        expandableTextAtomView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.textView = expandableTextAtomView;
        initView();
    }

    public void bind(@NotNull AspectsV4InfoVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        super.bind((AspectsV4InfoView) item, actionHandler);
        ExpandableTextHolderKt.bindOrGone(getTextView(), item.getExpandableText(), actionHandler);
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.info.base.AspectsV4InfoBaseView
    @NotNull
    public ExpandableTextAtomView getTextView() {
        return this.textView;
    }
}
