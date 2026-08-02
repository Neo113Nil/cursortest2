package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j60 implements k1c {
    public final r60 a;

    public j60(r60 r60Var) {
        this.a = r60Var;
    }

    @Override // defpackage.k1c
    public final int a(l9a l9aVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((g1c) list.get(0)).G(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((g1c) list.get(i2)).G(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j) {
        qhe qheVar;
        int i;
        qhe qheVar2;
        int i2;
        int i3;
        int size = list.size();
        qhe[] qheVarArr = new qhe[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            qheVar = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            g1c g1cVar = (g1c) list.get(i4);
            Object h = g1cVar.h();
            l60 l60Var = h instanceof l60 ? (l60) h : null;
            if (l60Var != null && ((Boolean) ((eoh) l60Var.a).getValue()).booleanValue()) {
                qhe J = g1cVar.J(j);
                Unit unit = Unit.a;
                qheVarArr[i4] = J;
                j2 = (J.b & 4294967295L) | (J.a << 32);
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            g1c g1cVar2 = (g1c) list.get(i5);
            if (qheVarArr[i5] == null) {
                qheVarArr[i5] = g1cVar2.J(j);
            }
        }
        if (m1cVar.W()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                qheVar2 = null;
            } else {
                qheVar2 = qheVarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = qheVar2 != null ? qheVar2.a : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            qhe qheVar3 = qheVarArr[i8];
                            int i9 = qheVar3 != null ? qheVar3.a : 0;
                            if (i7 < i9) {
                                qheVar2 = qheVar3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = qheVar2 != null ? qheVar2.a : 0;
        }
        if (m1cVar.W()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                qheVar = qheVarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = qheVar != null ? qheVar.b : 0;
                    if (1 <= i10) {
                        while (true) {
                            qhe qheVar4 = qheVarArr[i];
                            int i12 = qheVar4 != null ? qheVar4.b : 0;
                            if (i11 < i12) {
                                qheVar = qheVar4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = qheVar != null ? qheVar.b : 0;
        }
        if (!m1cVar.W()) {
            ((eoh) this.a.d).setValue(new c7a((i2 << 32) | (i3 & 4294967295L)));
        }
        return m1c.G0(m1cVar, i2, i3, new i60(qheVarArr, this, i2, i3));
    }

    @Override // defpackage.k1c
    public final int h(l9a l9aVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((g1c) list.get(0)).B(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((g1c) list.get(i2)).B(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.k1c
    public final int i(l9a l9aVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((g1c) list.get(0)).b(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((g1c) list.get(i2)).b(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.k1c
    public final int j(l9a l9aVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((g1c) list.get(0)).s(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((g1c) list.get(i2)).s(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
