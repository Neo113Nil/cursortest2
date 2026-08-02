package androidx.mediarouter.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.sofascore.results.R;
import defpackage.bbc;
import defpackage.zac;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f extends e {
    public final TextView f;
    public final int g;
    public final /* synthetic */ zac h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(zac zacVar, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.h = zacVar;
        bbc bbcVar = zacVar.j;
        this.f = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
        Resources resources = bbcVar.o.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.g = (int) typedValue.getDimension(displayMetrics);
    }
}
