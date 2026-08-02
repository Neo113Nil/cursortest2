package x0;

import b1.InterfaceC5512o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x0.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10594X extends AbstractC7737t implements Function0<C10586O> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC5512o f104706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10594X(InterfaceC5512o interfaceC5512o) {
        super(0);
        this.f104706b = interfaceC5512o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C10586O invoke() {
        return new C10586O(this.f104706b, kotlin.collections.U.c());
    }
}
