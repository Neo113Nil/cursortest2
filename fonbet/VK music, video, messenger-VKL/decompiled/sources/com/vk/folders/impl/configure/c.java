package com.vk.folders.impl.configure;

import android.os.Bundle;
import com.vk.dto.common.Source;
import com.vk.folders.impl.configure.a;
import com.vk.folders.impl.configure.d;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.w;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1w;
import xsna.asu0;
import xsna.ayr;
import xsna.b1s;
import xsna.b25;
import xsna.bpn0;
import xsna.cvk;
import xsna.d0s;
import xsna.drz;
import xsna.dyr;
import xsna.edi;
import xsna.esz;
import xsna.gzr;
import xsna.htm;
import xsna.itm;
import xsna.jb;
import xsna.kyr;
import xsna.m0s;
import xsna.mjx0;
import xsna.ozf;
import xsna.pce;
import xsna.psz;
import xsna.s101;
import xsna.trf;
import xsna.u4;
import xsna.xrm;
import xsna.yj50;
import xsna.z0s;
import xsna.zq70;
import xsna.zrz;

/* compiled from: FolderConfigurationComponent.kt */
/* loaded from: classes18.dex */
public final class c extends yj50<d, ayr, g, h, i, e, f> {
    public final FolderConfigurationFragment n;
    public final a o;
    public final a1w p;
    public final b25 q;
    public final q<Boolean> r;
    public final bpn0 s;
    public final bpn0 t;

    public c(FolderConfigurationFragment folderConfigurationFragment, a aVar, a1w a1wVar, b25 b25Var, io.reactivex.rxjava3.subjects.f fVar) {
        super(folderConfigurationFragment, folderConfigurationFragment, g.class, false);
        this.n = folderConfigurationFragment;
        this.o = aVar;
        this.p = a1wVar;
        this.q = b25Var;
        this.r = fVar;
        this.s = new bpn0(new trf(this, 24));
        this.t = new bpn0(new pce(this, 24));
    }

    @Override // xsna.yj50
    public final d a(Bundle bundle) {
        bpn0 bpn0Var;
        drz kyrVar;
        bpn0 bpn0Var2 = this.t;
        String str = (String) bpn0Var2.getValue();
        a1w a1wVar = this.p;
        b1s t = zq70.t(this, str, a1wVar);
        a aVar = this.o;
        if (aVar instanceof a.C1068a) {
            bpn0Var = bpn0Var2;
            kyrVar = new psz(new xrm(null, null, null, null, 15));
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = ((a.b) aVar).a;
            a1wVar.a.getClass();
            esz.a.getClass();
            esz.a.C2836a c2836a = esz.a.b;
            gzr gzrVar = new gzr(a1wVar, i, Source.ACTUAL);
            cvk cvkVar = new cvk();
            gzr gzrVar2 = new gzr(a1wVar, i, Source.NETWORK);
            cvk cvkVar2 = new cvk();
            u4 u4Var = new u4(4);
            mjx0 mjx0Var = new mjx0(t.c);
            jb jbVar = new jb(15);
            asu0.a.getClass();
            bpn0Var = bpn0Var2;
            kyrVar = new kyr(i, new zrz(gzrVar, cvkVar, gzrVar2, cvkVar2, u4Var, mjx0Var, jbVar, asu0.i(), (w) asu0.o0.getValue(), 30, new edi(15), new s101(), c2836a, false), new d0s(a1wVar, t.c));
        }
        return new d(this.o, new m0s(a1wVar), kyrVar, new z0s(a1wVar, t), (htm) e(itm.class, (String) bpn0Var.getValue(), new ozf(a1wVar, 26)), new d0s(a1wVar, t.c), t.c, a1wVar.r().h, new d.b((dyr) this.s.getValue(), this.r));
    }

    @Override // xsna.yj50
    public final f b() {
        return new f(this.n);
    }

    @Override // xsna.yj50
    public final h d() {
        return new h(this.o instanceof a.C1068a);
    }
}
