package U5;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import y5.C6854a;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f12064a;

    /* renamed from: U5.a$a, reason: collision with other inner class name */
    public static final class C0248a extends a {
        public C0248a(long j10) {
            super(j10, null);
        }
    }

    public static final class b extends a {
        public b(long j10) {
            super(j10, null);
        }
    }

    public static final class c extends a {
        public c(long j10) {
            super(j10, null);
        }
    }

    public static final class d extends a {

        /* renamed from: b, reason: collision with root package name */
        public final C6854a f12065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C6854a tapCoordinates, long j10) {
            super(j10, null);
            Intrinsics.checkNotNullParameter(tapCoordinates, "tapCoordinates");
            this.f12065b = tapCoordinates;
        }

        public final C6854a c() {
            return this.f12065b;
        }
    }

    public /* synthetic */ a(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public final long a() {
        return this.f12064a;
    }

    public final boolean b() {
        if ((this instanceof c) || (this instanceof d) || (this instanceof b)) {
            return true;
        }
        if (this instanceof C0248a) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        return Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + "(timestamp=" + this.f12064a + ")";
    }

    public a(long j10) {
        this.f12064a = j10;
    }
}
