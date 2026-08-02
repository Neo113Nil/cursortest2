package ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentTextBinderDelegate;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.RichContentSubWidgetViewHolder;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/text/RichContentTextWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/RichContentSubWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/text/RichContentTextVoWrapper;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentTextBinderDelegate;", "textV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/composer/ComposerReferences;)V", "bindSubWidget", "", "item", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentTextWidgetViewHolder extends RichContentSubWidgetViewHolder<RichContentTextVoWrapper> implements RichContentTextBinderDelegate {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View textV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichContentTextWidgetViewHolder(@NotNull TextAtomV2View textV, @NotNull ComposerReferences refs) {
        super(textV, refs);
        Intrinsics.checkNotNullParameter(textV, "textV");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.textV = textV;
    }

    public void bindText(@NotNull TextAtomV2View textAtomV2View, @NotNull RichContentVO.Item.Text text) {
        RichContentTextBinderDelegate.DefaultImpls.bindText(this, textAtomV2View, text);
    }

    @Override // ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.RichContentSubWidgetViewHolder
    public void bindSubWidget(@NotNull RichContentTextVoWrapper item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindText(this.textV, item.getText());
    }
}
