package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling;

import Kk.C3532b;
import android.os.Parcelable;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b#\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bm\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b7\u00104R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b8\u00104R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b9\u00104R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b\u0014\u0010;R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/ScrollingTagListV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "tags", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "onboardingIndex", "Landroid/os/Parcelable;", "layoutManagerState", "", "id", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "bottomPadding", "topPadding", "leftPadding", "rightPadding", "", "isBottomRounded", "", "backgroundColor", "<init>", "(Ljava/util/List;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/Integer;Landroid/os/Parcelable;JLru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Ljava/lang/Integer;", "getOnboardingIndex", "()Ljava/lang/Integer;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottomPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "setBottomPadding", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getTopPadding", "getLeftPadding", "getRightPadding", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "setBackgroundColor", "(Ljava/lang/String;)V", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ScrollingTagListV3VO implements c {
    private String backgroundColor;

    @NotNull
    private CommonCellSettings.LayoutPadding bottomPadding;
    private final long id;
    private final boolean isBottomRounded;
    private Parcelable layoutManagerState;

    @NotNull
    private final CommonCellSettings.LayoutPadding leftPadding;
    private final OnBoardingDTO onboarding;
    private final Integer onboardingIndex;

    @NotNull
    private final CommonCellSettings.LayoutPadding rightPadding;

    @NotNull
    private final List<AtomDTO> tags;

    @NotNull
    private final CommonCellSettings.LayoutPadding topPadding;

    /* JADX WARN: Multi-variable type inference failed */
    public ScrollingTagListV3VO(@NotNull List<? extends AtomDTO> tags, OnBoardingDTO onBoardingDTO, Integer num, Parcelable parcelable, long j11, @NotNull CommonCellSettings.LayoutPadding bottomPadding, @NotNull CommonCellSettings.LayoutPadding topPadding, @NotNull CommonCellSettings.LayoutPadding leftPadding, @NotNull CommonCellSettings.LayoutPadding rightPadding, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        this.tags = tags;
        this.onboarding = onBoardingDTO;
        this.onboardingIndex = num;
        this.layoutManagerState = parcelable;
        this.id = j11;
        this.bottomPadding = bottomPadding;
        this.topPadding = topPadding;
        this.leftPadding = leftPadding;
        this.rightPadding = rightPadding;
        this.isBottomRounded = z11;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollingTagListV3VO)) {
            return false;
        }
        ScrollingTagListV3VO scrollingTagListV3VO = (ScrollingTagListV3VO) other;
        return Intrinsics.d(this.tags, scrollingTagListV3VO.tags) && Intrinsics.d(this.onboarding, scrollingTagListV3VO.onboarding) && Intrinsics.d(this.onboardingIndex, scrollingTagListV3VO.onboardingIndex) && Intrinsics.d(this.layoutManagerState, scrollingTagListV3VO.layoutManagerState) && this.id == scrollingTagListV3VO.id && this.bottomPadding == scrollingTagListV3VO.bottomPadding && this.topPadding == scrollingTagListV3VO.topPadding && this.leftPadding == scrollingTagListV3VO.leftPadding && this.rightPadding == scrollingTagListV3VO.rightPadding && this.isBottomRounded == scrollingTagListV3VO.isBottomRounded && Intrinsics.d(this.backgroundColor, scrollingTagListV3VO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final Integer getOnboardingIndex() {
        return this.onboardingIndex;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<AtomDTO> getTags() {
        return this.tags;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = this.tags.hashCode() * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode2 = (hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        Integer num = this.onboardingIndex;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Parcelable parcelable = this.layoutManagerState;
        int a11 = C3532b.a(Ef0.c.a(this.rightPadding, Ef0.c.a(this.leftPadding, Ef0.c.a(this.topPadding, Ef0.c.a(this.bottomPadding, Pk0.c.a((hashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.id), 31), 31), 31), 31), 31, this.isBottomRounded);
        String str = this.backgroundColor;
        return a11 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: isBottomRounded, reason: from getter */
    public final boolean getIsBottomRounded() {
        return this.isBottomRounded;
    }

    public final void setLayoutManagerState(Parcelable parcelable) {
        this.layoutManagerState = parcelable;
    }

    @NotNull
    public String toString() {
        List<AtomDTO> list = this.tags;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        Integer num = this.onboardingIndex;
        Parcelable parcelable = this.layoutManagerState;
        long j11 = this.id;
        CommonCellSettings.LayoutPadding layoutPadding = this.bottomPadding;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.topPadding;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.leftPadding;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.rightPadding;
        boolean z11 = this.isBottomRounded;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("ScrollingTagListV3VO(tags=");
        sb2.append(list);
        sb2.append(", onboarding=");
        sb2.append(onBoardingDTO);
        sb2.append(", onboardingIndex=");
        sb2.append(num);
        sb2.append(", layoutManagerState=");
        sb2.append(parcelable);
        sb2.append(", id=");
        sb2.append(j11);
        sb2.append(", bottomPadding=");
        sb2.append(layoutPadding);
        sb2.append(", topPadding=");
        sb2.append(layoutPadding2);
        sb2.append(", leftPadding=");
        sb2.append(layoutPadding3);
        sb2.append(", rightPadding=");
        sb2.append(layoutPadding4);
        sb2.append(", isBottomRounded=");
        sb2.append(z11);
        return C6594f.a(", backgroundColor=", str, ")", sb2);
    }
}
