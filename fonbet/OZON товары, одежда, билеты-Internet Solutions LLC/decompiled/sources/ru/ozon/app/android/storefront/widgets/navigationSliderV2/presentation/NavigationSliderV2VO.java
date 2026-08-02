package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import Ak.C2436a;
import B0.C2454a;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Pk0.a;
import Ve.C4598rp;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import v0.I;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00019Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b\u0011\u00102R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b3\u0010\u001aR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "items", "Landroid/os/Parcelable;", "recyclerState", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "onboardingPosition", "", "isScrollable", "itemWidth", "Lv0/I;", "lazyListState", "<init>", "(JLjava/lang/String;Ljava/util/List;Landroid/os/Parcelable;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;IZILv0/I;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Landroid/os/Parcelable;", "getRecyclerState", "()Landroid/os/Parcelable;", "setRecyclerState", "(Landroid/os/Parcelable;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "I", "getOnboardingPosition", "Z", "()Z", "getItemWidth", "Lv0/I;", "getLazyListState", "()Lv0/I;", "setLazyListState", "(Lv0/I;)V", "NavigationItemV2", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class NavigationSliderV2VO implements c {
    private final long id;
    private final boolean isScrollable;
    private final int itemWidth;

    @NotNull
    private final List<NavigationItemV2> items;
    private I lazyListState;
    private final OnBoardingDTO onboarding;
    private final int onboardingPosition;
    private Parcelable recyclerState;
    private final String title;

    public NavigationSliderV2VO(long j11, String str, @NotNull List<NavigationItemV2> items, Parcelable parcelable, OnBoardingDTO onBoardingDTO, int i11, boolean z11, int i12, I i13) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.title = str;
        this.items = items;
        this.recyclerState = parcelable;
        this.onboarding = onBoardingDTO;
        this.onboardingPosition = i11;
        this.isScrollable = z11;
        this.itemWidth = i12;
        this.lazyListState = i13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationSliderV2VO)) {
            return false;
        }
        NavigationSliderV2VO navigationSliderV2VO = (NavigationSliderV2VO) other;
        return this.id == navigationSliderV2VO.id && Intrinsics.d(this.title, navigationSliderV2VO.title) && Intrinsics.d(this.items, navigationSliderV2VO.items) && Intrinsics.d(this.recyclerState, navigationSliderV2VO.recyclerState) && Intrinsics.d(this.onboarding, navigationSliderV2VO.onboarding) && this.onboardingPosition == navigationSliderV2VO.onboardingPosition && this.isScrollable == navigationSliderV2VO.isScrollable && this.itemWidth == navigationSliderV2VO.itemWidth && Intrinsics.d(this.lazyListState, navigationSliderV2VO.lazyListState);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getItemWidth() {
        return this.itemWidth;
    }

    @NotNull
    public final List<NavigationItemV2> getItems() {
        return this.items;
    }

    public final I getLazyListState() {
        return this.lazyListState;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final int getOnboardingPosition() {
        return this.onboardingPosition;
    }

    public final Parcelable getRecyclerState() {
        return this.recyclerState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.title;
        int b11 = g.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.items);
        Parcelable parcelable = this.recyclerState;
        int hashCode2 = (b11 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int a11 = C2454a.a(this.itemWidth, C3532b.a(C2454a.a(this.onboardingPosition, (hashCode2 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31, 31), 31, this.isScrollable), 31);
        I i11 = this.lazyListState;
        return a11 + (i11 != null ? i11.hashCode() : 0);
    }

    /* renamed from: isScrollable, reason: from getter */
    public final boolean getIsScrollable() {
        return this.isScrollable;
    }

    public final void setLazyListState(I i11) {
        this.lazyListState = i11;
    }

    public final void setRecyclerState(Parcelable parcelable) {
        this.recyclerState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.title;
        List<NavigationItemV2> list = this.items;
        Parcelable parcelable = this.recyclerState;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int i11 = this.onboardingPosition;
        boolean z11 = this.isScrollable;
        int i12 = this.itemWidth;
        I i13 = this.lazyListState;
        StringBuilder c11 = C2436a.c(j11, "NavigationSliderV2VO(id=", ", title=", str);
        c11.append(", items=");
        c11.append(list);
        c11.append(", recyclerState=");
        c11.append(parcelable);
        c11.append(", onboarding=");
        c11.append(onBoardingDTO);
        c11.append(", onboardingPosition=");
        c11.append(i11);
        c11.append(", isScrollable=");
        c11.append(z11);
        c11.append(", itemWidth=");
        c11.append(i12);
        c11.append(", lazyListState=");
        c11.append(i13);
        c11.append(")");
        return c11.toString();
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u0014R\"\u0010\b\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b(\u0010\u0016R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b,\u0010#¨\u0006-"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO$NavigationItemV2;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "maxLines", "itemWidth", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "hasOnboarding", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;ZZIILWZ/t;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getTitle", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "I", "getMaxLines", "getItemWidth", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getHasOnboarding", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigationItemV2 implements AdultVO {

        @NotNull
        private final AtomAction action;
        private final boolean hasOnboarding;

        @NotNull
        private final String image;
        private final boolean isAdult;
        private final int itemWidth;
        private final int maxLines;
        private boolean shouldBlur;

        @NotNull
        private final String title;
        private final t tokenizedEvent;

        public NavigationItemV2(@NotNull String image, @NotNull AtomAction action, @NotNull String title, boolean z11, boolean z12, int i11, int i12, t tVar, boolean z13) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(title, "title");
            this.image = image;
            this.action = action;
            this.title = title;
            this.shouldBlur = z11;
            this.isAdult = z12;
            this.maxLines = i11;
            this.itemWidth = i12;
            this.tokenizedEvent = tVar;
            this.hasOnboarding = z13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigationItemV2)) {
                return false;
            }
            NavigationItemV2 navigationItemV2 = (NavigationItemV2) other;
            return Intrinsics.d(this.image, navigationItemV2.image) && Intrinsics.d(this.action, navigationItemV2.action) && Intrinsics.d(this.title, navigationItemV2.title) && this.shouldBlur == navigationItemV2.shouldBlur && this.isAdult == navigationItemV2.isAdult && this.maxLines == navigationItemV2.maxLines && this.itemWidth == navigationItemV2.itemWidth && Intrinsics.d(this.tokenizedEvent, navigationItemV2.tokenizedEvent) && this.hasOnboarding == navigationItemV2.hasOnboarding;
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final int getItemWidth() {
            return this.itemWidth;
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public boolean getShouldBlur() {
            return this.shouldBlur;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.itemWidth, C2454a.a(this.maxLines, C3532b.a(C3532b.a(g.a(C4598rp.a(this.action, this.image.hashCode() * 31, 31), 31, this.title), 31, this.shouldBlur), 31, this.isAdult), 31), 31);
            t tVar = this.tokenizedEvent;
            return Boolean.hashCode(this.hasOnboarding) + ((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        /* renamed from: isAdult, reason: from getter */
        public boolean getIsAdult() {
            return this.isAdult;
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        public void setShouldBlur(boolean z11) {
            this.shouldBlur = z11;
        }

        @NotNull
        public String toString() {
            String str = this.image;
            AtomAction atomAction = this.action;
            String str2 = this.title;
            boolean z11 = this.shouldBlur;
            boolean z12 = this.isAdult;
            int i11 = this.maxLines;
            int i12 = this.itemWidth;
            t tVar = this.tokenizedEvent;
            boolean z13 = this.hasOnboarding;
            StringBuilder sb2 = new StringBuilder("NavigationItemV2(image=");
            sb2.append(str);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", title=");
            C2880a.c(str2, ", shouldBlur=", ", isAdult=", sb2, z11);
            sb2.append(z12);
            sb2.append(", maxLines=");
            sb2.append(i11);
            sb2.append(", itemWidth=");
            sb2.append(i12);
            sb2.append(", tokenizedEvent=");
            sb2.append(tVar);
            sb2.append(", hasOnboarding=");
            return a.a(")", sb2, z13);
        }

        public /* synthetic */ NavigationItemV2(String str, AtomAction atomAction, String str2, boolean z11, boolean z12, int i11, int i12, t tVar, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomAction, str2, z11, (i13 & 16) != 0 ? z11 : z12, i11, i12, tVar, z13);
        }
    }

    public /* synthetic */ NavigationSliderV2VO(long j11, String str, List list, Parcelable parcelable, OnBoardingDTO onBoardingDTO, int i11, boolean z11, int i12, I i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, list, (i14 & 8) != 0 ? null : parcelable, onBoardingDTO, i11, z11, i12, (i14 & 256) != 0 ? null : i13);
    }
}
