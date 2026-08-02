package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2150z extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a, reason: collision with root package name */
    public P f19695a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19696b;

    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends C2150z {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C2150z(String str) {
        super(str);
        this.f19695a = null;
    }

    public static C2150z b() {
        return new C2150z("Protocol message end-group tag did not match expected tag.");
    }

    public static C2150z c() {
        return new C2150z("Protocol message contained an invalid tag (zero).");
    }

    public static C2150z d() {
        return new C2150z("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C2150z f() {
        return new C2150z("CodedInputStream encountered a malformed varint.");
    }

    public static C2150z g() {
        return new C2150z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C2150z h() {
        return new C2150z("Failed to parse the message.");
    }

    public static C2150z i() {
        return new C2150z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static C2150z l() {
        return new C2150z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C2150z m() {
        return new C2150z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.f19696b;
    }

    public void j() {
        this.f19696b = true;
    }

    public C2150z k(P p10) {
        this.f19695a = p10;
        return this;
    }

    public C2150z(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f19695a = null;
    }
}
