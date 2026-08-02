package ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.presentation;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import Pk0.a;
import Tz.C4055a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001#B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO;", DynamicElementDTO.TABS, "", "selectedPosition", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "I", "getSelectedPosition", "TabVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReturnPolicyVO implements c {
    private final long id;
    private final int selectedPosition;

    @NotNull
    private final List<TabVO> tabs;

    @NotNull
    private final TextAtom title;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO$ReturnPolicyItemVO;", "returnPolicy", "", "isSelected", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO$ReturnPolicyItemVO;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO$ReturnPolicyItemVO;", "getReturnPolicy", "()Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO$ReturnPolicyItemVO;", "Z", "()Z", "setSelected", "(Z)V", "ReturnPolicyItemVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabVO {
        private boolean isSelected;

        @NotNull
        private final ReturnPolicyItemVO returnPolicy;

        @NotNull
        private final String title;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO$TabVO$ReturnPolicyItemVO;", "", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "accentPlaq", "", "icon", "route", "policyText", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAccentPlaq", "()Ljava/util/List;", "Ljava/lang/String;", "getIcon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRoute", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPolicyText", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReturnPolicyItemVO {
            private final List<TextAtom> accentPlaq;
            private final String icon;

            @NotNull
            private final List<TextAtom> policyText;
            private final TextAtom route;

            public ReturnPolicyItemVO(List<TextAtom> list, String str, TextAtom textAtom, @NotNull List<TextAtom> policyText) {
                Intrinsics.checkNotNullParameter(policyText, "policyText");
                this.accentPlaq = list;
                this.icon = str;
                this.route = textAtom;
                this.policyText = policyText;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReturnPolicyItemVO)) {
                    return false;
                }
                ReturnPolicyItemVO returnPolicyItemVO = (ReturnPolicyItemVO) other;
                return Intrinsics.d(this.accentPlaq, returnPolicyItemVO.accentPlaq) && Intrinsics.d(this.icon, returnPolicyItemVO.icon) && Intrinsics.d(this.route, returnPolicyItemVO.route) && Intrinsics.d(this.policyText, returnPolicyItemVO.policyText);
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
                StringBuilder a11 = C4055a.a("ReturnPolicyItemVO(accentPlaq=", ", icon=", str, ", route=", list);
                a11.append(textAtom);
                a11.append(", policyText=");
                a11.append(list2);
                a11.append(")");
                return a11.toString();
            }
        }

        public TabVO(@NotNull String title, @NotNull ReturnPolicyItemVO returnPolicy, boolean z11) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(returnPolicy, "returnPolicy");
            this.title = title;
            this.returnPolicy = returnPolicy;
            this.isSelected = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabVO)) {
                return false;
            }
            TabVO tabVO = (TabVO) other;
            return Intrinsics.d(this.title, tabVO.title) && Intrinsics.d(this.returnPolicy, tabVO.returnPolicy) && this.isSelected == tabVO.isSelected;
        }

        @NotNull
        public final ReturnPolicyItemVO getReturnPolicy() {
            return this.returnPolicy;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected) + ((this.returnPolicy.hashCode() + (this.title.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            ReturnPolicyItemVO returnPolicyItemVO = this.returnPolicy;
            boolean z11 = this.isSelected;
            StringBuilder sb2 = new StringBuilder("TabVO(title=");
            sb2.append(str);
            sb2.append(", returnPolicy=");
            sb2.append(returnPolicyItemVO);
            sb2.append(", isSelected=");
            return a.a(")", sb2, z11);
        }
    }

    public ReturnPolicyVO(long j11, @NotNull TextAtom title, @NotNull List<TabVO> tabs, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.title = title;
        this.tabs = tabs;
        this.selectedPosition = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnPolicyVO)) {
            return false;
        }
        ReturnPolicyVO returnPolicyVO = (ReturnPolicyVO) other;
        return this.id == returnPolicyVO.id && Intrinsics.d(this.title, returnPolicyVO.title) && Intrinsics.d(this.tabs, returnPolicyVO.tabs) && this.selectedPosition == returnPolicyVO.selectedPosition;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    @NotNull
    public final List<TabVO> getTabs() {
        return this.tabs;
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
        return Integer.hashCode(this.selectedPosition) + g.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.tabs);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        List<TabVO> list = this.tabs;
        int i11 = this.selectedPosition;
        StringBuilder c11 = C2639a.c("ReturnPolicyVO(id=", j11, ", title=", textAtom);
        c11.append(", tabs=");
        c11.append(list);
        c11.append(", selectedPosition=");
        c11.append(i11);
        c11.append(")");
        return c11.toString();
    }
}
