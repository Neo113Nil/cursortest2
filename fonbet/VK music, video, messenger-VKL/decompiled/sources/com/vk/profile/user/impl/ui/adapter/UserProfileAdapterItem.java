package com.vk.profile.user.impl.ui.adapter;

import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.actions.Action;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.UserProfile;
import com.vk.profile.core.avatar.StoryBorderMode;
import com.vk.profile.user.api.domain.UserProfileMode;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.bo;
import xsna.boh;
import xsna.bor;
import xsna.c920;
import xsna.d9f0;
import xsna.e43;
import xsna.efz;
import xsna.epx;
import xsna.fw3;
import xsna.gd80;
import xsna.h5s;
import xsna.ho8;
import xsna.hyn;
import xsna.ms9;
import xsna.nym0;
import xsna.qoy;
import xsna.s8u0;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.wih;
import xsna.yc0;
import xsna.z8l;
import xsna.zrp;

/* compiled from: UserProfileAdapterItem.kt */
/* loaded from: classes5.dex */
public abstract class UserProfileAdapterItem implements z8l {
    public final int a;
    public MergeMode b = MergeMode.Default;

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class MainInfo extends UserProfileAdapterItem implements c920, bor {
        public final a c;
        public final c d;
        public final ActionButtons e;
        public final b f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final d9f0 j;
        public final boolean k;
        public final nym0 l;
        public final List<Class<? extends UserProfileAdapterItem>> m;
        public final List<Class<? extends UserProfileAdapterItem>> n;

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class ActionButtons {
            public final a a;
            public final a b;
            public final a c;
            public final boolean d;
            public final boolean e;
            public final boolean f;
            public final boolean g;
            public final boolean h;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: UserProfileAdapterItem.kt */
            public static final class State {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ State[] $VALUES;
                public static final State ADD_TO_FRIEND;
                public static final State AT_FRIENDS;
                public static final State CALL;
                public static final State FOLLOW;
                public static final State FOLLOWING;
                public static final State FRIEND_REQUEST_SENT;
                public static final State FRIEND_REQUEST_SENT_PRIVATE;
                public static final State GIFT;
                public static final State MESSAGE;
                public static final State MORE;
                public static final State NONE;
                public static final State PROMOTE;
                public static final State PUBLISH;
                public static final State REPLY_TO_REQUEST;
                public static final State YOUR_FOLLOWER;

                static {
                    State state = new State("MESSAGE", 0);
                    MESSAGE = state;
                    State state2 = new State("AT_FRIENDS", 1);
                    AT_FRIENDS = state2;
                    State state3 = new State("ADD_TO_FRIEND", 2);
                    ADD_TO_FRIEND = state3;
                    State state4 = new State("REPLY_TO_REQUEST", 3);
                    REPLY_TO_REQUEST = state4;
                    State state5 = new State("YOUR_FOLLOWER", 4);
                    YOUR_FOLLOWER = state5;
                    State state6 = new State("FRIEND_REQUEST_SENT", 5);
                    FRIEND_REQUEST_SENT = state6;
                    State state7 = new State("FRIEND_REQUEST_SENT_PRIVATE", 6);
                    FRIEND_REQUEST_SENT_PRIVATE = state7;
                    State state8 = new State("FOLLOW", 7);
                    FOLLOW = state8;
                    State state9 = new State("FOLLOWING", 8);
                    FOLLOWING = state9;
                    State state10 = new State("PUBLISH", 9);
                    PUBLISH = state10;
                    State state11 = new State("MORE", 10);
                    MORE = state11;
                    State state12 = new State("CALL", 11);
                    CALL = state12;
                    State state13 = new State("NONE", 12);
                    NONE = state13;
                    State state14 = new State("PROMOTE", 13);
                    PROMOTE = state14;
                    State state15 = new State("GIFT", 14);
                    GIFT = state15;
                    State[] stateArr = {state, state2, state3, state4, state5, state6, state7, state8, state9, state10, state11, state12, state13, state14, state15};
                    $VALUES = stateArr;
                    $ENTRIES = new asp(stateArr);
                }

                public State() {
                    throw null;
                }

                public static State valueOf(String str) {
                    return (State) Enum.valueOf(State.class, str);
                }

                public static State[] values() {
                    return (State[]) $VALUES.clone();
                }
            }

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class a {
                public final State a;
                public final boolean b;

                public a(State state, boolean z) {
                    this.a = state;
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.a == aVar.a && this.b == aVar.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("PrimaryButtonData(state=");
                    sb.append(this.a);
                    sb.append(", isFemale=");
                    return q0.a(sb, this.b, ')');
                }
            }

            public ActionButtons(a aVar, a aVar2, a aVar3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
                this.a = aVar;
                this.b = aVar2;
                this.c = aVar3;
                this.d = z;
                this.e = z2;
                this.f = z3;
                this.g = z4;
                this.h = z5;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButtons)) {
                    return false;
                }
                ActionButtons actionButtons = (ActionButtons) obj;
                return this.a.equals(actionButtons.a) && this.b.equals(actionButtons.b) && this.c.equals(actionButtons.c) && this.d == actionButtons.d && this.e == actionButtons.e && this.f == actionButtons.f && this.g == actionButtons.g && this.h == actionButtons.h;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ActionButtons(primaryButtonData=");
                sb.append(this.a);
                sb.append(", promoteButtonData=");
                sb.append(this.b);
                sb.append(", compactContactButtonData=");
                sb.append(this.c);
                sb.append(", showCompactMessage=");
                sb.append(this.d);
                sb.append(", showCompactCall=");
                sb.append(this.e);
                sb.append(", showCompactMenu=");
                sb.append(this.f);
                sb.append(", showCompactFriend=");
                sb.append(this.g);
                sb.append(", showCompactGift=");
                return q0.a(sb, this.h, ')');
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class a {
            public final String a;
            public final Image b;
            public final AvatarBorderType c;
            public final StoryBorderMode d;
            public final OnlineInfo e;
            public final UserProfileMode f;
            public final boolean g;
            public final StoriesContainer h;
            public final boolean i;
            public final String j;
            public final String k;

            public a(String str, Image image, AvatarBorderType avatarBorderType, StoryBorderMode storyBorderMode, OnlineInfo onlineInfo, UserProfileMode userProfileMode, boolean z, StoriesContainer storiesContainer, boolean z2, String str2, String str3) {
                this.a = str;
                this.b = image;
                this.c = avatarBorderType;
                this.d = storyBorderMode;
                this.e = onlineInfo;
                this.f = userProfileMode;
                this.g = z;
                this.h = storiesContainer;
                this.i = z2;
                this.j = str2;
                this.k = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && epx.f(this.h, aVar.h) && this.i == aVar.i && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Image image = this.b;
                int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31)) * 31;
                OnlineInfo onlineInfo = this.e;
                int b = qoy.b((this.f.hashCode() + ((hashCode2 + (onlineInfo == null ? 0 : onlineInfo.hashCode())) * 31)) * 31, 31, this.g);
                StoriesContainer storiesContainer = this.h;
                int b2 = qoy.b((b + (storiesContainer == null ? 0 : storiesContainer.hashCode())) * 31, 31, this.i);
                String str2 = this.j;
                int hashCode3 = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.k;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AvatarState(placeholder=");
                sb.append(this.a);
                sb.append(", avatarImage=");
                sb.append(this.b);
                sb.append(", avatarBorderType=");
                sb.append(this.c);
                sb.append(", storyBorderMode=");
                sb.append(this.d);
                sb.append(", onlineInfo=");
                sb.append(this.e);
                sb.append(", profileMode=");
                sb.append(this.f);
                sb.append(", isCurrentUser=");
                sb.append(this.g);
                sb.append(", storiesContainer=");
                sb.append(this.h);
                sb.append(", hasUpload=");
                sb.append(this.i);
                sb.append(", lastUploadId=");
                sb.append(this.j);
                sb.append(", thumbHash=");
                return ho8.a(sb, this.k, ')');
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class b {
            public final boolean a;
            public final boolean b;
            public final a c;

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class a {
                public final long a;

                public a(long j) {
                    this.a = j;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.a == ((a) obj).a;
                }

                public final int hashCode() {
                    return Integer.hashCode(R.drawable.vk_icon_lotus_outline_28) + shy.a(R.string.user_profile_silent_mode_subtitle, shy.a(R.string.user_profile_silent_mode_title, Long.hashCode(this.a) * 31, 31), 31);
                }

                public final String toString() {
                    return efz.b(this.a, ", title=2131965408, subtitle=2131965407, icon=2131238463)", new StringBuilder("SilentModeHintBanner(silentModeEndedAt="));
                }
            }

            public b(boolean z, boolean z2, a aVar) {
                this.a = z;
                this.b = z2;
                this.c = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                return "PrivacyState(isClosed=" + this.a + ", isWasChanged=" + this.b + ", silentModeBanner=" + this.c + ')';
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class c {
            public final String a;
            public final CharSequence b;
            public final String c;
            public final ImageStatus d;
            public final MusicTrack e;
            public final a f;
            public final VerifyInfo g;
            public final boolean h;
            public final boolean i;
            public final boolean j;
            public final boolean k;
            public final boolean l;
            public final OnlineInfo m;

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class a {
                public final String a;
                public final AbstractC1700a b;
                public final boolean c;

                /* compiled from: UserProfileAdapterItem.kt */
                /* renamed from: com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem$MainInfo$c$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC1700a {
                    public final int a;
                    public final String b;

                    /* compiled from: UserProfileAdapterItem.kt */
                    /* renamed from: com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem$MainInfo$c$a$a$a, reason: collision with other inner class name */
                    public static final class C1701a extends AbstractC1700a {
                        public final String c;

                        public C1701a(String str) {
                            super(str, R.drawable.vk_icon_education_outline_16, null);
                            this.c = str;
                        }

                        @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem.MainInfo.c.a.AbstractC1700a
                        public final String b() {
                            return this.c;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C1701a) && epx.f(this.c, ((C1701a) obj).c);
                        }

                        public final int hashCode() {
                            return this.c.hashCode();
                        }

                        public final String toString() {
                            return ho8.a(new StringBuilder("Education(title="), this.c, ')');
                        }
                    }

                    /* compiled from: UserProfileAdapterItem.kt */
                    /* renamed from: com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem$MainInfo$c$a$a$b */
                    public static final class b extends AbstractC1700a {
                        public final String c;
                        public final String d;

                        public b(String str, String str2) {
                            super(str, R.drawable.vk_icon_work_outline_16, str2);
                            this.c = str;
                            this.d = str2;
                        }

                        @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem.MainInfo.c.a.AbstractC1700a
                        public final String a() {
                            return this.d;
                        }

                        @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem.MainInfo.c.a.AbstractC1700a
                        public final String b() {
                            return this.c;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof b)) {
                                return false;
                            }
                            b bVar = (b) obj;
                            return epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
                        }

                        public final int hashCode() {
                            int hashCode = this.c.hashCode() * 31;
                            String str = this.d;
                            return hashCode + (str == null ? 0 : str.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sb = new StringBuilder("Work(title=");
                            sb.append(this.c);
                            sb.append(", imageUrl=");
                            return ho8.a(sb, this.d, ')');
                        }
                    }

                    public AbstractC1700a(String str, int i, String str2) {
                        this.a = i;
                        this.b = str2;
                    }

                    public String a() {
                        return this.b;
                    }

                    public abstract String b();
                }

                public a(String str, AbstractC1700a abstractC1700a, boolean z) {
                    this.a = str;
                    this.b = abstractC1700a;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
                }

                public final int hashCode() {
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    AbstractC1700a abstractC1700a = this.b;
                    return Boolean.hashCode(this.c) + ((hashCode + (abstractC1700a != null ? abstractC1700a.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("SecondaryUserInfo(location=");
                    sb.append(this.a);
                    sb.append(", activity=");
                    sb.append(this.b);
                    sb.append(", hasInfo=");
                    return q0.a(sb, this.c, ')');
                }
            }

            public c(String str, CharSequence charSequence, String str2, ImageStatus imageStatus, MusicTrack musicTrack, a aVar, VerifyInfo verifyInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, OnlineInfo onlineInfo) {
                this.a = str;
                this.b = charSequence;
                this.c = str2;
                this.d = imageStatus;
                this.e = musicTrack;
                this.f = aVar;
                this.g = verifyInfo;
                this.h = z;
                this.i = z2;
                this.j = z3;
                this.k = z4;
                this.l = z5;
                this.m = onlineInfo;
            }

            public final boolean a() {
                CharSequence charSequence = this.b;
                if (charSequence != null && charSequence.length() != 0) {
                    return false;
                }
                a aVar = this.f;
                String str = aVar.a;
                if ((str != null && str.length() != 0) || aVar.b != null) {
                    return false;
                }
                String str2 = this.c;
                return str2 == null || str2.length() == 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && this.h == cVar.h && this.i == cVar.i && this.j == cVar.j && this.k == cVar.k && this.l == cVar.l && epx.f(this.m, cVar.m);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                CharSequence charSequence = this.b;
                int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
                String str = this.c;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                ImageStatus imageStatus = this.d;
                int hashCode4 = (hashCode3 + (imageStatus == null ? 0 : imageStatus.hashCode())) * 31;
                MusicTrack musicTrack = this.e;
                int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.g.hashCode() + ((this.f.hashCode() + ((hashCode4 + (musicTrack == null ? 0 : musicTrack.hashCode())) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
                OnlineInfo onlineInfo = this.m;
                return b + (onlineInfo != null ? onlineInfo.hashCode() : 0);
            }

            public final String toString() {
                return "UserInfo(fullName=" + this.a + ", description=" + ((Object) this.b) + ", screenName=" + this.c + ", imageStatus=" + this.d + ", musicTrack=" + this.e + ", secondaryInfo=" + this.f + ", verifyInfo=" + this.g + ", allowEdit=" + this.h + ", isDead=" + this.i + ", isOauthVerified=" + this.j + ", isFemale=" + this.k + ", isServiceOrDeactivated=" + this.l + ", onlineInfo=" + this.m + ')';
            }
        }

        public MainInfo(a aVar, c cVar, ActionButtons actionButtons, b bVar, boolean z, boolean z2, boolean z3, d9f0 d9f0Var, boolean z4, nym0 nym0Var) {
            super(R.layout.holder_user_profile_main_info);
            this.c = aVar;
            this.d = cVar;
            this.e = actionButtons;
            this.f = bVar;
            this.g = z;
            this.h = z2;
            this.i = z3;
            this.j = d9f0Var;
            this.k = z4;
            this.l = nym0Var;
            this.m = e43.l(p.class, PromoButtons.class, o.class);
            this.n = Collections.singletonList(r.class);
        }

        @Override // xsna.c920
        public final List<Class<? extends UserProfileAdapterItem>> a() {
            return this.m;
        }

        @Override // xsna.bor
        public final List<Class<? extends UserProfileAdapterItem>> b() {
            return this.n;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainInfo)) {
                return false;
            }
            MainInfo mainInfo = (MainInfo) obj;
            return epx.f(this.c, mainInfo.c) && epx.f(this.d, mainInfo.d) && epx.f(this.e, mainInfo.e) && epx.f(this.f, mainInfo.f) && this.g == mainInfo.g && this.h == mainInfo.h && this.i == mainInfo.i && epx.f(this.j, mainInfo.j) && this.k == mainInfo.k && epx.f(this.l, mainInfo.l);
        }

        public final int hashCode() {
            int b2 = qoy.b(qoy.b(qoy.b((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i);
            d9f0 d9f0Var = this.j;
            int b3 = qoy.b((b2 + (d9f0Var == null ? 0 : d9f0Var.hashCode())) * 31, 31, this.k);
            nym0 nym0Var = this.l;
            return b3 + (nym0Var != null ? nym0Var.hashCode() : 0);
        }

        public final String toString() {
            return "MainInfo(avatarState=" + this.c + ", userInfo=" + this.d + ", actionButtons=" + this.e + ", privacyMode=" + this.f + ", coverEnabled=" + this.g + ", isOauthVerified=" + this.h + ", isPersonalEasyPromoteEnabled=" + this.i + ", receivedThrows=" + this.j + ", hasAPlusMark=" + this.k + ", subscriptionInfoState=" + this.l + ')';
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static abstract class PromoButtons extends UserProfileAdapterItem implements c920 {
        public final List<Class<? extends UserProfileAdapterItem>> c;

        /* compiled from: UserProfileAdapterItem.kt */
        public static abstract class BirthdayPromo extends PromoButtons {

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class BirthdayHiddenTooltip extends BirthdayPromo {
                public final int d;
                public final int e;
                public final LinkType f;
                public final ExtendedUserProfile g;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: UserProfileAdapterItem.kt */
                public static final class LinkType {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ LinkType[] $VALUES;
                    public static final LinkType Ideas;
                    public static final LinkType ScheduledGift;
                    public static final LinkType SendGift;
                    public static final LinkType Wishes;

                    static {
                        LinkType linkType = new LinkType("Wishes", 0);
                        Wishes = linkType;
                        LinkType linkType2 = new LinkType("Ideas", 1);
                        Ideas = linkType2;
                        LinkType linkType3 = new LinkType("SendGift", 2);
                        SendGift = linkType3;
                        LinkType linkType4 = new LinkType("ScheduledGift", 3);
                        ScheduledGift = linkType4;
                        LinkType[] linkTypeArr = {linkType, linkType2, linkType3, linkType4};
                        $VALUES = linkTypeArr;
                        $ENTRIES = new asp(linkTypeArr);
                    }

                    public LinkType() {
                        throw null;
                    }

                    public static LinkType valueOf(String str) {
                        return (LinkType) Enum.valueOf(LinkType.class, str);
                    }

                    public static LinkType[] values() {
                        return (LinkType[]) $VALUES.clone();
                    }
                }

                public BirthdayHiddenTooltip(int i, int i2, LinkType linkType, ExtendedUserProfile extendedUserProfile) {
                    super(-5);
                    this.d = i;
                    this.e = i2;
                    this.f = linkType;
                    this.g = extendedUserProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BirthdayHiddenTooltip)) {
                        return false;
                    }
                    BirthdayHiddenTooltip birthdayHiddenTooltip = (BirthdayHiddenTooltip) obj;
                    return this.d == birthdayHiddenTooltip.d && this.e == birthdayHiddenTooltip.e && this.f == birthdayHiddenTooltip.f && epx.f(this.g, birthdayHiddenTooltip.g);
                }

                public final int hashCode() {
                    return this.g.hashCode() + ((this.f.hashCode() + shy.a(this.e, Integer.hashCode(this.d) * 31, 31)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("BirthdayHiddenTooltip(title=");
                    sb.append(this.d);
                    sb.append(", linkText=");
                    sb.append(this.e);
                    sb.append(", linkType=");
                    sb.append(this.f);
                    sb.append(", profile=");
                    return io.reactivex.rxjava3.internal.operators.mixed.k.d(sb, this.g, ')');
                }
            }

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class a extends BirthdayPromo {
                public final String d;
                public final String e;
                public final List<CatalogedGift> f;
                public final ExtendedUserProfile g;

                public a(String str, String str2, List<CatalogedGift> list, ExtendedUserProfile extendedUserProfile) {
                    super(R.layout.item_birthday_promo);
                    this.d = str;
                    this.e = str2;
                    this.f = list;
                    this.g = extendedUserProfile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
                }

                public final int hashCode() {
                    return this.g.hashCode() + fw3.a(urd0.a(this.d.hashCode() * 31, 31, this.e), 31, this.f);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("BirthdayTooltip(title=");
                    sb.append(this.d);
                    sb.append(", subtitle=");
                    sb.append(this.e);
                    sb.append(", gifts=");
                    sb.append(this.f);
                    sb.append(", profile=");
                    return io.reactivex.rxjava3.internal.operators.mixed.k.d(sb, this.g, ')');
                }
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class a extends PromoButtons {
            public final String d;
            public final String e;
            public final int f;
            public final Action g;

            public a(String str, String str2, int i, Action action) {
                super(-2);
                this.d = str;
                this.e = str2;
                this.f = i;
                this.g = action;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && epx.f(this.g, aVar.g);
            }

            public final int hashCode() {
                String str = this.d;
                return this.g.hashCode() + shy.a(this.f, urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.e), 31);
            }

            public final String toString() {
                return "Promo(iconUrl=" + this.d + ", title=" + this.e + ", color=" + this.f + ", action=" + this.g + ')';
            }
        }

        public PromoButtons(int i) {
            super(i);
            this.c = e43.l(MainInfo.class, PromoButtons.class, o.class);
        }

        @Override // xsna.c920
        public final List<Class<? extends UserProfileAdapterItem>> a() {
            return this.c;
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class a extends UserProfileAdapterItem {
        public final yc0 c;

        public a(yc0 yc0Var) {
            super(-9);
            this.c = yc0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.c, ((a) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "AdvertBanner(state=" + this.c + ')';
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class b extends t {
        public final wih c;

        public b(wih wihVar) {
            super(R.layout.item_community_full_content);
            this.c = wihVar;
        }

        @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem
        public final int e() {
            return this.c.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.c, ((b) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "ContentTabs(content=" + this.c + ')';
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class c extends UserProfileAdapterItem {
        public final hyn c;

        public c(hyn hynVar) {
            super(-7);
            this.c = hynVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.c, ((c) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "DonutBanner(state=" + this.c + ')';
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class d extends UserProfileAdapterItem implements c920 {
        public final List<Class<? extends UserProfileAdapterItem>> c;

        public d() {
            super(R.layout.holder_user_profile_posting_draft);
            this.c = e43.l(n.class, m.class);
        }

        @Override // xsna.c920
        public final List<Class<? extends UserProfileAdapterItem>> a() {
            return this.c;
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class e extends t {
        public final boh c;

        public e(boh bohVar) {
            super(R.layout.community_profile_empty_content_item);
            this.c = bohVar;
        }

        @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem
        public final int e() {
            return this.c.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.c, ((e) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "EmptyTabs(content=" + this.c + ')';
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class f extends UserProfileAdapterItem {
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class g extends UserProfileAdapterItem {
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
            return "ErrorEmptyWall(isLoading=false)";
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static abstract class h extends UserProfileAdapterItem implements c920 {

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class a extends h {
            public final int c;
            public final int d;
            public final List<String> e;
            public final List<String> f;
            public final boolean g;

            public a(int i, int i2, List<String> list, List<String> list2, boolean z) {
                this.c = i;
                this.d = i2;
                this.e = list;
                this.f = list2;
                this.g = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.g) + fw3.a(fw3.a(shy.a(this.d, Integer.hashCode(this.c) * 31, 31), 31, this.e), 31, this.f);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CurrentUser(friendsCount=");
                sb.append(this.c);
                sb.append(", followersCount=");
                sb.append(this.d);
                sb.append(", friendsPhotoStackUrls=");
                sb.append(this.e);
                sb.append(", followersPhotoStackUrls=");
                sb.append(this.f);
                sb.append(", showOnboarding=");
                return q0.a(sb, this.g, ')');
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static abstract class b extends h {

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class a extends b {
                public final int c;
                public final int d;
                public final List<String> e;
                public final List<String> f;
                public final boolean g;

                public a(int i, int i2, List<String> list, List<String> list2, boolean z) {
                    this.c = i;
                    this.d = i2;
                    this.e = list;
                    this.f = list2;
                    this.g = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.g) + fw3.a(fw3.a(shy.a(this.d, Integer.hashCode(this.c) * 31, 31), 31, this.e), 31, this.f);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("AllAndMutualFriendsInfo(allFriendsCount=");
                    sb.append(this.c);
                    sb.append(", mutualFriendsCount=");
                    sb.append(this.d);
                    sb.append(", allFriendsPhotoStackUrls=");
                    sb.append(this.e);
                    sb.append(", mutualFriendsPhotoStackUrls=");
                    sb.append(this.f);
                    sb.append(", canAccessProfile=");
                    return q0.a(sb, this.g, ')');
                }
            }

            /* compiled from: UserProfileAdapterItem.kt */
            /* renamed from: com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem$h$b$b, reason: collision with other inner class name */
            public static final class C1702b extends b {
                public final int c;
                public final int d;
                public final List<String> e;
                public final List<String> f;
                public final String g;
                public final int h;
                public final int i;
                public final List<String> j;
                public final boolean k;

                public C1702b(int i, int i2, List<String> list, List<String> list2, String str, int i3, int i4, List<String> list3, boolean z) {
                    this.c = i;
                    this.d = i2;
                    this.e = list;
                    this.f = list2;
                    this.g = str;
                    this.h = i3;
                    this.i = i4;
                    this.j = list3;
                    this.k = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1702b)) {
                        return false;
                    }
                    C1702b c1702b = (C1702b) obj;
                    return this.c == c1702b.c && this.d == c1702b.d && epx.f(this.e, c1702b.e) && epx.f(this.f, c1702b.f) && epx.f(this.g, c1702b.g) && this.h == c1702b.h && this.i == c1702b.i && epx.f(this.j, c1702b.j) && this.k == c1702b.k;
                }

                public final int hashCode() {
                    int a = fw3.a(fw3.a(shy.a(this.d, Integer.hashCode(this.c) * 31, 31), 31, this.e), 31, this.f);
                    String str = this.g;
                    return Boolean.hashCode(this.k) + fw3.a(shy.a(this.i, shy.a(this.h, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.j);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("FollowersModeInfo(followersCount=");
                    sb.append(this.c);
                    sb.append(", friendsCount=");
                    sb.append(this.d);
                    sb.append(", followersPhotoStackUrls=");
                    sb.append(this.e);
                    sb.append(", friendsPhotoStackUrls=");
                    sb.append(this.f);
                    sb.append(", followingFriendName=");
                    sb.append(this.g);
                    sb.append(", followingFriendsCount=");
                    sb.append(this.h);
                    sb.append(", mutualFriendsCount=");
                    sb.append(this.i);
                    sb.append(", mutualFriendsNames=");
                    sb.append(this.j);
                    sb.append(", canAccessProfile=");
                    return q0.a(sb, this.k, ')');
                }
            }
        }

        public h() {
            super(-4);
        }

        @Override // xsna.c920
        public final List<Class<? extends UserProfileAdapterItem>> a() {
            return EmptyList.b;
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static abstract class i extends UserProfileAdapterItem implements c920 {

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class a extends i {
            public final int c;
            public final String d;
            public final int e;
            public final boolean f;
            public final List<String> g;

            public a(int i, String str, int i2, boolean z, List<String> list) {
                this.c = i;
                this.d = str;
                this.e = i2;
                this.f = z;
                this.g = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g);
            }

            @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem.i
            public final List<String> f() {
                return this.g;
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.c) * 31;
                String str = this.d;
                return this.g.hashCode() + qoy.b(shy.a(this.e, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Celebrity(followersCount=");
                sb.append(this.c);
                sb.append(", friendName=");
                sb.append(this.d);
                sb.append(", friendsFollowingCount=");
                sb.append(this.e);
                sb.append(", isPrivate=");
                sb.append(this.f);
                sb.append(", photoStackUrls=");
                return ms9.a(')', sb, this.g);
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static abstract class b extends i {

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class a extends b {
                public static final a c = new a();
                public static final EmptyList d = EmptyList.b;

                @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem.i
                public final List<String> f() {
                    return d;
                }
            }

            /* compiled from: UserProfileAdapterItem.kt */
            /* renamed from: com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem$i$b$b, reason: collision with other inner class name */
            public static final class C1703b extends b {
                public final int c;
                public final List<String> d;

                public C1703b(int i, List<String> list) {
                    this.c = i;
                    this.d = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1703b)) {
                        return false;
                    }
                    C1703b c1703b = (C1703b) obj;
                    return this.c == c1703b.c && epx.f(this.d, c1703b.d);
                }

                @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem.i
                public final List<String> f() {
                    return this.d;
                }

                public final int hashCode() {
                    return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("NoFriends(requestsCount=");
                    sb.append(this.c);
                    sb.append(", photoStackUrls=");
                    return ms9.a(')', sb, this.d);
                }
            }

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class c extends b {
                public final int c;
                public final int d;
                public final List<String> e;

                public c(int i, int i2, List<String> list) {
                    this.c = i;
                    this.d = i2;
                    this.e = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.c == cVar.c && this.d == cVar.d && epx.f(this.e, cVar.e);
                }

                @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem.i
                public final List<String> f() {
                    return this.e;
                }

                public final int hashCode() {
                    return this.e.hashCode() + shy.a(this.d, Integer.hashCode(this.c) * 31, 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("WithFriends(friendsCount=");
                    sb.append(this.c);
                    sb.append(", requestsCount=");
                    sb.append(this.d);
                    sb.append(", photoStackUrls=");
                    return ms9.a(')', sb, this.e);
                }
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static abstract class c extends i {

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class a extends c {
                public final int c;
                public final EmptyList d = EmptyList.b;

                public a(int i) {
                    this.c = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.c == ((a) obj).c;
                }

                @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem.i
                public final List<String> f() {
                    return this.d;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.c);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Count(friendsCount="), this.c, ')');
                }
            }

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class b extends c {
                public final int c;
                public final List<String> d;
                public final int e;
                public final List<String> f;

                public b(int i, int i2, List list, List list2) {
                    this.c = i;
                    this.d = list;
                    this.e = i2;
                    this.f = list2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.c == bVar.c && epx.f(this.d, bVar.d) && this.e == bVar.e && epx.f(this.f, bVar.f);
                }

                @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem.i
                public final List<String> f() {
                    return this.f;
                }

                public final int hashCode() {
                    return this.f.hashCode() + shy.a(this.e, fw3.a(Integer.hashCode(this.c) * 31, 31, this.d), 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Info(friendsCount=");
                    sb.append(this.c);
                    sb.append(", mutualNames=");
                    sb.append(this.d);
                    sb.append(", mutualCount=");
                    sb.append(this.e);
                    sb.append(", photoStackUrls=");
                    return ms9.a(')', sb, this.f);
                }
            }
        }

        public i() {
            super(-1);
        }

        @Override // xsna.c920
        public final List<Class<? extends UserProfileAdapterItem>> a() {
            return EmptyList.b;
        }

        public abstract List<String> f();

        public final boolean g() {
            if ((this instanceof a) && ((a) this).e > 0) {
                return true;
            }
            if (this instanceof c.b) {
                c.b bVar = (c.b) this;
                if (bVar.e > 2 && bVar.d.size() == 2) {
                    return true;
                }
            }
            return this instanceof b.a;
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static abstract class j extends UserProfileAdapterItem {

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class a extends j {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return epx.f(null, null) && epx.f(null, null);
            }

            public final int hashCode() {
                Integer.hashCode(0);
                throw null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AuthorHeader(type=");
                sb.append(0);
                sb.append(", config=");
                sb.append((Object) null);
                sb.append(", mediaPagerState=");
                sb.append((Object) null);
                sb.append(", toolbarOverlayHeightPx=");
                return vu5.b(sb, 0, ')');
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class b extends j {

            /* compiled from: UserProfileAdapterItem.kt */
            public static final class a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    ((a) obj).getClass();
                    return epx.f(null, null) && epx.f(null, null) && epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CustomBadgeData(id=");
                    sb.append((String) null);
                    sb.append(", title=");
                    sb.append((String) null);
                    sb.append(", iconUrl=");
                    return ho8.a(sb, null, ')');
                }
            }

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
                Integer.hashCode(0);
                throw null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CustomBadges(type=");
                sb.append(0);
                sb.append(", badges=");
                return bo.c(')', sb, null);
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class c extends j {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                ((c) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Integer.hashCode(0) + shy.a(0, qoy.b(Integer.hashCode(0) * 31, 31, false), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Posting(type=");
                sb.append(0);
                sb.append(", isCurrentUser=");
                sb.append(false);
                sb.append(", postponedCount=");
                sb.append(0);
                sb.append(", draftsCount=");
                return vu5.b(sb, 0, ')');
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class d extends j {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                ((d) obj).getClass();
                return epx.f(null, null);
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + urd0.a(Integer.hashCode(0) * 31, 31, null);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PrivateUserContent(type=");
                sb.append(0);
                sb.append(", firstNameAccount=");
                sb.append((String) null);
                sb.append(", isFemale=");
                return q0.a(sb, false, ')');
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class e extends j {
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
                Integer.hashCode(0);
                throw null;
            }

            public final String toString() {
                return "ServiceInfo(type=0, description=" + ((Object) null) + ')';
            }
        }

        /* compiled from: UserProfileAdapterItem.kt */
        public static final class f extends j {
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
                Integer.hashCode(0);
                throw null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SilentModeBanner(type=");
                sb.append(0);
                sb.append(", silentModeEndedAt=");
                return ho8.a(sb, null, ')');
            }
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class k extends t {
        public final int c;

        public k() {
            this(3);
        }

        @Override // com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem
        public final int e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.c == ((k) obj).c;
        }

        public final int hashCode() {
            return Integer.hashCode(0) + (Integer.hashCode(this.c) * 31);
        }

        public final String toString() {
            return h5s.c(this.c, ", separatorType=0)", new StringBuilder("LoadTabs(backgroundType="));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i) {
            super(R.layout.holder_user_profile_content_tabs_load);
            int i2 = (i & 1) != 0 ? 0 : 2;
            this.c = i2;
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class l extends UserProfileAdapterItem {
        public final List<gd80> c;

        public l(List<gd80> list) {
            super(R.layout.item_new_user_onboarding);
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.c, ((l) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("NewUserOnboarding(cards="), this.c);
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class m extends UserProfileAdapterItem implements c920 {
        public final boolean c;
        public final int d;
        public final int e;
        public final List<Class<? extends UserProfileAdapterItem>> f;

        public m(boolean z, int i, int i2) {
            super(R.layout.holder_user_profile_posting);
            this.c = z;
            this.d = i;
            this.e = i2;
            this.f = e43.l(n.class, d.class);
        }

        @Override // xsna.c920
        public final List<Class<? extends UserProfileAdapterItem>> a() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.c == mVar.c && this.d == mVar.d && this.e == mVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + shy.a(this.d, Boolean.hashCode(this.c) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Posting(isCurrentUser=");
            sb.append(this.c);
            sb.append(", postponedCount=");
            sb.append(this.d);
            sb.append(", draftsCount=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class n extends UserProfileAdapterItem implements c920 {
        @Override // xsna.c920
        public final List<Class<? extends UserProfileAdapterItem>> a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            ((n) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "Postponed(countPosts=0)";
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class o extends UserProfileAdapterItem implements c920 {
        public final UserProfile c;
        public final List<Class<? extends UserProfileAdapterItem>> d;

        public o(UserProfile userProfile) {
            super(-6);
            this.c = userProfile;
            this.d = e43.l(MainInfo.class, PromoButtons.class);
        }

        @Override // xsna.c920
        public final List<Class<? extends UserProfileAdapterItem>> a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.c, ((o) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "PrivateUserContent(userProfile=" + this.c + ')';
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class p extends UserProfileAdapterItem implements c920 {
        public final ProfilesRecommendations c;
        public final List<Class<? extends UserProfileAdapterItem>> d;

        public p(ProfilesRecommendations profilesRecommendations) {
            super(R.layout.holder_user_profile_recommendations_stub);
            this.c = profilesRecommendations;
            this.d = Collections.singletonList(MainInfo.class);
        }

        @Override // xsna.c920
        public final List<Class<? extends UserProfileAdapterItem>> a() {
            return this.d;
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class q extends UserProfileAdapterItem {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            ((q) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "SelectorWallMode(selectedMode=null, canSeeAllPosts=false, canSeeArchivedPosts=false, isCurrentUser=false, firstNameGen=null, isLoading=false, countPosts=0)";
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class r extends UserProfileAdapterItem implements bor {
        public final s8u0 c;
        public final List<Class<? extends UserProfileAdapterItem>> d;

        public r(s8u0 s8u0Var) {
            super(-3);
            this.c = s8u0Var;
            this.d = Collections.singletonList(MainInfo.class);
        }

        @Override // xsna.bor
        public final List<Class<? extends UserProfileAdapterItem>> b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.c, ((r) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "ServiceOrDeactivatedInfo(description=" + this.c + ')';
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static final class s extends UserProfileAdapterItem {
        public final ArrayList c;

        public s(ArrayList arrayList) {
            super(-8);
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.c, ((s) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("StoriesInterestingBlock(stories="), this.c);
        }
    }

    /* compiled from: UserProfileAdapterItem.kt */
    public static abstract class t extends UserProfileAdapterItem {
    }

    public UserProfileAdapterItem(int i2) {
        this.a = i2;
    }

    @Override // xsna.z8l
    public final boolean c() {
        return false;
    }

    @Override // xsna.z8l
    public final boolean d() {
        return false;
    }

    public int e() {
        return 0;
    }

    @Override // xsna.z8l
    public final int getPaddingBottom() {
        return 0;
    }

    @Override // xsna.z8l
    public final int getPaddingTop() {
        return 0;
    }
}
