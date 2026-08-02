package p0;

import C1.i;
import C1.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8824b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m<AbstractC8823a> f80000a = new m<>(a.f80001b);

    /* renamed from: p0.b$a */
    static final class a extends AbstractC7737t implements Function0<AbstractC8823a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f80001b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ AbstractC8823a invoke() {
            return null;
        }
    }

    public static final AbstractC8823a a(@NotNull i iVar) {
        if (iVar.getNode().isAttached()) {
            return (AbstractC8823a) iVar.G(f80000a);
        }
        return null;
    }
}
