package ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.presentation.header;

import Bl.C2639a;
import D40.a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.timer.TimerDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\n\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b&\u0010\"¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/presentation/header/ToursSummaryHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "logoUrl", "", "isLogoVisible", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "payUntilBadge", "shouldShowPayUntilShimmer", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;ZLru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getLogoUrl", "Z", "()Z", "Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "getPayUntilBadge", "()Lru/ozon/app/android/travel/molecules/dto/timer/TimerDTO;", "getShouldShowPayUntilShimmer", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ToursSummaryHeaderVO implements c {
    private final long id;
    private final boolean isLogoVisible;
    private final String logoUrl;
    private final TimerDTO payUntilBadge;
    private final boolean shouldShowPayUntilShimmer;
    private final TextAtom title;

    public ToursSummaryHeaderVO(long j11, TextAtom textAtom, String str, boolean z11, TimerDTO timerDTO, boolean z12) {
        this.id = j11;
        this.title = textAtom;
        this.logoUrl = str;
        this.isLogoVisible = z11;
        this.payUntilBadge = timerDTO;
        this.shouldShowPayUntilShimmer = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursSummaryHeaderVO)) {
            return false;
        }
        ToursSummaryHeaderVO toursSummaryHeaderVO = (ToursSummaryHeaderVO) other;
        return this.id == toursSummaryHeaderVO.id && Intrinsics.d(this.title, toursSummaryHeaderVO.title) && Intrinsics.d(this.logoUrl, toursSummaryHeaderVO.logoUrl) && this.isLogoVisible == toursSummaryHeaderVO.isLogoVisible && Intrinsics.d(this.payUntilBadge, toursSummaryHeaderVO.payUntilBadge) && this.shouldShowPayUntilShimmer == toursSummaryHeaderVO.shouldShowPayUntilShimmer;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final TimerDTO getPayUntilBadge() {
        return this.payUntilBadge;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldShowPayUntilShimmer() {
        return this.shouldShowPayUntilShimmer;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str = this.logoUrl;
        int a11 = C3532b.a((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isLogoVisible);
        TimerDTO timerDTO = this.payUntilBadge;
        return Boolean.hashCode(this.shouldShowPayUntilShimmer) + ((a11 + (timerDTO != null ? timerDTO.hashCode() : 0)) * 31);
    }

    /* renamed from: isLogoVisible, reason: from getter */
    public final boolean getIsLogoVisible() {
        return this.isLogoVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        String str = this.logoUrl;
        boolean z11 = this.isLogoVisible;
        TimerDTO timerDTO = this.payUntilBadge;
        boolean z12 = this.shouldShowPayUntilShimmer;
        StringBuilder c11 = C2639a.c("ToursSummaryHeaderVO(id=", j11, ", title=", textAtom);
        a.g(", logoUrl=", str, ", isLogoVisible=", c11, z11);
        c11.append(", payUntilBadge=");
        c11.append(timerDTO);
        c11.append(", shouldShowPayUntilShimmer=");
        c11.append(z12);
        c11.append(")");
        return c11.toString();
    }
}
