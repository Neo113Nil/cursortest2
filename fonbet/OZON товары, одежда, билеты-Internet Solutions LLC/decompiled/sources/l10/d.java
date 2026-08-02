package l10;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function1<C7854a, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f72303b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(String str) {
        super(1);
        this.f72303b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C7854a c7854a) {
        C7854a it = c7854a;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.d(it.c().c().h(), this.f72303b));
    }
}
