package com.vk.media.pipeline.utils;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import xsna.arm0;
import xsna.uy1;

/* compiled from: MediaMetadataUtils.kt */
/* loaded from: classes3.dex */
public final class MediaMetadataUtils {

    /* compiled from: MediaMetadataUtils.kt */
    public static final class MediaMetadataException extends RuntimeException {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[Catch: all -> 0x004a, TryCatch #1 {all -> 0x004a, blocks: (B:5:0x0011, B:7:0x0041, B:11:0x004f, B:15:0x008c, B:17:0x0094, B:19:0x009a, B:23:0x00a7, B:25:0x00b1, B:27:0x00b9, B:32:0x00c5, B:35:0x00d4, B:41:0x0084), top: B:4:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static uy1 a(Context context, Uri uri) {
        boolean z;
        int c;
        String extractMetadata;
        Float f;
        Integer m;
        uy1 uy1Var = new uy1();
        MediaMetadataRetriever mediaMetadataRetriever = null;
        r1 = null;
        r1 = null;
        Float f2 = null;
        try {
            uy1Var.e = b(context, uri);
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever2.setDataSource(context, uri);
                String extractMetadata2 = mediaMetadataRetriever2.extractMetadata(17);
                String extractMetadata3 = mediaMetadataRetriever2.extractMetadata(18);
                String extractMetadata4 = mediaMetadataRetriever2.extractMetadata(19);
                String extractMetadata5 = mediaMetadataRetriever2.extractMetadata(12);
                String extractMetadata6 = mediaMetadataRetriever2.extractMetadata(9);
                String extractMetadata7 = mediaMetadataRetriever2.extractMetadata(20);
                String extractMetadata8 = mediaMetadataRetriever2.extractMetadata(24);
                if (extractMetadata2 != null && extractMetadata2.length() != 0) {
                    z = false;
                    uy1Var.c = !z;
                    uy1Var.a = c(uy1Var.a, extractMetadata3);
                    uy1Var.b = c(uy1Var.b, extractMetadata4);
                    uy1Var.d = extractMetadata5;
                    uy1Var.f = c(uy1Var.f, extractMetadata6);
                    uy1Var.g = c(uy1Var.g, extractMetadata7);
                    c = c(uy1Var.h, extractMetadata8);
                    uy1Var.h = c;
                    if (c != 90 || c == 270) {
                        int i = uy1Var.a;
                        uy1Var.a = uy1Var.b;
                        uy1Var.b = i;
                    }
                    extractMetadata = mediaMetadataRetriever2.extractMetadata(25);
                    if (extractMetadata != null || (f = arm0.l(extractMetadata)) == null || f.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = null;
                    }
                    if (f == null) {
                        int i2 = uy1Var.f;
                        String extractMetadata9 = mediaMetadataRetriever2.extractMetadata(32);
                        if (extractMetadata9 != null && (m = arm0.m(10, extractMetadata9)) != null) {
                            if (m.intValue() <= 0 || i2 <= 0) {
                                m = null;
                            }
                            if (m != null) {
                                f2 = Float.valueOf((m.intValue() * 1000.0f) / i2);
                            }
                        }
                        f = f2;
                    }
                    uy1Var.i = f;
                    mediaMetadataRetriever2.release();
                    return uy1Var;
                }
                z = true;
                uy1Var.c = !z;
                uy1Var.a = c(uy1Var.a, extractMetadata3);
                uy1Var.b = c(uy1Var.b, extractMetadata4);
                uy1Var.d = extractMetadata5;
                uy1Var.f = c(uy1Var.f, extractMetadata6);
                uy1Var.g = c(uy1Var.g, extractMetadata7);
                c = c(uy1Var.h, extractMetadata8);
                uy1Var.h = c;
                if (c != 90) {
                }
                int i3 = uy1Var.a;
                uy1Var.a = uy1Var.b;
                uy1Var.b = i3;
                extractMetadata = mediaMetadataRetriever2.extractMetadata(25);
                if (extractMetadata != null) {
                }
                f = null;
                if (f == null) {
                }
                uy1Var.i = f;
                mediaMetadataRetriever2.release();
                return uy1Var;
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    uy1Var.j = th;
                    return uy1Var;
                } finally {
                    if (mediaMetadataRetriever != null) {
                        mediaMetadataRetriever.release();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static long b(Context context, Uri uri) throws MediaMetadataException {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor == null) {
                throw new MediaMetadataException("Cannot open uri: " + uri.getPath());
            }
            long j = -1;
            if (openAssetFileDescriptor.getLength() != -1 && openAssetFileDescriptor.getLength() >= 0) {
                j = openAssetFileDescriptor.getLength();
            }
            try {
                openAssetFileDescriptor.close();
            } catch (Exception unused) {
            }
            return j;
        } catch (Throwable th) {
            try {
                throw new MediaMetadataException("Cannot open uri: " + uri.getPath(), th);
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        assetFileDescriptor.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th2;
            }
        }
    }

    public static int c(int i, String str) {
        Integer m;
        return (str == null || (m = arm0.m(10, str)) == null) ? i : m.intValue();
    }
}
