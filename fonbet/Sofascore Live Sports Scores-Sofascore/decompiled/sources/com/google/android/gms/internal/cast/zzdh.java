package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdh extends UIController {
    public final ImageView b;
    public final View c;
    public final boolean d;
    public final Drawable e;
    public final String f;
    public final Drawable g;
    public final String h;
    public final Drawable i;
    public final String j;
    public boolean k = false;

    public zzdh(ImageView imageView, Context context, Drawable drawable, Drawable drawable2, Drawable drawable3, View view, boolean z) {
        this.b = imageView;
        this.e = drawable;
        this.g = drawable2;
        this.i = drawable3;
        this.f = context.getString(R.string.cast_play);
        this.h = context.getString(R.string.cast_pause);
        this.j = context.getString(R.string.cast_stop);
        this.c = view;
        this.d = z;
        imageView.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void c() {
        h(true);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        this.b.setEnabled(false);
        this.a = null;
    }

    public final void f() {
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            this.b.setEnabled(false);
            return;
        }
        if (remoteMediaClient.p()) {
            if (remoteMediaClient.m()) {
                g(this.i, this.j);
                return;
            } else {
                g(this.g, this.h);
                return;
            }
        }
        if (remoteMediaClient.l()) {
            h(false);
        } else if (remoteMediaClient.o()) {
            g(this.e, this.f);
        } else if (remoteMediaClient.n()) {
            h(true);
        }
    }

    public final void g(Drawable drawable, String str) {
        ImageView imageView = this.b;
        boolean equals = drawable.equals(imageView.getDrawable());
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(str);
        imageView.setVisibility(0);
        imageView.setEnabled(true);
        View view = this.c;
        if (view != null) {
            view.setVisibility(8);
        }
        if (equals || !this.k) {
            return;
        }
        imageView.sendAccessibilityEvent(8);
    }

    public final void h(boolean z) {
        ImageView imageView = this.b;
        this.k = imageView.isAccessibilityFocused();
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
            if (this.k) {
                view.sendAccessibilityEvent(8);
            }
        }
        imageView.setVisibility(true == this.d ? 4 : 0);
        imageView.setEnabled(!z);
    }
}
