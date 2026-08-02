package androidx.media3.exoplayer.dash;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.dash.e;
import java.util.ArrayList;
import xsna.anl;
import xsna.d7q;
import xsna.grz;
import xsna.kcc;
import xsna.mjp0;
import xsna.rsk;
import xsna.wp6;
import xsna.x1b0;

/* compiled from: DashChunkSource.java */
/* loaded from: classes12.dex */
public interface b extends kcc {
    void d(d7q d7qVar);

    void f(rsk rskVar, int i);

    /* compiled from: DashChunkSource.java */
    public interface a {
        b e(grz grzVar, rsk rskVar, wp6 wp6Var, int i, int[] iArr, d7q d7qVar, int i2, long j, boolean z, ArrayList arrayList, @Nullable e.c cVar, @Nullable mjp0 mjp0Var, x1b0 x1b0Var);

        default void b() {
        }

        default void a(anl anlVar) {
        }

        default void c(boolean z) {
        }

        default androidx.media3.common.a d(androidx.media3.common.a aVar) {
            return aVar;
        }
    }
}
