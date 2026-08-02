package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1585a;

    public static c0 a() {
        return new c0("Protocol message had invalid UTF-8.");
    }

    public static b0 b() {
        return new b0("Protocol message tag had invalid wire type.");
    }

    public static c0 c() {
        return new c0("CodedInputStream encountered a malformed varint.");
    }

    public static c0 d() {
        return new c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static c0 e() {
        return new c0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
