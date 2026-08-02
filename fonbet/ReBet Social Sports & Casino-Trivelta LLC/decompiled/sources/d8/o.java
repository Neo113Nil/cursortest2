package d8;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final a f45096d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f45097a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45098b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45099c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ o(Collection collection, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, str);
        if ((i10 & 2) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }

    public final String a() {
        return this.f45099c;
    }

    public final String b() {
        return this.f45098b;
    }

    public final Set c() {
        return this.f45097a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(Collection collection, String nonce) {
        this(collection, nonce, C4017B.c());
        Intrinsics.checkNotNullParameter(nonce, "nonce");
    }

    public o(Collection collection, String nonce, String codeVerifier) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        if (C4016A.a(nonce) && C4017B.d(codeVerifier)) {
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add("openid");
            Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(permissions)");
            this.f45097a = unmodifiableSet;
            this.f45098b = nonce;
            this.f45099c = codeVerifier;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
