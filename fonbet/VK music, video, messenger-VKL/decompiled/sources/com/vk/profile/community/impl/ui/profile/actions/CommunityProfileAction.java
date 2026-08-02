package com.vk.profile.community.impl.ui.profile.actions;

import android.content.Intent;
import android.view.View;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.profile.Address;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import defpackage.q0;
import java.lang.ref.WeakReference;
import xsna.aih;
import xsna.asp;
import xsna.at;
import xsna.ay00;
import xsna.br;
import xsna.dfh;
import xsna.e8v0;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.kj50;
import xsna.nu50;
import xsna.omh;
import xsna.p8u;
import xsna.shy;
import xsna.t8q0;
import xsna.uqi;
import xsna.utb;
import xsna.uu50;
import xsna.vu5;
import xsna.wfh;
import xsna.yq;
import xsna.z4h;
import xsna.zrp;

/* compiled from: CommunityProfileAction.kt */
/* loaded from: classes5.dex */
public abstract class CommunityProfileAction implements kj50 {

    /* compiled from: CommunityProfileAction.kt */
    public static final class CommunityInternalMenuAction extends CommunityProfileAction {
        public final CommunityMenuActionType b;
        public final z4h.a c;
        public final Integer d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CommunityProfileAction.kt */
        public static final class CommunityMenuActionType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ CommunityMenuActionType[] $VALUES;
            public static final CommunityMenuActionType ADD_NEW_ITEM;
            public static final CommunityMenuActionType CLICK;
            public static final CommunityMenuActionType COPY;
            public static final CommunityMenuActionType DELETE_ITEM;
            public static final CommunityMenuActionType EDIT_ITEM;
            public static final CommunityMenuActionType EDIT_ORDER;
            public static final CommunityMenuActionType HIDE_APP;
            public static final CommunityMenuActionType HIDE_MENU;
            public static final CommunityMenuActionType LONG_CLICK;
            public static final CommunityMenuActionType OPEN_MENU;
            public static final CommunityMenuActionType SHARE;
            public static final CommunityMenuActionType UNHIDE_APP;
            public static final CommunityMenuActionType VIEW;

            static {
                CommunityMenuActionType communityMenuActionType = new CommunityMenuActionType("CLICK", 0);
                CLICK = communityMenuActionType;
                CommunityMenuActionType communityMenuActionType2 = new CommunityMenuActionType("LONG_CLICK", 1);
                LONG_CLICK = communityMenuActionType2;
                CommunityMenuActionType communityMenuActionType3 = new CommunityMenuActionType("COPY", 2);
                COPY = communityMenuActionType3;
                CommunityMenuActionType communityMenuActionType4 = new CommunityMenuActionType("SHARE", 3);
                SHARE = communityMenuActionType4;
                CommunityMenuActionType communityMenuActionType5 = new CommunityMenuActionType("VIEW", 4);
                VIEW = communityMenuActionType5;
                CommunityMenuActionType communityMenuActionType6 = new CommunityMenuActionType("EDIT_ITEM", 5);
                EDIT_ITEM = communityMenuActionType6;
                CommunityMenuActionType communityMenuActionType7 = new CommunityMenuActionType("DELETE_ITEM", 6);
                DELETE_ITEM = communityMenuActionType7;
                CommunityMenuActionType communityMenuActionType8 = new CommunityMenuActionType("ADD_NEW_ITEM", 7);
                ADD_NEW_ITEM = communityMenuActionType8;
                CommunityMenuActionType communityMenuActionType9 = new CommunityMenuActionType("EDIT_ORDER", 8);
                EDIT_ORDER = communityMenuActionType9;
                CommunityMenuActionType communityMenuActionType10 = new CommunityMenuActionType("HIDE_MENU", 9);
                HIDE_MENU = communityMenuActionType10;
                CommunityMenuActionType communityMenuActionType11 = new CommunityMenuActionType("UNHIDE_APP", 10);
                UNHIDE_APP = communityMenuActionType11;
                CommunityMenuActionType communityMenuActionType12 = new CommunityMenuActionType("HIDE_APP", 11);
                HIDE_APP = communityMenuActionType12;
                CommunityMenuActionType communityMenuActionType13 = new CommunityMenuActionType("OPEN_MENU", 12);
                OPEN_MENU = communityMenuActionType13;
                CommunityMenuActionType[] communityMenuActionTypeArr = {communityMenuActionType, communityMenuActionType2, communityMenuActionType3, communityMenuActionType4, communityMenuActionType5, communityMenuActionType6, communityMenuActionType7, communityMenuActionType8, communityMenuActionType9, communityMenuActionType10, communityMenuActionType11, communityMenuActionType12, communityMenuActionType13};
                $VALUES = communityMenuActionTypeArr;
                $ENTRIES = new asp(communityMenuActionTypeArr);
            }

            public CommunityMenuActionType() {
                throw null;
            }

            public static CommunityMenuActionType valueOf(String str) {
                return (CommunityMenuActionType) Enum.valueOf(CommunityMenuActionType.class, str);
            }

            public static CommunityMenuActionType[] values() {
                return (CommunityMenuActionType[]) $VALUES.clone();
            }
        }

        public CommunityInternalMenuAction(CommunityMenuActionType communityMenuActionType, z4h.a aVar, Integer num) {
            this.b = communityMenuActionType;
            this.c = aVar;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommunityInternalMenuAction)) {
                return false;
            }
            CommunityInternalMenuAction communityInternalMenuAction = (CommunityInternalMenuAction) obj;
            return this.b == communityInternalMenuAction.b && epx.f(this.c, communityInternalMenuAction.c) && epx.f(this.d, communityInternalMenuAction.d);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            z4h.a aVar = this.c;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Integer num = this.d;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommunityInternalMenuAction(type=");
            sb.append(this.b);
            sb.append(", item=");
            sb.append(this.c);
            sb.append(", position=");
            return uqi.b(sb, this.d, ')');
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class MiniAppMenuResultSnackBar extends CommunityProfileAction {
        public final MenuSnackBarType b;
        public final boolean c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CommunityProfileAction.kt */
        public static final class MenuSnackBarType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ MenuSnackBarType[] $VALUES;
            public static final MenuSnackBarType ADD_ITEM;
            public static final MenuSnackBarType EDIT_ITEM;
            public static final MenuSnackBarType REORDER;

            static {
                MenuSnackBarType menuSnackBarType = new MenuSnackBarType("REORDER", 0);
                REORDER = menuSnackBarType;
                MenuSnackBarType menuSnackBarType2 = new MenuSnackBarType("ADD_ITEM", 1);
                ADD_ITEM = menuSnackBarType2;
                MenuSnackBarType menuSnackBarType3 = new MenuSnackBarType("EDIT_ITEM", 2);
                EDIT_ITEM = menuSnackBarType3;
                MenuSnackBarType[] menuSnackBarTypeArr = {menuSnackBarType, menuSnackBarType2, menuSnackBarType3};
                $VALUES = menuSnackBarTypeArr;
                $ENTRIES = new asp(menuSnackBarTypeArr);
            }

            public MenuSnackBarType() {
                throw null;
            }

            public static MenuSnackBarType valueOf(String str) {
                return (MenuSnackBarType) Enum.valueOf(MenuSnackBarType.class, str);
            }

            public static MenuSnackBarType[] values() {
                return (MenuSnackBarType[]) $VALUES.clone();
            }
        }

        public MiniAppMenuResultSnackBar(MenuSnackBarType menuSnackBarType, boolean z) {
            this.b = menuSnackBarType;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MiniAppMenuResultSnackBar)) {
                return false;
            }
            MiniAppMenuResultSnackBar miniAppMenuResultSnackBar = (MiniAppMenuResultSnackBar) obj;
            return this.b == miniAppMenuResultSnackBar.b && this.c == miniAppMenuResultSnackBar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MiniAppMenuResultSnackBar(type=");
            sb.append(this.b);
            sb.append(", isSuccess=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static abstract class a extends CommunityProfileAction {

        /* compiled from: CommunityProfileAction.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$a$a, reason: collision with other inner class name */
        public static final class C1567a extends a {
            public final String b;

            public C1567a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1567a) && epx.f(this.b, ((C1567a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Hide(id="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class b extends a {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OnUrlButtonClick(url="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class c extends a {
            public final boolean b;

            public c(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("ProfileLoaded(isFromCache="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class d extends a {
            public final boolean b;

            public d(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.b == ((d) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("ProfileReloaded(isFromCache="), this.b, ')');
            }
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static abstract class a0 extends CommunityProfileAction {

        /* compiled from: CommunityProfileAction.kt */
        public static final class a extends a0 {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1703839660;
            }

            public final String toString() {
                return "CreationOnboardingTooltipShown";
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class b extends a0 {
            public final Post b;

            public b(Post post) {
                this.b = post;
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class c extends a0 {
            public final int b;
            public final int c;
            public final int d;

            public c(int i, int i2, int i3) {
                this.b = i;
                this.c = i2;
                this.d = i3;
            }
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class b extends CommunityProfileAction {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("AuthorHeaderMediaPageSettled(pageIndex="), 0, ')');
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static abstract class b0 extends CommunityProfileAction {

        /* compiled from: CommunityProfileAction.kt */
        public static final class a extends b0 {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1433754609;
            }

            public final String toString() {
                return "Activate";
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class b extends b0 {
            public final String b;

            public b() {
                this(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("QueryChanged(query="), this.b, ')');
            }

            public b(String str) {
                this.b = str;
            }

            public /* synthetic */ b(int i) {
                this("");
            }
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static abstract class c extends CommunityProfileAction {

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class a extends c {

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$a$a, reason: collision with other inner class name */
            public static final class C1568a extends a {
                public static final C1568a b = new C1568a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1568a);
                }

                public final int hashCode() {
                    return 98396527;
                }

                public final String toString() {
                    return "APlus";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends a {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 910935625;
                }

                public final String toString() {
                    return "AgeWarning";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$a$c, reason: collision with other inner class name */
            public static final class C1569c extends a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1569c)) {
                        return false;
                    }
                    ((C1569c) obj).getClass();
                    return epx.f(null, null) && epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(actionTag=");
                    sb.append((Object) null);
                    sb.append(", parentView=");
                    sb.append((Object) null);
                    sb.append(", anchorRect=");
                    return yq.c(sb, null, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class d extends a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    ((d) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "VerificationClick(verification=" + ((Object) null) + ')';
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class b extends c {

            /* compiled from: CommunityProfileAction.kt */
            public static final class a extends b {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 1121019593;
                }

                public final String toString() {
                    return "AddContacts";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$b$b, reason: collision with other inner class name */
            public static final class C1570b extends b {
                public static final C1570b b = new C1570b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1570b);
                }

                public final int hashCode() {
                    return 1157718470;
                }

                public final String toString() {
                    return "AddDescription";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$b$c, reason: collision with other inner class name */
            public static final class C1571c extends b {
                public static final C1571c b = new C1571c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1571c);
                }

                public final int hashCode() {
                    return 712239041;
                }

                public final String toString() {
                    return "InviteFriends";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class d extends b {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    ((d) obj).getClass();
                    return epx.f(null, null) && epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ManageRelation(parentView=");
                    sb.append((Object) null);
                    sb.append(", anchorRect=");
                    return yq.c(sb, null, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class e extends b {
                public static final e b = new e();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public final int hashCode() {
                    return 846555647;
                }

                public final String toString() {
                    return "NoSubscribers";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class f extends b {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    ((f) obj).getClass();
                    return epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("OpenArtistCard(artistId="), null, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class g extends b {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof g)) {
                        return false;
                    }
                    ((g) obj).getClass();
                    return epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("OpenCuratorCard(curatorId="), null, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class h extends b {
                public static final h b = new h();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof h);
                }

                public final int hashCode() {
                    return 20315666;
                }

                public final String toString() {
                    return "OpenDetailsSheet";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class i extends b {
                public static final i b = new i();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof i);
                }

                public final int hashCode() {
                    return -880161244;
                }

                public final String toString() {
                    return "OpenMembers";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class j extends b {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof j)) {
                        return false;
                    }
                    ((j) obj).getClass();
                    return epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("OpenUrl(link="), null, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class k extends b {
                public static final k b = new k();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof k);
                }

                public final int hashCode() {
                    return 1528177295;
                }

                public final String toString() {
                    return "TrustMarksClick";
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$c, reason: collision with other inner class name */
        public static abstract class AbstractC1572c extends c {

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$c$a */
            public static final class a extends AbstractC1572c {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1164039746;
                }

                public final String toString() {
                    return "Avatar";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$c$b */
            public static final class b extends AbstractC1572c {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -56283998;
                }

                public final String toString() {
                    return "ChangeCover";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$c$c, reason: collision with other inner class name */
            public static final class C1573c extends AbstractC1572c {
                public static final C1573c b = new C1573c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1573c);
                }

                public final int hashCode() {
                    return 1141751486;
                }

                public final String toString() {
                    return "ChangeProfilePhoto";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$c$d */
            public static final class d extends AbstractC1572c {
                public final boolean b = true;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && this.b == ((d) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("DeleteCover(isLiveCover="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$c$e */
            public static final class e extends AbstractC1572c {
                public static final e b = new e();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public final int hashCode() {
                    return 393416761;
                }

                public final String toString() {
                    return "DeleteProfilePhoto";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$c$f */
            public static final class f extends AbstractC1572c {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    ((f) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    return Boolean.hashCode(false);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("LiveCoverUpdateDialog(isDialogShown="), false, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$c$g */
            public static final class g extends AbstractC1572c {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof g)) {
                        return false;
                    }
                    ((g) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    return Boolean.hashCode(false) + (Integer.hashCode(0) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OpenProfilePhotos(photoPosition=");
                    sb.append(0);
                    sb.append(", withAnalyticsTrack=");
                    return q0.a(sb, false, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$c$h */
            public static final class h extends AbstractC1572c {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof h)) {
                        return false;
                    }
                    ((h) obj).getClass();
                    return epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OpenStories(anchorView=");
                    sb.append((Object) null);
                    sb.append(", withAnalyticsTrack=");
                    return q0.a(sb, false, ')');
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class d extends c {

            /* compiled from: CommunityProfileAction.kt */
            public static final class a extends d {
                public final boolean b = false;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.b == ((a) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("Back(useDefaultNativeNavigation="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends d {
                public final boolean b = false;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.b == ((b) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("Join(fromRedesignedButton="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$d$c, reason: collision with other inner class name */
            public static final class C1574c extends d {
                public static final C1574c b = new C1574c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1574c);
                }

                public final int hashCode() {
                    return 863418812;
                }

                public final String toString() {
                    return "Leave";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$c$d$d, reason: collision with other inner class name */
            public static final class C1575d extends d {
                public static final C1575d b = new C1575d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1575d);
                }

                public final int hashCode() {
                    return 1021481728;
                }

                public final String toString() {
                    return "Manage";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class e extends d {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    ((e) obj).getClass();
                    return epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return yq.c(new StringBuilder("Notifications(anchorRect="), null, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class f extends d {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    ((f) obj).getClass();
                    return epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return yq.c(new StringBuilder("OverflowMenu(anchorRect="), null, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class g extends d {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof g)) {
                        return false;
                    }
                    ((g) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    return Boolean.hashCode(false);
                }

                public final String toString() {
                    return "Search(isVoice=false)";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static abstract class h extends d {

                /* compiled from: CommunityProfileAction.kt */
                public static final class a extends h {
                    public static final a b = new a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof a);
                    }

                    public final int hashCode() {
                        return -45053518;
                    }

                    public final String toString() {
                        return "Create";
                    }
                }

                /* compiled from: CommunityProfileAction.kt */
                public static final class b extends h {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        ((b) obj).getClass();
                        return epx.f(null, null);
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        return "Open(anchorView=" + ((Object) null) + ')';
                    }
                }
            }
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class d extends CommunityProfileAction {
        public final Intent b;

        public d(Intent intent) {
            this.b = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            Intent intent = this.b;
            if (intent == null) {
                return 0;
            }
            return intent.hashCode();
        }

        public final String toString() {
            return "BroadcastReceived(intent=" + this.b + ')';
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static abstract class e extends CommunityProfileAction {

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class a extends e {

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$a$a, reason: collision with other inner class name */
            public static final class C1576a extends a {
                public final String b;
                public final String c;

                public C1576a(String str, String str2) {
                    this.b = str;
                    this.c = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1576a)) {
                        return false;
                    }
                    C1576a c1576a = (C1576a) obj;
                    return epx.f(this.b, c1576a.b) && epx.f(this.c, c1576a.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(url=");
                    sb.append(this.b);
                    sb.append(", hintId=");
                    return ho8.a(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends a {
                public final String b;

                public b(String str) {
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Dismiss(hintId="), this.b, ')');
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class b extends e {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 2081225053;
            }

            public final String toString() {
                return "ChannelPost";
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class c extends e {

            /* compiled from: CommunityProfileAction.kt */
            public static final class a extends c {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 1222065658;
                }

                public final String toString() {
                    return "Click";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends c {
                public final UserId b;

                public b(UserId userId) {
                    this.b = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
                }

                public final int hashCode() {
                    return Long.hashCode(this.b.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("Dismiss(groupId="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$c$c, reason: collision with other inner class name */
            public static final class C1577c extends c {
                public final UserId b;
                public final boolean c;

                public C1577c(UserId userId, boolean z) {
                    this.b = userId;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1577c)) {
                        return false;
                    }
                    C1577c c1577c = (C1577c) obj;
                    return epx.f(this.b, c1577c.b) && this.c == c1577c.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("SkipConfirmed(groupId=");
                    sb.append(this.b);
                    sb.append(", skipAll=");
                    return q0.a(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static abstract class d extends c {

                /* compiled from: CommunityProfileAction.kt */
                public static final class a extends d {
                    public static final a b = new a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof a);
                    }

                    public final int hashCode() {
                        return 1100393776;
                    }

                    public final String toString() {
                        return "Ads";
                    }
                }

                /* compiled from: CommunityProfileAction.kt */
                public static final class b extends d {
                    public static final b b = new b();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof b);
                    }

                    public final int hashCode() {
                        return -1638187815;
                    }

                    public final String toString() {
                        return "Avatar";
                    }
                }

                /* compiled from: CommunityProfileAction.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$c$d$c, reason: collision with other inner class name */
                public static final class C1578c extends d {
                    public static final C1578c b = new C1578c();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1578c);
                    }

                    public final int hashCode() {
                        return -1952573280;
                    }

                    public final String toString() {
                        return "Contact";
                    }
                }

                /* compiled from: CommunityProfileAction.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$c$d$d, reason: collision with other inner class name */
                public static final class C1579d extends d {
                    public static final C1579d b = new C1579d();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1579d);
                    }

                    public final int hashCode() {
                        return 918644791;
                    }

                    public final String toString() {
                        return "Cover";
                    }
                }

                /* compiled from: CommunityProfileAction.kt */
                /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$c$d$e, reason: collision with other inner class name */
                public static final class C1580e extends d {
                    public static final C1580e b = new C1580e();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1580e);
                    }

                    public final int hashCode() {
                        return 1100396176;
                    }

                    public final String toString() {
                        return "Cta";
                    }
                }

                /* compiled from: CommunityProfileAction.kt */
                public static final class f extends d {
                    public static final f b = new f();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof f);
                    }

                    public final int hashCode() {
                        return 2123249788;
                    }

                    public final String toString() {
                        return "Description";
                    }
                }

                /* compiled from: CommunityProfileAction.kt */
                public static final class g extends d {
                    public static final g b = new g();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof g);
                    }

                    public final int hashCode() {
                        return 1081393519;
                    }

                    public final String toString() {
                        return "Product";
                    }
                }

                /* compiled from: CommunityProfileAction.kt */
                public static final class h extends d {
                    public static final h b = new h();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof h);
                    }

                    public final int hashCode() {
                        return -919946443;
                    }

                    public final String toString() {
                        return "Service";
                    }
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class d extends e {

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends d {
                public final Address b;
                public final boolean c;

                public b(Address address, boolean z) {
                    this.b = address;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.b, bVar.b) && this.c == bVar.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Addresses(address=");
                    sb.append(this.b);
                    sb.append(", isOldAddress=");
                    return q0.a(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class c extends d {
                public final Artist b;

                public c(Artist artist) {
                    this.b = artist;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "Artists(artist=" + this.b + ')';
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$d$d, reason: collision with other inner class name */
            public static final class C1581d extends d {
                public final Integer b;

                public C1581d(Integer num) {
                    this.b = num;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1581d) && epx.f(this.b, ((C1581d) obj).b);
                }

                public final int hashCode() {
                    Integer num = this.b;
                    if (num == null) {
                        return 0;
                    }
                    return num.hashCode();
                }

                public final String toString() {
                    return uqi.b(new StringBuilder("Avito(status="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$d$e, reason: collision with other inner class name */
            public static final class C1582e extends d {
                public final ExtendedCommunityProfile b;

                public C1582e(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.b = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1582e) && epx.f(this.b, ((C1582e) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("History(community="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class f extends d {
                public static final f b = new f();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public final int hashCode() {
                    return 1553635904;
                }

                public final String toString() {
                    return "ShopConditions";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class a extends d {
                public final boolean b;

                public a(boolean z) {
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.b == ((a) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("APlus(reopenDetailsOnDismiss="), this.b, ')');
                }

                public a() {
                    this(false);
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e, reason: collision with other inner class name */
        public static abstract class AbstractC1583e extends CommunityProfileAction {

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$a */
            public static final class a extends AbstractC1583e {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -2055971496;
                }

                public final String toString() {
                    return "AgeWarning";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$b */
            public static final class b extends AbstractC1583e {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -631852396;
                }

                public final String toString() {
                    return "Avatar";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$c */
            public static final class c extends AbstractC1583e {
                public final ExtendedCommunityProfile b;
                public final String c;

                public c(ExtendedCommunityProfile extendedCommunityProfile, String str) {
                    this.b = extendedCommunityProfile;
                    this.c = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
                }

                public final int hashCode() {
                    int hashCode = this.b.hashCode() * 31;
                    String str = this.c;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CallTo(community=");
                    sb.append(this.b);
                    sb.append(", source=");
                    return ho8.a(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$d */
            public static final class d extends AbstractC1583e {
                public static final d b = new d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return -1933461868;
                }

                public final String toString() {
                    return "ChangeProfilePhoto";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$e, reason: collision with other inner class name */
            public static final class C1584e extends AbstractC1583e {
                public static final C1584e b = new C1584e();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1584e);
                }

                public final int hashCode() {
                    return 264155247;
                }

                public final String toString() {
                    return "CreateReview";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$f */
            public static final class f extends AbstractC1583e {
                public static final f b = new f();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public final int hashCode() {
                    return -1237040898;
                }

                public final String toString() {
                    return "CreateStory";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$g */
            public static final class g extends AbstractC1583e {
                public static final g b = new g();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof g);
                }

                public final int hashCode() {
                    return 1613170703;
                }

                public final String toString() {
                    return "DeleteProfilePhoto";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$h */
            public static final class h extends AbstractC1583e {
                public final ExtendedCommunityProfile b;

                public h(ExtendedCommunityProfile extendedCommunityProfile) {
                    this.b = extendedCommunityProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return at.a(new StringBuilder("DeleteProfilePhotoConfirmed(community="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$i */
            public static final class i extends AbstractC1583e {
                public static final i b = new i();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof i);
                }

                public final int hashCode() {
                    return -2138461007;
                }

                public final String toString() {
                    return "InviteFriends";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$j */
            public static final class j extends AbstractC1583e {
                public static final j b = new j();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof j);
                }

                public final int hashCode() {
                    return 1688864352;
                }

                public final String toString() {
                    return "OnTrustMarksClick";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$k */
            public static final class k extends AbstractC1583e {
                public static final k b = new k();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof k);
                }

                public final int hashCode() {
                    return -1596831882;
                }

                public final String toString() {
                    return "OpenAdminMessages";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$l */
            public static final class l extends AbstractC1583e {
                public static final l b = new l();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof l);
                }

                public final int hashCode() {
                    return -796470494;
                }

                public final String toString() {
                    return "OpenDetailsSheet";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$m */
            public static final class m extends AbstractC1583e {
                public static final m b = new m();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof m);
                }

                public final int hashCode() {
                    return -1021960481;
                }

                public final String toString() {
                    return "OpenGovernmentOrganizationInfoDialog";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$n */
            public static final class n extends AbstractC1583e {
                public static final n b = new n();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof n);
                }

                public final int hashCode() {
                    return 962869088;
                }

                public final String toString() {
                    return "OpenNonProfitOrganizationInfoModal";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$o */
            public static final class o extends AbstractC1583e {
                public final boolean b;

                public o(boolean z) {
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof o) && this.b == ((o) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("OpenProfilePhotos(withAnalyticsTrack="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$p */
            public static final class p extends AbstractC1583e {
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$q */
            public static final class q extends AbstractC1583e {
                public final View b;
                public final String c;
                public final boolean d;

                public q(String str, View view, boolean z) {
                    this.b = view;
                    this.c = str;
                    this.d = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof q)) {
                        return false;
                    }
                    q qVar = (q) obj;
                    return epx.f(this.b, qVar.b) && epx.f(this.c, qVar.c) && this.d == qVar.d;
                }

                public final int hashCode() {
                    int hashCode = this.b.hashCode() * 31;
                    String str = this.c;
                    return Boolean.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OpenStories(anchorView=");
                    sb.append(this.b);
                    sb.append(", ref=");
                    sb.append(this.c);
                    sb.append(", withAnalyticsTrack=");
                    return q0.a(sb, this.d, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$r */
            public static final class r extends AbstractC1583e {
                public static final r b = new r();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof r);
                }

                public final int hashCode() {
                    return 650075976;
                }

                public final String toString() {
                    return "OpenVerifiedNonProfitOrganizationInfoModal";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$e$s */
            public static final class s extends AbstractC1583e {
                public static final s b = new s();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof s);
                }

                public final int hashCode() {
                    return -1320275884;
                }

                public final String toString() {
                    return "OpenVerifyBcs";
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class f extends e {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 191234371;
            }

            public final String toString() {
                return "LiveVideosReload";
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class g extends e {

            /* compiled from: CommunityProfileAction.kt */
            public static final class a extends g {
                public final e8v0 b;

                public a(e8v0 e8v0Var) {
                    this.b = e8v0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                }

                public final int hashCode() {
                    e8v0 e8v0Var = this.b;
                    if (e8v0Var == null) {
                        return 0;
                    }
                    return e8v0Var.hashCode();
                }

                public final String toString() {
                    return "Dismiss(event=" + this.b + ')';
                }

                public a() {
                    this(null);
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends g {
                public final e8v0 b;

                public b(e8v0.m mVar) {
                    this.b = mVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
                }

                public final int hashCode() {
                    e8v0 e8v0Var = this.b;
                    if (e8v0Var == null) {
                        return 0;
                    }
                    return e8v0Var.hashCode();
                }

                public final String toString() {
                    return "Open(event=" + this.b + ')';
                }

                public b() {
                    this(null);
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class h extends e {
            public final UserId b;

            public h(UserId userId) {
                this.b = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("TabsOrderSettingsButtonClicked(communityId="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class i extends e {

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends i {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1675942142;
                }

                public final String toString() {
                    return "Leave";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class c extends i {
                public static final c b = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 439901182;
                }

                public final String toString() {
                    return "Manage";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class d extends i {
                public static final d b = new d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return 608282168;
                }

                public final String toString() {
                    return "Menu";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class f extends i {
                public static final f b = new f();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public final int hashCode() {
                    return 963307567;
                }

                public final String toString() {
                    return "Notifications";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class g extends i {
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class a extends i {
                public final boolean b;

                public a(boolean z) {
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.b == ((a) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("Join(fromRedesignedButton="), this.b, ')');
                }

                public a() {
                    this(false);
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$e$i$e, reason: collision with other inner class name */
            public static final class C1585e extends i {
                public final boolean b;

                public C1585e(boolean z) {
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1585e) && this.b == ((C1585e) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("Navigation(useDefaultNativeNavigation="), this.b, ')');
                }

                public C1585e() {
                    this(false);
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class j extends e {

            /* compiled from: CommunityProfileAction.kt */
            public static final class a extends j {
                public final String b;
                public final String c = "COMMUNITY_TRUST_MARKS";

                public a(String str) {
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnPhoneClick(phone=");
                    sb.append(this.b);
                    sb.append(", sourceScreenName=");
                    return ho8.a(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends j {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 126690830;
                }

                public final String toString() {
                    return "OnShowAllLinks";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class c extends j {
                public final String b = "COMMUNITY_TRUST_MARKS";

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("OnYClientsClick(sourceScreenName="), this.b, ')');
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class k extends e {
            public static final k b = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return -1904487445;
            }

            public final String toString() {
                return "Unsubscribe";
            }
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static abstract class f extends CommunityProfileAction {
        public final CommunityProfileContentItem b;

        /* compiled from: CommunityProfileAction.kt */
        public static final class a extends f {
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class b extends f {
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class c extends f {
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class d extends f {
            public final CommunityProfileContentItem c;
            public final wfh d;
            public final WeakReference<View> e;
            public final int f;

            public d(CommunityProfileContentItem communityProfileContentItem, wfh wfhVar, WeakReference<View> weakReference, int i) {
                super(communityProfileContentItem);
                this.c = communityProfileContentItem;
                this.d = wfhVar;
                this.e = weakReference;
                this.f = i;
            }

            @Override // com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction.f
            public final CommunityProfileContentItem a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && this.f == dVar.f;
            }

            public final int hashCode() {
                int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
                WeakReference<View> weakReference = this.e;
                return Integer.hashCode(this.f) + ((hashCode + (weakReference == null ? 0 : weakReference.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TabContentClicked(contentItem=");
                sb.append(this.c);
                sb.append(", target=");
                sb.append(this.d);
                sb.append(", anchor=");
                sb.append(this.e);
                sb.append(", positionOffset=");
                return vu5.b(sb, this.f, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class e extends f {
            public final omh<?> c;
            public final CommunityProfileContentItem d;

            public e() {
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public e(omh omhVar) {
                super(r0);
                CommunityProfileContentItem a = omhVar.a();
                this.c = omhVar;
                this.d = a;
            }

            @Override // com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction.f
            public final CommunityProfileContentItem a() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TabContentCtaButtonClicked(target=");
                sb.append(this.c);
                sb.append(", contentItem=");
                return io.reactivex.rxjava3.subjects.b.c(sb, this.d, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$f$f, reason: collision with other inner class name */
        public static final class C1586f extends f {
            public final aih<?> c;
            public final CommunityProfileContentItem d;

            public C1586f() {
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C1586f(aih aihVar) {
                super(r0);
                CommunityProfileContentItem a = aihVar.a();
                this.c = aihVar;
                this.d = a;
            }

            @Override // com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction.f
            public final CommunityProfileContentItem a() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1586f)) {
                    return false;
                }
                C1586f c1586f = (C1586f) obj;
                return epx.f(this.c, c1586f.c) && epx.f(this.d, c1586f.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TabContentFaveClicked(target=");
                sb.append(this.c);
                sb.append(", contentItem=");
                return io.reactivex.rxjava3.subjects.b.c(sb, this.d, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class g extends f {
            public final utb c;
            public final CommunityProfileContentItem d;

            public g() {
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public g(utb utbVar) {
                super(r0);
                p8u p8uVar = (p8u) utbVar.b;
                this.c = utbVar;
                this.d = p8uVar;
            }

            @Override // com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction.f
            public final CommunityProfileContentItem a() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TabContentInfoBlockClick(target=");
                sb.append(this.c);
                sb.append(", contentItem=");
                return io.reactivex.rxjava3.subjects.b.c(sb, this.d, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class h extends f {
            public final nu50 c;
            public final CommunityProfileContentItem d;

            public h() {
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public h(nu50 nu50Var) {
                super(r0);
                uu50 uu50Var = nu50Var.c;
                this.c = nu50Var;
                this.d = uu50Var;
            }

            @Override // com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction.f
            public final CommunityProfileContentItem a() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.c, hVar.c) && epx.f(this.d, hVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TabContentLongClicked(target=");
                sb.append(this.c);
                sb.append(", contentItem=");
                return io.reactivex.rxjava3.subjects.b.c(sb, this.d, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class i extends f {
            public final dfh<?> c;
            public final CommunityProfileContentItem d;

            public i() {
                throw null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public i(dfh dfhVar) {
                super(r0);
                CommunityProfileContentItem a = dfhVar.a();
                this.c = dfhVar;
                this.d = a;
            }

            @Override // com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction.f
            public final CommunityProfileContentItem a() {
                return this.d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return epx.f(this.c, iVar.c) && epx.f(this.d, iVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TabContentPromoteClick(target=");
                sb.append(this.c);
                sb.append(", contentItem=");
                return io.reactivex.rxjava3.subjects.b.c(sb, this.d, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class j extends f {
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class k extends f {
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class l extends f {
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class m extends f {
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class n extends f {
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class o extends f {
            public final boolean c;

            public o(CommunityProfileContentItem communityProfileContentItem, boolean z) {
                super(communityProfileContentItem);
                this.c = z;
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class p extends f {
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class q extends f {
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class r extends f {
            public final CommunityProfileContentItem c;

            public r(CommunityProfileContentItem communityProfileContentItem, CommunityProfileContentItem communityProfileContentItem2) {
                super(communityProfileContentItem);
                this.c = communityProfileContentItem2;
            }
        }

        public f(CommunityProfileContentItem communityProfileContentItem) {
            this.b = communityProfileContentItem;
        }

        public CommunityProfileContentItem a() {
            return this.b;
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static abstract class g extends CommunityProfileAction {

        /* compiled from: CommunityProfileAction.kt */
        public static final class a extends g {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2051504464;
            }

            public final String toString() {
                return "ChangeCover";
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class c extends g {
            public final boolean b;

            public c(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.b == ((c) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("DeleteCover(isLiveCover="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class d extends g {

            /* compiled from: CommunityProfileAction.kt */
            public static final class a extends d {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1415184159;
                }

                public final String toString() {
                    return "AllowPlayingByUser";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends d {
                public final int b;

                public b(int i) {
                    this.b = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.b == ((b) obj).b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("ChangePosition(position="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class c extends d {
                public static final c b = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1015519018;
                }

                public final String toString() {
                    return "ShowNext";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$g$d$d, reason: collision with other inner class name */
            public static final class C1587d extends d {
                public final boolean b;

                public C1587d(boolean z) {
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1587d) && this.b == ((C1587d) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("UpdateAnimationState(isPlaying="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class e extends d {
                public final boolean b = true;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && this.b == ((e) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("UpdateAutoPlay(canAutoPlay="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class f extends d {
                public final boolean b;

                public f(boolean z) {
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && this.b == ((f) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("UpdateDialogShown(isDialogShown="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$g$d$g, reason: collision with other inner class name */
            public static final class C1588g extends d {
                public final boolean b;

                public C1588g(boolean z) {
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1588g) && this.b == ((C1588g) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("UpdateForceExpandCover(force="), this.b, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class h extends d {
                public final boolean b;

                public h(boolean z) {
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof h) && this.b == ((h) obj).b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b);
                }

                public final String toString() {
                    return q0.a(new StringBuilder("UpdateSoundEnabled(isEnabled="), this.b, ')');
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class b extends g {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("Click(isLiveCover="), this.b, ')');
            }

            public b() {
                this(false);
            }
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class h extends CommunityProfileAction {
        public final int b = 5;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.b == ((h) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ForceReloadTab(type="), this.b, ')');
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class i extends CommunityProfileAction {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -388870032;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static abstract class j extends CommunityProfileAction {

        /* compiled from: CommunityProfileAction.kt */
        public static final class a extends j {
            public final boolean b;
            public final boolean c;

            public a(boolean z, boolean z2) {
                this.b = z;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && this.c == aVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ConfigurationChanged(canShowLiveCover=");
                sb.append(this.b);
                sb.append(", isVerticalOrientation=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class b extends j {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 576969600;
            }

            public final String toString() {
                return "Create";
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class c extends j {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1235006966;
            }

            public final String toString() {
                return "Destroy";
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class d extends j {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1831242482;
            }

            public final String toString() {
                return "Pause";
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class e extends j {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 994837169;
            }

            public final String toString() {
                return "Resume";
            }
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class k extends CommunityProfileAction {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -881644822;
        }

        public final String toString() {
            return "OnAdBloggerOzonBannerViewed";
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class l extends CommunityProfileAction {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            ((l) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OnboardingStatEvent(campaign=null, onboardingType=null, event=null)";
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class m extends CommunityProfileAction {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            ((m) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("PrefetchAvatarAlbumPhotos(settledPageIndex="), 0, ')');
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static abstract class n extends e {

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class a extends n {

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$n$a$a, reason: collision with other inner class name */
            public static final class C1589a extends a {
                public static final C1589a b = new C1589a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1589a);
                }

                public final int hashCode() {
                    return -1770735746;
                }

                public final String toString() {
                    return "OnAddGoodsAlbum";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends a {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 140678650;
                }

                public final String toString() {
                    return "OnAddNewItemClick";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class c extends a {
                public static final c b = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return -590005060;
                }

                public final String toString() {
                    return "OnAdsPromoteClick";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class d extends a {
                public final int b;
                public final int c;

                public d(int i, int i2) {
                    this.b = i;
                    this.c = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return this.b == dVar.b && this.c == dVar.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnAlbumItemClick(uid=");
                    sb.append(this.b);
                    sb.append(", position=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class e extends a {
                public final int b;
                public final int c;

                public e(int i, int i2) {
                    this.b = i;
                    this.c = i2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return this.b == eVar.b && this.c == eVar.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnAlbumItemViewed(uid=");
                    sb.append(this.b);
                    sb.append(", position=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class f extends a {
                public final String b;
                public final int c;
                public final View d;

                public f(View view, String str, int i) {
                    this.b = str;
                    this.c = i;
                    this.d = view;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    f fVar = (f) obj;
                    return epx.f(this.b, fVar.b) && this.c == fVar.c && epx.f(this.d, fVar.d);
                }

                public final int hashCode() {
                    return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnCtaBtnItemClick(itemUid=");
                    sb.append(this.b);
                    sb.append(", position=");
                    sb.append(this.c);
                    sb.append(", targetView=");
                    return br.b(sb, this.d, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class g extends a {
                public static final g b = new g();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof g);
                }

                public final int hashCode() {
                    return 262732332;
                }

                public final String toString() {
                    return "OnErrorRetryClick";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class h extends a {
                public final String b;
                public final int c;

                public h(String str, int i) {
                    this.b = str;
                    this.c = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof h)) {
                        return false;
                    }
                    h hVar = (h) obj;
                    return epx.f(this.b, hVar.b) && this.c == hVar.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnFaveItemClick(itemUid=");
                    sb.append(this.b);
                    sb.append(", position=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class i extends a {
                public static final i b = new i();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof i);
                }

                public final int hashCode() {
                    return -932101439;
                }

                public final String toString() {
                    return "OnInitLoadingFinishedSuccess";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class j extends a {
                public final String b;
                public final int c;

                public j(String str, int i) {
                    this.b = str;
                    this.c = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof j)) {
                        return false;
                    }
                    j jVar = (j) obj;
                    return epx.f(this.b, jVar.b) && this.c == jVar.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnItemClick(itemUid=");
                    sb.append(this.b);
                    sb.append(", position=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class k extends a {
                public final String b;
                public final int c;

                public k(String str, int i) {
                    this.b = str;
                    this.c = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof k)) {
                        return false;
                    }
                    k kVar = (k) obj;
                    return epx.f(this.b, kVar.b) && this.c == kVar.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnItemViewed(itemUid=");
                    sb.append(this.b);
                    sb.append(", position=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class l extends a {
                public final ay00 b;

                public l(ay00 ay00Var) {
                    this.b = ay00Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "OnMarketEventReceived(event=" + this.b + ')';
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class m extends a {
                public static final m b = new m();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof m);
                }

                public final int hashCode() {
                    return -1942467840;
                }

                public final String toString() {
                    return "OnModerationRestrictionsDismissed";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$n$a$n, reason: collision with other inner class name */
            public static final class C1590n extends a {
                public static final C1590n b = new C1590n();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1590n);
                }

                public final int hashCode() {
                    return -2040752542;
                }

                public final String toString() {
                    return "OnOpenCartClick";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class o extends a {
                public static final o b = new o();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof o);
                }

                public final int hashCode() {
                    return 1077669530;
                }

                public final String toString() {
                    return "OnOpenViewSettingsClick";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class p extends a {
                public static final p b = new p();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof p);
                }

                public final int hashCode() {
                    return 1127836119;
                }

                public final String toString() {
                    return "OnScrollToEnd";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class q extends a {
                public static final q b = new q();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof q);
                }

                public final int hashCode() {
                    return -2055612736;
                }

                public final String toString() {
                    return "OnShowAllClick";
                }
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class b extends n {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("Init(isFromCache="), this.b, ')');
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class c extends n {
            public final ay00 b;

            public c(ay00 ay00Var) {
                this.b = ay00Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnMarketEventReceived(event=" + this.b + ')';
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static final class d extends n {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1282156894;
            }

            public final String toString() {
                return "Reload";
            }
        }

        /* compiled from: CommunityProfileAction.kt */
        public static abstract class e extends n {

            /* compiled from: CommunityProfileAction.kt */
            public static final class a extends e {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -776489620;
                }

                public final String toString() {
                    return "OnAddNewItemClick";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class b extends e {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1507173330;
                }

                public final String toString() {
                    return "OnAdsPromoteClick";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class c extends e {
                public final String b;
                public final int c;
                public final View d;

                public c(View view, String str, int i) {
                    this.b = str;
                    this.c = i;
                    this.d = view;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.b, cVar.b) && this.c == cVar.c && epx.f(this.d, cVar.d);
                }

                public final int hashCode() {
                    return this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnCtaBtnItemClick(itemUid=");
                    sb.append(this.b);
                    sb.append(", position=");
                    sb.append(this.c);
                    sb.append(", targetView=");
                    return br.b(sb, this.d, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class d extends e {
                public static final d b = new d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public final int hashCode() {
                    return -654435938;
                }

                public final String toString() {
                    return "OnErrorRetryClick";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            /* renamed from: com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction$n$e$e, reason: collision with other inner class name */
            public static final class C1591e extends e {
                public final String b;
                public final int c;

                public C1591e(String str, int i) {
                    this.b = str;
                    this.c = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1591e)) {
                        return false;
                    }
                    C1591e c1591e = (C1591e) obj;
                    return epx.f(this.b, c1591e.b) && this.c == c1591e.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnFaveItemClick(itemUid=");
                    sb.append(this.b);
                    sb.append(", position=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class f extends e {
                public static final f b = new f();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public final int hashCode() {
                    return 941516815;
                }

                public final String toString() {
                    return "OnInitLoadingFinishedSuccess";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class g extends e {
                public final String b;
                public final int c;

                public g(String str, int i) {
                    this.b = str;
                    this.c = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof g)) {
                        return false;
                    }
                    g gVar = (g) obj;
                    return epx.f(this.b, gVar.b) && this.c == gVar.c;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("OnItemClick(itemUid=");
                    sb.append(this.b);
                    sb.append(", position=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class h extends e {
                public final ay00 b;

                public h(ay00 ay00Var) {
                    this.b = ay00Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "OnMarketEventReceived(event=" + this.b + ')';
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class i extends e {
                public static final i b = new i();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof i);
                }

                public final int hashCode() {
                    return -405007799;
                }

                public final String toString() {
                    return "OnScrollToEnd";
                }
            }

            /* compiled from: CommunityProfileAction.kt */
            public static final class j extends e {
                public static final j b = new j();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof j);
                }

                public final int hashCode() {
                    return 1965833358;
                }

                public final String toString() {
                    return "OnShowAllClick";
                }
            }
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class p extends CommunityProfileAction {
        public final int b;
        public final int c;
        public final Intent d;

        public p(int i, int i2, Intent intent) {
            this.b = i;
            this.c = i2;
            this.d = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.b == pVar.b && this.c == pVar.c && epx.f(this.d, pVar.d);
        }

        public final int hashCode() {
            int a = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            Intent intent = this.d;
            return a + (intent == null ? 0 : intent.hashCode());
        }

        public final String toString() {
            return "ResultAvatarChange(requestCode=" + this.b + ", resultCode=" + this.c + ", data=" + this.d + ')';
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class q extends CommunityProfileAction {
        public final UserId b;

        public q(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.b, ((q) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("SendInviteToFriend(userId="), this.b, ')');
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class r extends CommunityProfileAction {
        public final Intent b;

        public r(Intent intent) {
            this.b = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.b, ((r) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShareSent(data=" + this.b + ')';
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class s extends CommunityProfileAction {
        public final t8q0 b;

        public s(t8q0 t8q0Var) {
            this.b = t8q0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b.a);
        }

        public final String toString() {
            return "ShouldUpdateCommunityOnResume(updateOnResume=" + this.b + ')';
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class t extends CommunityProfileAction {
        public static final t b = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -1768762025;
        }

        public final String toString() {
            return "TabsOrderSaved";
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class u extends CommunityProfileAction {
        public final CommunityProfileState.d b;

        public u(CommunityProfileState.d dVar) {
            this.b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && epx.f(this.b, ((u) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ToolbarRedesignedJoinStateChanged(newState=" + this.b + ')';
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class v extends CommunityProfileAction {
        public static final v b = new v();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return -32813127;
        }

        public final String toString() {
            return "UpdateCommunityCreatedCardShown";
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class w extends CommunityProfileAction {
        public final ExtendedCommunityProfile b;
        public final int c;

        public w(int i, ExtendedCommunityProfile extendedCommunityProfile) {
            this.b = extendedCommunityProfile;
            this.c = i;
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class x extends CommunityProfileAction {
        public static final x b = new x();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return 2036189594;
        }

        public final String toString() {
            return "VideoGrowthBannerClick";
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class y extends CommunityProfileAction {
        public static final y b = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -2111359660;
        }

        public final String toString() {
            return "VideoGrowthButtonClick";
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class z extends CommunityProfileAction {
        public final VideoFile b;
        public final boolean c;

        public z(VideoFile videoFile, boolean z) {
            this.b = videoFile;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return epx.f(this.b, zVar.b) && this.c == zVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoHiddenChanged(videoFile=");
            sb.append(this.b);
            sb.append(", isHidden=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityProfileAction.kt */
    public static final class o extends CommunityProfileAction {
        public final boolean b;

        public o(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ReloadProfile(isFullReload="), this.b, ')');
        }

        public o() {
            this(true);
        }
    }
}
