package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v3h {
    public final wma a;
    public final pm5 b;
    public final p6a c;
    public final l0d d = new l0d(2);

    public v3h(wma wmaVar, pm5 pm5Var, uzc uzcVar) {
        this.a = wmaVar;
        this.b = pm5Var;
        this.c = uzcVar;
    }

    public final s3h a() {
        return new s3h(this.b, false, this.a, new l3h());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(wma wmaVar, l3h l3hVar) {
        String str;
        String str2;
        vjj vjjVar;
        vjj vjjVar2;
        r00 r00Var;
        r00 r00Var2;
        boolean z;
        boolean z2;
        l0d l0dVar = this.d;
        Object[] objArr = l0dVar.a;
        int i = l0dVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            tx txVar = (tx) objArr[i2];
            cqa cqaVar = txVar.a;
            AutofillManager autofillManager = (AutofillManager) cqaVar.a;
            xy xyVar = txVar.c;
            l3h x = wmaVar.x();
            int i3 = wmaVar.b;
            if (l3hVar != null) {
                Object g = l3hVar.a.g(w3h.F);
                if (g == null) {
                    g = null;
                }
                q80 q80Var = (q80) g;
                if (q80Var != null) {
                    str = q80Var.b;
                    if (x != null) {
                        Object g2 = x.a.g(w3h.F);
                        if (g2 == null) {
                            g2 = null;
                        }
                        q80 q80Var2 = (q80) g2;
                        if (q80Var2 != null) {
                            str2 = q80Var2.b;
                            if (str != str2) {
                                if (str == null) {
                                    cqaVar.E(xyVar, i3, true);
                                } else if (str2 == null) {
                                    cqaVar.E(xyVar, i3, false);
                                } else if (Intrinsics.c((uz) qea.v(x, w3h.s), uxf.r)) {
                                    if (str2.length() >= 5000) {
                                        str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? iii.H(4999, str2) : iii.H(5000, str2);
                                    }
                                    autofillManager.notifyValueChanged(xyVar, i3, AutofillValue.forText(str2));
                                }
                            }
                            if (l3hVar != null) {
                                Object g3 = l3hVar.a.g(w3h.L);
                                if (g3 == null) {
                                    g3 = null;
                                }
                                vjjVar = (vjj) g3;
                            } else {
                                vjjVar = null;
                            }
                            if (x != null) {
                                Object g4 = x.a.g(w3h.L);
                                if (g4 == null) {
                                    g4 = null;
                                }
                                vjjVar2 = (vjj) g4;
                            } else {
                                vjjVar2 = null;
                            }
                            if (vjjVar != vjjVar2) {
                                if (vjjVar == null) {
                                    cqaVar.E(xyVar, i3, true);
                                } else if (vjjVar2 == null) {
                                    cqaVar.E(xyVar, i3, false);
                                } else if (Intrinsics.c((uz) qea.v(x, w3h.s), uxf.s)) {
                                    int ordinal = vjjVar2.ordinal();
                                    Boolean bool = ordinal != 0 ? ordinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                                    if (bool != null) {
                                        autofillManager.notifyValueChanged(xyVar, i3, AutofillValue.forToggle(bool.booleanValue()));
                                    }
                                }
                            }
                            if (l3hVar != null) {
                                Object g5 = l3hVar.a.g(w3h.t);
                                if (g5 == null) {
                                    g5 = null;
                                }
                                r00Var = (r00) g5;
                            } else {
                                r00Var = null;
                            }
                            if (x != null) {
                                Object g6 = x.a.g(w3h.t);
                                if (g6 == null) {
                                    g6 = null;
                                }
                                r00Var2 = (r00) g6;
                            } else {
                                r00Var2 = null;
                            }
                            if (!Intrinsics.c(r00Var, r00Var2)) {
                                if (r00Var == null) {
                                    cqaVar.E(xyVar, i3, true);
                                } else if (r00Var2 == null) {
                                    cqaVar.E(xyVar, i3, false);
                                } else {
                                    autofillManager.notifyValueChanged(xyVar, i3, r00Var2.a);
                                }
                            }
                            z = l3hVar == null && l3hVar.a.b(w3h.r);
                            z2 = x == null && x.a.b(w3h.r);
                            if (z != z2) {
                                vzc vzcVar = txVar.h;
                                if (z2) {
                                    vzcVar.a(i3);
                                } else {
                                    vzcVar.f(i3);
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (str != str2) {
                    }
                    if (l3hVar != null) {
                    }
                    if (x != null) {
                    }
                    if (vjjVar != vjjVar2) {
                    }
                    if (l3hVar != null) {
                    }
                    if (x != null) {
                    }
                    if (!Intrinsics.c(r00Var, r00Var2)) {
                    }
                    if (l3hVar == null) {
                    }
                    if (x == null) {
                    }
                    if (z != z2) {
                    }
                }
            }
            str = null;
            if (x != null) {
            }
            str2 = null;
            if (str != str2) {
            }
            if (l3hVar != null) {
            }
            if (x != null) {
            }
            if (vjjVar != vjjVar2) {
            }
            if (l3hVar != null) {
            }
            if (x != null) {
            }
            if (!Intrinsics.c(r00Var, r00Var2)) {
            }
            if (l3hVar == null) {
            }
            if (x == null) {
            }
            if (z != z2) {
            }
        }
    }
}
