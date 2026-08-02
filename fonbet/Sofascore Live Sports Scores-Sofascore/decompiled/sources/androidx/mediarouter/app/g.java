package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import defpackage.bbc;
import defpackage.cb;
import defpackage.cbc;
import defpackage.hda;
import defpackage.lbc;
import defpackage.obc;
import defpackage.td4;
import defpackage.zac;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g extends e {
    public final View f;
    public final ImageView g;
    public final ProgressBar h;
    public final TextView i;
    public final RelativeLayout j;
    public final CheckBox k;
    public final float l;
    public final int m;
    public final cb n;
    public final /* synthetic */ zac o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(zac zacVar, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.o = zacVar;
        bbc bbcVar = zacVar.j;
        this.n = new cb(this, 7);
        this.f = view;
        this.g = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.h = progressBar;
        this.i = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.j = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.k = checkBox;
        Context context = bbcVar.o;
        Drawable d0 = td4.d0(R.drawable.mr_cast_checkbox, context);
        if (hda.J(context)) {
            d0.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(d0);
        hda.P(context, progressBar);
        this.l = hda.B(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.m = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean c(obc obcVar) {
        if (obcVar.g()) {
            return true;
        }
        lbc a = this.o.j.j.a();
        if (a == null) {
            return false;
        }
        cbc cbcVar = (cbc) a.x.get(obcVar.c);
        return (cbcVar != null ? cbcVar.b : 4) == 3;
    }

    public final void d(boolean z, boolean z2) {
        CheckBox checkBox = this.k;
        checkBox.setEnabled(false);
        this.f.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.g.setVisibility(4);
            this.h.setVisibility(0);
        }
        if (z2) {
            this.o.o(z ? this.m : 0, this.j);
        }
    }
}
