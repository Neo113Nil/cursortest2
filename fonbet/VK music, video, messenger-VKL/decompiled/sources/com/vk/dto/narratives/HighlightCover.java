package com.vk.dto.narratives;

import android.graphics.RectF;
import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: HighlightCover.kt */
/* loaded from: classes18.dex */
public abstract class HighlightCover implements Serializer.StreamParcelable {
    public /* synthetic */ HighlightCover(zcl zclVar) {
        this();
    }

    public abstract RectF d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e(int i);

    public abstract String f();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public HighlightCover() {
    }
}
