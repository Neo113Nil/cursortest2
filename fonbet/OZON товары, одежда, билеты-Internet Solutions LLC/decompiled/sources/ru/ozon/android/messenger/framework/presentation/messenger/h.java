package ru.ozon.android.messenger.framework.presentation.messenger;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final b f91357a;

    public static final class a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final CharSequence f91358a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f91359b;

        /* renamed from: c, reason: collision with root package name */
        private final String f91360c;

        public b(@NotNull CharSequence message, String str, Integer num) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f91358a = message;
            this.f91359b = num;
            this.f91360c = str;
        }

        public final Integer a() {
            return this.f91359b;
        }

        @NotNull
        public final CharSequence b() {
            return this.f91358a;
        }

        public final String c() {
            return this.f91360c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f91358a, bVar.f91358a) && Intrinsics.d(this.f91359b, bVar.f91359b) && Intrinsics.d(this.f91360c, bVar.f91360c);
        }

        public final int hashCode() {
            int hashCode = this.f91358a.hashCode() * 31;
            Integer num = this.f91359b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f91360c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FlashBarData(message=");
            sb2.append((Object) this.f91358a);
            sb2.append(", iconRes=");
            sb2.append(this.f91359b);
            sb2.append(", tintColor=");
            return o0.c(sb2, this.f91360c, ")");
        }
    }

    public h() {
        this(null, null);
    }

    public static h a(h hVar, b bVar, int i11) {
        if ((i11 & 1) != 0) {
            bVar = hVar.f91357a;
        }
        if ((i11 & 2) != 0) {
            hVar.getClass();
        }
        if ((i11 & 4) != 0) {
            hVar.getClass();
        }
        hVar.getClass();
        return new h(bVar, null);
    }

    public final a b() {
        return null;
    }

    public final b c() {
        return this.f91357a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return Intrinsics.d(this.f91357a, ((h) obj).f91357a) && Intrinsics.d(null, null);
        }
        return false;
    }

    public final int hashCode() {
        b bVar = this.f91357a;
        return (bVar == null ? 0 : bVar.hashCode()) * 961;
    }

    @NotNull
    public final String toString() {
        return "MessengerState(flashBarData=" + this.f91357a + ", chatDetailData=" + ((Object) null) + ", noInternetNotification=null)";
    }

    public h(b bVar, a aVar) {
        this.f91357a = bVar;
    }
}
