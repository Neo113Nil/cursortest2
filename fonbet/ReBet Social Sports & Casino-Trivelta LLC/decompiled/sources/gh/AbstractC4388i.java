package gh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gh.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4388i {

    /* renamed from: gh.i$a */
    public static final class a extends AbstractC4388i {

        /* renamed from: a, reason: collision with root package name */
        public final C4387h f47444a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4387h relativeTo) {
            super(null);
            Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
            this.f47444a = relativeTo;
        }

        public final C4387h a() {
            return this.f47444a;
        }
    }

    /* renamed from: gh.i$b */
    public static final class b extends AbstractC4388i {

        /* renamed from: a, reason: collision with root package name */
        public final C4387h f47445a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4387h relativeTo) {
            super(null);
            Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
            this.f47445a = relativeTo;
        }
    }

    /* renamed from: gh.i$c */
    public static final class c extends AbstractC4388i {

        /* renamed from: a, reason: collision with root package name */
        public static final c f47446a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC4388i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC4388i() {
    }
}
