package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhv {
    public Uri a;
    public Map b;
    public long c;
    public final long d;
    public int e;

    public /* synthetic */ zzhv(zzhw zzhwVar) {
        this.a = zzhwVar.a;
        this.b = zzhwVar.b;
        this.c = zzhwVar.c;
        this.d = zzhwVar.d;
        this.e = zzhwVar.e;
    }

    public final zzhw a() {
        zzguk.h(this.a, "The uri must be set.");
        return new zzhw(this.a, this.b, this.c, this.d, this.e);
    }

    public zzhv() {
        this.b = Collections.EMPTY_MAP;
        this.d = -1L;
    }
}
