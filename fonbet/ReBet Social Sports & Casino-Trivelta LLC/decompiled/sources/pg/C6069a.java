package pg;

import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6069a {

    /* renamed from: a, reason: collision with root package name */
    public final String f63189a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63190b;

    /* renamed from: c, reason: collision with root package name */
    public String f63191c;

    /* renamed from: d, reason: collision with root package name */
    public Bd.b f63192d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f63193e;

    /* renamed from: f, reason: collision with root package name */
    public b f63194f;

    /* renamed from: pg.a$a, reason: collision with other inner class name */
    public static final class C0873a {

        /* renamed from: a, reason: collision with root package name */
        public final String f63195a;

        /* renamed from: b, reason: collision with root package name */
        public final String f63196b;

        /* renamed from: c, reason: collision with root package name */
        public String f63197c;

        /* renamed from: d, reason: collision with root package name */
        public Bd.b f63198d;

        /* renamed from: e, reason: collision with root package name */
        public HashMap f63199e;

        /* renamed from: f, reason: collision with root package name */
        public b f63200f;

        public C0873a(String appKey, String accessKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            this.f63195a = appKey;
            this.f63196b = accessKey;
        }

        public final C6069a a() {
            if (this.f63195a.length() <= 0) {
                throw new IllegalArgumentException("Please provide the app key to initialize the SDK.");
            }
            if (this.f63196b.length() <= 0) {
                throw new IllegalArgumentException("Please provide the access key to initialize the SDK.");
            }
            C6069a c6069a = new C6069a(this.f63195a, this.f63196b);
            c6069a.f63191c = this.f63197c;
            c6069a.f63192d = this.f63198d;
            c6069a.f63193e = this.f63199e;
            c6069a.f63194f = this.f63200f;
            return c6069a;
        }

        public final C0873a b(b callViewMode) {
            Intrinsics.checkNotNullParameter(callViewMode, "callViewMode");
            this.f63200f = callViewMode;
            return this;
        }

        public final C0873a c(int i10, String fontPath) {
            Intrinsics.checkNotNullParameter(fontPath, "fontPath");
            if (this.f63199e == null) {
                this.f63199e = new HashMap();
            }
            HashMap hashMap = this.f63199e;
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(i10), fontPath);
            }
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: pg.a$b */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final b f63201a = new b("BANNER", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f63202b = new b("FLOATING", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f63203c;

        static {
            b[] a10 = a();
            $VALUES = a10;
            f63203c = EnumEntriesKt.enumEntries(a10);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f63201a, f63202b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public C6069a(String appKey, String accessKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        this.f63189a = appKey;
        this.f63190b = accessKey;
        if (appKey.length() <= 0) {
            throw new IllegalArgumentException("Please provide the app key to initialize the SDK.");
        }
        if (accessKey.length() <= 0) {
            throw new IllegalArgumentException("Please provide the access key to initialize the SDK.");
        }
    }

    public final String e() {
        return this.f63190b;
    }

    public final String f() {
        return this.f63189a;
    }

    public final Bd.b g() {
        return this.f63192d;
    }

    public final b h() {
        return this.f63194f;
    }

    public final Map i() {
        return this.f63193e;
    }

    public final String j() {
        return this.f63191c;
    }
}
