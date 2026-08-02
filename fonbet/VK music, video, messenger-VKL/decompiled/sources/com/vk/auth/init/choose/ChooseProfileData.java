package com.vk.auth.init.choose;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.UserItem;
import java.util.List;

/* compiled from: ChooseProfileData.kt */
/* loaded from: classes15.dex */
public final class ChooseProfileData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ChooseProfileData> CREATOR = new a();
    public final List<UserItem> b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChooseProfileData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChooseProfileData a(Serializer serializer) {
            return new ChooseProfileData(serializer.B(UserItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChooseProfileData[i];
        }
    }

    public ChooseProfileData(List<UserItem> list) {
        this.b = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(this.b);
    }
}
