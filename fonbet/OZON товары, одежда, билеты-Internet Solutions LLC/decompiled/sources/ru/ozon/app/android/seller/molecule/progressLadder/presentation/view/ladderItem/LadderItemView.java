package ru.ozon.app.android.seller.molecule.progressLadder.presentation.view.ladderItem;

import Bi.b;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.ui.R$id;
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;
import ru.ozon.app.android.seller.molecule.progressLadder.presentation.view.progress.ProgressView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/seller/molecule/progressLadder/presentation/view/ladderItem/LadderItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "progressView", "Lru/ozon/app/android/seller/molecule/progressLadder/presentation/view/progress/ProgressView;", "thresholdFirstView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "thresholdSecondView", "bind", "", "dto", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO;", "setProgressCompact", "isCompact", "", "Companion", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LadderItemView extends ConstraintLayout {
    private static final int dp2 = UiExtKt.toPx(2);
    private static final int dp4 = UiExtKt.toPx(4);

    @NotNull
    private final ProgressView progressView;

    @NotNull
    private final TextAtomV2View thresholdFirstView;

    @NotNull
    private final TextAtomV2View thresholdSecondView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LadderItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ProgressView progressView = new ProgressView(context);
        addView(progressView);
        this.progressView = progressView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.progressLadder_Item_ThresholdFirst, -2, -2);
        d11.f41603J = 2;
        d11.f41598E = 1.0f;
        d11.f41599F = 1.0f;
        int i11 = dp4;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = i11;
        textAtomV2View.setLayoutParams(d11);
        addView(textAtomV2View);
        this.thresholdFirstView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.progressLadder_Item_ThresholdSecond, -2, -2);
        d12.f41603J = 2;
        d12.f41616W = true;
        d12.f41599F = 1.0f;
        ((ViewGroup.MarginLayoutParams) d12).topMargin = i11;
        textAtomV2View2.setLayoutParams(d12);
        addView(textAtomV2View2);
        this.thresholdSecondView = textAtomV2View2;
        setId(R$id.progressLadder_Item_Root);
        setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, progressView);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, progressView);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, progressView);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, textAtomV2View2, progressView);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, textAtomV2View2);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, textAtomV2View2);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, textAtomV2View2, textAtomV2View);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, textAtomV2View, progressView);
        ConstraintSetExtKt.layoutConstraintEndToStartOf(dVar, textAtomV2View, textAtomV2View2);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, textAtomV2View);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, textAtomV2View);
        dVar.f(this);
    }

    public final void bind(@NotNull ProgressLadderDTO.StepDTO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.progressView.bind(dto);
        TextHolderKt.bindOrGone$default(this.thresholdFirstView, dto.getThresholdFirst(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.thresholdSecondView, dto.getThresholdSecond(), null, 2, null);
        TextAtomV2View textAtomV2View = this.thresholdFirstView;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(dto.getThresholdSecond() == null ? 0 : dp2);
        textAtomV2View.setLayoutParams(marginLayoutParams);
    }

    public final void setProgressCompact(boolean isCompact) {
        ProgressView progressView = this.progressView;
        ViewGroup.LayoutParams layoutParams = progressView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = isCompact ? dp4 : -2;
        progressView.setLayoutParams(layoutParams);
    }
}
