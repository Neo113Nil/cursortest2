package j1;

import D1.AbstractC2813m;
import D1.C2809k;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final r f68738b = new r();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final r f68739c = new r();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0.b<t> f68740a = new U0.b<>(new t[16]);

    /* JADX WARN: Code restructure failed: missing block: B:81:0x004b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(@NotNull Function1<? super FocusTargetNode, Boolean> function1) {
        if (this == f68738b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f68739c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        U0.b<t> bVar = this.f68740a;
        if (!bVar.p()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int m11 = bVar.m();
        if (m11 <= 0) {
            return false;
        }
        t[] l11 = bVar.l();
        int i11 = 0;
        boolean z11 = false;
        do {
            t tVar = l11[i11];
            if (!tVar.getNode().isAttached()) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            U0.b bVar2 = new U0.b(new e.c[16]);
            e.c child$ui_release = tVar.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                C2809k.a(bVar2, tVar.getNode());
            } else {
                bVar2.b(child$ui_release);
            }
            while (true) {
                if (!bVar2.p()) {
                    break;
                }
                e.c cVar = (e.c) Pk0.b.b(1, bVar2);
                if ((cVar.getAggregateChildKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                    C2809k.a(bVar2, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        }
                        if ((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            U0.b bVar3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                                    if (focusTargetNode.N1().c() ? function1.invoke(focusTargetNode).booleanValue() : androidx.compose.ui.focus.n.f(focusTargetNode, 7, function1)) {
                                        z11 = true;
                                        break;
                                    }
                                } else if (((cVar.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) && (cVar instanceof AbstractC2813m)) {
                                    int i12 = 0;
                                    for (e.c J12 = ((AbstractC2813m) cVar).J1(); J12 != null; J12 = J12.getChild$ui_release()) {
                                        if ((J12.getKindSet$ui_release() & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                cVar = J12;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new U0.b(new e.c[16]);
                                                }
                                                if (cVar != null) {
                                                    bVar3.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar3.b(J12);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                cVar = C2809k.b(bVar3);
                            }
                        } else {
                            cVar = cVar.getChild$ui_release();
                        }
                    }
                }
            }
            i11++;
        } while (i11 < m11);
        return z11;
    }

    public final void d() {
        c(q.f68737b);
    }

    public final void e() {
        U0.b<t> bVar = this.f68740a;
        if (!bVar.p()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        int m11 = bVar.m();
        if (m11 > 0) {
            t[] l11 = bVar.l();
            int i11 = 0;
            while (!u.a(l11[i11]) && (i11 = i11 + 1) < m11) {
            }
        }
    }

    @NotNull
    public final U0.b<t> f() {
        return this.f68740a;
    }
}
