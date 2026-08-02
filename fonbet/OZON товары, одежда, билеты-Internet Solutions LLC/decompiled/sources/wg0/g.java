package wg0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.notificationBar.presets.OziNotificationBarStatus;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f104533a;

    /* renamed from: b, reason: collision with root package name */
    private final a f104534b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f104535c;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f104536a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final OziNotificationBarStatus f104537b;

        /* renamed from: wg0.g$a$a, reason: collision with other inner class name */
        public static final class C2263a extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final C2263a f104538c = new C2263a("Вы уже на STG-окружении", OziNotificationBarStatus.Success);
        }

        public static final class b extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final b f104539c = new b("Не получилось отправить тестовый Fatal-ивент в Sentry. Переключитесь на STG-окружение.", OziNotificationBarStatus.Negative);
        }

        public static final class c extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final c f104540c = new c("Тестовый Fatal-ивент отправлен в Sentry", OziNotificationBarStatus.Success);
        }

        public static final class d extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final d f104541c = new d("Ошибка: не задан DSN при первичной инициализации Sentry в приложении", OziNotificationBarStatus.Negative);
        }

        public static final class e extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final e f104542c = new e("Не получилось отправить тестовый NonFatal-ивент в Sentry. Переключитесь на STG-окружение.", OziNotificationBarStatus.Negative);
        }

        public static final class f extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final f f104543c = new f("Тестовый NonFatal-ивент отправлен в Sentry", OziNotificationBarStatus.Success);
        }

        /* renamed from: wg0.g$a$g, reason: collision with other inner class name */
        public static final class C2264g extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            public static final C2264g f104544c = new C2264g("Переключитесь на STG-окружение для отправки ивента", OziNotificationBarStatus.Negative);
        }

        public static final class h extends a {

            /* renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f104545c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(@NotNull String errorMessage) {
                super(V.e.b(new Object[]{errorMessage}, 1, "Неизвестная ошибка: %s", "format(...)"), OziNotificationBarStatus.Negative);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f104545c = errorMessage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && Intrinsics.d(this.f104545c, ((h) obj).f104545c);
            }

            public final int hashCode() {
                return this.f104545c.hashCode();
            }

            @NotNull
            public final String toString() {
                return o0.c(new StringBuilder("UnknownError(errorMessage="), this.f104545c, ")");
            }
        }

        public a(String str, OziNotificationBarStatus oziNotificationBarStatus) {
            this.f104536a = str;
            this.f104537b = oziNotificationBarStatus;
        }

        @NotNull
        public final OziNotificationBarStatus a() {
            return this.f104537b;
        }

        @NotNull
        public final String b() {
            return this.f104536a;
        }
    }

    public g() {
        this(false, 7);
    }

    public static g a(g gVar, String eventMessage, a aVar, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            eventMessage = gVar.f104533a;
        }
        if ((i11 & 2) != 0) {
            aVar = gVar.f104534b;
        }
        if ((i11 & 4) != 0) {
            z11 = gVar.f104535c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(eventMessage, "eventMessage");
        return new g(eventMessage, aVar, z11);
    }

    @NotNull
    public final String b() {
        return this.f104533a;
    }

    public final a c() {
        return this.f104534b;
    }

    public final boolean d() {
        return this.f104535c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f104533a, gVar.f104533a) && Intrinsics.d(this.f104534b, gVar.f104534b) && this.f104535c == gVar.f104535c;
    }

    public final int hashCode() {
        int hashCode = this.f104533a.hashCode() * 31;
        a aVar = this.f104534b;
        return Boolean.hashCode(this.f104535c) + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SentryHelperDebugUiState(eventMessage=");
        sb2.append(this.f104533a);
        sb2.append(", notification=");
        sb2.append(this.f104534b);
        sb2.append(", isStg=");
        return Pk0.a.a(")", sb2, this.f104535c);
    }

    public g(@NotNull String eventMessage, a aVar, boolean z11) {
        Intrinsics.checkNotNullParameter(eventMessage, "eventMessage");
        this.f104533a = eventMessage;
        this.f104534b = aVar;
        this.f104535c = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ g(boolean z11, int i11) {
        this(r0, null, (i11 & 4) != 0 ? false : z11);
        String str;
        if ((i11 & 1) != 0) {
            str = "";
        } else {
            str = "Сообщение к ивенту";
        }
    }
}
