package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zii extends u {
    public final TextView b;
    public final View c;

    public zii(View view) {
        super(view);
        if (lik.a < 26) {
            view.setFocusable(true);
        }
        this.b = (TextView) view.findViewById(R.id.exo_text);
        this.c = view.findViewById(R.id.exo_check);
    }
}
