package m0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {239, 278}, m = "animate")
/* renamed from: m0.u0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8018u0<T, V extends AbstractC8015t> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C8006o f73868d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC7992h f73869e;

    /* renamed from: f, reason: collision with root package name */
    Function1 f73870f;

    /* renamed from: g, reason: collision with root package name */
    kotlin.jvm.internal.M f73871g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f73872h;

    /* renamed from: i, reason: collision with root package name */
    int f73873i;

    C8018u0(kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f73872h = obj;
        this.f73873i |= LinearLayoutManager.INVALID_OFFSET;
        return B0.c(null, null, 0L, null, this);
    }
}
