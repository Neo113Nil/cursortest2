package ru.ozon.app.android.ugc.widgets.selectionItemForm.header.cancelSheet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/TextItemViewHolder;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/cancelSheet/ItemViewHolder;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textAtomView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "bind", "", "item", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextItemViewHolder extends ItemViewHolder<TextDTO> {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View textAtomView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextItemViewHolder(@NotNull TextAtomV2View textAtomView) {
        super(textAtomView);
        Intrinsics.checkNotNullParameter(textAtomView, "textAtomView");
        this.textAtomView = textAtomView;
    }

    public void bind(@NotNull TextDTO item) {
        CharSequence text;
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(this.textAtomView, item, null, 2, null);
        TextAtomV2View textAtomV2View = this.textAtomView;
        TestInfo testInfo = item.getTestInfo();
        if (testInfo == null || (text = testInfo.getAutomatizationId()) == null) {
            text = item.getText();
        }
        textAtomV2View.setContentDescription(text);
    }
}
