package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class l8e extends yaa {
    public final /* synthetic */ int h;
    public final String i;
    public final boolean j;

    public l8e(int i, String str, boolean z) {
        this.h = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(str, "name == null");
                this.i = str;
                this.j = z;
                break;
            case 2:
                Objects.requireNonNull(str, "name == null");
                this.i = str;
                this.j = z;
                break;
            default:
                Objects.requireNonNull(str, "name == null");
                this.i = str;
                this.j = z;
                break;
        }
    }

    @Override // defpackage.yaa
    public final void m(b0g b0gVar, Object obj) {
        String obj2;
        String obj3;
        String obj4;
        int i = this.h;
        boolean z = this.j;
        String str = this.i;
        switch (i) {
            case 0:
                if (obj != null && (obj2 = obj.toString()) != null) {
                    b0gVar.a(str, obj2, z);
                    break;
                }
                break;
            case 1:
                if (obj != null && (obj3 = obj.toString()) != null) {
                    b0gVar.b(str, obj3, z);
                    break;
                }
                break;
            default:
                if (obj != null && (obj4 = obj.toString()) != null) {
                    b0gVar.d(str, obj4, z);
                    break;
                }
                break;
        }
    }
}
