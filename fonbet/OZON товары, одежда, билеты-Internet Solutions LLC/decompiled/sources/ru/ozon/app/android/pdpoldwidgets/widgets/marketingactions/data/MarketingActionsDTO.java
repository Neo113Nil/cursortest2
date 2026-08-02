package ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.data;

import C.o0;
import G.g;
import H3.c;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/data/MarketingActionsDTO;", "", "actions", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/data/MarketingActionsDTO$Action;", "<init>", "(Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Action", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MarketingActionsDTO {

    @NotNull
    private final List<Action> actions;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/data/MarketingActionsDTO$Action;", "", "color", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "deeplinkTitle", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "getTitle", "getSubTitle", "getDeeplinkTitle", "getDeeplink", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action {
        private final String color;
        private final String deeplink;
        private final String deeplinkTitle;
        private final String subTitle;

        @NotNull
        private final String title;

        public Action(String str, @NotNull String title, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.color = str;
            this.title = title;
            this.subTitle = str2;
            this.deeplinkTitle = str3;
            this.deeplink = str4;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = action.color;
            }
            if ((i11 & 2) != 0) {
                str2 = action.title;
            }
            if ((i11 & 4) != 0) {
                str3 = action.subTitle;
            }
            if ((i11 & 8) != 0) {
                str4 = action.deeplinkTitle;
            }
            if ((i11 & 16) != 0) {
                str5 = action.deeplink;
            }
            String str6 = str5;
            String str7 = str3;
            return action.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubTitle() {
            return this.subTitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDeeplinkTitle() {
            return this.deeplinkTitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final Action copy(String color, @NotNull String title, String subTitle, String deeplinkTitle, String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Action(color, title, subTitle, deeplinkTitle, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return Intrinsics.d(this.color, action.color) && Intrinsics.d(this.title, action.title) && Intrinsics.d(this.subTitle, action.subTitle) && Intrinsics.d(this.deeplinkTitle, action.deeplinkTitle) && Intrinsics.d(this.deeplink, action.deeplink);
        }

        public final String getColor() {
            return this.color;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getDeeplinkTitle() {
            return this.deeplinkTitle;
        }

        public final String getSubTitle() {
            return this.subTitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.color;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
            String str2 = this.subTitle;
            int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.deeplinkTitle;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deeplink;
            return hashCode2 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.color;
            String str2 = this.title;
            String str3 = this.subTitle;
            String str4 = this.deeplinkTitle;
            String str5 = this.deeplink;
            StringBuilder d11 = C3660k.d("Action(color=", str, ", title=", str2, ", subTitle=");
            a.h(d11, str3, ", deeplinkTitle=", str4, ", deeplink=");
            return o0.c(d11, str5, ")");
        }
    }

    public MarketingActionsDTO(@NotNull List<Action> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.actions = actions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketingActionsDTO copy$default(MarketingActionsDTO marketingActionsDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = marketingActionsDTO.actions;
        }
        return marketingActionsDTO.copy(list);
    }

    @NotNull
    public final List<Action> component1() {
        return this.actions;
    }

    @NotNull
    public final MarketingActionsDTO copy(@NotNull List<Action> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new MarketingActionsDTO(actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarketingActionsDTO) && Intrinsics.d(this.actions, ((MarketingActionsDTO) other).actions);
    }

    @NotNull
    public final List<Action> getActions() {
        return this.actions;
    }

    public int hashCode() {
        return this.actions.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("MarketingActionsDTO(actions=", ")", this.actions);
    }
}
