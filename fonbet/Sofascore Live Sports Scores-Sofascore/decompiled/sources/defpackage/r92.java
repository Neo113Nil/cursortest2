package defpackage;

import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r92 implements otc {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r92(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.otc
    public final ntc a(Object obj, int i, int i2, uvd uvdVar) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new ntc(new wjd(bArr), new udc(1, bArr, (q92) obj2));
            case 1:
                return new ntc(new wjd(obj), new udc(obj.toString(), (a99) obj2));
            case 2:
                File file = (File) obj;
                return new ntc(new wjd(file), new f18(file, (g18) obj2, 0));
            default:
                qz8 qz8Var = (qz8) obj;
                return new ntc(qz8Var, new wod((yg2) obj2, qz8Var));
        }
    }

    @Override // defpackage.otc
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return true;
    }
}
