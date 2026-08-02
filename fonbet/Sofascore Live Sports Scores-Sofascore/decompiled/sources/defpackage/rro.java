package defpackage;

import com.google.android.gms.internal.play_billing.zzi;
import com.google.android.gms.internal.play_billing.zzo;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rro extends hda {
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;

    public rro(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f = atomicReferenceFieldUpdater;
        this.g = atomicReferenceFieldUpdater2;
        this.h = atomicReferenceFieldUpdater3;
        this.i = atomicReferenceFieldUpdater4;
        this.j = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.hda
    public final void W(dxo dxoVar, dxo dxoVar2) {
        this.g.lazySet(dxoVar, dxoVar2);
    }

    @Override // defpackage.hda
    public final void Y(dxo dxoVar, Thread thread) {
        this.f.lazySet(dxoVar, thread);
    }

    @Override // defpackage.hda
    public final boolean a0(zzo zzoVar, vjo vjoVar, vjo vjoVar2) {
        return zzi.a(this.i, zzoVar, vjoVar, vjoVar2);
    }

    @Override // defpackage.hda
    public final boolean b0(zzo zzoVar, Object obj, Object obj2) {
        return zzi.a(this.j, zzoVar, obj, obj2);
    }

    @Override // defpackage.hda
    public final boolean c0(zzo zzoVar, dxo dxoVar, dxo dxoVar2) {
        return zzi.a(this.h, zzoVar, dxoVar, dxoVar2);
    }
}
