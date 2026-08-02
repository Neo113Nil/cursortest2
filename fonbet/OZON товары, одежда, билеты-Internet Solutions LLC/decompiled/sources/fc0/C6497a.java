package fc0;

import Bi.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.accountMerge.data.UserInfoDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.data.models.b;

/* renamed from: fc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6497a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<C6497a> CREATOR = new C1008a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63067a;

    /* renamed from: b, reason: collision with root package name */
    private final String f63068b;

    /* renamed from: c, reason: collision with root package name */
    private final UserInfoDTO f63069c;

    /* renamed from: d, reason: collision with root package name */
    private final EntryDTO.SubmitButtonDTO f63070d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f63071e;

    /* renamed from: f, reason: collision with root package name */
    private final String f63072f;

    /* renamed from: g, reason: collision with root package name */
    private final OtpDTO.AccountRecoveryButton f63073g;

    /* renamed from: fc0.a$a, reason: collision with other inner class name */
    public static final class C1008a implements Parcelable.Creator<C6497a> {
        @Override // android.os.Parcelable.Creator
        public final C6497a createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            UserInfoDTO createFromParcel = parcel.readInt() == 0 ? null : UserInfoDTO.CREATOR.createFromParcel(parcel);
            EntryDTO.SubmitButtonDTO createFromParcel2 = parcel.readInt() == 0 ? null : EntryDTO.SubmitButtonDTO.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = b.a(C6497a.class, parcel, arrayList, i11, 1);
                }
            }
            return new C6497a(readString, readString2, createFromParcel, createFromParcel2, arrayList, parcel.readString(), parcel.readInt() != 0 ? OtpDTO.AccountRecoveryButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final C6497a[] newArray(int i11) {
            return new C6497a[i11];
        }
    }

    public C6497a(@NotNull String title, String str, UserInfoDTO userInfoDTO, EntryDTO.SubmitButtonDTO submitButtonDTO, ArrayList arrayList, String str2, OtpDTO.AccountRecoveryButton accountRecoveryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f63067a = title;
        this.f63068b = str;
        this.f63069c = userInfoDTO;
        this.f63070d = submitButtonDTO;
        this.f63071e = arrayList;
        this.f63072f = str2;
        this.f63073g = accountRecoveryButton;
    }

    public final String a() {
        return this.f63068b;
    }

    public final List<b.InterfaceC2133b> b() {
        return this.f63071e;
    }

    public final EntryDTO.SubmitButtonDTO c() {
        return this.f63070d;
    }

    public final UserInfoDTO d() {
        return this.f63069c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6497a)) {
            return false;
        }
        C6497a c6497a = (C6497a) obj;
        return Intrinsics.d(this.f63067a, c6497a.f63067a) && Intrinsics.d(this.f63068b, c6497a.f63068b) && Intrinsics.d(this.f63069c, c6497a.f63069c) && Intrinsics.d(this.f63070d, c6497a.f63070d) && Intrinsics.d(this.f63071e, c6497a.f63071e) && Intrinsics.d(this.f63072f, c6497a.f63072f) && Intrinsics.d(this.f63073g, c6497a.f63073g);
    }

    @NotNull
    public final String getTitle() {
        return this.f63067a;
    }

    public final int hashCode() {
        int hashCode = this.f63067a.hashCode() * 31;
        String str = this.f63068b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserInfoDTO userInfoDTO = this.f63069c;
        int hashCode3 = (hashCode2 + (userInfoDTO == null ? 0 : userInfoDTO.hashCode())) * 31;
        EntryDTO.SubmitButtonDTO submitButtonDTO = this.f63070d;
        int hashCode4 = (hashCode3 + (submitButtonDTO == null ? 0 : submitButtonDTO.hashCode())) * 31;
        ArrayList arrayList = this.f63071e;
        int hashCode5 = (hashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str2 = this.f63072f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OtpDTO.AccountRecoveryButton accountRecoveryButton = this.f63073g;
        return hashCode6 + (accountRecoveryButton != null ? accountRecoveryButton.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "AccountMergeVO(title=" + this.f63067a + ", description=" + this.f63068b + ", userInfo=" + this.f63069c + ", submitButton=" + this.f63070d + ", hintButtons=" + this.f63071e + ", termsOfUser=" + this.f63072f + ", accountRecoveryButton=" + this.f63073g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63067a);
        dest.writeString(this.f63068b);
        UserInfoDTO userInfoDTO = this.f63069c;
        if (userInfoDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            userInfoDTO.writeToParcel(dest, i11);
        }
        EntryDTO.SubmitButtonDTO submitButtonDTO = this.f63070d;
        if (submitButtonDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            submitButtonDTO.writeToParcel(dest, i11);
        }
        ArrayList arrayList = this.f63071e;
        if (arrayList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), i11);
            }
        }
        dest.writeString(this.f63072f);
        OtpDTO.AccountRecoveryButton accountRecoveryButton = this.f63073g;
        if (accountRecoveryButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            accountRecoveryButton.writeToParcel(dest, i11);
        }
    }
}
