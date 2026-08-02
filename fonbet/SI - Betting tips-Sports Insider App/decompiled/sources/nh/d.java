package nh;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final ByteString f20928d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteString f20929e;

    /* renamed from: f, reason: collision with root package name */
    public static final ByteString f20930f;

    /* renamed from: g, reason: collision with root package name */
    public static final ByteString f20931g;

    /* renamed from: h, reason: collision with root package name */
    public static final ByteString f20932h;

    /* renamed from: i, reason: collision with root package name */
    public static final ByteString f20933i;

    /* renamed from: a, reason: collision with root package name */
    public final ByteString f20934a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteString f20935b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20936c;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f20928d = companion.encodeUtf8(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f20929e = companion.encodeUtf8(":status");
        f20930f = companion.encodeUtf8(":method");
        f20931g = companion.encodeUtf8(":path");
        f20932h = companion.encodeUtf8(":scheme");
        f20933i = companion.encodeUtf8(":authority");
    }

    public d(ByteString name, ByteString value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f20934a = name;
        this.f20935b = value;
        this.f20936c = value.size() + name.size() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f20934a, dVar.f20934a) && Intrinsics.areEqual(this.f20935b, dVar.f20935b);
    }

    public final int hashCode() {
        return this.f20935b.hashCode() + (this.f20934a.hashCode() * 31);
    }

    public final String toString() {
        return this.f20934a.utf8() + ": " + this.f20935b.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(String name, String value) {
        this(r0.encodeUtf8(name), r0.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ByteString.Companion companion = ByteString.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String value, ByteString name) {
        this(name, ByteString.INSTANCE.encodeUtf8(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
