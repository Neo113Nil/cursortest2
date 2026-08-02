package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import defpackage.bbc;
import defpackage.cb;
import defpackage.hda;
import defpackage.obc;
import defpackage.td4;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class e extends u {
    public obc b;
    public final ImageButton c;
    public final MediaRouteVolumeSlider d;
    public final /* synthetic */ bbc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bbc bbcVar, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.e = bbcVar;
        this.c = imageButton;
        this.d = mediaRouteVolumeSlider;
        Context context = bbcVar.o;
        Drawable d0 = td4.d0(R.drawable.mr_cast_mute_button, context);
        if (hda.J(context)) {
            d0.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(d0);
        if (hda.J(context)) {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_light);
        } else {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void a(obc obcVar) {
        this.b = obcVar;
        int i = obcVar.p;
        boolean z = i == 0;
        ImageButton imageButton = this.c;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new cb(this, 5));
        obc obcVar2 = this.b;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.d;
        mediaRouteVolumeSlider.setTag(obcVar2);
        mediaRouteVolumeSlider.setMax(obcVar.q);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.e.v);
    }

    public final void b(boolean z) {
        ImageButton imageButton = this.c;
        if (imageButton.isActivated() == z) {
            return;
        }
        imageButton.setActivated(z);
        HashMap hashMap = this.e.y;
        if (z) {
            hashMap.put(this.b.c, Integer.valueOf(this.d.getProgress()));
        } else {
            hashMap.remove(this.b.c);
        }
    }
}
