package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes5.dex */
public final class hq extends hi<MediaPlayer.OnSeekCompleteListener> implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f2382 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f2383 = null;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2384 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2385 = 945775359;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2386 = 39;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2387 = -430482725;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2388 = {-87, -95, -71, -107, -87, -78, -92, -57, 120, -77, -99, -81, -105, -89, -80, -61, -115, -105, -75, -97, -94, -87, -92, -46, 126, -84, -90, -72, -117, -59, 70, 100, 78, 81, 88, 83, -127, 45, 91, 85, 103, 58, 84, -92, 3, 98, 76, 94, 70, 86, 95, 114, 63, 99, 60, -94, 7, 90, -98, 3, 88, 82, 85, -126, 0, 0};

    /* renamed from: ﾇ, reason: contains not printable characters */
    private d f2389;

    public interface d {
        /* renamed from: ﻛ */
        void mo7406(hq hqVar, MediaPlayer mediaPlayer);
    }

    public hq(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, d dVar) {
        super(onSeekCompleteListener);
        this.f2389 = dVar;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        int i2 = f2384 + 99;
        f2382 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2389.mo7406(this, mediaPlayer);
            int i4 = f2382 + 101;
            f2384 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m7844((short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 91), TextUtils.indexOf("", "", 0) - 945775280, ExpandableListView.getPackedPositionType(0L) - 8, 430482725 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m7844((short) (Color.blue(0) - 85), (-945775290) - (ViewConfiguration.getPressedStateDuration() >> 16), (-4) - Drawable.resolveOpacity(0, 0), 430482755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) View.MeasureSpec.getSize(0)).intern(), th, false);
        }
        if (mo6363() != null) {
            mo6363().onSeekComplete(mediaPlayer);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7844(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2386;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2388;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2387 + i3] + i4);
                } else {
                    i5 = (short) (f2383[f2387 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2387 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2385);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2388;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2383;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
