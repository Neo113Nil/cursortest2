package zi;

import S0.InterfaceC3974n0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3974n0 f109189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(InterfaceC3974n0 interfaceC3974n0) {
        super(0);
        this.f109189b = interfaceC3974n0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        long n11 = this.f109189b.n() / 1000;
        long j11 = 60;
        String format = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(n11 / j11), Long.valueOf(n11 % j11)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
