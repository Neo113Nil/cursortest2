package i1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;

/* renamed from: i1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6992l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f65687a;

    /* JADX WARN: Multi-variable type inference failed */
    public C6992l(@NotNull Function1<? super InterfaceC8410c, Unit> function1) {
        this.f65687a = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<n1.c, kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function1<InterfaceC8410c, Unit> a() {
        return this.f65687a;
    }
}
