package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.aa20;

/* loaded from: classes13.dex */
public final class StructuralMessageInfo implements aa20 {
    public final ProtoSyntax a;
    public final boolean b;
    public final int[] c;
    public final FieldInfo[] d;
    public final MessageLite e;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.a = protoSyntax;
        this.b = z;
        this.c = iArr;
        this.d = fieldInfoArr;
        this.e = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // xsna.aa20
    public final boolean a() {
        return this.b;
    }

    @Override // xsna.aa20
    public final MessageLite b() {
        return this.e;
    }

    public final int[] c() {
        return this.c;
    }

    public final FieldInfo[] d() {
        return this.d;
    }

    @Override // xsna.aa20
    public final ProtoSyntax getSyntax() {
        return this.a;
    }

    public static final class Builder {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<FieldInfo> fields;
        private boolean messageSetWireFormat;
        private ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
            this.checkInitialized = null;
            this.fields = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            Collections.sort(this.fields);
            return new StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (FieldInfo[]) this.fields.toArray(new FieldInfo[0]), this.defaultInstance);
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.defaultInstance = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.fields.add(fieldInfo);
        }

        public void withMessageSetWireFormat(boolean z) {
            this.messageSetWireFormat = z;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
        }

        public Builder(int i) {
            this.checkInitialized = null;
            this.fields = new ArrayList(i);
        }
    }
}
