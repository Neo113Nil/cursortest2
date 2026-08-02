package hg;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4507a {

    /* renamed from: a, reason: collision with root package name */
    public final String f47892a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47893b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f47894c;

    /* renamed from: d, reason: collision with root package name */
    public final List f47895d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f47896e;

    /* renamed from: hg.a$a, reason: collision with other inner class name */
    public static final class C0720a {

        /* renamed from: a, reason: collision with root package name */
        public String f47897a;

        /* renamed from: b, reason: collision with root package name */
        public String f47898b;

        /* renamed from: c, reason: collision with root package name */
        public Object f47899c;

        /* renamed from: d, reason: collision with root package name */
        public List f47900d;

        /* renamed from: e, reason: collision with root package name */
        public Map f47901e;

        public final C4507a a() {
            return new C4507a(this.f47897a, this.f47898b, this.f47899c, this.f47900d, this.f47901e, null);
        }

        public final C0720a b(String additionalInfo) {
            Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
            this.f47898b = additionalInfo;
            return this;
        }

        public final C0720a c(Map customSecretFields) {
            Intrinsics.checkNotNullParameter(customSecretFields, "customSecretFields");
            this.f47901e = customSecretFields;
            return this;
        }

        public final C0720a d(List departments) {
            Intrinsics.checkNotNullParameter(departments, "departments");
            this.f47900d = departments;
            return this;
        }

        public final C0720a e(Object displayPicture) {
            Intrinsics.checkNotNullParameter(displayPicture, "displayPicture");
            this.f47899c = displayPicture;
            return this;
        }

        public final C0720a f(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f47897a = name;
            return this;
        }
    }

    public /* synthetic */ C4507a(String str, String str2, Object obj, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, obj, list, map);
    }

    public final String a() {
        return this.f47893b;
    }

    public final Map b() {
        return this.f47896e;
    }

    public final List c() {
        return this.f47895d;
    }

    public final Object d() {
        return this.f47894c;
    }

    public final String e() {
        return this.f47892a;
    }

    public final C0720a f() {
        C0720a c0720a = new C0720a();
        c0720a.f47897a = this.f47892a;
        c0720a.f47898b = this.f47893b;
        c0720a.f47899c = this.f47894c;
        c0720a.f47900d = this.f47895d;
        c0720a.f47901e = this.f47896e;
        return c0720a;
    }

    public C4507a(String str, String str2, Object obj, List list, Map map) {
        this.f47892a = str;
        this.f47893b = str2;
        this.f47894c = obj;
        this.f47895d = list;
        this.f47896e = map;
    }
}
