package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewHolder;

import C.o0;
import Hi.h;
import Hi.j;
import N3.C3660k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewHolder/OnlyImageGalleryFilter;", "LHi/h;", "<init>", "()V", "", SearchIntents.EXTRA_QUERY, "applyTo", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnlyImageGalleryFilter implements h {

    @NotNull
    public static final OnlyImageGalleryFilter INSTANCE = new OnlyImageGalleryFilter();

    @NotNull
    public static final Parcelable.Creator<OnlyImageGalleryFilter> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnlyImageGalleryFilter> {
        @Override // android.os.Parcelable.Creator
        public final OnlyImageGalleryFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return OnlyImageGalleryFilter.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final OnlyImageGalleryFilter[] newArray(int i11) {
            return new OnlyImageGalleryFilter[i11];
        }
    }

    private OnlyImageGalleryFilter() {
    }

    @Override // Hi.h
    @NotNull
    public String applyTo(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        String a11 = j.d.b.VIDEO.a();
        return o0.c(C3660k.d("(", query, ") AND instr(mime_type,'", a11, "') == 0 AND instr(mime_type,'"), j.d.b.IMAGE.a(), "/gif') == 0");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
