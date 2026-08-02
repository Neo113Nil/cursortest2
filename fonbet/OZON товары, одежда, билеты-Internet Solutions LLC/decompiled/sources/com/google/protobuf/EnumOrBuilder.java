package com.google.protobuf;

import java.util.List;

/* loaded from: classes9.dex */
public interface EnumOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getEdition();

    ByteString getEditionBytes();

    EnumValue getEnumvalue(int i11);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i11);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
