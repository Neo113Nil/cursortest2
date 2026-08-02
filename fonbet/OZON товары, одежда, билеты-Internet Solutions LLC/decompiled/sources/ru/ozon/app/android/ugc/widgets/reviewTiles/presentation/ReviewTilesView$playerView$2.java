package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import android.content.Context;
import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdpvideomolecule.R$layout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/media3/ui/PlayerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewTilesView$playerView$2 extends AbstractC7737t implements Function0<PlayerView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewTilesView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTilesView$playerView$2(Context context, ReviewTilesView reviewTilesView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewTilesView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PlayerView invoke() {
        View inflate = LayoutInflater.from(this.$context).inflate(R$layout.view_video_molecule_player, (ViewGroup) this.this$0, false);
        Intrinsics.g(inflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
        final PlayerView playerView = (PlayerView) inflate;
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        bVar.f41642l = 0;
        playerView.setLayoutParams(bVar);
        playerView.setClipToOutline(true);
        playerView.C(4);
        playerView.A();
        playerView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesView$playerView$2$2$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                if (outline != null) {
                    int width = PlayerView.this.getWidth();
                    int height = PlayerView.this.getHeight();
                    f7 = ReviewTilesView.VIDEO_CORNER_RADIUS;
                    outline.setRoundRect(0, 0, width, height, f7);
                }
            }
        });
        playerView.setZ(0.0f);
        this.this$0.addView(playerView);
        return playerView;
    }
}
