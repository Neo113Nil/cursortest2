package io.ktor.utils.io.internal;

import io.ktor.utils.io.m;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f49455b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final b f49456c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f49457a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return b.f49456c;
        }

        public a() {
        }
    }

    public b(Throwable th2) {
        this.f49457a = th2;
    }

    public final Throwable b() {
        return this.f49457a;
    }

    public final Throwable c() {
        Throwable th2 = this.f49457a;
        return th2 == null ? new m("The channel was closed") : th2;
    }

    public String toString() {
        return "Closed[" + c() + ']';
    }
}
