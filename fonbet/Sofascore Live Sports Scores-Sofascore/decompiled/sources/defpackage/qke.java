package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qke {
    public static final hg0 q = new hg0(2);
    public final Context a;
    public final oke b;
    public final SparseArray c;
    public final boolean d;
    public final ru4 e;
    public final tqi f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final qpk i;
    public eij j = new eij(1);
    public zqi k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    public qke(lke lkeVar) {
        this.a = lkeVar.a;
        oke okeVar = lkeVar.c;
        okeVar.getClass();
        this.b = okeVar;
        this.c = new SparseArray();
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        this.d = lkeVar.d;
        tqi tqiVar = lkeVar.e;
        this.f = tqiVar;
        long j = lkeVar.g;
        this.h = j != C.TIME_UNSET ? -j : -9223372036854775807L;
        qpk qpkVar = lkeVar.h;
        this.i = qpkVar;
        this.e = new ru4(lkeVar.b, qpkVar, tqiVar);
        this.g = new CopyOnWriteArraySet();
        new b(new qm8());
        this.o = C.TIME_UNSET;
        this.p = -1;
        this.n = 0;
    }
}
