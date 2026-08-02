package kc0;

import Ae.C0;
import Ae.InterfaceC2395h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r.o;
import ru.ozon.id.nativeauth.credentials.countryCode.PhoneCodeCountrySelectDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.data.models.b;

/* renamed from: kc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC7643a {

    /* renamed from: kc0.a$a, reason: collision with other inner class name */
    public static final class C1167a implements InterfaceC7643a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final OtpDTO.AgreementSheet f71309a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO f71310b;

        public C1167a(@NotNull OtpDTO.AgreementSheet dto, @NotNull FastEntryActionDTO action) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f71309a = dto;
            this.f71310b = action;
        }

        @NotNull
        public final FastEntryActionDTO a() {
            return this.f71310b;
        }

        @NotNull
        public final OtpDTO.AgreementSheet b() {
            return this.f71309a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1167a)) {
                return false;
            }
            C1167a c1167a = (C1167a) obj;
            return Intrinsics.d(this.f71309a, c1167a.f71309a) && Intrinsics.d(this.f71310b, c1167a.f71310b);
        }

        public final int hashCode() {
            return this.f71310b.hashCode() + (this.f71309a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ShowAgreementsSheet(dto=" + this.f71309a + ", action=" + this.f71310b + ")";
        }
    }

    /* renamed from: kc0.a$b */
    public static final class b implements InterfaceC7643a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO.FastEntryDataDTO.AuthCurtain f71311a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO.FastEntryDataDTO f71312b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final FastEntryActionDTO f71313c;

        public b(@NotNull FastEntryActionDTO.FastEntryDataDTO.AuthCurtain curtain, @NotNull FastEntryActionDTO.FastEntryDataDTO data, @NotNull FastEntryActionDTO action) {
            Intrinsics.checkNotNullParameter(curtain, "curtain");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f71311a = curtain;
            this.f71312b = data;
            this.f71313c = action;
        }

        @NotNull
        public final FastEntryActionDTO a() {
            return this.f71313c;
        }

        @NotNull
        public final FastEntryActionDTO.FastEntryDataDTO.AuthCurtain b() {
            return this.f71311a;
        }

        @NotNull
        public final FastEntryActionDTO.FastEntryDataDTO c() {
            return this.f71312b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f71311a, bVar.f71311a) && Intrinsics.d(this.f71312b, bVar.f71312b) && Intrinsics.d(this.f71313c, bVar.f71313c);
        }

        public final int hashCode() {
            return this.f71313c.hashCode() + ((this.f71312b.hashCode() + (this.f71311a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "ShowAuthCurtain(curtain=" + this.f71311a + ", data=" + this.f71312b + ", action=" + this.f71313c + ")";
        }
    }

    /* renamed from: kc0.a$c */
    public static final class c implements InterfaceC7643a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b.InterfaceC2133b.C2135b f71314a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final o.c f71315b;

        public c(@NotNull b.InterfaceC2133b.C2135b biometry, @NotNull o.c cryptoObject) {
            Intrinsics.checkNotNullParameter(biometry, "biometry");
            Intrinsics.checkNotNullParameter(cryptoObject, "cryptoObject");
            this.f71314a = biometry;
            this.f71315b = cryptoObject;
        }

        @NotNull
        public final b.InterfaceC2133b.C2135b a() {
            return this.f71314a;
        }

        @NotNull
        public final o.c b() {
            return this.f71315b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f71314a, cVar.f71314a) && Intrinsics.d(this.f71315b, cVar.f71315b);
        }

        public final int hashCode() {
            return this.f71315b.hashCode() + (this.f71314a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ShowBiometryDialog(biometry=" + this.f71314a + ", cryptoObject=" + this.f71315b + ")";
        }
    }

    /* renamed from: kc0.a$d */
    public static final class d implements InterfaceC7643a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C0 f71316a;

        /* renamed from: kc0.a$d$a, reason: collision with other inner class name */
        public static abstract class AbstractC1168a {

            /* renamed from: kc0.a$d$a$a, reason: collision with other inner class name */
            public static final class C1169a extends AbstractC1168a {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                public static final C1169a f71317a = new C1169a(0);
            }

            /* renamed from: kc0.a$d$a$b */
            public static final class b extends AbstractC1168a {

                /* renamed from: a, reason: collision with root package name */
                @NotNull
                private final PhoneCodeCountrySelectDTO f71318a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(@NotNull PhoneCodeCountrySelectDTO data) {
                    super(0);
                    Intrinsics.checkNotNullParameter(data, "data");
                    this.f71318a = data;
                }

                @NotNull
                public final PhoneCodeCountrySelectDTO a() {
                    return this.f71318a;
                }
            }

            public /* synthetic */ AbstractC1168a(int i11) {
                this();
            }

            private AbstractC1168a() {
            }
        }

        public d(@NotNull C0 dataFlow) {
            Intrinsics.checkNotNullParameter(dataFlow, "dataFlow");
            this.f71316a = dataFlow;
        }

        @NotNull
        public final InterfaceC2395h<AbstractC1168a> a() {
            return this.f71316a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f71316a.equals(((d) obj).f71316a);
        }

        public final int hashCode() {
            return this.f71316a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ShowCountryCodeSelector(dataFlow=" + this.f71316a + ")";
        }
    }

    /* renamed from: kc0.a$e */
    public static final class e implements InterfaceC7643a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f71319a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1431919883;
        }

        @NotNull
        public final String toString() {
            return "ShowCrossAppDialog";
        }
    }
}
