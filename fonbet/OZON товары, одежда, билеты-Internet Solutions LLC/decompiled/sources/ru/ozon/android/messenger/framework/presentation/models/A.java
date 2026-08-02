package ru.ozon.android.messenger.framework.presentation.models;

import C.o0;
import Ve.Om;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class A {

    public static final class a extends A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final q f91413a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final x f91414b;

        /* renamed from: c, reason: collision with root package name */
        private final String f91415c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull q item, @NotNull x place, String str) {
            super(0);
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(place, "place");
            this.f91413a = item;
            this.f91414b = place;
            this.f91415c = str;
        }

        public final String a() {
            return this.f91415c;
        }

        @NotNull
        public final q b() {
            return this.f91413a;
        }

        @NotNull
        public final x c() {
            return this.f91414b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f91413a, aVar.f91413a) && this.f91414b == aVar.f91414b && Intrinsics.d(this.f91415c, aVar.f91415c);
        }

        public final int hashCode() {
            int hashCode = (this.f91414b.hashCode() + (this.f91413a.hashCode() * 31)) * 31;
            String str = this.f91415c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddItem(item=");
            sb2.append(this.f91413a);
            sb2.append(", place=");
            sb2.append(this.f91414b);
            sb2.append(", id=");
            return o0.c(sb2, this.f91415c, ")");
        }
    }

    public static final class b extends A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final q f91416a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull q item) {
            super(0);
            Intrinsics.checkNotNullParameter(item, "item");
            this.f91416a = item;
        }

        @NotNull
        public final q a() {
            return this.f91416a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f91416a, ((b) obj).f91416a);
        }

        public final int hashCode() {
            return this.f91416a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Notify(item=" + this.f91416a + ")";
        }
    }

    public static final class c extends A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f91417a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull ArrayList messages) {
            super(0);
            Intrinsics.checkNotNullParameter(messages, "messages");
            this.f91417a = messages;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f91417a, ((c) obj).f91417a);
        }

        public final int hashCode() {
            return this.f91417a.hashCode();
        }

        @NotNull
        public final String toString() {
            return Om.a(")", new StringBuilder("PinMessages(messages="), this.f91417a);
        }
    }

    public static final class d extends A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f91418a = new d(0);
    }

    public static final class e extends A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f91419a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull String id2) {
            super(0);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f91419a = id2;
        }

        @NotNull
        public final String a() {
            return this.f91419a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.d(this.f91419a, ((e) obj).f91419a);
        }

        public final int hashCode() {
            return this.f91419a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("RemoveItem(id="), this.f91419a, ")");
        }
    }

    public static final class f extends A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f91420a = new f(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -2070324876;
        }

        @NotNull
        public final String toString() {
            return "ResetCache";
        }
    }

    public static final class g extends A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final q f91421a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@NotNull q item) {
            super(0);
            Intrinsics.checkNotNullParameter(item, "item");
            this.f91421a = item;
        }

        @NotNull
        public final q a() {
            return this.f91421a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.d(this.f91421a, ((g) obj).f91421a);
        }

        public final int hashCode() {
            return this.f91421a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "UpdateBlock(item=" + this.f91421a + ")";
        }
    }

    public static final class h extends A {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final h f91422a = new h();

        private h() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -181147822;
        }

        @NotNull
        public final String toString() {
            return "UpdateCounter";
        }
    }

    public static final class i extends A {
        public i() {
            super(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            ((i) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        @NotNull
        public final String toString() {
            return "UserIsTyping(param=null)";
        }
    }

    public /* synthetic */ A(int i11) {
        this();
    }

    private A() {
    }
}
