package kotlin.reflect.jvm.internal;

import defpackage.xka;
import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0006\b\u0002\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Member;", "D", "E", "V", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KProperty2Impl$delegateSource$1 extends xka implements Function0<Member> {
    final /* synthetic */ KProperty2Impl<D, E, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KProperty2Impl$delegateSource$1(KProperty2Impl<D, E, ? extends V> kProperty2Impl) {
        super(0);
        this.this$0 = kProperty2Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Member invoke() {
        return this.this$0.computeDelegateSource();
    }
}
