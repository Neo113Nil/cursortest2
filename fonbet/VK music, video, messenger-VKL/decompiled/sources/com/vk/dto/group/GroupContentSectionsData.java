package com.vk.dto.group;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: GroupContentSectionsData.kt */
/* loaded from: classes18.dex */
public final class GroupContentSectionsData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupContentSectionsData> CREATOR = new a();
    public final String b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GroupContentSectionsData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupContentSectionsData a(Serializer serializer) {
            String I = serializer.I();
            if (I == null) {
                I = "";
            }
            return new GroupContentSectionsData(I);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupContentSectionsData[i];
        }
    }

    public GroupContentSectionsData(String str) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupContentSectionsData) && epx.f(this.b, ((GroupContentSectionsData) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("GroupContentSectionsData(firstSectionName="), this.b, ')');
    }
}
