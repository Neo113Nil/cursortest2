package kotlin.reflect.jvm.internal;

import defpackage.xka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "V", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KMutableProperty0Impl$_setter$1<V> extends xka implements Function0<KMutableProperty0Impl.Setter<V>> {
    final /* synthetic */ KMutableProperty0Impl<V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl$_setter$1(KMutableProperty0Impl<V> kMutableProperty0Impl) {
        super(0);
        this.this$0 = kMutableProperty0Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final KMutableProperty0Impl.Setter<V> invoke() {
        return new KMutableProperty0Impl.Setter<>(this.this$0);
    }
}
