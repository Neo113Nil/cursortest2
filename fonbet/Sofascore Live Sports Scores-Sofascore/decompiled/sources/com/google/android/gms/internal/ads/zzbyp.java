package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbyp extends zzbyy {
    public final Map c;
    public final Activity d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbyp(zzclm zzclmVar, Map map) {
        super(zzclmVar, "createCalendarEvent");
        long parseLong;
        String str;
        this.c = map;
        this.d = zzclmVar.zzj();
        this.e = f("description");
        this.h = f("summary");
        String str2 = (String) map.get("start_ticks");
        long j = -1;
        if (str2 != null) {
            try {
                parseLong = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
            }
            this.f = parseLong;
            str = (String) this.c.get("end_ticks");
            if (str != null) {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException unused2) {
                }
            }
            this.g = j;
            this.i = f("location");
        }
        parseLong = -1;
        this.f = parseLong;
        str = (String) this.c.get("end_ticks");
        if (str != null) {
        }
        this.g = j;
        this.i = f("location");
    }

    public final String f(String str) {
        Map map = this.c;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }
}
