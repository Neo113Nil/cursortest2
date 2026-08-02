package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pki implements iki {
    public static final pki a;
    public static final /* synthetic */ pki[] b;

    static {
        pki pkiVar = new pki("CANCELLED", 0);
        a = pkiVar;
        b = new pki[]{pkiVar};
    }

    public static void a(AtomicReference atomicReference) {
        iki ikiVar;
        iki ikiVar2 = (iki) atomicReference.get();
        pki pkiVar = a;
        if (ikiVar2 == pkiVar || (ikiVar = (iki) atomicReference.getAndSet(pkiVar)) == pkiVar || ikiVar == null) {
            return;
        }
        ikiVar.cancel();
    }

    public static boolean b(AtomicReference atomicReference, iki ikiVar) {
        rha.x(ikiVar, "s is null");
        while (!atomicReference.compareAndSet(null, ikiVar)) {
            if (atomicReference.get() != null) {
                ikiVar.cancel();
                if (atomicReference.get() == a) {
                    return false;
                }
                hda.L(new kx2("Subscription already set!", 5));
                return false;
            }
        }
        return true;
    }

    public static boolean c(long j) {
        if (j > 0) {
            return true;
        }
        hda.L(new IllegalArgumentException(vxd.l(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean d(iki ikiVar, iki ikiVar2) {
        if (ikiVar2 == null) {
            hda.L(new NullPointerException("next is null"));
            return false;
        }
        if (ikiVar == null) {
            return true;
        }
        ikiVar2.cancel();
        hda.L(new kx2("Subscription already set!", 5));
        return false;
    }

    public static pki valueOf(String str) {
        return (pki) Enum.valueOf(pki.class, str);
    }

    public static pki[] values() {
        return (pki[]) b.clone();
    }

    @Override // defpackage.iki
    public final void cancel() {
    }

    @Override // defpackage.iki
    public final void request(long j) {
    }
}
