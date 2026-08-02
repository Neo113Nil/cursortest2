package mi0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: mi0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8332b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC8333c f75991a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Mj0.i f75992b;

    /* renamed from: mi0.b$a */
    static final class a extends AbstractC7737t implements Function1<Boolean, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            C8332b.this.f75992b.a(bool.booleanValue());
            return Unit.f71690a;
        }
    }

    public C8332b(@NotNull InterfaceC8333c debuggableStorage, @NotNull Mj0.i trackerLogger) {
        Intrinsics.checkNotNullParameter(debuggableStorage, "debuggableStorage");
        Intrinsics.checkNotNullParameter(trackerLogger, "trackerLogger");
        this.f75991a = debuggableStorage;
        this.f75992b = trackerLogger;
    }

    public final void b() {
        this.f75991a.a(new a());
    }
}
