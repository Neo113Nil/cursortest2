package D5;

import android.app.Activity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a extends D5.f {

    /* renamed from: f, reason: collision with root package name */
    public static final h f2544f = new h(null);

    /* renamed from: c, reason: collision with root package name */
    public final Activity f2545c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2546d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2547e;

    /* renamed from: D5.a$a, reason: collision with other inner class name */
    public static final class C0051a extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0051a(Activity activity) {
            super(activity, "activityCreated", null, 4, null);
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final class b extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(activity, "activityDestroyed", null, 4, null);
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final class c extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(activity, "activityPaused", null, 4, null);
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final class d extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity) {
            super(activity, "activityResumed", null, 4, null);
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final class e extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Activity activity) {
            super(activity, "activitySaveInstanceState", null, 4, null);
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final class f extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Activity activity) {
            super(activity, "activityStarted", null, 4, null);
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final class g extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(activity, "activityStopped", null, 4, null);
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public h() {
        }
    }

    public /* synthetic */ a(Activity activity, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, str, str2);
    }

    @Override // D5.f
    public String a() {
        return this.f2546d;
    }

    @Override // D5.f
    public String b() {
        return this.f2547e;
    }

    public final Activity c() {
        return this.f2545c;
    }

    public /* synthetic */ a(Activity activity, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, str, (i10 & 4) != 0 ? activity.getClass().getSimpleName() : str2, null);
    }

    public a(Activity activity, String str, String str2) {
        super(str, str2, null);
        this.f2545c = activity;
        this.f2546d = str;
        this.f2547e = str2;
    }
}
