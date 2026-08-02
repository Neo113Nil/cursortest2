package ru.ozon.app.android.ugc.core.widgets.singlereview.header.variant;

import androidx.core.view.G;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.utils.ComposerExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/variant/SingleReviewVariantViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/variant/SingleReviewVariantVO;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "setLocatorIfExists", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/variant/SingleReviewVariantVO;Ll20/d;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewVariantViewHolder extends k<SingleReviewVariantVO> {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TextAtomV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewVariantViewHolder(@NotNull TextAtomV2View view, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    private final void setLocatorIfExists() {
        TextDTO variantText;
        TestInfo testInfo;
        final String automatizationId;
        SingleReviewVariantVO boundData = getBoundData();
        if (boundData == null || (variantText = boundData.getVariantText()) == null || (testInfo = variantText.getTestInfo()) == null || (automatizationId = testInfo.getAutomatizationId()) == null) {
            return;
        }
        final TextAtomV2View textAtomV2View = this.view;
        G.a(textAtomV2View, new Runnable() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.header.variant.SingleReviewVariantViewHolder$setLocatorIfExists$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                TextAtomV2View textAtomV2View2;
                textAtomV2View2 = this.view;
                textAtomV2View2.setContentDescription(automatizationId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SingleReviewVariantVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setLocatorIfExists();
        TextAtomV2View textAtomV2View = this.view;
        TextDTO variantText = item.getVariantText();
        TextHolderKt.bindOrGone$default(textAtomV2View, variantText != null ? ComposerExtKt.withNavigationLinksHandling(variantText, this.view, this.actionHandler) : null, null, 2, null);
    }
}
