package com.google.protobuf;

import com.google.protobuf.TypeKt;
import xsna.izs;
import xsna.s3q0;

/* compiled from: TypeKt.kt */
/* loaded from: classes13.dex */
public final class TypeKtKt {
    /* renamed from: -initializetype, reason: not valid java name */
    public static final Type m27initializetype(izs<? super TypeKt.Dsl, s3q0> izsVar) {
        TypeKt.Dsl _create = TypeKt.Dsl.Companion._create(Type.newBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final Type copy(Type type, izs<? super TypeKt.Dsl, s3q0> izsVar) {
        TypeKt.Dsl _create = TypeKt.Dsl.Companion._create(type.toBuilder());
        izsVar.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(TypeOrBuilder typeOrBuilder) {
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}
