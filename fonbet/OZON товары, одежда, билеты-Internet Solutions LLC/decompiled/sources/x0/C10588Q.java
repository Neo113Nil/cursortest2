package x0;

import b1.InterfaceC5512o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10588Q extends AbstractC7737t implements Function1<Map<String, ? extends List<? extends Object>>, C10586O> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC5512o f104694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10588Q(InterfaceC5512o interfaceC5512o) {
        super(1);
        this.f104694b = interfaceC5512o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C10586O invoke(Map<String, ? extends List<? extends Object>> map) {
        return new C10586O(this.f104694b, map);
    }
}
