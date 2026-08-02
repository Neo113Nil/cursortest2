package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ce8 {
    public static final ce8 b = new ce8();
    public static final ce8 c = new ce8();
    public static final ce8 d = new ce8();
    public final i1d a = new i1d(new ee8[16], 0);

    /* JADX WARN: Code restructure failed: missing block: B:70:0x004b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(ce8 ce8Var) {
        ce8Var.getClass();
        if (ce8Var == b) {
            a70.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (ce8Var == c) {
            a70.r("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        i1d i1dVar = ce8Var.a;
        int i = i1dVar.c;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = i1dVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            xv4 xv4Var = (ee8) objArr[i2];
            if (!((wtc) xv4Var).a.n) {
                r3a.b("visitChildren called on an unattached node");
            }
            i1d i1dVar2 = new i1d(new wtc[16], 0);
            wtc wtcVar = ((wtc) xv4Var).a;
            wtc wtcVar2 = wtcVar.f;
            if (wtcVar2 == null) {
                c6o.x(i1dVar2, wtcVar);
            } else {
                i1dVar2.b(wtcVar2);
            }
            while (true) {
                int i3 = i1dVar2.c;
                if (i3 != 0) {
                    wtc wtcVar3 = (wtc) i1dVar2.r(i3 - 1);
                    if ((wtcVar3.d & 1024) == 0) {
                        c6o.x(i1dVar2, wtcVar3);
                    } else {
                        while (true) {
                            if (wtcVar3 == null) {
                                break;
                            }
                            if ((wtcVar3.c & 1024) != 0) {
                                i1d i1dVar3 = null;
                                while (wtcVar3 != null) {
                                    if (wtcVar3 instanceof ne8) {
                                        if (((ne8) wtcVar3).r1(7)) {
                                            break;
                                        }
                                    } else if ((wtcVar3.c & 1024) != 0 && (wtcVar3 instanceof bw4)) {
                                        int i4 = 0;
                                        for (wtc wtcVar4 = ((bw4) wtcVar3).p; wtcVar4 != null; wtcVar4 = wtcVar4.f) {
                                            if ((wtcVar4.c & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    wtcVar3 = wtcVar4;
                                                } else {
                                                    if (i1dVar3 == null) {
                                                        i1dVar3 = new i1d(new wtc[16], 0);
                                                    }
                                                    if (wtcVar3 != null) {
                                                        i1dVar3.b(wtcVar3);
                                                        wtcVar3 = null;
                                                    }
                                                    i1dVar3.b(wtcVar4);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    wtcVar3 = c6o.X(i1dVar3);
                                }
                            } else {
                                wtcVar3 = wtcVar3.f;
                            }
                        }
                    }
                }
            }
        }
    }
}
