package ru.ozon.app.android.cart.marketingdetail.data;

import G.g;
import H3.c;
import I0.C3173b;
import N3.C3660k;
import Tl.b;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO;", "", "list", "", "Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO$Detail;", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Detail", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MarketingDetailDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Detail> list;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO$Detail;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "actions", "", "Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO$Detail$Action;", "total", "Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO$Detail$Total;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO$Detail$Total;)V", "getTitle", "()Ljava/lang/String;", "getActions", "()Ljava/util/List;", "getTotal", "()Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO$Detail$Total;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Action", "Total", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Detail {
        public static final int $stable = 8;

        @NotNull
        private final List<Action> actions;

        @NotNull
        private final String title;

        @NotNull
        private final Total total;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO$Detail$Action;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "description", "discountValueText", "discountValueSubtext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDescription", "getDiscountValueText", "getDiscountValueSubtext", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Action {
            public static final int $stable = 0;
            private final String description;
            private final String discountValueSubtext;

            @NotNull
            private final String discountValueText;

            @NotNull
            private final String name;

            public Action(@NotNull String name, String str, @NotNull String discountValueText, String str2) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(discountValueText, "discountValueText");
                this.name = name;
                this.description = str;
                this.discountValueText = discountValueText;
                this.discountValueSubtext = str2;
            }

            public static /* synthetic */ Action copy$default(Action action, String str, String str2, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = action.name;
                }
                if ((i11 & 2) != 0) {
                    str2 = action.description;
                }
                if ((i11 & 4) != 0) {
                    str3 = action.discountValueText;
                }
                if ((i11 & 8) != 0) {
                    str4 = action.discountValueSubtext;
                }
                return action.copy(str, str2, str3, str4);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getDiscountValueText() {
                return this.discountValueText;
            }

            /* renamed from: component4, reason: from getter */
            public final String getDiscountValueSubtext() {
                return this.discountValueSubtext;
            }

            @NotNull
            public final Action copy(@NotNull String name, String description, @NotNull String discountValueText, String discountValueSubtext) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(discountValueText, "discountValueText");
                return new Action(name, description, discountValueText, discountValueSubtext);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Action)) {
                    return false;
                }
                Action action = (Action) other;
                return Intrinsics.d(this.name, action.name) && Intrinsics.d(this.description, action.description) && Intrinsics.d(this.discountValueText, action.discountValueText) && Intrinsics.d(this.discountValueSubtext, action.discountValueSubtext);
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getDiscountValueSubtext() {
                return this.discountValueSubtext;
            }

            @NotNull
            public final String getDiscountValueText() {
                return this.discountValueText;
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.description;
                int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.discountValueText);
                String str2 = this.discountValueSubtext;
                return a11 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.name;
                String str2 = this.description;
                return C3173b.c(C3660k.d("Action(name=", str, ", description=", str2, ", discountValueText="), this.discountValueText, ", discountValueSubtext=", this.discountValueSubtext, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/data/MarketingDetailDTO$Detail$Total;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "priceText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getPriceText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Total {
            public static final int $stable = 0;

            @NotNull
            private final String priceText;

            @NotNull
            private final String title;

            public Total(@NotNull String title, @NotNull String priceText) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(priceText, "priceText");
                this.title = title;
                this.priceText = priceText;
            }

            public static /* synthetic */ Total copy$default(Total total, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = total.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = total.priceText;
                }
                return total.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getPriceText() {
                return this.priceText;
            }

            @NotNull
            public final Total copy(@NotNull String title, @NotNull String priceText) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(priceText, "priceText");
                return new Total(title, priceText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Total)) {
                    return false;
                }
                Total total = (Total) other;
                return Intrinsics.d(this.title, total.title) && Intrinsics.d(this.priceText, total.priceText);
            }

            @NotNull
            public final String getPriceText() {
                return this.priceText;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.priceText.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("Total(title=", this.title, ", priceText=", this.priceText, ")");
            }
        }

        public Detail(@NotNull String title, @NotNull List<Action> actions, @NotNull Total total) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(total, "total");
            this.title = title;
            this.actions = actions;
            this.total = total;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Detail copy$default(Detail detail, String str, List list, Total total, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = detail.title;
            }
            if ((i11 & 2) != 0) {
                list = detail.actions;
            }
            if ((i11 & 4) != 0) {
                total = detail.total;
            }
            return detail.copy(str, list, total);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<Action> component2() {
            return this.actions;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Total getTotal() {
            return this.total;
        }

        @NotNull
        public final Detail copy(@NotNull String title, @NotNull List<Action> actions, @NotNull Total total) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(total, "total");
            return new Detail(title, actions, total);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) other;
            return Intrinsics.d(this.title, detail.title) && Intrinsics.d(this.actions, detail.actions) && Intrinsics.d(this.total, detail.total);
        }

        @NotNull
        public final List<Action> getActions() {
            return this.actions;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Total getTotal() {
            return this.total;
        }

        public int hashCode() {
            return this.total.hashCode() + g.b(this.title.hashCode() * 31, 31, this.actions);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            List<Action> list = this.actions;
            Total total = this.total;
            StringBuilder f7 = b.f("Detail(title=", str, ", actions=", ", total=", list);
            f7.append(total);
            f7.append(")");
            return f7.toString();
        }
    }

    public MarketingDetailDTO(@NotNull List<Detail> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketingDetailDTO copy$default(MarketingDetailDTO marketingDetailDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = marketingDetailDTO.list;
        }
        return marketingDetailDTO.copy(list);
    }

    @NotNull
    public final List<Detail> component1() {
        return this.list;
    }

    @NotNull
    public final MarketingDetailDTO copy(@NotNull List<Detail> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new MarketingDetailDTO(list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarketingDetailDTO) && Intrinsics.d(this.list, ((MarketingDetailDTO) other).list);
    }

    @NotNull
    public final List<Detail> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("MarketingDetailDTO(list=", ")", this.list);
    }
}
