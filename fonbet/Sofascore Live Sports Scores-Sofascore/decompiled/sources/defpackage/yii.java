package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yii extends u {
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final /* synthetic */ cji e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yii(cji cjiVar, View view) {
        super(view);
        this.e = cjiVar;
        if (lik.a < 26) {
            view.setFocusable(true);
        }
        this.b = (TextView) view.findViewById(R.id.exo_main_text);
        this.c = (TextView) view.findViewById(R.id.exo_sub_text);
        this.d = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new tii(this, 2));
    }
}
