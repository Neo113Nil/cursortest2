package com.google.android.gms.internal.cast;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.common.internal.Preconditions;
import com.sofascore.results.R;
import defpackage.ryn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdg extends UIController {
    public final ImageView b;
    public final String c;
    public final String d;
    public final Context e;
    public ryn f;

    public zzdg(ImageView imageView, Context context) {
        this.b = imageView;
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        this.c = applicationContext.getString(R.string.cast_mute);
        this.d = applicationContext.getString(R.string.cast_unmute);
        imageView.setEnabled(false);
        this.f = null;
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void c() {
        this.b.setEnabled(false);
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        ryn rynVar = this.f;
        if (rynVar == null) {
            rynVar = new ryn(this);
            this.f = rynVar;
        }
        Preconditions.e("Must be called from the main thread.");
        castSession.d.add(rynVar);
        super.d(castSession);
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        ryn rynVar;
        this.b.setEnabled(false);
        CastSession c = CastContext.c(this.e).b().c();
        if (c != null && (rynVar = this.f) != null) {
            Preconditions.e("Must be called from the main thread.");
            c.d.remove(rynVar);
        }
        this.a = null;
    }

    public final void f() {
        CastSession c = CastContext.c(this.e).b().c();
        ImageView imageView = this.b;
        if (c == null || !c.c()) {
            imageView.setEnabled(false);
            return;
        }
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            imageView.setEnabled(false);
        } else {
            imageView.setEnabled(true);
        }
        boolean l = c.l();
        imageView.setSelected(l);
        imageView.setContentDescription(l ? this.d : this.c);
    }
}
