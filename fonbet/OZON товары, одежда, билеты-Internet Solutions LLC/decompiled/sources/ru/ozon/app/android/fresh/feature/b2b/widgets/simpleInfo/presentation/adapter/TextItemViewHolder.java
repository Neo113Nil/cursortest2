package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/TextItemViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/simpleInfo/presentation/adapter/ItemViewHolder;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TextItemViewHolder extends ItemViewHolder<TextDTO> {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TextAtomV2View textAtomView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextItemViewHolder(@NotNull TextAtomV2View textAtomView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(textAtomView);
        Intrinsics.checkNotNullParameter(textAtomView, "textAtomView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.textAtomView = textAtomView;
        this.actionHandler = actionHandler;
    }

    public void bind(@NotNull TextDTO item) {
        String str;
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone(this.textAtomView, TextDTO.copy$default(item, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null), this.actionHandler);
        TextAtomV2View textAtomV2View = this.textAtomView;
        TestInfo testInfo = item.getTestInfo();
        if (testInfo == null || (str = testInfo.getAutomatizationId()) == null) {
            str = "";
        }
        textAtomV2View.setContentDescription(str);
    }
}
