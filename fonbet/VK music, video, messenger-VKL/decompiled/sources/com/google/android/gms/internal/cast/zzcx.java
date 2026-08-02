package com.google.android.gms.internal.cast;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
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
public final class zzcx extends twp0 {
    private final ImageView zza;
    private final ImageHints zzb;
    private final Bitmap zzc;

    @Nullable
    private final okw zzd;
    private final i201 zze;

    public zzcx(ImageView imageView, Context context, @NonNull ImageHints imageHints, int i) {
        i201 i201Var = new i201(context.getApplicationContext());
        this.zza = imageView;
        this.zzb = imageHints;
        this.zzc = BitmapFactory.decodeResource(context.getResources(), i);
        uz9 g = uz9.g(context);
        okw okwVar = null;
        if (g != null) {
            exc0.e("Must be called from the main thread.");
            CastMediaOptions castMediaOptions = g.e.g;
            if (castMediaOptions != null) {
                okwVar = castMediaOptions.i();
            }
        }
        this.zzd = okwVar;
        this.zze = i201Var;
    }

    private final void zzb() {
        MediaInfo mediaInfo;
        List list;
        Uri uri;
        lvf0 remoteMediaClient = getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.k()) {
            this.zza.setImageBitmap(this.zzc);
            return;
        }
        exc0.e("Must be called from the main thread.");
        MediaStatus h = remoteMediaClient.h();
        Uri uri2 = null;
        MediaQueueItem j = h == null ? null : h.j(h.n);
        if (j != null && (mediaInfo = j.b) != null) {
            okw okwVar = this.zzd;
            MediaMetadata mediaMetadata = mediaInfo.e;
            if (okwVar != null && mediaMetadata != null) {
                int i = this.zzb.b;
                WebImage a = okw.a(mediaMetadata);
                if (a != null && (uri = a.c) != null) {
                    uri2 = uri;
                }
            }
            MediaMetadata mediaMetadata2 = mediaInfo.e;
            if (mediaMetadata2 != null && (list = mediaMetadata2.b) != null && list.size() > 0) {
                uri2 = ((WebImage) list.get(0)).c;
            }
        }
        if (uri2 == null) {
            this.zza.setImageBitmap(this.zzc);
        } else {
            this.zze.a(uri2);
        }
    }

    @Override // xsna.twp0
    public final void onMediaStatusUpdated() {
        zzb();
    }

    @Override // xsna.twp0
    public final void onSessionConnected(g0a g0aVar) {
        super.onSessionConnected(g0aVar);
        this.zze.e = new zzcw(this);
        this.zza.setImageBitmap(this.zzc);
        zzb();
    }

    @Override // xsna.twp0
    public final void onSessionEnded() {
        this.zze.b();
        this.zza.setImageBitmap(this.zzc);
        super.onSessionEnded();
    }

    public final /* synthetic */ ImageView zza() {
        return this.zza;
    }
}
