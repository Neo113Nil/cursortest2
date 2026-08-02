package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.tennis.TennisGroundTypeView;
import com.sofascore.results.view.branding.BrandingLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bva extends o8 {
    public final dd d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bva(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.league_details_league_name;
        View B = nq8.B(R.id.league_details_league_name, root);
        if (B != null) {
            int i2 = R.id.league_ground_type;
            TennisGroundTypeView tennisGroundTypeView = (TennisGroundTypeView) nq8.B(R.id.league_ground_type, B);
            if (tennisGroundTypeView != null) {
                i2 = R.id.league_info_country_flag;
                ImageView imageView = (ImageView) nq8.B(R.id.league_info_country_flag, B);
                if (imageView != null) {
                    i2 = R.id.league_info_country_name;
                    TextView textView = (TextView) nq8.B(R.id.league_info_country_name, B);
                    if (textView != null) {
                        i2 = R.id.league_info_league_name;
                        TextView textView2 = (TextView) nq8.B(R.id.league_info_league_name, B);
                        if (textView2 != null) {
                            i2 = R.id.league_info_logo;
                            ImageView imageView2 = (ImageView) nq8.B(R.id.league_info_logo, B);
                            if (imageView2 != null) {
                                z82 z82Var = new z82((ConstraintLayout) B, tennisGroundTypeView, imageView, textView, textView2, imageView2);
                                i = R.id.league_details_progress_view;
                                View B2 = nq8.B(R.id.league_details_progress_view, root);
                                if (B2 != null) {
                                    this.d = new dd((BrandingLayout) root, z82Var, ez0.c(B2), 18);
                                    this.e = true;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i2)));
            throw null;
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.league_details_header;
    }
}
