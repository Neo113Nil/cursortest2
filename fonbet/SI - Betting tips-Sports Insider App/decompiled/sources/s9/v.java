package s9;

import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class v extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a, reason: collision with root package name */
    public boolean f23378a;

    public static v a() {
        return new v("Protocol message had invalid UTF-8.");
    }

    public static u b() {
        return new u("Protocol message tag had invalid wire type.");
    }

    public static v c() {
        return new v("CodedInputStream encountered a malformed varint.");
    }

    public static v d() {
        return new v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static v e() {
        return new v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
