package com.vk.video.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.b3m0;
import xsna.bwt0;
import xsna.c4q0;
import xsna.dhr0;
import xsna.fcs0;
import xsna.fda0;
import xsna.fxc0;
import xsna.iah0;
import xsna.j8n0;
import xsna.msy;
import xsna.uys0;
import xsna.vlc0;
import xsna.z6f0;

/* compiled from: VideoControlsBarView.kt */
/* loaded from: classes6.dex */
public final class VideoControlsBarView extends LinearLayout {
    public static final /* synthetic */ int n = 0;
    public a b;
    public final View c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final ImageView h;
    public final ImageView i;
    public final uys0 j;
    public final View k;
    public VideoFile l;
    public final Object m;

    /* compiled from: VideoControlsBarView.kt */
    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoControlsBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = msy.a(LazyThreadSafetyMode.NONE, new fcs0(this, 1));
        setOrientation(0);
        setGravity(16);
        LayoutInflater.from(context).inflate(R.layout.view_controls_bar_content, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.likes);
        this.c = findViewById;
        this.d = (ImageView) findViewById(R.id.iv_likes);
        this.e = (TextView) findViewById(R.id.tv_likes);
        TextView textView = (TextView) findViewById(R.id.comments);
        this.f = textView;
        TextView textView2 = (TextView) findViewById(R.id.shares);
        this.g = textView2;
        ImageView imageView = (ImageView) findViewById(R.id.watch_video_later);
        this.h = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.more);
        this.i = imageView2;
        uys0 b = fxc0.B().u0().b(context);
        this.j = b;
        View view = b instanceof View ? (View) b : null;
        this.k = view;
        b.setDarkContextMenus(true);
        b.setVisible(fxc0.B().s().isEnabled());
        dhr0 dhr0Var = dhr0.a;
        Context context2 = getContext();
        dhr0Var.getClass();
        b.setTint(dhr0.f.a(R.attr.vk_ui_icon_primary, context2));
        if (view != null) {
            view.setContentDescription(getContext().getString(R.string.video_accessibility_download_video));
            view.setBackgroundResource(R.drawable.video_controls_bar_bg);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iah0.a(40), iah0.a(32));
            marginLayoutParams.setMarginStart(iah0.a(2));
            addView(view, indexOfChild(imageView), marginLayoutParams);
        }
        bwt0.i0(textView, new b3m0(this, 13));
        bwt0.i0(textView2, new z6f0(this, 26));
        bwt0.i0(imageView, new c4q0(this, 4));
        bwt0.i0(imageView2, new vlc0(this, 25));
        b.setOnDownloadVideoClicked(new j8n0(this, 10));
        bwt0.i0(findViewById, new fda0(this, 20));
    }

    public final a getOnButtonClickListener() {
        return this.b;
    }

    public final void setOnButtonClickListener(a aVar) {
        this.b = aVar;
    }
}
