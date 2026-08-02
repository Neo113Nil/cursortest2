package com.vk.superapp.multiaccount.api;

import com.vk.dto.common.id.UserId;
import com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationItem;
import com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationOptionItem;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeMultiaccountsItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkidEcosystemNavigationItem;
import java.util.Collections;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.gp;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.usi0;
import xsna.vu5;

/* compiled from: MultiAccountAnalytics.kt */
/* loaded from: classes11.dex */
public interface a {
    public static final b a = b.a;

    /* compiled from: MultiAccountAnalytics.kt */
    /* renamed from: com.vk.superapp.multiaccount.api.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1887a {
        boolean a();
    }

    /* compiled from: MultiAccountAnalytics.kt */
    /* loaded from: classes6.dex */
    public static final class c {
        public final UserSecurityStatus a;
        public final int b;
        public final int c;

        public c(UserSecurityStatus userSecurityStatus, int i, int i2) {
            this.a = userSecurityStatus;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Metadata(securityStatus=");
            sb.append(this.a);
            sb.append(", nftAvatarStatus=");
            sb.append(this.b);
            sb.append(", verifiedStatus=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: MultiAccountAnalytics.kt */
    /* loaded from: classes6.dex */
    public static final class e implements InterfaceC1887a {
        public final SchemeStatSak$TypeVkidEcosystemNavigationItem.Event a;
        public final SchemeStatSak$EventScreen b;
        public final List<SchemeStatSak$EcosystemNavigationOptionItem> c;
        public final SchemeStatSak$EcosystemNavigationItem d;
        public final c e;

        public e(SchemeStatSak$TypeVkidEcosystemNavigationItem.Event event, SchemeStatSak$EventScreen schemeStatSak$EventScreen, List list, SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem, c cVar) {
            this.a = event;
            this.b = schemeStatSak$EventScreen;
            this.c = list;
            this.d = schemeStatSak$EcosystemNavigationItem;
            this.e = cVar;
        }

        @Override // com.vk.superapp.multiaccount.api.a.InterfaceC1887a
        public final boolean a() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && epx.f(this.c, eVar.c) && this.d == eVar.d && epx.f(this.e, eVar.e);
        }

        public final int hashCode() {
            int a = fw3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem = this.d;
            int hashCode = (a + (schemeStatSak$EcosystemNavigationItem == null ? 0 : schemeStatSak$EcosystemNavigationItem.hashCode())) * 31;
            c cVar = this.e;
            return Boolean.hashCode(false) + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
        }

        public final String toString() {
            return "SendEcosystemData(event=" + this.a + ", eventScreen=" + this.b + ", options=" + this.c + ", item=" + this.d + ", metadata=" + this.e + ", mustInitialized=false)";
        }
    }

    void a(usi0.a aVar);

    void b(usi0.a aVar, UserId userId);

    void c(InterfaceC1887a interfaceC1887a);

    void clear();

    com.vk.superapp.multiaccount.api.c d();

    void e(f fVar);

    /* compiled from: MultiAccountAnalytics.kt */
    /* loaded from: classes6.dex */
    public static final class f {
        public final SchemeStatSak$EventScreen a;
        public final SchemeStatSak$TypeRegistrationItem.EventType b;
        public final UserId c;
        public final List<SchemeStatSak$RegistrationFieldItem> d;
        public final String e;

        public f(SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$TypeRegistrationItem.EventType eventType, UserId userId, SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem) {
            this(schemeStatSak$EventScreen, eventType, userId, Collections.singletonList(schemeStatSak$RegistrationFieldItem), null);
        }

        public final SchemeStatSak$TypeRegistrationItem.EventType a() {
            return this.b;
        }

        public final String b() {
            return this.e;
        }

        public final List<SchemeStatSak$RegistrationFieldItem> c() {
            return this.d;
        }

        public final SchemeStatSak$EventScreen d() {
            return this.a;
        }

        public final UserId e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && epx.f(this.e, fVar.e);
        }

        public final int hashCode() {
            SchemeStatSak$EventScreen schemeStatSak$EventScreen = this.a;
            int hashCode = (this.b.hashCode() + ((schemeStatSak$EventScreen == null ? 0 : schemeStatSak$EventScreen.hashCode()) * 31)) * 31;
            UserId userId = this.c;
            int a = fw3.a((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.d);
            String str = this.e;
            return a + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendRegistrationData(screenSend=");
            sb.append(this.a);
            sb.append(", eventType=");
            sb.append(this.b);
            sb.append(", userId=");
            sb.append(this.c);
            sb.append(", registrationFields=");
            sb.append(this.d);
            sb.append(", flowSource=");
            return ho8.a(sb, this.e, ')');
        }

        public f(SchemeStatSak$EventScreen schemeStatSak$EventScreen, SchemeStatSak$TypeRegistrationItem.EventType eventType, UserId userId, List<SchemeStatSak$RegistrationFieldItem> list, String str) {
            this.a = schemeStatSak$EventScreen;
            this.b = eventType;
            this.c = userId;
            this.d = list;
            this.e = str;
        }
    }

    /* compiled from: MultiAccountAnalytics.kt */
    /* loaded from: classes6.dex */
    public static final class d implements InterfaceC1887a {
        public final SchemeStatSak$TypeMultiaccountsItem.EventType a;
        public final SchemeStatSak$EventScreen b;
        public final UserId c;
        public final UserId d;
        public final int e;
        public final List<usi0.a> f;
        public final boolean g;
        public final MultiAccountEntryPoint h;
        public final UserId i;

        /* JADX WARN: Multi-variable type inference failed */
        public d(SchemeStatSak$TypeMultiaccountsItem.EventType eventType, SchemeStatSak$EventScreen schemeStatSak$EventScreen, UserId userId, UserId userId2, int i, List<? extends usi0.a> list, boolean z, MultiAccountEntryPoint multiAccountEntryPoint, UserId userId3) {
            this.a = eventType;
            this.b = schemeStatSak$EventScreen;
            this.c = userId;
            this.d = userId2;
            this.e = i;
            this.f = list;
            this.g = z;
            this.h = multiAccountEntryPoint;
            this.i = userId3;
        }

        @Override // com.vk.superapp.multiaccount.api.a.InterfaceC1887a
        public final boolean a() {
            return this.g;
        }

        public final List<usi0.a> b() {
            return this.f;
        }

        public final int c() {
            return this.e;
        }

        public final UserId d() {
            return this.c;
        }

        public final SchemeStatSak$EventScreen e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && this.e == dVar.e && epx.f(this.f, dVar.f) && this.g == dVar.g && epx.f(this.h, dVar.h) && epx.f(this.i, dVar.i);
        }

        public final SchemeStatSak$TypeMultiaccountsItem.EventType f() {
            return this.a;
        }

        public final MultiAccountEntryPoint g() {
            return this.h;
        }

        public final UserId h() {
            return this.i;
        }

        public final int hashCode() {
            int b = qoy.b(fw3.a(shy.a(this.e, bh10.a(bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.b), 31, this.d.b), 31), 31, this.f), 31, this.g);
            MultiAccountEntryPoint multiAccountEntryPoint = this.h;
            int hashCode = (b + (multiAccountEntryPoint == null ? 0 : multiAccountEntryPoint.hashCode())) * 31;
            UserId userId = this.i;
            return hashCode + (userId != null ? Long.hashCode(userId.b) : 0);
        }

        public final UserId i() {
            return this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendData(eventType=");
            sb.append(this.a);
            sb.append(", eventScreen=");
            sb.append(this.b);
            sb.append(", currentUserId=");
            sb.append(this.c);
            sb.append(", prevUserId=");
            sb.append(this.d);
            sb.append(", currentAccountsNum=");
            sb.append(this.e);
            sb.append(", authorizedSessions=");
            sb.append(this.f);
            sb.append(", mustInitialized=");
            sb.append(this.g);
            sb.append(", from=");
            sb.append(this.h);
            sb.append(", masterUserId=");
            return gp.b(sb, this.i, ')');
        }

        public /* synthetic */ d(SchemeStatSak$TypeMultiaccountsItem.EventType eventType, SchemeStatSak$EventScreen schemeStatSak$EventScreen, UserId userId, UserId userId2, int i, List list, boolean z, MultiAccountEntryPoint multiAccountEntryPoint, UserId userId3, int i2) {
            this(eventType, schemeStatSak$EventScreen, userId, userId2, i, list, z, (i2 & 128) != 0 ? null : multiAccountEntryPoint, (i2 & 256) != 0 ? null : userId3);
        }
    }

    /* compiled from: MultiAccountAnalytics.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public static final /* synthetic */ b a = new b();
        private static final a STUB = new C1888a();

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: MultiAccountAnalytics.kt */
        /* renamed from: com.vk.superapp.multiaccount.api.a$b$a, reason: collision with other inner class name */
        public static final class C1888a implements a {
            public final com.vk.superapp.multiaccount.api.c b = com.vk.superapp.multiaccount.api.c.a.getSTUB();

            @Override // com.vk.superapp.multiaccount.api.a
            public final com.vk.superapp.multiaccount.api.c d() {
                return this.b;
            }

            @Override // com.vk.superapp.multiaccount.api.a
            public final void clear() {
            }

            @Override // com.vk.superapp.multiaccount.api.a
            public final void a(usi0.a aVar) {
            }

            @Override // com.vk.superapp.multiaccount.api.a
            public final void c(InterfaceC1887a interfaceC1887a) {
            }

            @Override // com.vk.superapp.multiaccount.api.a
            public final void e(f fVar) {
            }

            @Override // com.vk.superapp.multiaccount.api.a
            public final void b(usi0.a aVar, UserId userId) {
            }
        }
    }
}
