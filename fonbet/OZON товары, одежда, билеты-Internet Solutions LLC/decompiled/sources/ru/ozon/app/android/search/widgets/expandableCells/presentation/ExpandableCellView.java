package ru.ozon.app.android.search.widgets.expandableCells.presentation;

import Bl.b;
import android.content.Context;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cellAtom", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "textAtom", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "showTextOrGone", "", "show", "", "bindCell", "dsCell", "Lru/ozon/uni/atoms/data/AtomDTO;", "bindTextOrGone", "dto", "Lru/ozon/uni/atoms/data/text/TextDTO;", "setOnAction", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "generateLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExpandableCellView extends LinearLayout {
    public static final int $stable = TextAtomV2View.$stable | SingleAtom.$stable;

    @NotNull
    private final SingleAtom cellAtom;

    @NotNull
    private final TextAtomV2View textAtom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableCellView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        SingleAtom singleAtom = (SingleAtom) b.a(SingleAtom.class, "type", q.f64554a, null);
        if (singleAtom == null) {
            context2 = context;
            SingleAtom singleAtom2 = new SingleAtom(context2, null, 0, 0, 14, null);
            singleAtom2.setId(R$id.expandableCell);
            singleAtom2.setLayoutParams(generateLayoutParams());
            singleAtom = singleAtom2;
        } else {
            context2 = context;
        }
        this.cellAtom = singleAtom;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context2, null, 0, 6, null);
        textAtomV2View.setId(R$id.expandableText);
        textAtomV2View.setLayoutParams(generateLayoutParams());
        textAtomV2View.setVisibility(8);
        this.textAtom = textAtomV2View;
        setOrientation(1);
        setGravity(17);
        addView(singleAtom);
        addView(textAtomV2View);
    }

    private final LinearLayout.LayoutParams generateLayoutParams() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    public final void bindCell(@NotNull AtomDTO dsCell) {
        Intrinsics.checkNotNullParameter(dsCell, "dsCell");
        SingleAtom.bind$default(this.cellAtom, dsCell, false, 2, null);
    }

    public final void bindTextOrGone(TextDTO dto) {
        TextHolderKt.bindOrGone$default(this.textAtom, dto, null, 2, null);
    }

    public final void setOnAction(@NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.cellAtom.setOnAction(onAction);
    }

    public final void showTextOrGone(boolean show) {
        ViewExtKt.showOrGone(this.textAtom, Boolean.valueOf(show));
    }
}
