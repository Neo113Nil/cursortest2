package ru.ozon.app.android.common.tabs.presentation;

import Lh.a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001-B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010\u0012¨\u0006."}, d2 = {"Lru/ozon/app/android/common/tabs/presentation/TabsV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "scrollWidgetKey", "Lru/ozon/uni/atoms/data/tabs/Tabs;", DynamicElementDTO.TABS, "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "dsTabs", "Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;", "onBoarding", "", "backgroundColor", "<init>", "(JLjava/lang/Integer;Lru/ozon/uni/atoms/data/tabs/Tabs;Lru/ozon/uni/atoms/data/tabs/TabsDTO;Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "getTabs", "()Lru/ozon/uni/atoms/data/tabs/Tabs;", "getTabs$annotations", "()V", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getDsTabs", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;", "getOnBoarding", "()Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;", "Ljava/lang/String;", "getBackgroundColor", "OnBoardingVO", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TabsV2VO implements c {

    @NotNull
    private final String backgroundColor;
    private final TabsDTO dsTabs;
    private final long id;
    private final OnBoardingVO onBoarding;
    private final Integer scrollWidgetKey;
    private final Tabs tabs;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/common/tabs/presentation/TabsV2VO$OnBoardingVO;", "Landroid/os/Parcelable;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoardingDTO", "", "tabPosition", "<init>", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnBoardingDTO", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "I", "getTabPosition", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBoardingVO implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OnBoardingVO> CREATOR = new Creator();

        @NotNull
        private final OnBoardingDTO onBoardingDTO;
        private final int tabPosition;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OnBoardingVO> {
            @Override // android.os.Parcelable.Creator
            public final OnBoardingVO createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OnBoardingVO((OnBoardingDTO) parcel.readParcelable(OnBoardingVO.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final OnBoardingVO[] newArray(int i11) {
                return new OnBoardingVO[i11];
            }
        }

        public OnBoardingVO(@NotNull OnBoardingDTO onBoardingDTO, int i11) {
            Intrinsics.checkNotNullParameter(onBoardingDTO, "onBoardingDTO");
            this.onBoardingDTO = onBoardingDTO;
            this.tabPosition = i11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnBoardingVO)) {
                return false;
            }
            OnBoardingVO onBoardingVO = (OnBoardingVO) other;
            return Intrinsics.d(this.onBoardingDTO, onBoardingVO.onBoardingDTO) && this.tabPosition == onBoardingVO.tabPosition;
        }

        @NotNull
        public final OnBoardingDTO getOnBoardingDTO() {
            return this.onBoardingDTO;
        }

        public final int getTabPosition() {
            return this.tabPosition;
        }

        public int hashCode() {
            return Integer.hashCode(this.tabPosition) + (this.onBoardingDTO.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnBoardingVO(onBoardingDTO=" + this.onBoardingDTO + ", tabPosition=" + this.tabPosition + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.onBoardingDTO, flags);
            dest.writeInt(this.tabPosition);
        }
    }

    public TabsV2VO(long j11, Integer num, Tabs tabs, TabsDTO tabsDTO, OnBoardingVO onBoardingVO, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.scrollWidgetKey = num;
        this.tabs = tabs;
        this.dsTabs = tabsDTO;
        this.onBoarding = onBoardingVO;
        this.backgroundColor = backgroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabsV2VO)) {
            return false;
        }
        TabsV2VO tabsV2VO = (TabsV2VO) other;
        return this.id == tabsV2VO.id && Intrinsics.d(this.scrollWidgetKey, tabsV2VO.scrollWidgetKey) && Intrinsics.d(this.tabs, tabsV2VO.tabs) && Intrinsics.d(this.dsTabs, tabsV2VO.dsTabs) && Intrinsics.d(this.onBoarding, tabsV2VO.onBoarding) && Intrinsics.d(this.backgroundColor, tabsV2VO.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TabsDTO getDsTabs() {
        return this.dsTabs;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final OnBoardingVO getOnBoarding() {
        return this.onBoarding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    public final Tabs getTabs() {
        return this.tabs;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.scrollWidgetKey;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Tabs tabs = this.tabs;
        int hashCode3 = (hashCode2 + (tabs == null ? 0 : tabs.hashCode())) * 31;
        TabsDTO tabsDTO = this.dsTabs;
        int hashCode4 = (hashCode3 + (tabsDTO == null ? 0 : tabsDTO.hashCode())) * 31;
        OnBoardingVO onBoardingVO = this.onBoarding;
        return this.backgroundColor.hashCode() + ((hashCode4 + (onBoardingVO != null ? onBoardingVO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.scrollWidgetKey;
        Tabs tabs = this.tabs;
        TabsDTO tabsDTO = this.dsTabs;
        OnBoardingVO onBoardingVO = this.onBoarding;
        String str = this.backgroundColor;
        StringBuilder c11 = a.c("TabsV2VO(id=", j11, ", scrollWidgetKey=", num);
        c11.append(", tabs=");
        c11.append(tabs);
        c11.append(", dsTabs=");
        c11.append(tabsDTO);
        c11.append(", onBoarding=");
        c11.append(onBoardingVO);
        c11.append(", backgroundColor=");
        c11.append(str);
        c11.append(")");
        return c11.toString();
    }
}
