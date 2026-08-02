package i10;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f65735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(String str) {
        super(0);
        this.f65735b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return Nk.a.b("Parameter must be Parcelable or Serializable but was ", N.b(this.f65735b.getClass()).B());
    }
}
