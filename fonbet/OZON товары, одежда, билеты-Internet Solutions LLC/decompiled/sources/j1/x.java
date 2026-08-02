package j1;

import androidx.collection.L;
import androidx.collection.W;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L<FocusTargetNode, w> f68743a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U0.b<Function0<Unit>> f68744b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f68745c;

    public x() {
        long[] jArr = W.f38661a;
        this.f68743a = new L<>((Object) null);
        this.f68744b = new U0.b<>(new Function0[16]);
    }

    public static final void a(x xVar) {
        xVar.f68745c = true;
    }

    public static final void b(x xVar) {
        xVar.f68743a.c();
        int i11 = 0;
        xVar.f68745c = false;
        U0.b<Function0<Unit>> bVar = xVar.f68744b;
        int m11 = bVar.m();
        if (m11 > 0) {
            Function0<Unit>[] l11 = bVar.l();
            do {
                l11[i11].invoke();
                i11++;
            } while (i11 < m11);
        }
        bVar.h();
    }

    public static final void c(x xVar) {
        L<FocusTargetNode, w> l11 = xVar.f68743a;
        Object[] objArr = l11.f38657b;
        long[] jArr = l11.f38656a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            ((FocusTargetNode) objArr[(i11 << 3) + i13]).M1();
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        l11.c();
        xVar.f68745c = false;
        xVar.f68744b.h();
    }

    public final w f(@NotNull FocusTargetNode focusTargetNode) {
        return this.f68743a.b(focusTargetNode);
    }

    public final void g(@NotNull FocusTargetNode focusTargetNode, w wVar) {
        if (wVar != null) {
            this.f68743a.i(focusTargetNode, wVar);
        } else {
            A1.a.c("requires a non-null focus state");
            throw null;
        }
    }
}
