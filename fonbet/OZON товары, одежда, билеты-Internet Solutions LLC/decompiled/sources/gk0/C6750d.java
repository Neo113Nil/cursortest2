package gk0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gk0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6750d extends AbstractC7737t implements Function1<s, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f64504b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6750d(String str) {
        super(1);
        this.f64504b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(s sVar) {
        s poolItem = sVar;
        Intrinsics.checkNotNullParameter(poolItem, "poolItem");
        return Boolean.valueOf(Intrinsics.d(poolItem.a(), this.f64504b));
    }
}
