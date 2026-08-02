package nh;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: nh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5736a {

    /* renamed from: a, reason: collision with root package name */
    public final short f58529a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58530b;

    /* renamed from: nh.a$a, reason: collision with other inner class name */
    public enum EnumC0858a {
        NORMAL(1000),
        GOING_AWAY(1001),
        PROTOCOL_ERROR(1002),
        CANNOT_ACCEPT(1003),
        CLOSED_ABNORMALLY(1006),
        NOT_CONSISTENT(1007),
        VIOLATED_POLICY(1008),
        TOO_BIG(1009),
        NO_EXTENSION(1010),
        INTERNAL_ERROR(1011),
        SERVICE_RESTART(1012),
        TRY_AGAIN_LATER(1013);


        /* renamed from: b, reason: collision with root package name */
        public static final C0859a f58531b = new C0859a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final Map f58532c;

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0858a f58533d;

        /* renamed from: a, reason: collision with root package name */
        public final short f58546a;

        /* renamed from: nh.a$a$a, reason: collision with other inner class name */
        public static final class C0859a {
            public /* synthetic */ C0859a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0858a a(short s10) {
                return (EnumC0858a) EnumC0858a.f58532c.get(Short.valueOf(s10));
            }

            public C0859a() {
            }
        }

        static {
            EnumC0858a[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
            for (EnumC0858a enumC0858a : values) {
                linkedHashMap.put(Short.valueOf(enumC0858a.f58546a), enumC0858a);
            }
            f58532c = linkedHashMap;
            f58533d = INTERNAL_ERROR;
        }

        EnumC0858a(short s10) {
            this.f58546a = s10;
        }

        public final short c() {
            return this.f58546a;
        }
    }

    public C5736a(short s10, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f58529a = s10;
        this.f58530b = message;
    }

    public final short a() {
        return this.f58529a;
    }

    public final EnumC0858a b() {
        return EnumC0858a.f58531b.a(this.f58529a);
    }

    public final String c() {
        return this.f58530b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5736a)) {
            return false;
        }
        C5736a c5736a = (C5736a) obj;
        return this.f58529a == c5736a.f58529a && Intrinsics.areEqual(this.f58530b, c5736a.f58530b);
    }

    public int hashCode() {
        return (Short.hashCode(this.f58529a) * 31) + this.f58530b.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CloseReason(reason=");
        Object b10 = b();
        if (b10 == null) {
            b10 = Short.valueOf(this.f58529a);
        }
        sb2.append(b10);
        sb2.append(", message=");
        sb2.append(this.f58530b);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5736a(EnumC0858a code, String message) {
        this(code.c(), message);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
