package ru.ozon.app.android.ugc.widgets.reviewsPreview.bottomText;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewBottomTextVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/bottomText/ReviewsPreviewBottomTextVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewBottomTextVO;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "view", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewBottomTextVO;Ll20/d;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewsPreviewBottomTextVH extends k<ReviewsPreviewBottomTextVO> {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsPreviewBottomTextVH(@NotNull TextAtomV2View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewsPreviewBottomTextVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextHolderKt.bindOrGone$default(this.view, item.getBottomText(), null, 2, null);
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getWidgetBackgroundColor());
        if (parseColor != null) {
            this.view.setBackgroundColor(parseColor.intValue());
        }
    }
}
