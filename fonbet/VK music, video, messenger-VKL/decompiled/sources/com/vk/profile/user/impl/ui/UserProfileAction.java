package com.vk.profile.user.impl.ui;

import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.ImageStatus;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vkontakte.android.api.ExtendedUserProfile;
import defpackage.q0;
import java.lang.ref.WeakReference;
import java.util.List;
import xsna.aad0;
import xsna.asp;
import xsna.e4t;
import xsna.epx;
import xsna.gs90;
import xsna.gwn0;
import xsna.ho8;
import xsna.i0u0;
import xsna.iqq0;
import xsna.je80;
import xsna.kj50;
import xsna.kkq0;
import xsna.mh40;
import xsna.moq0;
import xsna.ms9;
import xsna.nlf0;
import xsna.nu50;
import xsna.qoy;
import xsna.rq;
import xsna.shy;
import xsna.vu5;
import xsna.wfh;
import xsna.wx40;
import xsna.yq;
import xsna.zjm0;
import xsna.zp0;
import xsna.zq;
import xsna.zrp;

/* compiled from: UserProfileAction.kt */
/* loaded from: classes5.dex */
public abstract class UserProfileAction implements kj50 {

    /* compiled from: UserProfileAction.kt */
    public static abstract class DonutBanner extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class UrlClick extends DonutBanner {
            public final String b;
            public final Source c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: UserProfileAction.kt */
            public static final class Source {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Source[] $VALUES;
                public static final Source Faq;
                public static final Source Goals;
                public static final Source Regular;

                static {
                    Source source = new Source("Faq", 0);
                    Faq = source;
                    Source source2 = new Source("Goals", 1);
                    Goals = source2;
                    Source source3 = new Source("Regular", 2);
                    Regular = source3;
                    Source[] sourceArr = {source, source2, source3};
                    $VALUES = sourceArr;
                    $ENTRIES = new asp(sourceArr);
                }

                public Source() {
                    throw null;
                }

                public static Source valueOf(String str) {
                    return (Source) Enum.valueOf(Source.class, str);
                }

                public static Source[] values() {
                    return (Source[]) $VALUES.clone();
                }
            }

            public UrlClick(String str, Source source) {
                this.b = str;
                this.c = source;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UrlClick)) {
                    return false;
                }
                UrlClick urlClick = (UrlClick) obj;
                return epx.f(this.b, urlClick.b) && this.c == urlClick.c;
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                Source source = this.c;
                return hashCode + (source == null ? 0 : source.hashCode());
            }

            public final String toString() {
                return "UrlClick(url=" + this.b + ", source=" + this.c + ')';
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class b extends DonutBanner {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1729823069;
            }

            public final String toString() {
                return "Refresh";
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class c extends DonutBanner {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -459693091;
            }

            public final String toString() {
                return "View";
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class a extends DonutBanner {
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
                return q0.a(new StringBuilder("ProfileLoaded(isRefresh="), this.b, ')');
            }

            public a() {
                this(false);
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class a extends UserProfileAction {
        public final int b;
        public final int c;
        public final Intent d;

        public a(int i, int i2, Intent intent) {
            this.b = i;
            this.c = i2;
            this.d = intent;
        }

        public final boolean a() {
            return this.c == -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            Intent intent = this.d;
            return a + (intent == null ? 0 : intent.hashCode());
        }

        public final String toString() {
            return "ActivityResult(reqCode=" + this.b + ", resCode=" + this.c + ", data=" + this.d + ')';
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class a0 extends UserProfileAction {
        public final String b;

        public a0(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && epx.f(this.b, ((a0) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SetSourceScreen(screen="), this.b, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class b extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class a extends b {
            public final String b;

            public a(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Hide(id="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$b$b, reason: collision with other inner class name */
        public static final class C1673b extends b {
            public final String b;

            public C1673b(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1673b) && epx.f(this.b, ((C1673b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OnUrlButtonClick(url="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class c extends b {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1729657117;
            }

            public final String toString() {
                return "ProfileLoaded";
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class b0 extends UserProfileAction {
        public static final b0 b = new b0();
    }

    /* compiled from: UserProfileAction.kt */
    public static final class c extends UserProfileAction {
        public static final c b = new c();
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class c0 extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class a extends c0 {
            public static final a b = new a();
        }

        /* compiled from: UserProfileAction.kt */
        public static final class b extends c0 {
            public final String b;
            public final boolean c;
            public final boolean d;
            public final boolean e;

            public b(String str, boolean z, boolean z2, boolean z3) {
                this.b = str;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TabToggleSuccess(tabName=");
                sb.append(this.b);
                sb.append(", private=");
                sb.append(this.c);
                sb.append(", onlyMobile=");
                sb.append(this.d);
                sb.append(", pinned=");
                return q0.a(sb, this.e, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class c extends c0 {
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class d extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static abstract class a extends d {

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$a$a, reason: collision with other inner class name */
            public static final class C1674a extends a {
                public final int b;

                public C1674a(int i) {
                    this.b = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1674a) && this.b == ((C1674a) obj).b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("DeletePhotoConfirmed(pageIndex="), this.b, ')');
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class b extends d {

            /* compiled from: UserProfileAction.kt */
            public static abstract class a extends b {

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$b$a$a, reason: collision with other inner class name */
                public static final class C1675a extends a {
                    public static final C1675a b = new C1675a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1675a);
                    }

                    public final int hashCode() {
                        return -640733228;
                    }

                    public final String toString() {
                        return "ChangePhoto";
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$b$a$b, reason: collision with other inner class name */
                public static final class C1676b extends a {
                    public final int b;

                    public C1676b(int i) {
                        this.b = i;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1676b) && this.b == ((C1676b) obj).b;
                    }

                    public final int hashCode() {
                        return Integer.hashCode(this.b);
                    }

                    public final String toString() {
                        return vu5.b(new StringBuilder("DeletePhoto(pageIndex="), this.b, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class c extends a {
                    public final int b;

                    public c(int i) {
                        this.b = i;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof c) && this.b == ((c) obj).b;
                    }

                    public final int hashCode() {
                        return Integer.hashCode(this.b);
                    }

                    public final String toString() {
                        return vu5.b(new StringBuilder("SetAsMainPhoto(pageIndex="), this.b, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$b$a$d, reason: collision with other inner class name */
                public static final class C1677d extends a {
                    public final int b;

                    public C1677d(int i) {
                        this.b = i;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1677d) && this.b == ((C1677d) obj).b;
                    }

                    public final int hashCode() {
                        return Integer.hashCode(this.b);
                    }

                    public final String toString() {
                        return vu5.b(new StringBuilder("ViewPhotos(pageIndex="), this.b, ')');
                    }

                    public C1677d() {
                        this(0);
                    }
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class c extends d {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends c {
                public final int b;

                public a(int i) {
                    this.b = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.b == ((a) obj).b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("AvatarPageSettled(pageIndex="), this.b, ')');
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static abstract class b extends c {

                /* compiled from: UserProfileAction.kt */
                public static final class a extends b {
                    public static final a b = new a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof a);
                    }

                    public final int hashCode() {
                        return -818429860;
                    }

                    public final String toString() {
                        return "APlusClick";
                    }
                }
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$c, reason: collision with other inner class name */
            public static abstract class AbstractC1678c extends c {

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$c$a */
                public static final class a extends AbstractC1678c {
                    public final i0u0 b;

                    public a(gwn0 gwn0Var) {
                        this.b = gwn0Var;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Advertise(viewProvider="), this.b, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$c$b */
                public static final class b extends AbstractC1678c {
                    public final i0u0 b;

                    public b(gwn0 gwn0Var) {
                        this.b = gwn0Var;
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
                        return zq.b(new StringBuilder("BecomeFriends(viewProvider="), this.b, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$c$c, reason: collision with other inner class name */
                public static final class C1679c extends AbstractC1678c {
                    public final i0u0 b;
                    public final Rect c;

                    public C1679c(gwn0 gwn0Var, Rect rect) {
                        this.b = gwn0Var;
                        this.c = rect;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1679c)) {
                            return false;
                        }
                        C1679c c1679c = (C1679c) obj;
                        return epx.f(this.b, c1679c.b) && epx.f(this.c, c1679c.c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode() + (this.b.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Bell(viewProvider=");
                        sb.append(this.b);
                        sb.append(", anchorRect=");
                        return yq.c(sb, this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$c$d, reason: collision with other inner class name */
                public static final class C1680d extends AbstractC1678c {
                    public final i0u0 b;
                    public final Rect c;

                    public C1680d(gwn0 gwn0Var, Rect rect) {
                        this.b = gwn0Var;
                        this.c = rect;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1680d)) {
                            return false;
                        }
                        C1680d c1680d = (C1680d) obj;
                        return epx.f(this.b, c1680d.b) && epx.f(this.c, c1680d.c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode() + (this.b.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Call(viewProvider=");
                        sb.append(this.b);
                        sb.append(", anchorRect=");
                        return yq.c(sb, this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$c$e */
                public static final class e extends AbstractC1678c {
                    public final i0u0 b;

                    public e(gwn0 gwn0Var) {
                        this.b = gwn0Var;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Gift(viewProvider="), this.b, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$c$f */
                public static final class f extends AbstractC1678c {
                    public final i0u0 b;

                    public f(gwn0 gwn0Var) {
                        this.b = gwn0Var;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Message(viewProvider="), this.b, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$c$g */
                public static final class g extends AbstractC1678c {
                    public final i0u0 b;

                    public g(gwn0 gwn0Var) {
                        this.b = gwn0Var;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Subscribe(viewProvider="), this.b, ')');
                    }
                }
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$d, reason: collision with other inner class name */
            public static abstract class AbstractC1681d extends c {

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$d$a */
                public static final class a extends AbstractC1681d {
                    public static final a b = new a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof a);
                    }

                    public final int hashCode() {
                        return 1849452442;
                    }

                    public final String toString() {
                        return "ImageStatusClick";
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$c$d$b */
                public static final class b extends AbstractC1681d {
                    public static final b b = new b();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof b);
                    }

                    public final int hashCode() {
                        return 161295308;
                    }

                    public final String toString() {
                        return "VkVerifiedClick";
                    }
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d, reason: collision with other inner class name */
        public static abstract class AbstractC1682d extends d {

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d$a */
            public static final class a extends AbstractC1682d {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1021679617;
                }

                public final String toString() {
                    return "AboutProfile";
                }
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d$b */
            public static abstract class b extends AbstractC1682d {

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d$b$a */
                public static final class a extends b {
                    public static final a b = new a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof a);
                    }

                    public final int hashCode() {
                        return 1127919127;
                    }

                    public final String toString() {
                        return "MusicTrackClick";
                    }
                }
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d$c */
            public static abstract class c extends AbstractC1682d {

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d$c$a */
                public static final class a extends c {
                    public final String b;

                    public a(String str) {
                        this.b = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode();
                    }

                    public final String toString() {
                        return ho8.a(new StringBuilder("OnSpanClicked(link="), this.b, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d$c$b */
                public static final class b extends c {
                    public static final b b = new b();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof b);
                    }

                    public final int hashCode() {
                        return 2044336589;
                    }

                    public final String toString() {
                        return "Set";
                    }
                }
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d$d, reason: collision with other inner class name */
            public static abstract class AbstractC1683d extends AbstractC1682d {

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d$d$a */
                public static final class a extends AbstractC1683d {
                    public static final a b = new a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof a);
                    }

                    public final int hashCode() {
                        return 377430699;
                    }

                    public final String toString() {
                        return "FollowersInfoClick";
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d$d$b */
                public static final class b extends AbstractC1683d {
                    public static final b b = new b();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof b);
                    }

                    public final int hashCode() {
                        return -814944058;
                    }

                    public final String toString() {
                        return "InviteFriends";
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$d$d$c */
                public static final class c extends AbstractC1683d {
                    public final i0u0 b;
                    public final Rect c;

                    public c(gwn0 gwn0Var, Rect rect) {
                        this.b = gwn0Var;
                        this.c = rect;
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
                        Rect rect = this.c;
                        return hashCode + (rect == null ? 0 : rect.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("ManageRelation(viewProvider=");
                        sb.append(this.b);
                        sb.append(", rect=");
                        return yq.c(sb, this.c, ')');
                    }
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class e extends d {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends e {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1531873137;
                }

                public final String toString() {
                    return "AddToCloseFriends";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class b extends e {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1153464469;
                }

                public final String toString() {
                    return "AddToConversation";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class c extends e {
                public static final c b = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 447784636;
                }

                public final String toString() {
                    return "AddToFave";
                }
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$e$d, reason: collision with other inner class name */
            public static final class C1684d extends e {
                public static final C1684d b = new C1684d();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1684d);
                }

                public final int hashCode() {
                    return -315619197;
                }

                public final String toString() {
                    return "Block";
                }
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$d$e$e, reason: collision with other inner class name */
            public static final class C1685e extends e {
                public static final C1685e b = new C1685e();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1685e);
                }

                public final int hashCode() {
                    return -769605287;
                }

                public final String toString() {
                    return "CopyLink";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class f extends e {
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
                    return "FaveToggled(isAdd=false)";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class g extends e {
                public static final g b = new g();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof g);
                }

                public final int hashCode() {
                    return -148582790;
                }

                public final String toString() {
                    return "Gift";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class h extends e {
                public final gs90.a b;

                public h(gs90.a aVar) {
                    this.b = aVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
                }

                public final int hashCode() {
                    gs90.a aVar = this.b;
                    if (aVar == null) {
                        return 0;
                    }
                    return (int) aVar.a.b;
                }

                public final String toString() {
                    return "OpenApp(payload=" + this.b + ')';
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class i extends e {
                public static final i b = new i();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof i);
                }

                public final int hashCode() {
                    return -1429279696;
                }

                public final String toString() {
                    return "Question";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class j extends e {
                public static final j b = new j();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof j);
                }

                public final int hashCode() {
                    return 756888757;
                }

                public final String toString() {
                    return "RemoveFromCloseFriends";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class k extends e {
                public static final k b = new k();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof k);
                }

                public final int hashCode() {
                    return 1901455586;
                }

                public final String toString() {
                    return "RemoveFromFave";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class l extends e {
                public static final l b = new l();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof l);
                }

                public final int hashCode() {
                    return 414494301;
                }

                public final String toString() {
                    return "RemoveFromFriends";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class m extends e {
                public static final m b = new m();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof m);
                }

                public final int hashCode() {
                    return -742617090;
                }

                public final String toString() {
                    return "Report";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class n extends e {
                public static final n b = new n();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof n);
                }

                public final int hashCode() {
                    return -300051499;
                }

                public final String toString() {
                    return "Share";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class o extends e {
                public static final o b = new o();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof o);
                }

                public final int hashCode() {
                    return 1360858122;
                }

                public final String toString() {
                    return "Unblock";
                }
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class d0 extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class a extends d0 {
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class b extends d0 {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends b {
                public static final a b = new a();
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class c extends d0 {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends c {
                public final int b;

                public a(int i) {
                    this.b = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.b == ((a) obj).b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("UpdateCount(count="), this.b, ')');
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class d extends d0 {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends d {
                public final int b;

                public a(int i) {
                    this.b = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.b == ((a) obj).b;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.b);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("UpdateCount(count="), this.b, ')');
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class e extends d0 {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends e {
                public final WallGetMode b;

                public a(WallGetMode wallGetMode) {
                    this.b = wallGetMode;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.b == ((a) obj).b;
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "ChangeWallMode(mode=" + this.b + ')';
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static abstract class b extends e {

                /* compiled from: UserProfileAction.kt */
                public static final class a extends b {
                    public static final a b = new a();
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class c extends e {
            }

            /* compiled from: UserProfileAction.kt */
            public static final class d extends e {
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class g extends d0 {
        }

        /* compiled from: UserProfileAction.kt */
        public static final class f extends d0 {
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
                return q0.a(new StringBuilder("UpdateEmptyErrorView(isLoadingWall="), this.b, ')');
            }

            public f() {
                this(false);
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class e extends UserProfileAction {
        public final Intent b;

        public e(Intent intent) {
            this.b = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
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

    /* compiled from: UserProfileAction.kt */
    public static abstract class e0 extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class a extends e0 {
            public final CommunityProfileContentItem b;
            public final boolean c;
            public final boolean d;

            public a(CommunityProfileContentItem communityProfileContentItem, boolean z, boolean z2) {
                this.b = communityProfileContentItem;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ArchiveEnabled(contentItem=");
                sb.append(this.b);
                sb.append(", enabled=");
                sb.append(this.c);
                sb.append(", lastPostWasUnarchived=");
                return q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class b extends e0 {
            public final CommunityProfileContentItem b;
            public final int c;

            public b(CommunityProfileContentItem communityProfileContentItem, int i) {
                this.b = communityProfileContentItem;
                this.c = i;
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
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ChangePostCount(contentItem=");
                sb.append(this.b);
                sb.append(", postCount=");
                return vu5.b(sb, this.c, ')');
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class f extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static abstract class a extends f {

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$f$a$a, reason: collision with other inner class name */
            public static final class C1686a extends a {
                public final GiftItem b;

                public C1686a(GiftItem giftItem) {
                    this.b = giftItem;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1686a) && epx.f(this.b, ((C1686a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "DeleteGift(giftItem=" + this.b + ')';
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class b extends f {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends b {
                public final Narrative b;

                public a(Narrative narrative) {
                    this.b = narrative;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "RemoveNarrative(narrative=" + this.b + ')';
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class c extends f {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends c {
                public final List<String> b;

                public a(List<String> list) {
                    this.b = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ms9.a(')', new StringBuilder("PublishStory(photos="), this.b);
                }
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class g extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class a extends g {
            public final CommunityProfileContentItem b;

            public a(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("LoadMore(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class b extends g {
            public final CommunityProfileContentItem b;

            public b(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
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
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("LoadMoreAlbum(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class c extends g {
            public final CommunityProfileContentItem b;

            public c(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
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
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("OnboardingHidden(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class d extends g {
            public final CommunityProfileContentItem b;

            public d(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("TabAddContentClicked(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class e extends g {
            public final CommunityProfileContentItem b;
            public final wfh c;
            public final WeakReference<View> d;
            public final int e;

            public e(CommunityProfileContentItem communityProfileContentItem, wfh wfhVar, WeakReference<View> weakReference, int i) {
                this.b = communityProfileContentItem;
                this.c = wfhVar;
                this.d = weakReference;
                this.e = i;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && this.e == eVar.e;
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
                WeakReference<View> weakReference = this.d;
                return Integer.hashCode(this.e) + ((hashCode + (weakReference == null ? 0 : weakReference.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TabContentClicked(contentItem=");
                sb.append(this.b);
                sb.append(", target=");
                sb.append(this.c);
                sb.append(", anchor=");
                sb.append(this.d);
                sb.append(", positionOffset=");
                return vu5.b(sb, this.e, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class f extends g {
            public final CommunityProfileContentItem b;
            public final nu50 c;

            public f() {
                throw null;
            }

            public f(nu50 nu50Var) {
                this.b = nu50Var.c;
                this.c = nu50Var;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "TabContentLongClicked(contentItem=" + this.b + ", target=" + this.c + ')';
            }
        }

        /* compiled from: UserProfileAction.kt */
        /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$g$g, reason: collision with other inner class name */
        public static final class C1687g extends g {
            public final CommunityProfileContentItem b;

            public C1687g(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1687g) && epx.f(this.b, ((C1687g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("TabLoadMoreRetry(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class h extends g {
            public final CommunityProfileContentItem b;

            public h(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
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
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("TabLoadRetry(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class i extends g {
            public final CommunityProfileContentItem b;

            public i(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("TabPrefetched(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class j extends g {
            public final CommunityProfileContentItem b;

            public j(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && epx.f(this.b, ((j) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("TabReload(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class k extends g {
            public final CommunityProfileContentItem b;

            public k(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("TabSecondButtonClicked(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class l extends g {
            public final CommunityProfileContentItem b;
            public final boolean c;

            public l(CommunityProfileContentItem communityProfileContentItem, boolean z) {
                this.b = communityProfileContentItem;
                this.c = z;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return epx.f(this.b, lVar.b) && this.c == lVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TabSelected(contentItem=");
                sb.append(this.b);
                sb.append(", isNeedTakeActionData=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class m extends g {
            public final CommunityProfileContentItem b;

            public m(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("TabShowAllAlbumsClicked(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class n extends g {
            public final CommunityProfileContentItem b;

            public n(CommunityProfileContentItem communityProfileContentItem) {
                this.b = communityProfileContentItem;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.subjects.b.c(new StringBuilder("TabShowAllClicked(contentItem="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class o extends g {
            public final CommunityProfileContentItem b;
            public final CommunityProfileContentItem c;

            public o(CommunityProfileContentItem communityProfileContentItem, CommunityProfileContentItem communityProfileContentItem2) {
                this.b = communityProfileContentItem;
                this.c = communityProfileContentItem2;
            }

            @Override // com.vk.profile.user.impl.ui.UserProfileAction.g
            public final CommunityProfileContentItem a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof o)) {
                    return false;
                }
                o oVar = (o) obj;
                return epx.f(this.b, oVar.b) && epx.f(this.c, oVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TabSwitched(previousContentItem=");
                sb.append(this.b);
                sb.append(", currentContentItem=");
                return io.reactivex.rxjava3.subjects.b.c(sb, this.c, ')');
            }
        }

        public abstract CommunityProfileContentItem a();
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class h extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static abstract class a extends h {

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$h$a$a, reason: collision with other inner class name */
            public static final class C1688a extends a {
                public static final C1688a b = new C1688a();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class b extends a {
                public static final b b = new b();
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class i extends UserProfileAction {
        public final ExtendedUserProfile b;

        public i(ExtendedUserProfile extendedUserProfile) {
            this.b = extendedUserProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("FetchOnboardingCards(profile="), this.b, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class j extends UserProfileAction {
        public static final j b = new j();
    }

    /* compiled from: UserProfileAction.kt */
    public static final class k extends UserProfileAction {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            ((k) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "ForceReloadTab(type=0)";
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class l extends UserProfileAction {
        public final boolean b;

        public l(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("FriendsCatalogOnboardingDismissed(isByClickOutside="), this.b, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class m extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class a extends m {
            public final nlf0 b;
            public final Rect c;

            public a(nlf0 nlf0Var, Rect rect) {
                this.b = nlf0Var;
                this.c = rect;
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
                StringBuilder sb = new StringBuilder("Domain(viewProvider=");
                sb.append(this.b);
                sb.append(", anchorRect=");
                return yq.c(sb, this.c, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class b extends m {
            public final moq0.b b;

            public b(moq0.b bVar) {
                this.b = bVar;
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
                return "DomainClick(item=" + this.b + ')';
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class c extends m {
            public final wx40 b;
            public final Rect c;

            public c(wx40 wx40Var, Rect rect) {
                this.b = wx40Var;
                this.c = rect;
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
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Menu(viewProvider=");
                sb.append(this.b);
                sb.append(", anchorRect=");
                return yq.c(sb, this.c, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class d extends m {
            public final moq0.c b;

            public d(moq0.c cVar) {
                this.b = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "MenuClick(item=" + this.b + ')';
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class e extends m {
            public final aad0 b;
            public final Rect c;

            public e(aad0 aad0Var, Rect rect) {
                this.b = aad0Var;
                this.c = rect;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Notification(viewProvider=");
                sb.append(this.b);
                sb.append(", anchorRect=");
                return yq.c(sb, this.c, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class f extends m {
            public final moq0.d b;

            public f(moq0.d dVar) {
                this.b = dVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "NotificationClick(item=" + this.b + ')';
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class g extends m {
            public static final g b = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1417923727;
            }

            public final String toString() {
                return "PostSearch";
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class h extends m {
            public static final h b = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -1454266844;
            }

            public final String toString() {
                return "ScrollToTop";
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class i extends m {
            public final ProfileAction b;

            public i(ProfileAction profileAction) {
                this.b = profileAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ServiceClick(action=" + this.b + ')';
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class j extends m {
            public static final j b = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -1823932505;
            }

            public final String toString() {
                return "Services";
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class n extends UserProfileAction {
        public static final n b = new n();
    }

    /* compiled from: UserProfileAction.kt */
    public static final class o extends UserProfileAction {
        public static final o b = new o();
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class p extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static abstract class a extends p {

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$p$a$a, reason: collision with other inner class name */
            public static final class C1689a extends a {
            }

            /* compiled from: UserProfileAction.kt */
            public static final class b extends a {
                public final je80 b;

                public b(je80 je80Var) {
                    this.b = je80Var;
                }
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class q extends UserProfileAction {
        public static final q b = new q();
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class r extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class a extends r {
            public static final a b = new a();
        }

        /* compiled from: UserProfileAction.kt */
        public static final class b extends r {
            public final FragmentActivity b;

            public b(FragmentActivity fragmentActivity) {
                this.b = fragmentActivity;
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
                return "OnCreate(activity=" + this.b + ')';
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class c extends r {
            public static final c b = new c();
        }

        /* compiled from: UserProfileAction.kt */
        public static final class d extends r {
            public static final d b = new d();
        }

        /* compiled from: UserProfileAction.kt */
        public static final class e extends r {
            public static final e b = new e();
        }

        /* compiled from: UserProfileAction.kt */
        public static final class f extends r {
            public static final f b = new f();
        }

        /* compiled from: UserProfileAction.kt */
        public static final class g extends r {
            public static final g b = new g();
        }

        /* compiled from: UserProfileAction.kt */
        public static final class h extends r {
            public static final h b = new h();
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class s extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static abstract class a extends s {

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$s$a$a, reason: collision with other inner class name */
            public static final class C1690a extends a {
                public static final C1690a b = new C1690a();
            }

            /* compiled from: UserProfileAction.kt */
            public static abstract class b extends a {

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$s$a$b$a, reason: collision with other inner class name */
                public static final class C1691a extends b {
                    public final ProfileAction b;

                    public C1691a(ProfileAction profileAction) {
                        this.b = profileAction;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1691a) && epx.f(this.b, ((C1691a) obj).b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode();
                    }

                    public final String toString() {
                        return "Action(action=" + this.b + ')';
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$s$a$b$b, reason: collision with other inner class name */
                public static final class C1692b extends b {
                    public final zp0.a b;

                    public C1692b(zp0.a aVar) {
                        this.b = aVar;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1692b) && epx.f(this.b, ((C1692b) obj).b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode();
                    }

                    public final String toString() {
                        return "Common(action=" + this.b + ')';
                    }
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class b extends s {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends b {
                public final e4t b;

                public a(e4t e4tVar) {
                    this.b = e4tVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "Click(viewProvider=" + this.b + ')';
                }
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$s$b$b, reason: collision with other inner class name */
            public static final class C1693b extends b {
                public static final C1693b b = new C1693b();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class c extends b {
                public final moq0.a b;

                public c(moq0.a aVar) {
                    this.b = aVar;
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
                    return "OptionSelected(item=" + this.b + ')';
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class c extends s {

            /* compiled from: UserProfileAction.kt */
            public static abstract class a extends c {
                public final i0u0 b;

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$s$c$a$a, reason: collision with other inner class name */
                public static final class C1694a extends a {
                    public final i0u0 c;

                    public C1694a(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1694a) && epx.f(this.c, ((C1694a) obj).c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("AddToFriend(viewProvider="), this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class b extends a {
                    public final i0u0 c;

                    public b(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
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
                        return zq.b(new StringBuilder("AtFriends(viewProvider="), this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$s$c$a$c, reason: collision with other inner class name */
                public static final class C1695c extends a {
                    public final i0u0 c;

                    public C1695c(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1695c) && epx.f(this.c, ((C1695c) obj).c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Call(viewProvider="), this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class d extends a {
                    public final i0u0 c;

                    public d(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof d) && epx.f(this.c, ((d) obj).c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Follow(viewProvider="), this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class e extends a {
                    public final i0u0 c;

                    public e(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
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
                        return zq.b(new StringBuilder("Following(viewProvider="), this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class f extends a {
                    public final i0u0 c;

                    public f(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof f) && epx.f(this.c, ((f) obj).c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Gift(viewProvider="), this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class g extends a {
                    public final i0u0 c;

                    public g(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof g) && epx.f(this.c, ((g) obj).c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Menu(viewProvider="), this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class h extends a {
                    public final i0u0 c;

                    public h(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof h) && epx.f(this.c, ((h) obj).c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Message(viewProvider="), this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class i extends a {
                    public final i0u0 c;

                    public i(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof i) && epx.f(this.c, ((i) obj).c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Promote(viewProvider="), this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class j extends a {
                    public final i0u0 c;

                    public j(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof j) && epx.f(this.c, ((j) obj).c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode();
                    }

                    public final String toString() {
                        return zq.b(new StringBuilder("Publish(viewProvider="), this.c, ')');
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class k extends a {
                    public final mh40 c;

                    public k(mh40 mh40Var) {
                        super(mh40Var);
                        this.c = mh40Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof k) && epx.f(this.c, ((k) obj).c);
                    }

                    public final int hashCode() {
                        return this.c.hashCode();
                    }

                    public final String toString() {
                        return "ReplyToRequest(viewProvider=" + this.c + ')';
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class l extends a {
                    public final i0u0 c;

                    public l(i0u0 i0u0Var) {
                        super(i0u0Var);
                        this.c = i0u0Var;
                    }

                    @Override // com.vk.profile.user.impl.ui.UserProfileAction.s.c.a
                    public final i0u0 a() {
                        return this.c;
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
                        return zq.b(new StringBuilder("RequestSent(viewProvider="), this.c, ')');
                    }
                }

                public a(i0u0 i0u0Var) {
                    this.b = i0u0Var;
                }

                public i0u0 a() {
                    return this.b;
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class b extends c {
                public final String b;
                public final boolean c;

                public b() {
                    this(3);
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
                    StringBuilder sb = new StringBuilder("SendAddToFriendRequest(message=");
                    sb.append(this.b);
                    sb.append(", withLoading=");
                    return q0.a(sb, this.c, ')');
                }

                public b(int i) {
                    boolean z = (i & 2) != 0;
                    this.b = "";
                    this.c = z;
                }
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$s$c$c, reason: collision with other inner class name */
            public static final class C1696c extends c {
                public static final C1696c b = new C1696c();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class d extends c {
                public static final d b = new d();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class e extends c {
                public static final e b = new e();
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class d extends s {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends d {
                public static final a b = new a();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class b extends d {
                public static final b b = new b();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class c extends d {
                public static final c b = new c();
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$s$d$d, reason: collision with other inner class name */
            public static final class C1697d extends d {
                public static final C1697d b = new C1697d();
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class e extends s {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends e {
                public static final a b = new a();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class b extends e {
                public static final b b = new b();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class c extends e {
                public static final c b = new c();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class d extends e {
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
                    return q0.a(new StringBuilder("SilentModeSettingsChange(isEnable="), this.b, ')');
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class f extends s {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends f {
                public final ImageStatus b;

                public a(ImageStatus imageStatus) {
                    this.b = imageStatus;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "ImageStatusClick(imageStatus=" + this.b + ')';
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class b extends f {
                public final MusicTrack b;

                public b(MusicTrack musicTrack) {
                    this.b = musicTrack;
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
                    return rq.c(new StringBuilder("MusicTrackClick(musicTrack="), this.b, ')');
                }
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static abstract class g extends s {

            /* compiled from: UserProfileAction.kt */
            public static final class a extends g {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 846227341;
                }

                public final String toString() {
                    return "ConfirmHideInterestingBlock";
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class b extends g {
                public final StoryEntry b;

                public b(StoryEntry storyEntry) {
                    this.b = storyEntry;
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
                    return "Delete(storyEntry=" + this.b + ')';
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class c extends g {
                public final List<StoryEntry> b;

                /* JADX WARN: Multi-variable type inference failed */
                public c(List<? extends StoryEntry> list) {
                    this.b = list;
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
                    return ms9.a(')', new StringBuilder("MarkSeen(storyEntries="), this.b);
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class d extends g {
                public final String b;

                public d(String str) {
                    this.b = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("OnStoryPreviewVisible(id="), this.b, ')');
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class e extends g {
                public static final e b = new e();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class f extends g {
                public static final f b = new f();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public final int hashCode() {
                    return -1769777530;
                }

                public final String toString() {
                    return "ShowDialogHideInterestingBlock";
                }
            }

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$s$g$g, reason: collision with other inner class name */
            public static final class C1698g extends g {
                public final kkq0 b;

                public C1698g(kkq0 kkq0Var) {
                    this.b = kkq0Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1698g) && epx.f(this.b, ((C1698g) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "ShowInterestingBlock(data=" + this.b + ')';
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static final class h extends g {
                public final String b;
                public final iqq0.a c;

                public h(String str, iqq0.a aVar) {
                    this.b = str;
                    this.c = aVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof h)) {
                        return false;
                    }
                    h hVar = (h) obj;
                    return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + (this.b.hashCode() * 31);
                }

                public final String toString() {
                    return "ShowStoryFromInterestingBlock(id=" + this.b + ", animationProvider=" + this.c + ')';
                }
            }

            /* compiled from: UserProfileAction.kt */
            public static abstract class i extends g {

                /* compiled from: UserProfileAction.kt */
                public static final class a extends i {
                    public final zjm0 b;

                    public a(zjm0 zjm0Var) {
                        this.b = zjm0Var;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                    }

                    public final int hashCode() {
                        return this.b.hashCode();
                    }

                    public final String toString() {
                        return "Cancel(storyUpload=" + this.b + ')';
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class b extends i {
                    public final zjm0 b;

                    public b(zjm0 zjm0Var) {
                        this.b = zjm0Var;
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
                        return "Done(storyUpload=" + this.b + ')';
                    }
                }

                /* compiled from: UserProfileAction.kt */
                public static final class c extends i {
                    public final zjm0 b;

                    public c(zjm0 zjm0Var) {
                        this.b = zjm0Var;
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
                        return "Start(storyUpload=" + this.b + ')';
                    }
                }
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class t extends UserProfileAction {
        public static final t b = new t();
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class u extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static abstract class a extends u {

            /* compiled from: UserProfileAction.kt */
            /* renamed from: com.vk.profile.user.impl.ui.UserProfileAction$u$a$a, reason: collision with other inner class name */
            public static final class C1699a extends a {
                public static final C1699a b = new C1699a();
            }

            /* compiled from: UserProfileAction.kt */
            public static final class b extends a {
                public static final b b = new b();
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class v extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class a extends v {
            public static final a b = new a();
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class w extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class a extends w {
            public final ExtendedUserProfile b;

            public a(ExtendedUserProfile extendedUserProfile) {
                this.b = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("HideTooltip(profile="), this.b, ')');
            }
        }

        /* compiled from: UserProfileAction.kt */
        public static final class b extends w {
            public final ExtendedUserProfile b;

            public b(ExtendedUserProfile extendedUserProfile) {
                this.b = extendedUserProfile;
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
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("LoadGifts(profile="), this.b, ')');
            }
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class x extends UserProfileAction {
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final a e;

        /* compiled from: UserProfileAction.kt */
        public static final class a {
            public final boolean a;
            public final boolean b;

            public a() {
                this(false, false);
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
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ContentConfig(photos=");
                sb.append(this.a);
                sb.append(", albums=");
                return q0.a(sb, this.b, ')');
            }

            public a(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }
        }

        public x() {
            this(null, 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.b == xVar.b && this.c == xVar.c && this.d == xVar.d && epx.f(this.e, xVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "Reload(isInit=" + this.b + ", saveStories=" + this.c + ", isSwipeRefresh=" + this.d + ", contentConfig=" + this.e + ')';
        }

        public x(a aVar, int i) {
            boolean z = (i & 1) == 0;
            boolean z2 = (i & 2) == 0;
            boolean z3 = (i & 4) == 0;
            aVar = (i & 8) != 0 ? new a(false, false) : aVar;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = aVar;
        }
    }

    /* compiled from: UserProfileAction.kt */
    public static final class y extends UserProfileAction {
        public static final y b = new y();
    }

    /* compiled from: UserProfileAction.kt */
    public static abstract class z extends UserProfileAction {

        /* compiled from: UserProfileAction.kt */
        public static final class a extends z {
            public static final a b = new a();
        }
    }
}
