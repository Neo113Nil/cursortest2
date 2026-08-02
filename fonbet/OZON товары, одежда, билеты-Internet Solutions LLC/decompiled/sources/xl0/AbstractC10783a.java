package xl0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wl0.c;

/* renamed from: xl0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC10783a {

    /* renamed from: xl0.a$a, reason: collision with other inner class name */
    public static final class C2285a extends AbstractC10783a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2285a f105619a = new C2285a(0);
    }

    /* renamed from: xl0.a$b */
    public static final class b extends AbstractC10783a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f105620a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull c cause) {
            super(0);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.f105620a = cause;
        }

        @NotNull
        public final c a() {
            return this.f105620a;
        }
    }

    public /* synthetic */ AbstractC10783a(int i11) {
        this();
    }

    private AbstractC10783a() {
    }
}
