package ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain;

import Bl.C2639a;
import Bl.b;
import C.o0;
import G.g;
import J0.P;
import N3.C3660k;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem;", "premiumPointItems", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getPremiumPointItems", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "PremiumPointsItem", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PremiumPointsTrainV2MultipleVO implements c {
    private final long id;

    @NotNull
    private final List<PremiumPointsItem> premiumPointItems;
    private final TextAtom title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem;", "", "<init>", "()V", "HeadCarriage", "TailCarriage", "SignItem", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$HeadCarriage;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$SignItem;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$TailCarriage;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PremiumPointsItem {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$HeadCarriage;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "icon", "iconTint", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getIcon", "getIconTint", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HeadCarriage extends PremiumPointsItem {
            public static final int $stable = AtomAction.$stable | TextAtom.$stable;
            private final AtomAction action;
            private final String icon;
            private final String iconTint;

            @NotNull
            private final TextAtom title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HeadCarriage(@NotNull TextAtom title, String str, String str2, AtomAction atomAction) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.icon = str;
                this.iconTint = str2;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HeadCarriage)) {
                    return false;
                }
                HeadCarriage headCarriage = (HeadCarriage) other;
                return Intrinsics.d(this.title, headCarriage.title) && Intrinsics.d(this.icon, headCarriage.icon) && Intrinsics.d(this.iconTint, headCarriage.iconTint) && Intrinsics.d(this.action, headCarriage.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            public final String getIcon() {
                return this.icon;
            }

            public final String getIconTint() {
                return this.iconTint;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.icon;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.iconTint;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                AtomAction atomAction = this.action;
                return hashCode3 + (atomAction != null ? atomAction.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.title;
                String str = this.icon;
                String str2 = this.iconTint;
                AtomAction atomAction = this.action;
                StringBuilder d11 = b.d("HeadCarriage(title=", ", icon=", str, ", iconTint=", textAtom);
                d11.append(str2);
                d11.append(", action=");
                d11.append(atomAction);
                d11.append(")");
                return d11.toString();
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$SignItem;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem;", "", "signIcon", "", "signSize", "signIconTint", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSignIcon", "Ljava/lang/Integer;", "getSignSize", "()Ljava/lang/Integer;", "getSignIconTint", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SignItem extends PremiumPointsItem {

            @NotNull
            private final String signIcon;
            private final String signIconTint;
            private final Integer signSize;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignItem(@NotNull String signIcon, Integer num, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(signIcon, "signIcon");
                this.signIcon = signIcon;
                this.signSize = num;
                this.signIconTint = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SignItem)) {
                    return false;
                }
                SignItem signItem = (SignItem) other;
                return Intrinsics.d(this.signIcon, signItem.signIcon) && Intrinsics.d(this.signSize, signItem.signSize) && Intrinsics.d(this.signIconTint, signItem.signIconTint);
            }

            @NotNull
            public final String getSignIcon() {
                return this.signIcon;
            }

            public final String getSignIconTint() {
                return this.signIconTint;
            }

            public final Integer getSignSize() {
                return this.signSize;
            }

            public int hashCode() {
                int hashCode = this.signIcon.hashCode() * 31;
                Integer num = this.signSize;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.signIconTint;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.signIcon;
                Integer num = this.signSize;
                return o0.c(P.b("SignItem(signIcon=", str, num, ", signSize=", ", signIconTint="), this.signIconTint, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$TailCarriage;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleTintColor", "points", "pointsIcon", "pointsTintColor", "statusIcon", "statusIconTint", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitleTintColor", "getPoints", "getPointsIcon", "getPointsTintColor", "getStatusIcon", "getStatusIconTint", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TailCarriage extends PremiumPointsItem {
            public static final int $stable = AtomAction.$stable;
            private final AtomAction action;
            private final String points;
            private final String pointsIcon;
            private final String pointsTintColor;
            private final String statusIcon;
            private final String statusIconTint;

            @NotNull
            private final String title;
            private final String titleTintColor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TailCarriage(@NotNull String title, String str, String str2, String str3, String str4, String str5, String str6, AtomAction atomAction) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.titleTintColor = str;
                this.points = str2;
                this.pointsIcon = str3;
                this.pointsTintColor = str4;
                this.statusIcon = str5;
                this.statusIconTint = str6;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TailCarriage)) {
                    return false;
                }
                TailCarriage tailCarriage = (TailCarriage) other;
                return Intrinsics.d(this.title, tailCarriage.title) && Intrinsics.d(this.titleTintColor, tailCarriage.titleTintColor) && Intrinsics.d(this.points, tailCarriage.points) && Intrinsics.d(this.pointsIcon, tailCarriage.pointsIcon) && Intrinsics.d(this.pointsTintColor, tailCarriage.pointsTintColor) && Intrinsics.d(this.statusIcon, tailCarriage.statusIcon) && Intrinsics.d(this.statusIconTint, tailCarriage.statusIconTint) && Intrinsics.d(this.action, tailCarriage.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            public final String getPoints() {
                return this.points;
            }

            public final String getPointsIcon() {
                return this.pointsIcon;
            }

            public final String getPointsTintColor() {
                return this.pointsTintColor;
            }

            public final String getStatusIcon() {
                return this.statusIcon;
            }

            public final String getStatusIconTint() {
                return this.statusIconTint;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public final String getTitleTintColor() {
                return this.titleTintColor;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.titleTintColor;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.points;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.pointsIcon;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.pointsTintColor;
                int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.statusIcon;
                int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.statusIconTint;
                int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                AtomAction atomAction = this.action;
                return hashCode7 + (atomAction != null ? atomAction.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.title;
                String str2 = this.titleTintColor;
                String str3 = this.points;
                String str4 = this.pointsIcon;
                String str5 = this.pointsTintColor;
                String str6 = this.statusIcon;
                String str7 = this.statusIconTint;
                AtomAction atomAction = this.action;
                StringBuilder d11 = C3660k.d("TailCarriage(title=", str, ", titleTintColor=", str2, ", points=");
                a.h(d11, str3, ", pointsIcon=", str4, ", pointsTintColor=");
                a.h(d11, str5, ", statusIcon=", str6, ", statusIconTint=");
                d11.append(str7);
                d11.append(", action=");
                d11.append(atomAction);
                d11.append(")");
                return d11.toString();
            }
        }

        public /* synthetic */ PremiumPointsItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PremiumPointsItem() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PremiumPointsTrainV2MultipleVO(long j11, TextAtom textAtom, @NotNull List<? extends PremiumPointsItem> premiumPointItems, t tVar) {
        Intrinsics.checkNotNullParameter(premiumPointItems, "premiumPointItems");
        this.id = j11;
        this.title = textAtom;
        this.premiumPointItems = premiumPointItems;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PremiumPointsTrainV2MultipleVO)) {
            return false;
        }
        PremiumPointsTrainV2MultipleVO premiumPointsTrainV2MultipleVO = (PremiumPointsTrainV2MultipleVO) other;
        return this.id == premiumPointsTrainV2MultipleVO.id && Intrinsics.d(this.title, premiumPointsTrainV2MultipleVO.title) && Intrinsics.d(this.premiumPointItems, premiumPointsTrainV2MultipleVO.premiumPointItems) && Intrinsics.d(this.tokenizedEvent, premiumPointsTrainV2MultipleVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PremiumPointsItem> getPremiumPointItems() {
        return this.premiumPointItems;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.title;
        int b11 = g.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.premiumPointItems);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        List<PremiumPointsItem> list = this.premiumPointItems;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2639a.c("PremiumPointsTrainV2MultipleVO(id=", j11, ", title=", textAtom);
        Ak.b.h(c11, ", premiumPointItems=", list, ", tokenizedEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}
