package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.o;
import n6.C8446a;

/* loaded from: classes.dex */
public abstract class o<CHILD extends o<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private n6.d<? super TranscodeType> f57651a = n6.b.a();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    final n6.d<? super TranscodeType> b() {
        return this.f57651a;
    }

    @NonNull
    public final void c(@NonNull C8446a c8446a) {
        this.f57651a = c8446a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return p6.l.b(this.f57651a, ((o) obj).f57651a);
        }
        return false;
    }

    public int hashCode() {
        n6.d<? super TranscodeType> dVar = this.f57651a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }
}
