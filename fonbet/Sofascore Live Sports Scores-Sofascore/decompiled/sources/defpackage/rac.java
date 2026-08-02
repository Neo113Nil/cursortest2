package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rac extends u {
    public final View b;
    public final ImageView c;
    public final ProgressBar d;
    public final TextView e;
    public final /* synthetic */ sac f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rac(sac sacVar, View view) {
        super(view);
        this.f = sacVar;
        this.b = view;
        this.c = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.d = progressBar;
        this.e = (TextView) view.findViewById(R.id.mr_picker_route_name);
        hda.P(sacVar.g.i, progressBar);
    }
}
