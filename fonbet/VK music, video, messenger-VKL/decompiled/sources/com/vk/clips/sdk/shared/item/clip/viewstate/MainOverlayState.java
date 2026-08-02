package com.vk.clips.sdk.shared.item.clip.viewstate;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivity;
import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.List;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.a26;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.jvm0;
import xsna.lw;
import xsna.qoy;
import xsna.r3q0;
import xsna.ti50;
import xsna.tlo0;
import xsna.u11;
import xsna.urd0;
import xsna.x590;
import xsna.zrp;

/* compiled from: MainOverlayState.kt */
/* loaded from: classes17.dex */
public interface MainOverlayState extends r3q0 {

    /* compiled from: MainOverlayState.kt */
    public interface PublicationDateState {

        /* compiled from: MainOverlayState.kt */
        public static final class Visible implements PublicationDateState {
            public final String a;
            public final Alignment b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: MainOverlayState.kt */
            public static final class Alignment {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Alignment[] $VALUES;
                public static final Alignment Horizontal;
                public static final Alignment Vertical;

                static {
                    Alignment alignment = new Alignment("Horizontal", 0);
                    Horizontal = alignment;
                    Alignment alignment2 = new Alignment("Vertical", 1);
                    Vertical = alignment2;
                    Alignment[] alignmentArr = {alignment, alignment2};
                    $VALUES = alignmentArr;
                    $ENTRIES = new asp(alignmentArr);
                }

                public Alignment() {
                    throw null;
                }

                public static Alignment valueOf(String str) {
                    return (Alignment) Enum.valueOf(Alignment.class, str);
                }

                public static Alignment[] values() {
                    return (Alignment[]) $VALUES.clone();
                }
            }

            public Visible(String str, Alignment alignment) {
                this.a = str;
                this.b = alignment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Visible)) {
                    return false;
                }
                Visible visible = (Visible) obj;
                return epx.f(this.a, visible.a) && this.b == visible.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Visible(date=" + this.a + ", alignment=" + this.b + ')';
            }
        }

        /* compiled from: MainOverlayState.kt */
        public static final class a implements PublicationDateState {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1131634992;
            }

            public final String toString() {
                return "Hidden";
            }
        }
    }

    /* compiled from: MainOverlayState.kt */
    public static final class a {
        public final lw a;
        public final lw b;

        public a(lw lwVar, lw lwVar2) {
            this.a = lwVar;
            this.b = lwVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionButtonsState(primaryActionButtonState=" + this.a + ", secondaryActionButtonState=" + this.b + ')';
        }
    }

    /* compiled from: MainOverlayState.kt */
    public interface b {

        /* compiled from: MainOverlayState.kt */
        public static final class a implements b {
            public final int a;
            public final Integer b;
            public final UserId c;
            public final String d;
            public final tlo0.h e;
            public final boolean f;
            public final boolean g;

            public a(int i, Integer num, UserId userId, String str, tlo0.h hVar, boolean z, boolean z2) {
                this.a = i;
                this.b = num;
                this.c = userId;
                this.d = str;
                this.e = hVar;
                this.f = z;
                this.g = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f == aVar.f && this.g == aVar.g;
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                Integer num = this.b;
                return Boolean.hashCode(this.g) + qoy.b(u11.c(urd0.a(bh10.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c.b), 31, this.d), 31, this.e.a), 31, this.f);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Comment(id=");
                sb.append(this.a);
                sb.append(", parentCommentId=");
                sb.append(this.b);
                sb.append(", userId=");
                sb.append(this.c);
                sb.append(", photo=");
                sb.append(this.d);
                sb.append(", text=");
                sb.append(this.e);
                sb.append(", isFocused=");
                sb.append(this.f);
                sb.append(", showAnimated=");
                return q0.a(sb, this.g, ')');
            }
        }

        /* compiled from: MainOverlayState.kt */
        /* renamed from: com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState$b$b, reason: collision with other inner class name */
        public static final class C0663b implements b {
            public static final C0663b a = new C0663b();
        }

        /* compiled from: MainOverlayState.kt */
        public static final class c implements b {
            public final ArrayList a;
            public final boolean b;
            public final boolean c;

            /* compiled from: MainOverlayState.kt */
            public static final class a {
                public final UserId a;
                public final String b;
                public final String c;
                public final SdkClipActivity.OwnerSex d;
                public final String e;

                public a(UserId userId, String str, String str2, SdkClipActivity.OwnerSex ownerSex, String str3) {
                    this.a = userId;
                    this.b = str;
                    this.c = str2;
                    this.d = ownerSex;
                    this.e = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e);
                }

                public final int hashCode() {
                    int a = urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
                    String str = this.c;
                    int hashCode = (this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                    String str2 = this.e;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Like(userId=");
                    sb.append(this.a);
                    sb.append(", photo=");
                    sb.append(this.b);
                    sb.append(", name=");
                    sb.append(this.c);
                    sb.append(", sex=");
                    sb.append(this.d);
                    sb.append(", animatedBadgeUrl=");
                    return ho8.a(sb, this.e, ')');
                }
            }

            public c(ArrayList arrayList, boolean z, boolean z2) {
                this.a = arrayList;
                this.b = z;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && this.b == cVar.b && this.c == cVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Likes(likes=");
                sb.append(this.a);
                sb.append(", isFocused=");
                sb.append(this.b);
                sb.append(", showAnimated=");
                return q0.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: MainOverlayState.kt */
    public interface c {

        /* compiled from: MainOverlayState.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -225634938;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: MainOverlayState.kt */
        public static final class b implements c {
            public final ArrayList a;

            public b(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return j.b(')', new StringBuilder("Visible(items="), this.a);
            }
        }
    }

    /* compiled from: MainOverlayState.kt */
    public static final class d implements MainOverlayState {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        @Override // xsna.r3q0
        public final String F() {
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
            return ho8.a(new StringBuilder("Hidden(uniqueKey="), this.a, ')');
        }
    }

    /* compiled from: MainOverlayState.kt */
    public interface e {

        /* compiled from: MainOverlayState.kt */
        public static final class a implements e {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1695371833;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: MainOverlayState.kt */
        public interface b extends e {

            /* compiled from: MainOverlayState.kt */
            public static final class a implements b {
                public final String a;
                public final ArrayList b;

                public a(String str, ArrayList arrayList) {
                    this.a = str;
                    this.b = arrayList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && this.b.equals(aVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Question(title=");
                    sb.append(this.a);
                    sb.append(", answers=");
                    return j.b(')', sb, this.b);
                }
            }

            /* compiled from: MainOverlayState.kt */
            /* renamed from: com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState$e$b$b, reason: collision with other inner class name */
            public static final class C0664b implements b {
                public static final C0664b a = new C0664b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0664b);
                }

                public final int hashCode() {
                    return -868763902;
                }

                public final String toString() {
                    return "Thanks";
                }
            }
        }
    }

    /* compiled from: MainOverlayState.kt */
    public interface f {

        /* compiled from: MainOverlayState.kt */
        public static final class a implements f {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 731975187;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: MainOverlayState.kt */
        public static final class b implements f {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 770542889;
            }

            public final String toString() {
                return "Visible";
            }
        }
    }

    /* compiled from: MainOverlayState.kt */
    public static final class g {
        public final PublicationDateState a;
        public final jvm0 b;
        public final boolean c;

        public g(PublicationDateState publicationDateState, jvm0 jvm0Var, boolean z) {
            this.a = publicationDateState;
            this.b = jvm0Var;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && this.c == gVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RightTitleState(publicationDateState=");
            sb.append(this.a);
            sb.append(", subscribeButtonState=");
            sb.append(this.b);
            sb.append(", dotSeparatorVisible=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MainOverlayState.kt */
    public static final class h {
        public final SdkClipVideoFile a;
        public final boolean b;
        public final boolean c;

        public h(SdkClipVideoFile sdkClipVideoFile, boolean z, boolean z2) {
            this.a = sdkClipVideoFile;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && this.b == hVar.b && this.c == hVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SideControlsState(clip=");
            sb.append(this.a);
            sb.append(", countersVisible=");
            sb.append(this.b);
            sb.append(", dislikeVisible=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MainOverlayState.kt */
    public static final class i implements MainOverlayState {
        public final String a;
        public final h b;
        public final x590 c;
        public final g d;
        public final DescriptionViewState e;
        public final f f;
        public final ti50.b g;
        public final b h;
        public final c i;
        public final c j;
        public final a k;
        public final List<SubtitleRenderItem> l;
        public final boolean m;
        public final e n;
        public final a26 o;
        public final boolean p;
        public final boolean q;

        public i(String str, h hVar, x590 x590Var, g gVar, DescriptionViewState descriptionViewState, f fVar, ti50.b bVar, b bVar2, c cVar, c cVar2, a aVar, List list, boolean z, e eVar, a26 a26Var, boolean z2, boolean z3) {
            this.a = str;
            this.b = hVar;
            this.c = x590Var;
            this.d = gVar;
            this.e = descriptionViewState;
            this.f = fVar;
            this.g = bVar;
            this.h = bVar2;
            this.i = cVar;
            this.j = cVar2;
            this.k = aVar;
            this.l = list;
            this.m = z;
            this.n = eVar;
            this.o = a26Var;
            this.p = z2;
            this.q = z3;
        }

        @Override // xsna.r3q0
        public final String F() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && this.b.equals(iVar.b) && this.c.equals(iVar.c) && this.d.equals(iVar.d) && epx.f(this.e, iVar.e) && epx.f(this.f, iVar.f) && this.g.equals(iVar.g) && this.h.equals(iVar.h) && epx.f(this.i, iVar.i) && epx.f(this.j, iVar.j) && this.k.equals(iVar.k) && epx.f(this.l, iVar.l) && this.m == iVar.m && epx.f(this.n, iVar.n) && this.o.equals(iVar.o) && this.p == iVar.p && this.q == iVar.q;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.q) + qoy.b((this.o.hashCode() + ((this.n.hashCode() + qoy.b(fw3.a((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.l), 31, this.m)) * 31)) * 31, 31, this.p);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(uniqueKey=");
            sb.append(this.a);
            sb.append(", sideControlsState=");
            sb.append(this.b);
            sb.append(", ownerState=");
            sb.append(this.c);
            sb.append(", rightTitleState=");
            sb.append(this.d);
            sb.append(", descriptionState=");
            sb.append(this.e);
            sb.append(", productsContainerState=");
            sb.append(this.f);
            sb.append(", muteState=");
            sb.append(this.g);
            sb.append(", activitiesState=");
            sb.append(this.h);
            sb.append(", primaryBadgesState=");
            sb.append(this.i);
            sb.append(", secondaryBadgesState=");
            sb.append(this.j);
            sb.append(", actionButtonsState=");
            sb.append(this.k);
            sb.append(", subtitleRenderItems=");
            sb.append(this.l);
            sb.append(", coauthorInvitationVisible=");
            sb.append(this.m);
            sb.append(", npsState=");
            sb.append(this.n);
            sb.append(", bannerCompanionState=");
            sb.append(this.o);
            sb.append(", isItemFocused=");
            sb.append(this.p);
            sb.append(", shopsMoreWasShown=");
            return q0.a(sb, this.q, ')');
        }
    }
}
