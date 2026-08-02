package dd0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.b;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* renamed from: dd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6181a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C6181a> CREATOR = new C0958a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final OzonSpannableString f61597a;

    /* renamed from: b, reason: collision with root package name */
    private final OzonSpannableString f61598b;

    /* renamed from: c, reason: collision with root package name */
    private final b.c f61599c;

    /* renamed from: d, reason: collision with root package name */
    private final EntryDTO.EntryButtonDTO f61600d;

    /* renamed from: e, reason: collision with root package name */
    private final EntryDTO.EntryButtonDTO f61601e;

    /* renamed from: dd0.a$a, reason: collision with other inner class name */
    public static final class C0958a implements Parcelable.Creator<C6181a> {
        @Override // android.os.Parcelable.Creator
        public final C6181a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Ac0.a aVar = Ac0.a.f750a;
            return new C6181a(aVar.a(parcel), aVar.a(parcel), parcel.readInt() == 0 ? null : b.c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EntryDTO.EntryButtonDTO.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EntryDTO.EntryButtonDTO.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final C6181a[] newArray(int i11) {
            return new C6181a[i11];
        }
    }

    public C6181a(@NotNull OzonSpannableString title, OzonSpannableString ozonSpannableString, b.c cVar, EntryDTO.EntryButtonDTO entryButtonDTO, EntryDTO.EntryButtonDTO entryButtonDTO2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f61597a = title;
        this.f61598b = ozonSpannableString;
        this.f61599c = cVar;
        this.f61600d = entryButtonDTO;
        this.f61601e = entryButtonDTO2;
    }

    public final EntryDTO.EntryButtonDTO a() {
        return this.f61601e;
    }

    public final b.c b() {
        return this.f61599c;
    }

    public final EntryDTO.EntryButtonDTO c() {
        return this.f61600d;
    }

    public final OzonSpannableString d() {
        return this.f61598b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final OzonSpannableString e() {
        return this.f61597a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6181a)) {
            return false;
        }
        C6181a c6181a = (C6181a) obj;
        return Intrinsics.d(this.f61597a, c6181a.f61597a) && Intrinsics.d(this.f61598b, c6181a.f61598b) && Intrinsics.d(this.f61599c, c6181a.f61599c) && Intrinsics.d(this.f61600d, c6181a.f61600d) && Intrinsics.d(this.f61601e, c6181a.f61601e);
    }

    public final int hashCode() {
        int hashCode = this.f61597a.hashCode() * 31;
        OzonSpannableString ozonSpannableString = this.f61598b;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        b.c cVar = this.f61599c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        EntryDTO.EntryButtonDTO entryButtonDTO = this.f61600d;
        int hashCode4 = (hashCode3 + (entryButtonDTO == null ? 0 : entryButtonDTO.hashCode())) * 31;
        EntryDTO.EntryButtonDTO entryButtonDTO2 = this.f61601e;
        return hashCode4 + (entryButtonDTO2 != null ? entryButtonDTO2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PageSocialAdditionalOptionVO(title=" + ((Object) this.f61597a) + ", subtitle=" + ((Object) this.f61598b) + ", socialLogin=" + this.f61599c + ", submitButton=" + this.f61600d + ", cancelButton=" + this.f61601e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i11) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        OzonSpannableString ozonSpannableString = this.f61597a;
        if (ozonSpannableString == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(Html.toHtml(ozonSpannableString, 1));
        }
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        OzonSpannableString ozonSpannableString2 = this.f61598b;
        if (ozonSpannableString2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(Html.toHtml(ozonSpannableString2, 1));
        }
        b.c cVar = this.f61599c;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i11);
        }
        EntryDTO.EntryButtonDTO entryButtonDTO = this.f61600d;
        if (entryButtonDTO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryButtonDTO.writeToParcel(parcel, i11);
        }
        EntryDTO.EntryButtonDTO entryButtonDTO2 = this.f61601e;
        if (entryButtonDTO2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryButtonDTO2.writeToParcel(parcel, i11);
        }
    }
}
