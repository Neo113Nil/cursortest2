package i10;

import T7.E;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class k<I extends C7854a> {

    public static final class b<I extends C7854a> extends k<I> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<I> f65745a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<? extends I> items) {
            super(0);
            Intrinsics.checkNotNullParameter(items, "items");
            this.f65745a = items;
            new AtomicBoolean(true);
        }

        @Override // i10.k
        @NotNull
        public final List<I> a() {
            return this.f65745a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f65745a, ((b) obj).f65745a);
        }

        public final int hashCode() {
            return this.f65745a.hashCode();
        }

        @NotNull
        public final String toString() {
            return E.a(this.f65745a.size(), "OverlayItemsContainer(itemsSize=", ")");
        }
    }

    public k(int i11) {
    }

    @NotNull
    public abstract List<I> a();

    public static final class a<I extends C7854a> extends k<I> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<I> f65741a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final AtomicBoolean f65742b;

        /* renamed from: c, reason: collision with root package name */
        private final I f65743c;

        /* renamed from: d, reason: collision with root package name */
        private final String f65744d;

        public /* synthetic */ a(int i11, String str, List list) {
            this(list, new AtomicBoolean(true), null, (i11 & 8) != 0 ? null : str);
        }

        public static a b(a aVar, List items, AtomicBoolean notify, C7854a c7854a, int i11) {
            if ((i11 & 1) != 0) {
                items = aVar.f65741a;
            }
            if ((i11 & 2) != 0) {
                notify = aVar.f65742b;
            }
            if ((i11 & 4) != 0) {
                c7854a = aVar.f65743c;
            }
            String str = (i11 & 8) != 0 ? aVar.f65744d : null;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(notify, "notify");
            return new a(items, notify, c7854a, str);
        }

        @Override // i10.k
        @NotNull
        public final List<I> a() {
            return this.f65741a;
        }

        public final I c() {
            return this.f65743c;
        }

        public final String d() {
            return this.f65744d;
        }

        @NotNull
        public final AtomicBoolean e() {
            return this.f65742b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f65741a, aVar.f65741a) && Intrinsics.d(this.f65742b, aVar.f65742b) && Intrinsics.d(this.f65743c, aVar.f65743c) && Intrinsics.d(this.f65744d, aVar.f65744d);
        }

        public final int hashCode() {
            int hashCode = (this.f65742b.hashCode() + (this.f65741a.hashCode() * 31)) * 31;
            I i11 = this.f65743c;
            int hashCode2 = (hashCode + (i11 == null ? 0 : i11.hashCode())) * 31;
            String str = this.f65744d;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "ListItemsContainer(itemsSize=" + this.f65741a.size() + ", bottomState=" + this.f65743c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull List<? extends I> items, @NotNull AtomicBoolean notify, I i11, String str) {
            super(0);
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(notify, "notify");
            this.f65741a = items;
            this.f65742b = notify;
            this.f65743c = i11;
            this.f65744d = str;
        }
    }
}
