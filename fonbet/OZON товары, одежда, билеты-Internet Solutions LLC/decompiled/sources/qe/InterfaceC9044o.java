package qe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9845k;
import td.InterfaceC9849o;

/* renamed from: qe.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC9044o {

    /* renamed from: qe.o$a */
    public static final class a implements InterfaceC9044o {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f81967a = new a();

        @Override // qe.InterfaceC9044o
        public final void a(@NotNull InterfaceC9849o what, @NotNull InterfaceC9845k from) {
            Intrinsics.checkNotNullParameter(what, "what");
            Intrinsics.checkNotNullParameter(from, "from");
        }
    }

    void a(@NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k);
}
