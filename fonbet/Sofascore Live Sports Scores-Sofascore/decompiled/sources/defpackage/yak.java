package defpackage;

import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yak implements otc {
    public static final yak b = new yak(0);
    public final /* synthetic */ int a;

    public /* synthetic */ yak(int i) {
        this.a = i;
    }

    @Override // defpackage.otc
    public final ntc a(Object obj, int i, int i2, uvd uvdVar) {
        switch (this.a) {
            case 0:
                return new ntc(new wjd(obj), new aa2(obj, 1));
            case 1:
                File file = (File) obj;
                return new ntc(new wjd(file), new aa2(file, 0));
            default:
                return null;
        }
    }

    @Override // defpackage.otc
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
