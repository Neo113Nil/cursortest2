package com.squareup.wire;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class ProtoAdapterKt$delegateEncode$1 implements Function1<ProtoWriter, Unit> {
    final /* synthetic */ ProtoAdapter<E> $this_delegateEncode;
    final /* synthetic */ E $value;

    public ProtoAdapterKt$delegateEncode$1(ProtoAdapter<E> protoAdapter, E e) {
        this.$this_delegateEncode = protoAdapter;
        this.$value = e;
    }

    public final void invoke(ProtoWriter protoWriter) {
        protoWriter.getClass();
        this.$this_delegateEncode.encode(protoWriter, (ProtoWriter) this.$value);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProtoWriter) obj);
        return Unit.a;
    }
}
