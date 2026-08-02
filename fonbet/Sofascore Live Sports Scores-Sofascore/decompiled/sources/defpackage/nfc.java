package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreSmallRatingView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nfc implements krk {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;

    public nfc(ImageView imageView, TextView textView, ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
    }

    public static nfc a(View view) {
        int i = R.id.item_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.item_icon, view);
        if (imageView != null) {
            i = R.id.item_text;
            TextView textView = (TextView) nq8.B(R.id.item_text, view);
            if (textView != null) {
                i = R.id.live_icon;
                if (((ImageView) nq8.B(R.id.live_icon, view)) != null) {
                    i = R.id.player_position_text;
                    if (((TextView) nq8.B(R.id.player_position_text, view)) != null) {
                        i = R.id.player_rating_text;
                        if (((SofascoreSmallRatingView) nq8.B(R.id.player_rating_text, view)) != null) {
                            return new nfc(imageView, textView, (ConstraintLayout) view);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static nfc b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater.inflate(R.layout.menu_panel_item, viewGroup, false));
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
