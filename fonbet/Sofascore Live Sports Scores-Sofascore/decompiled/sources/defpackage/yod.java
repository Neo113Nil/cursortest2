package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yod implements ptc {
    public static volatile jod c;
    public final /* synthetic */ int a;
    public final Object b;

    public yod(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new a99(20);
                return;
            case 2:
                this.b = new cqa(6);
                return;
            default:
                if (c == null) {
                    synchronized (yod.class) {
                        try {
                            if (c == null) {
                                c = new jod();
                            }
                        } finally {
                        }
                    }
                }
                this.b = c;
                return;
        }
    }

    @Override // defpackage.ptc
    public final otc a(l2a l2aVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new r92((yg2) obj, 3);
            case 1:
                return new r92((a99) obj, 1);
            default:
                return new xi9((cqa) obj);
        }
    }
}
