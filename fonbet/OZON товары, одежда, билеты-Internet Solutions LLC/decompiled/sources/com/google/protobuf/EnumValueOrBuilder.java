package com.google.protobuf;

import java.util.List;

/* loaded from: classes9.dex */
public interface EnumValueOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getName();

    ByteString getNameBytes();

    int getNumber();

    Option getOptions(int i11);

    int getOptionsCount();

    List<Option> getOptionsList();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
