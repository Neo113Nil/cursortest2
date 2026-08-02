package androidx.media3.transformer;

import androidx.media3.transformer.f;
import androidx.media3.transformer.m;
import androidx.media3.transformer.n;
import com.google.common.collect.ImmutableList;
import xsna.fxc0;
import xsna.kr10;
import xsna.v9p;

/* compiled from: TransmuxTranscodeHelper.java */
/* loaded from: classes12.dex */
public final class d0 {
    public static f a(f fVar, long j, long j2, long j3, boolean z, boolean z2) {
        m mVar = (m) fVar.a.get(0).a.get(0);
        kr10.b.a aVar = new kr10.b.a();
        fxc0.p(j >= 0);
        aVar.a = j;
        fxc0.p(j2 == Long.MIN_VALUE || j2 >= 0);
        aVar.b = j2;
        aVar.c = z;
        kr10.b bVar = new kr10.b(aVar);
        kr10 kr10Var = mVar.a;
        v9p v9pVar = mVar.f;
        kr10.a a = kr10Var.a();
        a.d = bVar.a();
        kr10 a2 = a.a();
        if (z2) {
            v9pVar = new v9p(v9pVar.a, com.google.common.collect.g.f);
        }
        m.a a3 = mVar.a();
        a3.a = a2;
        fxc0.p(j3 > 0);
        a3.d = j3;
        a3.f = v9pVar;
        m mVar2 = new m(a3);
        f.a a4 = fVar.a();
        a4.b(ImmutableList.p(new n(new n.a(mVar2))));
        return a4.a();
    }
}
