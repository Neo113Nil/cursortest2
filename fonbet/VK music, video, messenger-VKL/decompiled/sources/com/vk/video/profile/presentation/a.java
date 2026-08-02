package com.vk.video.profile.presentation;

import android.content.Intent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemType;
import defpackage.q0;
import xsna.epx;
import xsna.gp;
import xsna.kj50;
import xsna.shy;
import xsna.vu5;

/* compiled from: VideoProfileAction.kt */
/* loaded from: classes6.dex */
public abstract class a implements kj50 {

    /* compiled from: VideoProfileAction.kt */
    /* renamed from: com.vk.video.profile.presentation.a$a, reason: collision with other inner class name */
    public static final class C1957a extends a {
        public final int b;
        public final int c;
        public final Intent d;

        public C1957a(int i, int i2, Intent intent) {
            this.b = i;
            this.c = i2;
            this.d = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1957a)) {
                return false;
            }
            C1957a c1957a = (C1957a) obj;
            return this.b == c1957a.b && this.c == c1957a.c && epx.f(this.d, c1957a.d);
        }

        public final int hashCode() {
            int a = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            Intent intent = this.d;
            return a + (intent == null ? 0 : intent.hashCode());
        }

        public final String toString() {
            return "ActivityResult(requestCode=" + this.b + ", resultCode=" + this.c + ", data=" + this.d + ')';
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class a0 extends a {
        public static final a0 b = new a0();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class b0 extends a {
        public static final b0 b = new b0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b0);
        }

        public final int hashCode() {
            return 1142748770;
        }

        public final String toString() {
            return "Search";
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class c extends a {
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
            return "ChangeDescription(description=null)";
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class c0 extends a {
        public static final c0 b = new c0();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class d extends a {
        public final VideoNotificationsStatus b;

        public d(VideoNotificationsStatus videoNotificationsStatus) {
            this.b = videoNotificationsStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChangeTypeNotification(typeNotification=" + this.b + ')';
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class d0 extends a {
        public static final d0 b = new d0();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class e extends a {
        public static final e b = new e();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class e0 extends a {
        public static final e0 b = new e0();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class f0 extends a {
        public static final f0 b = new f0();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class g extends a {
        public static final g b = new g();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class g0 extends a {
        public static final g0 b = new g0();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class h extends a {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1136469418;
        }

        public final String toString() {
            return "CoverClicked";
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class h0 extends a {
        public static final h0 b = new h0();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class i extends a {
        public final VideoProfileCreatorOnboardingItemType b;

        public i(VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType) {
            this.b = videoProfileCreatorOnboardingItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CreatorOnboardingItemClicked(itemType=" + this.b + ')';
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class i0 extends a {
        public final UserId b;
        public final boolean c;

        public i0(UserId userId, boolean z) {
            this.b = userId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i0)) {
                return false;
            }
            i0 i0Var = (i0) obj;
            return epx.f(this.b, i0Var.b) && this.c == i0Var.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubscribeChange(ownerId=");
            sb.append(this.b);
            sb.append(", isSubscribed=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class j extends a {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -869034599;
        }

        public final String toString() {
            return "CreatorOnboardingShowTooltip";
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class k0 extends a {
        public static final k0 b = new k0();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class l extends a {
        public final AdminLeaveAction b;

        public l(AdminLeaveAction adminLeaveAction) {
            this.b = adminLeaveAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            AdminLeaveAction adminLeaveAction = this.b;
            if (adminLeaveAction == null) {
                return 0;
            }
            return adminLeaveAction.hashCode();
        }

        public final String toString() {
            return "GroupUnsubscribeConfirmed(adminLeaveAction=" + this.b + ')';
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class l0 extends a {
        public final VideoNotificationsStatus b;

        public l0(VideoNotificationsStatus videoNotificationsStatus) {
            this.b = videoNotificationsStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l0) && this.b == ((l0) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateNotificationStatus(typeNotification=" + this.b + ')';
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class m extends a {
        public static final m b = new m();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class m0 extends a {
        public final UserId b;

        public m0(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m0) && epx.f(this.b, ((m0) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("VideoDataChanged(ownerId="), this.b, ')');
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class n extends a {
        public final UserId b;
        public final int c;

        public n(UserId userId, int i) {
            this.b = userId;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return epx.f(this.b, nVar.b) && this.c == nVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HideWarningModal(groupId=");
            sb.append(this.b);
            sb.append(", warningId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class o extends a {
        public static final o b = new o();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class p extends a {
        public static final p b = new p();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class q extends a {
        public static final q b = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1859873194;
        }

        public final String toString() {
            return "OnAvatarClick";
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class r extends a {
        public static final r b = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -438021898;
        }

        public final String toString() {
            return "OnDonutChannelTooltipDispose";
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class s extends a {
        public final UserId b;

        public s(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnOnboardingTooltipDispose(ownerId="), this.b, ')');
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class t extends a {
        public static final t b = new t();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 1515038918;
        }

        public final String toString() {
            return "OnOpenAuthorCabinetTooltipDispose";
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class u extends a {
        public static final u b = new u();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return -1018708183;
        }

        public final String toString() {
            return "OpenAuthorCabinet";
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class v extends a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            ((v) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenDefaultSectionOrOwner(ownerId="), null, ')');
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class w extends a {
        public static final w b = new w();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class x extends a {
        public static final x b = new x();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class y extends a {
        public static final y b = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 1789779670;
        }

        public final String toString() {
            return "OpenUploadVideo";
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class z extends a {
        public static final z b = new z();
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class f extends a {
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
            return q0.a(new StringBuilder("CloseBottomSheet(force="), this.b, ')');
        }

        public f() {
            this(false);
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class j0 extends a {
        public final boolean b;

        public j0(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && this.b == ((j0) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("SubscribeUnSubscribeButtonClicked(isReturnSubscribe="), this.b, ')');
        }

        public j0() {
            this(false);
        }
    }

    /* compiled from: VideoProfileAction.kt */
    public static final class k extends a {
        public final boolean b;

        public k(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.b == ((k) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("EditCommunityData(isFromOnboardingTooltip="), this.b, ')');
        }

        public k() {
            this(false);
        }
    }
}
