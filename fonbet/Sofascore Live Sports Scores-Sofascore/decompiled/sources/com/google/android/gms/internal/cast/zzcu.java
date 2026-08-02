package com.google.android.gms.internal.cast;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcu extends UIController {
    public final ImageView b;
    public final String c;
    public final String d;

    public zzcu(ImageView imageView, Context context) {
        this.b = imageView;
        this.c = context.getString(R.string.cast_closed_captions);
        this.d = context.getString(R.string.cast_closed_captions_unavailable);
        imageView.setEnabled(false);
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
        super.d(castSession);
        this.b.setEnabled(true);
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        this.b.setEnabled(false);
        this.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        MediaInfo f;
        List list;
        RemoteMediaClient remoteMediaClient = this.a;
        ImageView imageView = this.b;
        if (remoteMediaClient != null && remoteMediaClient.k() && (f = remoteMediaClient.f()) != null && (list = f.f) != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = ((MediaTrack) it.next()).b;
                if (i2 == 2) {
                    i++;
                    if (i > 1) {
                        if (!remoteMediaClient.q()) {
                            imageView.setEnabled(true);
                            imageView.setContentDescription(this.c);
                            return;
                        }
                    }
                } else if (i2 == 1) {
                    if (!remoteMediaClient.q()) {
                    }
                }
            }
        }
        imageView.setEnabled(false);
        imageView.setContentDescription(this.d);
    }
}
