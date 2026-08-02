package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ud2 implements sd2 {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sd2
    public final boolean a(umg umgVar) {
        switch (this.a) {
            case 0:
                if ((umgVar instanceof smg) && ((smg) umgVar).a().size() != 0) {
                    break;
                }
                break;
            case 1:
                if (umgVar.b != null) {
                    break;
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
