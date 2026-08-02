package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaaf {
    public final zzabn a;
    public final String b;

    public zzaaf(zzabn zzabnVar, String str) {
        zzabr.a(zzabnVar, "parser");
        this.a = zzabnVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaaf)) {
            return false;
        }
        zzaaf zzaafVar = (zzaaf) obj;
        return this.a.equals(zzaafVar.a) && this.b.equals(zzaafVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }
}
