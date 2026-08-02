package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation;

import Ak.C2436a;
import Ak.b;
import B0.A0;
import B0.C2454a;
import D3.h;
import De.C2860c;
import G.g;
import Kk.C3532b;
import Nh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.OrderShipmentItemDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO;", "Ll20/c;", "<init>", "()V", "TitleVO", "TextVO", "StatusVO", "ShipmentActionsVO", "AnnotationVO", "PostingVO", "PostingItemVO", "StatusProviderVO", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$AnnotationVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$ShipmentActionsVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$StatusProviderVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$StatusVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$TextVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$TitleVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OrderShipmentItemVO implements c {

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b$\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b%\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$AnnotationVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO;", "", "id", "", "icon", "iconColor", "", "text", "textColor", "backgroundColor", "", "useBoldFont", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$AnnotationVO$AnnotationButton;", "buttons", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getIcon", "getIconColor", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "getTextColor", "getBackgroundColor", "Z", "getUseBoldFont", "()Z", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "AnnotationButton", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnnotationVO extends OrderShipmentItemVO {
        private final String backgroundColor;
        private final List<AnnotationButton> buttons;

        @NotNull
        private final String icon;

        @NotNull
        private final String iconColor;
        private final long id;

        @NotNull
        private final CharSequence text;
        private final String textColor;
        private final boolean useBoldFont;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$AnnotationVO$AnnotationButton;", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "button", "", "textColor", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Ljava/lang/String;", "getTextColor", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AnnotationButton {
            public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;

            @NotNull
            private final ButtonV3Atom.SmallBorderlessButton button;
            private final String textColor;

            public AnnotationButton(@NotNull ButtonV3Atom.SmallBorderlessButton button, String str) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
                this.textColor = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AnnotationButton)) {
                    return false;
                }
                AnnotationButton annotationButton = (AnnotationButton) other;
                return Intrinsics.d(this.button, annotationButton.button) && Intrinsics.d(this.textColor, annotationButton.textColor);
            }

            @NotNull
            public final ButtonV3Atom.SmallBorderlessButton getButton() {
                return this.button;
            }

            public final String getTextColor() {
                return this.textColor;
            }

            public int hashCode() {
                int hashCode = this.button.hashCode() * 31;
                String str = this.textColor;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "AnnotationButton(button=" + this.button + ", textColor=" + this.textColor + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnnotationVO(long j11, @NotNull String icon, @NotNull String iconColor, @NotNull CharSequence text, String str, String str2, boolean z11, List<AnnotationButton> list) {
            super(null);
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(iconColor, "iconColor");
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = j11;
            this.icon = icon;
            this.iconColor = iconColor;
            this.text = text;
            this.textColor = str;
            this.backgroundColor = str2;
            this.useBoldFont = z11;
            this.buttons = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnnotationVO)) {
                return false;
            }
            AnnotationVO annotationVO = (AnnotationVO) other;
            return this.id == annotationVO.id && Intrinsics.d(this.icon, annotationVO.icon) && Intrinsics.d(this.iconColor, annotationVO.iconColor) && Intrinsics.d(this.text, annotationVO.text) && Intrinsics.d(this.textColor, annotationVO.textColor) && Intrinsics.d(this.backgroundColor, annotationVO.backgroundColor) && this.useBoldFont == annotationVO.useBoldFont && Intrinsics.d(this.buttons, annotationVO.buttons);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final List<AnnotationButton> getButtons() {
            return this.buttons;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getIconColor() {
            return this.iconColor;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final CharSequence getText() {
            return this.text;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            int hashCode = (this.text.hashCode() + g.a(g.a(Long.hashCode(this.id) * 31, 31, this.icon), 31, this.iconColor)) * 31;
            String str = this.textColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int a11 = C3532b.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.useBoldFont);
            List<AnnotationButton> list = this.buttons;
            return a11 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.icon;
            String str2 = this.iconColor;
            CharSequence charSequence = this.text;
            String str3 = this.textColor;
            String str4 = this.backgroundColor;
            boolean z11 = this.useBoldFont;
            List<AnnotationButton> list = this.buttons;
            StringBuilder c11 = C2436a.c(j11, "AnnotationVO(id=", ", icon=", str);
            c11.append(", iconColor=");
            c11.append(str2);
            c11.append(", text=");
            c11.append((Object) charSequence);
            a.h(c11, ", textColor=", str3, ", backgroundColor=", str4);
            c11.append(", useBoldFont=");
            c11.append(z11);
            c11.append(", buttons=");
            c11.append(list);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO;", "", "<init>", "()V", "PostingProductVO", "PostingMoreProductVO", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO$PostingMoreProductVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO$PostingProductVO;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PostingItemVO {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO$PostingMoreProductVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO;", "", "count", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCount", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PostingMoreProductVO extends PostingItemVO {

            @NotNull
            private final String count;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PostingMoreProductVO(@NotNull String count) {
                super(null);
                Intrinsics.checkNotNullParameter(count, "count");
                this.count = count;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PostingMoreProductVO) && Intrinsics.d(this.count, ((PostingMoreProductVO) other).count);
            }

            @NotNull
            public final String getCount() {
                return this.count;
            }

            public int hashCode() {
                return this.count.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("PostingMoreProductVO(count=", this.count, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO$PostingProductVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO;", "", "image", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Z", "()Z", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PostingProductVO extends PostingItemVO {

            @NotNull
            private final String image;
            private final boolean isAdult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PostingProductVO(@NotNull String image, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.isAdult = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PostingProductVO)) {
                    return false;
                }
                PostingProductVO postingProductVO = (PostingProductVO) other;
                return Intrinsics.d(this.image, postingProductVO.image) && this.isAdult == postingProductVO.isAdult;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isAdult) + (this.image.hashCode() * 31);
            }

            /* renamed from: isAdult, reason: from getter */
            public final boolean getIsAdult() {
                return this.isAdult;
            }

            @NotNull
            public String toString() {
                return b.f("PostingProductVO(image=", this.image, ", isAdult=", ")", this.isAdult);
            }
        }

        public /* synthetic */ PostingItemVO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PostingItemVO() {
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b2\u0010\u0018¨\u00063"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "trackDeliveryTitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "shareButton", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "progressiveText", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingItemVO;", "products", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "itemPreviewSize", "columnsCount", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTitle", "getTrackDeliveryTitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getShareButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "getProgressiveText", "()Lru/ozon/app/android/common/progressivemolecula/presentation/ProgressiveTextWidgetVO$ProgressiveTextVO;", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getItemPreviewSize", "getColumnsCount", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostingVO extends OrderShipmentItemVO {
        private final AtomAction action;
        private final int columnsCount;
        private final long id;
        private final int itemPreviewSize;

        @NotNull
        private final List<PostingItemVO> products;
        private final ProgressiveTextWidgetVO.ProgressiveTextVO progressiveText;
        private final ButtonV3Atom.SmallBorderlessButton shareButton;
        private final String title;
        private final String trackDeliveryTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PostingVO(long j11, String str, String str2, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, ProgressiveTextWidgetVO.ProgressiveTextVO progressiveTextVO, @NotNull List<? extends PostingItemVO> products, AtomAction atomAction, int i11, int i12) {
            super(null);
            Intrinsics.checkNotNullParameter(products, "products");
            this.id = j11;
            this.title = str;
            this.trackDeliveryTitle = str2;
            this.shareButton = smallBorderlessButton;
            this.progressiveText = progressiveTextVO;
            this.products = products;
            this.action = atomAction;
            this.itemPreviewSize = i11;
            this.columnsCount = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostingVO)) {
                return false;
            }
            PostingVO postingVO = (PostingVO) other;
            return this.id == postingVO.id && Intrinsics.d(this.title, postingVO.title) && Intrinsics.d(this.trackDeliveryTitle, postingVO.trackDeliveryTitle) && Intrinsics.d(this.shareButton, postingVO.shareButton) && Intrinsics.d(this.progressiveText, postingVO.progressiveText) && Intrinsics.d(this.products, postingVO.products) && Intrinsics.d(this.action, postingVO.action) && this.itemPreviewSize == postingVO.itemPreviewSize && this.columnsCount == postingVO.columnsCount;
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final int getColumnsCount() {
            return this.columnsCount;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final int getItemPreviewSize() {
            return this.itemPreviewSize;
        }

        @NotNull
        public final List<PostingItemVO> getProducts() {
            return this.products;
        }

        public final ProgressiveTextWidgetVO.ProgressiveTextVO getProgressiveText() {
            return this.progressiveText;
        }

        public final ButtonV3Atom.SmallBorderlessButton getShareButton() {
            return this.shareButton;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getTrackDeliveryTitle() {
            return this.trackDeliveryTitle;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.trackDeliveryTitle;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.shareButton;
            int hashCode4 = (hashCode3 + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31;
            ProgressiveTextWidgetVO.ProgressiveTextVO progressiveTextVO = this.progressiveText;
            int b11 = g.b((hashCode4 + (progressiveTextVO == null ? 0 : progressiveTextVO.hashCode())) * 31, 31, this.products);
            AtomAction atomAction = this.action;
            return Integer.hashCode(this.columnsCount) + C2454a.a(this.itemPreviewSize, (b11 + (atomAction != null ? atomAction.hashCode() : 0)) * 31, 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.title;
            String str2 = this.trackDeliveryTitle;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.shareButton;
            ProgressiveTextWidgetVO.ProgressiveTextVO progressiveTextVO = this.progressiveText;
            List<PostingItemVO> list = this.products;
            AtomAction atomAction = this.action;
            int i11 = this.itemPreviewSize;
            int i12 = this.columnsCount;
            StringBuilder c11 = C2436a.c(j11, "PostingVO(id=", ", title=", str);
            c11.append(", trackDeliveryTitle=");
            c11.append(str2);
            c11.append(", shareButton=");
            c11.append(smallBorderlessButton);
            c11.append(", progressiveText=");
            c11.append(progressiveTextVO);
            c11.append(", products=");
            c11.append(list);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(", itemPreviewSize=");
            c11.append(i11);
            return h.b(c11, ", columnsCount=", i12, ")");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$ShipmentActionsVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "button", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShipmentActionsVO extends OrderShipmentItemVO {
        public static final int $stable = ButtonV3Atom.LargeBorderlessButton.$stable;

        @NotNull
        private final ButtonV3Atom.LargeBorderlessButton button;
        private final long id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShipmentActionsVO(long j11, @NotNull ButtonV3Atom.LargeBorderlessButton button) {
            super(null);
            Intrinsics.checkNotNullParameter(button, "button");
            this.id = j11;
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShipmentActionsVO)) {
                return false;
            }
            ShipmentActionsVO shipmentActionsVO = (ShipmentActionsVO) other;
            return this.id == shipmentActionsVO.id && Intrinsics.d(this.button, shipmentActionsVO.button);
        }

        @NotNull
        public final ButtonV3Atom.LargeBorderlessButton getButton() {
            return this.button;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return this.button.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "ShipmentActionsVO(id=" + this.id + ", button=" + this.button + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$StatusProviderVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO;", "", "id", "", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "deliveryName", "Lru/ozon/uni/atoms/data/badge/Badge;", "status", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "getTitle", "getDeliveryName", "Lru/ozon/uni/atoms/data/badge/Badge;", "getStatus", "()Lru/ozon/uni/atoms/data/badge/Badge;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatusProviderVO extends OrderShipmentItemVO {
        public static final int $stable = Badge.$stable;

        @NotNull
        private final String deliveryName;
        private final long id;
        private final String image;

        @NotNull
        private final Badge status;

        @NotNull
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatusProviderVO(long j11, String str, @NotNull String title, @NotNull String deliveryName, @NotNull Badge status) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deliveryName, "deliveryName");
            Intrinsics.checkNotNullParameter(status, "status");
            this.id = j11;
            this.image = str;
            this.title = title;
            this.deliveryName = deliveryName;
            this.status = status;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusProviderVO)) {
                return false;
            }
            StatusProviderVO statusProviderVO = (StatusProviderVO) other;
            return this.id == statusProviderVO.id && Intrinsics.d(this.image, statusProviderVO.image) && Intrinsics.d(this.title, statusProviderVO.title) && Intrinsics.d(this.deliveryName, statusProviderVO.deliveryName) && Intrinsics.d(this.status, statusProviderVO.status);
        }

        @NotNull
        public final String getDeliveryName() {
            return this.deliveryName;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final Badge getStatus() {
            return this.status;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.image;
            return this.status.hashCode() + g.a(g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.deliveryName);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.image;
            String str2 = this.title;
            String str3 = this.deliveryName;
            Badge badge = this.status;
            StringBuilder c11 = C2436a.c(j11, "StatusProviderVO(id=", ", image=", str);
            a.h(c11, ", title=", str2, ", deliveryName=", str3);
            c11.append(", status=");
            c11.append(badge);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$StatusVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO;", "", "id", "Lru/ozon/uni/atoms/data/badge/Badge;", "status", "<init>", "(JLru/ozon/uni/atoms/data/badge/Badge;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/badge/Badge;", "getStatus", "()Lru/ozon/uni/atoms/data/badge/Badge;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatusVO extends OrderShipmentItemVO {
        public static final int $stable = Badge.$stable;
        private final long id;

        @NotNull
        private final Badge status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatusVO(long j11, @NotNull Badge status) {
            super(null);
            Intrinsics.checkNotNullParameter(status, "status");
            this.id = j11;
            this.status = status;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusVO)) {
                return false;
            }
            StatusVO statusVO = (StatusVO) other;
            return this.id == statusVO.id && Intrinsics.d(this.status, statusVO.status);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final Badge getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "StatusVO(id=" + this.id + ", status=" + this.status + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$TextVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO;", "", "id", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;", "chunks", "<init>", "(JLru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;", "getChunks", "()Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextVO extends OrderShipmentItemVO {

        @NotNull
        private final OrderShipmentItemDTO.Line chunks;
        private final long id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextVO(long j11, @NotNull OrderShipmentItemDTO.Line chunks) {
            super(null);
            Intrinsics.checkNotNullParameter(chunks, "chunks");
            this.id = j11;
            this.chunks = chunks;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextVO)) {
                return false;
            }
            TextVO textVO = (TextVO) other;
            return this.id == textVO.id && Intrinsics.d(this.chunks, textVO.chunks);
        }

        @NotNull
        public final OrderShipmentItemDTO.Line getChunks() {
            return this.chunks;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public int hashCode() {
            return this.chunks.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "TextVO(id=" + this.id + ", chunks=" + this.chunks + ")";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$TitleVO;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO;", "", "id", "", "icon", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$TextChunk;", "text", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$Line;", "lines", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "button", "", "scrollWidgetKey", "<init>", "(JLjava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getIcon", "Ljava/util/List;", "getText", "()Ljava/util/List;", "getLines", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleVO extends OrderShipmentItemVO {
        private final ButtonV3Atom.LargeBorderlessButton button;
        private final String icon;
        private final long id;
        private final List<OrderShipmentItemDTO.Line> lines;
        private final Integer scrollWidgetKey;

        @NotNull
        private final List<OrderShipmentItemDTO.TextChunk> text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleVO(long j11, String str, @NotNull List<OrderShipmentItemDTO.TextChunk> text, List<OrderShipmentItemDTO.Line> list, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = j11;
            this.icon = str;
            this.text = text;
            this.lines = list;
            this.button = largeBorderlessButton;
            this.scrollWidgetKey = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleVO)) {
                return false;
            }
            TitleVO titleVO = (TitleVO) other;
            return this.id == titleVO.id && Intrinsics.d(this.icon, titleVO.icon) && Intrinsics.d(this.text, titleVO.text) && Intrinsics.d(this.lines, titleVO.lines) && Intrinsics.d(this.button, titleVO.button) && Intrinsics.d(this.scrollWidgetKey, titleVO.scrollWidgetKey);
        }

        public final ButtonV3Atom.LargeBorderlessButton getButton() {
            return this.button;
        }

        public final String getIcon() {
            return this.icon;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final List<OrderShipmentItemDTO.Line> getLines() {
            return this.lines;
        }

        @Override // ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO, l20.c
        public Integer getScrollWidgetKey() {
            return this.scrollWidgetKey;
        }

        @NotNull
        public final List<OrderShipmentItemDTO.TextChunk> getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            String str = this.icon;
            int b11 = g.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.text);
            List<OrderShipmentItemDTO.Line> list = this.lines;
            int hashCode2 = (b11 + (list == null ? 0 : list.hashCode())) * 31;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.button;
            int hashCode3 = (hashCode2 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
            Integer num = this.scrollWidgetKey;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.icon;
            List<OrderShipmentItemDTO.TextChunk> list = this.text;
            List<OrderShipmentItemDTO.Line> list2 = this.lines;
            ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.button;
            Integer num = this.scrollWidgetKey;
            StringBuilder c11 = C2436a.c(j11, "TitleVO(id=", ", icon=", str);
            C2860c.g(", text=", ", lines=", c11, list, list2);
            c11.append(", button=");
            c11.append(largeBorderlessButton);
            c11.append(", scrollWidgetKey=");
            c11.append(num);
            c11.append(")");
            return c11.toString();
        }
    }

    public /* synthetic */ OrderShipmentItemVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    private OrderShipmentItemVO() {
    }
}
