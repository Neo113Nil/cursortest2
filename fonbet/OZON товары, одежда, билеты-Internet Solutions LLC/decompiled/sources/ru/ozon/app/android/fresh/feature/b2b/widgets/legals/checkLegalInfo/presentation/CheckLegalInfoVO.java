package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation;

import Bi.b;
import D3.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.CheckLegalInfoDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "info", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;", "kppCheck", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;", "banner", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;", "getKppCheck", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;", "getBanner", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckLegalInfoVO implements c {
    public static final int $stable = CellDTO.$stable;
    private final CheckLegalInfoDTO.Banner banner;

    @NotNull
    private final ButtonV3DTO button;
    private final long id;

    @NotNull
    private final CellDTO info;
    private final CheckLegalInfoDTO.KppCheckDTO kppCheck;

    public CheckLegalInfoVO(long j11, @NotNull CellDTO info, CheckLegalInfoDTO.KppCheckDTO kppCheckDTO, CheckLegalInfoDTO.Banner banner, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.info = info;
        this.kppCheck = kppCheckDTO;
        this.banner = banner;
        this.button = button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckLegalInfoVO)) {
            return false;
        }
        CheckLegalInfoVO checkLegalInfoVO = (CheckLegalInfoVO) other;
        return this.id == checkLegalInfoVO.id && Intrinsics.d(this.info, checkLegalInfoVO.info) && Intrinsics.d(this.kppCheck, checkLegalInfoVO.kppCheck) && Intrinsics.d(this.banner, checkLegalInfoVO.banner) && Intrinsics.d(this.button, checkLegalInfoVO.button);
    }

    public final CheckLegalInfoDTO.Banner getBanner() {
        return this.banner;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CellDTO getInfo() {
        return this.info;
    }

    public final CheckLegalInfoDTO.KppCheckDTO getKppCheck() {
        return this.kppCheck;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.info, Long.hashCode(this.id) * 31, 31);
        CheckLegalInfoDTO.KppCheckDTO kppCheckDTO = this.kppCheck;
        int hashCode = (c11 + (kppCheckDTO == null ? 0 : kppCheckDTO.hashCode())) * 31;
        CheckLegalInfoDTO.Banner banner = this.banner;
        return this.button.hashCode() + ((hashCode + (banner != null ? banner.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.info;
        CheckLegalInfoDTO.KppCheckDTO kppCheckDTO = this.kppCheck;
        CheckLegalInfoDTO.Banner banner = this.banner;
        ButtonV3DTO buttonV3DTO = this.button;
        StringBuilder e11 = h.e("CheckLegalInfoVO(id=", j11, ", info=", cellDTO);
        e11.append(", kppCheck=");
        e11.append(kppCheckDTO);
        e11.append(", banner=");
        e11.append(banner);
        e11.append(", button=");
        e11.append(buttonV3DTO);
        e11.append(")");
        return e11.toString();
    }
}
