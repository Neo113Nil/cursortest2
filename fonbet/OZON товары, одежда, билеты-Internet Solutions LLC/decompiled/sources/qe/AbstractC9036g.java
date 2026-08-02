package qe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qe.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9036g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f81951a;

    /* renamed from: qe.g$a */
    public static final class a extends AbstractC9036g {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f81952b = new a(false);
    }

    /* renamed from: qe.g$b */
    public static final class b extends AbstractC9036g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String error) {
            super(false);
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    /* renamed from: qe.g$c */
    public static final class c extends AbstractC9036g {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f81953b = new c(true);
    }

    public AbstractC9036g(boolean z11) {
        this.f81951a = z11;
    }

    public final boolean a() {
        return this.f81951a;
    }
}
