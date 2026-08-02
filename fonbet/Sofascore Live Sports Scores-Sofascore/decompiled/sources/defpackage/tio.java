package defpackage;

import com.google.android.gms.internal.ads.zzgul;
import com.google.android.gms.internal.ads.zzgvk;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tio extends zzgvk {
    public final /* synthetic */ int c = 0;
    public final Iterator d;
    public final /* synthetic */ Object e;

    public tio(qjo qjoVar, Set set, Set set2) {
        this.e = set2;
        this.d = set.iterator();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzgvk
    public final Object a() {
        int i = this.c;
        Object obj = this.e;
        Iterator it = this.d;
        switch (i) {
            case 0:
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((zzgul) obj).zza(next)) {
                        break;
                    }
                }
                this.b = 3;
                break;
            default:
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (((Set) obj).contains(next2)) {
                        break;
                    }
                }
                this.b = 3;
                break;
        }
        return null;
    }

    public tio(Iterator it, zzgul zzgulVar) {
        this.d = it;
        this.e = zzgulVar;
    }
}
