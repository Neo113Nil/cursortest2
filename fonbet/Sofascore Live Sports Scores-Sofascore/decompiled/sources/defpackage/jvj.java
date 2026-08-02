package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jvj extends o8 {
    public final djf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvj(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.player_transfer_date;
        TextView textView = (TextView) nq8.B(R.id.player_transfer_date, root);
        if (textView != null) {
            i = R.id.player_transfer_fee;
            TextView textView2 = (TextView) nq8.B(R.id.player_transfer_fee, root);
            if (textView2 != null) {
                i = R.id.team_transfers_colon;
                if (((TextView) nq8.B(R.id.team_transfers_colon, root)) != null) {
                    i = R.id.team_transfers_type;
                    TextView textView3 = (TextView) nq8.B(R.id.team_transfers_type, root);
                    if (textView3 != null) {
                        i = R.id.transfers_arrow_icon;
                        if (((ImageView) nq8.B(R.id.transfers_arrow_icon, root)) != null) {
                            i = R.id.transfers_team_from_logo;
                            ImageView imageView = (ImageView) nq8.B(R.id.transfers_team_from_logo, root);
                            if (imageView != null) {
                                i = R.id.transfers_team_to_logo;
                                ImageView imageView2 = (ImageView) nq8.B(R.id.transfers_team_to_logo, root);
                                if (imageView2 != null) {
                                    this.d = new djf((ConstraintLayout) root, textView, textView2, textView3, imageView, imageView2);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.transfer_from_to_view;
    }
}
