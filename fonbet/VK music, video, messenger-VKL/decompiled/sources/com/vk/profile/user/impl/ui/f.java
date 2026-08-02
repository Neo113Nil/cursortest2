package com.vk.profile.user.impl.ui;

import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.articles.Article;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.profile.core.onboarding.model.ContentHintOnboardingResource;
import com.vk.profile.user.api.domain.onboarding.analytics.OnBoardingType;
import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.api.ExtendedUserProfile;
import defpackage.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.atq0;
import xsna.bh10;
import xsna.cwl0;
import xsna.epx;
import xsna.gp;
import xsna.hea0;
import xsna.hi70;
import xsna.ho8;
import xsna.hos;
import xsna.hwb0;
import xsna.i0u0;
import xsna.khq0;
import xsna.lq;
import xsna.moq0;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.uc;
import xsna.vpj0;
import xsna.vu5;
import xsna.xyd0;
import xsna.zq;

/* compiled from: UserProfileSideEffect.kt */
/* loaded from: classes5.dex */
public abstract class f {

    /* compiled from: UserProfileSideEffect.kt */
    public static abstract class a extends f {

        /* compiled from: UserProfileSideEffect.kt */
        /* renamed from: com.vk.profile.user.impl.ui.f$a$a, reason: collision with other inner class name */
        public static final class C1715a extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1715a)) {
                    return false;
                }
                ((C1715a) obj).getClass();
                return epx.f(null, null) && epx.f(null, null) && epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "CallsMenu(viewProvider=" + ((Object) null) + ", anchorRect=" + ((Object) null) + ", request=" + ((Object) null) + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return epx.f(null, null) && epx.f(null, null) && epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "NotificationsMenu(viewProvider=" + ((Object) null) + ", anchorRect=" + ((Object) null) + ", request=" + ((Object) null) + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class c extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                ((c) obj).getClass();
                return epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OpenAPlusModal(rknUrl="), null, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class d extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                ((d) obj).getClass();
                return epx.f(null, null) && epx.f(null, null) && epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OwnerMenu(viewProvider=" + ((Object) null) + ", anchorRect=" + ((Object) null) + ", params=" + ((Object) null) + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class e extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                ((e) obj).getClass();
                return epx.f(null, null) && epx.f(null, null) && epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "RelationsMenu(viewProvider=" + ((Object) null) + ", anchorRect=" + ((Object) null) + ", request=" + ((Object) null) + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        /* renamed from: com.vk.profile.user.impl.ui.f$a$f, reason: collision with other inner class name */
        public static final class C1716f extends a {
            public final boolean a;

            public C1716f(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1716f) && this.a == ((C1716f) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return q0.a(new StringBuilder("SetToolbarVisible(visible="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class g extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                ((g) obj).getClass();
                return epx.f(null, null) && epx.f(null, null) && epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "StoriesMenu(viewProvider=" + ((Object) null) + ", anchorRect=" + ((Object) null) + ", request=" + ((Object) null) + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class h extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                ((h) obj).getClass();
                return epx.f(null, null) && epx.f(null, null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ViewerMenu(viewProvider=" + ((Object) null) + ", params=" + ((Object) null) + ')';
            }
        }
    }

    /* compiled from: UserProfileSideEffect.kt */
    public static abstract class b extends f {

        /* compiled from: UserProfileSideEffect.kt */
        public static final class a extends b {
            public final UserId a;
            public final boolean b;

            public a(UserId userId, boolean z) {
                this.a = userId;
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
                return epx.f(this.a, aVar.a) && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Clip(userId=");
                sb.append(this.a);
                sb.append(", postedToWall=");
                return q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        /* renamed from: com.vk.profile.user.impl.ui.f$b$b, reason: collision with other inner class name */
        public static final class C1717b extends b {
            public final String a;

            public C1717b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1717b) && epx.f(this.a, ((C1717b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Story(ownerStoryId="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class c extends b {
            public final VideoFile a;
            public final boolean b;

            public c(VideoFile videoFile, boolean z) {
                this.a = videoFile;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && this.b == cVar.b;
            }

            public final int hashCode() {
                VideoFile videoFile = this.a;
                return Boolean.hashCode(this.b) + ((videoFile == null ? 0 : videoFile.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Video(video=");
                sb.append(this.a);
                sb.append(", postedToWall=");
                return q0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: UserProfileSideEffect.kt */
    public static abstract class c extends f {

        /* compiled from: UserProfileSideEffect.kt */
        public static final class a extends c {
            public final hwb0 a;

            public a(hwb0 hwb0Var) {
                this.a = hwb0Var;
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
                return "ActionButtonPopup(config=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class b extends c {
            public final ArrayList a;

            public b(ArrayList arrayList) {
                this.a = arrayList;
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
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("AdditionalAction(items="), this.a);
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        /* renamed from: com.vk.profile.user.impl.ui.f$c$c, reason: collision with other inner class name */
        public static final class C1718c extends c {
            public final ExtendedUserProfile a;

            public C1718c(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1718c) && epx.f(this.a, ((C1718c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("BlockUser(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class d extends c {
            public static final d a = new d();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class e extends c {
            public final ExtendedUserProfile a;
            public final khq0 b;

            public e(ExtendedUserProfile extendedUserProfile, khq0 khq0Var) {
                this.a = extendedUserProfile;
                this.b = khq0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Details(profile=" + this.a + ", callback=" + this.b + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        /* renamed from: com.vk.profile.user.impl.ui.f$c$f, reason: collision with other inner class name */
        public static final class C1719f extends c {
            public final i0u0 a;
            public final Rect b;
            public final List<moq0.b> c;

            /* JADX WARN: Multi-variable type inference failed */
            public C1719f(i0u0 i0u0Var, Rect rect, List<? extends moq0.b> list) {
                this.a = i0u0Var;
                this.b = rect;
                this.c = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1719f)) {
                    return false;
                }
                C1719f c1719f = (C1719f) obj;
                return epx.f(this.a, c1719f.a) && epx.f(this.b, c1719f.b) && epx.f(this.c, c1719f.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Domain(viewProvider=");
                sb.append(this.a);
                sb.append(", anchorRect=");
                sb.append(this.b);
                sb.append(", items=");
                return ms9.a(')', sb, this.c);
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class g extends c {
            public static final g a = new g();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class h extends c {
            public final hos a;

            public h(hos hosVar) {
                this.a = hosVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Friends(config=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class i extends c {
            public static final i a = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 769923910;
            }

            public final String toString() {
                return "HideStoriesInterestingBlock";
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class j extends c {
            public final UserId a;
            public final ImageStatus b;

            public j(UserId userId, ImageStatus imageStatus) {
                this.a = userId;
                this.b = imageStatus;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                return "ImageStatusDialog(userId=" + this.a + ", imageStatus=" + this.b + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class k extends c {
            public final i0u0 a;
            public final Rect b;
            public final List<moq0.c> c;

            public k(i0u0 i0u0Var, Rect rect, ListBuilder listBuilder) {
                this.a = i0u0Var;
                this.b = rect;
                this.c = listBuilder;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return epx.f(this.a, kVar.a) && epx.f(this.b, kVar.b) && epx.f(this.c, kVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Menu(viewProvider=");
                sb.append(this.a);
                sb.append(", anchorRect=");
                sb.append(this.b);
                sb.append(", items=");
                return ms9.a(')', sb, this.c);
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class l extends c {
            public final i0u0 a;
            public final Rect b;
            public final List<moq0.d> c;

            public l(i0u0 i0u0Var, Rect rect, ListBuilder listBuilder) {
                this.a = i0u0Var;
                this.b = rect;
                this.c = listBuilder;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b) && epx.f(this.c, lVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Notifications(viewProvider=");
                sb.append(this.a);
                sb.append(", anchorRect=");
                sb.append(this.b);
                sb.append(", items=");
                return ms9.a(')', sb, this.c);
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class m extends c {
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class n extends c {
            public final hea0 a;
            public final ExtendedUserProfile b;

            public n(hea0 hea0Var, ExtendedUserProfile extendedUserProfile) {
                this.a = hea0Var;
                this.b = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n)) {
                    return false;
                }
                n nVar = (n) obj;
                return epx.f(this.a, nVar.a) && epx.f(this.b, nVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ReportDialog(cover=");
                sb.append(this.a);
                sb.append(", profile=");
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class o extends c {
            public final ExtendedUserProfile a;

            public o(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class p extends c {
            public final ArrayList a;

            public p(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && epx.f(this.a, ((p) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Services(items="), this.a);
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class q extends c {
            public static final q a = new q();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class r extends c {
            public final String a;
            public final String b;

            public r(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof r)) {
                    return false;
                }
                r rVar = (r) obj;
                return epx.f(this.a, rVar.a) && epx.f(this.b, rVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SubscriptionOnboarding(title=");
                sb.append(this.a);
                sb.append(", subtitle=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class s extends c {
            public final List<moq0.a> a;
            public final i0u0 b;

            /* JADX WARN: Multi-variable type inference failed */
            public s(List<? extends moq0.a> list, i0u0 i0u0Var) {
                this.a = list;
                this.b = i0u0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof s)) {
                    return false;
                }
                s sVar = (s) obj;
                return epx.f(this.a, sVar.a) && epx.f(this.b, sVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UserAvatar(items=");
                sb.append(this.a);
                sb.append(", viewProvider=");
                return zq.b(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class t extends c {
            public final String a;
            public final ContentHintOnboardingResource b;
            public final OnBoardingType c;

            public t(ContentHintOnboardingResource contentHintOnboardingResource) {
                OnBoardingType onBoardingType = OnBoardingType.PROFILE;
                this.a = "services_onboarding_hint";
                this.b = contentHintOnboardingResource;
                this.c = onBoardingType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof t)) {
                    return false;
                }
                t tVar = (t) obj;
                return epx.f(this.a, tVar.a) && epx.f(this.b, tVar.b) && this.c == tVar.c;
            }

            public final int hashCode() {
                return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            }

            public final String toString() {
                return "VideoHintOnboarding(tag=" + this.a + ", videoHint=" + this.b + ", type=" + this.c + ", userId=null)";
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class u extends c {
            public final ExtendedUserProfile a;

            public u(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }
        }
    }

    /* compiled from: UserProfileSideEffect.kt */
    public static abstract class d extends f {

        /* compiled from: UserProfileSideEffect.kt */
        public static final class a extends d {
            public static final a a = new a();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class b extends d {
            public final int a;
            public final boolean b;

            public b(int i, boolean z) {
                this.a = i;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ScrollTo(position=");
                sb.append(this.a);
                sb.append(", smooth=");
                return q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class c extends d {
            public static final c a = new c();
        }
    }

    /* compiled from: UserProfileSideEffect.kt */
    public static abstract class e extends f {

        /* compiled from: UserProfileSideEffect.kt */
        public static final class a extends e {
            public final UserId a;

            public a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("AddToConversation(uid="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class a0 extends e {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a0)) {
                    return false;
                }
                ((a0) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OpenArticles(ownerId=null)";
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class a1 extends e {
            public final UserId a;

            public a1(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a1) && epx.f(this.a, ((a1) obj).a);
            }

            public final int hashCode() {
                UserId userId = this.a;
                if (userId == null) {
                    return 0;
                }
                return Long.hashCode(userId.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenScheduledClips(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static abstract class b extends e {

            /* compiled from: UserProfileSideEffect.kt */
            public static abstract class a extends b {

                /* compiled from: UserProfileSideEffect.kt */
                /* renamed from: com.vk.profile.user.impl.ui.f$e$b$a$a, reason: collision with other inner class name */
                public static final class C1720a extends a {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1720a)) {
                            return false;
                        }
                        ((C1720a) obj).getClass();
                        return epx.f(null, null);
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        return "AudioCall(params=" + ((Object) null) + ')';
                    }
                }

                /* compiled from: UserProfileSideEffect.kt */
                /* renamed from: com.vk.profile.user.impl.ui.f$e$b$a$b, reason: collision with other inner class name */
                public static final class C1721b extends a {
                    public static final C1721b a = new C1721b();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1721b);
                    }

                    public final int hashCode() {
                        return -1867610509;
                    }

                    public final String toString() {
                        return "MaxCall";
                    }
                }

                /* compiled from: UserProfileSideEffect.kt */
                public static final class c extends a {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof c)) {
                            return false;
                        }
                        ((c) obj).getClass();
                        return epx.f(null, null);
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        return "VideoCall(params=" + ((Object) null) + ')';
                    }
                }
            }

            /* compiled from: UserProfileSideEffect.kt */
            /* renamed from: com.vk.profile.user.impl.ui.f$e$b$b, reason: collision with other inner class name */
            public static final class C1722b extends b {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1722b)) {
                        return false;
                    }
                    ((C1722b) obj).getClass();
                    return epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CropNewAvatar(photoUrl=");
                    sb.append((String) null);
                    sb.append(", requestCode=");
                    return vu5.b(sb, 0, ')');
                }
            }

            /* compiled from: UserProfileSideEffect.kt */
            public static final class c extends b {
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
                    return Integer.hashCode(0);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("ShowDeleteAvatarConfirmation(pageIndex="), 0, ')');
                }
            }

            /* compiled from: UserProfileSideEffect.kt */
            public static abstract class d extends b {

                /* compiled from: UserProfileSideEffect.kt */
                public static final class a extends d {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof a)) {
                            return false;
                        }
                        ((a) obj).getClass();
                        return epx.f(null, null);
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        return "ShowLive(config=" + ((Object) null) + ')';
                    }
                }

                /* compiled from: UserProfileSideEffect.kt */
                /* renamed from: com.vk.profile.user.impl.ui.f$e$b$d$b, reason: collision with other inner class name */
                public static final class C1723b extends d {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1723b)) {
                            return false;
                        }
                        ((C1723b) obj).getClass();
                        return true;
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        return "ShowStories(config=null)";
                    }
                }

                /* compiled from: UserProfileSideEffect.kt */
                public static final class c extends d {
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
                        throw null;
                    }

                    public final String toString() {
                        return "ShowStory(config=null)";
                    }
                }
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class b0 extends e {
            public final MusicTrack a;
            public final UserId b;
            public final List<MusicTrack> c;

            public b0(UserId userId, MusicTrack musicTrack, List list) {
                this.a = musicTrack;
                this.b = userId;
                this.c = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b0)) {
                    return false;
                }
                b0 b0Var = (b0) obj;
                return epx.f(this.a, b0Var.a) && epx.f(this.b, b0Var.b) && epx.f(this.c, b0Var.c);
            }

            public final int hashCode() {
                int a = bh10.a(this.a.hashCode() * 31, 31, this.b.b);
                List<MusicTrack> list = this.c;
                return a + (list == null ? 0 : list.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenAudio(musicTrack=");
                sb.append(this.a);
                sb.append(", userId=");
                sb.append(this.b);
                sb.append(", preload=");
                return ms9.a(')', sb, this.c);
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class b1 extends e {
            public final ExtendedUserProfile a;

            public b1(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b1) && epx.f(this.a, ((b1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenSearchPost(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class c0 extends e {
            public final Playlist a;

            public c0(Playlist playlist) {
                this.a = playlist;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c0) && epx.f(this.a, ((c0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenAudioAlbum(playlist=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class c1 extends e {
            public final UserId a;

            public c1(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c1) && epx.f(this.a, ((c1) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenStats(userId="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class d extends e {
            public final ExtendedUserProfile a;

            public d(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
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
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("Call(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class d0 extends e {
            public final ArrayList a;
            public final String b;
            public final int c;
            public final hi70 d;
            public final UserProfile e;

            public d0(ArrayList arrayList, String str, int i, hi70 hi70Var, UserProfile userProfile) {
                this.a = arrayList;
                this.b = str;
                this.c = i;
                this.d = hi70Var;
                this.e = userProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d0)) {
                    return false;
                }
                d0 d0Var = (d0) obj;
                return epx.f(this.a, d0Var.a) && epx.f(this.b, d0Var.b) && this.c == d0Var.c && epx.f(this.d, d0Var.d) && epx.f(this.e, d0Var.e);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int hashCode2 = (this.d.hashCode() + shy.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
                UserProfile userProfile = this.e;
                return hashCode2 + (userProfile != null ? userProfile.hashCode() : 0);
            }

            public final String toString() {
                return "OpenClip(clips=" + this.a + ", nextFrom=" + this.b + ", selectedPosition=" + this.c + ", clipPhotoProvider=" + this.d + ", profile=" + this.e + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class d1 extends e {
            public static final d1 a = new d1();
        }

        /* compiled from: UserProfileSideEffect.kt */
        /* renamed from: com.vk.profile.user.impl.ui.f$e$e, reason: collision with other inner class name */
        public static final class C1724e extends e {
            public final String a;
            public final int b;

            public C1724e(String str, int i) {
                this.a = str;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1724e)) {
                    return false;
                }
                C1724e c1724e = (C1724e) obj;
                return epx.f(this.a, c1724e.a) && this.b == c1724e.b;
            }

            public final int hashCode() {
                String str = this.a;
                return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ChangeCover(avatarUrl=");
                sb.append(this.a);
                sb.append(", requestCode=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class e0 extends e {
            public final UserId a;

            public e0(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e0) && epx.f(this.a, ((e0) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenClipsCoAuthorInvitationsDialog(profileId="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class e1 extends e {
            public final VideoFile a;
            public final uc b;

            public e1(VideoFile videoFile, uc ucVar) {
                this.a = videoFile;
                this.b = ucVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e1)) {
                    return false;
                }
                e1 e1Var = (e1) obj;
                return epx.f(this.a, e1Var.a) && epx.f(this.b, e1Var.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "OpenVideo(video=" + this.a + ", delegate=" + this.b + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        /* renamed from: com.vk.profile.user.impl.ui.f$e$f, reason: collision with other inner class name */
        public static abstract class AbstractC1725f extends e {

            /* compiled from: UserProfileSideEffect.kt */
            /* renamed from: com.vk.profile.user.impl.ui.f$e$f$a */
            public static final class a extends AbstractC1725f {
                public final UserId a;

                public a(UserId userId) {
                    this.a = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                }

                public final int hashCode() {
                    return Long.hashCode(this.a.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("ClipsFeed(userId="), this.a, ')');
                }
            }

            /* compiled from: UserProfileSideEffect.kt */
            /* renamed from: com.vk.profile.user.impl.ui.f$e$f$b */
            public static final class b extends AbstractC1725f {
                public final VideoFile a;

                public b(VideoFile videoFile) {
                    this.a = videoFile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    VideoFile videoFile = this.a;
                    if (videoFile == null) {
                        return 0;
                    }
                    return videoFile.hashCode();
                }

                public final String toString() {
                    return lq.a(new StringBuilder("OpenSingleVideo(videoFile="), this.a, ')');
                }
            }

            /* compiled from: UserProfileSideEffect.kt */
            /* renamed from: com.vk.profile.user.impl.ui.f$e$f$c */
            public static final class c extends AbstractC1725f {
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
                    return ho8.a(new StringBuilder("OpenStory(ownerStoryId="), this.a, ')');
                }
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class f0 extends e {
            public final UserId a;

            public f0(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f0) && epx.f(this.a, ((f0) obj).a);
            }

            public final int hashCode() {
                UserId userId = this.a;
                if (userId == null) {
                    return 0;
                }
                return Long.hashCode(userId.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenClipsDrafts(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class f1 extends e {
            public final VideoAlbum a;

            public f1(VideoAlbum videoAlbum) {
                this.a = videoAlbum;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f1) && epx.f(this.a, ((f1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenVideoAlbum(album=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class g extends e {
            public static final g a = new g();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class g0 extends e {
            public final ClipsPlaylist a;

            public g0(ClipsPlaylist clipsPlaylist) {
                this.a = clipsPlaylist;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g0) && epx.f(this.a, ((g0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenClipsPlaylist(playlist=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class g1 extends e {
            public final UserId a;

            public g1(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g1) && epx.f(this.a, ((g1) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("OpenVideoAlbums(userId="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class h extends e {
            public static final h a = new h();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class h0 extends e {
            public final List<ProfileTabOptions> a;

            /* JADX WARN: Multi-variable type inference failed */
            public h0(List<? extends ProfileTabOptions> list) {
                this.a = list;
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class h1 extends e {
            public final UserId a;
            public final String b;

            public h1(UserId userId, String str) {
                this.a = userId;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h1)) {
                    return false;
                }
                h1 h1Var = (h1) obj;
                return epx.f(this.a, h1Var.a) && epx.f(this.b, h1Var.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenVideos(userId=");
                sb.append(this.a);
                sb.append(", title=");
                return ho8.a(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class i extends e {
            public final UserProfile a;
            public final List<String> b;

            public i(UserProfile userProfile, List<String> list) {
                this.a = userProfile;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                List<String> list = this.b;
                return hashCode + (list == null ? 0 : list.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CreateStories(profile=");
                sb.append(this.a);
                sb.append(", photos=");
                return ms9.a(')', sb, this.b);
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class i0 extends e {
            public static final i0 a = new i0();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class i1 extends e {
            public final ExtendedUserProfile a;

            public i1(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i1) && epx.f(this.a, ((i1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenWishList(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class j extends e {
            public final ExtendedUserProfile a;

            public j(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("CreateStory(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class j0 extends e {
            public static final j0 a = new j0();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class j1 extends e {
            public static final j1 a = new j1();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class k extends e {
            public final UserId a;

            public k(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("EasyPromoteUser(userProfileId="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class k0 extends e {
            public static final k0 a = new k0();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class k1 extends e {
            public final xyd0 a;

            public k1(xyd0 xyd0Var) {
                this.a = xyd0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k1) && epx.f(this.a, ((k1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ProfilePhotos(config=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class l extends e {
            public final ExtendedUserProfile a;
            public final int b;

            public l(ExtendedUserProfile extendedUserProfile, int i) {
                this.a = extendedUserProfile;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l)) {
                    return false;
                }
                l lVar = (l) obj;
                return epx.f(this.a, lVar.a) && this.b == lVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("EditProfilePhoto(profile=");
                sb.append(this.a);
                sb.append(", requestCode=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class l0 extends e {
            public static final l0 a = new l0();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class l1 extends e {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof l1)) {
                    return false;
                }
                ((l1) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ReportCover(cover=null)";
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class m extends e {
            public static final m a = new m();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class m0 extends e {
            public final ExtendedUserProfile a;

            public m0(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m0) && epx.f(this.a, ((m0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenGift(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class m1 extends e {
            public final UserId a;

            public m1(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m1) && epx.f(this.a, ((m1) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ReportProfile(uid="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class n extends e {
            public final Action a;

            public n(Action action) {
                this.a = action;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && epx.f(this.a, ((n) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "InvokeAction(action=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class n0 extends e {
            public static final n0 a = new n0();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class n1 extends e {
            public final ExtendedUserProfile a;
            public final CatalogedGift b;

            public n1(ExtendedUserProfile extendedUserProfile, CatalogedGift catalogedGift) {
                this.a = extendedUserProfile;
                this.b = catalogedGift;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n1)) {
                    return false;
                }
                n1 n1Var = (n1) obj;
                return epx.f(this.a, n1Var.a) && epx.f(this.b, n1Var.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "SendGift(profile=" + this.a + ", gift=" + this.b + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class o extends e {
            public static final o a = new o();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class o0 extends e {
            public final String a;
            public final MobileOfficialAppsCoreNavStat$EventScreen b;

            public o0(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str) {
                this.a = str;
                this.b = mobileOfficialAppsCoreNavStat$EventScreen;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof o0)) {
                    return false;
                }
                o0 o0Var = (o0) obj;
                return epx.f(this.a, o0Var.a) && this.b == o0Var.b;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.b;
                return hashCode + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode());
            }

            public final String toString() {
                return "OpenLink(link=" + this.a + ", stat=" + this.b + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class o1 extends e {
            public final String a;
            public final String b;
            public final boolean c;
            public final UserProfile d;

            public o1(String str, String str2, boolean z, UserProfile userProfile) {
                this.a = str;
                this.b = str2;
                this.c = z;
                this.d = userProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof o1)) {
                    return false;
                }
                o1 o1Var = (o1) obj;
                return epx.f(this.a, o1Var.a) && epx.f(this.b, o1Var.b) && this.c == o1Var.c && epx.f(this.d, o1Var.d);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int b = qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
                UserProfile userProfile = this.d;
                return b + (userProfile != null ? userProfile.hashCode() : 0);
            }

            public final String toString() {
                return "ShareProfile(link=" + this.a + ", photo=" + this.b + ", isCurrentUser=" + this.c + ", userProfile=" + this.d + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class p extends e {
            public static final p a = new p();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class p0 extends e {
            public static final p0 a = new p0();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class p1 extends e {
            public static final p1 a = new p1();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class q extends e {
            public final cwl0 a;

            public q(cwl0 cwl0Var) {
                this.a = cwl0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof q) && epx.f(this.a, ((q) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Narratives(config=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class q0 extends e {
            public final ExtendedUserProfile a;

            public q0(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof q0) && epx.f(this.a, ((q0) obj).a);
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "OpenMusic(profile=" + this.a + ", isExplore=false)";
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class q1 extends e {
            public final cwl0 a;

            public q1(cwl0 cwl0Var) {
                this.a = cwl0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof q1) && epx.f(this.a, ((q1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Stories(config=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class r extends e {
            public static final r a = new r();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class r0 extends e {
            public final ExtendedUserProfile a;

            public r0(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof r0) && epx.f(this.a, ((r0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenMusicAlbums(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class r1 extends e {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof r1)) {
                    return false;
                }
                ((r1) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ToggleFave(page=null, meta=null, isAdd=false)";
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class s extends e {
            public static final s a = new s();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class s0 extends e {
            public final ExtendedUserProfile a;

            public s0(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof s0) && epx.f(this.a, ((s0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenMusicSearch(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class s1 extends e {
            public final UserId a;

            public s1(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof s1) && epx.f(this.a, ((s1) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("UploadVideo(userId="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class t extends e {
            public final ExtendedUserProfile a;

            public t(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && epx.f(this.a, ((t) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenAddPhoto(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class t0 extends e {
            public static final t0 a = new t0();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class t1 extends e {
            public final ExtendedUserProfile a;

            public t1(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t1) && epx.f(this.a, ((t1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("UserFollowers(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class u extends e {
            public static final u a = new u();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class u0 extends e {
            public final Narrative a;
            public final WeakReference<View> b;

            public u0(Narrative narrative, WeakReference<View> weakReference) {
                this.a = narrative;
                this.b = weakReference;
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class u1 extends e {
            public final ExtendedUserProfile a;

            public u1(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof u1) && epx.f(this.a, ((u1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("UserFriends(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class v extends e {
            public final ExtendedUserProfile a;

            public v(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof v) && epx.f(this.a, ((v) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenAllClips(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class v0 extends e {
            public final PhotoAlbum a;

            public v0(PhotoAlbum photoAlbum) {
                this.a = photoAlbum;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof v0) && epx.f(this.a, ((v0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenPhotoAlbum(album=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class v1 extends e {
            public final ExtendedUserProfile a;

            public v1(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof v1) && epx.f(this.a, ((v1) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("UserMutualFriends(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class w extends e {
            public static final w a = new w();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class w0 extends e {
            public final ExtendedUserProfile a;

            public w0(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof w0) && epx.f(this.a, ((w0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenPhotoAlbums(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class x extends e {
            public final ExtendedUserProfile a;

            public x(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof x) && epx.f(this.a, ((x) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenAllPhotos(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class x0 extends e {
            public static final x0 a = new x0();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class y extends e {
            public final WebApiApplication a;

            public y(WebApiApplication webApiApplication) {
                this.a = webApiApplication;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof y) && epx.f(this.a, ((y) obj).a);
            }

            public final int hashCode() {
                return (int) this.a.b;
            }

            public final String toString() {
                return "OpenApp(webApiApplication=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class y0 extends e {
            public final ExtendedUserProfile a;

            public y0(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof y0) && epx.f(this.a, ((y0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenProfileGifts(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class z extends e {
            public final Article a;

            public z(Article article) {
                this.a = article;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof z) && epx.f(this.a, ((z) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OpenArticle(article=" + this.a + ')';
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class z0 extends e {
            public final ExtendedUserProfile a;

            public z0(ExtendedUserProfile extendedUserProfile) {
                this.a = extendedUserProfile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof z0) && epx.f(this.a, ((z0) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.k.d(new StringBuilder("OpenQuestions(profile="), this.a, ')');
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class c extends e {
            public final boolean a;

            public c(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Back(useDefaultNativeNavigation="), this.a, ')');
            }

            public c() {
                this(false);
            }
        }
    }

    /* compiled from: UserProfileSideEffect.kt */
    /* renamed from: com.vk.profile.user.impl.ui.f$f, reason: collision with other inner class name */
    public static final class C1726f extends f {
        public final long a;

        public C1726f(long j) {
            this.a = j;
        }
    }

    /* compiled from: UserProfileSideEffect.kt */
    public static final class g extends f {
        public final Intent a;

        public g(Intent intent) {
            this.a = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SendBroadcast(intent=" + this.a + ')';
        }
    }

    /* compiled from: UserProfileSideEffect.kt */
    public static final class h extends f {
        public final atq0 a;

        public h(atq0 atq0Var) {
            this.a = atq0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SendNotification(notification=" + this.a + ')';
        }
    }

    /* compiled from: UserProfileSideEffect.kt */
    public static final class i extends f {
        public static final i a = new i();
    }

    /* compiled from: UserProfileSideEffect.kt */
    public static final class j extends f {
        public static final j a = new j();
    }

    /* compiled from: UserProfileSideEffect.kt */
    public static abstract class k extends f {

        /* compiled from: UserProfileSideEffect.kt */
        public static abstract class a extends k {
            public final WeakReference<View> a;
            public final vpj0 b;

            /* compiled from: UserProfileSideEffect.kt */
            /* renamed from: com.vk.profile.user.impl.ui.f$k$a$a, reason: collision with other inner class name */
            public static final class C1727a extends a {
                public final boolean c;
                public final String d;

                public C1727a(WeakReference weakReference, boolean z, String str, vpj0 vpj0Var) {
                    super(weakReference, vpj0Var);
                    this.c = z;
                    this.d = str;
                }
            }

            public a() {
                throw null;
            }

            public a(WeakReference weakReference, vpj0 vpj0Var) {
                this.a = weakReference;
                this.b = vpj0Var;
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class b extends k {
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
                throw null;
            }

            public final String toString() {
                return "ShowTooltipOnButton(viewProvider=null, isFooterVisible=false)";
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class c extends k {
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
                throw null;
            }

            public final String toString() {
                return "ShowTooltipOnTab(tabLayout=null, position=0)";
            }
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class d extends d {
            public final WeakReference<View> a;

            public d(WeakReference<View> weakReference) {
                this.a = weakReference;
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
                return "StoryCreateAvatarEntryPoint(avatarView=" + this.a + ')';
            }
        }
    }

    /* compiled from: UserProfileSideEffect.kt */
    public static abstract class l extends f {

        /* compiled from: UserProfileSideEffect.kt */
        public static final class a extends l {
            public static final a a = new a();
        }

        /* compiled from: UserProfileSideEffect.kt */
        public static final class b extends l {
            public static final b a = new b();
        }
    }
}
