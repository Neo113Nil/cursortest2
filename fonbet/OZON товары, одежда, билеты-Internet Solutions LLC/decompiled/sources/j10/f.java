package j10;

import j10.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class f extends AbstractC7737t implements Function1<d.b.a, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final f f68794b = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(d.b.a aVar) {
        d.b.a it = aVar;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.a());
    }
}
