package com.vk.dto.narratives;

import android.graphics.RectF;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.zcl;

/* compiled from: HighlightCover.kt */
/* loaded from: classes18.dex */
public final class HighlightLocalCustomCover extends HighlightCover {
    public static final Serializer.c<HighlightLocalCustomCover> CREATOR = new a();
    public final String b;
    public final Integer c;
    public final RectF d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<HighlightLocalCustomCover> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HighlightLocalCustomCover a(Serializer serializer) {
            return new HighlightLocalCustomCover(serializer.H(), serializer.v(), (RectF) serializer.A(RectF.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HighlightLocalCustomCover[i];
        }
    }

    public /* synthetic */ HighlightLocalCustomCover(String str, Integer num, RectF rectF, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : rectF);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.V(this.c);
        serializer.e0(this.d);
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final RectF d() {
        return this.d;
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final String e(int i) {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightLocalCustomCover)) {
            return false;
        }
        HighlightLocalCustomCover highlightLocalCustomCover = (HighlightLocalCustomCover) obj;
        return epx.f(this.b, highlightLocalCustomCover.b) && epx.f(this.c, highlightLocalCustomCover.c) && epx.f(this.d, highlightLocalCustomCover.d);
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        RectF rectF = this.d;
        return hashCode2 + (rectF != null ? rectF.hashCode() : 0);
    }

    public final String toString() {
        return "HighlightLocalCustomCover(fileUri=" + this.b + ", photoId=" + this.c + ", cropRect=" + this.d + ')';
    }

    public HighlightLocalCustomCover(String str, Integer num, RectF rectF) {
        super(null);
        this.b = str;
        this.c = num;
        this.d = rectF;
    }
}
