package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* loaded from: classes5.dex */
public final class hn extends hi<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2367 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2368 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2369 = -3596124203662077445L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private a f2370;

    public interface a {
        /* renamed from: ﾇ */
        void mo7407(hn hnVar, MediaPlayer mediaPlayer);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hn;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.f, mediaPlayer, "media-player");
        safedk_hn_onCompletion_89a316bf9cada0add73bc1e48fdf8d91(mediaPlayer);
    }

    public hn(MediaPlayer.OnCompletionListener onCompletionListener, a aVar) {
        super(onCompletionListener);
        this.f2370 = aVar;
    }

    public void safedk_hn_onCompletion_89a316bf9cada0add73bc1e48fdf8d91(MediaPlayer p0) {
        int i = 2 % 2;
        int i2 = f2367 + 25;
        f2368 = i2 % 128;
        try {
        } catch (Throwable th) {
            kl.m8458(m7841("醴ꇀ\uf112ū僂怢끩쏍ጧ⍯狆舲퉋\ue5c3㔮䕴铎ꐰ\uf464߆圛杧뛖옷ᙱ⧗礭襣\ud8c5", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12373).intern(), m7841("醾䝊㰏ᗝ쪅ꀔ餀什⟃ᵍ\uf231꯸肓癵⼢Ӣﶮ퍦蠨懰囧౫\ue557\uda3d돜條幅㜆\uecca얘뭈选䧵", 54979 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f2370.mo7407(this, p0);
            Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f2370.mo7407(this, p0);
        if (mo6363() != null) {
            int i3 = f2368 + 27;
            f2367 = i3 % 128;
            int i4 = i3 % 2;
            mo6363().onCompletion(p0);
        }
        int i5 = f2368 + 49;
        f2367 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7841(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f2369);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
