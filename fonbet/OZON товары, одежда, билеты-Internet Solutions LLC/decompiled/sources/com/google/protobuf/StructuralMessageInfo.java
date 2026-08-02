package com.google.protobuf;

import java.util.ArrayList;

/* loaded from: classes9.dex */
final class StructuralMessageInfo implements y {
    private final int[] checkInitialized;
    private final MessageLite defaultInstance;
    private final C5960k[] fields;
    private final boolean messageSetWireFormat;
    private final G syntax;

    public static final class a {
    }

    StructuralMessageInfo(G g10, boolean z11, int[] iArr, C5960k[] c5960kArr, Object obj) {
        this.syntax = g10;
        this.messageSetWireFormat = z11;
        this.checkInitialized = iArr;
        this.fields = c5960kArr;
        Internal.a(obj, "defaultInstance");
        this.defaultInstance = (MessageLite) obj;
    }

    public static a newBuilder() {
        a aVar = new a();
        new ArrayList();
        return aVar;
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // com.google.protobuf.y
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public C5960k[] getFields() {
        return this.fields;
    }

    @Override // com.google.protobuf.y
    public G getSyntax() {
        return this.syntax;
    }

    @Override // com.google.protobuf.y
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public static a newBuilder(int i11) {
        a aVar = new a();
        new ArrayList(i11);
        return aVar;
    }
}
