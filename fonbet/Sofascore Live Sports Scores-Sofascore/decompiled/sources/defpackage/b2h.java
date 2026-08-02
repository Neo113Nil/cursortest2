package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b2h {
    public final /* synthetic */ int a;
    public final List b;
    public final usj[] c;

    public b2h(List list, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.c = new usj[list.size()];
                break;
            default:
                this.b = list;
                this.c = new usj[list.size()];
                break;
        }
    }

    public void a(long j, nkk nkkVar) {
        if (nkkVar.c() < 9) {
            return;
        }
        int f = nkkVar.f();
        int f2 = nkkVar.f();
        int s = nkkVar.s();
        if (f == 434 && f2 == 1195456820 && s == 3) {
            zm2.r(j, nkkVar, this.c);
        }
    }

    public final void b(ol6 ol6Var, c2k c2kVar) {
        int i = this.a;
        List list = this.b;
        usj[] usjVarArr = this.c;
        switch (i) {
            case 0:
                for (int i2 = 0; i2 < usjVarArr.length; i2++) {
                    c2kVar.a();
                    c2kVar.b();
                    usj track = ol6Var.track(c2kVar.e, 3);
                    sm8 sm8Var = (sm8) list.get(i2);
                    String str = sm8Var.l;
                    qx9.q("Invalid closed caption mime type provided: " + str, MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str));
                    String str2 = sm8Var.a;
                    if (str2 == null) {
                        c2kVar.b();
                        str2 = c2kVar.f;
                    }
                    pm8 pm8Var = new pm8();
                    pm8Var.a = str2;
                    pm8Var.k = str;
                    pm8Var.d = sm8Var.d;
                    pm8Var.c = sm8Var.c;
                    pm8Var.C = sm8Var.D;
                    pm8Var.m = sm8Var.n;
                    track.a(new sm8(pm8Var));
                    usjVarArr[i2] = track;
                }
                break;
            default:
                for (int i3 = 0; i3 < usjVarArr.length; i3++) {
                    c2kVar.a();
                    c2kVar.b();
                    usj track2 = ol6Var.track(c2kVar.e, 3);
                    sm8 sm8Var2 = (sm8) list.get(i3);
                    String str3 = sm8Var2.l;
                    qx9.q("Invalid closed caption mime type provided: " + str3, MimeTypes.APPLICATION_CEA608.equals(str3) || MimeTypes.APPLICATION_CEA708.equals(str3));
                    pm8 pm8Var2 = new pm8();
                    c2kVar.b();
                    pm8Var2.a = c2kVar.f;
                    pm8Var2.k = str3;
                    pm8Var2.d = sm8Var2.d;
                    pm8Var2.c = sm8Var2.c;
                    pm8Var2.C = sm8Var2.D;
                    pm8Var2.m = sm8Var2.n;
                    track2.a(new sm8(pm8Var2));
                    usjVarArr[i3] = track2;
                }
                break;
        }
    }
}
