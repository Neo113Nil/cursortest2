package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.ReviewBodyVO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.review.ReviewMediaPreviewView;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/review/ReviewMediaPreviewView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "bind", "", "preview", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/ReviewBodyVO$MediaVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "playerPreloader", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewMediaPreviewView extends FrameLayout {

    @NotNull
    private final IconView iconView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewMediaPreviewView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(R$id.reviewMediaPreviewIconView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        iconView.setLayoutParams(layoutParams);
        this.iconView = iconView;
        addView(iconView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3(Function1 function1, ReviewBodyVO.MediaVO mediaVO, PlayerPreloader playerPreloader, View view) {
        if (function1 != null) {
            if ((mediaVO.getAction() instanceof AtomAction.Move) && mediaVO.getVideoInfo() != null && playerPreloader != null) {
                PlayerPreloader.DefaultImpls.preCreatePlayer$default(playerPreloader, mediaVO.getVideoInfo(), null, 2, null);
            }
            function1.invoke(mediaVO.getAction());
        }
    }

    public final void bind(@NotNull final ReviewBodyVO.MediaVO preview, final Function1<? super AtomAction, Unit> actionHandler, final PlayerPreloader playerPreloader) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        IconHolderKt.bind$default(this.iconView, preview.getPreview(), null, 2, null);
        setOnClickListener(new View.OnClickListener() { // from class: OV.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewMediaPreviewView.bind$lambda$3(actionHandler, preview, playerPreloader, view);
            }
        });
    }
}
