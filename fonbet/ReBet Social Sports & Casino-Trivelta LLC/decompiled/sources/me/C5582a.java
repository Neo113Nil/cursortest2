package me;

import com.zoho.livechat.android.utils.LiveChatUtil;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: me.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5582a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0817a f56502b = new C0817a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f56503a;

    /* renamed from: me.a$a, reason: collision with other inner class name */
    public static final class C0817a {
        public /* synthetic */ C0817a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C5582a c(C0817a c0817a, Throwable th2, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return c0817a.a(th2, z10);
        }

        public static /* synthetic */ C5582a e(C0817a c0817a, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = Unit.INSTANCE;
            }
            return c0817a.d(obj);
        }

        public final C5582a a(Throwable throwable, boolean z10) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (z10) {
                LiveChatUtil.log(throwable);
            }
            String message = throwable.getMessage();
            return new C5582a(new b(message != null ? StringsKt.trim((CharSequence) message).toString() : null, -1, throwable), null);
        }

        public final C5582a b(b error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C5582a c5582a = new C5582a(error, null);
            LiveChatUtil.log(error.a());
            return c5582a;
        }

        public final C5582a d(Object obj) {
            return new C5582a(obj, null);
        }

        public C0817a() {
        }
    }

    /* renamed from: me.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f56504a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f56505b;

        /* renamed from: c, reason: collision with root package name */
        public final Throwable f56506c;

        public b(String str, Integer num, Throwable th2) {
            this.f56504a = str;
            this.f56505b = num;
            this.f56506c = th2;
        }

        public final Throwable a() {
            return this.f56506c;
        }

        public final Integer b() {
            return this.f56505b;
        }

        public final String c() {
            return this.f56504a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error Code: ");
            sb2.append(this.f56505b);
            sb2.append("\n\tErrorMessage: ");
            sb2.append(this.f56504a);
            sb2.append("\n\tCause: ");
            Throwable th2 = this.f56506c;
            sb2.append(th2 != null ? ExceptionsKt.stackTraceToString(th2) : null);
            return sb2.toString();
        }

        public /* synthetic */ b(String str, Integer num, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : th2);
        }
    }

    public /* synthetic */ C5582a(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj);
    }

    public final C5582a a(Object obj) {
        return d() ? new C5582a(obj) : new C5582a(this.f56503a);
    }

    public final Object b() {
        Object obj = this.f56503a;
        if ((obj instanceof b) || (obj instanceof Error) || obj == null) {
            return null;
        }
        return obj;
    }

    public final b c() {
        Object obj = this.f56503a;
        if (obj instanceof b) {
            return (b) obj;
        }
        return null;
    }

    public final boolean d() {
        Object obj = this.f56503a;
        return ((obj instanceof b) || (obj instanceof Error)) ? false : true;
    }

    public C5582a(Object obj) {
        this.f56503a = obj;
    }
}
