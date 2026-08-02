package com.vk.auth.ui.password.askpassword;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: VkAskPasswordData.kt */
/* loaded from: classes15.dex */
public abstract class VkAskPasswordData extends Serializer.StreamParcelableAdapter {

    /* compiled from: VkAskPasswordData.kt */
    public static final class User extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<User> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<User> {
            @Override // com.vk.core.serialize.Serializer.c
            public final User a(Serializer serializer) {
                return new User(serializer.H(), serializer.H(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new User[i];
            }
        }

        public User(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
        }
    }

    public /* synthetic */ VkAskPasswordData(zcl zclVar) {
        this();
    }

    public VkAskPasswordData() {
    }
}
