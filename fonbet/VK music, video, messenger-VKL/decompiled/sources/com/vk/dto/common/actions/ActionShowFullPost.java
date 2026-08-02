package com.vk.dto.common.actions;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.yq;

/* compiled from: ActionShowFullPost.kt */
/* loaded from: classes18.dex */
public final class ActionShowFullPost extends Action {
    public static final Serializer.c<ActionShowFullPost> CREATOR = new a();
    public final UserId c;
    public final int d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionShowFullPost> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionShowFullPost a(Serializer serializer) {
            return new ActionShowFullPost((UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionShowFullPost[i];
        }
    }

    public ActionShowFullPost(UserId userId, int i, String str) {
        this.c = userId;
        this.d = i;
        this.e = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject d = yq.d("type", "show_full_post");
        d.put("post_owner_id", this.c);
        d.put("post_id", this.d);
        d.put("referer", this.e);
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionShowFullPost)) {
            return false;
        }
        ActionShowFullPost actionShowFullPost = (ActionShowFullPost) obj;
        return epx.f(this.c, actionShowFullPost.c) && this.d == actionShowFullPost.d && epx.f(this.e, actionShowFullPost.e);
    }

    public final int hashCode() {
        int a2 = shy.a(this.d, Long.hashCode(this.c.b) * 31, 31);
        String str = this.e;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionShowFullPost(postOwnerId=");
        sb.append(this.c);
        sb.append(", postId=");
        sb.append(this.d);
        sb.append(", referer=");
        return ho8.a(sb, this.e, ')');
    }
}
