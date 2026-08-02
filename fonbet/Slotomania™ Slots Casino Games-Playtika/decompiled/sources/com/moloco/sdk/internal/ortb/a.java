package com.moloco.sdk.internal.ortb;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class a {
    public static final int a = 0;

    /* renamed from: com.moloco.sdk.internal.ortb.a$a, reason: collision with other inner class name */
    public static final class C0242a extends a {
        public static final int c = 8;
        public final Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0242a(Exception cause) {
            super(null);
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.b = cause;
        }

        public final Exception a() {
            return this.b;
        }

        public final Exception b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0242a) && Intrinsics.areEqual(this.b, ((C0242a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "InvalidJson(cause=" + this.b + ')';
        }

        public final C0242a a(Exception cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new C0242a(cause);
        }

        public static /* synthetic */ C0242a a(C0242a c0242a, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = c0242a.b;
            }
            return c0242a.a(exc);
        }
    }

    public static final class b extends a {
        public static final int c = 8;
        public final List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> fields) {
            super(null);
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.b = fields;
        }

        public final List<String> a() {
            return this.b;
        }

        public final List<String> b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.b, ((b) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "MissingRequiredFields(fields=" + this.b + ')';
        }

        public final b a(List<String> fields) {
            Intrinsics.checkNotNullParameter(fields, "fields");
            return new b(fields);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b a(b bVar, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bVar.b;
            }
            return bVar.a(list);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public a() {
    }
}
