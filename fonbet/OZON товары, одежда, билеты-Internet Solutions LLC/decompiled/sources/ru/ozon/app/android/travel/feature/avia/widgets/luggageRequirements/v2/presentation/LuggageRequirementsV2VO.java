package ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.presentation;

import An.C2439a;
import B90.C2619v;
import Bl.C2639a;
import Cm.e;
import D3.h;
import Ve.C4636t5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002 !B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO$TabVO;", DynamicElementDTO.TABS, "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "TabVO", "CompanyRequirementsVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LuggageRequirementsV2VO implements c {
    private final long id;

    @NotNull
    private final List<TabVO> tabs;
    private final TextAtom title;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b\r\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO$CompanyRequirementsVO;", "", "", "id", "", "iconUrl", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "companyName", "handCarryTitle", "handCarryText", "luggageTitle", "luggageText", "", "isSeparatorVisible", "<init>", "(ILjava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getIconUrl", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCompanyName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHandCarryTitle", "getHandCarryText", "getLuggageTitle", "getLuggageText", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CompanyRequirementsVO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom companyName;
        private final TextAtom handCarryText;
        private final TextAtom handCarryTitle;
        private final String iconUrl;
        private final int id;
        private final boolean isSeparatorVisible;
        private final TextAtom luggageText;
        private final TextAtom luggageTitle;

        public CompanyRequirementsVO(int i11, String str, @NotNull TextAtom companyName, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, TextAtom textAtom4, boolean z11) {
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            this.id = i11;
            this.iconUrl = str;
            this.companyName = companyName;
            this.handCarryTitle = textAtom;
            this.handCarryText = textAtom2;
            this.luggageTitle = textAtom3;
            this.luggageText = textAtom4;
            this.isSeparatorVisible = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompanyRequirementsVO)) {
                return false;
            }
            CompanyRequirementsVO companyRequirementsVO = (CompanyRequirementsVO) other;
            return this.id == companyRequirementsVO.id && Intrinsics.d(this.iconUrl, companyRequirementsVO.iconUrl) && Intrinsics.d(this.companyName, companyRequirementsVO.companyName) && Intrinsics.d(this.handCarryTitle, companyRequirementsVO.handCarryTitle) && Intrinsics.d(this.handCarryText, companyRequirementsVO.handCarryText) && Intrinsics.d(this.luggageTitle, companyRequirementsVO.luggageTitle) && Intrinsics.d(this.luggageText, companyRequirementsVO.luggageText) && this.isSeparatorVisible == companyRequirementsVO.isSeparatorVisible;
        }

        @NotNull
        public final TextAtom getCompanyName() {
            return this.companyName;
        }

        public final TextAtom getHandCarryText() {
            return this.handCarryText;
        }

        public final TextAtom getHandCarryTitle() {
            return this.handCarryTitle;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final int getId() {
            return this.id;
        }

        public final TextAtom getLuggageText() {
            return this.luggageText;
        }

        public final TextAtom getLuggageTitle() {
            return this.luggageTitle;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            String str = this.iconUrl;
            int b11 = C2619v.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.companyName);
            TextAtom textAtom = this.handCarryTitle;
            int hashCode2 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            TextAtom textAtom2 = this.handCarryText;
            int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            TextAtom textAtom3 = this.luggageTitle;
            int hashCode4 = (hashCode3 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31;
            TextAtom textAtom4 = this.luggageText;
            return Boolean.hashCode(this.isSeparatorVisible) + ((hashCode4 + (textAtom4 != null ? textAtom4.hashCode() : 0)) * 31);
        }

        /* renamed from: isSeparatorVisible, reason: from getter */
        public final boolean getIsSeparatorVisible() {
            return this.isSeparatorVisible;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            String str = this.iconUrl;
            TextAtom textAtom = this.companyName;
            TextAtom textAtom2 = this.handCarryTitle;
            TextAtom textAtom3 = this.handCarryText;
            TextAtom textAtom4 = this.luggageTitle;
            TextAtom textAtom5 = this.luggageText;
            boolean z11 = this.isSeparatorVisible;
            StringBuilder g10 = e.g(i11, "CompanyRequirementsVO(id=", ", iconUrl=", str, ", companyName=");
            C4636t5.c(", handCarryTitle=", ", handCarryText=", g10, textAtom, textAtom2);
            C4636t5.c(", luggageTitle=", ", luggageText=", g10, textAtom3, textAtom4);
            g10.append(textAtom5);
            g10.append(", isSeparatorVisible=");
            g10.append(z11);
            g10.append(")");
            return g10.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO$TabVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO$CompanyRequirementsVO;", "requirements", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getRequirements", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabVO {

        @NotNull
        private final List<CompanyRequirementsVO> requirements;

        @NotNull
        private final String title;

        public TabVO(@NotNull String title, @NotNull List<CompanyRequirementsVO> requirements) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(requirements, "requirements");
            this.title = title;
            this.requirements = requirements;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabVO)) {
                return false;
            }
            TabVO tabVO = (TabVO) other;
            return Intrinsics.d(this.title, tabVO.title) && Intrinsics.d(this.requirements, tabVO.requirements);
        }

        @NotNull
        public final List<CompanyRequirementsVO> getRequirements() {
            return this.requirements;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.requirements.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("TabVO(title=", this.title, ", requirements=", ")", this.requirements);
        }
    }

    public LuggageRequirementsV2VO(long j11, TextAtom textAtom, @NotNull List<TabVO> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.title = textAtom;
        this.tabs = tabs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LuggageRequirementsV2VO)) {
            return false;
        }
        LuggageRequirementsV2VO luggageRequirementsV2VO = (LuggageRequirementsV2VO) other;
        return this.id == luggageRequirementsV2VO.id && Intrinsics.d(this.title, luggageRequirementsV2VO.title) && Intrinsics.d(this.tabs, luggageRequirementsV2VO.tabs);
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
    public final List<TabVO> getTabs() {
        return this.tabs;
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
        return this.tabs.hashCode() + ((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        return h.c(C2639a.c("LuggageRequirementsV2VO(id=", j11, ", title=", textAtom), ", tabs=", this.tabs, ")");
    }
}
