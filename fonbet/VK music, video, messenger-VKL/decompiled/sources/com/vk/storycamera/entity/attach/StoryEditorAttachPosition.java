package com.vk.storycamera.entity.attach;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.zrp;

/* compiled from: StoryEditorAttachPosition.kt */
/* loaded from: classes6.dex */
public final class StoryEditorAttachPosition implements Serializer.StreamParcelable {
    public static final Serializer.c<StoryEditorAttachPosition> CREATOR = new a();
    public final Type b;
    public final Float c;
    public final Float d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryEditorAttachPosition.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CENTER;
        public static final Type LEFT_TOP;

        static {
            Type type = new Type("CENTER", 0);
            CENTER = type;
            Type type2 = new Type("LEFT_TOP", 1);
            LEFT_TOP = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryEditorAttachPosition> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryEditorAttachPosition a(Serializer serializer) {
            return new StoryEditorAttachPosition(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryEditorAttachPosition[i];
        }
    }

    public StoryEditorAttachPosition(Serializer serializer) {
        Type type = Type.values()[serializer.u()];
        Float t = serializer.t();
        Float t2 = serializer.t();
        this.b = type;
        this.c = t;
        this.d = t2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.ordinal());
        serializer.R(this.c);
        serializer.R(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
