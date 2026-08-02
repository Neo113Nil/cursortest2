package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.images.WebImage;
import java.util.List;
import xsna.exc0;
import xsna.g0a;
import xsna.i201;
import xsna.lvf0;
import xsna.okw;
import xsna.twp0;
import xsna.uz9;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzda extends twp0 {
    private final ImageView zza;
    private final ImageHints zzb;

    @Nullable
    private final Bitmap zzc;

    @Nullable
    private final View zzd;

    @Nullable
    private final okw zze;

    @Nullable
    private final zzcz zzf;
    private final i201 zzg;

    public zzda(ImageView imageView, Context context, ImageHints imageHints, int i, @Nullable View view, @Nullable zzcz zzczVar) {
        this.zza = imageView;
        this.zzb = imageHints;
        this.zzf = zzczVar;
        okw okwVar = null;
        this.zzc = i != 0 ? BitmapFactory.decodeResource(context.getResources(), i) : null;
        this.zzd = view;
        uz9 g = uz9.g(context);
        if (g != null) {
            exc0.e("Must be called from the main thread.");
            CastMediaOptions castMediaOptions = g.e.g;
            if (castMediaOptions != null) {
                okwVar = castMediaOptions.i();
            }
        }
        this.zze = okwVar;
        this.zzg = new i201(context.getApplicationContext());
    }

    private final void zzd() {
        List list;
        Uri uri;
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            zze();
            return;
        }
        MediaInfo g = remoteMediaClient.g();
        Uri uri2 = null;
        if (g != null) {
            okw okwVar = this.zze;
            MediaMetadata mediaMetadata = g.e;
            if (okwVar != null && mediaMetadata != null) {
                int i = this.zzb.b;
                WebImage a = okw.a(mediaMetadata);
                if (a != null && (uri = a.c) != null) {
                    uri2 = uri;
                }
            }
            MediaMetadata mediaMetadata2 = g.e;
            if (mediaMetadata2 != null && (list = mediaMetadata2.b) != null && list.size() > 0) {
                uri2 = ((WebImage) list.get(0)).c;
            }
        }
        if (uri2 == null) {
            zze();
        } else {
            this.zzg.a(uri2);
        }
    }

    private final void zze() {
        View view = this.zzd;
        if (view != null) {
            view.setVisibility(0);
            this.zza.setVisibility(4);
        }
        Bitmap bitmap = this.zzc;
        if (bitmap != null) {
            this.zza.setImageBitmap(bitmap);
        }
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zzd();
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        this.zzg.e = new zzcy(this);
        zze();
        zzd();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        this.zzg.b();
        zze();
        super.onSessionEnded();
    }

    public final /* synthetic */ ImageView zza() {
        return this.zza;
    }

    public final /* synthetic */ View zzb() {
        return this.zzd;
    }

    public final /* synthetic */ zzcz zzc() {
        return this.zzf;
    }
}
