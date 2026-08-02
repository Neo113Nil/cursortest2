package com.vk.stories.design.view.editor.verticalization;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.an10;
import xsna.bpn0;
import xsna.bwt0;
import xsna.chr0;
import xsna.e43;
import xsna.f4m;
import xsna.gzs;
import xsna.hz8;
import xsna.iz8;
import xsna.kyq0;
import xsna.kz8;
import xsna.msy;
import xsna.oo6;
import xsna.oqh0;
import xsna.s3q0;
import xsna.w8i;

/* compiled from: VerticalizationLoadingView.kt */
/* loaded from: classes6.dex */
public final class VerticalizationLoadingView extends ConstraintLayout implements w8i {
    public static final List<Integer> A = e43.l(Integer.valueOf(R.string.story_verticalization_loading_title_1), Integer.valueOf(R.string.story_verticalization_loading_title_2), Integer.valueOf(R.string.story_verticalization_loading_title_3), Integer.valueOf(R.string.story_verticalization_loading_title_4), Integer.valueOf(R.string.story_verticalization_loading_title_5), Integer.valueOf(R.string.story_verticalization_loading_title_6), Integer.valueOf(R.string.story_verticalization_loading_title_7));
    public final Object t;
    public final bpn0 u;
    public oo6 v;
    public final ImageView w;
    public final TextView x;
    public int y;
    public gzs<s3q0> z;

    public VerticalizationLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = msy.a(LazyThreadSafetyMode.NONE, new oqh0(this, 10));
        this.u = new bpn0(new chr0(2));
        View.inflate(context, R.layout.layout_story_editor_verticalization_loading_view, this);
        setBackgroundColor(-16777216);
        this.w = (ImageView) findViewById(R.id.loading_blur);
        this.x = (TextView) findViewById(R.id.loading_title);
        bwt0.i0((VkButton) findViewById(R.id.loading_button_cancel), new kyq0(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final kz8 getCadreUtil() {
        return (kz8) this.t.getValue();
    }

    private final Handler getMainHandler() {
        return (Handler) this.u.getValue();
    }

    public final void P4() {
        oo6 oo6Var = this.v;
        if (oo6Var != null) {
            getMainHandler().postDelayed(oo6Var, 3000L);
        }
    }

    public final void Q4() {
        oo6 oo6Var = this.v;
        if (oo6Var != null) {
            getMainHandler().removeCallbacks(oo6Var);
        }
        this.v = new oo6(this, 12);
        P4();
    }

    public final void T4() {
        oo6 oo6Var = this.v;
        if (oo6Var != null) {
            getMainHandler().removeCallbacks(oo6Var);
        }
        this.v = null;
    }

    public final void U4(iz8 iz8Var) {
        hz8 c = getCadreUtil().c(iz8Var);
        ImageView imageView = this.w;
        imageView.getLayoutParams().height = iz8Var.b;
        f4m.t(an10.b(iz8Var.c), imageView);
        imageView.setOutlineProvider(c);
        imageView.setClipToOutline(true);
    }

    public final gzs<s3q0> getOnClickCancel() {
        return this.z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T4();
    }

    public final void setOnClickCancel(gzs<s3q0> gzsVar) {
        this.z = gzsVar;
    }
}
