package com.vk.video.profile.presentation;

import com.vk.channelrestrictions.WarningNotification;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.video.profile.presentation.models.StateSubscribeNotification;
import com.vkontakte.android.R;
import defpackage.q0;
import java.util.ArrayList;
import xsna.epx;
import xsna.gp;
import xsna.ho8;
import xsna.n3a;
import xsna.vu5;

/* compiled from: VideoProfileSideEffect.kt */
/* loaded from: classes6.dex */
public interface h {

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class a implements h {
        public final Owner a;
        public final boolean b;

        public a(Owner owner, boolean z) {
            this.a = owner;
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
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeAvatar(owner=");
            sb.append(this.a);
            sb.append(", isFromOnboarding=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class a0 implements h {
        public final UserId a;
        public final WarningNotification b;

        public a0(UserId userId, WarningNotification warningNotification) {
            this.a = userId;
            this.b = warningNotification;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return epx.f(this.a, a0Var.a) && epx.f(this.b, a0Var.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            return "ShowWarningModal(groupId=" + this.a + ", warningNotification=" + this.b + ')';
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class b implements h {
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
            return gp.b(new StringBuilder("CreatorOnboardingShowTooltip(ownerId="), null, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class c implements h {
        public static final c a = new c();
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class d implements h {
        public static final d a = new d();
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class e implements h {
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
            return ho8.a(new StringBuilder("OpenAuthorCabinet(url="), this.a, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class f implements h {
        public final UserId a;
        public final String b;

        public f(UserId userId, String str) {
            this.a = userId;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a.b) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCommunityEditScreen(id=");
            sb.append(this.a);
            sb.append(", source=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class g implements h {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1522232778;
        }

        public final String toString() {
            return "OpenDefaultSection";
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    /* renamed from: com.vk.video.profile.presentation.h$h, reason: collision with other inner class name */
    public static final class C1963h implements h {
        public static final C1963h a = new C1963h();
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class i implements h {
        public final ArrayList a;
        public final UserId b;

        public i(UserId userId, ArrayList arrayList) {
            this.a = arrayList;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            UserId userId = this.b;
            return Integer.hashCode(1001) + ((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31);
        }

        public final String toString() {
            return "OpenOwnersPicker(owners=" + this.a + ", preselectOwnerId=" + this.b + ", requestCode=1001)";
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class j implements h {
        public static final j a = new j();
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class k implements h {
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
            return gp.b(new StringBuilder("OpenReport(id="), this.a, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class l implements h {
        public final UserId a;

        public l(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenSearch(uid="), this.a, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class m implements h {
        public static final m a = new m();
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class n implements h {
        public final Owner a;

        public n(Owner owner) {
            this.a = owner;
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
            return "OpenUploadVideoBottomSheet(owner=" + this.a + ')';
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class o implements h {
        public final Owner a;

        public o(Owner owner) {
            this.a = owner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.a, ((o) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenVkProfile(owner=" + this.a + ')';
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class p implements h {
        public static final p a = new p();
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class q implements h {
        public final n3a a;
        public final boolean b;

        public q(n3a n3aVar, boolean z) {
            this.a = n3aVar;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.a.equals(qVar.a) && this.b == qVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SendCatalogCommand(command=");
            sb.append(this.a);
            sb.append(", onlyInsideThisCatalogInstance=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class r implements h {
        public final String a;
        public final UserId b;

        public r(String str, UserId userId) {
            this.a = str;
            this.b = userId;
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
            String str = this.a;
            return Long.hashCode(this.b.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShareProfile(ownerScreenName=");
            sb.append(this.a);
            sb.append(", ownerId=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class s implements h {
        public final int a;

        public s(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.a == ((s) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ShowAgeMarkSheet(ageMark="), this.a, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class t implements h {
        public final StateSubscribeNotification a;

        public t(StateSubscribeNotification stateSubscribeNotification) {
            this.a = stateSubscribeNotification;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.a == ((t) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowChangeStateSnackBar(state=" + this.a + ')';
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class u implements h {
        public final String a;

        public u(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && epx.f(this.a, ((u) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ShowDonutChannelButtonTooltip(text="), this.a, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class v implements h {
        public final UserId a;

        public v(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && epx.f(this.a, ((v) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ShowLeaveGroupConfirmDialog(id="), this.a, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class w implements h {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            ((w) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.vk_video_loading_error_text);
        }

        public final String toString() {
            return "ShowMessage(messageId=2131968084)";
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class x implements h {
        public static final x a = new x();
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class y implements h {
        public final String a;

        public y(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && epx.f(this.a, ((y) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ShowOpenAuthorCabinetButtonTooltip(text="), this.a, ')');
        }
    }

    /* compiled from: VideoProfileSideEffect.kt */
    public static final class z implements h {
        public static final z a = new z();
    }
}
