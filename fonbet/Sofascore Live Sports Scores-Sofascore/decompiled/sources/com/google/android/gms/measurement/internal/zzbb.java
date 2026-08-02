package com.google.android.gms.measurement.internal;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import defpackage.fso;
import defpackage.wt3;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbb extends fso {
    public long d;
    public String e;

    @Override // defpackage.fso
    public final boolean R() {
        Calendar calendar = Calendar.getInstance();
        this.d = (calendar.get(16) + calendar.get(15)) / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.e = wt3.m(lowerCase, "-", new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase2);
        return false;
    }

    public final long U() {
        S();
        return this.d;
    }

    public final String V() {
        S();
        return this.e;
    }
}
