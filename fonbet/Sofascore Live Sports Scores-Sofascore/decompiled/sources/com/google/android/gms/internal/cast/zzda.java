package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.hvo;
import defpackage.mxn;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzda extends UIController {
    public final ImageView b;
    public final ImageHints c;
    public final Bitmap d;
    public final View e;
    public final ImagePicker f;
    public final zzcz g;
    public final com.google.android.gms.cast.framework.media.internal.zzb h;

    public zzda(ImageView imageView, Context context, ImageHints imageHints, int i, View view, hvo hvoVar) {
        this.b = imageView;
        this.c = imageHints;
        this.g = hvoVar;
        ImagePicker imagePicker = null;
        this.d = i != 0 ? BitmapFactory.decodeResource(context.getResources(), i) : null;
        this.e = view;
        CastContext d = CastContext.d(context);
        if (d != null) {
            Preconditions.e("Must be called from the main thread.");
            CastMediaOptions castMediaOptions = d.e.f;
            if (castMediaOptions != null) {
                imagePicker = castMediaOptions.Y0();
            }
        }
        this.f = imagePicker;
        this.h = new com.google.android.gms.cast.framework.media.internal.zzb(context.getApplicationContext());
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void a() {
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void d(CastSession castSession) {
        super.d(castSession);
        this.h.e = new mxn(this, 0);
        g();
        f();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void e() {
        com.google.android.gms.cast.framework.media.internal.zzb zzbVar = this.h;
        zzbVar.b();
        zzbVar.e = null;
        g();
        this.a = null;
    }

    public final void f() {
        List list;
        Uri uri;
        RemoteMediaClient remoteMediaClient = this.a;
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            g();
            return;
        }
        MediaInfo f = remoteMediaClient.f();
        Uri uri2 = null;
        if (f != null) {
            MediaMetadata mediaMetadata = f.d;
            if (this.f != null && mediaMetadata != null) {
                int i = this.c.a;
                WebImage a = ImagePicker.a(mediaMetadata);
                if (a != null && (uri = a.b) != null) {
                    uri2 = uri;
                }
            }
            if (mediaMetadata != null && (list = mediaMetadata.a) != null && list.size() > 0) {
                uri2 = ((WebImage) list.get(0)).b;
            }
        }
        if (uri2 == null) {
            g();
        } else {
            this.h.a(uri2);
        }
    }

    public final void g() {
        ImageView imageView = this.b;
        View view = this.e;
        if (view != null) {
            view.setVisibility(0);
            imageView.setVisibility(4);
        }
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
