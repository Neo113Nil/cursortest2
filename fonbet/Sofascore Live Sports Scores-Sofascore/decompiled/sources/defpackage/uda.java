package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.lineups.view.LineupsPlayerTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uda extends o8 {
    public final ed d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uda(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        LineupsPlayerTextView lineupsPlayerTextView = (LineupsPlayerTextView) nq8.B(R.id.lineups_player_name, root);
        if (lineupsPlayerTextView != null) {
            this.d = new ed((FrameLayout) root, 13, lineupsPlayerTextView);
        } else {
            yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(R.id.lineups_player_name)));
            throw null;
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.jersey_lineups_player_layout;
    }
}
