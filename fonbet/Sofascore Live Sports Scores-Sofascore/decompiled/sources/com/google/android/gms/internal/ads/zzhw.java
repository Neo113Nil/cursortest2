package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.ironsource.U3;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.wt3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhw {
    public static final /* synthetic */ int f = 0;
    public final Uri a;
    public final Map b;
    public final long c;
    public final long d;
    public final int e;

    static {
        zzal.a("media3.datasource");
    }

    public zzhw(Uri uri, Map map, long j, long j2, int i) {
        boolean z = false;
        boolean z2 = j >= 0;
        zzguk.a(z2);
        zzguk.a(z2);
        if (j2 <= 0) {
            j2 = j2 == -1 ? -1L : j2;
            zzguk.a(z);
            uri.getClass();
            this.a = uri;
            this.b = Collections.unmodifiableMap(new HashMap(map));
            this.c = j;
            this.d = j2;
            this.e = i;
        }
        z = true;
        zzguk.a(z);
        uri.getClass();
        this.a = uri;
        this.b = Collections.unmodifiableMap(new HashMap(map));
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        long j = this.c;
        int length2 = String.valueOf(j).length();
        long j2 = this.d;
        int length3 = String.valueOf(j2).length();
        int i = this.e;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        wt3.A("DataSpec[GET ", obj, sb, ", ");
        sb.append(j);
        fn0.t(j2, ", ", ", null, ", sb);
        return fc6.h(i, U3.j.e, sb);
    }

    public zzhw(Uri uri, long j, long j2) {
        this(uri, Collections.EMPTY_MAP, j, j2, 0);
    }
}
