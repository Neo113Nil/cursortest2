package ru.ozon.app.android.pdp.widgets.brand.presentation;

import Ak.C2436a;
import Bi.b;
import G.g;
import WZ.t;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b/\u0010\u001a¨\u00060"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/DsCellBrandVO;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/BrandVO;", "Landroid/os/Parcelable;", "", "id", "", "background", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "dsCell", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoarding", "json", "<init>", "(JLjava/lang/String;LWZ/t;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackground", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnBoarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getJson", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DsCellBrandVO extends BrandVO implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DsCellBrandVO> CREATOR = new Creator();

    @NotNull
    private final String background;

    @NotNull
    private final CellDTO dsCell;
    private final long id;

    @NotNull
    private final String json;
    private final OnBoardingDTO onBoarding;
    private final t tokenizedEvent;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DsCellBrandVO> {
        @Override // android.os.Parcelable.Creator
        public final DsCellBrandVO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DsCellBrandVO(parcel.readLong(), parcel.readString(), (t) parcel.readParcelable(DsCellBrandVO.class.getClassLoader()), (CellDTO) parcel.readParcelable(DsCellBrandVO.class.getClassLoader()), (OnBoardingDTO) parcel.readParcelable(DsCellBrandVO.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DsCellBrandVO[] newArray(int i11) {
            return new DsCellBrandVO[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsCellBrandVO(long j11, @NotNull String background, t tVar, @NotNull CellDTO dsCell, OnBoardingDTO onBoardingDTO, @NotNull String json) {
        super(j11, background, tVar);
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(dsCell, "dsCell");
        Intrinsics.checkNotNullParameter(json, "json");
        this.id = j11;
        this.background = background;
        this.tokenizedEvent = tVar;
        this.dsCell = dsCell;
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
        if (!(other instanceof DsCellBrandVO)) {
            return false;
        }
        DsCellBrandVO dsCellBrandVO = (DsCellBrandVO) other;
        return this.id == dsCellBrandVO.id && Intrinsics.d(this.background, dsCellBrandVO.background) && Intrinsics.d(this.tokenizedEvent, dsCellBrandVO.tokenizedEvent) && Intrinsics.d(this.dsCell, dsCellBrandVO.dsCell) && Intrinsics.d(this.onBoarding, dsCellBrandVO.onBoarding) && Intrinsics.d(this.json, dsCellBrandVO.json);
    }

    @NotNull
    public String getBackground() {
        return this.background;
    }

    @NotNull
    public final CellDTO getDsCell() {
        return this.dsCell;
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
        int c11 = b.c(this.dsCell, (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31);
        OnBoardingDTO onBoardingDTO = this.onBoarding;
        return this.json.hashCode() + ((c11 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.background;
        t tVar = this.tokenizedEvent;
        CellDTO cellDTO = this.dsCell;
        OnBoardingDTO onBoardingDTO = this.onBoarding;
        String str2 = this.json;
        StringBuilder c11 = C2436a.c(j11, "DsCellBrandVO(id=", ", background=", str);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", dsCell=");
        c11.append(cellDTO);
        c11.append(", onBoarding=");
        c11.append(onBoardingDTO);
        c11.append(", json=");
        c11.append(str2);
        c11.append(")");
        return c11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.background);
        dest.writeParcelable(this.tokenizedEvent, flags);
        dest.writeParcelable(this.dsCell, flags);
        dest.writeParcelable(this.onBoarding, flags);
        dest.writeString(this.json);
    }
}
