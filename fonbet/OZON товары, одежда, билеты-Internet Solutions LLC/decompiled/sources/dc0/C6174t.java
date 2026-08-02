package dc0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dc0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6174t extends AbstractC7737t implements Function1<C6179y, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f61582b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6174t(String str) {
        super(1);
        this.f61582b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C6179y c6179y) {
        String oldCookie = c6179y.b();
        Intrinsics.checkNotNullParameter(oldCookie, "oldCookie");
        return Boolean.valueOf(kotlin.text.h.e0(oldCookie, this.f61582b, false));
    }
}
