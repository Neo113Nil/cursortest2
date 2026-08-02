package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jfk extends MaterialCardView {
    public final rfe o;
    public UserBadge p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfk(Context context) {
        super(context, null, 0);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.user_badge_view, this);
        int i = R.id.badge_icon;
        ImageView imageView = (ImageView) nq8.B(R.id.badge_icon, this);
        if (imageView != null) {
            i = R.id.badge_name;
            TextView textView = (TextView) nq8.B(R.id.badge_name, this);
            if (textView != null) {
                i = R.id.selected_icon;
                ImageView imageView2 = (ImageView) nq8.B(R.id.selected_icon, this);
                if (imageView2 != null) {
                    this.o = new rfe(this, imageView, textView, imageView2, 8);
                    setCardBackgroundColor(eq3.q(R.color.color_user_badge_background, context));
                    setStrokeColor(eq3.q(R.color.color_user_badge_stroke, context));
                    setRadius(ao2.u(6, context));
                    setStrokeWidth(ao2.s(1, context));
                    setOutlineProvider(null);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Nullable
    public final UserBadge getUserBadgeValue() {
        return this.p;
    }
}
