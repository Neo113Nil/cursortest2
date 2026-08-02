package com.google.protobuf;

/* loaded from: classes.dex */
final class NewInstanceSchemaLite implements C {
    NewInstanceSchemaLite() {
    }

    @Override // com.google.protobuf.C
    public Object newInstance(Object obj) {
        return ((GeneratedMessageLite) obj).newMutableInstance();
    }
}
