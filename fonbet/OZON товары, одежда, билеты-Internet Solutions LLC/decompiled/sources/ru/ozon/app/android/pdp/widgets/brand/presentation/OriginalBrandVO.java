package ru.ozon.app.android.pdp.widgets.brand.presentation;

import Ak.C2436a;
import G.g;
import WZ.t;
import android.os.Parcel;
import android.os.Parcelable;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b-\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000e\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b1\u0010\u001b¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/OriginalBrandVO;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/BrandVO;", "Landroid/os/Parcelable;", "", "id", "", "background", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "disclosureCell", "backgroundIconImage", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "json", "<init>", "(JLjava/lang/String;LWZ/t;Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackground", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "getDisclosureCell", "()Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "getBackgroundIconImage", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnBoarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getJson", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OriginalBrandVO extends BrandVO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OriginalBrandVO> CREATOR = new Creator();

    @NotNull
    private final String background;
    private final String backgroundIconImage;

    @NotNull
    private final DisclosureIconTitleSubtitleCellDTO disclosureCell;
    private final long id;

    @NotNull
    private final String json;
    private final OnBoardingDTO onBoarding;
    private final t tokenizedEvent;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OriginalBrandVO> {
        @Override // android.os.Parcelable.Creator
        public final OriginalBrandVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OriginalBrandVO(parcel.readLong(), parcel.readString(), (t) parcel.readParcelable(OriginalBrandVO.class.getClassLoader()), (DisclosureIconTitleSubtitleCellDTO) parcel.readParcelable(OriginalBrandVO.class.getClassLoader()), parcel.readString(), (OnBoardingDTO) parcel.readParcelable(OriginalBrandVO.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OriginalBrandVO[] newArray(int i11) {
            return new OriginalBrandVO[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginalBrandVO(long j11, @NotNull String background, t tVar, @NotNull DisclosureIconTitleSubtitleCellDTO disclosureCell, String str, OnBoardingDTO onBoardingDTO, @NotNull String json) {
        super(j11, background, tVar);
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(disclosureCell, "disclosureCell");
        Intrinsics.checkNotNullParameter(json, "json");
        this.id = j11;
        this.background = background;
        this.tokenizedEvent = tVar;
        this.disclosureCell = disclosureCell;
        this.backgroundIconImage = str;
        this.onBoarding = onBoardingDTO;
        this.json = json;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OriginalBrandVO)) {
            return false;
        }
        OriginalBrandVO originalBrandVO = (OriginalBrandVO) other;
        return this.id == originalBrandVO.id && Intrinsics.d(this.background, originalBrandVO.background) && Intrinsics.d(this.tokenizedEvent, originalBrandVO.tokenizedEvent) && Intrinsics.d(this.disclosureCell, originalBrandVO.disclosureCell) && Intrinsics.d(this.backgroundIconImage, originalBrandVO.backgroundIconImage) && Intrinsics.d(this.onBoarding, originalBrandVO.onBoarding) && Intrinsics.d(this.json, originalBrandVO.json);
    }

    @NotNull
    public String getBackground() {
        return this.background;
    }

    public final String getBackgroundIconImage() {
        return this.backgroundIconImage;
    }

    @NotNull
    public final DisclosureIconTitleSubtitleCellDTO getDisclosureCell() {
        return this.disclosureCell;
    }

    @Override // ru.ozon.app.android.pdp.widgets.brand.presentation.BrandVO, l20.c
    public long getId() {
        return this.id;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetPlaceholderViewObject
    @NotNull
    public String getJson() {
        return this.json;
    }

    public final OnBoardingDTO getOnBoarding() {
        return this.onBoarding;
    }

    @Override // ru.ozon.app.android.pdp.widgets.brand.presentation.BrandVO
    public t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.background);
        t tVar = this.tokenizedEvent;
        int hashCode = (this.disclosureCell.hashCode() + ((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31)) * 31;
        String str = this.backgroundIconImage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onBoarding;
        return this.json.hashCode() + ((hashCode2 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.background;
        t tVar = this.tokenizedEvent;
        DisclosureIconTitleSubtitleCellDTO disclosureIconTitleSubtitleCellDTO = this.disclosureCell;
        String str2 = this.backgroundIconImage;
        OnBoardingDTO onBoardingDTO = this.onBoarding;
        String str3 = this.json;
        StringBuilder c11 = C2436a.c(j11, "OriginalBrandVO(id=", ", background=", str);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", disclosureCell=");
        c11.append(disclosureIconTitleSubtitleCellDTO);
        c11.append(", backgroundIconImage=");
        c11.append(str2);
        c11.append(", onBoarding=");
        c11.append(onBoardingDTO);
        return C6594f.a(", json=", str3, ")", c11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.background);
        dest.writeParcelable(this.tokenizedEvent, flags);
        dest.writeParcelable(this.disclosureCell, flags);
        dest.writeString(this.backgroundIconImage);
        dest.writeParcelable(this.onBoarding, flags);
        dest.writeString(this.json);
    }
}
