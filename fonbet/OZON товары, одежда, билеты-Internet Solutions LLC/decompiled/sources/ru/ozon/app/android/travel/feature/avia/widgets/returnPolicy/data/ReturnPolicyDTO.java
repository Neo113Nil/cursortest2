package ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.data;

import D3.g;
import J.d;
import Tz.C4055a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTabs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TabDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReturnPolicyDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<TabDTO> tabs;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "returnPolicy", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO$ReturnPolicyItemDTO;", "isSelected", "", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO$ReturnPolicyItemDTO;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getReturnPolicy", "()Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO$ReturnPolicyItemDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO$ReturnPolicyItemDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO;", "equals", "other", "hashCode", "", "toString", "ReturnPolicyItemDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TabDTO {
        public static final int $stable = 8;
        private final Boolean isSelected;

        @NotNull
        private final ReturnPolicyItemDTO returnPolicy;

        @NotNull
        private final String title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/data/ReturnPolicyDTO$TabDTO$ReturnPolicyItemDTO;", "", "accentPlaq", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "", "route", "policyText", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getAccentPlaq", "()Ljava/util/List;", "getIcon", "()Ljava/lang/String;", "getRoute", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPolicyText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReturnPolicyItemDTO {
            public static final int $stable = 8;
            private final List<TextAtom> accentPlaq;
            private final String icon;

            @NotNull
            private final List<TextAtom> policyText;
            private final TextAtom route;

            public ReturnPolicyItemDTO(List<TextAtom> list, String str, TextAtom textAtom, @NotNull List<TextAtom> policyText) {
                Intrinsics.checkNotNullParameter(policyText, "policyText");
                this.accentPlaq = list;
                this.icon = str;
                this.route = textAtom;
                this.policyText = policyText;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ReturnPolicyItemDTO copy$default(ReturnPolicyItemDTO returnPolicyItemDTO, List list, String str, TextAtom textAtom, List list2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = returnPolicyItemDTO.accentPlaq;
                }
                if ((i11 & 2) != 0) {
                    str = returnPolicyItemDTO.icon;
                }
                if ((i11 & 4) != 0) {
                    textAtom = returnPolicyItemDTO.route;
                }
                if ((i11 & 8) != 0) {
                    list2 = returnPolicyItemDTO.policyText;
                }
                return returnPolicyItemDTO.copy(list, str, textAtom, list2);
            }

            public final List<TextAtom> component1() {
                return this.accentPlaq;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* renamed from: component3, reason: from getter */
            public final TextAtom getRoute() {
                return this.route;
            }

            @NotNull
            public final List<TextAtom> component4() {
                return this.policyText;
            }

            @NotNull
            public final ReturnPolicyItemDTO copy(List<TextAtom> accentPlaq, String icon, TextAtom route, @NotNull List<TextAtom> policyText) {
                Intrinsics.checkNotNullParameter(policyText, "policyText");
                return new ReturnPolicyItemDTO(accentPlaq, icon, route, policyText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReturnPolicyItemDTO)) {
                    return false;
                }
                ReturnPolicyItemDTO returnPolicyItemDTO = (ReturnPolicyItemDTO) other;
                return Intrinsics.d(this.accentPlaq, returnPolicyItemDTO.accentPlaq) && Intrinsics.d(this.icon, returnPolicyItemDTO.icon) && Intrinsics.d(this.route, returnPolicyItemDTO.route) && Intrinsics.d(this.policyText, returnPolicyItemDTO.policyText);
            }

            public final List<TextAtom> getAccentPlaq() {
                return this.accentPlaq;
            }

            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final List<TextAtom> getPolicyText() {
                return this.policyText;
            }

            public final TextAtom getRoute() {
                return this.route;
            }

            public int hashCode() {
                List<TextAtom> list = this.accentPlaq;
                int hashCode = (list == null ? 0 : list.hashCode()) * 31;
                String str = this.icon;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                TextAtom textAtom = this.route;
                return this.policyText.hashCode() + ((hashCode2 + (textAtom != null ? textAtom.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                List<TextAtom> list = this.accentPlaq;
                String str = this.icon;
                TextAtom textAtom = this.route;
                List<TextAtom> list2 = this.policyText;
                StringBuilder a11 = C4055a.a("ReturnPolicyItemDTO(accentPlaq=", ", icon=", str, ", route=", list);
                a11.append(textAtom);
                a11.append(", policyText=");
                a11.append(list2);
                a11.append(")");
                return a11.toString();
            }
        }

        public TabDTO(@NotNull String title, @NotNull ReturnPolicyItemDTO returnPolicy, Boolean bool) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(returnPolicy, "returnPolicy");
            this.title = title;
            this.returnPolicy = returnPolicy;
            this.isSelected = bool;
        }

        public static /* synthetic */ TabDTO copy$default(TabDTO tabDTO, String str, ReturnPolicyItemDTO returnPolicyItemDTO, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tabDTO.title;
            }
            if ((i11 & 2) != 0) {
                returnPolicyItemDTO = tabDTO.returnPolicy;
            }
            if ((i11 & 4) != 0) {
                bool = tabDTO.isSelected;
            }
            return tabDTO.copy(str, returnPolicyItemDTO, bool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ReturnPolicyItemDTO getReturnPolicy() {
            return this.returnPolicy;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public final TabDTO copy(@NotNull String title, @NotNull ReturnPolicyItemDTO returnPolicy, Boolean isSelected) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(returnPolicy, "returnPolicy");
            return new TabDTO(title, returnPolicy, isSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabDTO)) {
                return false;
            }
            TabDTO tabDTO = (TabDTO) other;
            return Intrinsics.d(this.title, tabDTO.title) && Intrinsics.d(this.returnPolicy, tabDTO.returnPolicy) && Intrinsics.d(this.isSelected, tabDTO.isSelected);
        }

        @NotNull
        public final ReturnPolicyItemDTO getReturnPolicy() {
            return this.returnPolicy;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = (this.returnPolicy.hashCode() + (this.title.hashCode() * 31)) * 31;
            Boolean bool = this.isSelected;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            ReturnPolicyItemDTO returnPolicyItemDTO = this.returnPolicy;
            Boolean bool = this.isSelected;
            StringBuilder sb2 = new StringBuilder("TabDTO(title=");
            sb2.append(str);
            sb2.append(", returnPolicy=");
            sb2.append(returnPolicyItemDTO);
            sb2.append(", isSelected=");
            return g.d(sb2, bool, ")");
        }
    }

    public ReturnPolicyDTO(@NotNull TextAtom title, @NotNull List<TabDTO> tabs) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.title = title;
        this.tabs = tabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnPolicyDTO copy$default(ReturnPolicyDTO returnPolicyDTO, TextAtom textAtom, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = returnPolicyDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = returnPolicyDTO.tabs;
        }
        return returnPolicyDTO.copy(textAtom, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<TabDTO> component2() {
        return this.tabs;
    }

    @NotNull
    public final ReturnPolicyDTO copy(@NotNull TextAtom title, @NotNull List<TabDTO> tabs) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new ReturnPolicyDTO(title, tabs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnPolicyDTO)) {
            return false;
        }
        ReturnPolicyDTO returnPolicyDTO = (ReturnPolicyDTO) other;
        return Intrinsics.d(this.title, returnPolicyDTO.title) && Intrinsics.d(this.tabs, returnPolicyDTO.tabs);
    }

    @NotNull
    public final List<TabDTO> getTabs() {
        return this.tabs;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.tabs.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return d.c("ReturnPolicyDTO(title=", this.title, ", tabs=", this.tabs, ")");
    }
}
