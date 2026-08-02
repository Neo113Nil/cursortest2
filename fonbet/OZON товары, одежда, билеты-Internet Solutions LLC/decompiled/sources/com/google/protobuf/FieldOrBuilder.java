package com.google.protobuf;

import com.google.protobuf.Field;
import java.util.List;

/* loaded from: classes9.dex */
public interface FieldOrBuilder extends A {
    Field.Cardinality getCardinality();

    int getCardinalityValue();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getDefaultValue();

    ByteString getDefaultValueBytes();

    String getJsonName();

    ByteString getJsonNameBytes();

    Field.Kind getKind();

    int getKindValue();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    int getOneofIndex();

    Option getOptions(int i11);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getPacked();

    String getTypeUrl();

    ByteString getTypeUrlBytes();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
