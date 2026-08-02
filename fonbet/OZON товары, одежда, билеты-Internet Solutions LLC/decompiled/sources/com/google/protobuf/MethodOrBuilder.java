package com.google.protobuf;

import java.util.List;

/* loaded from: classes9.dex */
public interface MethodOrBuilder extends A {
    /* synthetic */ MessageLite getDefaultInstanceForType();

    @Deprecated
    String getEdition();

    @Deprecated
    ByteString getEditionBytes();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i11);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    ByteString getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    ByteString getResponseTypeUrlBytes();

    @Deprecated
    Syntax getSyntax();

    @Deprecated
    int getSyntaxValue();

    @Override // com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}
