package com.vk.dto.clips.morphing;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.morphing.AudioEffectType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.epx;
import xsna.ms9;

/* compiled from: AudioMorphingEffects.kt */
/* loaded from: classes18.dex */
public final class AudioMorphingTypeStat implements Serializer.StreamParcelable {
    public static final Serializer.c<AudioMorphingTypeStat> CREATOR = new a();
    public final List<AudioEffectType> b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AudioMorphingTypeStat> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioMorphingTypeStat a(Serializer serializer) {
            ArrayList a = com.vk.core.serialize.a.a(serializer);
            ArrayList arrayList = new ArrayList(c5g.u(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AudioEffectType.Companion.getClass();
                arrayList.add(AudioEffectType.a.a(str));
            }
            return new AudioMorphingTypeStat(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioMorphingTypeStat[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioMorphingTypeStat(List<? extends AudioEffectType> list) {
        this.b = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        List<AudioEffectType> list = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AudioEffectType) it.next()).name());
        }
        serializer.l0(arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioMorphingTypeStat) && epx.f(this.b, ((AudioMorphingTypeStat) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AudioMorphingTypeStat(audioEffects="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
