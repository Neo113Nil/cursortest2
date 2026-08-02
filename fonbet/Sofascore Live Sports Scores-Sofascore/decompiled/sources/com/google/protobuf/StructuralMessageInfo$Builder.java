package com.google.protobuf;

import defpackage.a70;
import defpackage.mii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class StructuralMessageInfo$Builder {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<a1> fields;
    private boolean messageSetWireFormat;
    private ProtoSyntax syntax;
    private boolean wasBuilt;

    public StructuralMessageInfo$Builder() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public mii build() {
        if (this.wasBuilt) {
            a70.r("Builder can only build once");
            return null;
        }
        if (this.syntax == null) {
            a70.r("Must specify a proto syntax");
            return null;
        }
        this.wasBuilt = true;
        Collections.sort(this.fields);
        return new mii(this.syntax, this.messageSetWireFormat, this.checkInitialized, (a1[]) this.fields.toArray(new a1[0]), this.defaultInstance);
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withField(a1 a1Var) {
        if (this.wasBuilt) {
            a70.r("Builder can only build once");
        } else {
            this.fields.add(a1Var);
        }
    }

    public void withMessageSetWireFormat(boolean z) {
        this.messageSetWireFormat = z;
    }

    public void withSyntax(ProtoSyntax protoSyntax) {
        this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
    }

    public StructuralMessageInfo$Builder(int i) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i);
    }
}
