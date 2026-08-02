package com.vk.newsfeed.impl.postmodal.reactions.tabs;

import com.vk.dto.user.ReactionUserProfile;
import xsna.epx;
import xsna.q030;
import xsna.vu5;

/* compiled from: ModalPostReactionsRecyclerItem.kt */
/* loaded from: classes4.dex */
public abstract class b {

    /* compiled from: ModalPostReactionsRecyclerItem.kt */
    public static final class a extends b {
        public final ReactionUserProfile a;
        public final q030 b;

        public a(ReactionUserProfile reactionUserProfile, q030 q030Var) {
            this.a = reactionUserProfile;
            this.b = q030Var;
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
            int hashCode = this.a.hashCode() * 31;
            q030 q030Var = this.b;
            return hashCode + (q030Var == null ? 0 : q030Var.hashCode());
        }

        public final String toString() {
            return "AllReactions(userProfile=" + this.a + ", analytics=" + this.b + ')';
        }
    }

    /* compiled from: ModalPostReactionsRecyclerItem.kt */
    /* renamed from: com.vk.newsfeed.impl.postmodal.reactions.tabs.b$b, reason: collision with other inner class name */
    public static final class C1398b extends b {
        public final int a;

        public C1398b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1398b) && this.a == ((C1398b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("MessengerRepost(count="), this.a, ')');
        }
    }

    /* compiled from: ModalPostReactionsRecyclerItem.kt */
    public static final class c extends b {
        public final ReactionUserProfile a;

        public c(ReactionUserProfile reactionUserProfile) {
            this.a = reactionUserProfile;
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
            return "UserRepost(userProfile=" + this.a + ')';
        }
    }
}
