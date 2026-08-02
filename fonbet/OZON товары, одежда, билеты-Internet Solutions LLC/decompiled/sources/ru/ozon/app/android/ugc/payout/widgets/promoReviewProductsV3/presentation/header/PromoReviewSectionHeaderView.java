package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.header;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.payout.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/header/PromoReviewSectionHeaderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTextView", "bind", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/ugc/payout/widgets/promoReviewProductsV3/presentation/header/PromoReviewSectionHeaderVO;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoReviewSectionHeaderView extends LinearLayout {

    @NotNull
    private final TextAtomV2View subtitleTextView;

    @NotNull
    private final TextAtomV2View titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoReviewSectionHeaderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.promoReviewSectionTitle);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleTextView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(R$id.promoReviewSectionSubtitle);
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.subtitleTextView = textAtomV2View2;
        setOrientation(1);
        setBackgroundColor(a.getColor(context, UniColors.LAYER_FLOOR_1.getResId()));
    }

    public final void bind(@NotNull PromoReviewSectionHeaderVO header) {
        Intrinsics.checkNotNullParameter(header, "header");
        TextHolderKt.bind$default(this.titleTextView, header.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTextView, header.getSubtitle(), null, 2, null);
    }
}
