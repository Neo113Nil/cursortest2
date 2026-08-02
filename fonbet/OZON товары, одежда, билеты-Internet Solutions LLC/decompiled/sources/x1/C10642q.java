package x1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x1.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10642q extends AbstractC7737t implements Function1<r, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<r> f104899b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10642q(kotlin.jvm.internal.M<r> m11) {
        super(1);
        this.f104899b = m11;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, x1.r] */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(r rVar) {
        r rVar2 = rVar;
        kotlin.jvm.internal.M<r> m11 = this.f104899b;
        if (m11.f71787a == null && rVar2.f104902c) {
            m11.f71787a = rVar2;
        } else if (m11.f71787a != null) {
            rVar2.getClass();
        }
        return Boolean.TRUE;
    }
}
