package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ob9 implements krk {
    public final /* synthetic */ int a;
    public final FrameLayout b;
    public final ImageView c;
    public final TextView d;

    public /* synthetic */ ob9(FrameLayout frameLayout, ImageView imageView, TextView textView, int i) {
        this.a = i;
        this.b = frameLayout;
        this.c = imageView;
        this.d = textView;
    }

    public static ob9 a(View view) {
        int i = R.id.content;
        if (((ConstraintLayout) nq8.B(R.id.content, view)) != null) {
            i = R.id.item_icon;
            ImageView imageView = (ImageView) nq8.B(R.id.item_icon, view);
            if (imageView != null) {
                i = R.id.item_text;
                TextView textView = (TextView) nq8.B(R.id.item_text, view);
                if (textView != null) {
                    i = R.id.notification_1;
                    if (((TextView) nq8.B(R.id.notification_1, view)) != null) {
                        i = R.id.option_new;
                        if (((TextView) nq8.B(R.id.option_new, view)) != null) {
                            return new ob9((FrameLayout) view, imageView, textView, 1);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
