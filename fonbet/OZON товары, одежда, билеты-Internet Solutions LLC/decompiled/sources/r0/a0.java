package r0;

import Sc.InterfaceC4003e;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {101, 147}, m = "animateToZero")
/* loaded from: classes8.dex */
final class a0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Z f82542d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC4003e f82543e;

    /* renamed from: f, reason: collision with root package name */
    Function0 f82544f;

    /* renamed from: g, reason: collision with root package name */
    float f82545g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f82546h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Z f82547i;

    /* renamed from: j, reason: collision with root package name */
    int f82548j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a0(Z z11, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f82547i = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82546h = obj;
        this.f82548j |= LinearLayoutManager.INVALID_OFFSET;
        return this.f82547i.g(null, null, this);
    }
}
