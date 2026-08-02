package ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceInfo.presentation;

import B3.p;
import Bl.C2639a;
import G.g;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001:\u0002*+BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardItemVI;", "cardList", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardListSettingsVI;", "cardListSettings", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardListSettingsVI;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getCardList", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardListSettingsVI;", "getCardListSettings", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardListSettingsVI;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "CardItemVI", "CardListSettingsVI", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bFinanceInfoVI implements c {

    @NotNull
    private final List<CardItemVI> cardList;
    private final CardListSettingsVI cardListSettings;
    private final long id;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardItemVI;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "topText", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "topTextIcon", "bottomText", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTopText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTopTextIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBottomText", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardItemVI {
        public static final int $stable = AtomAction.$stable | IconDTO.$stable;
        private final AtomAction action;

        @NotNull
        private final TextDTO bottomText;

        @NotNull
        private final TextDTO topText;
        private final IconDTO topTextIcon;

        public CardItemVI(@NotNull TextDTO topText, IconDTO iconDTO, @NotNull TextDTO bottomText, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(topText, "topText");
            Intrinsics.checkNotNullParameter(bottomText, "bottomText");
            this.topText = topText;
            this.topTextIcon = iconDTO;
            this.bottomText = bottomText;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardItemVI)) {
                return false;
            }
            CardItemVI cardItemVI = (CardItemVI) other;
            return Intrinsics.d(this.topText, cardItemVI.topText) && Intrinsics.d(this.topTextIcon, cardItemVI.topTextIcon) && Intrinsics.d(this.bottomText, cardItemVI.bottomText) && Intrinsics.d(this.action, cardItemVI.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getBottomText() {
            return this.bottomText;
        }

        @NotNull
        public final TextDTO getTopText() {
            return this.topText;
        }

        public final IconDTO getTopTextIcon() {
            return this.topTextIcon;
        }

        public int hashCode() {
            int hashCode = this.topText.hashCode() * 31;
            IconDTO iconDTO = this.topTextIcon;
            int a11 = b.a(this.bottomText, (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
            AtomAction atomAction = this.action;
            return a11 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.topText;
            IconDTO iconDTO = this.topTextIcon;
            TextDTO textDTO2 = this.bottomText;
            AtomAction atomAction = this.action;
            StringBuilder d11 = C2639a.d("CardItemVI(topText=", ", topTextIcon=", ", bottomText=", iconDTO, textDTO);
            d11.append(textDTO2);
            d11.append(", action=");
            d11.append(atomAction);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardListSettingsVI;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "gap", "verticalPaddings", "horizontalPaddings", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getGap", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getVerticalPaddings", "getHorizontalPaddings", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardListSettingsVI {

        @NotNull
        private final Paddings gap;

        @NotNull
        private final Paddings horizontalPaddings;

        @NotNull
        private final Paddings verticalPaddings;

        public CardListSettingsVI(@NotNull Paddings gap, @NotNull Paddings verticalPaddings, @NotNull Paddings horizontalPaddings) {
            Intrinsics.checkNotNullParameter(gap, "gap");
            Intrinsics.checkNotNullParameter(verticalPaddings, "verticalPaddings");
            Intrinsics.checkNotNullParameter(horizontalPaddings, "horizontalPaddings");
            this.gap = gap;
            this.verticalPaddings = verticalPaddings;
            this.horizontalPaddings = horizontalPaddings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardListSettingsVI)) {
                return false;
            }
            CardListSettingsVI cardListSettingsVI = (CardListSettingsVI) other;
            return this.gap == cardListSettingsVI.gap && this.verticalPaddings == cardListSettingsVI.verticalPaddings && this.horizontalPaddings == cardListSettingsVI.horizontalPaddings;
        }

        @NotNull
        public final Paddings getGap() {
            return this.gap;
        }

        @NotNull
        public final Paddings getHorizontalPaddings() {
            return this.horizontalPaddings;
        }

        @NotNull
        public final Paddings getVerticalPaddings() {
            return this.verticalPaddings;
        }

        public int hashCode() {
            return this.horizontalPaddings.hashCode() + GR.b.b(this.verticalPaddings, this.gap.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.gap;
            Paddings paddings2 = this.verticalPaddings;
            return D40.b.b(p.b("CardListSettingsVI(gap=", paddings, ", verticalPaddings=", paddings2, ", horizontalPaddings="), this.horizontalPaddings, ")");
        }
    }

    public B2bFinanceInfoVI(long j11, @NotNull TextDTO title, @NotNull List<CardItemVI> cardList, CardListSettingsVI cardListSettingsVI, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        this.id = j11;
        this.title = title;
        this.cardList = cardList;
        this.cardListSettings = cardListSettingsVI;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bFinanceInfoVI)) {
            return false;
        }
        B2bFinanceInfoVI b2bFinanceInfoVI = (B2bFinanceInfoVI) other;
        return this.id == b2bFinanceInfoVI.id && Intrinsics.d(this.title, b2bFinanceInfoVI.title) && Intrinsics.d(this.cardList, b2bFinanceInfoVI.cardList) && Intrinsics.d(this.cardListSettings, b2bFinanceInfoVI.cardListSettings) && Intrinsics.d(this.viewEvent, b2bFinanceInfoVI.viewEvent);
    }

    @NotNull
    public final List<CardItemVI> getCardList() {
        return this.cardList;
    }

    public final CardListSettingsVI getCardListSettings() {
        return this.cardListSettings;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(b.a(this.title, Long.hashCode(this.id) * 31, 31), 31, this.cardList);
        CardListSettingsVI cardListSettingsVI = this.cardListSettings;
        int hashCode = (b11 + (cardListSettingsVI == null ? 0 : cardListSettingsVI.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<CardItemVI> list = this.cardList;
        CardListSettingsVI cardListSettingsVI = this.cardListSettings;
        t tVar = this.viewEvent;
        StringBuilder b11 = a.b("B2bFinanceInfoVI(id=", j11, ", title=", textDTO);
        b11.append(", cardList=");
        b11.append(list);
        b11.append(", cardListSettings=");
        b11.append(cardListSettingsVI);
        return Lh.a.b(b11, ", viewEvent=", tVar, ")");
    }
}
