package ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation;

import B0.C2454a;
import Ds.C2880a;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u001fB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/o;", "", "id", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO$ActionItem;", "actions", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "widgetName", "Ljava/lang/String;", "getWidgetName", "ActionItem", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MarketingActionsVO implements c, o {

    @NotNull
    private final List<ActionItem> actions;
    private final long id;

    @NotNull
    private final String widgetName;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\b\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\n\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO$ActionItem;", "", "", "isShowColor", "", "color", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "isShowSubTitle", "subTitle", "isShowLink", "deeplinkTitle", "deeplink", "<init>", "(ZILjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "I", "getColor", "Ljava/lang/String;", "getTitle", "getSubTitle", "getDeeplinkTitle", "getDeeplink", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionItem {
        private final int color;

        @NotNull
        private final String deeplink;

        @NotNull
        private final String deeplinkTitle;
        private final boolean isShowColor;
        private final boolean isShowLink;
        private final boolean isShowSubTitle;

        @NotNull
        private final String subTitle;

        @NotNull
        private final String title;

        public ActionItem(boolean z11, int i11, @NotNull String title, boolean z12, @NotNull String subTitle, boolean z13, @NotNull String deeplinkTitle, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subTitle, "subTitle");
            Intrinsics.checkNotNullParameter(deeplinkTitle, "deeplinkTitle");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.isShowColor = z11;
            this.color = i11;
            this.title = title;
            this.isShowSubTitle = z12;
            this.subTitle = subTitle;
            this.isShowLink = z13;
            this.deeplinkTitle = deeplinkTitle;
            this.deeplink = deeplink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionItem)) {
                return false;
            }
            ActionItem actionItem = (ActionItem) other;
            return this.isShowColor == actionItem.isShowColor && this.color == actionItem.color && Intrinsics.d(this.title, actionItem.title) && this.isShowSubTitle == actionItem.isShowSubTitle && Intrinsics.d(this.subTitle, actionItem.subTitle) && this.isShowLink == actionItem.isShowLink && Intrinsics.d(this.deeplinkTitle, actionItem.deeplinkTitle) && Intrinsics.d(this.deeplink, actionItem.deeplink);
        }

        public final int getColor() {
            return this.color;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getDeeplinkTitle() {
            return this.deeplinkTitle;
        }

        @NotNull
        public final String getSubTitle() {
            return this.subTitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + g.a(C3532b.a(g.a(C3532b.a(g.a(C2454a.a(this.color, Boolean.hashCode(this.isShowColor) * 31, 31), 31, this.title), 31, this.isShowSubTitle), 31, this.subTitle), 31, this.isShowLink), 31, this.deeplinkTitle);
        }

        /* renamed from: isShowColor, reason: from getter */
        public final boolean getIsShowColor() {
            return this.isShowColor;
        }

        /* renamed from: isShowLink, reason: from getter */
        public final boolean getIsShowLink() {
            return this.isShowLink;
        }

        /* renamed from: isShowSubTitle, reason: from getter */
        public final boolean getIsShowSubTitle() {
            return this.isShowSubTitle;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isShowColor;
            int i11 = this.color;
            String str = this.title;
            boolean z12 = this.isShowSubTitle;
            String str2 = this.subTitle;
            boolean z13 = this.isShowLink;
            String str3 = this.deeplinkTitle;
            String str4 = this.deeplink;
            StringBuilder sb2 = new StringBuilder("ActionItem(isShowColor=");
            sb2.append(z11);
            sb2.append(", color=");
            sb2.append(i11);
            sb2.append(", title=");
            C2880a.c(str, ", isShowSubTitle=", ", subTitle=", sb2, z12);
            C2880a.c(str2, ", isShowLink=", ", deeplinkTitle=", sb2, z13);
            return C3173b.c(sb2, str3, ", deeplink=", str4, ")");
        }
    }

    public MarketingActionsVO(long j11, @NotNull List<ActionItem> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.id = j11;
        this.actions = actions;
        this.widgetName = "marketing_actions";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketingActionsVO)) {
            return false;
        }
        MarketingActionsVO marketingActionsVO = (MarketingActionsVO) other;
        return this.id == marketingActionsVO.id && Intrinsics.d(this.actions, marketingActionsVO.actions);
    }

    @NotNull
    public final List<ActionItem> getActions() {
        return this.actions;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        return this.actions.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.id, "MarketingActionsVO(id=", ", actions=", this.actions);
        b11.append(")");
        return b11.toString();
    }
}
