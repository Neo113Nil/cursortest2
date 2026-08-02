package com.vk.feed.core.models.actions;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import xsna.epx;

/* compiled from: ActionRemote.kt */
/* loaded from: classes18.dex */
public final class ActionRemote extends HeaderAction {
    public static final Serializer.c<ActionRemote> CREATOR = new a();
    public final Action b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionRemote> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionRemote a(Serializer serializer) {
            return new ActionRemote((Action) serializer.G(Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionRemote[i];
        }
    }

    public ActionRemote(Action action) {
        this.b = action;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActionRemote) && epx.f(this.b, ((ActionRemote) obj).b);
    }

    public final int hashCode() {
        Action action = this.b;
        if (action == null) {
            return 0;
        }
        return action.hashCode();
    }

    public final String toString() {
        return "ActionRemote(action=" + this.b + ')';
    }
}
