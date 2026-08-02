package T7;

import android.content.Intent;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: T7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1661a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0210a f11054d = new C0210a(null);

    /* renamed from: e, reason: collision with root package name */
    public static C1661a f11055e;

    /* renamed from: a, reason: collision with root package name */
    public int f11056a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f11057b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f11058c;

    /* renamed from: T7.a$a, reason: collision with other inner class name */
    public static final class C0210a {
        public /* synthetic */ C0210a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized C1661a b(UUID callId, int i10) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            C1661a c10 = c();
            if (c10 != null && Intrinsics.areEqual(c10.c(), callId) && c10.d() == i10) {
                d(null);
                return c10;
            }
            return null;
        }

        public final C1661a c() {
            return C1661a.a();
        }

        public final synchronized boolean d(C1661a c1661a) {
            C1661a c10;
            c10 = c();
            C1661a.b(c1661a);
            return c10 != null;
        }

        public C0210a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1661a(int i10) {
        this(i10, null, 2, 0 == true ? 1 : 0);
    }

    public static final /* synthetic */ C1661a a() {
        if (Y7.a.d(C1661a.class)) {
            return null;
        }
        try {
            return f11055e;
        } catch (Throwable th2) {
            Y7.a.b(th2, C1661a.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(C1661a c1661a) {
        if (Y7.a.d(C1661a.class)) {
            return;
        }
        try {
            f11055e = c1661a;
        } catch (Throwable th2) {
            Y7.a.b(th2, C1661a.class);
        }
    }

    public final UUID c() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return this.f11057b;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final int d() {
        if (Y7.a.d(this)) {
            return 0;
        }
        try {
            return this.f11056a;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return 0;
        }
    }

    public final Intent e() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return this.f11058c;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final boolean f() {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return f11054d.d(this);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final void g(Intent intent) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            this.f11058c = intent;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public C1661a(int i10, UUID callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        this.f11056a = i10;
        this.f11057b = callId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C1661a(int i10, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, uuid);
        if ((i11 & 2) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
    }
}
