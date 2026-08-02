package defpackage;

import com.google.android.gms.internal.ads.zzavo;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzgpx;
import com.google.android.gms.internal.ads.zzgrh;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qfo implements zzgpx {
    public final zzgrh a;
    public final long b;

    public qfo(zzgrh zzgrhVar, long j) {
        this.a = zzgrhVar;
        this.b = j;
    }

    public static boolean c(zzggt zzggtVar) {
        int D = zzggtVar.E().D().D();
        int E = zzggtVar.E().D().E();
        byte[] a = zzavo.a();
        a.getClass();
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.getClass();
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) D);
        allocate.putInt(E);
        byte[] array = allocate.array();
        array.getClass();
        return Arrays.equals(array, a);
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final boolean a(zzggt zzggtVar) {
        zzgrh zzgrhVar = this.a;
        if (zzggtVar == null || zzggtVar.equals(zzggt.J())) {
            zzgrhVar.b(20204);
            return false;
        }
        if (c(zzggtVar)) {
            return true;
        }
        zzgrhVar.b(20206);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final boolean b(zzggt zzggtVar) {
        zzgrh zzgrhVar = this.a;
        if (zzggtVar == null || zzggtVar.equals(zzggt.J())) {
            zzgrhVar.b(20202);
            return true;
        }
        if (!c(zzggtVar)) {
            zzgrhVar.b(20205);
            return true;
        }
        boolean z = zzggtVar.E().F() - System.currentTimeMillis() <= this.b;
        if (z) {
            zzgrhVar.b(20203);
        }
        return z;
    }
}
