package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabm {
    public final int a;
    public final zznh[] b;
    public final zzabe[] c;
    public final zzbn d;
    public final Object e;

    public zzabm(zznh[] zznhVarArr, zzabe[] zzabeVarArr, zzbn zzbnVar, zzabh zzabhVar) {
        int length = zznhVarArr.length;
        zzguk.a(length == zzabeVarArr.length);
        this.b = zznhVarArr;
        this.c = (zzabe[]) zzabeVarArr.clone();
        this.d = zzbnVar;
        this.e = zzabhVar;
        this.a = length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }

    public final boolean b(zzabm zzabmVar, int i) {
        return Objects.equals(this.b[i], zzabmVar.b[i]) && Objects.equals(this.c[i], zzabmVar.c[i]);
    }
}
