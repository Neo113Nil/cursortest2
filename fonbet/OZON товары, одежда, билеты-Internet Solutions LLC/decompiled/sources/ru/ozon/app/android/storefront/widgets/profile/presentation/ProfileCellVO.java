package ru.ozon.app.android.storefront.widgets.profile.presentation;

import Bi.b;
import D3.h;
import G.g;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profile/presentation/ProfileCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "dsCell", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoardingDTO", "", "onboardingKey", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getDsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnBoardingDTO", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Ljava/lang/String;", "getOnboardingKey", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProfileCellVO implements c {

    @NotNull
    private final CellDTO dsCell;
    private final long id;
    private final OnBoardingDTO onBoardingDTO;

    @NotNull
    private final String onboardingKey;
    private final t tokenizedEvent;

    public ProfileCellVO(long j11, @NotNull CellDTO dsCell, OnBoardingDTO onBoardingDTO, @NotNull String onboardingKey, t tVar) {
        Intrinsics.checkNotNullParameter(dsCell, "dsCell");
        Intrinsics.checkNotNullParameter(onboardingKey, "onboardingKey");
        this.id = j11;
        this.dsCell = dsCell;
        this.onBoardingDTO = onBoardingDTO;
        this.onboardingKey = onboardingKey;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileCellVO)) {
            return false;
        }
        ProfileCellVO profileCellVO = (ProfileCellVO) other;
        return this.id == profileCellVO.id && Intrinsics.d(this.dsCell, profileCellVO.dsCell) && Intrinsics.d(this.onBoardingDTO, profileCellVO.onBoardingDTO) && Intrinsics.d(this.onboardingKey, profileCellVO.onboardingKey) && Intrinsics.d(this.tokenizedEvent, profileCellVO.tokenizedEvent);
    }

    @NotNull
    public final CellDTO getDsCell() {
        return this.dsCell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final OnBoardingDTO getOnBoardingDTO() {
        return this.onBoardingDTO;
    }

    @NotNull
    public final String getOnboardingKey() {
        return this.onboardingKey;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.dsCell, Long.hashCode(this.id) * 31, 31);
        OnBoardingDTO onBoardingDTO = this.onBoardingDTO;
        int a11 = g.a((c11 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31, 31, this.onboardingKey);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.dsCell;
        OnBoardingDTO onBoardingDTO = this.onBoardingDTO;
        String str = this.onboardingKey;
        t tVar = this.tokenizedEvent;
        StringBuilder e11 = h.e("ProfileCellVO(id=", j11, ", dsCell=", cellDTO);
        e11.append(", onBoardingDTO=");
        e11.append(onBoardingDTO);
        e11.append(", onboardingKey=");
        e11.append(str);
        return a.b(e11, ", tokenizedEvent=", tVar, ")");
    }
}
