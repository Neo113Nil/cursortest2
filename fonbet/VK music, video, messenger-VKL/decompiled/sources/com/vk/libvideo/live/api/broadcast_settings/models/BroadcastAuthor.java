package com.vk.libvideo.live.api.broadcast_settings.models;

import com.vk.core.serialize.Serializer;
import com.vk.dto.user.UserProfile;
import xsna.epx;
import xsna.zcl;

/* compiled from: BroadcastAuthor.kt */
/* loaded from: classes3.dex */
public abstract class BroadcastAuthor extends Serializer.StreamParcelableAdapter {

    /* compiled from: BroadcastAuthor.kt */
    public static final class CurrentUser extends BroadcastAuthor {
        public static final Serializer.c<CurrentUser> CREATOR = new a();
        public final UserProfile b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<CurrentUser> {
            @Override // com.vk.core.serialize.Serializer.c
            public final CurrentUser a(Serializer serializer) {
                return new CurrentUser((UserProfile) serializer.G(UserProfile.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentUser[i];
            }
        }

        public CurrentUser(UserProfile userProfile) {
            super(null);
            this.b = userProfile;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CurrentUser) && epx.f(this.b, ((CurrentUser) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CurrentUser(userProfile=" + this.b + ')';
        }
    }

    /* compiled from: BroadcastAuthor.kt */
    public static final class Group extends BroadcastAuthor {
        public static final Serializer.c<Group> CREATOR = new a();
        public final com.vk.dto.group.Group b;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Group> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Group a(Serializer serializer) {
                return new Group((com.vk.dto.group.Group) serializer.G(com.vk.dto.group.Group.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        public Group(com.vk.dto.group.Group group) {
            super(null);
            this.b = group;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Group) && epx.f(this.b, ((Group) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Group(group=" + this.b + ')';
        }
    }

    public /* synthetic */ BroadcastAuthor(zcl zclVar) {
        this();
    }

    public BroadcastAuthor() {
    }
}
