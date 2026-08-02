package com.vk.im.engine.models.dialogs;

import com.vk.core.serialize.Serializer;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: GroupCallInProgress.kt */
/* loaded from: classes2.dex */
public final class GroupCallInProgress extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupCallInProgress> CREATOR = new a();
    public final List<Long> b;
    public final String c;
    public final String d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<GroupCallInProgress> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupCallInProgress a(Serializer serializer) {
            List f = serializer.f();
            if (f == null) {
                f = EmptyList.b;
            }
            return new GroupCallInProgress(f, serializer.H(), serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupCallInProgress[i];
        }
    }

    public GroupCallInProgress(List<Long> list, String str, String str2, boolean z) {
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.a0(this.b);
        serializer.j0(this.c);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.j0(this.d);
    }
}
