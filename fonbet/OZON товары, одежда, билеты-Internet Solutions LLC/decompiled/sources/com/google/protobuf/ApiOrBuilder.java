package com.google.protobuf;

import java.util.List;

/* loaded from: classes9.dex */
public interface ApiOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getEdition();

    ByteString getEditionBytes();

    Method getMethods(int i11);

    int getMethodsCount();

    List<Method> getMethodsList();

    Mixin getMixins(int i11);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i11);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    String getVersion();

    ByteString getVersionBytes();

    boolean hasSourceContext();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
