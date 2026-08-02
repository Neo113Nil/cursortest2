package com.google.android.gms.cast.framework.media.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.internal.Logger;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzt {
    public static final Logger a = new Logger("MediaSessionUtils", null);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        if (r0 != 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r1.containsKey("com.google.android.gms.cast.metadata.COMPOSER") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(MediaMetadata mediaMetadata) {
        Bundle bundle = mediaMetadata.b;
        Bundle bundle2 = mediaMetadata.b;
        String str = "com.google.android.gms.cast.metadata.SUBTITLE";
        if (!bundle.containsKey("com.google.android.gms.cast.metadata.SUBTITLE")) {
            int i = mediaMetadata.c;
            if (i == 1) {
                str = "com.google.android.gms.cast.metadata.STUDIO";
            } else if (i == 2) {
                str = "com.google.android.gms.cast.metadata.SERIES_TITLE";
            } else if (i == 3) {
                if (!bundle2.containsKey("com.google.android.gms.cast.metadata.ARTIST")) {
                    String str2 = bundle2.containsKey("com.google.android.gms.cast.metadata.ALBUM_ARTIST") ? "com.google.android.gms.cast.metadata.ALBUM_ARTIST" : "com.google.android.gms.cast.metadata.COMPOSER";
                    str = str2;
                }
                str = "com.google.android.gms.cast.metadata.ARTIST";
            }
        }
        return mediaMetadata.Y0(str);
    }

    public static List b(com.google.android.gms.cast.framework.media.zzg zzgVar) {
        try {
            return zzgVar.zzf();
        } catch (RemoteException unused) {
            a.c("Unable to call %s on %s.", "getNotificationActions", "zzg");
            return null;
        }
    }
}
