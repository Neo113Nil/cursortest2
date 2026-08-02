package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.d7q;
import xsna.m0h0;
import xsna.o3i0;
import xsna.qfp0;

/* compiled from: MediaPeriod.java */
/* loaded from: classes12.dex */
public interface h extends q {

    /* compiled from: MediaPeriod.java */
    public interface a extends q.a<h> {
        void b(h hVar);
    }

    long a(long j, o3i0 o3i0Var);

    default List c(ArrayList arrayList) {
        return Collections.EMPTY_LIST;
    }

    void discardBuffer(long j, boolean z);

    void e(a aVar, long j);

    qfp0 getTrackGroups();

    long h(d7q[] d7qVarArr, boolean[] zArr, m0h0[] m0h0VarArr, boolean[] zArr2, long j);

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    long seekToUs(long j);
}
