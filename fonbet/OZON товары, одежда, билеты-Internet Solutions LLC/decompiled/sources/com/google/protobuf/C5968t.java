package com.google.protobuf;

/* renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5968t {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC5967s f60230a;

    /* renamed from: b, reason: collision with root package name */
    private static final ListFieldSchemaLite f60231b;

    static {
        InterfaceC5967s interfaceC5967s;
        int i11 = C5950a.f60193b;
        try {
            interfaceC5967s = (InterfaceC5967s) Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            interfaceC5967s = null;
        }
        f60230a = interfaceC5967s;
        f60231b = new ListFieldSchemaLite();
    }

    static InterfaceC5967s a() {
        return f60230a;
    }

    static ListFieldSchemaLite b() {
        return f60231b;
    }
}
