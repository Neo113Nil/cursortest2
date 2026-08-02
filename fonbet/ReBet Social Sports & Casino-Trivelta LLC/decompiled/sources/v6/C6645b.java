package v6;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6645b implements InterfaceC6644a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f67041b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final File f67042a;

    /* renamed from: v6.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6645b a(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new C6645b(file, null);
        }

        public final C6645b b(File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new C6645b(file, defaultConstructorMarker);
            }
            return null;
        }

        public a() {
        }
    }

    public /* synthetic */ C6645b(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public static final C6645b b(File file) {
        return f67041b.a(file);
    }

    public static final C6645b c(File file) {
        return f67041b.b(file);
    }

    @Override // v6.InterfaceC6644a
    public InputStream a() {
        return new FileInputStream(this.f67042a);
    }

    public final File d() {
        return this.f67042a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6645b)) {
            return false;
        }
        return Intrinsics.areEqual(this.f67042a, ((C6645b) obj).f67042a);
    }

    public int hashCode() {
        return this.f67042a.hashCode();
    }

    @Override // v6.InterfaceC6644a
    public long size() {
        return this.f67042a.length();
    }

    public C6645b(File file) {
        this.f67042a = file;
    }
}
