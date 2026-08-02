package defpackage;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class nu9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ nu9(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        switch (i) {
            case 0:
                l9j l9jVar = (l9j) obj;
                if (i3 < 0 || i2 < 0) {
                    u3a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i2 + " respectively.");
                }
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 < i3) {
                        int i7 = i6 + 1;
                        long j = l9jVar.e;
                        mo2 mo2Var = l9jVar.c;
                        int g = pej.g(j);
                        long j2 = l9jVar.e;
                        if (g > i7) {
                            i6 = (Character.isHighSurrogate(mo2Var.charAt((pej.g(j2) - i7) - 1)) && Character.isLowSurrogate(mo2Var.charAt(pej.g(l9jVar.e) - i7))) ? i6 + 2 : i7;
                            i5++;
                        } else {
                            i6 = pej.g(j2);
                        }
                    }
                }
                int i8 = 0;
                while (true) {
                    if (i4 < i2) {
                        int i9 = i8 + 1;
                        long j3 = l9jVar.e;
                        mo2 mo2Var2 = l9jVar.c;
                        if (pej.f(j3) + i9 < mo2Var2.length()) {
                            i8 = (Character.isHighSurrogate(mo2Var2.charAt((pej.f(l9jVar.e) + i9) - 1)) && Character.isLowSurrogate(mo2Var2.charAt(pej.f(l9jVar.e) + i9))) ? i8 + 2 : i9;
                            i4++;
                        } else {
                            i8 = mo2Var2.length() - pej.f(l9jVar.e);
                        }
                    }
                }
                yqo.E(l9jVar, pej.f(l9jVar.e), pej.f(l9jVar.e) + i8);
                yqo.E(l9jVar, pej.g(l9jVar.e) - i6, pej.g(l9jVar.e));
                return Unit.a;
            case 1:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("UPDATE pinned_tournaments_table SET orderIndex = ? WHERE id = ?");
                try {
                    V0.q(1, i3);
                    V0.q(2, i2);
                    V0.U0();
                    V0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putInt("count_for_update_version_" + i3, i2 + 1);
                return Unit.a;
        }
    }
}
