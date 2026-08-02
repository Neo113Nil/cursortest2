package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l0.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7762f extends AbstractC7737t implements Function1<Object, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f72085b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7762f(Object obj) {
        super(1);
        this.f72085b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(Intrinsics.d(obj, this.f72085b));
    }
}
