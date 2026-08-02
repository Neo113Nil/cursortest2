package defpackage;

import com.google.android.gms.internal.ads.zzhmi;
import com.google.android.gms.internal.ads.zzhmp;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vmo {
    public final x6k a;
    public final long[] b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vmo(int i) {
        this(new x6k(28), new long[10]);
        switch (i) {
            case 1:
                break;
            default:
                vmo vmoVar = zzhmi.b;
                this.a = new x6k(vmoVar.a);
                this.b = Arrays.copyOf(vmoVar.b, 10);
                break;
        }
    }

    public static void a(vmo vmoVar, vmo vmoVar2) {
        x6k x6kVar = vmoVar2.a;
        x6k x6kVar2 = vmoVar.a;
        long[] jArr = (long[]) x6kVar2.b;
        long[] jArr2 = (long[]) x6kVar.b;
        long[] jArr3 = vmoVar2.b;
        zzhmp.e(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) x6kVar2.c;
        long[] jArr5 = (long[]) x6kVar.c;
        long[] jArr6 = (long[]) x6kVar.d;
        zzhmp.e(jArr4, jArr5, jArr6);
        zzhmp.e((long[]) x6kVar2.d, jArr6, jArr3);
        zzhmp.e(vmoVar.b, jArr2, jArr5);
    }

    public /* synthetic */ vmo(x6k x6kVar, long[] jArr) {
        this.a = x6kVar;
        this.b = jArr;
    }

    public vmo(vmo vmoVar) {
        this(1);
        a(this, vmoVar);
    }
}
