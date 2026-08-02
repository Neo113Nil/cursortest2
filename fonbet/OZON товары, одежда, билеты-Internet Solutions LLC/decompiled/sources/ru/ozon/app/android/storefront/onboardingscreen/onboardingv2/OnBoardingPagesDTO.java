package ru.ozon.app.android.storefront.onboardingscreen.onboardingv2;

import Ak.b;
import Bi.a;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnBoardingPagesDTO;", "Landroid/os/Parcelable;", "pages", "", "Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnBoardingPagesDTO$OnBoardingPageDTO;", "error", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getPages", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OnBoardingPageDTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OnBoardingPagesDTO implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OnBoardingPagesDTO> CREATOR = new Creator();
    private final String error;

    @NotNull
    private final List<OnBoardingPageDTO> pages;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnBoardingPagesDTO> {
        @Override // android.os.Parcelable.Creator
        public final OnBoardingPagesDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(OnBoardingPageDTO.CREATOR, parcel, arrayList, i11, 1);
            }
            return new OnBoardingPagesDTO(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnBoardingPagesDTO[] newArray(int i11) {
            return new OnBoardingPagesDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/onboardingv2/OnBoardingPagesDTO$OnBoardingPageDTO;", "Landroid/os/Parcelable;", "type", "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBoardingPageDTO implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<OnBoardingPageDTO> CREATOR = new Creator();
        private final String deeplink;

        @NotNull
        private final String type;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<OnBoardingPageDTO> {
            @Override // android.os.Parcelable.Creator
            public final OnBoardingPageDTO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OnBoardingPageDTO(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OnBoardingPageDTO[] newArray(int i11) {
                return new OnBoardingPageDTO[i11];
            }
        }

        public OnBoardingPageDTO(@NotNull String type, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.deeplink = str;
        }

        public static /* synthetic */ OnBoardingPageDTO copy$default(OnBoardingPageDTO onBoardingPageDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = onBoardingPageDTO.type;
            }
            if ((i11 & 2) != 0) {
                str2 = onBoardingPageDTO.deeplink;
            }
            return onBoardingPageDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final OnBoardingPageDTO copy(@NotNull String type, String deeplink) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new OnBoardingPageDTO(type, deeplink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBoardingPageDTO)) {
                return false;
            }
            OnBoardingPageDTO onBoardingPageDTO = (OnBoardingPageDTO) other;
            return Intrinsics.d(this.type, onBoardingPageDTO.type) && Intrinsics.d(this.deeplink, onBoardingPageDTO.deeplink);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.deeplink;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("OnBoardingPageDTO(type=", this.type, ", deeplink=", this.deeplink, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
            dest.writeString(this.deeplink);
        }
    }

    public OnBoardingPagesDTO(@i(name = "onboarding_pages") @NotNull List<OnBoardingPageDTO> pages, String str) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.pages = pages;
        this.error = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnBoardingPagesDTO copy$default(OnBoardingPagesDTO onBoardingPagesDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = onBoardingPagesDTO.pages;
        }
        if ((i11 & 2) != 0) {
            str = onBoardingPagesDTO.error;
        }
        return onBoardingPagesDTO.copy(list, str);
    }

    @NotNull
    public final List<OnBoardingPageDTO> component1() {
        return this.pages;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final OnBoardingPagesDTO copy(@i(name = "onboarding_pages") @NotNull List<OnBoardingPageDTO> pages, String error) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        return new OnBoardingPagesDTO(pages, error);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnBoardingPagesDTO)) {
            return false;
        }
        OnBoardingPagesDTO onBoardingPagesDTO = (OnBoardingPagesDTO) other;
        return Intrinsics.d(this.pages, onBoardingPagesDTO.pages) && Intrinsics.d(this.error, onBoardingPagesDTO.error);
    }

    public final String getError() {
        return this.error;
    }

    @NotNull
    public final List<OnBoardingPageDTO> getPages() {
        return this.pages;
    }

    public int hashCode() {
        int hashCode = this.pages.hashCode() * 31;
        String str = this.error;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return Bi.b.e("OnBoardingPagesDTO(pages=", ", error=", this.error, ")", this.pages);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = a.c(this.pages, dest);
        while (c11.hasNext()) {
            ((OnBoardingPageDTO) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.error);
    }
}
