package kotlin.reflect.jvm.internal;

import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.calls.Caller;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0006\b\u0000\u0010\u0002 \u0001\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "V", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KPropertyImpl$Getter$caller$2 extends xka implements Function0<Caller<?>> {
    final /* synthetic */ KPropertyImpl.Getter<V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KPropertyImpl$Getter$caller$2(KPropertyImpl.Getter<? extends V> getter) {
        super(0);
        this.this$0 = getter;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Caller<?> invoke() {
        Caller<?> computeCallerForAccessor;
        computeCallerForAccessor = KPropertyImplKt.computeCallerForAccessor(this.this$0, true);
        return computeCallerForAccessor;
    }
}
