package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class A extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private S f59303a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f59304b;

    public static class a extends A {
    }

    static A b() {
        return new A("Protocol message contained an invalid tag (zero).");
    }

    static A d() {
        return new A("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static A f() {
        return new A("CodedInputStream encountered a malformed varint.");
    }

    static A g() {
        return new A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static A h() {
        return new A("Failed to parse the message.");
    }

    static A l() {
        return new A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    final boolean a() {
        return this.f59304b;
    }

    final void i() {
        this.f59304b = true;
    }

    public final void j(S s11) {
        this.f59303a = s11;
    }
}
