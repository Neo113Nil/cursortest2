package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzak {
    public final String a;
    public final zzag b;
    public final zzaf c;
    public final zzan d;
    public final zzac e;
    public final zzai f;

    static {
        new zzz().a();
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzak(String str, zzac zzacVar, zzag zzagVar, zzaf zzafVar, zzan zzanVar, zzai zzaiVar) {
        this.a = str;
        this.b = zzagVar;
        this.c = zzafVar;
        this.d = zzanVar;
        this.e = zzacVar;
        this.f = zzaiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak zzakVar = (zzak) obj;
        return this.a.equals(zzakVar.a) && this.e.equals(zzakVar.e) && Objects.equals(this.b, zzakVar.b) && this.c.equals(zzakVar.c) && Objects.equals(this.d, zzakVar.d) && Objects.equals(this.f, zzakVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        return (this.d.hashCode() + ((((this.c.hashCode() + ((hashCode + (this.b != null ? r1.hashCode() : 0)) * 31)) * 31) - 2147483648) * 31)) * 31;
    }
}
