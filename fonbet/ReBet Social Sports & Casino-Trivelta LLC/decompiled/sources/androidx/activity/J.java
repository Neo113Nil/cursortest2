package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: e, reason: collision with root package name */
    public static final a f16360e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f16361a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16362b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16363c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f16364d;

    public static final class a {

        /* renamed from: androidx.activity.J$a$a, reason: collision with other inner class name */
        public static final class C0338a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public static final C0338a f16365d = new C0338a();

            public C0338a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Resources resources) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ J b(a aVar, int i10, int i11, Function1 function1, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                function1 = C0338a.f16365d;
            }
            return aVar.a(i10, i11, function1);
        }

        public final J a(int i10, int i11, Function1 detectDarkMode) {
            Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
            return new J(i10, i11, 0, detectDarkMode, null);
        }

        public a() {
        }
    }

    public /* synthetic */ J(int i10, int i11, int i12, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, function1);
    }

    public final int a() {
        return this.f16362b;
    }

    public final Function1 b() {
        return this.f16364d;
    }

    public final int c() {
        return this.f16363c;
    }

    public final int d(boolean z10) {
        return z10 ? this.f16362b : this.f16361a;
    }

    public final int e(boolean z10) {
        if (this.f16363c == 0) {
            return 0;
        }
        return z10 ? this.f16362b : this.f16361a;
    }

    public J(int i10, int i11, int i12, Function1 function1) {
        this.f16361a = i10;
        this.f16362b = i11;
        this.f16363c = i12;
        this.f16364d = function1;
    }
}
