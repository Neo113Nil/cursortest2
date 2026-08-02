package ru.ozon.app.android.search.widgets.history.search.presentation;

import A00.a;
import Am.C2438a;
import B0.C2454a;
import G.g;
import J0.P;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.ui.tooltip.TooltipVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u000289BY\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016Jp\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b\u0010\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LA00/a$J$a;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "deleteButton", "", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "historyItems", "", "asyncData", "", "isAllList", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings;", "presentationSettings", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$Onboarding;", "onboarding", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Ljava/lang/String;ZLru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings;Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$Onboarding;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;Ljava/lang/String;ZLru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings;Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$Onboarding;)Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/util/List;", "getHistoryItems", "()Ljava/util/List;", "Ljava/lang/String;", "getAsyncData", "Z", "()Z", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings;", "getPresentationSettings", "()Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$Onboarding;", "getOnboarding", "()Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$Onboarding;", "PresentationSettings", "Onboarding", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HistoryVO implements c, a.J.InterfaceC0007a {
    private final String asyncData;
    private final ButtonV3DTO deleteButton;

    @NotNull
    private final List<HistoryItem> historyItems;
    private final long id;
    private final boolean isAllList;
    private final Onboarding onboarding;
    private final PresentationSettings presentationSettings;
    private final TextDTO title;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$Onboarding;", "", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;", "tooltip", "", "onboardingId", "", "onboardingDelay", "<init>", "(Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;", "getTooltip", "()Lru/ozon/app/android/storefront/ui/tooltip/TooltipVO;", "Ljava/lang/String;", "getOnboardingId", "Ljava/lang/Integer;", "getOnboardingDelay", "()Ljava/lang/Integer;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Onboarding {
        private final Integer onboardingDelay;

        @NotNull
        private final String onboardingId;

        @NotNull
        private final TooltipVO tooltip;

        public Onboarding(@NotNull TooltipVO tooltip, @NotNull String onboardingId, Integer num) {
            Intrinsics.checkNotNullParameter(tooltip, "tooltip");
            Intrinsics.checkNotNullParameter(onboardingId, "onboardingId");
            this.tooltip = tooltip;
            this.onboardingId = onboardingId;
            this.onboardingDelay = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) other;
            return Intrinsics.d(this.tooltip, onboarding.tooltip) && Intrinsics.d(this.onboardingId, onboarding.onboardingId) && Intrinsics.d(this.onboardingDelay, onboarding.onboardingDelay);
        }

        public final Integer getOnboardingDelay() {
            return this.onboardingDelay;
        }

        @NotNull
        public final TooltipVO getTooltip() {
            return this.tooltip;
        }

        public int hashCode() {
            int a11 = g.a(this.tooltip.hashCode() * 31, 31, this.onboardingId);
            Integer num = this.onboardingDelay;
            return a11 + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            TooltipVO tooltipVO = this.tooltip;
            String str = this.onboardingId;
            Integer num = this.onboardingDelay;
            StringBuilder sb2 = new StringBuilder("Onboarding(tooltip=");
            sb2.append(tooltipVO);
            sb2.append(", onboardingId=");
            sb2.append(str);
            sb2.append(", onboardingDelay=");
            return Ep.a.c(sb2, num, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings;", "", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "showMoreButton", "", "hasMoreItems", "", "collapsedMaxRows", "lastItemMinWidth", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings$HistoryPaddings;", "historyPaddings", "<init>", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;ZIILru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings$HistoryPaddings;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "getShowMoreButton", "()Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "Z", "getHasMoreItems", "()Z", "I", "getCollapsedMaxRows", "getLastItemMinWidth", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings$HistoryPaddings;", "getHistoryPaddings", "()Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings$HistoryPaddings;", "HistoryPaddings", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PresentationSettings {
        private final int collapsedMaxRows;
        private final boolean hasMoreItems;

        @NotNull
        private final HistoryPaddings historyPaddings;
        private final int lastItemMinWidth;
        private final HistoryItem showMoreButton;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO$PresentationSettings$HistoryPaddings;", "", "", "paddingTop", "paddingRight", "paddingBottom", "paddingLeft", "rowGap", "columnGap", "<init>", "(IIIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPaddingTop", "getPaddingRight", "getPaddingBottom", "getPaddingLeft", "getRowGap", "getColumnGap", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HistoryPaddings {
            private final int columnGap;
            private final int paddingBottom;
            private final int paddingLeft;
            private final int paddingRight;
            private final int paddingTop;
            private final int rowGap;

            public HistoryPaddings(int i11, int i12, int i13, int i14, int i15, int i16) {
                this.paddingTop = i11;
                this.paddingRight = i12;
                this.paddingBottom = i13;
                this.paddingLeft = i14;
                this.rowGap = i15;
                this.columnGap = i16;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HistoryPaddings)) {
                    return false;
                }
                HistoryPaddings historyPaddings = (HistoryPaddings) other;
                return this.paddingTop == historyPaddings.paddingTop && this.paddingRight == historyPaddings.paddingRight && this.paddingBottom == historyPaddings.paddingBottom && this.paddingLeft == historyPaddings.paddingLeft && this.rowGap == historyPaddings.rowGap && this.columnGap == historyPaddings.columnGap;
            }

            public final int getColumnGap() {
                return this.columnGap;
            }

            public final int getPaddingBottom() {
                return this.paddingBottom;
            }

            public final int getPaddingLeft() {
                return this.paddingLeft;
            }

            public final int getPaddingRight() {
                return this.paddingRight;
            }

            public final int getRowGap() {
                return this.rowGap;
            }

            public int hashCode() {
                return Integer.hashCode(this.columnGap) + C2454a.a(this.rowGap, C2454a.a(this.paddingLeft, C2454a.a(this.paddingBottom, C2454a.a(this.paddingRight, Integer.hashCode(this.paddingTop) * 31, 31), 31), 31), 31);
            }

            @NotNull
            public String toString() {
                int i11 = this.paddingTop;
                int i12 = this.paddingRight;
                int i13 = this.paddingBottom;
                int i14 = this.paddingLeft;
                int i15 = this.rowGap;
                int i16 = this.columnGap;
                StringBuilder a11 = C2438a.a("HistoryPaddings(paddingTop=", i11, ", paddingRight=", ", paddingBottom=", i12);
                Ek.a.f(i13, i14, ", paddingLeft=", ", rowGap=", a11);
                return P.a(i15, i16, ", columnGap=", ")", a11);
            }
        }

        public PresentationSettings(HistoryItem historyItem, boolean z11, int i11, int i12, @NotNull HistoryPaddings historyPaddings) {
            Intrinsics.checkNotNullParameter(historyPaddings, "historyPaddings");
            this.showMoreButton = historyItem;
            this.hasMoreItems = z11;
            this.collapsedMaxRows = i11;
            this.lastItemMinWidth = i12;
            this.historyPaddings = historyPaddings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PresentationSettings)) {
                return false;
            }
            PresentationSettings presentationSettings = (PresentationSettings) other;
            return Intrinsics.d(this.showMoreButton, presentationSettings.showMoreButton) && this.hasMoreItems == presentationSettings.hasMoreItems && this.collapsedMaxRows == presentationSettings.collapsedMaxRows && this.lastItemMinWidth == presentationSettings.lastItemMinWidth && Intrinsics.d(this.historyPaddings, presentationSettings.historyPaddings);
        }

        public final int getCollapsedMaxRows() {
            return this.collapsedMaxRows;
        }

        public final boolean getHasMoreItems() {
            return this.hasMoreItems;
        }

        @NotNull
        public final HistoryPaddings getHistoryPaddings() {
            return this.historyPaddings;
        }

        public final int getLastItemMinWidth() {
            return this.lastItemMinWidth;
        }

        public final HistoryItem getShowMoreButton() {
            return this.showMoreButton;
        }

        public int hashCode() {
            HistoryItem historyItem = this.showMoreButton;
            return this.historyPaddings.hashCode() + C2454a.a(this.lastItemMinWidth, C2454a.a(this.collapsedMaxRows, C3532b.a((historyItem == null ? 0 : historyItem.hashCode()) * 31, 31, this.hasMoreItems), 31), 31);
        }

        @NotNull
        public String toString() {
            HistoryItem historyItem = this.showMoreButton;
            boolean z11 = this.hasMoreItems;
            int i11 = this.collapsedMaxRows;
            int i12 = this.lastItemMinWidth;
            HistoryPaddings historyPaddings = this.historyPaddings;
            StringBuilder sb2 = new StringBuilder("PresentationSettings(showMoreButton=");
            sb2.append(historyItem);
            sb2.append(", hasMoreItems=");
            sb2.append(z11);
            sb2.append(", collapsedMaxRows=");
            Ek.a.f(i11, i12, ", lastItemMinWidth=", ", historyPaddings=", sb2);
            sb2.append(historyPaddings);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryVO(long j11, TextDTO textDTO, ButtonV3DTO buttonV3DTO, @NotNull List<? extends HistoryItem> historyItems, String str, boolean z11, PresentationSettings presentationSettings, Onboarding onboarding) {
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        this.id = j11;
        this.title = textDTO;
        this.deleteButton = buttonV3DTO;
        this.historyItems = historyItems;
        this.asyncData = str;
        this.isAllList = z11;
        this.presentationSettings = presentationSettings;
        this.onboarding = onboarding;
    }

    public static /* synthetic */ HistoryVO copy$default(HistoryVO historyVO, long j11, TextDTO textDTO, ButtonV3DTO buttonV3DTO, List list, String str, boolean z11, PresentationSettings presentationSettings, Onboarding onboarding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = historyVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textDTO = historyVO.title;
        }
        TextDTO textDTO2 = textDTO;
        if ((i11 & 4) != 0) {
            buttonV3DTO = historyVO.deleteButton;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        if ((i11 & 8) != 0) {
            list = historyVO.historyItems;
        }
        return historyVO.copy(j12, textDTO2, buttonV3DTO2, list, (i11 & 16) != 0 ? historyVO.asyncData : str, (i11 & 32) != 0 ? historyVO.isAllList : z11, (i11 & 64) != 0 ? historyVO.presentationSettings : presentationSettings, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? historyVO.onboarding : onboarding);
    }

    @NotNull
    public final HistoryVO copy(long id2, TextDTO title, ButtonV3DTO deleteButton, @NotNull List<? extends HistoryItem> historyItems, String asyncData, boolean isAllList, PresentationSettings presentationSettings, Onboarding onboarding) {
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        return new HistoryVO(id2, title, deleteButton, historyItems, asyncData, isAllList, presentationSettings, onboarding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryVO)) {
            return false;
        }
        HistoryVO historyVO = (HistoryVO) other;
        return this.id == historyVO.id && Intrinsics.d(this.title, historyVO.title) && Intrinsics.d(this.deleteButton, historyVO.deleteButton) && Intrinsics.d(this.historyItems, historyVO.historyItems) && Intrinsics.d(this.asyncData, historyVO.asyncData) && this.isAllList == historyVO.isAllList && Intrinsics.d(this.presentationSettings, historyVO.presentationSettings) && Intrinsics.d(this.onboarding, historyVO.onboarding);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    public final ButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    @NotNull
    public final List<HistoryItem> getHistoryItems() {
        return this.historyItems;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    public final PresentationSettings getPresentationSettings() {
        return this.presentationSettings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.deleteButton;
        int b11 = g.b((hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31, this.historyItems);
        String str = this.asyncData;
        int a11 = C3532b.a((b11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isAllList);
        PresentationSettings presentationSettings = this.presentationSettings;
        int hashCode3 = (a11 + (presentationSettings == null ? 0 : presentationSettings.hashCode())) * 31;
        Onboarding onboarding = this.onboarding;
        return hashCode3 + (onboarding != null ? onboarding.hashCode() : 0);
    }

    /* renamed from: isAllList, reason: from getter */
    public final boolean getIsAllList() {
        return this.isAllList;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        ButtonV3DTO buttonV3DTO = this.deleteButton;
        List<HistoryItem> list = this.historyItems;
        String str = this.asyncData;
        boolean z11 = this.isAllList;
        PresentationSettings presentationSettings = this.presentationSettings;
        Onboarding onboarding = this.onboarding;
        StringBuilder b11 = TY.a.b("HistoryVO(id=", j11, ", title=", textDTO);
        b11.append(", deleteButton=");
        b11.append(buttonV3DTO);
        b11.append(", historyItems=");
        b11.append(list);
        D40.a.g(", asyncData=", str, ", isAllList=", b11, z11);
        b11.append(", presentationSettings=");
        b11.append(presentationSettings);
        b11.append(", onboarding=");
        b11.append(onboarding);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ HistoryVO(long j11, TextDTO textDTO, ButtonV3DTO buttonV3DTO, List list, String str, boolean z11, PresentationSettings presentationSettings, Onboarding onboarding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, textDTO, buttonV3DTO, list, str, (i11 & 32) != 0 ? false : z11, presentationSettings, onboarding);
    }
}
