package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.google.android.exoplayer2.C;
import io.ktor.util.date.GMTDateParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class ho extends hi<MediaPlayer.OnPreparedListener> implements MediaPlayer.OnPreparedListener {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2371 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2372;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2373 = {'\'', '^', '_', 'a', 'k', 'j', GMTDateParser.HOURS, 'i', 'k', GMTDateParser.DAY_OF_MONTH, 'X', 'Z', 'n', GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', AbstractJsonLexerKt.BEGIN_LIST, 'T', GMTDateParser.DAY_OF_MONTH, 'i', 'p', 'i', 'j', 'q', 'p', '9', GMTDateParser.SECONDS, 'l', 'i', 'i', 'k', 'I', 'G', 'n', '_', 'a', 'k', 'j', GMTDateParser.HOURS, 'i', 'k', GMTDateParser.DAY_OF_MONTH, 'T', AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'F', '`', AbstractJsonLexerKt.BEGIN_LIST, 'W', 'Z'};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private c f2374;

    public interface c {
        /* renamed from: ﾇ */
        void mo7408(ho hoVar, MediaPlayer mediaPlayer);
    }

    public ho(MediaPlayer.OnPreparedListener onPreparedListener, c cVar) {
        super(onPreparedListener);
        this.f2374 = cVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        int i2 = f2371 + 27;
        f2372 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2374.mo7408(this, mediaPlayer);
                int i3 = 26 / 0;
            } else {
                this.f2374.mo7408(this, mediaPlayer);
            }
        } catch (Throwable th) {
            kl.m8458(m7842("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{0, 27, 0, 0}, false).intern(), m7842("\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{27, 31, 0, 17}, false).intern(), th, false);
        }
        if (mo6363() != null) {
            mo6363().onPrepared(mediaPlayer);
            int i4 = f2371 + 109;
            f2372 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = f2372 + 49;
        f2371 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7842(String str, int[] iArr, boolean z) {
        String str2;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        synchronized (h.f2286) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f2373, i, cArr, 0, i2);
            if (bArr2 != null) {
                char[] cArr2 = new char[i2];
                h.f2287 = 0;
                char c2 = 0;
                while (h.f2287 < i2) {
                    if (bArr2[h.f2287] == 1) {
                        cArr2[h.f2287] = (char) (((cArr[h.f2287] << 1) + 1) - c2);
                    } else {
                        cArr2[h.f2287] = (char) ((cArr[h.f2287] << 1) - c2);
                    }
                    c2 = cArr2[h.f2287];
                    h.f2287++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr4[h.f2287] = cArr[(i2 - h.f2287) - 1];
                    h.f2287++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                h.f2287 = 0;
                while (h.f2287 < i2) {
                    cArr[h.f2287] = (char) (cArr[h.f2287] - iArr[2]);
                    h.f2287++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
