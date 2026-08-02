package com.google.mlkit.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import xsna.a201;
import xsna.a330;
import xsna.atr;
import xsna.cdn;
import xsna.dm10;
import xsna.gzl;
import xsna.i8i;
import xsna.jc01;
import xsna.kvf;
import xsna.m3q;
import xsna.oa01;
import xsna.oaj0;
import xsna.qhc;
import xsna.qt20;
import xsna.qvf0;
import xsna.rt20;
import xsna.tby;
import xsna.v801;
import xsna.z4g;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public final List getComponents() {
        i8i<?> i8iVar = oaj0.b;
        i8i.a a = i8i.a(a330.class);
        a.a(gzl.b(qt20.class));
        a.f = atr.d;
        i8i b = a.b();
        i8i.a a2 = i8i.a(rt20.class);
        a2.f = a201.b;
        i8i b2 = a2.b();
        i8i.a a3 = i8i.a(qvf0.class);
        a3.a(new gzl(2, 0, qvf0.a.class));
        a3.f = tby.b;
        i8i b3 = a3.b();
        i8i.a a4 = i8i.a(m3q.class);
        a4.a(new gzl(1, 1, rt20.class));
        a4.f = z4g.f;
        i8i b4 = a4.b();
        i8i.a a5 = i8i.a(qhc.class);
        a5.f = v801.b;
        i8i b5 = a5.b();
        i8i.a a6 = i8i.a(kvf.class);
        a6.a(gzl.b(qhc.class));
        a6.f = oa01.b;
        i8i b6 = a6.b();
        i8i.a a7 = i8i.a(jc01.class);
        a7.a(gzl.b(qt20.class));
        a7.f = cdn.c;
        i8i b7 = a7.b();
        i8i.a a8 = i8i.a(qvf0.a.class);
        a8.e = 1;
        a8.a(new gzl(1, 1, jc01.class));
        a8.f = dm10.b;
        return zzar.zzi(i8iVar, b, b2, b3, b4, b5, b6, b7, a8.b());
    }
}
