package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.multiplicity;

import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.drawables.PriceV2ShapeDrawableStorage;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/multiplicity/PriceV2MultiplicityWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/multiplicity/PriceV2MultiplicityVO;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "textAtomV2View", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;", "drawableStorage", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/multiplicity/PriceV2MultiplicityVO;Ll20/d;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;", "Lru/ozon/app/android/composer/ComposerReferences;", "", "isDarkTheme", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PriceV2MultiplicityWidgetViewHolder extends k<PriceV2MultiplicityVO> {

    @NotNull
    private final PriceV2ShapeDrawableStorage drawableStorage;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TextAtomV2View textAtomV2View;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceV2MultiplicityWidgetViewHolder(@NotNull TextAtomV2View textAtomV2View, @NotNull PriceV2ShapeDrawableStorage drawableStorage, @NotNull ComposerReferences refs) {
        super(textAtomV2View);
        Intrinsics.checkNotNullParameter(textAtomV2View, "textAtomV2View");
        Intrinsics.checkNotNullParameter(drawableStorage, "drawableStorage");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.textAtomV2View = textAtomV2View;
        this.drawableStorage = drawableStorage;
        this.refs = refs;
    }

    private final boolean isDarkTheme() {
        r a11 = this.refs.getContainer().a();
        if (a11 != null) {
            return ThemeExtKt.isDarkThemeActive(a11);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PriceV2MultiplicityVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextHolderKt.bind$default(this.textAtomV2View, item.getText(), null, 2, null);
        this.textAtomV2View.setBackground(this.drawableStorage.background(getContext(), item.getBackgroundCornersConfig(), isDarkTheme()));
    }
}
