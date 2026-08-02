package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.hda;
import defpackage.o23;
import defpackage.obc;
import defpackage.pbc;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = dVar;
        this.a = hda.B(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        d dVar = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            d.o(dVar.Q, (LinearLayout) view.findViewById(R.id.volume_item_container));
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i2 = dVar.P;
            layoutParams.width = i2;
            layoutParams.height = i2;
            findViewById.setLayoutParams(layoutParams);
        }
        obc obcVar = (obc) getItem(i);
        if (obcVar != null) {
            boolean z = obcVar.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(obcVar.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = dVar.G;
            int A = hda.A(context);
            if (Color.alpha(A) != 255) {
                A = o23.h(A, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(A, A);
            mediaRouteVolumeSlider.setTag(obcVar);
            dVar.T.put(obcVar, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (dVar.A) {
                    if (((!obcVar.e() || pbc.g()) ? obcVar.o : 0) == 1) {
                        mediaRouteVolumeSlider.setMax(obcVar.q);
                        mediaRouteVolumeSlider.setProgress(obcVar.p);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(dVar.N);
                    }
                }
                mediaRouteVolumeSlider.setMax(100);
                mediaRouteVolumeSlider.setProgress(100);
                mediaRouteVolumeSlider.setEnabled(false);
            }
            ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z ? 255 : (int) (this.a * 255.0f));
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(dVar.L.contains(obcVar) ? 4 : 0);
            HashSet hashSet = dVar.J;
            if (hashSet != null && hashSet.contains(obcVar)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }
}
