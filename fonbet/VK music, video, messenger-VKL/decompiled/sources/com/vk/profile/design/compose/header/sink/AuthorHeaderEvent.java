package com.vk.profile.design.compose.header.sink;

import com.vk.profile.design.compose.buttons.ProfileButtons;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.itj0;
import xsna.zhf0;
import xsna.zrp;

/* compiled from: AuthorHeaderEvent.kt */
/* loaded from: classes5.dex */
public interface AuthorHeaderEvent {

    /* compiled from: AuthorHeaderEvent.kt */
    public interface Info extends AuthorHeaderEvent {

        /* compiled from: AuthorHeaderEvent.kt */
        public interface SubscribersClick extends Info {

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: AuthorHeaderEvent.kt */
            public static final class FilledAudienceClickTarget {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ FilledAudienceClickTarget[] $VALUES;
                public static final FilledAudienceClickTarget Friends;
                public static final FilledAudienceClickTarget SharedFriends;
                public static final FilledAudienceClickTarget Subscribers;

                static {
                    FilledAudienceClickTarget filledAudienceClickTarget = new FilledAudienceClickTarget("Friends", 0);
                    Friends = filledAudienceClickTarget;
                    FilledAudienceClickTarget filledAudienceClickTarget2 = new FilledAudienceClickTarget("SharedFriends", 1);
                    SharedFriends = filledAudienceClickTarget2;
                    FilledAudienceClickTarget filledAudienceClickTarget3 = new FilledAudienceClickTarget("Subscribers", 2);
                    Subscribers = filledAudienceClickTarget3;
                    FilledAudienceClickTarget[] filledAudienceClickTargetArr = {filledAudienceClickTarget, filledAudienceClickTarget2, filledAudienceClickTarget3};
                    $VALUES = filledAudienceClickTargetArr;
                    $ENTRIES = new asp(filledAudienceClickTargetArr);
                }

                public FilledAudienceClickTarget() {
                    throw null;
                }

                public static FilledAudienceClickTarget valueOf(String str) {
                    return (FilledAudienceClickTarget) Enum.valueOf(FilledAudienceClickTarget.class, str);
                }

                public static FilledAudienceClickTarget[] values() {
                    return (FilledAudienceClickTarget[]) $VALUES.clone();
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            public static final class a implements SubscribersClick {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -75920264;
                }

                public final String toString() {
                    return "FilledAudience";
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            public static final class b implements SubscribersClick {
                public final FilledAudienceClickTarget a;

                public b(FilledAudienceClickTarget filledAudienceClickTarget) {
                    this.a = filledAudienceClickTarget;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.a == ((b) obj).a;
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "FilledAudienceTarget(target=" + this.a + ')';
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            public static final class c implements SubscribersClick {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1132997914;
                }

                public final String toString() {
                    return "InviteFriends";
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            public static final class d implements SubscribersClick {
                public final zhf0 a;

                public d(zhf0 zhf0Var) {
                    this.a = zhf0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return itj0.c(new StringBuilder("ManageRelation(anchorInWindow="), this.a, ')');
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            public static final class e implements SubscribersClick {
                public static final e a = new e();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public final int hashCode() {
                    return 1267314520;
                }

                public final String toString() {
                    return "NoSubscribers";
                }
            }
        }

        /* compiled from: AuthorHeaderEvent.kt */
        public static final class a implements Info {
            public final AuthorHeaderConfig.Info.InfoSlotData.c a;

            public a(AuthorHeaderConfig.Info.InfoSlotData.c cVar) {
                this.a = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "AdditionalInfoClick(type=" + this.a + ')';
            }
        }

        /* compiled from: AuthorHeaderEvent.kt */
        public static final class b implements Info {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ArtistCardClick(artistId="), this.a, ')');
            }
        }

        /* compiled from: AuthorHeaderEvent.kt */
        public static final class c implements Info {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CuratorCardClick(curatorId="), this.a, ')');
            }
        }

        /* compiled from: AuthorHeaderEvent.kt */
        public static final class d implements Info {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -956891385;
            }

            public final String toString() {
                return "EmptyContactsClick";
            }
        }

        /* compiled from: AuthorHeaderEvent.kt */
        public static final class e implements Info {
            public final String a;

            public e(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("LinkClick(link="), this.a, ')');
            }
        }

        /* compiled from: AuthorHeaderEvent.kt */
        public static final class f implements Info {
            public final AuthorHeaderConfig.Info.InfoSlotData.TrustTag a;

            public f(AuthorHeaderConfig.Info.InfoSlotData.TrustTag trustTag) {
                this.a = trustTag;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "TrustTagClick(tag=" + this.a + ')';
            }
        }
    }

    /* compiled from: AuthorHeaderEvent.kt */
    public interface a extends AuthorHeaderEvent {

        /* compiled from: AuthorHeaderEvent.kt */
        /* renamed from: com.vk.profile.design.compose.header.sink.AuthorHeaderEvent$a$a, reason: collision with other inner class name */
        public interface InterfaceC1662a extends a {

            /* compiled from: AuthorHeaderEvent.kt */
            /* renamed from: com.vk.profile.design.compose.header.sink.AuthorHeaderEvent$a$a$a, reason: collision with other inner class name */
            public static final class C1663a implements InterfaceC1662a {
                public static final C1663a a = new C1663a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1663a);
                }

                public final int hashCode() {
                    return -1597132718;
                }

                public final String toString() {
                    return "APlus";
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            /* renamed from: com.vk.profile.design.compose.header.sink.AuthorHeaderEvent$a$a$b */
            public static final class b implements InterfaceC1662a {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1830785502;
                }

                public final String toString() {
                    return "Over16";
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            /* renamed from: com.vk.profile.design.compose.header.sink.AuthorHeaderEvent$a$a$c */
            public static final class c implements InterfaceC1662a {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return -1830785500;
                }

                public final String toString() {
                    return "Over18";
                }
            }
        }

        /* compiled from: AuthorHeaderEvent.kt */
        public static final class b implements a {
            public final ProfileButtons.ButtonType a;
            public final zhf0 b;

            public b(ProfileButtons.ButtonType buttonType, zhf0 zhf0Var) {
                this.a = buttonType;
                this.b = zhf0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ButtonClick(type=");
                sb.append(this.a);
                sb.append(", anchorInWindow=");
                return itj0.c(sb, this.b, ')');
            }
        }

        /* compiled from: AuthorHeaderEvent.kt */
        public interface c extends a {

            /* compiled from: AuthorHeaderEvent.kt */
            /* renamed from: com.vk.profile.design.compose.header.sink.AuthorHeaderEvent$a$c$a, reason: collision with other inner class name */
            public static final class C1664a implements c {
                public final zhf0 a;

                public C1664a(zhf0 zhf0Var) {
                    this.a = zhf0Var;
                }

                @Override // com.vk.profile.design.compose.header.sink.AuthorHeaderEvent.a.c
                public final zhf0 a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1664a) && epx.f(this.a, ((C1664a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return itj0.c(new StringBuilder("DefaultAvatar(anchorInWindow="), this.a, ')');
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            public static final class b implements c {
                public final zhf0 a;

                public b(zhf0 zhf0Var) {
                    this.a = zhf0Var;
                }

                @Override // com.vk.profile.design.compose.header.sink.AuthorHeaderEvent.a.c
                public final zhf0 a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return itj0.c(new StringBuilder("Empty(anchorInWindow="), this.a, ')');
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            /* renamed from: com.vk.profile.design.compose.header.sink.AuthorHeaderEvent$a$c$c, reason: collision with other inner class name */
            public static final class C1665c implements c {
                public final zhf0 a;

                public C1665c(zhf0 zhf0Var) {
                    this.a = zhf0Var;
                }

                @Override // com.vk.profile.design.compose.header.sink.AuthorHeaderEvent.a.c
                public final zhf0 a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1665c) && epx.f(this.a, ((C1665c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return itj0.c(new StringBuilder("Left(anchorInWindow="), this.a, ')');
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            public static final class d implements c {
                public final zhf0 a;

                public d(zhf0 zhf0Var) {
                    this.a = zhf0Var;
                }

                @Override // com.vk.profile.design.compose.header.sink.AuthorHeaderEvent.a.c
                public final zhf0 a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return itj0.c(new StringBuilder("LiveCover(anchorInWindow="), this.a, ')');
                }
            }

            /* compiled from: AuthorHeaderEvent.kt */
            public static final class e implements c {
                public final zhf0 a;

                public e(zhf0 zhf0Var) {
                    this.a = zhf0Var;
                }

                @Override // com.vk.profile.design.compose.header.sink.AuthorHeaderEvent.a.c
                public final zhf0 a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return itj0.c(new StringBuilder("Right(anchorInWindow="), this.a, ')');
                }
            }

            zhf0 a();
        }
    }
}
