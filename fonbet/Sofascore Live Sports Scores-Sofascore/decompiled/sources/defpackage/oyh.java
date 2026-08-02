package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oyh extends pyh {
    public final /* synthetic */ int i;
    public final /* synthetic */ qyh j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oyh(qyh qyhVar, a02 a02Var, CharSequence charSequence, int i) {
        super(a02Var, charSequence);
        this.i = i;
        this.j = qyhVar;
    }

    @Override // defpackage.pyh
    public final int a(int i) {
        switch (this.i) {
            case 0:
                return i + 1;
            default:
                return ((ih2) this.j).b.length() + i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r8 = r8 + 1;
     */
    @Override // defpackage.pyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(int i) {
        int i2 = this.i;
        CharSequence charSequence = this.d;
        qyh qyhVar = this.j;
        switch (i2) {
            case 0:
                dp2 dp2Var = (dp2) ((yia) qyhVar).b;
                int length = charSequence.length();
                z1a.z(i, length);
                while (i < length) {
                    if (dp2Var.b(charSequence.charAt(i))) {
                        break;
                    } else {
                        i++;
                    }
                }
                break;
            default:
                String str = ((ih2) qyhVar).b;
                int length2 = str.length();
                int length3 = charSequence.length() - length2;
                while (i <= length3) {
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (charSequence.charAt(i3 + i) != str.charAt(i3)) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return i;
    }
}
