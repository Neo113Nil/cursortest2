package zendesk.talk.android.internal.call.setup;

import Dj.o;
import Dj.p;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f68902a = new a();

        public a() {
            super(null);
        }
    }

    public static abstract class b extends c {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final List f68903a;

            /* renamed from: b, reason: collision with root package name */
            public final AbstractC1004c f68904b;

            public static /* synthetic */ a b(a aVar, List list, AbstractC1004c abstractC1004c, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = aVar.f68903a;
                }
                if ((i10 & 2) != 0) {
                    abstractC1004c = aVar.f68904b;
                }
                return aVar.a(list, abstractC1004c);
            }

            public abstract a a(List list, AbstractC1004c abstractC1004c);

            public abstract List c();

            public abstract AbstractC1004c d();
        }

        /* renamed from: zendesk.talk.android.internal.call.setup.c$b$b, reason: collision with other inner class name */
        public static final class C1003b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1003b f68905a = new C1003b();

            public C1003b() {
                super(null);
            }
        }

        /* renamed from: zendesk.talk.android.internal.call.setup.c$b$c, reason: collision with other inner class name */
        public static abstract class AbstractC1004c {

            /* renamed from: zendesk.talk.android.internal.call.setup.c$b$c$a */
            public static final class a extends AbstractC1004c {
                public abstract o a();
            }

            /* renamed from: zendesk.talk.android.internal.call.setup.c$b$c$b, reason: collision with other inner class name */
            public static final class C1005b extends AbstractC1004c {

                /* renamed from: a, reason: collision with root package name */
                public static final C1005b f68906a = new C1005b();

                public C1005b() {
                    super(null);
                }
            }

            public /* synthetic */ AbstractC1004c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public AbstractC1004c() {
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: zendesk.talk.android.internal.call.setup.c$c, reason: collision with other inner class name */
    public static final class C1006c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1006c f68907a = new C1006c();

        public C1006c() {
            super(null);
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f68908a = new d();

        public d() {
            super(null);
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public final p f68909a;

        public e(p pVar) {
            super(null);
            this.f68909a = pVar;
        }

        public final p a() {
            return this.f68909a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f68909a == ((e) obj).f68909a;
        }

        public int hashCode() {
            p pVar = this.f68909a;
            if (pVar == null) {
                return 0;
            }
            return pVar.hashCode();
        }

        public String toString() {
            return "SetupDone(recordingConsentAnswer=" + this.f68909a + ')';
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public c() {
    }
}
