package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzlj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uto implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ zzlj i;

    public uto(zzlj zzljVar, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bundle;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.Z(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
