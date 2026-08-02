package com.vk.voip.userid;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.epx;

/* compiled from: CallsUserId.kt */
/* loaded from: classes7.dex */
public interface CallsUserId extends Serializer.StreamParcelable {
    public static final Serializer.c<? extends Serializer.StreamParcelable> CREATOR = new a();

    /* compiled from: CallsUserId.kt */
    public static final class ContactId extends Serializer.StreamParcelableAdapter implements CallsUserId {
        public final String b;
        public final String c;

        public ContactId(String str) {
            this.b = str;
            this.c = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(2);
            serializer.j0(this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactId) && epx.f(this.b, ((ContactId) obj).b);
        }

        @Override // com.vk.voip.userid.CallsUserId
        public final String getStringValue() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return this.c;
        }
    }

    /* compiled from: CallsUserId.kt */
    public static final class VkUserId extends Serializer.StreamParcelableAdapter implements CallsUserId {
        public final UserId b;
        public final String c;

        public VkUserId(UserId userId) {
            this.b = userId;
            this.c = String.valueOf(userId.b);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(1);
            serializer.e0(this.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VkUserId) && epx.f(this.b, ((VkUserId) obj).b);
        }

        @Override // com.vk.voip.userid.CallsUserId
        public final String getStringValue() {
            return this.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return this.c;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Serializer.StreamParcelable> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Serializer.StreamParcelable a(Serializer serializer) {
            int u = serializer.u();
            if (u == 1) {
                return new VkUserId((UserId) serializer.A(UserId.class.getClassLoader()));
            }
            if (u == 2) {
                return new ContactId(serializer.H());
            }
            throw new IllegalArgumentException("Wrong serialization type");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Serializer.StreamParcelable[i];
        }
    }

    String getStringValue();
}
