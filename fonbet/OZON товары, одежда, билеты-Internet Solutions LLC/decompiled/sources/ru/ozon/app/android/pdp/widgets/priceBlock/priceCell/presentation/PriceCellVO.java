package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation;

import Ak.C2436a;
import B0.A0;
import Fj.c;
import Ns.b;
import V.e;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0081\b\u0018\u00002\u00020\u0001:\u0002BCBy\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\bA\u0010=¨\u0006D"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "", "id", "", "tabGroupId", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCounterBadge;", "counterBadge", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$Disclosure;", "disclosure", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$BackgroundColors;", "backgroundColors", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "", "animationTimer", "animationTokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCounterBadge;Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$Disclosure;Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$BackgroundColors;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Ljava/lang/Integer;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTabGroupId", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCounterBadge;", "getCounterBadge", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCounterBadge;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$Disclosure;", "getDisclosure", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$Disclosure;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$BackgroundColors;", "getBackgroundColors", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$BackgroundColors;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/lang/Integer;", "getAnimationTimer", "()Ljava/lang/Integer;", "getAnimationTokenizedEvent", "Disclosure", "BackgroundColors", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceCellVO implements TabEmbeddedViewObject {
    private final AtomAction action;
    private final Integer animationTimer;
    private final t animationTokenizedEvent;

    @NotNull
    private final BackgroundColors backgroundColors;
    private final PriceCounterBadge counterBadge;
    private final Disclosure disclosure;
    private final Icon icon;
    private final long id;
    private final TextDTO subtitle;
    private final String tabGroupId;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$BackgroundColors;", "", "", "inner", "outer", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInner", "getOuter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackgroundColors {

        @NotNull
        private final String inner;

        @NotNull
        private final String outer;

        public BackgroundColors(@NotNull String inner, @NotNull String outer) {
            Intrinsics.checkNotNullParameter(inner, "inner");
            Intrinsics.checkNotNullParameter(outer, "outer");
            this.inner = inner;
            this.outer = outer;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BackgroundColors)) {
                return false;
            }
            BackgroundColors backgroundColors = (BackgroundColors) other;
            return Intrinsics.d(this.inner, backgroundColors.inner) && Intrinsics.d(this.outer, backgroundColors.outer);
        }

        @NotNull
        public final String getInner() {
            return this.inner;
        }

        @NotNull
        public final String getOuter() {
            return this.outer;
        }

        public int hashCode() {
            return this.outer.hashCode() + (this.inner.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("BackgroundColors(inner=", this.inner, ", outer=", this.outer, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCellVO$Disclosure;", "", "", "tintColor", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTintColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Disclosure {

        @NotNull
        private final String tintColor;

        public Disclosure(@NotNull String tintColor) {
            Intrinsics.checkNotNullParameter(tintColor, "tintColor");
            this.tintColor = tintColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disclosure) && Intrinsics.d(this.tintColor, ((Disclosure) other).tintColor);
        }

        @NotNull
        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            return this.tintColor.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Disclosure(tintColor=", this.tintColor, ")");
        }
    }

    public PriceCellVO(long j11, String str, Icon icon, @NotNull TextDTO title, TextDTO textDTO, PriceCounterBadge priceCounterBadge, Disclosure disclosure, @NotNull BackgroundColors backgroundColors, AtomAction atomAction, t tVar, Integer num, t tVar2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColors, "backgroundColors");
        this.id = j11;
        this.tabGroupId = str;
        this.icon = icon;
        this.title = title;
        this.subtitle = textDTO;
        this.counterBadge = priceCounterBadge;
        this.disclosure = disclosure;
        this.backgroundColors = backgroundColors;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.animationTimer = num;
        this.animationTokenizedEvent = tVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceCellVO)) {
            return false;
        }
        PriceCellVO priceCellVO = (PriceCellVO) other;
        return this.id == priceCellVO.id && Intrinsics.d(this.tabGroupId, priceCellVO.tabGroupId) && Intrinsics.d(this.icon, priceCellVO.icon) && Intrinsics.d(this.title, priceCellVO.title) && Intrinsics.d(this.subtitle, priceCellVO.subtitle) && Intrinsics.d(this.counterBadge, priceCellVO.counterBadge) && Intrinsics.d(this.disclosure, priceCellVO.disclosure) && Intrinsics.d(this.backgroundColors, priceCellVO.backgroundColors) && Intrinsics.d(this.action, priceCellVO.action) && Intrinsics.d(this.tokenizedEvent, priceCellVO.tokenizedEvent) && Intrinsics.d(this.animationTimer, priceCellVO.animationTimer) && Intrinsics.d(this.animationTokenizedEvent, priceCellVO.animationTokenizedEvent);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final Integer getAnimationTimer() {
        return this.animationTimer;
    }

    public final t getAnimationTokenizedEvent() {
        return this.animationTokenizedEvent;
    }

    @NotNull
    public final BackgroundColors getBackgroundColors() {
        return this.backgroundColors;
    }

    public final PriceCounterBadge getCounterBadge() {
        return this.counterBadge;
    }

    public final Disclosure getDisclosure() {
        return this.disclosure;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return TabEmbeddedViewObject.DefaultImpls.getScrollWidgetKey(this);
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject
    public String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return TabEmbeddedViewObject.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.tabGroupId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Icon icon = this.icon;
        int a11 = b.a(this.title, (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode3 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        PriceCounterBadge priceCounterBadge = this.counterBadge;
        int hashCode4 = (hashCode3 + (priceCounterBadge == null ? 0 : priceCounterBadge.hashCode())) * 31;
        Disclosure disclosure = this.disclosure;
        int hashCode5 = (this.backgroundColors.hashCode() + ((hashCode4 + (disclosure == null ? 0 : disclosure.hashCode())) * 31)) * 31;
        AtomAction atomAction = this.action;
        int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode7 = (hashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Integer num = this.animationTimer;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        t tVar2 = this.animationTokenizedEvent;
        return hashCode8 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.tabGroupId;
        Icon icon = this.icon;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        PriceCounterBadge priceCounterBadge = this.counterBadge;
        Disclosure disclosure = this.disclosure;
        BackgroundColors backgroundColors = this.backgroundColors;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        Integer num = this.animationTimer;
        t tVar2 = this.animationTokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "PriceCellVO(id=", ", tabGroupId=", str);
        c11.append(", icon=");
        c11.append(icon);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", subtitle=");
        c11.append(textDTO2);
        c11.append(", counterBadge=");
        c11.append(priceCounterBadge);
        c11.append(", disclosure=");
        c11.append(disclosure);
        c11.append(", backgroundColors=");
        c11.append(backgroundColors);
        c.e(tVar, ", action=", ", tokenizedEvent=", c11, atomAction);
        c11.append(", animationTimer=");
        c11.append(num);
        c11.append(", animationTokenizedEvent=");
        c11.append(tVar2);
        c11.append(")");
        return c11.toString();
    }
}
