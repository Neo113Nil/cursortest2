package com.vk.channels.impl.comments;

import com.vk.channels.api.CommentsHistory;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.gp;
import xsna.kj50;
import xsna.ms9;
import xsna.vu5;
import xsna.wag;

/* compiled from: ChannelCommentsAction.kt */
/* loaded from: classes16.dex */
public abstract class a implements kj50 {

    /* compiled from: ChannelCommentsAction.kt */
    /* renamed from: com.vk.channels.impl.comments.a$a, reason: collision with other inner class name */
    public static final class C0531a extends a {
        public final UserId b;

        public C0531a(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0531a) && epx.f(this.b, ((C0531a) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnAuthorAvatarClick(id="), this.b, ')');
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class b extends a {
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
            return gp.b(new StringBuilder("OnAuthorNameClick(id="), this.b, ')');
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class c extends a {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -729338563;
        }

        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class d extends a {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1170264502;
        }

        public final String toString() {
            return "OnCancelReplyToCommentClick";
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class e extends a {
        public final int b;

        public e(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnCommentClick(id="), this.b, ')');
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class f extends a {
        public final wag b;
        public final int c;

        public f(wag wagVar, int i) {
            this.b = wagVar;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && this.c == fVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCommentContextMenuActionClick(action=");
            sb.append(this.b);
            sb.append(", commentId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class g extends a {
        public final int b;

        public g(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnCommentReactionClick(commentId="), this.b, ')');
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class h extends a {
        public final CharSequence b;
        public final List<Attachment> c;

        public h(String str, List list) {
            this.b = str;
            this.c = list;
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
            StringBuilder sb = new StringBuilder("OnCommentSendClick(text=");
            sb.append((Object) this.b);
            sb.append(", attachments=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class i extends a {
        public final CommentsHistory.Order b;

        public i(CommentsHistory.Order order) {
            this.b = order;
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
            return "OnCommentsOrderChanged(order=" + this.b + ')';
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class j extends a {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 652445100;
        }

        public final String toString() {
            return "OnConnectionErrorRetryClick";
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class k extends a {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1200124057;
        }

        public final String toString() {
            return "OnLoadMore";
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class l extends a {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 951522419;
        }

        public final String toString() {
            return "OnNegativeRepliesClick";
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class m extends a {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 787534813;
        }

        public final String toString() {
            return "OnRefresh";
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class n extends a {
        public final int b;

        public n(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnReplyToCommentClick(commentId="), this.b, ')');
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class o extends a {
        public final int b;

        public o(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnReplyToUserNameClick(commentId="), this.b, ')');
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class p extends a {
        public final int b;

        public p(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.b == ((p) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnRestoreCommentClick(commentId="), this.b, ')');
        }
    }

    /* compiled from: ChannelCommentsAction.kt */
    public static final class q extends a {
        public final int b;

        public q(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.b == ((q) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnThreadShowMoreClick(parentCommentId="), this.b, ')');
        }
    }
}
