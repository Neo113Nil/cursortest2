package y00;

import A00.a;
import C.o0;
import T7.E;
import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: y00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC10819a {

    /* renamed from: y00.a$a, reason: collision with other inner class name */
    public static final class C2288a extends AbstractC10819a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2288a f105881a = new C2288a(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2288a);
        }

        public final int hashCode() {
            return -978662510;
        }

        @NotNull
        public final String toString() {
            return "ClearOverlayWidgetDeferredTracking";
        }
    }

    /* renamed from: y00.a$b */
    public static final class b extends AbstractC10819a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f105882a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Throwable f105883b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f105884c;

        /* renamed from: d, reason: collision with root package name */
        private final int f105885d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String url, @NotNull String stackTrace, @NotNull Throwable throwable) {
            super(0);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
            this.f105882a = url;
            this.f105883b = throwable;
            this.f105884c = stackTrace;
            this.f105885d = 400;
        }

        public final int a() {
            return this.f105885d;
        }

        @NotNull
        public final String b() {
            return this.f105884c;
        }

        @NotNull
        public final Throwable c() {
            return this.f105883b;
        }

        @NotNull
        public final String d() {
            return this.f105882a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f105882a, bVar.f105882a) && Intrinsics.d(this.f105883b, bVar.f105883b) && Intrinsics.d(this.f105884c, bVar.f105884c) && this.f105885d == bVar.f105885d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f105885d) + G.g.a((this.f105883b.hashCode() + (this.f105882a.hashCode() * 31)) * 31, 31, this.f105884c);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FrequencyLoadIncident(url=");
            sb2.append(this.f105882a);
            sb2.append(", throwable=");
            sb2.append(this.f105883b);
            sb2.append(", stackTrace=");
            sb2.append(this.f105884c);
            sb2.append(", limit=");
            return K00.b.e(this.f105885d, ")", sb2);
        }
    }

    /* renamed from: y00.a$c */
    public static final class c extends AbstractC10819a {

        /* renamed from: a, reason: collision with root package name */
        private final String f105886a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<R00.f> f105887b;

        /* renamed from: c, reason: collision with root package name */
        private final D00.g f105888c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, @NotNull List<? extends R00.f> incidents, D00.g gVar) {
            super(0);
            Intrinsics.checkNotNullParameter(incidents, "incidents");
            this.f105886a = str;
            this.f105887b = incidents;
            this.f105888c = gVar;
        }

        @NotNull
        public final List<R00.f> a() {
            return this.f105887b;
        }

        public final D00.g b() {
            return this.f105888c;
        }

        public final String c() {
            return this.f105886a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f105886a, cVar.f105886a) && Intrinsics.d(this.f105887b, cVar.f105887b) && Intrinsics.d(this.f105888c, cVar.f105888c);
        }

        public final int hashCode() {
            String str = this.f105886a;
            int b11 = G.g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.f105887b);
            D00.g gVar = this.f105888c;
            return b11 + (gVar != null ? gVar.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return E.a(this.f105887b.size(), "Incidents(incidents=", ")");
        }
    }

    /* renamed from: y00.a$d */
    public static final class d extends AbstractC10819a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f105889a = new d(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1725524792;
        }

        @NotNull
        public final String toString() {
            return "PageViewed";
        }
    }

    /* renamed from: y00.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC10819a {

        /* renamed from: a, reason: collision with root package name */
        private final String f105890a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f105891b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f105892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, @NotNull String originPage, @NotNull String deeplink) {
            super(0);
            Intrinsics.checkNotNullParameter(originPage, "originPage");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f105890a = str;
            this.f105891b = originPage;
            this.f105892c = deeplink;
        }

        @NotNull
        public final String a() {
            return this.f105892c;
        }

        @NotNull
        public final String b() {
            return this.f105891b;
        }

        public final String c() {
            return this.f105890a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.d(this.f105890a, eVar.f105890a) && Intrinsics.d(this.f105891b, eVar.f105891b) && Intrinsics.d(this.f105892c, eVar.f105892c);
        }

        public final int hashCode() {
            String str = this.f105890a;
            return this.f105892c.hashCode() + G.g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f105891b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Redirect(redirectKey=");
            sb2.append(this.f105890a);
            sb2.append(", originPage=");
            sb2.append(this.f105891b);
            sb2.append(", deeplink=");
            return o0.c(sb2, this.f105892c, ")");
        }
    }

    /* renamed from: y00.a$f */
    public static final class f extends AbstractC10819a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f105893a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@NotNull ArrayList overlayViewMapperKeys) {
            super(0);
            Intrinsics.checkNotNullParameter(overlayViewMapperKeys, "overlayViewMapperKeys");
            this.f105893a = overlayViewMapperKeys;
        }

        @NotNull
        public final List<Integer> a() {
            return this.f105893a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.d(this.f105893a, ((f) obj).f105893a);
        }

        public final int hashCode() {
            return this.f105893a.hashCode();
        }

        @NotNull
        public final String toString() {
            return Om.a(")", new StringBuilder("RefreshOverlayWidgets(overlayViewMapperKeys="), this.f105893a);
        }
    }

    /* renamed from: y00.a$g */
    public static final class g extends AbstractC10819a {

        /* renamed from: a, reason: collision with root package name */
        private final int f105894a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final A00.e f105895b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i11, @NotNull A00.e scrollEvent) {
            super(0);
            Intrinsics.checkNotNullParameter(scrollEvent, "scrollEvent");
            this.f105894a = i11;
            this.f105895b = scrollEvent;
            a.C.f fVar = a.C.f.f184a;
        }

        public final int a() {
            return this.f105894a;
        }

        @NotNull
        public final A00.e b() {
            return this.f105895b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f105894a == gVar.f105894a && Intrinsics.d(this.f105895b, gVar.f105895b);
        }

        public final int hashCode() {
            return this.f105895b.hashCode() + (this.f105894a * 31);
        }

        @NotNull
        public final String toString() {
            return "Scroll(position=" + this.f105894a + ", scrollEvent=" + this.f105895b + ")";
        }
    }

    public /* synthetic */ AbstractC10819a(int i11) {
        this();
    }

    private AbstractC10819a() {
    }
}
