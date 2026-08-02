package fe;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9836b;
import td.InterfaceC9839e;

/* renamed from: fe.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6543w {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC6543w f63262a = new a();

    /* renamed from: fe.w$a */
    static class a implements InterfaceC6543w {
        private static /* synthetic */ void c(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i11 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // fe.InterfaceC6543w
        public final void a(@NotNull InterfaceC9839e interfaceC9839e, @NotNull ArrayList arrayList) {
            if (interfaceC9839e != null) {
                return;
            }
            c(0);
            throw null;
        }

        @Override // fe.InterfaceC6543w
        public final void b(@NotNull InterfaceC9836b interfaceC9836b) {
            if (interfaceC9836b != null) {
                return;
            }
            c(2);
            throw null;
        }
    }

    void a(@NotNull InterfaceC9839e interfaceC9839e, @NotNull ArrayList arrayList);

    void b(@NotNull InterfaceC9836b interfaceC9836b);
}
