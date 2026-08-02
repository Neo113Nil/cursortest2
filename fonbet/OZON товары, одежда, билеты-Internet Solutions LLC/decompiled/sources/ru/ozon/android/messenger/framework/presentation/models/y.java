package ru.ozon.android.messenger.framework.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
public final class y implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f91557a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f91558b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f91559c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AtomActionDTO f91560d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final m f91561e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final m f91562f;

    public static final class a implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        public final y createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(y.class.getClassLoader());
            Parcelable.Creator<m> creator = m.CREATOR;
            return new y(readString, readString2, readString3, atomActionDTO, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final y[] newArray(int i11) {
            return new y[i11];
        }
    }

    public y(@NotNull String reportTitle, @NotNull String reportDescription, @NotNull String confirmButtonText, @NotNull AtomActionDTO actionDTO, @NotNull m reportFlashbarSuccessState, @NotNull m reportFlashbarErrorState) {
        Intrinsics.checkNotNullParameter(reportTitle, "reportTitle");
        Intrinsics.checkNotNullParameter(reportDescription, "reportDescription");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        Intrinsics.checkNotNullParameter(actionDTO, "actionDTO");
        Intrinsics.checkNotNullParameter(reportFlashbarSuccessState, "reportFlashbarSuccessState");
        Intrinsics.checkNotNullParameter(reportFlashbarErrorState, "reportFlashbarErrorState");
        this.f91557a = reportTitle;
        this.f91558b = reportDescription;
        this.f91559c = confirmButtonText;
        this.f91560d = actionDTO;
        this.f91561e = reportFlashbarSuccessState;
        this.f91562f = reportFlashbarErrorState;
    }

    @NotNull
    public final AtomActionDTO a() {
        return this.f91560d;
    }

    @NotNull
    public final String b() {
        return this.f91559c;
    }

    @NotNull
    public final String c() {
        return this.f91558b;
    }

    @NotNull
    public final m d() {
        return this.f91562f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final m e() {
        return this.f91561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f91557a, yVar.f91557a) && Intrinsics.d(this.f91558b, yVar.f91558b) && Intrinsics.d(this.f91559c, yVar.f91559c) && Intrinsics.d(this.f91560d, yVar.f91560d) && Intrinsics.d(this.f91561e, yVar.f91561e) && Intrinsics.d(this.f91562f, yVar.f91562f);
    }

    @NotNull
    public final String f() {
        return this.f91557a;
    }

    public final int hashCode() {
        return this.f91562f.hashCode() + ((this.f91561e.hashCode() + Ih.a.b(this.f91560d, G.g.a(G.g.a(this.f91557a.hashCode() * 31, 31, this.f91558b), 31, this.f91559c), 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ReportContent(reportTitle=" + this.f91557a + ", reportDescription=" + this.f91558b + ", confirmButtonText=" + this.f91559c + ", actionDTO=" + this.f91560d + ", reportFlashbarSuccessState=" + this.f91561e + ", reportFlashbarErrorState=" + this.f91562f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91557a);
        dest.writeString(this.f91558b);
        dest.writeString(this.f91559c);
        dest.writeParcelable(this.f91560d, i11);
        this.f91561e.writeToParcel(dest, i11);
        this.f91562f.writeToParcel(dest, i11);
    }
}
