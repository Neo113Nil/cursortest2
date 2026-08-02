package defpackage;

import android.view.LayoutInflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vz0 implements uff {
    public final /* synthetic */ int a;
    public final uff b;
    public final uff c;
    public final uff d;

    public /* synthetic */ vz0(uff uffVar, uff uffVar2, uff uffVar3, int i) {
        this.a = i;
        this.b = uffVar;
        this.c = uffVar2;
        this.d = uffVar3;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        uff uffVar = this.d;
        uff uffVar2 = this.c;
        uff uffVar3 = this.b;
        switch (i) {
            case 0:
                return new uz0((mw9) uffVar3.get(), (LayoutInflater) uffVar2.get(), (lw9) uffVar.get());
            case 1:
                ck2 ck2Var = new ck2((mw9) uffVar3.get(), (LayoutInflater) uffVar2.get(), (lw9) uffVar.get());
                ck2Var.n = new jc0(ck2Var, 2);
                return ck2Var;
            case 2:
                msc mscVar = new msc((mw9) uffVar3.get(), (LayoutInflater) uffVar2.get(), (lw9) uffVar.get());
                mscVar.m = new jc0(mscVar, 5);
                return mscVar;
            default:
                return new qr9((mw9) uffVar3.get(), (LayoutInflater) uffVar2.get(), (lw9) ((m2a) uffVar).get());
        }
    }
}
