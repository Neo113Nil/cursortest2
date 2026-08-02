package com.squareup.wire;

import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ProtoAdapter.kt */
/* loaded from: classes14.dex */
public final class ProtoAdapterKt$delegateEncode$1 extends Lambda implements izs<ProtoWriter, s3q0> {
    final /* synthetic */ ProtoAdapter<E> $this_delegateEncode;
    final /* synthetic */ E $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtoAdapterKt$delegateEncode$1(ProtoAdapter<E> protoAdapter, E e) {
        super(1);
        this.$this_delegateEncode = protoAdapter;
        this.$value = e;
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(ProtoWriter protoWriter) {
        invoke2(protoWriter);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProtoWriter protoWriter) {
        this.$this_delegateEncode.encode(protoWriter, (ProtoWriter) this.$value);
    }
}
