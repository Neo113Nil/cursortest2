package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.sofascore.results.R;
import defpackage.bc0;
import defpackage.hda;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends bc0 {
    public final AnimationDrawable d;
    public final AnimationDrawable e;
    public final String f;
    public final String g;
    public boolean h;
    public View.OnClickListener i;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_expand);
        this.d = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_collapse);
        this.e = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(hda.A(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.f = string;
        this.g = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new h(this));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }
}
