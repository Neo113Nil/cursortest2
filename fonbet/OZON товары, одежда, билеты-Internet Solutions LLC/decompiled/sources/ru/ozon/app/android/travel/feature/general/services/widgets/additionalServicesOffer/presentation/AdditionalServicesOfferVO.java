package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import Ve.C4636t5;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002%&B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$OfferVO;", "offers", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$AdditionalServicesOfferTheme;", "theme", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$AdditionalServicesOfferTheme;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getOffers", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$AdditionalServicesOfferTheme;", "getTheme", "()Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$AdditionalServicesOfferTheme;", "OfferVO", "AdditionalServicesOfferTheme", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalServicesOfferVO implements c {
    private final long id;

    @NotNull
    private final List<OfferVO> offers;

    @NotNull
    private final AdditionalServicesOfferTheme theme;

    @NotNull
    private final TextAtom title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$AdditionalServicesOfferTheme;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SHADED", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class AdditionalServicesOfferTheme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AdditionalServicesOfferTheme[] $VALUES;
        public static final AdditionalServicesOfferTheme DEFAULT = new AdditionalServicesOfferTheme("DEFAULT", 0);
        public static final AdditionalServicesOfferTheme SHADED = new AdditionalServicesOfferTheme("SHADED", 1);

        private static final /* synthetic */ AdditionalServicesOfferTheme[] $values() {
            return new AdditionalServicesOfferTheme[]{DEFAULT, SHADED};
        }

        static {
            AdditionalServicesOfferTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AdditionalServicesOfferTheme(String str, int i11) {
        }

        public static AdditionalServicesOfferTheme valueOf(String str) {
            return (AdditionalServicesOfferTheme) Enum.valueOf(AdditionalServicesOfferTheme.class, str);
        }

        public static AdditionalServicesOfferTheme[] values() {
            return (AdditionalServicesOfferTheme[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$OfferVO;", "", "", "id", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "offerIconLink", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "offerTitle", "offerSubtitle", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "Lru/ozon/uni/atoms/data/button/Icon;", "directIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(ILru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "getOfferIconLink", "()Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getOfferTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getOfferSubtitle", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/uni/atoms/data/button/Icon;", "getDirectIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OfferVO {
        public static final int $stable;

        @NotNull
        private final AtomAction action;
        private final Badge badge;
        private final Icon directIcon;
        private final int id;

        @NotNull
        private final ThemeImageV1VO offerIconLink;
        private final TextAtom offerSubtitle;

        @NotNull
        private final TextAtom offerTitle;

        static {
            int i11 = AtomAction.$stable | Icon.$stable | Badge.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | i12 | ThemeImageV1VO.$stable;
        }

        public OfferVO(int i11, @NotNull ThemeImageV1VO offerIconLink, @NotNull TextAtom offerTitle, TextAtom textAtom, Badge badge, Icon icon, @NotNull AtomAction action) {
            Intrinsics.checkNotNullParameter(offerIconLink, "offerIconLink");
            Intrinsics.checkNotNullParameter(offerTitle, "offerTitle");
            Intrinsics.checkNotNullParameter(action, "action");
            this.id = i11;
            this.offerIconLink = offerIconLink;
            this.offerTitle = offerTitle;
            this.offerSubtitle = textAtom;
            this.badge = badge;
            this.directIcon = icon;
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfferVO)) {
                return false;
            }
            OfferVO offerVO = (OfferVO) other;
            return this.id == offerVO.id && Intrinsics.d(this.offerIconLink, offerVO.offerIconLink) && Intrinsics.d(this.offerTitle, offerVO.offerTitle) && Intrinsics.d(this.offerSubtitle, offerVO.offerSubtitle) && Intrinsics.d(this.badge, offerVO.badge) && Intrinsics.d(this.directIcon, offerVO.directIcon) && Intrinsics.d(this.action, offerVO.action);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final Badge getBadge() {
            return this.badge;
        }

        public final Icon getDirectIcon() {
            return this.directIcon;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final ThemeImageV1VO getOfferIconLink() {
            return this.offerIconLink;
        }

        public final TextAtom getOfferSubtitle() {
            return this.offerSubtitle;
        }

        @NotNull
        public final TextAtom getOfferTitle() {
            return this.offerTitle;
        }

        public int hashCode() {
            int b11 = C2619v.b((this.offerIconLink.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.offerTitle);
            TextAtom textAtom = this.offerSubtitle;
            int hashCode = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Badge badge = this.badge;
            int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
            Icon icon = this.directIcon;
            return this.action.hashCode() + ((hashCode2 + (icon != null ? icon.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            ThemeImageV1VO themeImageV1VO = this.offerIconLink;
            TextAtom textAtom = this.offerTitle;
            TextAtom textAtom2 = this.offerSubtitle;
            Badge badge = this.badge;
            Icon icon = this.directIcon;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("OfferVO(id=");
            sb2.append(i11);
            sb2.append(", offerIconLink=");
            sb2.append(themeImageV1VO);
            sb2.append(", offerTitle=");
            C4636t5.c(", offerSubtitle=", ", badge=", sb2, textAtom, textAtom2);
            sb2.append(badge);
            sb2.append(", directIcon=");
            sb2.append(icon);
            sb2.append(", action=");
            return B6.b.b(sb2, atomAction, ")");
        }
    }

    public AdditionalServicesOfferVO(long j11, @NotNull TextAtom title, @NotNull List<OfferVO> offers, @NotNull AdditionalServicesOfferTheme theme) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(offers, "offers");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.id = j11;
        this.title = title;
        this.offers = offers;
        this.theme = theme;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServicesOfferVO)) {
            return false;
        }
        AdditionalServicesOfferVO additionalServicesOfferVO = (AdditionalServicesOfferVO) other;
        return this.id == additionalServicesOfferVO.id && Intrinsics.d(this.title, additionalServicesOfferVO.title) && Intrinsics.d(this.offers, additionalServicesOfferVO.offers) && this.theme == additionalServicesOfferVO.theme;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<OfferVO> getOffers() {
        return this.offers;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final AdditionalServicesOfferTheme getTheme() {
        return this.theme;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.theme.hashCode() + g.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.offers);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        List<OfferVO> list = this.offers;
        AdditionalServicesOfferTheme additionalServicesOfferTheme = this.theme;
        StringBuilder c11 = C2639a.c("AdditionalServicesOfferVO(id=", j11, ", title=", textAtom);
        c11.append(", offers=");
        c11.append(list);
        c11.append(", theme=");
        c11.append(additionalServicesOfferTheme);
        c11.append(")");
        return c11.toString();
    }
}
