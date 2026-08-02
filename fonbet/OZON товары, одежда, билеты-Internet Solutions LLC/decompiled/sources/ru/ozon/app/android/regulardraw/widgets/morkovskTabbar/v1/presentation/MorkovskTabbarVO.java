package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation;

import B0.C2454a;
import Ek.a;
import El.C2971a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Tl.b;
import Ve.C4598rp;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorAtomDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001-BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jd\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO$MorkovskTabItemVO;", DynamicElementDTO.TABS, "", "bgGradientColors", "animationTime", "", "shouldAnimateShow", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/Long;ZLWZ/t;)V", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/Long;ZLWZ/t;)Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "getBgGradientColors", "Ljava/lang/Long;", "getAnimationTime", "()Ljava/lang/Long;", "Z", "getShouldAnimateShow", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "MorkovskTabItemVO", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskTabbarVO implements c {
    private final Long animationTime;
    private final List<String> bgGradientColors;
    private final long id;
    private final boolean shouldAnimateShow;

    @NotNull
    private final List<MorkovskTabItemVO> tabs;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b\u000b\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/presentation/MorkovskTabbarVO$MorkovskTabItemVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "imageUrl", "backgroundImage", "", "blockWidth", "blockHeight", "imageHeight", "", "isSideBlock", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "indicator", "", "animationTime", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZLru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;Ljava/lang/Long;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getImageUrl", "getBackgroundImage", "I", "getBlockWidth", "getBlockHeight", "getImageHeight", "Z", "()Z", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "getIndicator", "()Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "Ljava/lang/Long;", "getAnimationTime", "()Ljava/lang/Long;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MorkovskTabItemVO {

        @NotNull
        private final AtomAction action;
        private final Long animationTime;

        @NotNull
        private final String backgroundImage;
        private final int blockHeight;
        private final int blockWidth;
        private final int imageHeight;

        @NotNull
        private final String imageUrl;
        private final IndicatorAtomDTO indicator;
        private final boolean isSideBlock;

        @NotNull
        private final String title;
        private final t tokenizedEvent;

        public MorkovskTabItemVO(@NotNull String title, @NotNull String imageUrl, @NotNull String backgroundImage, int i11, int i12, int i13, boolean z11, IndicatorAtomDTO indicatorAtomDTO, Long l11, @NotNull AtomAction action, t tVar) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.imageUrl = imageUrl;
            this.backgroundImage = backgroundImage;
            this.blockWidth = i11;
            this.blockHeight = i12;
            this.imageHeight = i13;
            this.isSideBlock = z11;
            this.indicator = indicatorAtomDTO;
            this.animationTime = l11;
            this.action = action;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MorkovskTabItemVO)) {
                return false;
            }
            MorkovskTabItemVO morkovskTabItemVO = (MorkovskTabItemVO) other;
            return Intrinsics.d(this.title, morkovskTabItemVO.title) && Intrinsics.d(this.imageUrl, morkovskTabItemVO.imageUrl) && Intrinsics.d(this.backgroundImage, morkovskTabItemVO.backgroundImage) && this.blockWidth == morkovskTabItemVO.blockWidth && this.blockHeight == morkovskTabItemVO.blockHeight && this.imageHeight == morkovskTabItemVO.imageHeight && this.isSideBlock == morkovskTabItemVO.isSideBlock && Intrinsics.d(this.indicator, morkovskTabItemVO.indicator) && Intrinsics.d(this.animationTime, morkovskTabItemVO.animationTime) && Intrinsics.d(this.action, morkovskTabItemVO.action) && Intrinsics.d(this.tokenizedEvent, morkovskTabItemVO.tokenizedEvent);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final Long getAnimationTime() {
            return this.animationTime;
        }

        @NotNull
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        public final int getBlockHeight() {
            return this.blockHeight;
        }

        public final int getBlockWidth() {
            return this.blockWidth;
        }

        public final int getImageHeight() {
            return this.imageHeight;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final IndicatorAtomDTO getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = C3532b.a(C2454a.a(this.imageHeight, C2454a.a(this.blockHeight, C2454a.a(this.blockWidth, g.a(g.a(this.title.hashCode() * 31, 31, this.imageUrl), 31, this.backgroundImage), 31), 31), 31), 31, this.isSideBlock);
            IndicatorAtomDTO indicatorAtomDTO = this.indicator;
            int hashCode = (a11 + (indicatorAtomDTO == null ? 0 : indicatorAtomDTO.hashCode())) * 31;
            Long l11 = this.animationTime;
            int a12 = C4598rp.a(this.action, (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31, 31);
            t tVar = this.tokenizedEvent;
            return a12 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isSideBlock, reason: from getter */
        public final boolean getIsSideBlock() {
            return this.isSideBlock;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.imageUrl;
            String str3 = this.backgroundImage;
            int i11 = this.blockWidth;
            int i12 = this.blockHeight;
            int i13 = this.imageHeight;
            boolean z11 = this.isSideBlock;
            IndicatorAtomDTO indicatorAtomDTO = this.indicator;
            Long l11 = this.animationTime;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder d11 = C3660k.d("MorkovskTabItemVO(title=", str, ", imageUrl=", str2, ", backgroundImage=");
            Pk0.g.d(i11, str3, ", blockWidth=", ", blockHeight=", d11);
            a.f(i12, i13, ", imageHeight=", ", isSideBlock=", d11);
            d11.append(z11);
            d11.append(", indicator=");
            d11.append(indicatorAtomDTO);
            d11.append(", animationTime=");
            d11.append(l11);
            d11.append(", action=");
            d11.append(atomAction);
            d11.append(", tokenizedEvent=");
            return b.d(d11, tVar, ")");
        }
    }

    public MorkovskTabbarVO(long j11, @NotNull List<MorkovskTabItemVO> tabs, List<String> list, Long l11, boolean z11, t tVar) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.tabs = tabs;
        this.bgGradientColors = list;
        this.animationTime = l11;
        this.shouldAnimateShow = z11;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ MorkovskTabbarVO copy$default(MorkovskTabbarVO morkovskTabbarVO, long j11, List list, List list2, Long l11, boolean z11, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = morkovskTabbarVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = morkovskTabbarVO.tabs;
        }
        List list3 = list;
        if ((i11 & 4) != 0) {
            list2 = morkovskTabbarVO.bgGradientColors;
        }
        List list4 = list2;
        if ((i11 & 8) != 0) {
            l11 = morkovskTabbarVO.animationTime;
        }
        Long l12 = l11;
        if ((i11 & 16) != 0) {
            z11 = morkovskTabbarVO.shouldAnimateShow;
        }
        boolean z12 = z11;
        if ((i11 & 32) != 0) {
            tVar = morkovskTabbarVO.tokenizedEvent;
        }
        return morkovskTabbarVO.copy(j12, list3, list4, l12, z12, tVar);
    }

    @NotNull
    public final MorkovskTabbarVO copy(long id2, @NotNull List<MorkovskTabItemVO> tabs, List<String> bgGradientColors, Long animationTime, boolean shouldAnimateShow, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new MorkovskTabbarVO(id2, tabs, bgGradientColors, animationTime, shouldAnimateShow, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskTabbarVO)) {
            return false;
        }
        MorkovskTabbarVO morkovskTabbarVO = (MorkovskTabbarVO) other;
        return this.id == morkovskTabbarVO.id && Intrinsics.d(this.tabs, morkovskTabbarVO.tabs) && Intrinsics.d(this.bgGradientColors, morkovskTabbarVO.bgGradientColors) && Intrinsics.d(this.animationTime, morkovskTabbarVO.animationTime) && this.shouldAnimateShow == morkovskTabbarVO.shouldAnimateShow && Intrinsics.d(this.tokenizedEvent, morkovskTabbarVO.tokenizedEvent);
    }

    public final List<String> getBgGradientColors() {
        return this.bgGradientColors;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldAnimateShow() {
        return this.shouldAnimateShow;
    }

    @NotNull
    public final List<MorkovskTabItemVO> getTabs() {
        return this.tabs;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.tabs);
        List<String> list = this.bgGradientColors;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        Long l11 = this.animationTime;
        int a11 = C3532b.a((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31, 31, this.shouldAnimateShow);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<MorkovskTabItemVO> list = this.tabs;
        List<String> list2 = this.bgGradientColors;
        Long l11 = this.animationTime;
        boolean z11 = this.shouldAnimateShow;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "MorkovskTabbarVO(id=", ", tabs=", list);
        b11.append(", bgGradientColors=");
        b11.append(list2);
        b11.append(", animationTime=");
        b11.append(l11);
        C2971a.d(b11, ", shouldAnimateShow=", z11, ", tokenizedEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}
