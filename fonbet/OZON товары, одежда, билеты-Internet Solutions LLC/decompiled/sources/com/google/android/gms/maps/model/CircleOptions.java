package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getFillColor", id = 6)
    private int fillColor;

    @SafeParcelable.Field(getter = "getStrokeColor", id = 5)
    private int strokeColor;

    @SafeParcelable.Field(getter = "getCenter", id = 2)
    private LatLng zzcp;

    @SafeParcelable.Field(getter = "getRadius", id = 3)
    private double zzcq;

    @SafeParcelable.Field(getter = "getStrokeWidth", id = 4)
    private float zzcr;

    @SafeParcelable.Field(getter = "getZIndex", id = 7)
    private float zzcs;

    @SafeParcelable.Field(getter = "isVisible", id = 8)
    private boolean zzct;

    @SafeParcelable.Field(getter = "isClickable", id = 9)
    private boolean zzcu;

    @SafeParcelable.Field(getter = "getStrokePattern", id = 10)
    private List<PatternItem> zzcv;

    public CircleOptions() {
        this.zzcp = null;
        this.zzcq = 0.0d;
        this.zzcr = 10.0f;
        this.strokeColor = -16777216;
        this.fillColor = 0;
        this.zzcs = 0.0f;
        this.zzct = true;
        this.zzcu = false;
        this.zzcv = null;
    }

    public final CircleOptions center(LatLng latLng) {
        this.zzcp = latLng;
        return this;
    }

    public final CircleOptions clickable(boolean z11) {
        this.zzcu = z11;
        return this;
    }

    public final CircleOptions fillColor(int i11) {
        this.fillColor = i11;
        return this;
    }

    public final LatLng getCenter() {
        return this.zzcp;
    }

    public final int getFillColor() {
        return this.fillColor;
    }

    public final double getRadius() {
        return this.zzcq;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final List<PatternItem> getStrokePattern() {
        return this.zzcv;
    }

    public final float getStrokeWidth() {
        return this.zzcr;
    }

    public final float getZIndex() {
        return this.zzcs;
    }

    public final boolean isClickable() {
        return this.zzcu;
    }

    public final boolean isVisible() {
        return this.zzct;
    }

    public final CircleOptions radius(double d11) {
        this.zzcq = d11;
        return this;
    }

    public final CircleOptions strokeColor(int i11) {
        this.strokeColor = i11;
        return this;
    }

    public final CircleOptions strokePattern(List<PatternItem> list) {
        this.zzcv = list;
        return this;
    }

    public final CircleOptions strokeWidth(float f7) {
        this.zzcr = f7;
        return this;
    }

    public final CircleOptions visible(boolean z11) {
        this.zzct = z11;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i11, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final CircleOptions zIndex(float f7) {
        this.zzcs = f7;
        return this;
    }

    @SafeParcelable.Constructor
    CircleOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) double d11, @SafeParcelable.Param(id = 4) float f7, @SafeParcelable.Param(id = 5) int i11, @SafeParcelable.Param(id = 6) int i12, @SafeParcelable.Param(id = 7) float f11, @SafeParcelable.Param(id = 8) boolean z11, @SafeParcelable.Param(id = 9) boolean z12, @SafeParcelable.Param(id = 10) List<PatternItem> list) {
        this.zzcp = latLng;
        this.zzcq = d11;
        this.zzcr = f7;
        this.strokeColor = i11;
        this.fillColor = i12;
        this.zzcs = f11;
        this.zzct = z11;
        this.zzcu = z12;
        this.zzcv = list;
    }
}
