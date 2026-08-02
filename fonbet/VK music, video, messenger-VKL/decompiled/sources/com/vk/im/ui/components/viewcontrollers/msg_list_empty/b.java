package com.vk.im.ui.components.viewcontrollers.msg_list_empty;

import android.view.View;
import com.vk.im.engine.internal.api_commands.friends.FriendsAddApiCmd;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import xsna.br;
import xsna.epx;
import xsna.ho8;
import xsna.qq;
import xsna.qtd0;

/* compiled from: MsgListEmptyViewEvent.kt */
/* loaded from: classes2.dex */
public abstract class b {

    /* compiled from: MsgListEmptyViewEvent.kt */
    /* renamed from: com.vk.im.ui.components.viewcontrollers.msg_list_empty.b$b, reason: collision with other inner class name */
    public static final class C1172b extends b {
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class d extends b {
        public static final d a = new d();
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class e extends b {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1489972372;
        }

        public final String toString() {
            return "OnCommunityChannelEntryMonetizationShow";
        }
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class f extends b {
        public final String a;

        public f(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("OnHowToCreateGoodPostClick(url="), this.a, ')');
        }
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class g extends b {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1577848941;
        }

        public final String toString() {
            return "OnMonetizationClick";
        }
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class h extends b {
        public static final h a = new h();
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class i extends b {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -317841192;
        }

        public final String toString() {
            return "OnTgTransferClick";
        }
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class j extends b {
        public static final j a = new j();
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class k extends b {
        public final qtd0 a;

        public k(qtd0 qtd0Var) {
            this.a = qtd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return qq.f(new StringBuilder("RemoveFromFriends(profile="), this.a, ')');
        }
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class l extends b {
        public final Group a;
        public final View b;

        public l(Group group, View view) {
            this.a = group;
            this.b = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubscribeToCommunity(group=");
            sb.append(this.a);
            sb.append(", anchorView=");
            return br.b(sb, this.b, ')');
        }
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class m extends b {
        public final qtd0 a;

        public m(qtd0 qtd0Var) {
            this.a = qtd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return qq.f(new StringBuilder("Unfollow(profile="), this.a, ')');
        }
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class n extends b {
        public final Group a;
        public final View b;

        public n(Group group, View view) {
            this.a = group;
            this.b = view;
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
            StringBuilder sb = new StringBuilder("UnsubscribeFromCommunity(group=");
            sb.append(this.a);
            sb.append(", anchorView=");
            return br.b(sb, this.b, ')');
        }
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class o extends b {
        public final qtd0 a;

        public o(qtd0 qtd0Var) {
            this.a = qtd0Var;
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
            return qq.f(new StringBuilder("ViewProfile(profile="), this.a, ')');
        }
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class a extends b {
        public final qtd0 a;
        public final FriendsAddApiCmd.Source b;
        public final FriendsAddApiCmd.BlockType c;

        public a(qtd0 qtd0Var, FriendsAddApiCmd.Source source, FriendsAddApiCmd.BlockType blockType) {
            this.a = qtd0Var;
            this.b = source;
            this.c = blockType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "AddToFriends(profile=" + this.a + ", source=" + this.b + ", blockType=" + this.c + ')';
        }

        public /* synthetic */ a(User user) {
            this(user, FriendsAddApiCmd.Source.NONE, FriendsAddApiCmd.BlockType.NONE);
        }
    }

    /* compiled from: MsgListEmptyViewEvent.kt */
    public static final class c extends b {
        public final qtd0 a;
        public final FriendsAddApiCmd.Source b;
        public final FriendsAddApiCmd.BlockType c;

        public c(qtd0 qtd0Var, FriendsAddApiCmd.Source source, FriendsAddApiCmd.BlockType blockType) {
            this.a = qtd0Var;
            this.b = source;
            this.c = blockType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Follow(profile=" + this.a + ", source=" + this.b + ", blockType=" + this.c + ')';
        }

        public /* synthetic */ c(User user) {
            this(user, FriendsAddApiCmd.Source.NONE, FriendsAddApiCmd.BlockType.NONE);
        }
    }
}
