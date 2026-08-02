package ru.ozon.app.android.composer.universalscreen.view;

import T7.E;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006 "}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/BackgroundColorResource;", "Lru/ozon/app/android/composer/universalscreen/view/BackgroundColor;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "constructor-impl", "(I)I", "get", "context", "Landroid/content/Context;", "get-impl", "(ILandroid/content/Context;)I", "describeContents", "describeContents-impl", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "writeToParcel-impl", "(ILandroid/os/Parcel;I)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BackgroundColorResource implements BackgroundColor {

    @NotNull
    public static final Parcelable.Creator<BackgroundColorResource> CREATOR = new Creator();
    private final int value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BackgroundColorResource> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BackgroundColorResource createFromParcel(Parcel parcel) {
            return BackgroundColorResource.m682boximpl(m691createFromParcelt2NbDnQ(parcel));
        }

        /* renamed from: createFromParcel-t2NbDnQ, reason: not valid java name */
        public final int m691createFromParcelt2NbDnQ(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return BackgroundColorResource.m683constructorimpl(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BackgroundColorResource[] newArray(int i11) {
            return new BackgroundColorResource[i11];
        }
    }

    private /* synthetic */ BackgroundColorResource(int i11) {
        this.value = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BackgroundColorResource m682boximpl(int i11) {
        return new BackgroundColorResource(i11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m683constructorimpl(int i11) {
        return i11;
    }

    /* renamed from: describeContents-impl, reason: not valid java name */
    public static final int m684describeContentsimpl(int i11) {
        return 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m685equalsimpl(int i11, Object obj) {
        return (obj instanceof BackgroundColorResource) && i11 == ((BackgroundColorResource) obj).getValue();
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static int m686getimpl(int i11, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a.getColor(context, i11);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m687hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m688toStringimpl(int i11) {
        return E.a(i11, "BackgroundColorResource(value=", ")");
    }

    /* renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m689writeToParcelimpl(int i11, @NotNull Parcel dest, int i12) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m684describeContentsimpl(this.value);
    }

    public boolean equals(Object obj) {
        return m685equalsimpl(this.value, obj);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.BackgroundColor
    public int get(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m686getimpl(this.value, context);
    }

    public int hashCode() {
        return m687hashCodeimpl(this.value);
    }

    public String toString() {
        return m688toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        m689writeToParcelimpl(this.value, dest, i11);
    }
}
