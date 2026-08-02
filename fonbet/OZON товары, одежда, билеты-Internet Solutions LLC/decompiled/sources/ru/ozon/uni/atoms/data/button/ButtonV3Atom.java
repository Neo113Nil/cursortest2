package ru.ozon.uni.atoms.data.button;

import Am.C2438a;
import B0.C2454a;
import B3.p;
import Bl.C2639a;
import C.J;
import C.o0;
import De.C2859b;
import De.C2860c;
import Fm.C3051a;
import G.g;
import I1.w;
import J0.P;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Ql.c;
import Sc.InterfaceC3999a;
import Ul.C4070a;
import V.e;
import Ve.C4636t5;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.common.HTMLTagSupport;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@InterfaceC3999a
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B?\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u000f'()*+,-./012345¨\u00066"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "type", "Lru/ozon/uni/atoms/data/AtomTypeImpl;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomTypeImpl;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getType", "()Lru/ozon/uni/atoms/data/AtomTypeImpl;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "LargeButton", "LargeGradientButton", "LargeBorderlessButton", "SmallBorderlessButton", "SmallBorderlessButtonWithIcon", "SmallButton", "ResizableSmallButton", "SmallButtonWithIcon", "PaymentButtonLarge", "PaymentButtonSmall", "GetButton", "SmallIconButton", "SmallIconButtonStyle", "LargeIconButton", "LargeIconButtonStyle", "Extend", "AddToCartAtom", "AddToJointPurchaseButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToJointPurchaseButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$GetButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeGradientButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ButtonV3Atom extends AtomDTO {
    public static final int $stable = 8;
    private final String context;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final AtomTypeImpl type;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0019\u001a\u001b\u001c\u001dBI\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u0082\u0001\u0003\u001e\u001f ¨\u0006!"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "type", "Lru/ozon/uni/atoms/data/AtomTypeImpl;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;Lru/ozon/uni/atoms/data/AtomTypeImpl;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "getType", "()Lru/ozon/uni/atoms/data/AtomTypeImpl;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "AddToCartButton", "AddToCartButtonWithQuantity", "AddToCartButtonImage", "Action", "AddToCartStyle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AddToCartAtom extends ButtonV3Atom {
        public static final int $stable = 8;
        private final Action action;
        private final String context;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final AtomTypeImpl type;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0005J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "Landroid/os/Parcelable;", "id", "", "quantity", "", "selectedDeliverySchema", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Action implements Parcelable {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<Action> CREATOR = new Creator();

            @NotNull
            private final String id;
            private final Integer quantity;
            private final Long selectedDeliverySchema;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Creator implements Parcelable.Creator<Action> {
                @Override // android.os.Parcelable.Creator
                public final Action createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Action(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Action[] newArray(int i11) {
                    return new Action[i11];
                }
            }

            public Action(@NotNull String id2, Integer num, Long l11) {
                Intrinsics.checkNotNullParameter(id2, "id");
                this.id = id2;
                this.quantity = num;
                this.selectedDeliverySchema = l11;
            }

            public static /* synthetic */ Action copy$default(Action action, String str, Integer num, Long l11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = action.id;
                }
                if ((i11 & 2) != 0) {
                    num = action.quantity;
                }
                if ((i11 & 4) != 0) {
                    l11 = action.selectedDeliverySchema;
                }
                return action.copy(str, num, l11);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getQuantity() {
                return this.quantity;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            @NotNull
            public final Action copy(@NotNull String id2, Integer quantity, Long selectedDeliverySchema) {
                Intrinsics.checkNotNullParameter(id2, "id");
                return new Action(id2, quantity, selectedDeliverySchema);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Action)) {
                    return false;
                }
                Action action = (Action) other;
                return Intrinsics.d(this.id, action.id) && Intrinsics.d(this.quantity, action.quantity) && Intrinsics.d(this.selectedDeliverySchema, action.selectedDeliverySchema);
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public final Integer getQuantity() {
                return this.quantity;
            }

            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            public int hashCode() {
                int hashCode = this.id.hashCode() * 31;
                Integer num = this.quantity;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Long l11 = this.selectedDeliverySchema;
                return hashCode2 + (l11 != null ? l11.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.id;
                Integer num = this.quantity;
                return C3051a.d(P.b("Action(id=", str, num, ", quantity=", ", selectedDeliverySchema="), this.selectedDeliverySchema, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.id);
                Integer num = this.quantity;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    a.f(dest, 1, num);
                }
                Long l11 = this.selectedDeliverySchema;
                if (l11 == null) {
                    dest.writeInt(0);
                } else {
                    C2860c.e(dest, 1, l11);
                }
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0006\u0010 \u001a\u00020\u0019J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0019HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006+"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom;", "isActive", "", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AddToCartButtonImage extends AddToCartAtom {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<AddToCartButtonImage> CREATOR = new Creator();
            private final Action action;
            private final String context;
            private final boolean isActive;
            private final TestInfo testInfo;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Creator implements Parcelable.Creator<AddToCartButtonImage> {
                @Override // android.os.Parcelable.Creator
                public final AddToCartButtonImage createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    boolean z11 = parcel.readInt() != 0;
                    Action createFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
                    String readString = parcel.readString();
                    TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                        int i11 = 0;
                        while (i11 != readInt) {
                            i11 = C2859b.a(AddToCartButtonImage.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new AddToCartButtonImage(z11, createFromParcel, readString, createFromParcel2, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final AddToCartButtonImage[] newArray(int i11) {
                    return new AddToCartButtonImage[i11];
                }
            }

            public /* synthetic */ AddToCartButtonImage(boolean z11, Action action, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(z11, (i11 & 2) != 0 ? null : action, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map);
            }

            public static /* synthetic */ AddToCartButtonImage copy$default(AddToCartButtonImage addToCartButtonImage, boolean z11, Action action, String str, TestInfo testInfo, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = addToCartButtonImage.isActive;
                }
                if ((i11 & 2) != 0) {
                    action = addToCartButtonImage.action;
                }
                if ((i11 & 4) != 0) {
                    str = addToCartButtonImage.context;
                }
                if ((i11 & 8) != 0) {
                    testInfo = addToCartButtonImage.testInfo;
                }
                if ((i11 & 16) != 0) {
                    map = addToCartButtonImage.trackingInfo;
                }
                Map map2 = map;
                String str2 = str;
                return addToCartButtonImage.copy(z11, action, str2, testInfo, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsActive() {
                return this.isActive;
            }

            /* renamed from: component2, reason: from getter */
            public final Action getAction() {
                return this.action;
            }

            /* renamed from: component3, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component4, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            @NotNull
            public final AddToCartButtonImage copy(boolean isActive, Action action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
                return new AddToCartButtonImage(isActive, action, context, testInfo, trackingInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddToCartButtonImage)) {
                    return false;
                }
                AddToCartButtonImage addToCartButtonImage = (AddToCartButtonImage) other;
                return this.isActive == addToCartButtonImage.isActive && Intrinsics.d(this.action, addToCartButtonImage.action) && Intrinsics.d(this.context, addToCartButtonImage.context) && Intrinsics.d(this.testInfo, addToCartButtonImage.testInfo) && Intrinsics.d(this.trackingInfo, addToCartButtonImage.trackingInfo);
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom
            public Action getAction() {
                return this.action;
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom, ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_add_to_cart_button_image;
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom, ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom, ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.isActive) * 31;
                Action action = this.action;
                int hashCode2 = (hashCode + (action == null ? 0 : action.hashCode())) * 31;
                String str = this.context;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode4 + (map != null ? map.hashCode() : 0);
            }

            public final boolean isActive() {
                return this.isActive;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isActive;
                Action action = this.action;
                String str = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("AddToCartButtonImage(isActive=");
                sb2.append(z11);
                sb2.append(", action=");
                sb2.append(action);
                sb2.append(", context=");
                C4070a.b(sb2, str, ", testInfo=", testInfo, ", trackingInfo=");
                return T7.P.f(sb2, map, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.isActive ? 1 : 0);
                Action action = this.action;
                if (action == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    action.writeToParcel(dest, flags);
                }
                dest.writeString(this.context);
                TestInfo testInfo = this.testInfo;
                if (testInfo == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    testInfo.writeToParcel(dest, flags);
                }
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }

            public AddToCartButtonImage(boolean z11, Action action, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
                super(action, AtomTypeImpl.ADD_TO_CART_BUTTON_IMAGE, str, testInfo, map, null);
                this.isActive = z11;
                this.action = action;
                this.context = str;
                this.testInfo = testInfo;
                this.trackingInfo = map;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_PRIMARY", "STYLE_TYPE_SECONDARY", "STYLE_TYPE_PRIMARY_EXPRESS", "STYLE_TYPE_PRIMARY_FRESH", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class AddToCartStyle {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ AddToCartStyle[] $VALUES;
            public static final AddToCartStyle STYLE_TYPE_PRIMARY = new AddToCartStyle("STYLE_TYPE_PRIMARY", 0);
            public static final AddToCartStyle STYLE_TYPE_SECONDARY = new AddToCartStyle("STYLE_TYPE_SECONDARY", 1);
            public static final AddToCartStyle STYLE_TYPE_PRIMARY_EXPRESS = new AddToCartStyle("STYLE_TYPE_PRIMARY_EXPRESS", 2);
            public static final AddToCartStyle STYLE_TYPE_PRIMARY_FRESH = new AddToCartStyle("STYLE_TYPE_PRIMARY_FRESH", 3);

            private static final /* synthetic */ AddToCartStyle[] $values() {
                return new AddToCartStyle[]{STYLE_TYPE_PRIMARY, STYLE_TYPE_SECONDARY, STYLE_TYPE_PRIMARY_EXPRESS, STYLE_TYPE_PRIMARY_FRESH};
            }

            static {
                AddToCartStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private AddToCartStyle(String str, int i11) {
            }

            @NotNull
            public static Xc.a<AddToCartStyle> getEntries() {
                return $ENTRIES;
            }

            public static AddToCartStyle valueOf(String str) {
                return (AddToCartStyle) Enum.valueOf(AddToCartStyle.class, str);
            }

            public static AddToCartStyle[] values() {
                return (AddToCartStyle[]) $VALUES.clone();
            }
        }

        public /* synthetic */ AddToCartAtom(Action action, AtomTypeImpl atomTypeImpl, String str, TestInfo testInfo, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(action, atomTypeImpl, str, testInfo, map);
        }

        public Action getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public /* synthetic */ AddToCartAtom(Action action, AtomTypeImpl atomTypeImpl, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(action, atomTypeImpl, str, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map, null);
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        @NotNull
        public AtomTypeImpl getType() {
            return this.type;
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010,\u001a\u00020-H\u0016J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003J\u009f\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0001J\u0006\u0010:\u001a\u00020-J\u0013\u0010;\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020-HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020-R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(¨\u0006E"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom;", "activeText", "", "isActive", "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "style", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;", "theme", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "extend", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;", "extendMap", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;Ljava/util/Map;)V", "getActiveText", "()Ljava/lang/String;", "()Z", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getStyle$annotations", "()V", "getStyle", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;", "getTheme", "getAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getExtend", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;", "getExtendMap", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AddToCartButton extends AddToCartAtom {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<AddToCartButton> CREATOR = new Creator();
            private final Action action;
            private final String activeText;
            private final String context;
            private final Extend extend;
            private final Map<String, String> extendMap;
            private final boolean isActive;

            @NotNull
            private final AddToCartStyle style;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString text;
            private final AddToCartStyle theme;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Creator implements Parcelable.Creator<AddToCartButton> {
                @Override // android.os.Parcelable.Creator
                public final AddToCartButton createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    int i11 = 0;
                    boolean z11 = parcel.readInt() != 0;
                    OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                    AddToCartStyle valueOf = AddToCartStyle.valueOf(parcel.readString());
                    LinkedHashMap linkedHashMap2 = null;
                    AddToCartStyle valueOf2 = parcel.readInt() == 0 ? null : AddToCartStyle.valueOf(parcel.readString());
                    Action createFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
                    boolean z12 = z11;
                    String readString2 = parcel.readString();
                    TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(readInt);
                        int i12 = 0;
                        while (i12 != readInt) {
                            i12 = C2859b.a(AddToCartButton.class, parcel, linkedHashMap, parcel.readString(), i12, 1);
                            readInt = readInt;
                        }
                    }
                    Extend valueOf3 = parcel.readInt() == 0 ? null : Extend.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        int readInt2 = parcel.readInt();
                        linkedHashMap2 = new LinkedHashMap(readInt2);
                        while (i11 != readInt2) {
                            i11 = B6.b.a(parcel, linkedHashMap2, parcel.readString(), i11, 1);
                        }
                    }
                    return new AddToCartButton(readString, z12, create, valueOf, valueOf2, createFromParcel, readString2, createFromParcel2, linkedHashMap, valueOf3, linkedHashMap2);
                }

                @Override // android.os.Parcelable.Creator
                public final AddToCartButton[] newArray(int i11) {
                    return new AddToCartButton[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ AddToCartButton(java.lang.String r15, boolean r16, ru.ozon.uni.atoms.utils.OzonSpannableString r17, ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartStyle r18, ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartStyle r19, ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.Action r20, java.lang.String r21, ru.ozon.uni.atoms.data.TestInfo r22, java.util.Map r23, ru.ozon.uni.atoms.data.button.ButtonV3Atom.Extend r24, java.util.Map r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
                /*
                    r14 = this;
                    r0 = r26
                    r1 = r0 & 8
                    if (r1 == 0) goto La
                    ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$AddToCartStyle r1 = ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartStyle.STYLE_TYPE_PRIMARY
                    r6 = r1
                    goto Lc
                La:
                    r6 = r18
                Lc:
                    r1 = r0 & 16
                    if (r1 == 0) goto L14
                    ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$AddToCartStyle r1 = ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartStyle.STYLE_TYPE_PRIMARY
                    r7 = r1
                    goto L16
                L14:
                    r7 = r19
                L16:
                    r1 = r0 & 32
                    r2 = 0
                    if (r1 == 0) goto L1d
                    r8 = r2
                    goto L1f
                L1d:
                    r8 = r20
                L1f:
                    r1 = r0 & 64
                    if (r1 == 0) goto L25
                    r9 = r2
                    goto L27
                L25:
                    r9 = r21
                L27:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L2d
                    r10 = r2
                    goto L2f
                L2d:
                    r10 = r22
                L2f:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L35
                    r11 = r2
                    goto L37
                L35:
                    r11 = r23
                L37:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L3d
                    r12 = r2
                    goto L3f
                L3d:
                    r12 = r24
                L3f:
                    r0 = r0 & 1024(0x400, float:1.435E-42)
                    if (r0 == 0) goto L4b
                    r13 = r2
                    r3 = r15
                    r4 = r16
                    r5 = r17
                    r2 = r14
                    goto L53
                L4b:
                    r13 = r25
                    r2 = r14
                    r3 = r15
                    r4 = r16
                    r5 = r17
                L53:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButton.<init>(java.lang.String, boolean, ru.ozon.uni.atoms.utils.OzonSpannableString, ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$AddToCartStyle, ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$AddToCartStyle, ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$Action, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, ru.ozon.uni.atoms.data.button.ButtonV3Atom$Extend, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public static /* synthetic */ AddToCartButton copy$default(AddToCartButton addToCartButton, String str, boolean z11, OzonSpannableString ozonSpannableString, AddToCartStyle addToCartStyle, AddToCartStyle addToCartStyle2, Action action, String str2, TestInfo testInfo, Map map, Extend extend, Map map2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = addToCartButton.activeText;
                }
                if ((i11 & 2) != 0) {
                    z11 = addToCartButton.isActive;
                }
                if ((i11 & 4) != 0) {
                    ozonSpannableString = addToCartButton.text;
                }
                if ((i11 & 8) != 0) {
                    addToCartStyle = addToCartButton.style;
                }
                if ((i11 & 16) != 0) {
                    addToCartStyle2 = addToCartButton.theme;
                }
                if ((i11 & 32) != 0) {
                    action = addToCartButton.action;
                }
                if ((i11 & 64) != 0) {
                    str2 = addToCartButton.context;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    testInfo = addToCartButton.testInfo;
                }
                if ((i11 & 256) != 0) {
                    map = addToCartButton.trackingInfo;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    extend = addToCartButton.extend;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    map2 = addToCartButton.extendMap;
                }
                Extend extend2 = extend;
                Map map3 = map2;
                TestInfo testInfo2 = testInfo;
                Map map4 = map;
                Action action2 = action;
                String str3 = str2;
                AddToCartStyle addToCartStyle3 = addToCartStyle2;
                OzonSpannableString ozonSpannableString2 = ozonSpannableString;
                return addToCartButton.copy(str, z11, ozonSpannableString2, addToCartStyle, addToCartStyle3, action2, str3, testInfo2, map4, extend2, map3);
            }

            @InterfaceC3999a
            public static /* synthetic */ void getStyle$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getActiveText() {
                return this.activeText;
            }

            /* renamed from: component10, reason: from getter */
            public final Extend getExtend() {
                return this.extend;
            }

            public final Map<String, String> component11() {
                return this.extendMap;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsActive() {
                return this.isActive;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final OzonSpannableString getText() {
                return this.text;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final AddToCartStyle getStyle() {
                return this.style;
            }

            /* renamed from: component5, reason: from getter */
            public final AddToCartStyle getTheme() {
                return this.theme;
            }

            /* renamed from: component6, reason: from getter */
            public final Action getAction() {
                return this.action;
            }

            /* renamed from: component7, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component8, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component9() {
                return this.trackingInfo;
            }

            @NotNull
            public final AddToCartButton copy(String activeText, boolean isActive, @NotNull OzonSpannableString text, @NotNull AddToCartStyle style, AddToCartStyle theme, Action action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Extend extend, Map<String, String> extendMap) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(style, "style");
                return new AddToCartButton(activeText, isActive, text, style, theme, action, context, testInfo, trackingInfo, extend, extendMap);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddToCartButton)) {
                    return false;
                }
                AddToCartButton addToCartButton = (AddToCartButton) other;
                return Intrinsics.d(this.activeText, addToCartButton.activeText) && this.isActive == addToCartButton.isActive && Intrinsics.d(this.text, addToCartButton.text) && this.style == addToCartButton.style && this.theme == addToCartButton.theme && Intrinsics.d(this.action, addToCartButton.action) && Intrinsics.d(this.context, addToCartButton.context) && Intrinsics.d(this.testInfo, addToCartButton.testInfo) && Intrinsics.d(this.trackingInfo, addToCartButton.trackingInfo) && this.extend == addToCartButton.extend && Intrinsics.d(this.extendMap, addToCartButton.extendMap);
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom
            public Action getAction() {
                return this.action;
            }

            public final String getActiveText() {
                return this.activeText;
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom, ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final Extend getExtend() {
                return this.extend;
            }

            public final Map<String, String> getExtendMap() {
                return this.extendMap;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_add_to_cart_button;
            }

            @NotNull
            public final AddToCartStyle getStyle() {
                return this.style;
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom, ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            public final AddToCartStyle getTheme() {
                return this.theme;
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom, ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                String str = this.activeText;
                int hashCode = (this.style.hashCode() + T7.P.c(this.text, C3532b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.isActive), 31)) * 31;
                AddToCartStyle addToCartStyle = this.theme;
                int hashCode2 = (hashCode + (addToCartStyle == null ? 0 : addToCartStyle.hashCode())) * 31;
                Action action = this.action;
                int hashCode3 = (hashCode2 + (action == null ? 0 : action.hashCode())) * 31;
                String str2 = this.context;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
                Extend extend = this.extend;
                int hashCode7 = (hashCode6 + (extend == null ? 0 : extend.hashCode())) * 31;
                Map<String, String> map2 = this.extendMap;
                return hashCode7 + (map2 != null ? map2.hashCode() : 0);
            }

            public final boolean isActive() {
                return this.isActive;
            }

            @NotNull
            public String toString() {
                String str = this.activeText;
                boolean z11 = this.isActive;
                OzonSpannableString ozonSpannableString = this.text;
                AddToCartStyle addToCartStyle = this.style;
                AddToCartStyle addToCartStyle2 = this.theme;
                Action action = this.action;
                String str2 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                Extend extend = this.extend;
                Map<String, String> map2 = this.extendMap;
                StringBuilder b11 = C4636t5.b("AddToCartButton(activeText=", str, ", isActive=", ", text=", z11);
                b11.append((Object) ozonSpannableString);
                b11.append(", style=");
                b11.append(addToCartStyle);
                b11.append(", theme=");
                b11.append(addToCartStyle2);
                b11.append(", action=");
                b11.append(action);
                b11.append(", context=");
                C4070a.b(b11, str2, ", testInfo=", testInfo, ", trackingInfo=");
                b11.append(map);
                b11.append(", extend=");
                b11.append(extend);
                b11.append(", extendMap=");
                return T7.P.f(b11, map2, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.activeText);
                dest.writeInt(this.isActive ? 1 : 0);
                OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
                dest.writeString(this.style.name());
                AddToCartStyle addToCartStyle = this.theme;
                if (addToCartStyle == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(addToCartStyle.name());
                }
                Action action = this.action;
                if (action == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    action.writeToParcel(dest, flags);
                }
                dest.writeString(this.context);
                TestInfo testInfo = this.testInfo;
                if (testInfo == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    testInfo.writeToParcel(dest, flags);
                }
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                } else {
                    Iterator e11 = J.e(map, dest, 1);
                    while (e11.hasNext()) {
                        Map.Entry entry = (Map.Entry) e11.next();
                        dest.writeString((String) entry.getKey());
                        dest.writeParcelable((Parcelable) entry.getValue(), flags);
                    }
                }
                Extend extend = this.extend;
                if (extend == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(extend.name());
                }
                Map<String, String> map2 = this.extendMap;
                if (map2 == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator e12 = J.e(map2, dest, 1);
                while (e12.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) e12.next();
                    dest.writeString((String) entry2.getKey());
                    dest.writeString((String) entry2.getValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddToCartButton(String str, boolean z11, @NotNull OzonSpannableString text, @NotNull AddToCartStyle style, AddToCartStyle addToCartStyle, Action action, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, Extend extend, Map<String, String> map2) {
                super(action, AtomTypeImpl.ADD_TO_CART_BUTTON, str2, testInfo, map, null);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(style, "style");
                this.activeText = str;
                this.isActive = z11;
                this.text = text;
                this.style = style;
                this.theme = addToCartStyle;
                this.action = action;
                this.context = str2;
                this.testInfo = testInfo;
                this.trackingInfo = map;
                this.extend = extend;
                this.extendMap = map2;
            }
        }

        @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002YZB±\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010=\u001a\u00020\u0003H\u0016J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010F\u001a\u00020\u0011HÆ\u0003J\t\u0010G\u001a\u00020\u0013HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0017\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u001dHÆ\u0003J½\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001J\u0006\u0010N\u001a\u00020\u0003J\u0013\u0010O\u001a\u00020\u00112\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u0003HÖ\u0001J\t\u0010S\u001a\u00020\rHÖ\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006["}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom;", "maxItems", "", "currentItems", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "style", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;", "theme", "mode", "Lru/ozon/uni/atoms/data/button/UpdateMode;", "buttonIconId", "", "sellerIcon", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon;", "qtyTextDisabled", "", "buttonSizeMode", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$ButtonSizeMode;", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "extend", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;", "<init>", "(IILru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;Lru/ozon/uni/atoms/data/button/UpdateMode;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon;ZLru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$ButtonSizeMode;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;)V", "getMaxItems", "()I", "getCurrentItems", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getStyle$annotations", "()V", "getStyle", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;", "getTheme", "getMode", "()Lru/ozon/uni/atoms/data/button/UpdateMode;", "getButtonIconId", "()Ljava/lang/String;", "getSellerIcon", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon;", "getQtyTextDisabled", "()Z", "getButtonSizeMode", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$ButtonSizeMode;", "getAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getExtend", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SellerIcon", "ButtonSizeMode", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class AddToCartButtonWithQuantity extends AddToCartAtom {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<AddToCartButtonWithQuantity> CREATOR = new Creator();
            private final Action action;
            private final String buttonIconId;

            @NotNull
            private final ButtonSizeMode buttonSizeMode;
            private final String context;
            private final int currentItems;
            private final Extend extend;
            private final int maxItems;

            @NotNull
            private final UpdateMode mode;
            private final boolean qtyTextDisabled;
            private final SellerIcon sellerIcon;
            private final AddToCartStyle style;
            private final TestInfo testInfo;

            @NotNull
            private final OzonSpannableString text;
            private final AddToCartStyle theme;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$ButtonSizeMode;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_MODE_FIT", "SIZE_MODE_FILL", "SIZE_MODE_140", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class ButtonSizeMode {
                private static final /* synthetic */ Xc.a $ENTRIES;
                private static final /* synthetic */ ButtonSizeMode[] $VALUES;

                @i(name = "SIZE_MODE_FIT")
                public static final ButtonSizeMode SIZE_MODE_FIT = new ButtonSizeMode("SIZE_MODE_FIT", 0);

                @i(name = "SIZE_MODE_FILL")
                public static final ButtonSizeMode SIZE_MODE_FILL = new ButtonSizeMode("SIZE_MODE_FILL", 1);

                @i(name = "SIZE_MODE_140")
                public static final ButtonSizeMode SIZE_MODE_140 = new ButtonSizeMode("SIZE_MODE_140", 2);

                private static final /* synthetic */ ButtonSizeMode[] $values() {
                    return new ButtonSizeMode[]{SIZE_MODE_FIT, SIZE_MODE_FILL, SIZE_MODE_140};
                }

                static {
                    ButtonSizeMode[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private ButtonSizeMode(String str, int i11) {
                }

                @NotNull
                public static Xc.a<ButtonSizeMode> getEntries() {
                    return $ENTRIES;
                }

                public static ButtonSizeMode valueOf(String str) {
                    return (ButtonSizeMode) Enum.valueOf(ButtonSizeMode.class, str);
                }

                public static ButtonSizeMode[] values() {
                    return (ButtonSizeMode[]) $VALUES.clone();
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class Creator implements Parcelable.Creator<AddToCartButtonWithQuantity> {
                @Override // android.os.Parcelable.Creator
                public final AddToCartButtonWithQuantity createFromParcel(Parcel parcel) {
                    AddToCartStyle addToCartStyle;
                    boolean z11;
                    LinkedHashMap linkedHashMap;
                    Parcel parcel2 = parcel;
                    Intrinsics.checkNotNullParameter(parcel2, "parcel");
                    int readInt = parcel2.readInt();
                    int readInt2 = parcel2.readInt();
                    OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel2);
                    AddToCartStyle valueOf = parcel2.readInt() == 0 ? null : AddToCartStyle.valueOf(parcel2.readString());
                    AddToCartStyle valueOf2 = parcel2.readInt() == 0 ? null : AddToCartStyle.valueOf(parcel2.readString());
                    UpdateMode valueOf3 = UpdateMode.valueOf(parcel2.readString());
                    String readString = parcel2.readString();
                    SellerIcon createFromParcel = parcel2.readInt() == 0 ? null : SellerIcon.CREATOR.createFromParcel(parcel2);
                    if (parcel2.readInt() != 0) {
                        addToCartStyle = valueOf;
                        z11 = true;
                    } else {
                        addToCartStyle = valueOf;
                        z11 = false;
                    }
                    ButtonSizeMode valueOf4 = ButtonSizeMode.valueOf(parcel2.readString());
                    Action createFromParcel2 = parcel2.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel2);
                    String readString2 = parcel2.readString();
                    TestInfo createFromParcel3 = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
                    if (parcel2.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt3 = parcel2.readInt();
                        linkedHashMap = new LinkedHashMap(readInt3);
                        int i11 = 0;
                        while (i11 != readInt3) {
                            i11 = C2859b.a(AddToCartButtonWithQuantity.class, parcel2, linkedHashMap, parcel2.readString(), i11, 1);
                            parcel2 = parcel;
                            readInt3 = readInt3;
                        }
                    }
                    return new AddToCartButtonWithQuantity(readInt, readInt2, create, addToCartStyle, valueOf2, valueOf3, readString, createFromParcel, z11, valueOf4, createFromParcel2, readString2, createFromParcel3, linkedHashMap, parcel.readInt() != 0 ? Extend.valueOf(parcel.readString()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final AddToCartButtonWithQuantity[] newArray(int i11) {
                    return new AddToCartButtonWithQuantity[i11];
                }
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
                	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
                	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
                	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
                	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
                */
            public /* synthetic */ AddToCartButtonWithQuantity(int r19, int r20, ru.ozon.uni.atoms.utils.OzonSpannableString r21, ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartStyle r22, ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartStyle r23, ru.ozon.uni.atoms.data.button.UpdateMode r24, java.lang.String r25, ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.SellerIcon r26, boolean r27, ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode r28, ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.Action r29, java.lang.String r30, ru.ozon.uni.atoms.data.TestInfo r31, java.util.Map r32, ru.ozon.uni.atoms.data.button.ButtonV3Atom.Extend r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
                /*
                    r18 = this;
                    r0 = r34
                    r1 = r0 & 32
                    if (r1 == 0) goto La
                    ru.ozon.uni.atoms.data.button.UpdateMode r1 = ru.ozon.uni.atoms.data.button.UpdateMode.UPDATE_MODE_MIN_ITEMS
                    r8 = r1
                    goto Lc
                La:
                    r8 = r24
                Lc:
                    r1 = r0 & 64
                    r2 = 0
                    if (r1 == 0) goto L13
                    r9 = r2
                    goto L15
                L13:
                    r9 = r25
                L15:
                    r1 = r0 & 128(0x80, float:1.8E-43)
                    if (r1 == 0) goto L1b
                    r10 = r2
                    goto L1d
                L1b:
                    r10 = r26
                L1d:
                    r1 = r0 & 256(0x100, float:3.59E-43)
                    if (r1 == 0) goto L24
                    r1 = 0
                    r11 = r1
                    goto L26
                L24:
                    r11 = r27
                L26:
                    r1 = r0 & 512(0x200, float:7.17E-43)
                    if (r1 == 0) goto L2e
                    ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$ButtonSizeMode r1 = ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FIT
                    r12 = r1
                    goto L30
                L2e:
                    r12 = r28
                L30:
                    r1 = r0 & 1024(0x400, float:1.435E-42)
                    if (r1 == 0) goto L36
                    r13 = r2
                    goto L38
                L36:
                    r13 = r29
                L38:
                    r1 = r0 & 2048(0x800, float:2.87E-42)
                    if (r1 == 0) goto L3e
                    r14 = r2
                    goto L40
                L3e:
                    r14 = r30
                L40:
                    r1 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L46
                    r15 = r2
                    goto L48
                L46:
                    r15 = r31
                L48:
                    r1 = r0 & 8192(0x2000, float:1.148E-41)
                    if (r1 == 0) goto L4f
                    r16 = r2
                    goto L51
                L4f:
                    r16 = r32
                L51:
                    r0 = r0 & 16384(0x4000, float:2.2959E-41)
                    if (r0 == 0) goto L64
                    r17 = r2
                    r3 = r19
                    r4 = r20
                    r5 = r21
                    r6 = r22
                    r7 = r23
                    r2 = r18
                    goto L72
                L64:
                    r17 = r33
                    r2 = r18
                    r3 = r19
                    r4 = r20
                    r5 = r21
                    r6 = r22
                    r7 = r23
                L72:
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.<init>(int, int, ru.ozon.uni.atoms.utils.OzonSpannableString, ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$AddToCartStyle, ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$AddToCartStyle, ru.ozon.uni.atoms.data.button.UpdateMode, java.lang.String, ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon, boolean, ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$ButtonSizeMode, ru.ozon.uni.atoms.data.button.ButtonV3Atom$AddToCartAtom$Action, java.lang.String, ru.ozon.uni.atoms.data.TestInfo, java.util.Map, ru.ozon.uni.atoms.data.button.ButtonV3Atom$Extend, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            @InterfaceC3999a
            public static /* synthetic */ void getStyle$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final int getMaxItems() {
                return this.maxItems;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final ButtonSizeMode getButtonSizeMode() {
                return this.buttonSizeMode;
            }

            /* renamed from: component11, reason: from getter */
            public final Action getAction() {
                return this.action;
            }

            /* renamed from: component12, reason: from getter */
            public final String getContext() {
                return this.context;
            }

            /* renamed from: component13, reason: from getter */
            public final TestInfo getTestInfo() {
                return this.testInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component14() {
                return this.trackingInfo;
            }

            /* renamed from: component15, reason: from getter */
            public final Extend getExtend() {
                return this.extend;
            }

            /* renamed from: component2, reason: from getter */
            public final int getCurrentItems() {
                return this.currentItems;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final OzonSpannableString getText() {
                return this.text;
            }

            /* renamed from: component4, reason: from getter */
            public final AddToCartStyle getStyle() {
                return this.style;
            }

            /* renamed from: component5, reason: from getter */
            public final AddToCartStyle getTheme() {
                return this.theme;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final UpdateMode getMode() {
                return this.mode;
            }

            /* renamed from: component7, reason: from getter */
            public final String getButtonIconId() {
                return this.buttonIconId;
            }

            /* renamed from: component8, reason: from getter */
            public final SellerIcon getSellerIcon() {
                return this.sellerIcon;
            }

            /* renamed from: component9, reason: from getter */
            public final boolean getQtyTextDisabled() {
                return this.qtyTextDisabled;
            }

            @NotNull
            public final AddToCartButtonWithQuantity copy(int maxItems, int currentItems, @NotNull OzonSpannableString text, AddToCartStyle style, AddToCartStyle theme, @NotNull UpdateMode mode, String buttonIconId, SellerIcon sellerIcon, boolean qtyTextDisabled, @NotNull ButtonSizeMode buttonSizeMode, Action action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Extend extend) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(buttonSizeMode, "buttonSizeMode");
                return new AddToCartButtonWithQuantity(maxItems, currentItems, text, style, theme, mode, buttonIconId, sellerIcon, qtyTextDisabled, buttonSizeMode, action, context, testInfo, trackingInfo, extend);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddToCartButtonWithQuantity)) {
                    return false;
                }
                AddToCartButtonWithQuantity addToCartButtonWithQuantity = (AddToCartButtonWithQuantity) other;
                return this.maxItems == addToCartButtonWithQuantity.maxItems && this.currentItems == addToCartButtonWithQuantity.currentItems && Intrinsics.d(this.text, addToCartButtonWithQuantity.text) && this.style == addToCartButtonWithQuantity.style && this.theme == addToCartButtonWithQuantity.theme && this.mode == addToCartButtonWithQuantity.mode && Intrinsics.d(this.buttonIconId, addToCartButtonWithQuantity.buttonIconId) && Intrinsics.d(this.sellerIcon, addToCartButtonWithQuantity.sellerIcon) && this.qtyTextDisabled == addToCartButtonWithQuantity.qtyTextDisabled && this.buttonSizeMode == addToCartButtonWithQuantity.buttonSizeMode && Intrinsics.d(this.action, addToCartButtonWithQuantity.action) && Intrinsics.d(this.context, addToCartButtonWithQuantity.context) && Intrinsics.d(this.testInfo, addToCartButtonWithQuantity.testInfo) && Intrinsics.d(this.trackingInfo, addToCartButtonWithQuantity.trackingInfo) && this.extend == addToCartButtonWithQuantity.extend;
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom
            public Action getAction() {
                return this.action;
            }

            public final String getButtonIconId() {
                return this.buttonIconId;
            }

            @NotNull
            public final ButtonSizeMode getButtonSizeMode() {
                return this.buttonSizeMode;
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom, ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
            public String getContext() {
                return this.context;
            }

            public final int getCurrentItems() {
                return this.currentItems;
            }

            public final Extend getExtend() {
                return this.extend;
            }

            @Override // lk0.InterfaceC7968a
            public int getItemType() {
                return R$id.atom_type_add_add_to_cart_button_with_quantity;
            }

            public final int getMaxItems() {
                return this.maxItems;
            }

            @NotNull
            public final UpdateMode getMode() {
                return this.mode;
            }

            public final boolean getQtyTextDisabled() {
                return this.qtyTextDisabled;
            }

            public final SellerIcon getSellerIcon() {
                return this.sellerIcon;
            }

            public final AddToCartStyle getStyle() {
                return this.style;
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom, ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
            public TestInfo getTestInfo() {
                return this.testInfo;
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            public final AddToCartStyle getTheme() {
                return this.theme;
            }

            @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom.AddToCartAtom, ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
            public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int c11 = T7.P.c(this.text, C2454a.a(this.currentItems, Integer.hashCode(this.maxItems) * 31, 31), 31);
                AddToCartStyle addToCartStyle = this.style;
                int hashCode = (c11 + (addToCartStyle == null ? 0 : addToCartStyle.hashCode())) * 31;
                AddToCartStyle addToCartStyle2 = this.theme;
                int hashCode2 = (this.mode.hashCode() + ((hashCode + (addToCartStyle2 == null ? 0 : addToCartStyle2.hashCode())) * 31)) * 31;
                String str = this.buttonIconId;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                SellerIcon sellerIcon = this.sellerIcon;
                int hashCode4 = (this.buttonSizeMode.hashCode() + C3532b.a((hashCode3 + (sellerIcon == null ? 0 : sellerIcon.hashCode())) * 31, 31, this.qtyTextDisabled)) * 31;
                Action action = this.action;
                int hashCode5 = (hashCode4 + (action == null ? 0 : action.hashCode())) * 31;
                String str2 = this.context;
                int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                TestInfo testInfo = this.testInfo;
                int hashCode7 = (hashCode6 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
                Extend extend = this.extend;
                return hashCode8 + (extend != null ? extend.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.maxItems;
                int i12 = this.currentItems;
                OzonSpannableString ozonSpannableString = this.text;
                AddToCartStyle addToCartStyle = this.style;
                AddToCartStyle addToCartStyle2 = this.theme;
                UpdateMode updateMode = this.mode;
                String str = this.buttonIconId;
                SellerIcon sellerIcon = this.sellerIcon;
                boolean z11 = this.qtyTextDisabled;
                ButtonSizeMode buttonSizeMode = this.buttonSizeMode;
                Action action = this.action;
                String str2 = this.context;
                TestInfo testInfo = this.testInfo;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                Extend extend = this.extend;
                StringBuilder a11 = C2438a.a("AddToCartButtonWithQuantity(maxItems=", i11, ", currentItems=", ", text=", i12);
                a11.append((Object) ozonSpannableString);
                a11.append(", style=");
                a11.append(addToCartStyle);
                a11.append(", theme=");
                a11.append(addToCartStyle2);
                a11.append(", mode=");
                a11.append(updateMode);
                a11.append(", buttonIconId=");
                a11.append(str);
                a11.append(", sellerIcon=");
                a11.append(sellerIcon);
                a11.append(", qtyTextDisabled=");
                a11.append(z11);
                a11.append(", buttonSizeMode=");
                a11.append(buttonSizeMode);
                a11.append(", action=");
                a11.append(action);
                a11.append(", context=");
                a11.append(str2);
                a11.append(", testInfo=");
                a11.append(testInfo);
                a11.append(", trackingInfo=");
                a11.append(map);
                a11.append(", extend=");
                a11.append(extend);
                a11.append(")");
                return a11.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.maxItems);
                dest.writeInt(this.currentItems);
                OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
                AddToCartStyle addToCartStyle = this.style;
                if (addToCartStyle == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(addToCartStyle.name());
                }
                AddToCartStyle addToCartStyle2 = this.theme;
                if (addToCartStyle2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(addToCartStyle2.name());
                }
                dest.writeString(this.mode.name());
                dest.writeString(this.buttonIconId);
                SellerIcon sellerIcon = this.sellerIcon;
                if (sellerIcon == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    sellerIcon.writeToParcel(dest, flags);
                }
                dest.writeInt(this.qtyTextDisabled ? 1 : 0);
                dest.writeString(this.buttonSizeMode.name());
                Action action = this.action;
                if (action == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    action.writeToParcel(dest, flags);
                }
                dest.writeString(this.context);
                TestInfo testInfo = this.testInfo;
                if (testInfo == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    testInfo.writeToParcel(dest, flags);
                }
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                if (map == null) {
                    dest.writeInt(0);
                } else {
                    Iterator e11 = J.e(map, dest, 1);
                    while (e11.hasNext()) {
                        Map.Entry entry = (Map.Entry) e11.next();
                        dest.writeString((String) entry.getKey());
                        dest.writeParcelable((Parcelable) entry.getValue(), flags);
                    }
                }
                Extend extend = this.extend;
                if (extend == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(extend.name());
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon;", "Landroid/os/Parcelable;", "sellerIconId", "", "sellerIconBgColor", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getSellerIconId", "()Ljava/lang/String;", "getSellerIconBgColor", "getTintColor", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final /* data */ class SellerIcon implements Parcelable {
                public static final int $stable = 0;

                @NotNull
                public static final Parcelable.Creator<SellerIcon> CREATOR = new Creator();

                @NotNull
                private final String sellerIconBgColor;

                @NotNull
                private final String sellerIconId;
                private final String tintColor;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<SellerIcon> {
                    @Override // android.os.Parcelable.Creator
                    public final SellerIcon createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SellerIcon(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SellerIcon[] newArray(int i11) {
                        return new SellerIcon[i11];
                    }
                }

                public SellerIcon(@NotNull String sellerIconId, @NotNull String sellerIconBgColor, String str) {
                    Intrinsics.checkNotNullParameter(sellerIconId, "sellerIconId");
                    Intrinsics.checkNotNullParameter(sellerIconBgColor, "sellerIconBgColor");
                    this.sellerIconId = sellerIconId;
                    this.sellerIconBgColor = sellerIconBgColor;
                    this.tintColor = str;
                }

                public static /* synthetic */ SellerIcon copy$default(SellerIcon sellerIcon, String str, String str2, String str3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = sellerIcon.sellerIconId;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = sellerIcon.sellerIconBgColor;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = sellerIcon.tintColor;
                    }
                    return sellerIcon.copy(str, str2, str3);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getSellerIconId() {
                    return this.sellerIconId;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getSellerIconBgColor() {
                    return this.sellerIconBgColor;
                }

                /* renamed from: component3, reason: from getter */
                public final String getTintColor() {
                    return this.tintColor;
                }

                @NotNull
                public final SellerIcon copy(@NotNull String sellerIconId, @NotNull String sellerIconBgColor, String tintColor) {
                    Intrinsics.checkNotNullParameter(sellerIconId, "sellerIconId");
                    Intrinsics.checkNotNullParameter(sellerIconBgColor, "sellerIconBgColor");
                    return new SellerIcon(sellerIconId, sellerIconBgColor, tintColor);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SellerIcon)) {
                        return false;
                    }
                    SellerIcon sellerIcon = (SellerIcon) other;
                    return Intrinsics.d(this.sellerIconId, sellerIcon.sellerIconId) && Intrinsics.d(this.sellerIconBgColor, sellerIcon.sellerIconBgColor) && Intrinsics.d(this.tintColor, sellerIcon.tintColor);
                }

                @NotNull
                public final String getSellerIconBgColor() {
                    return this.sellerIconBgColor;
                }

                @NotNull
                public final String getSellerIconId() {
                    return this.sellerIconId;
                }

                public final String getTintColor() {
                    return this.tintColor;
                }

                public int hashCode() {
                    int a11 = g.a(this.sellerIconId.hashCode() * 31, 31, this.sellerIconBgColor);
                    String str = this.tintColor;
                    return a11 + (str == null ? 0 : str.hashCode());
                }

                @NotNull
                public String toString() {
                    String str = this.sellerIconId;
                    String str2 = this.sellerIconBgColor;
                    return o0.c(C3660k.d("SellerIcon(sellerIconId=", str, ", sellerIconBgColor=", str2, ", tintColor="), this.tintColor, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.sellerIconId);
                    dest.writeString(this.sellerIconBgColor);
                    dest.writeString(this.tintColor);
                }

                public /* synthetic */ SellerIcon(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, (i11 & 4) != 0 ? null : str3);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public SellerIcon(@NotNull String sellerIconId, @NotNull String sellerIconBgColor) {
                    this(sellerIconId, sellerIconBgColor, null);
                    Intrinsics.checkNotNullParameter(sellerIconId, "sellerIconId");
                    Intrinsics.checkNotNullParameter(sellerIconBgColor, "sellerIconBgColor");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddToCartButtonWithQuantity(int i11, int i12, @NotNull OzonSpannableString text, AddToCartStyle addToCartStyle, AddToCartStyle addToCartStyle2, @NotNull UpdateMode mode, String str, SellerIcon sellerIcon, boolean z11, @NotNull ButtonSizeMode buttonSizeMode, Action action, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, Extend extend) {
                super(action, AtomTypeImpl.ADD_TO_CART_BUTTON_WITH_QUANTITY, str2, testInfo, map, null);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(buttonSizeMode, "buttonSizeMode");
                this.maxItems = i11;
                this.currentItems = i12;
                this.text = text;
                this.style = addToCartStyle;
                this.theme = addToCartStyle2;
                this.mode = mode;
                this.buttonIconId = str;
                this.sellerIcon = sellerIcon;
                this.qtyTextDisabled = z11;
                this.buttonSizeMode = buttonSizeMode;
                this.action = action;
                this.context = str2;
                this.testInfo = testInfo;
                this.trackingInfo = map;
                this.extend = extend;
            }
        }

        private AddToCartAtom(Action action, AtomTypeImpl atomTypeImpl, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(atomTypeImpl, str, testInfo, map, null);
            this.action = action;
            this.type = atomTypeImpl;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00014BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0006\u0010(\u001a\u00020\u0003J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\nHÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00065"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToJointPurchaseButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "availableQtyInStock", "", "currentQty", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToJointPurchaseButton$Action;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(IILru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToJointPurchaseButton$Action;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getAvailableQtyInStock", "()I", "getCurrentQty", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToJointPurchaseButton$Action;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Action", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AddToJointPurchaseButton extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<AddToJointPurchaseButton> CREATOR = new Creator();
        private final Action action;
        private final int availableQtyInStock;
        private final String context;
        private final int currentQty;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToJointPurchaseButton$Action;", "Landroid/os/Parcelable;", "productId", "", "jointPurchaseId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getJointPurchaseId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final /* data */ class Action implements Parcelable {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<Action> CREATOR = new Creator();

            @NotNull
            private final String jointPurchaseId;

            @NotNull
            private final String productId;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Action> {
                @Override // android.os.Parcelable.Creator
                public final Action createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Action(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Action[] newArray(int i11) {
                    return new Action[i11];
                }
            }

            public Action(@NotNull String productId, @NotNull String jointPurchaseId) {
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(jointPurchaseId, "jointPurchaseId");
                this.productId = productId;
                this.jointPurchaseId = jointPurchaseId;
            }

            public static /* synthetic */ Action copy$default(Action action, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = action.productId;
                }
                if ((i11 & 2) != 0) {
                    str2 = action.jointPurchaseId;
                }
                return action.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getProductId() {
                return this.productId;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getJointPurchaseId() {
                return this.jointPurchaseId;
            }

            @NotNull
            public final Action copy(@NotNull String productId, @NotNull String jointPurchaseId) {
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(jointPurchaseId, "jointPurchaseId");
                return new Action(productId, jointPurchaseId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Action)) {
                    return false;
                }
                Action action = (Action) other;
                return Intrinsics.d(this.productId, action.productId) && Intrinsics.d(this.jointPurchaseId, action.jointPurchaseId);
            }

            @NotNull
            public final String getJointPurchaseId() {
                return this.jointPurchaseId;
            }

            @NotNull
            public final String getProductId() {
                return this.productId;
            }

            public int hashCode() {
                return this.jointPurchaseId.hashCode() + (this.productId.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("Action(productId=", this.productId, ", jointPurchaseId=", this.jointPurchaseId, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.productId);
                dest.writeString(this.jointPurchaseId);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<AddToJointPurchaseButton> {
            @Override // android.os.Parcelable.Creator
            public final AddToJointPurchaseButton createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                Action createFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt3 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                    int i11 = 0;
                    while (i11 != readInt3) {
                        i11 = C2859b.a(AddToJointPurchaseButton.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new AddToJointPurchaseButton(readInt, readInt2, create, createFromParcel, readString, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final AddToJointPurchaseButton[] newArray(int i11) {
                return new AddToJointPurchaseButton[i11];
            }
        }

        public /* synthetic */ AddToJointPurchaseButton(int i11, int i12, OzonSpannableString ozonSpannableString, Action action, String str, TestInfo testInfo, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, i12, ozonSpannableString, action, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : testInfo, (i13 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ AddToJointPurchaseButton copy$default(AddToJointPurchaseButton addToJointPurchaseButton, int i11, int i12, OzonSpannableString ozonSpannableString, Action action, String str, TestInfo testInfo, Map map, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = addToJointPurchaseButton.availableQtyInStock;
            }
            if ((i13 & 2) != 0) {
                i12 = addToJointPurchaseButton.currentQty;
            }
            if ((i13 & 4) != 0) {
                ozonSpannableString = addToJointPurchaseButton.text;
            }
            if ((i13 & 8) != 0) {
                action = addToJointPurchaseButton.action;
            }
            if ((i13 & 16) != 0) {
                str = addToJointPurchaseButton.context;
            }
            if ((i13 & 32) != 0) {
                testInfo = addToJointPurchaseButton.testInfo;
            }
            if ((i13 & 64) != 0) {
                map = addToJointPurchaseButton.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str2 = str;
            OzonSpannableString ozonSpannableString2 = ozonSpannableString;
            return addToJointPurchaseButton.copy(i11, i12, ozonSpannableString2, action, str2, testInfo2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAvailableQtyInStock() {
            return this.availableQtyInStock;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCurrentQty() {
            return this.currentQty;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component6, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final AddToJointPurchaseButton copy(int availableQtyInStock, int currentQty, @NotNull OzonSpannableString text, Action action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new AddToJointPurchaseButton(availableQtyInStock, currentQty, text, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddToJointPurchaseButton)) {
                return false;
            }
            AddToJointPurchaseButton addToJointPurchaseButton = (AddToJointPurchaseButton) other;
            return this.availableQtyInStock == addToJointPurchaseButton.availableQtyInStock && this.currentQty == addToJointPurchaseButton.currentQty && Intrinsics.d(this.text, addToJointPurchaseButton.text) && Intrinsics.d(this.action, addToJointPurchaseButton.action) && Intrinsics.d(this.context, addToJointPurchaseButton.context) && Intrinsics.d(this.testInfo, addToJointPurchaseButton.testInfo) && Intrinsics.d(this.trackingInfo, addToJointPurchaseButton.trackingInfo);
        }

        public final Action getAction() {
            return this.action;
        }

        public final int getAvailableQtyInStock() {
            return this.availableQtyInStock;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final int getCurrentQty() {
            return this.currentQty;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_add_to_joint_purchase_button;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int c11 = T7.P.c(this.text, C2454a.a(this.currentQty, Integer.hashCode(this.availableQtyInStock) * 31, 31), 31);
            Action action = this.action;
            int hashCode = (c11 + (action == null ? 0 : action.hashCode())) * 31;
            String str = this.context;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.availableQtyInStock;
            int i12 = this.currentQty;
            OzonSpannableString ozonSpannableString = this.text;
            Action action = this.action;
            String str = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder a11 = C2438a.a("AddToJointPurchaseButton(availableQtyInStock=", i11, ", currentQty=", ", text=", i12);
            a11.append((Object) ozonSpannableString);
            a11.append(", action=");
            a11.append(action);
            a11.append(", context=");
            C4070a.b(a11, str, ", testInfo=", testInfo, ", trackingInfo=");
            return T7.P.f(a11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.availableQtyInStock);
            dest.writeInt(this.currentQty);
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            Action action = this.action;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddToJointPurchaseButton(int i11, int i12, @NotNull OzonSpannableString text, Action action, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.ADD_TO_JOINT_PURCHASE_BUTTON, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.availableQtyInStock = i11;
            this.currentQty = i12;
            this.text = text;
            this.action = action;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$Extend;", "", "<init>", "(Ljava/lang/String;I)V", "EXTEND_UNDEFINED", "QUANT_NOTIFY", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Extend {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Extend[] $VALUES;
        public static final Extend EXTEND_UNDEFINED = new Extend("EXTEND_UNDEFINED", 0);
        public static final Extend QUANT_NOTIFY = new Extend("QUANT_NOTIFY", 1);

        private static final /* synthetic */ Extend[] $values() {
            return new Extend[]{EXTEND_UNDEFINED, QUANT_NOTIFY};
        }

        static {
            Extend[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Extend(String str, int i11) {
        }

        @NotNull
        public static Xc.a<Extend> getEntries() {
            return $ENTRIES;
        }

        public static Extend valueOf(String str) {
            return (Extend) Enum.valueOf(Extend.class, str);
        }

        public static Extend[] values() {
            return (Extend[]) $VALUES.clone();
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00012BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010&\u001a\u00020\u001eJ\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001eHÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$GetButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$GetButton$Theme;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$GetButton$Theme;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$GetButton$Theme;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Theme", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class GetButton extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<GetButton> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final Theme theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<GetButton> {
            @Override // android.os.Parcelable.Creator
            public final GetButton createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                Theme valueOf = parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString());
                String readString = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(GetButton.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new GetButton(create, createFromParcel, valueOf, readString, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final GetButton[] newArray(int i11) {
                return new GetButton[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$GetButton$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "STYLE_TYPE_INVALID", "STYLE_TYPE_WHITE", "STYLE_TYPE_WHITE_2", "STYLE_TYPE_BLUE", "STYLE_TYPE_GREEN", "STYLE_TYPE_JOINT_PURCHASE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Theme {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ Theme[] $VALUES;

            @i(name = "STYLE_TYPE_INVALID")
            public static final Theme STYLE_TYPE_INVALID = new Theme("STYLE_TYPE_INVALID", 0);

            @i(name = "STYLE_TYPE_WHITE")
            public static final Theme STYLE_TYPE_WHITE = new Theme("STYLE_TYPE_WHITE", 1);

            @i(name = "STYLE_TYPE_WHITE_2")
            public static final Theme STYLE_TYPE_WHITE_2 = new Theme("STYLE_TYPE_WHITE_2", 2);

            @i(name = "STYLE_TYPE_BLUE")
            public static final Theme STYLE_TYPE_BLUE = new Theme("STYLE_TYPE_BLUE", 3);

            @i(name = "STYLE_TYPE_GREEN")
            public static final Theme STYLE_TYPE_GREEN = new Theme("STYLE_TYPE_GREEN", 4);

            @i(name = "STYLE_TYPE_JOINT_PURCHASE")
            public static final Theme STYLE_TYPE_JOINT_PURCHASE = new Theme("STYLE_TYPE_JOINT_PURCHASE", 5);

            private static final /* synthetic */ Theme[] $values() {
                return new Theme[]{STYLE_TYPE_INVALID, STYLE_TYPE_WHITE, STYLE_TYPE_WHITE_2, STYLE_TYPE_BLUE, STYLE_TYPE_GREEN, STYLE_TYPE_JOINT_PURCHASE};
            }

            static {
                Theme[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Theme(String str, int i11) {
            }

            @NotNull
            public static Xc.a<Theme> getEntries() {
                return $ENTRIES;
            }

            public static Theme valueOf(String str) {
                return (Theme) Enum.valueOf(Theme.class, str);
            }

            public static Theme[] values() {
                return (Theme[]) $VALUES.clone();
            }
        }

        public /* synthetic */ GetButton(OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, Theme theme, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, atomActionDTO, theme, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : testInfo, (i11 & 32) != 0 ? null : map);
        }

        public static /* synthetic */ GetButton copy$default(GetButton getButton, OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, Theme theme, String str, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = getButton.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = getButton.action;
            }
            if ((i11 & 4) != 0) {
                theme = getButton.theme;
            }
            if ((i11 & 8) != 0) {
                str = getButton.context;
            }
            if ((i11 & 16) != 0) {
                testInfo = getButton.testInfo;
            }
            if ((i11 & 32) != 0) {
                map = getButton.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            return getButton.copy(ozonSpannableString, atomActionDTO, theme, str, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final Theme getTheme() {
            return this.theme;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final GetButton copy(@NotNull OzonSpannableString text, AtomActionDTO action, Theme theme, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new GetButton(text, action, theme, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetButton)) {
                return false;
            }
            GetButton getButton = (GetButton) other;
            return Intrinsics.d(this.text, getButton.text) && Intrinsics.d(this.action, getButton.action) && this.theme == getButton.theme && Intrinsics.d(this.context, getButton.context) && Intrinsics.d(this.testInfo, getButton.testInfo) && Intrinsics.d(this.trackingInfo, getButton.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_get_button;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final Theme getTheme() {
            return this.theme;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Theme theme = this.theme;
            int hashCode3 = (hashCode2 + (theme == null ? 0 : theme.hashCode())) * 31;
            String str = this.context;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            AtomActionDTO atomActionDTO = this.action;
            Theme theme = this.theme;
            String str = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("GetButton(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", theme=");
            sb2.append(theme);
            sb2.append(", context=");
            sb2.append(str);
            sb2.append(", testInfo=");
            return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            Theme theme = this.theme;
            if (theme == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(theme.name());
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetButton(@NotNull OzonSpannableString text, AtomActionDTO atomActionDTO, Theme theme, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.GET_BUTTON, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.theme = theme;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00012BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J[\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010&\u001a\u00020\u001eJ\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001eHÖ\u0001J\t\u0010,\u001a\u00020\tHÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton$LargeBorderLessButtonTheme;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton$LargeBorderLessButtonTheme;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton$LargeBorderLessButtonTheme;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LargeBorderLessButtonTheme", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class LargeBorderlessButton extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<LargeBorderlessButton> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final LargeBorderLessButtonTheme theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<LargeBorderlessButton> {
            @Override // android.os.Parcelable.Creator
            public final LargeBorderlessButton createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                LargeBorderLessButtonTheme valueOf = parcel.readInt() == 0 ? null : LargeBorderLessButtonTheme.valueOf(parcel.readString());
                String readString = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(LargeBorderlessButton.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new LargeBorderlessButton(create, createFromParcel, valueOf, readString, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final LargeBorderlessButton[] newArray(int i11) {
                return new LargeBorderlessButton[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton$LargeBorderLessButtonTheme;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "THEME_TYPE_INVALID", "THEME_TYPE_DEFAULT", "THEME_TYPE_BOLD", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LargeBorderLessButtonTheme {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ LargeBorderLessButtonTheme[] $VALUES;

            @NotNull
            private final String key;

            @i(name = "THEME_TYPE_INVALID")
            public static final LargeBorderLessButtonTheme THEME_TYPE_INVALID = new LargeBorderLessButtonTheme("THEME_TYPE_INVALID", 0, "THEME_TYPE_INVALID");

            @i(name = "THEME_TYPE_DEFAULT")
            public static final LargeBorderLessButtonTheme THEME_TYPE_DEFAULT = new LargeBorderLessButtonTheme("THEME_TYPE_DEFAULT", 1, "THEME_TYPE_DEFAULT");

            @i(name = "THEME_TYPE_BOLD")
            public static final LargeBorderLessButtonTheme THEME_TYPE_BOLD = new LargeBorderLessButtonTheme("THEME_TYPE_BOLD", 2, "THEME_TYPE_BOLD");

            private static final /* synthetic */ LargeBorderLessButtonTheme[] $values() {
                return new LargeBorderLessButtonTheme[]{THEME_TYPE_INVALID, THEME_TYPE_DEFAULT, THEME_TYPE_BOLD};
            }

            static {
                LargeBorderLessButtonTheme[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private LargeBorderLessButtonTheme(String str, int i11, String str2) {
                this.key = str2;
            }

            @NotNull
            public static Xc.a<LargeBorderLessButtonTheme> getEntries() {
                return $ENTRIES;
            }

            public static LargeBorderLessButtonTheme valueOf(String str) {
                return (LargeBorderLessButtonTheme) Enum.valueOf(LargeBorderLessButtonTheme.class, str);
            }

            public static LargeBorderLessButtonTheme[] values() {
                return (LargeBorderLessButtonTheme[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ LargeBorderlessButton(OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, LargeBorderLessButtonTheme largeBorderLessButtonTheme, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? null : atomActionDTO, (i11 & 4) != 0 ? null : largeBorderLessButtonTheme, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : testInfo, (i11 & 32) != 0 ? null : map);
        }

        public static /* synthetic */ LargeBorderlessButton copy$default(LargeBorderlessButton largeBorderlessButton, OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, LargeBorderLessButtonTheme largeBorderLessButtonTheme, String str, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = largeBorderlessButton.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = largeBorderlessButton.action;
            }
            if ((i11 & 4) != 0) {
                largeBorderLessButtonTheme = largeBorderlessButton.theme;
            }
            if ((i11 & 8) != 0) {
                str = largeBorderlessButton.context;
            }
            if ((i11 & 16) != 0) {
                testInfo = largeBorderlessButton.testInfo;
            }
            if ((i11 & 32) != 0) {
                map = largeBorderlessButton.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            return largeBorderlessButton.copy(ozonSpannableString, atomActionDTO, largeBorderLessButtonTheme, str, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final LargeBorderLessButtonTheme getTheme() {
            return this.theme;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final LargeBorderlessButton copy(@NotNull OzonSpannableString text, AtomActionDTO action, LargeBorderLessButtonTheme theme, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new LargeBorderlessButton(text, action, theme, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LargeBorderlessButton)) {
                return false;
            }
            LargeBorderlessButton largeBorderlessButton = (LargeBorderlessButton) other;
            return Intrinsics.d(this.text, largeBorderlessButton.text) && Intrinsics.d(this.action, largeBorderlessButton.action) && this.theme == largeBorderlessButton.theme && Intrinsics.d(this.context, largeBorderlessButton.context) && Intrinsics.d(this.testInfo, largeBorderlessButton.testInfo) && Intrinsics.d(this.trackingInfo, largeBorderlessButton.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_large_borderless_button;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final LargeBorderLessButtonTheme getTheme() {
            return this.theme;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            LargeBorderLessButtonTheme largeBorderLessButtonTheme = this.theme;
            int hashCode3 = (hashCode2 + (largeBorderLessButtonTheme == null ? 0 : largeBorderLessButtonTheme.hashCode())) * 31;
            String str = this.context;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            AtomActionDTO atomActionDTO = this.action;
            LargeBorderLessButtonTheme largeBorderLessButtonTheme = this.theme;
            String str = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("LargeBorderlessButton(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", theme=");
            sb2.append(largeBorderLessButtonTheme);
            sb2.append(", context=");
            sb2.append(str);
            sb2.append(", testInfo=");
            return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            LargeBorderLessButtonTheme largeBorderLessButtonTheme = this.theme;
            if (largeBorderLessButtonTheme == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(largeBorderLessButtonTheme.name());
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeBorderlessButton(@NotNull OzonSpannableString text, AtomActionDTO atomActionDTO, LargeBorderLessButtonTheme largeBorderLessButtonTheme, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.LARGE_BORDERLESS_BUTTON, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.theme = largeBorderLessButtonTheme;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001=By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u007f\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0006\u00101\u001a\u00020&J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020&HÖ\u0001J\t\u00107\u001a\u00020\tHÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006>"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtext", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;", "style", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtext", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;", "getStyle$annotations", "()V", "getStyle", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LargeButtonStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class LargeButton extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<LargeButton> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final String icon;
        private final LargeButtonStyle style;
        private final OzonSpannableString subtext;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final LargeButtonStyle theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LargeButton> {
            @Override // android.os.Parcelable.Creator
            public final LargeButton createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                LinkedHashMap linkedHashMap = null;
                LargeButtonStyle valueOf = parcel2.readInt() == 0 ? null : LargeButtonStyle.valueOf(parcel2.readString());
                LargeButtonStyle valueOf2 = parcel2.readInt() == 0 ? null : LargeButtonStyle.valueOf(parcel2.readString());
                String readString = parcel2.readString();
                AtomActionDTO createFromParcel = parcel2.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel2);
                LargeButtonStyle largeButtonStyle = valueOf;
                String readString2 = parcel2.readString();
                TestInfo createFromParcel2 = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
                if (parcel2.readInt() != 0) {
                    int readInt = parcel2.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(LargeButton.class, parcel2, linkedHashMap, parcel2.readString(), i11, 1);
                        parcel2 = parcel;
                    }
                }
                return new LargeButton(create, create2, largeButtonStyle, valueOf2, readString, createFromParcel, readString2, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final LargeButton[] newArray(int i11) {
                return new LargeButton[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton$LargeButtonStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "STYLE_TYPE_INVALID", "STYLE_TYPE_PRIMARY", "STYLE_TYPE_SECONDARY", "STYLE_TYPE_SECONDARY_FRESH", "STYLE_TYPE_SECONDARY_WHITE", "STYLE_TYPE_SECONDARY_CONFIRMED", "STYLE_TYPE_SECONDARY_WHITE_FRESH", "STYLE_TYPE_DELETE", "STYLE_TYPE_DELETE_WHITE", "STYLE_TYPE_PRIMARY_GREEN", "STYLE_TYPE_PRIMARY_EXPRESS", "STYLE_TYPE_PRIMARY_FRESH", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LargeButtonStyle {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ LargeButtonStyle[] $VALUES;

            @NotNull
            private final String key;

            @i(name = "STYLE_TYPE_INVALID")
            public static final LargeButtonStyle STYLE_TYPE_INVALID = new LargeButtonStyle("STYLE_TYPE_INVALID", 0, "STYLE_TYPE_INVALID");

            @i(name = "STYLE_TYPE_PRIMARY")
            public static final LargeButtonStyle STYLE_TYPE_PRIMARY = new LargeButtonStyle("STYLE_TYPE_PRIMARY", 1, "STYLE_TYPE_PRIMARY");

            @i(name = "STYLE_TYPE_SECONDARY")
            public static final LargeButtonStyle STYLE_TYPE_SECONDARY = new LargeButtonStyle("STYLE_TYPE_SECONDARY", 2, "STYLE_TYPE_SECONDARY");

            @i(name = "STYLE_TYPE_SECONDARY_FRESH")
            public static final LargeButtonStyle STYLE_TYPE_SECONDARY_FRESH = new LargeButtonStyle("STYLE_TYPE_SECONDARY_FRESH", 3, "STYLE_TYPE_SECONDARY_FRESH");

            @i(name = "STYLE_TYPE_SECONDARY_WHITE")
            public static final LargeButtonStyle STYLE_TYPE_SECONDARY_WHITE = new LargeButtonStyle("STYLE_TYPE_SECONDARY_WHITE", 4, "STYLE_TYPE_SECONDARY_WHITE");

            @i(name = "STYLE_TYPE_SECONDARY_CONFIRMED")
            public static final LargeButtonStyle STYLE_TYPE_SECONDARY_CONFIRMED = new LargeButtonStyle("STYLE_TYPE_SECONDARY_CONFIRMED", 5, "STYLE_TYPE_SECONDARY_CONFIRMED");

            @i(name = "STYLE_TYPE_SECONDARY_WHITE_FRESH")
            public static final LargeButtonStyle STYLE_TYPE_SECONDARY_WHITE_FRESH = new LargeButtonStyle("STYLE_TYPE_SECONDARY_WHITE_FRESH", 6, "STYLE_TYPE_SECONDARY_WHITE_FRESH");

            @i(name = "STYLE_TYPE_DELETE")
            public static final LargeButtonStyle STYLE_TYPE_DELETE = new LargeButtonStyle("STYLE_TYPE_DELETE", 7, "STYLE_TYPE_DELETE");

            @i(name = "STYLE_TYPE_DELETE_WHITE")
            public static final LargeButtonStyle STYLE_TYPE_DELETE_WHITE = new LargeButtonStyle("STYLE_TYPE_DELETE_WHITE", 8, "STYLE_TYPE_DELETE_WHITE");

            @i(name = "STYLE_TYPE_PRIMARY_GREEN")
            public static final LargeButtonStyle STYLE_TYPE_PRIMARY_GREEN = new LargeButtonStyle("STYLE_TYPE_PRIMARY_GREEN", 9, "STYLE_TYPE_PRIMARY_GREEN");

            @i(name = "STYLE_TYPE_PRIMARY_EXPRESS")
            public static final LargeButtonStyle STYLE_TYPE_PRIMARY_EXPRESS = new LargeButtonStyle("STYLE_TYPE_PRIMARY_EXPRESS", 10, "STYLE_TYPE_PRIMARY_EXPRESS");

            @i(name = "STYLE_TYPE_PRIMARY_FRESH")
            public static final LargeButtonStyle STYLE_TYPE_PRIMARY_FRESH = new LargeButtonStyle("STYLE_TYPE_PRIMARY_FRESH", 11, "STYLE_TYPE_PRIMARY_FRESH");

            private static final /* synthetic */ LargeButtonStyle[] $values() {
                return new LargeButtonStyle[]{STYLE_TYPE_INVALID, STYLE_TYPE_PRIMARY, STYLE_TYPE_SECONDARY, STYLE_TYPE_SECONDARY_FRESH, STYLE_TYPE_SECONDARY_WHITE, STYLE_TYPE_SECONDARY_CONFIRMED, STYLE_TYPE_SECONDARY_WHITE_FRESH, STYLE_TYPE_DELETE, STYLE_TYPE_DELETE_WHITE, STYLE_TYPE_PRIMARY_GREEN, STYLE_TYPE_PRIMARY_EXPRESS, STYLE_TYPE_PRIMARY_FRESH};
            }

            static {
                LargeButtonStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private LargeButtonStyle(String str, int i11, String str2) {
                this.key = str2;
            }

            @NotNull
            public static Xc.a<LargeButtonStyle> getEntries() {
                return $ENTRIES;
            }

            public static LargeButtonStyle valueOf(String str) {
                return (LargeButtonStyle) Enum.valueOf(LargeButtonStyle.class, str);
            }

            public static LargeButtonStyle[] values() {
                return (LargeButtonStyle[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ LargeButton(OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, LargeButtonStyle largeButtonStyle, LargeButtonStyle largeButtonStyle2, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? null : ozonSpannableString2, largeButtonStyle, (i11 & 8) != 0 ? null : largeButtonStyle2, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : atomActionDTO, (i11 & 64) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo, (i11 & 256) != 0 ? null : map);
        }

        public static /* synthetic */ LargeButton copy$default(LargeButton largeButton, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, LargeButtonStyle largeButtonStyle, LargeButtonStyle largeButtonStyle2, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = largeButton.text;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString2 = largeButton.subtext;
            }
            if ((i11 & 4) != 0) {
                largeButtonStyle = largeButton.theme;
            }
            if ((i11 & 8) != 0) {
                largeButtonStyle2 = largeButton.style;
            }
            if ((i11 & 16) != 0) {
                str = largeButton.icon;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = largeButton.action;
            }
            if ((i11 & 64) != 0) {
                str2 = largeButton.context;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                testInfo = largeButton.testInfo;
            }
            if ((i11 & 256) != 0) {
                map = largeButton.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str3 = str2;
            String str4 = str;
            LargeButtonStyle largeButtonStyle3 = largeButtonStyle;
            return largeButton.copy(ozonSpannableString, ozonSpannableString2, largeButtonStyle3, largeButtonStyle2, str4, atomActionDTO2, str3, testInfo2, map2);
        }

        @InterfaceC3999a
        public static /* synthetic */ void getStyle$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getSubtext() {
            return this.subtext;
        }

        /* renamed from: component3, reason: from getter */
        public final LargeButtonStyle getTheme() {
            return this.theme;
        }

        /* renamed from: component4, reason: from getter */
        public final LargeButtonStyle getStyle() {
            return this.style;
        }

        /* renamed from: component5, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component7, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component8, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final LargeButton copy(@NotNull OzonSpannableString text, OzonSpannableString subtext, LargeButtonStyle theme, LargeButtonStyle style, String icon, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new LargeButton(text, subtext, theme, style, icon, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LargeButton)) {
                return false;
            }
            LargeButton largeButton = (LargeButton) other;
            return Intrinsics.d(this.text, largeButton.text) && Intrinsics.d(this.subtext, largeButton.subtext) && this.theme == largeButton.theme && this.style == largeButton.style && Intrinsics.d(this.icon, largeButton.icon) && Intrinsics.d(this.action, largeButton.action) && Intrinsics.d(this.context, largeButton.context) && Intrinsics.d(this.testInfo, largeButton.testInfo) && Intrinsics.d(this.trackingInfo, largeButton.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final String getIcon() {
            return this.icon;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_large_button;
        }

        public final LargeButtonStyle getStyle() {
            return this.style;
        }

        public final OzonSpannableString getSubtext() {
            return this.subtext;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final LargeButtonStyle getTheme() {
            return this.theme;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            OzonSpannableString ozonSpannableString = this.subtext;
            int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
            LargeButtonStyle largeButtonStyle = this.theme;
            int hashCode3 = (hashCode2 + (largeButtonStyle == null ? 0 : largeButtonStyle.hashCode())) * 31;
            LargeButtonStyle largeButtonStyle2 = this.style;
            int hashCode4 = (hashCode3 + (largeButtonStyle2 == null ? 0 : largeButtonStyle2.hashCode())) * 31;
            String str = this.icon;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str2 = this.context;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode8 = (hashCode7 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode8 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            OzonSpannableString ozonSpannableString2 = this.subtext;
            LargeButtonStyle largeButtonStyle = this.theme;
            LargeButtonStyle largeButtonStyle2 = this.style;
            String str = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("LargeButton(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", subtext=");
            sb2.append((Object) ozonSpannableString2);
            sb2.append(", theme=");
            sb2.append(largeButtonStyle);
            sb2.append(", style=");
            sb2.append(largeButtonStyle2);
            sb2.append(", icon=");
            p.c(str, ", action=", ", context=", sb2, atomActionDTO);
            C4070a.b(sb2, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return T7.P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            ozonSpannableStringParceler.write(this.text, dest, flags);
            ozonSpannableStringParceler.write(this.subtext, dest, flags);
            LargeButtonStyle largeButtonStyle = this.theme;
            if (largeButtonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(largeButtonStyle.name());
            }
            LargeButtonStyle largeButtonStyle2 = this.style;
            if (largeButtonStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(largeButtonStyle2.name());
            }
            dest.writeString(this.icon);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeButton(@NotNull OzonSpannableString text, OzonSpannableString ozonSpannableString, LargeButtonStyle largeButtonStyle, LargeButtonStyle largeButtonStyle2, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.LARGE_BUTTON, str2, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.subtext = ozonSpannableString;
            this.theme = largeButtonStyle;
            this.style = largeButtonStyle2;
            this.icon = str;
            this.action = atomActionDTO;
            this.context = str2;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001@B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0091\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001J\u0006\u00104\u001a\u00020(J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020(HÖ\u0001J\t\u0010:\u001a\u00020\u0006HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006A"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeGradientButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtext", "textColor", "", "gradientColors", "", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeGradientButton$LargeGradientButtonStyle;", "icon", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeGradientButton$LargeGradientButtonStyle;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtext", "getTextColor", "()Ljava/lang/String;", "getGradientColors", "()Ljava/util/List;", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeGradientButton$LargeGradientButtonStyle;", "getIcon", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LargeGradientButtonStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class LargeGradientButton extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<LargeGradientButton> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final List<String> gradientColors;
        private final String icon;
        private final OzonSpannableString subtext;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final String textColor;
        private final LargeGradientButtonStyle theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<LargeGradientButton> {
            @Override // android.os.Parcelable.Creator
            public final LargeGradientButton createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                String readString = parcel2.readString();
                ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
                LinkedHashMap linkedHashMap = null;
                LargeGradientButtonStyle valueOf = parcel2.readInt() == 0 ? null : LargeGradientButtonStyle.valueOf(parcel2.readString());
                String readString2 = parcel2.readString();
                AtomActionDTO createFromParcel = parcel2.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel2);
                String readString3 = parcel2.readString();
                TestInfo createFromParcel2 = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
                if (parcel2.readInt() != 0) {
                    int readInt = parcel2.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(LargeGradientButton.class, parcel2, linkedHashMap, parcel2.readString(), i11, 1);
                        parcel2 = parcel;
                    }
                }
                return new LargeGradientButton(create, create2, readString, createStringArrayList, valueOf, readString2, createFromParcel, readString3, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final LargeGradientButton[] newArray(int i11) {
                return new LargeGradientButton[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeGradientButton$LargeGradientButtonStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "STYLE_TYPE_INVALID", "STYLE_TYPE_PRIMARY", "STYLE_TYPE_SECONDARY", "STYLE_TYPE_SECONDARY_WHITE", "STYLE_TYPE_SECONDARY_WHITE_FRESH", "STYLE_TYPE_SECONDARY_CONFIRMED", "STYLE_TYPE_SECONDARY_FRESH", "STYLE_TYPE_DELETE", "STYLE_TYPE_DELETE_WHITE", "STYLE_TYPE_PRIMARY_GREEN", "STYLE_TYPE_PRIMARY_EXPRESS", "STYLE_TYPE_PRIMARY_FRESH", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class LargeGradientButtonStyle {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ LargeGradientButtonStyle[] $VALUES;

            @NotNull
            private final String key;

            @i(name = "STYLE_TYPE_INVALID")
            public static final LargeGradientButtonStyle STYLE_TYPE_INVALID = new LargeGradientButtonStyle("STYLE_TYPE_INVALID", 0, "STYLE_TYPE_INVALID");

            @i(name = "STYLE_TYPE_PRIMARY")
            public static final LargeGradientButtonStyle STYLE_TYPE_PRIMARY = new LargeGradientButtonStyle("STYLE_TYPE_PRIMARY", 1, "STYLE_TYPE_PRIMARY");

            @i(name = "STYLE_TYPE_SECONDARY")
            public static final LargeGradientButtonStyle STYLE_TYPE_SECONDARY = new LargeGradientButtonStyle("STYLE_TYPE_SECONDARY", 2, "STYLE_TYPE_SECONDARY");

            @i(name = "STYLE_TYPE_SECONDARY_WHITE")
            public static final LargeGradientButtonStyle STYLE_TYPE_SECONDARY_WHITE = new LargeGradientButtonStyle("STYLE_TYPE_SECONDARY_WHITE", 3, "STYLE_TYPE_SECONDARY_WHITE");

            @i(name = "STYLE_TYPE_SECONDARY_WHITE_FRESH")
            public static final LargeGradientButtonStyle STYLE_TYPE_SECONDARY_WHITE_FRESH = new LargeGradientButtonStyle("STYLE_TYPE_SECONDARY_WHITE_FRESH", 4, "STYLE_TYPE_SECONDARY_WHITE_FRESH");

            @i(name = "STYLE_TYPE_SECONDARY_CONFIRMED")
            public static final LargeGradientButtonStyle STYLE_TYPE_SECONDARY_CONFIRMED = new LargeGradientButtonStyle("STYLE_TYPE_SECONDARY_CONFIRMED", 5, "STYLE_TYPE_SECONDARY_CONFIRMED");

            @i(name = "STYLE_TYPE_SECONDARY_FRESH")
            public static final LargeGradientButtonStyle STYLE_TYPE_SECONDARY_FRESH = new LargeGradientButtonStyle("STYLE_TYPE_SECONDARY_FRESH", 6, "STYLE_TYPE_SECONDARY_FRESH");

            @i(name = "STYLE_TYPE_DELETE")
            public static final LargeGradientButtonStyle STYLE_TYPE_DELETE = new LargeGradientButtonStyle("STYLE_TYPE_DELETE", 7, "STYLE_TYPE_DELETE");

            @i(name = "STYLE_TYPE_DELETE_WHITE")
            public static final LargeGradientButtonStyle STYLE_TYPE_DELETE_WHITE = new LargeGradientButtonStyle("STYLE_TYPE_DELETE_WHITE", 8, "STYLE_TYPE_DELETE_WHITE");

            @i(name = "STYLE_TYPE_PRIMARY_GREEN")
            public static final LargeGradientButtonStyle STYLE_TYPE_PRIMARY_GREEN = new LargeGradientButtonStyle("STYLE_TYPE_PRIMARY_GREEN", 9, "STYLE_TYPE_PRIMARY_GREEN");

            @i(name = "STYLE_TYPE_PRIMARY_EXPRESS")
            public static final LargeGradientButtonStyle STYLE_TYPE_PRIMARY_EXPRESS = new LargeGradientButtonStyle("STYLE_TYPE_PRIMARY_EXPRESS", 10, "STYLE_TYPE_PRIMARY_EXPRESS");

            @i(name = "STYLE_TYPE_PRIMARY_FRESH")
            public static final LargeGradientButtonStyle STYLE_TYPE_PRIMARY_FRESH = new LargeGradientButtonStyle("STYLE_TYPE_PRIMARY_FRESH", 11, "STYLE_TYPE_PRIMARY_FRESH");

            private static final /* synthetic */ LargeGradientButtonStyle[] $values() {
                return new LargeGradientButtonStyle[]{STYLE_TYPE_INVALID, STYLE_TYPE_PRIMARY, STYLE_TYPE_SECONDARY, STYLE_TYPE_SECONDARY_WHITE, STYLE_TYPE_SECONDARY_WHITE_FRESH, STYLE_TYPE_SECONDARY_CONFIRMED, STYLE_TYPE_SECONDARY_FRESH, STYLE_TYPE_DELETE, STYLE_TYPE_DELETE_WHITE, STYLE_TYPE_PRIMARY_GREEN, STYLE_TYPE_PRIMARY_EXPRESS, STYLE_TYPE_PRIMARY_FRESH};
            }

            static {
                LargeGradientButtonStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private LargeGradientButtonStyle(String str, int i11, String str2) {
                this.key = str2;
            }

            @NotNull
            public static Xc.a<LargeGradientButtonStyle> getEntries() {
                return $ENTRIES;
            }

            public static LargeGradientButtonStyle valueOf(String str) {
                return (LargeGradientButtonStyle) Enum.valueOf(LargeGradientButtonStyle.class, str);
            }

            public static LargeGradientButtonStyle[] values() {
                return (LargeGradientButtonStyle[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ LargeGradientButton(OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, List list, LargeGradientButtonStyle largeGradientButtonStyle, String str2, AtomActionDTO atomActionDTO, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? null : ozonSpannableString2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : list, largeGradientButtonStyle, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str3, (i11 & 256) != 0 ? null : testInfo, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map);
        }

        public static /* synthetic */ LargeGradientButton copy$default(LargeGradientButton largeGradientButton, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, List list, LargeGradientButtonStyle largeGradientButtonStyle, String str2, AtomActionDTO atomActionDTO, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = largeGradientButton.text;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString2 = largeGradientButton.subtext;
            }
            if ((i11 & 4) != 0) {
                str = largeGradientButton.textColor;
            }
            if ((i11 & 8) != 0) {
                list = largeGradientButton.gradientColors;
            }
            if ((i11 & 16) != 0) {
                largeGradientButtonStyle = largeGradientButton.theme;
            }
            if ((i11 & 32) != 0) {
                str2 = largeGradientButton.icon;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = largeGradientButton.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str3 = largeGradientButton.context;
            }
            if ((i11 & 256) != 0) {
                testInfo = largeGradientButton.testInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = largeGradientButton.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str4 = str3;
            LargeGradientButtonStyle largeGradientButtonStyle2 = largeGradientButtonStyle;
            String str5 = str2;
            return largeGradientButton.copy(ozonSpannableString, ozonSpannableString2, str, list, largeGradientButtonStyle2, str5, atomActionDTO2, str4, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getSubtext() {
            return this.subtext;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        public final List<String> component4() {
            return this.gradientColors;
        }

        /* renamed from: component5, reason: from getter */
        public final LargeGradientButtonStyle getTheme() {
            return this.theme;
        }

        /* renamed from: component6, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component8, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component9, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final LargeGradientButton copy(@NotNull OzonSpannableString text, OzonSpannableString subtext, String textColor, List<String> gradientColors, LargeGradientButtonStyle theme, String icon, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new LargeGradientButton(text, subtext, textColor, gradientColors, theme, icon, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LargeGradientButton)) {
                return false;
            }
            LargeGradientButton largeGradientButton = (LargeGradientButton) other;
            return Intrinsics.d(this.text, largeGradientButton.text) && Intrinsics.d(this.subtext, largeGradientButton.subtext) && Intrinsics.d(this.textColor, largeGradientButton.textColor) && Intrinsics.d(this.gradientColors, largeGradientButton.gradientColors) && this.theme == largeGradientButton.theme && Intrinsics.d(this.icon, largeGradientButton.icon) && Intrinsics.d(this.action, largeGradientButton.action) && Intrinsics.d(this.context, largeGradientButton.context) && Intrinsics.d(this.testInfo, largeGradientButton.testInfo) && Intrinsics.d(this.trackingInfo, largeGradientButton.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final List<String> getGradientColors() {
            return this.gradientColors;
        }

        public final String getIcon() {
            return this.icon;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_large_gradient_button;
        }

        public final OzonSpannableString getSubtext() {
            return this.subtext;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public final LargeGradientButtonStyle getTheme() {
            return this.theme;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            OzonSpannableString ozonSpannableString = this.subtext;
            int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
            String str = this.textColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.gradientColors;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            LargeGradientButtonStyle largeGradientButtonStyle = this.theme;
            int hashCode5 = (hashCode4 + (largeGradientButtonStyle == null ? 0 : largeGradientButtonStyle.hashCode())) * 31;
            String str2 = this.icon;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str3 = this.context;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode9 = (hashCode8 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode9 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            OzonSpannableString ozonSpannableString2 = this.subtext;
            String str = this.textColor;
            List<String> list = this.gradientColors;
            LargeGradientButtonStyle largeGradientButtonStyle = this.theme;
            String str2 = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            String str3 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("LargeGradientButton(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", subtext=");
            sb2.append((Object) ozonSpannableString2);
            sb2.append(", textColor=");
            w.d(str, ", gradientColors=", ", theme=", sb2, list);
            sb2.append(largeGradientButtonStyle);
            sb2.append(", icon=");
            sb2.append(str2);
            sb2.append(", action=");
            HY.b.d(", context=", str3, ", testInfo=", sb2, atomActionDTO);
            return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            ozonSpannableStringParceler.write(this.text, dest, flags);
            ozonSpannableStringParceler.write(this.subtext, dest, flags);
            dest.writeString(this.textColor);
            dest.writeStringList(this.gradientColors);
            LargeGradientButtonStyle largeGradientButtonStyle = this.theme;
            if (largeGradientButtonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(largeGradientButtonStyle.name());
            }
            dest.writeString(this.icon);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeGradientButton(@NotNull OzonSpannableString text, OzonSpannableString ozonSpannableString, String str, List<String> list, LargeGradientButtonStyle largeGradientButtonStyle, String str2, AtomActionDTO atomActionDTO, String str3, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.LARGE_GRADIENT_BUTTON, str3, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.subtext = ozonSpannableString;
            this.textColor = str;
            this.gradientColors = list;
            this.theme = largeGradientButtonStyle;
            this.icon = str2;
            this.action = atomActionDTO;
            this.context = str3;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020\u001eJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u001eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tintColor", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButtonStyle;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButtonStyle;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTintColor", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButtonStyle;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    /* loaded from: classes4.dex */
    public static final /* data */ class LargeIconButton extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<LargeIconButton> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;

        @NotNull
        private final String icon;
        private final TestInfo testInfo;
        private final LargeIconButtonStyle theme;
        private final String tintColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LargeIconButton> {
            @Override // android.os.Parcelable.Creator
            public final LargeIconButton createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                LargeIconButtonStyle valueOf = parcel.readInt() == 0 ? null : LargeIconButtonStyle.valueOf(parcel.readString());
                String readString3 = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(LargeIconButton.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new LargeIconButton(readString, createFromParcel, readString2, valueOf, readString3, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final LargeIconButton[] newArray(int i11) {
                return new LargeIconButton[i11];
            }
        }

        public /* synthetic */ LargeIconButton(String str, AtomActionDTO atomActionDTO, String str2, LargeIconButtonStyle largeIconButtonStyle, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : largeIconButtonStyle, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ LargeIconButton copy$default(LargeIconButton largeIconButton, String str, AtomActionDTO atomActionDTO, String str2, LargeIconButtonStyle largeIconButtonStyle, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = largeIconButton.icon;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = largeIconButton.action;
            }
            if ((i11 & 4) != 0) {
                str2 = largeIconButton.tintColor;
            }
            if ((i11 & 8) != 0) {
                largeIconButtonStyle = largeIconButton.theme;
            }
            if ((i11 & 16) != 0) {
                str3 = largeIconButton.context;
            }
            if ((i11 & 32) != 0) {
                testInfo = largeIconButton.testInfo;
            }
            if ((i11 & 64) != 0) {
                map = largeIconButton.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str4 = str3;
            String str5 = str2;
            return largeIconButton.copy(str, atomActionDTO, str5, largeIconButtonStyle, str4, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        /* renamed from: component4, reason: from getter */
        public final LargeIconButtonStyle getTheme() {
            return this.theme;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component6, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final LargeIconButton copy(@NotNull String icon, AtomActionDTO action, String tintColor, LargeIconButtonStyle theme, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new LargeIconButton(icon, action, tintColor, theme, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LargeIconButton)) {
                return false;
            }
            LargeIconButton largeIconButton = (LargeIconButton) other;
            return Intrinsics.d(this.icon, largeIconButton.icon) && Intrinsics.d(this.action, largeIconButton.action) && Intrinsics.d(this.tintColor, largeIconButton.tintColor) && this.theme == largeIconButton.theme && Intrinsics.d(this.context, largeIconButton.context) && Intrinsics.d(this.testInfo, largeIconButton.testInfo) && Intrinsics.d(this.trackingInfo, largeIconButton.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_large_icon_button;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final LargeIconButtonStyle getTheme() {
            return this.theme;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.tintColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            LargeIconButtonStyle largeIconButtonStyle = this.theme;
            int hashCode4 = (hashCode3 + (largeIconButtonStyle == null ? 0 : largeIconButtonStyle.hashCode())) * 31;
            String str2 = this.context;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode6 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.tintColor;
            LargeIconButtonStyle largeIconButtonStyle = this.theme;
            String str3 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("LargeIconButton(icon=", str, ", action=", atomActionDTO, ", tintColor=");
            c11.append(str2);
            c11.append(", theme=");
            c11.append(largeIconButtonStyle);
            c11.append(", context=");
            C4070a.b(c11, str3, ", testInfo=", testInfo, ", trackingInfo=");
            return T7.P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.icon);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.tintColor);
            LargeIconButtonStyle largeIconButtonStyle = this.theme;
            if (largeIconButtonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(largeIconButtonStyle.name());
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LargeIconButton(@NotNull String icon, AtomActionDTO atomActionDTO, String str, LargeIconButtonStyle largeIconButtonStyle, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.LARGE_ICON_BUTTON, str2, testInfo, map, null);
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.action = atomActionDTO;
            this.tintColor = str;
            this.theme = largeIconButtonStyle;
            this.context = str2;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButtonStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "STYLE_TYPE_WHITE", "STYLE_TYPE_SECONDARY", "STYLE_TYPE_SECONDARY_WHITE", "STYLE_TYPE_PRIMARY_FRESH", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LargeIconButtonStyle {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ LargeIconButtonStyle[] $VALUES;

        @NotNull
        private final String key;

        @i(name = "STYLE_TYPE_WHITE")
        public static final LargeIconButtonStyle STYLE_TYPE_WHITE = new LargeIconButtonStyle("STYLE_TYPE_WHITE", 0, "STYLE_TYPE_WHITE");

        @i(name = "STYLE_TYPE_SECONDARY")
        public static final LargeIconButtonStyle STYLE_TYPE_SECONDARY = new LargeIconButtonStyle("STYLE_TYPE_SECONDARY", 1, "STYLE_TYPE_SECONDARY");

        @i(name = "STYLE_TYPE_SECONDARY_WHITE")
        public static final LargeIconButtonStyle STYLE_TYPE_SECONDARY_WHITE = new LargeIconButtonStyle("STYLE_TYPE_SECONDARY_WHITE", 2, "STYLE_TYPE_SECONDARY_WHITE");

        @i(name = "STYLE_TYPE_PRIMARY_FRESH")
        public static final LargeIconButtonStyle STYLE_TYPE_PRIMARY_FRESH = new LargeIconButtonStyle("STYLE_TYPE_PRIMARY_FRESH", 3, "STYLE_TYPE_PRIMARY_FRESH");

        private static final /* synthetic */ LargeIconButtonStyle[] $values() {
            return new LargeIconButtonStyle[]{STYLE_TYPE_WHITE, STYLE_TYPE_SECONDARY, STYLE_TYPE_SECONDARY_WHITE, STYLE_TYPE_PRIMARY_FRESH};
        }

        static {
            LargeIconButtonStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LargeIconButtonStyle(String str, int i11, String str2) {
            this.key = str2;
        }

        @NotNull
        public static Xc.a<LargeIconButtonStyle> getEntries() {
            return $ENTRIES;
        }

        public static LargeIconButtonStyle valueOf(String str) {
            return (LargeIconButtonStyle) Enum.valueOf(LargeIconButtonStyle.class, str);
        }

        public static LargeIconButtonStyle[] values() {
            return (LargeIconButtonStyle[]) $VALUES.clone();
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00017Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010!\u001a\u00020\"H\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Ji\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0006\u0010+\u001a\u00020\"J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\"HÖ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00068"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge$PaymentButtonLargeStyle;", "style", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "context", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge$PaymentButtonLargeStyle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge$PaymentButtonLargeStyle;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;)V", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge$PaymentButtonLargeStyle;", "getStyle$annotations", "()V", "getStyle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getContext", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentButtonLargeStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PaymentButtonLarge extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<PaymentButtonLarge> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final PaymentButtonLargeStyle style;
        private final TestInfo testInfo;
        private final OzonSpannableString text;
        private final PaymentButtonLargeStyle theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<PaymentButtonLarge> {
            @Override // android.os.Parcelable.Creator
            public final PaymentButtonLarge createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LinkedHashMap linkedHashMap = null;
                PaymentButtonLargeStyle valueOf = parcel.readInt() == 0 ? null : PaymentButtonLargeStyle.valueOf(parcel.readString());
                PaymentButtonLargeStyle valueOf2 = parcel.readInt() == 0 ? null : PaymentButtonLargeStyle.valueOf(parcel.readString());
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                PaymentButtonLargeStyle paymentButtonLargeStyle = valueOf2;
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(PaymentButtonLarge.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new PaymentButtonLarge(valueOf, paymentButtonLargeStyle, createFromParcel, create, createFromParcel2, readString, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final PaymentButtonLarge[] newArray(int i11) {
                return new PaymentButtonLarge[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonLarge$PaymentButtonLargeStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "STYLE_TYPE_INVALID", "STYLE_TYPE_NATIVE_PAY", "STYLE_TYPE_FAST_PAY", "STYLE_TYPE_ONLINE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class PaymentButtonLargeStyle {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ PaymentButtonLargeStyle[] $VALUES;

            @NotNull
            private final String key;

            @i(name = "STYLE_TYPE_INVALID")
            public static final PaymentButtonLargeStyle STYLE_TYPE_INVALID = new PaymentButtonLargeStyle("STYLE_TYPE_INVALID", 0, "STYLE_TYPE_INVALID");

            @i(name = "STYLE_TYPE_NATIVE_PAY")
            public static final PaymentButtonLargeStyle STYLE_TYPE_NATIVE_PAY = new PaymentButtonLargeStyle("STYLE_TYPE_NATIVE_PAY", 1, "STYLE_TYPE_NATIVE_PAY");

            @i(name = "STYLE_TYPE_FAST_PAY")
            public static final PaymentButtonLargeStyle STYLE_TYPE_FAST_PAY = new PaymentButtonLargeStyle("STYLE_TYPE_FAST_PAY", 2, "STYLE_TYPE_FAST_PAY");

            @i(name = "STYLE_TYPE_ONLINE")
            public static final PaymentButtonLargeStyle STYLE_TYPE_ONLINE = new PaymentButtonLargeStyle("STYLE_TYPE_ONLINE", 3, "STYLE_TYPE_ONLINE");

            private static final /* synthetic */ PaymentButtonLargeStyle[] $values() {
                return new PaymentButtonLargeStyle[]{STYLE_TYPE_INVALID, STYLE_TYPE_NATIVE_PAY, STYLE_TYPE_FAST_PAY, STYLE_TYPE_ONLINE};
            }

            static {
                PaymentButtonLargeStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private PaymentButtonLargeStyle(String str, int i11, String str2) {
                this.key = str2;
            }

            @NotNull
            public static Xc.a<PaymentButtonLargeStyle> getEntries() {
                return $ENTRIES;
            }

            public static PaymentButtonLargeStyle valueOf(String str) {
                return (PaymentButtonLargeStyle) Enum.valueOf(PaymentButtonLargeStyle.class, str);
            }

            public static PaymentButtonLargeStyle[] values() {
                return (PaymentButtonLargeStyle[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ PaymentButtonLarge(PaymentButtonLargeStyle paymentButtonLargeStyle, PaymentButtonLargeStyle paymentButtonLargeStyle2, AtomActionDTO atomActionDTO, OzonSpannableString ozonSpannableString, TestInfo testInfo, String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentButtonLargeStyle, (i11 & 2) != 0 ? null : paymentButtonLargeStyle2, (i11 & 4) != 0 ? null : atomActionDTO, (i11 & 8) != 0 ? null : ozonSpannableString, (i11 & 16) != 0 ? null : testInfo, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ PaymentButtonLarge copy$default(PaymentButtonLarge paymentButtonLarge, PaymentButtonLargeStyle paymentButtonLargeStyle, PaymentButtonLargeStyle paymentButtonLargeStyle2, AtomActionDTO atomActionDTO, OzonSpannableString ozonSpannableString, TestInfo testInfo, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paymentButtonLargeStyle = paymentButtonLarge.theme;
            }
            if ((i11 & 2) != 0) {
                paymentButtonLargeStyle2 = paymentButtonLarge.style;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = paymentButtonLarge.action;
            }
            if ((i11 & 8) != 0) {
                ozonSpannableString = paymentButtonLarge.text;
            }
            if ((i11 & 16) != 0) {
                testInfo = paymentButtonLarge.testInfo;
            }
            if ((i11 & 32) != 0) {
                str = paymentButtonLarge.context;
            }
            if ((i11 & 64) != 0) {
                map = paymentButtonLarge.trackingInfo;
            }
            String str2 = str;
            Map map2 = map;
            TestInfo testInfo2 = testInfo;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return paymentButtonLarge.copy(paymentButtonLargeStyle, paymentButtonLargeStyle2, atomActionDTO2, ozonSpannableString, testInfo2, str2, map2);
        }

        @InterfaceC3999a
        public static /* synthetic */ void getStyle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentButtonLargeStyle getTheme() {
            return this.theme;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentButtonLargeStyle getStyle() {
            return this.style;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final PaymentButtonLarge copy(PaymentButtonLargeStyle theme, PaymentButtonLargeStyle style, AtomActionDTO action, OzonSpannableString text, TestInfo testInfo, String context, Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new PaymentButtonLarge(theme, style, action, text, testInfo, context, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentButtonLarge)) {
                return false;
            }
            PaymentButtonLarge paymentButtonLarge = (PaymentButtonLarge) other;
            return this.theme == paymentButtonLarge.theme && this.style == paymentButtonLarge.style && Intrinsics.d(this.action, paymentButtonLarge.action) && Intrinsics.d(this.text, paymentButtonLarge.text) && Intrinsics.d(this.testInfo, paymentButtonLarge.testInfo) && Intrinsics.d(this.context, paymentButtonLarge.context) && Intrinsics.d(this.trackingInfo, paymentButtonLarge.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_payment_button_large;
        }

        public final PaymentButtonLargeStyle getStyle() {
            return this.style;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final OzonSpannableString getText() {
            return this.text;
        }

        public final PaymentButtonLargeStyle getTheme() {
            return this.theme;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            PaymentButtonLargeStyle paymentButtonLargeStyle = this.theme;
            int hashCode = (paymentButtonLargeStyle == null ? 0 : paymentButtonLargeStyle.hashCode()) * 31;
            PaymentButtonLargeStyle paymentButtonLargeStyle2 = this.style;
            int hashCode2 = (hashCode + (paymentButtonLargeStyle2 == null ? 0 : paymentButtonLargeStyle2.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            OzonSpannableString ozonSpannableString = this.text;
            int hashCode4 = (hashCode3 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            String str = this.context;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode6 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            PaymentButtonLargeStyle paymentButtonLargeStyle = this.theme;
            PaymentButtonLargeStyle paymentButtonLargeStyle2 = this.style;
            AtomActionDTO atomActionDTO = this.action;
            OzonSpannableString ozonSpannableString = this.text;
            TestInfo testInfo = this.testInfo;
            String str = this.context;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("PaymentButtonLarge(theme=");
            sb2.append(paymentButtonLargeStyle);
            sb2.append(", style=");
            sb2.append(paymentButtonLargeStyle2);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", testInfo=");
            sb2.append(testInfo);
            sb2.append(", context=");
            sb2.append(str);
            sb2.append(", trackingInfo=");
            return T7.P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            PaymentButtonLargeStyle paymentButtonLargeStyle = this.theme;
            if (paymentButtonLargeStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(paymentButtonLargeStyle.name());
            }
            PaymentButtonLargeStyle paymentButtonLargeStyle2 = this.style;
            if (paymentButtonLargeStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(paymentButtonLargeStyle2.name());
            }
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        public PaymentButtonLarge(PaymentButtonLargeStyle paymentButtonLargeStyle, PaymentButtonLargeStyle paymentButtonLargeStyle2, AtomActionDTO atomActionDTO, OzonSpannableString ozonSpannableString, TestInfo testInfo, String str, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.LARGE_PAYMENT_BUTTON, str, testInfo, map, null);
            this.theme = paymentButtonLargeStyle;
            this.style = paymentButtonLargeStyle2;
            this.action = atomActionDTO;
            this.text = ozonSpannableString;
            this.testInfo = testInfo;
            this.context = str;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00017Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010!\u001a\u00020\"H\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Ji\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0006\u0010+\u001a\u00020\"J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\"HÖ\u0001J\t\u00101\u001a\u00020\nHÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00068"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall$PaymentButtonSmallStyle;", "style", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall$PaymentButtonSmallStyle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall$PaymentButtonSmallStyle;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall$PaymentButtonSmallStyle;", "getStyle$annotations", "()V", "getStyle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentButtonSmallStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PaymentButtonSmall extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<PaymentButtonSmall> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final PaymentButtonSmallStyle style;
        private final TestInfo testInfo;
        private final OzonSpannableString text;
        private final PaymentButtonSmallStyle theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<PaymentButtonSmall> {
            @Override // android.os.Parcelable.Creator
            public final PaymentButtonSmall createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LinkedHashMap linkedHashMap = null;
                PaymentButtonSmallStyle valueOf = parcel.readInt() == 0 ? null : PaymentButtonSmallStyle.valueOf(parcel.readString());
                PaymentButtonSmallStyle valueOf2 = parcel.readInt() == 0 ? null : PaymentButtonSmallStyle.valueOf(parcel.readString());
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                PaymentButtonSmallStyle paymentButtonSmallStyle = valueOf;
                String readString = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(PaymentButtonSmall.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new PaymentButtonSmall(paymentButtonSmallStyle, valueOf2, createFromParcel, create, readString, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final PaymentButtonSmall[] newArray(int i11) {
                return new PaymentButtonSmall[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$PaymentButtonSmall$PaymentButtonSmallStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "STYLE_TYPE_INVALID", "STYLE_TYPE_NATIVE_PAY_SMALL", "STYLE_TYPE_FAST_PAY_SMALL", "STYLE_TYPE_ONLINE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class PaymentButtonSmallStyle {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ PaymentButtonSmallStyle[] $VALUES;

            @NotNull
            private final String key;

            @i(name = "STYLE_TYPE_INVALID")
            public static final PaymentButtonSmallStyle STYLE_TYPE_INVALID = new PaymentButtonSmallStyle("STYLE_TYPE_INVALID", 0, "STYLE_TYPE_INVALID");

            @i(name = "STYLE_TYPE_NATIVE_PAY_SMALL")
            public static final PaymentButtonSmallStyle STYLE_TYPE_NATIVE_PAY_SMALL = new PaymentButtonSmallStyle("STYLE_TYPE_NATIVE_PAY_SMALL", 1, "STYLE_TYPE_NATIVE_PAY_SMALL");

            @i(name = "STYLE_TYPE_FAST_PAY_SMALL")
            public static final PaymentButtonSmallStyle STYLE_TYPE_FAST_PAY_SMALL = new PaymentButtonSmallStyle("STYLE_TYPE_FAST_PAY_SMALL", 2, "STYLE_TYPE_FAST_PAY_SMALL");

            @i(name = "STYLE_TYPE_ONLINE")
            public static final PaymentButtonSmallStyle STYLE_TYPE_ONLINE = new PaymentButtonSmallStyle("STYLE_TYPE_ONLINE", 3, "STYLE_TYPE_ONLINE");

            private static final /* synthetic */ PaymentButtonSmallStyle[] $values() {
                return new PaymentButtonSmallStyle[]{STYLE_TYPE_INVALID, STYLE_TYPE_NATIVE_PAY_SMALL, STYLE_TYPE_FAST_PAY_SMALL, STYLE_TYPE_ONLINE};
            }

            static {
                PaymentButtonSmallStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private PaymentButtonSmallStyle(String str, int i11, String str2) {
                this.key = str2;
            }

            @NotNull
            public static Xc.a<PaymentButtonSmallStyle> getEntries() {
                return $ENTRIES;
            }

            public static PaymentButtonSmallStyle valueOf(String str) {
                return (PaymentButtonSmallStyle) Enum.valueOf(PaymentButtonSmallStyle.class, str);
            }

            public static PaymentButtonSmallStyle[] values() {
                return (PaymentButtonSmallStyle[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ PaymentButtonSmall(PaymentButtonSmallStyle paymentButtonSmallStyle, PaymentButtonSmallStyle paymentButtonSmallStyle2, AtomActionDTO atomActionDTO, OzonSpannableString ozonSpannableString, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentButtonSmallStyle, (i11 & 2) != 0 ? null : paymentButtonSmallStyle2, atomActionDTO, (i11 & 8) != 0 ? null : ozonSpannableString, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ PaymentButtonSmall copy$default(PaymentButtonSmall paymentButtonSmall, PaymentButtonSmallStyle paymentButtonSmallStyle, PaymentButtonSmallStyle paymentButtonSmallStyle2, AtomActionDTO atomActionDTO, OzonSpannableString ozonSpannableString, String str, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paymentButtonSmallStyle = paymentButtonSmall.theme;
            }
            if ((i11 & 2) != 0) {
                paymentButtonSmallStyle2 = paymentButtonSmall.style;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = paymentButtonSmall.action;
            }
            if ((i11 & 8) != 0) {
                ozonSpannableString = paymentButtonSmall.text;
            }
            if ((i11 & 16) != 0) {
                str = paymentButtonSmall.context;
            }
            if ((i11 & 32) != 0) {
                testInfo = paymentButtonSmall.testInfo;
            }
            if ((i11 & 64) != 0) {
                map = paymentButtonSmall.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str2 = str;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return paymentButtonSmall.copy(paymentButtonSmallStyle, paymentButtonSmallStyle2, atomActionDTO2, ozonSpannableString, str2, testInfo2, map2);
        }

        @InterfaceC3999a
        public static /* synthetic */ void getStyle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentButtonSmallStyle getTheme() {
            return this.theme;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentButtonSmallStyle getStyle() {
            return this.style;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component6, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final PaymentButtonSmall copy(PaymentButtonSmallStyle theme, PaymentButtonSmallStyle style, AtomActionDTO action, OzonSpannableString text, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new PaymentButtonSmall(theme, style, action, text, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentButtonSmall)) {
                return false;
            }
            PaymentButtonSmall paymentButtonSmall = (PaymentButtonSmall) other;
            return this.theme == paymentButtonSmall.theme && this.style == paymentButtonSmall.style && Intrinsics.d(this.action, paymentButtonSmall.action) && Intrinsics.d(this.text, paymentButtonSmall.text) && Intrinsics.d(this.context, paymentButtonSmall.context) && Intrinsics.d(this.testInfo, paymentButtonSmall.testInfo) && Intrinsics.d(this.trackingInfo, paymentButtonSmall.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_payment_button_small;
        }

        public final PaymentButtonSmallStyle getStyle() {
            return this.style;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final OzonSpannableString getText() {
            return this.text;
        }

        public final PaymentButtonSmallStyle getTheme() {
            return this.theme;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            PaymentButtonSmallStyle paymentButtonSmallStyle = this.theme;
            int hashCode = (paymentButtonSmallStyle == null ? 0 : paymentButtonSmallStyle.hashCode()) * 31;
            PaymentButtonSmallStyle paymentButtonSmallStyle2 = this.style;
            int hashCode2 = (hashCode + (paymentButtonSmallStyle2 == null ? 0 : paymentButtonSmallStyle2.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            OzonSpannableString ozonSpannableString = this.text;
            int hashCode4 = (hashCode3 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
            String str = this.context;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode6 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            PaymentButtonSmallStyle paymentButtonSmallStyle = this.theme;
            PaymentButtonSmallStyle paymentButtonSmallStyle2 = this.style;
            AtomActionDTO atomActionDTO = this.action;
            OzonSpannableString ozonSpannableString = this.text;
            String str = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("PaymentButtonSmall(theme=");
            sb2.append(paymentButtonSmallStyle);
            sb2.append(", style=");
            sb2.append(paymentButtonSmallStyle2);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", context=");
            C4070a.b(sb2, str, ", testInfo=", testInfo, ", trackingInfo=");
            return T7.P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            PaymentButtonSmallStyle paymentButtonSmallStyle = this.theme;
            if (paymentButtonSmallStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(paymentButtonSmallStyle.name());
            }
            PaymentButtonSmallStyle paymentButtonSmallStyle2 = this.style;
            if (paymentButtonSmallStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(paymentButtonSmallStyle2.name());
            }
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        public PaymentButtonSmall(PaymentButtonSmallStyle paymentButtonSmallStyle, PaymentButtonSmallStyle paymentButtonSmallStyle2, AtomActionDTO atomActionDTO, OzonSpannableString ozonSpannableString, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.SMALL_PAYMENT_BUTTON, str, testInfo, map, null);
            this.theme = paymentButtonSmallStyle;
            this.style = paymentButtonSmallStyle2;
            this.action = atomActionDTO;
            this.text = ozonSpannableString;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00019Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010$\u001a\u00020%H\u0016J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003Je\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0006\u0010.\u001a\u00020%J\u0013\u0010/\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020%HÖ\u0001J\t\u00103\u001a\u00020\nHÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006:"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "Lru/ozon/uni/atoms/common/HTMLTagSupport;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton$SmallBorderLessButtonTheme;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "tagSupported", "", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton$SmallBorderLessButtonTheme;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Z)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton$SmallBorderLessButtonTheme;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getTagSupported", "()Z", "setTagSupported", "(Z)V", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SmallBorderLessButtonTheme", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SmallBorderlessButton extends ButtonV3Atom implements HTMLTagSupport {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<SmallBorderlessButton> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private transient boolean tagSupported;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final SmallBorderLessButtonTheme theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<SmallBorderlessButton> {
            @Override // android.os.Parcelable.Creator
            public final SmallBorderlessButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                LinkedHashMap linkedHashMap = null;
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                SmallBorderLessButtonTheme valueOf = parcel.readInt() == 0 ? null : SmallBorderLessButtonTheme.valueOf(parcel.readString());
                String readString = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(SmallBorderlessButton.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new SmallBorderlessButton(create, createFromParcel, valueOf, readString, createFromParcel2, linkedHashMap, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final SmallBorderlessButton[] newArray(int i11) {
                return new SmallBorderlessButton[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton$SmallBorderLessButtonTheme;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "THEME_TYPE_INVALID", "THEME_TYPE_DEFAULT", "THEME_TYPE_BOLD", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SmallBorderLessButtonTheme {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ SmallBorderLessButtonTheme[] $VALUES;

            @NotNull
            private final String key;

            @i(name = "THEME_TYPE_INVALID")
            public static final SmallBorderLessButtonTheme THEME_TYPE_INVALID = new SmallBorderLessButtonTheme("THEME_TYPE_INVALID", 0, "THEME_TYPE_INVALID");

            @i(name = "THEME_TYPE_DEFAULT")
            public static final SmallBorderLessButtonTheme THEME_TYPE_DEFAULT = new SmallBorderLessButtonTheme("THEME_TYPE_DEFAULT", 1, "THEME_TYPE_DEFAULT");

            @i(name = "THEME_TYPE_BOLD")
            public static final SmallBorderLessButtonTheme THEME_TYPE_BOLD = new SmallBorderLessButtonTheme("THEME_TYPE_BOLD", 2, "THEME_TYPE_BOLD");

            private static final /* synthetic */ SmallBorderLessButtonTheme[] $values() {
                return new SmallBorderLessButtonTheme[]{THEME_TYPE_INVALID, THEME_TYPE_DEFAULT, THEME_TYPE_BOLD};
            }

            static {
                SmallBorderLessButtonTheme[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private SmallBorderLessButtonTheme(String str, int i11, String str2) {
                this.key = str2;
            }

            @NotNull
            public static Xc.a<SmallBorderLessButtonTheme> getEntries() {
                return $ENTRIES;
            }

            public static SmallBorderLessButtonTheme valueOf(String str) {
                return (SmallBorderLessButtonTheme) Enum.valueOf(SmallBorderLessButtonTheme.class, str);
            }

            public static SmallBorderLessButtonTheme[] values() {
                return (SmallBorderLessButtonTheme[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ SmallBorderlessButton(OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, SmallBorderLessButtonTheme smallBorderLessButtonTheme, String str, TestInfo testInfo, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? null : atomActionDTO, (i11 & 4) != 0 ? null : smallBorderLessButtonTheme, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : testInfo, (i11 & 32) != 0 ? null : map, (i11 & 64) != 0 ? false : z11);
        }

        public static /* synthetic */ SmallBorderlessButton copy$default(SmallBorderlessButton smallBorderlessButton, OzonSpannableString ozonSpannableString, AtomActionDTO atomActionDTO, SmallBorderLessButtonTheme smallBorderLessButtonTheme, String str, TestInfo testInfo, Map map, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = smallBorderlessButton.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = smallBorderlessButton.action;
            }
            if ((i11 & 4) != 0) {
                smallBorderLessButtonTheme = smallBorderlessButton.theme;
            }
            if ((i11 & 8) != 0) {
                str = smallBorderlessButton.context;
            }
            if ((i11 & 16) != 0) {
                testInfo = smallBorderlessButton.testInfo;
            }
            if ((i11 & 32) != 0) {
                map = smallBorderlessButton.trackingInfo;
            }
            if ((i11 & 64) != 0) {
                z11 = smallBorderlessButton.tagSupported;
            }
            Map map2 = map;
            boolean z12 = z11;
            TestInfo testInfo2 = testInfo;
            SmallBorderLessButtonTheme smallBorderLessButtonTheme2 = smallBorderLessButtonTheme;
            return smallBorderlessButton.copy(ozonSpannableString, atomActionDTO, smallBorderLessButtonTheme2, str, testInfo2, map2, z12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final SmallBorderLessButtonTheme getTheme() {
            return this.theme;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getTagSupported() {
            return this.tagSupported;
        }

        @NotNull
        public final SmallBorderlessButton copy(@NotNull OzonSpannableString text, AtomActionDTO action, SmallBorderLessButtonTheme theme, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, boolean tagSupported) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new SmallBorderlessButton(text, action, theme, context, testInfo, trackingInfo, tagSupported);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmallBorderlessButton)) {
                return false;
            }
            SmallBorderlessButton smallBorderlessButton = (SmallBorderlessButton) other;
            return Intrinsics.d(this.text, smallBorderlessButton.text) && Intrinsics.d(this.action, smallBorderlessButton.action) && this.theme == smallBorderlessButton.theme && Intrinsics.d(this.context, smallBorderlessButton.context) && Intrinsics.d(this.testInfo, smallBorderlessButton.testInfo) && Intrinsics.d(this.trackingInfo, smallBorderlessButton.trackingInfo) && this.tagSupported == smallBorderlessButton.tagSupported;
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_small_borderless_button;
        }

        public boolean getTagSupported() {
            return this.tagSupported;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final SmallBorderLessButtonTheme getTheme() {
            return this.theme;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            SmallBorderLessButtonTheme smallBorderLessButtonTheme = this.theme;
            int hashCode3 = (hashCode2 + (smallBorderLessButtonTheme == null ? 0 : smallBorderLessButtonTheme.hashCode())) * 31;
            String str = this.context;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return Boolean.hashCode(this.tagSupported) + ((hashCode5 + (map != null ? map.hashCode() : 0)) * 31);
        }

        @Override // ru.ozon.uni.atoms.common.HTMLTagSupport
        public void setTagSupported(boolean z11) {
            this.tagSupported = z11;
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            AtomActionDTO atomActionDTO = this.action;
            SmallBorderLessButtonTheme smallBorderLessButtonTheme = this.theme;
            String str = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            boolean z11 = this.tagSupported;
            StringBuilder sb2 = new StringBuilder("SmallBorderlessButton(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", theme=");
            sb2.append(smallBorderLessButtonTheme);
            sb2.append(", context=");
            sb2.append(str);
            sb2.append(", testInfo=");
            sb2.append(testInfo);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", tagSupported=");
            return Pk0.a.a(")", sb2, z11);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            SmallBorderLessButtonTheme smallBorderLessButtonTheme = this.theme;
            if (smallBorderLessButtonTheme == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(smallBorderLessButtonTheme.name());
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }
            dest.writeInt(this.tagSupported ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallBorderlessButton(@NotNull OzonSpannableString text, AtomActionDTO atomActionDTO, SmallBorderLessButtonTheme smallBorderLessButtonTheme, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, boolean z11) {
            super(AtomTypeImpl.SMALL_BORDERLESS_BUTTON, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.theme = smallBorderLessButtonTheme;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
            this.tagSupported = z11;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00018Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010!\u001a\u00020\"H\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Js\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0006\u0010,\u001a\u00020\"J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\"HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00069"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tintColor", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon$SmallBorderlessButtonWithIconTheme;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon$SmallBorderlessButtonWithIconTheme;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTintColor", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon$SmallBorderlessButtonWithIconTheme;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SmallBorderlessButtonWithIconTheme", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SmallBorderlessButtonWithIcon extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<SmallBorderlessButtonWithIcon> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;

        @NotNull
        private final String icon;
        private final TestInfo testInfo;
        private final OzonSpannableString text;
        private final SmallBorderlessButtonWithIconTheme theme;
        private final String tintColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<SmallBorderlessButtonWithIcon> {
            @Override // android.os.Parcelable.Creator
            public final SmallBorderlessButtonWithIcon createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                String readString = parcel.readString();
                LinkedHashMap linkedHashMap = null;
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                SmallBorderlessButtonWithIconTheme valueOf = parcel.readInt() == 0 ? null : SmallBorderlessButtonWithIconTheme.valueOf(parcel.readString());
                String readString3 = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(SmallBorderlessButtonWithIcon.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new SmallBorderlessButtonWithIcon(create, readString, createFromParcel, readString2, valueOf, readString3, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final SmallBorderlessButtonWithIcon[] newArray(int i11) {
                return new SmallBorderlessButtonWithIcon[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon$SmallBorderlessButtonWithIconTheme;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "THEME_TYPE_DEFAULT", "THEME_TYPE_BOLD", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SmallBorderlessButtonWithIconTheme {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ SmallBorderlessButtonWithIconTheme[] $VALUES;

            @NotNull
            private final String key;

            @i(name = "THEME_TYPE_DEFAULT")
            public static final SmallBorderlessButtonWithIconTheme THEME_TYPE_DEFAULT = new SmallBorderlessButtonWithIconTheme("THEME_TYPE_DEFAULT", 0, "THEME_TYPE_DEFAULT");

            @i(name = "THEME_TYPE_BOLD")
            public static final SmallBorderlessButtonWithIconTheme THEME_TYPE_BOLD = new SmallBorderlessButtonWithIconTheme("THEME_TYPE_BOLD", 1, "THEME_TYPE_BOLD");

            private static final /* synthetic */ SmallBorderlessButtonWithIconTheme[] $values() {
                return new SmallBorderlessButtonWithIconTheme[]{THEME_TYPE_DEFAULT, THEME_TYPE_BOLD};
            }

            static {
                SmallBorderlessButtonWithIconTheme[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private SmallBorderlessButtonWithIconTheme(String str, int i11, String str2) {
                this.key = str2;
            }

            @NotNull
            public static Xc.a<SmallBorderlessButtonWithIconTheme> getEntries() {
                return $ENTRIES;
            }

            public static SmallBorderlessButtonWithIconTheme valueOf(String str) {
                return (SmallBorderlessButtonWithIconTheme) Enum.valueOf(SmallBorderlessButtonWithIconTheme.class, str);
            }

            public static SmallBorderlessButtonWithIconTheme[] values() {
                return (SmallBorderlessButtonWithIconTheme[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ SmallBorderlessButtonWithIcon(OzonSpannableString ozonSpannableString, String str, AtomActionDTO atomActionDTO, String str2, SmallBorderlessButtonWithIconTheme smallBorderlessButtonWithIconTheme, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : ozonSpannableString, str, (i11 & 4) != 0 ? null : atomActionDTO, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : smallBorderlessButtonWithIconTheme, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : testInfo, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map);
        }

        public static /* synthetic */ SmallBorderlessButtonWithIcon copy$default(SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon, OzonSpannableString ozonSpannableString, String str, AtomActionDTO atomActionDTO, String str2, SmallBorderlessButtonWithIconTheme smallBorderlessButtonWithIconTheme, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = smallBorderlessButtonWithIcon.text;
            }
            if ((i11 & 2) != 0) {
                str = smallBorderlessButtonWithIcon.icon;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = smallBorderlessButtonWithIcon.action;
            }
            if ((i11 & 8) != 0) {
                str2 = smallBorderlessButtonWithIcon.tintColor;
            }
            if ((i11 & 16) != 0) {
                smallBorderlessButtonWithIconTheme = smallBorderlessButtonWithIcon.theme;
            }
            if ((i11 & 32) != 0) {
                str3 = smallBorderlessButtonWithIcon.context;
            }
            if ((i11 & 64) != 0) {
                testInfo = smallBorderlessButtonWithIcon.testInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = smallBorderlessButtonWithIcon.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            SmallBorderlessButtonWithIconTheme smallBorderlessButtonWithIconTheme2 = smallBorderlessButtonWithIconTheme;
            String str4 = str3;
            return smallBorderlessButtonWithIcon.copy(ozonSpannableString, str, atomActionDTO, str2, smallBorderlessButtonWithIconTheme2, str4, testInfo2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        /* renamed from: component5, reason: from getter */
        public final SmallBorderlessButtonWithIconTheme getTheme() {
            return this.theme;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component7, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final SmallBorderlessButtonWithIcon copy(OzonSpannableString text, @NotNull String icon, AtomActionDTO action, String tintColor, SmallBorderlessButtonWithIconTheme theme, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new SmallBorderlessButtonWithIcon(text, icon, action, tintColor, theme, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmallBorderlessButtonWithIcon)) {
                return false;
            }
            SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = (SmallBorderlessButtonWithIcon) other;
            return Intrinsics.d(this.text, smallBorderlessButtonWithIcon.text) && Intrinsics.d(this.icon, smallBorderlessButtonWithIcon.icon) && Intrinsics.d(this.action, smallBorderlessButtonWithIcon.action) && Intrinsics.d(this.tintColor, smallBorderlessButtonWithIcon.tintColor) && this.theme == smallBorderlessButtonWithIcon.theme && Intrinsics.d(this.context, smallBorderlessButtonWithIcon.context) && Intrinsics.d(this.testInfo, smallBorderlessButtonWithIcon.testInfo) && Intrinsics.d(this.trackingInfo, smallBorderlessButtonWithIcon.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_small_borderless_button_with_icon;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final OzonSpannableString getText() {
            return this.text;
        }

        public final SmallBorderlessButtonWithIconTheme getTheme() {
            return this.theme;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            OzonSpannableString ozonSpannableString = this.text;
            int a11 = g.a((ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31, 31, this.icon);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.tintColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            SmallBorderlessButtonWithIconTheme smallBorderlessButtonWithIconTheme = this.theme;
            int hashCode3 = (hashCode2 + (smallBorderlessButtonWithIconTheme == null ? 0 : smallBorderlessButtonWithIconTheme.hashCode())) * 31;
            String str2 = this.context;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode5 = (hashCode4 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            String str = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.tintColor;
            SmallBorderlessButtonWithIconTheme smallBorderlessButtonWithIconTheme = this.theme;
            String str3 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder f7 = GR.b.f("SmallBorderlessButtonWithIcon(text=", ozonSpannableString, ", icon=", str, ", action=");
            HY.b.d(", tintColor=", str2, ", theme=", f7, atomActionDTO);
            f7.append(smallBorderlessButtonWithIconTheme);
            f7.append(", context=");
            f7.append(str3);
            f7.append(", testInfo=");
            return C2639a.a(", trackingInfo=", ")", f7, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            dest.writeString(this.icon);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.tintColor);
            SmallBorderlessButtonWithIconTheme smallBorderlessButtonWithIconTheme = this.theme;
            if (smallBorderlessButtonWithIconTheme == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(smallBorderlessButtonWithIconTheme.name());
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallBorderlessButtonWithIcon(OzonSpannableString ozonSpannableString, @NotNull String icon, AtomActionDTO atomActionDTO, String str, SmallBorderlessButtonWithIconTheme smallBorderlessButtonWithIconTheme, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.SMALL_BORDERLESS_BUTTON_WITH_ICON, str2, testInfo, map, null);
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.text = ozonSpannableString;
            this.icon = icon;
            this.action = atomActionDTO;
            this.tintColor = str;
            this.theme = smallBorderlessButtonWithIconTheme;
            this.context = str2;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00017Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jg\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0006\u0010+\u001a\u00020\"J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\"HÖ\u0001J\t\u00101\u001a\u00020\nHÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00068"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton$SmallButtonStyle;", "style", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton$SmallButtonStyle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton$SmallButtonStyle;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton$SmallButtonStyle;", "getStyle$annotations", "()V", "getStyle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SmallButtonStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SmallButton extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<SmallButton> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final SmallButtonStyle style;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final SmallButtonStyle theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<SmallButton> {
            @Override // android.os.Parcelable.Creator
            public final SmallButton createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                SmallButtonStyle valueOf = parcel.readInt() == 0 ? null : SmallButtonStyle.valueOf(parcel.readString());
                SmallButtonStyle valueOf2 = parcel.readInt() == 0 ? null : SmallButtonStyle.valueOf(parcel.readString());
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(SmallButton.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new SmallButton(create, valueOf, valueOf2, createFromParcel, readString, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final SmallButton[] newArray(int i11) {
                return new SmallButton[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton$SmallButtonStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "STYLE_TYPE_PRIMARY_GREEN_SMALL", "STYLE_TYPE_INVALID", "STYLE_TYPE_PRIMARY_SMALL", "STYLE_TYPE_PRIMARY_FRESH_SMALL", "STYLE_TYPE_SECONDARY_SMALL", "STYLE_TYPE_SECONDARY_SMALL_FRESH", "STYLE_TYPE_SECONDARY_WHITE_SMALL", "STYLE_TYPE_SECONDARY_CONFIRMED_SMALL", "STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH", "STYLE_TYPE_DELETE_SMALL", "STYLE_TYPE_DELETE_WHITE_SMALL", "STYLE_TYPE_PRIMARY_EXPRESS_SMALL", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SmallButtonStyle {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ SmallButtonStyle[] $VALUES;

            @NotNull
            private final String key;

            @i(name = "STYLE_TYPE_PRIMARY_GREEN_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_PRIMARY_GREEN_SMALL = new SmallButtonStyle("STYLE_TYPE_PRIMARY_GREEN_SMALL", 0, "STYLE_TYPE_PRIMARY_GREEN_SMALL");

            @i(name = "STYLE_TYPE_INVALID")
            public static final SmallButtonStyle STYLE_TYPE_INVALID = new SmallButtonStyle("STYLE_TYPE_INVALID", 1, "STYLE_TYPE_INVALID");

            @i(name = "STYLE_TYPE_PRIMARY_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_PRIMARY_SMALL = new SmallButtonStyle("STYLE_TYPE_PRIMARY_SMALL", 2, "STYLE_TYPE_PRIMARY_SMALL");

            @i(name = "STYLE_TYPE_PRIMARY_FRESH_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_PRIMARY_FRESH_SMALL = new SmallButtonStyle("STYLE_TYPE_PRIMARY_FRESH_SMALL", 3, "STYLE_TYPE_PRIMARY_FRESH_SMALL");

            @i(name = "STYLE_TYPE_SECONDARY_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_SECONDARY_SMALL = new SmallButtonStyle("STYLE_TYPE_SECONDARY_SMALL", 4, "STYLE_TYPE_SECONDARY_SMALL");

            @i(name = "STYLE_TYPE_SECONDARY_SMALL_FRESH")
            public static final SmallButtonStyle STYLE_TYPE_SECONDARY_SMALL_FRESH = new SmallButtonStyle("STYLE_TYPE_SECONDARY_SMALL_FRESH", 5, "STYLE_TYPE_SECONDARY_SMALL_FRESH");

            @i(name = "STYLE_TYPE_SECONDARY_WHITE_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_SECONDARY_WHITE_SMALL = new SmallButtonStyle("STYLE_TYPE_SECONDARY_WHITE_SMALL", 6, "STYLE_TYPE_SECONDARY_WHITE_SMALL");

            @i(name = "STYLE_TYPE_SECONDARY_CONFIRMED_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_SECONDARY_CONFIRMED_SMALL = new SmallButtonStyle("STYLE_TYPE_SECONDARY_CONFIRMED_SMALL", 7, "STYLE_TYPE_SECONDARY_CONFIRMED_SMALL");

            @i(name = "STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH")
            public static final SmallButtonStyle STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH = new SmallButtonStyle("STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH", 8, "STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH");

            @i(name = "STYLE_TYPE_DELETE_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_DELETE_SMALL = new SmallButtonStyle("STYLE_TYPE_DELETE_SMALL", 9, "STYLE_TYPE_DELETE_SMALL");

            @i(name = "STYLE_TYPE_DELETE_WHITE_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_DELETE_WHITE_SMALL = new SmallButtonStyle("STYLE_TYPE_DELETE_WHITE_SMALL", 10, "STYLE_TYPE_DELETE_WHITE_SMALL");

            @i(name = "STYLE_TYPE_PRIMARY_EXPRESS_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_PRIMARY_EXPRESS_SMALL = new SmallButtonStyle("STYLE_TYPE_PRIMARY_EXPRESS_SMALL", 11, "STYLE_TYPE_PRIMARY_EXPRESS_SMALL");

            private static final /* synthetic */ SmallButtonStyle[] $values() {
                return new SmallButtonStyle[]{STYLE_TYPE_PRIMARY_GREEN_SMALL, STYLE_TYPE_INVALID, STYLE_TYPE_PRIMARY_SMALL, STYLE_TYPE_PRIMARY_FRESH_SMALL, STYLE_TYPE_SECONDARY_SMALL, STYLE_TYPE_SECONDARY_SMALL_FRESH, STYLE_TYPE_SECONDARY_WHITE_SMALL, STYLE_TYPE_SECONDARY_CONFIRMED_SMALL, STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH, STYLE_TYPE_DELETE_SMALL, STYLE_TYPE_DELETE_WHITE_SMALL, STYLE_TYPE_PRIMARY_EXPRESS_SMALL};
            }

            static {
                SmallButtonStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private SmallButtonStyle(String str, int i11, String str2) {
                this.key = str2;
            }

            @NotNull
            public static Xc.a<SmallButtonStyle> getEntries() {
                return $ENTRIES;
            }

            public static SmallButtonStyle valueOf(String str) {
                return (SmallButtonStyle) Enum.valueOf(SmallButtonStyle.class, str);
            }

            public static SmallButtonStyle[] values() {
                return (SmallButtonStyle[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ SmallButton(OzonSpannableString ozonSpannableString, SmallButtonStyle smallButtonStyle, SmallButtonStyle smallButtonStyle2, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, smallButtonStyle, (i11 & 4) != 0 ? null : smallButtonStyle2, (i11 & 8) != 0 ? null : atomActionDTO, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ SmallButton copy$default(SmallButton smallButton, OzonSpannableString ozonSpannableString, SmallButtonStyle smallButtonStyle, SmallButtonStyle smallButtonStyle2, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = smallButton.text;
            }
            if ((i11 & 2) != 0) {
                smallButtonStyle = smallButton.theme;
            }
            if ((i11 & 4) != 0) {
                smallButtonStyle2 = smallButton.style;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = smallButton.action;
            }
            if ((i11 & 16) != 0) {
                str = smallButton.context;
            }
            if ((i11 & 32) != 0) {
                testInfo = smallButton.testInfo;
            }
            if ((i11 & 64) != 0) {
                map = smallButton.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str2 = str;
            SmallButtonStyle smallButtonStyle3 = smallButtonStyle2;
            return smallButton.copy(ozonSpannableString, smallButtonStyle, smallButtonStyle3, atomActionDTO, str2, testInfo2, map2);
        }

        @InterfaceC3999a
        public static /* synthetic */ void getStyle$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final SmallButtonStyle getTheme() {
            return this.theme;
        }

        /* renamed from: component3, reason: from getter */
        public final SmallButtonStyle getStyle() {
            return this.style;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component6, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final SmallButton copy(@NotNull OzonSpannableString text, SmallButtonStyle theme, SmallButtonStyle style, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new SmallButton(text, theme, style, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmallButton)) {
                return false;
            }
            SmallButton smallButton = (SmallButton) other;
            return Intrinsics.d(this.text, smallButton.text) && this.theme == smallButton.theme && this.style == smallButton.style && Intrinsics.d(this.action, smallButton.action) && Intrinsics.d(this.context, smallButton.context) && Intrinsics.d(this.testInfo, smallButton.testInfo) && Intrinsics.d(this.trackingInfo, smallButton.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_small_button;
        }

        public final SmallButtonStyle getStyle() {
            return this.style;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final SmallButtonStyle getTheme() {
            return this.theme;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            SmallButtonStyle smallButtonStyle = this.theme;
            int hashCode2 = (hashCode + (smallButtonStyle == null ? 0 : smallButtonStyle.hashCode())) * 31;
            SmallButtonStyle smallButtonStyle2 = this.style;
            int hashCode3 = (hashCode2 + (smallButtonStyle2 == null ? 0 : smallButtonStyle2.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode6 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            SmallButtonStyle smallButtonStyle = this.theme;
            SmallButtonStyle smallButtonStyle2 = this.style;
            AtomActionDTO atomActionDTO = this.action;
            String str = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("SmallButton(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", theme=");
            sb2.append(smallButtonStyle);
            sb2.append(", style=");
            sb2.append(smallButtonStyle2);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", context=");
            C4070a.b(sb2, str, ", testInfo=", testInfo, ", trackingInfo=");
            return T7.P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            SmallButtonStyle smallButtonStyle = this.theme;
            if (smallButtonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(smallButtonStyle.name());
            }
            SmallButtonStyle smallButtonStyle2 = this.style;
            if (smallButtonStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(smallButtonStyle2.name());
            }
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallButton(@NotNull OzonSpannableString text, SmallButtonStyle smallButtonStyle, SmallButtonStyle smallButtonStyle2, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.SMALL_BUTTON, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.theme = smallButtonStyle;
            this.style = smallButtonStyle2;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020\u001eJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u001eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tintColor", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButtonStyle;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButtonStyle;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTintColor", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButtonStyle;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SmallIconButton extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<SmallIconButton> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;

        @NotNull
        private final String icon;
        private final TestInfo testInfo;
        private final SmallIconButtonStyle theme;
        private final String tintColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SmallIconButton> {
            @Override // android.os.Parcelable.Creator
            public final SmallIconButton createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                SmallIconButtonStyle valueOf = parcel.readInt() == 0 ? null : SmallIconButtonStyle.valueOf(parcel.readString());
                String readString3 = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(SmallIconButton.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new SmallIconButton(readString, createFromParcel, readString2, valueOf, readString3, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final SmallIconButton[] newArray(int i11) {
                return new SmallIconButton[i11];
            }
        }

        public /* synthetic */ SmallIconButton(String str, AtomActionDTO atomActionDTO, String str2, SmallIconButtonStyle smallIconButtonStyle, String str3, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : smallIconButtonStyle, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ SmallIconButton copy$default(SmallIconButton smallIconButton, String str, AtomActionDTO atomActionDTO, String str2, SmallIconButtonStyle smallIconButtonStyle, String str3, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = smallIconButton.icon;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = smallIconButton.action;
            }
            if ((i11 & 4) != 0) {
                str2 = smallIconButton.tintColor;
            }
            if ((i11 & 8) != 0) {
                smallIconButtonStyle = smallIconButton.theme;
            }
            if ((i11 & 16) != 0) {
                str3 = smallIconButton.context;
            }
            if ((i11 & 32) != 0) {
                testInfo = smallIconButton.testInfo;
            }
            if ((i11 & 64) != 0) {
                map = smallIconButton.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str4 = str3;
            String str5 = str2;
            return smallIconButton.copy(str, atomActionDTO, str5, smallIconButtonStyle, str4, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        /* renamed from: component4, reason: from getter */
        public final SmallIconButtonStyle getTheme() {
            return this.theme;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component6, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final SmallIconButton copy(@NotNull String icon, AtomActionDTO action, String tintColor, SmallIconButtonStyle theme, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new SmallIconButton(icon, action, tintColor, theme, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmallIconButton)) {
                return false;
            }
            SmallIconButton smallIconButton = (SmallIconButton) other;
            return Intrinsics.d(this.icon, smallIconButton.icon) && Intrinsics.d(this.action, smallIconButton.action) && Intrinsics.d(this.tintColor, smallIconButton.tintColor) && this.theme == smallIconButton.theme && Intrinsics.d(this.context, smallIconButton.context) && Intrinsics.d(this.testInfo, smallIconButton.testInfo) && Intrinsics.d(this.trackingInfo, smallIconButton.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_small_icon_button;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final SmallIconButtonStyle getTheme() {
            return this.theme;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.tintColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            SmallIconButtonStyle smallIconButtonStyle = this.theme;
            int hashCode4 = (hashCode3 + (smallIconButtonStyle == null ? 0 : smallIconButtonStyle.hashCode())) * 31;
            String str2 = this.context;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode6 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.tintColor;
            SmallIconButtonStyle smallIconButtonStyle = this.theme;
            String str3 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("SmallIconButton(icon=", str, ", action=", atomActionDTO, ", tintColor=");
            c11.append(str2);
            c11.append(", theme=");
            c11.append(smallIconButtonStyle);
            c11.append(", context=");
            C4070a.b(c11, str3, ", testInfo=", testInfo, ", trackingInfo=");
            return T7.P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.icon);
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.tintColor);
            SmallIconButtonStyle smallIconButtonStyle = this.theme;
            if (smallIconButtonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(smallIconButtonStyle.name());
            }
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallIconButton(@NotNull String icon, AtomActionDTO atomActionDTO, String str, SmallIconButtonStyle smallIconButtonStyle, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.SMALL_ICON_BUTTON, str2, testInfo, map, null);
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.action = atomActionDTO;
            this.tintColor = str;
            this.theme = smallIconButtonStyle;
            this.context = str2;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButtonStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "STYLE_TYPE_WHITE", "STYLE_TYPE_PRIMARY", "STYLE_TYPE_SECONDARY", "STYLE_TYPE_CLEAR", "STYLE_TYPE_SECONDARY_CONFIRMED", "STYLE_TYPE_PRIMARY_FRESH", "STYLE_TYPE_DELETE", "STYLE_TYPE_PARANDJA", "STYLE_TYPE_APPAREL", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SmallIconButtonStyle {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ SmallIconButtonStyle[] $VALUES;

        @NotNull
        private final String key;

        @i(name = "STYLE_TYPE_WHITE")
        public static final SmallIconButtonStyle STYLE_TYPE_WHITE = new SmallIconButtonStyle("STYLE_TYPE_WHITE", 0, "STYLE_TYPE_WHITE");

        @i(name = "STYLE_TYPE_PRIMARY")
        public static final SmallIconButtonStyle STYLE_TYPE_PRIMARY = new SmallIconButtonStyle("STYLE_TYPE_PRIMARY", 1, "STYLE_TYPE_PRIMARY");

        @i(name = "STYLE_TYPE_SECONDARY")
        public static final SmallIconButtonStyle STYLE_TYPE_SECONDARY = new SmallIconButtonStyle("STYLE_TYPE_SECONDARY", 2, "STYLE_TYPE_SECONDARY");

        @i(name = "STYLE_TYPE_CLEAR")
        public static final SmallIconButtonStyle STYLE_TYPE_CLEAR = new SmallIconButtonStyle("STYLE_TYPE_CLEAR", 3, "STYLE_TYPE_CLEAR");

        @i(name = "STYLE_TYPE_SECONDARY_CONFIRMED")
        public static final SmallIconButtonStyle STYLE_TYPE_SECONDARY_CONFIRMED = new SmallIconButtonStyle("STYLE_TYPE_SECONDARY_CONFIRMED", 4, "STYLE_TYPE_SECONDARY_CONFIRMED");

        @i(name = "STYLE_TYPE_PRIMARY_FRESH")
        public static final SmallIconButtonStyle STYLE_TYPE_PRIMARY_FRESH = new SmallIconButtonStyle("STYLE_TYPE_PRIMARY_FRESH", 5, "STYLE_TYPE_PRIMARY_FRESH");

        @i(name = "STYLE_TYPE_DELETE")
        public static final SmallIconButtonStyle STYLE_TYPE_DELETE = new SmallIconButtonStyle("STYLE_TYPE_DELETE", 6, "STYLE_TYPE_DELETE");

        @i(name = "STYLE_TYPE_PARANDJA")
        public static final SmallIconButtonStyle STYLE_TYPE_PARANDJA = new SmallIconButtonStyle("STYLE_TYPE_PARANDJA", 7, "STYLE_TYPE_PARANDJA");

        @i(name = "STYLE_TYPE_APPAREL")
        public static final SmallIconButtonStyle STYLE_TYPE_APPAREL = new SmallIconButtonStyle("STYLE_TYPE_APPAREL", 8, "STYLE_TYPE_APPAREL");

        private static final /* synthetic */ SmallIconButtonStyle[] $values() {
            return new SmallIconButtonStyle[]{STYLE_TYPE_WHITE, STYLE_TYPE_PRIMARY, STYLE_TYPE_SECONDARY, STYLE_TYPE_CLEAR, STYLE_TYPE_SECONDARY_CONFIRMED, STYLE_TYPE_PRIMARY_FRESH, STYLE_TYPE_DELETE, STYLE_TYPE_PARANDJA, STYLE_TYPE_APPAREL};
        }

        static {
            SmallIconButtonStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SmallIconButtonStyle(String str, int i11, String str2) {
            this.key = str2;
        }

        @NotNull
        public static Xc.a<SmallIconButtonStyle> getEntries() {
            return $ENTRIES;
        }

        public static SmallIconButtonStyle valueOf(String str) {
            return (SmallIconButtonStyle) Enum.valueOf(SmallIconButtonStyle.class, str);
        }

        public static SmallIconButtonStyle[] values() {
            return (SmallIconButtonStyle[]) $VALUES.clone();
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    public /* synthetic */ ButtonV3Atom(AtomTypeImpl atomTypeImpl, String str, TestInfo testInfo, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomTypeImpl, str, testInfo, map);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002<=Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jq\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0006\u00100\u001a\u00020&J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020&HÖ\u0001J\t\u00106\u001a\u00020\fHÖ\u0001J\u0016\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006>"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton$SmallButtonStyle;", "style", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "buttonSizeMode", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton$ButtonSizeMode;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton$SmallButtonStyle;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton$SmallButtonStyle;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton$ButtonSizeMode;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton$SmallButtonStyle;", "getStyle$annotations", "()V", "getStyle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getButtonSizeMode", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton$ButtonSizeMode;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ButtonSizeMode", "SmallButtonStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ResizableSmallButton extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<ResizableSmallButton> CREATOR = new Creator();
        private final AtomActionDTO action;

        @NotNull
        private final ButtonSizeMode buttonSizeMode;
        private final String context;
        private final SmallButtonStyle style;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final SmallButtonStyle theme;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton$ButtonSizeMode;", "", "<init>", "(Ljava/lang/String;I)V", "SIZE_MODE_FIT", "SIZE_MODE_FILL", "SIZE_MODE_140", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ButtonSizeMode {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ ButtonSizeMode[] $VALUES;

            @i(name = "SIZE_MODE_FIT")
            public static final ButtonSizeMode SIZE_MODE_FIT = new ButtonSizeMode("SIZE_MODE_FIT", 0);

            @i(name = "SIZE_MODE_FILL")
            public static final ButtonSizeMode SIZE_MODE_FILL = new ButtonSizeMode("SIZE_MODE_FILL", 1);

            @i(name = "SIZE_MODE_140")
            public static final ButtonSizeMode SIZE_MODE_140 = new ButtonSizeMode("SIZE_MODE_140", 2);

            private static final /* synthetic */ ButtonSizeMode[] $values() {
                return new ButtonSizeMode[]{SIZE_MODE_FIT, SIZE_MODE_FILL, SIZE_MODE_140};
            }

            static {
                ButtonSizeMode[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private ButtonSizeMode(String str, int i11) {
            }

            @NotNull
            public static Xc.a<ButtonSizeMode> getEntries() {
                return $ENTRIES;
            }

            public static ButtonSizeMode valueOf(String str) {
                return (ButtonSizeMode) Enum.valueOf(ButtonSizeMode.class, str);
            }

            public static ButtonSizeMode[] values() {
                return (ButtonSizeMode[]) $VALUES.clone();
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Creator implements Parcelable.Creator<ResizableSmallButton> {
            @Override // android.os.Parcelable.Creator
            public final ResizableSmallButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                LinkedHashMap linkedHashMap = null;
                SmallButtonStyle valueOf = parcel.readInt() == 0 ? null : SmallButtonStyle.valueOf(parcel.readString());
                SmallButtonStyle valueOf2 = parcel.readInt() == 0 ? null : SmallButtonStyle.valueOf(parcel.readString());
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                ButtonSizeMode valueOf3 = ButtonSizeMode.valueOf(parcel.readString());
                SmallButtonStyle smallButtonStyle = valueOf;
                String readString = parcel.readString();
                TestInfo createFromParcel2 = parcel.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(ResizableSmallButton.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new ResizableSmallButton(create, smallButtonStyle, valueOf2, createFromParcel, valueOf3, readString, createFromParcel2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final ResizableSmallButton[] newArray(int i11) {
                return new ResizableSmallButton[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton$SmallButtonStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "STYLE_TYPE_PRIMARY_GREEN_SMALL", "STYLE_TYPE_INVALID", "STYLE_TYPE_PRIMARY_SMALL", "STYLE_TYPE_PRIMARY_FRESH_SMALL", "STYLE_TYPE_SECONDARY_SMALL", "STYLE_TYPE_SECONDARY_SMALL_FRESH", "STYLE_TYPE_SECONDARY_WHITE_SMALL", "STYLE_TYPE_SECONDARY_CONFIRMED_SMALL", "STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH", "STYLE_TYPE_DELETE_SMALL", "STYLE_TYPE_DELETE_WHITE_SMALL", "STYLE_TYPE_PRIMARY_EXPRESS_SMALL", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SmallButtonStyle {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ SmallButtonStyle[] $VALUES;

            @NotNull
            private final String key;

            @i(name = "STYLE_TYPE_PRIMARY_GREEN_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_PRIMARY_GREEN_SMALL = new SmallButtonStyle("STYLE_TYPE_PRIMARY_GREEN_SMALL", 0, "STYLE_TYPE_PRIMARY_GREEN_SMALL");

            @i(name = "STYLE_TYPE_INVALID")
            public static final SmallButtonStyle STYLE_TYPE_INVALID = new SmallButtonStyle("STYLE_TYPE_INVALID", 1, "STYLE_TYPE_INVALID");

            @i(name = "STYLE_TYPE_PRIMARY_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_PRIMARY_SMALL = new SmallButtonStyle("STYLE_TYPE_PRIMARY_SMALL", 2, "STYLE_TYPE_PRIMARY_SMALL");

            @i(name = "STYLE_TYPE_PRIMARY_FRESH_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_PRIMARY_FRESH_SMALL = new SmallButtonStyle("STYLE_TYPE_PRIMARY_FRESH_SMALL", 3, "STYLE_TYPE_PRIMARY_FRESH_SMALL");

            @i(name = "STYLE_TYPE_SECONDARY_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_SECONDARY_SMALL = new SmallButtonStyle("STYLE_TYPE_SECONDARY_SMALL", 4, "STYLE_TYPE_SECONDARY_SMALL");

            @i(name = "STYLE_TYPE_SECONDARY_SMALL_FRESH")
            public static final SmallButtonStyle STYLE_TYPE_SECONDARY_SMALL_FRESH = new SmallButtonStyle("STYLE_TYPE_SECONDARY_SMALL_FRESH", 5, "STYLE_TYPE_SECONDARY_SMALL_FRESH");

            @i(name = "STYLE_TYPE_SECONDARY_WHITE_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_SECONDARY_WHITE_SMALL = new SmallButtonStyle("STYLE_TYPE_SECONDARY_WHITE_SMALL", 6, "STYLE_TYPE_SECONDARY_WHITE_SMALL");

            @i(name = "STYLE_TYPE_SECONDARY_CONFIRMED_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_SECONDARY_CONFIRMED_SMALL = new SmallButtonStyle("STYLE_TYPE_SECONDARY_CONFIRMED_SMALL", 7, "STYLE_TYPE_SECONDARY_CONFIRMED_SMALL");

            @i(name = "STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH")
            public static final SmallButtonStyle STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH = new SmallButtonStyle("STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH", 8, "STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH");

            @i(name = "STYLE_TYPE_DELETE_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_DELETE_SMALL = new SmallButtonStyle("STYLE_TYPE_DELETE_SMALL", 9, "STYLE_TYPE_DELETE_SMALL");

            @i(name = "STYLE_TYPE_DELETE_WHITE_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_DELETE_WHITE_SMALL = new SmallButtonStyle("STYLE_TYPE_DELETE_WHITE_SMALL", 10, "STYLE_TYPE_DELETE_WHITE_SMALL");

            @i(name = "STYLE_TYPE_PRIMARY_EXPRESS_SMALL")
            public static final SmallButtonStyle STYLE_TYPE_PRIMARY_EXPRESS_SMALL = new SmallButtonStyle("STYLE_TYPE_PRIMARY_EXPRESS_SMALL", 11, "STYLE_TYPE_PRIMARY_EXPRESS_SMALL");

            private static final /* synthetic */ SmallButtonStyle[] $values() {
                return new SmallButtonStyle[]{STYLE_TYPE_PRIMARY_GREEN_SMALL, STYLE_TYPE_INVALID, STYLE_TYPE_PRIMARY_SMALL, STYLE_TYPE_PRIMARY_FRESH_SMALL, STYLE_TYPE_SECONDARY_SMALL, STYLE_TYPE_SECONDARY_SMALL_FRESH, STYLE_TYPE_SECONDARY_WHITE_SMALL, STYLE_TYPE_SECONDARY_CONFIRMED_SMALL, STYLE_TYPE_SECONDARY_WHITE_SMALL_FRESH, STYLE_TYPE_DELETE_SMALL, STYLE_TYPE_DELETE_WHITE_SMALL, STYLE_TYPE_PRIMARY_EXPRESS_SMALL};
            }

            static {
                SmallButtonStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private SmallButtonStyle(String str, int i11, String str2) {
                this.key = str2;
            }

            @NotNull
            public static Xc.a<SmallButtonStyle> getEntries() {
                return $ENTRIES;
            }

            public static SmallButtonStyle valueOf(String str) {
                return (SmallButtonStyle) Enum.valueOf(SmallButtonStyle.class, str);
            }

            public static SmallButtonStyle[] values() {
                return (SmallButtonStyle[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ ResizableSmallButton(OzonSpannableString ozonSpannableString, SmallButtonStyle smallButtonStyle, SmallButtonStyle smallButtonStyle2, AtomActionDTO atomActionDTO, ButtonSizeMode buttonSizeMode, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, smallButtonStyle, (i11 & 4) != 0 ? null : smallButtonStyle2, (i11 & 8) != 0 ? null : atomActionDTO, (i11 & 16) != 0 ? ButtonSizeMode.SIZE_MODE_FIT : buttonSizeMode, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : testInfo, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map);
        }

        public static /* synthetic */ ResizableSmallButton copy$default(ResizableSmallButton resizableSmallButton, OzonSpannableString ozonSpannableString, SmallButtonStyle smallButtonStyle, SmallButtonStyle smallButtonStyle2, AtomActionDTO atomActionDTO, ButtonSizeMode buttonSizeMode, String str, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = resizableSmallButton.text;
            }
            if ((i11 & 2) != 0) {
                smallButtonStyle = resizableSmallButton.theme;
            }
            if ((i11 & 4) != 0) {
                smallButtonStyle2 = resizableSmallButton.style;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = resizableSmallButton.action;
            }
            if ((i11 & 16) != 0) {
                buttonSizeMode = resizableSmallButton.buttonSizeMode;
            }
            if ((i11 & 32) != 0) {
                str = resizableSmallButton.context;
            }
            if ((i11 & 64) != 0) {
                testInfo = resizableSmallButton.testInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = resizableSmallButton.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            ButtonSizeMode buttonSizeMode2 = buttonSizeMode;
            String str2 = str;
            return resizableSmallButton.copy(ozonSpannableString, smallButtonStyle, smallButtonStyle2, atomActionDTO, buttonSizeMode2, str2, testInfo2, map2);
        }

        @InterfaceC3999a
        public static /* synthetic */ void getStyle$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final SmallButtonStyle getTheme() {
            return this.theme;
        }

        /* renamed from: component3, reason: from getter */
        public final SmallButtonStyle getStyle() {
            return this.style;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final ButtonSizeMode getButtonSizeMode() {
            return this.buttonSizeMode;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component7, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        @NotNull
        public final ResizableSmallButton copy(@NotNull OzonSpannableString text, SmallButtonStyle theme, SmallButtonStyle style, AtomActionDTO action, @i(name = "sizeMode") @NotNull ButtonSizeMode buttonSizeMode, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(buttonSizeMode, "buttonSizeMode");
            return new ResizableSmallButton(text, theme, style, action, buttonSizeMode, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResizableSmallButton)) {
                return false;
            }
            ResizableSmallButton resizableSmallButton = (ResizableSmallButton) other;
            return Intrinsics.d(this.text, resizableSmallButton.text) && this.theme == resizableSmallButton.theme && this.style == resizableSmallButton.style && Intrinsics.d(this.action, resizableSmallButton.action) && this.buttonSizeMode == resizableSmallButton.buttonSizeMode && Intrinsics.d(this.context, resizableSmallButton.context) && Intrinsics.d(this.testInfo, resizableSmallButton.testInfo) && Intrinsics.d(this.trackingInfo, resizableSmallButton.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final ButtonSizeMode getButtonSizeMode() {
            return this.buttonSizeMode;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_resizable_small_button;
        }

        public final SmallButtonStyle getStyle() {
            return this.style;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final SmallButtonStyle getTheme() {
            return this.theme;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            SmallButtonStyle smallButtonStyle = this.theme;
            int hashCode2 = (hashCode + (smallButtonStyle == null ? 0 : smallButtonStyle.hashCode())) * 31;
            SmallButtonStyle smallButtonStyle2 = this.style;
            int hashCode3 = (hashCode2 + (smallButtonStyle2 == null ? 0 : smallButtonStyle2.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (this.buttonSizeMode.hashCode() + ((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31)) * 31;
            String str = this.context;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode6 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            SmallButtonStyle smallButtonStyle = this.theme;
            SmallButtonStyle smallButtonStyle2 = this.style;
            AtomActionDTO atomActionDTO = this.action;
            ButtonSizeMode buttonSizeMode = this.buttonSizeMode;
            String str = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ResizableSmallButton(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", theme=");
            sb2.append(smallButtonStyle);
            sb2.append(", style=");
            sb2.append(smallButtonStyle2);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", buttonSizeMode=");
            sb2.append(buttonSizeMode);
            sb2.append(", context=");
            sb2.append(str);
            sb2.append(", testInfo=");
            return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            SmallButtonStyle smallButtonStyle = this.theme;
            if (smallButtonStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(smallButtonStyle.name());
            }
            SmallButtonStyle smallButtonStyle2 = this.style;
            if (smallButtonStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(smallButtonStyle2.name());
            }
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.buttonSizeMode.name());
            dest.writeString(this.context);
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResizableSmallButton(@NotNull OzonSpannableString text, SmallButtonStyle smallButtonStyle, SmallButtonStyle smallButtonStyle2, AtomActionDTO atomActionDTO, @i(name = "sizeMode") @NotNull ButtonSizeMode buttonSizeMode, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(AtomTypeImpl.RESIZABLE_SMALL_BUTTON, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(buttonSizeMode, "buttonSizeMode");
            this.text = text;
            this.theme = smallButtonStyle;
            this.style = smallButtonStyle2;
            this.action = atomActionDTO;
            this.buttonSizeMode = buttonSizeMode;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001=Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0080\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00101J\u0006\u00102\u001a\u00020&J\u0013\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020&HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\b\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018¨\u0006>"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "icon", "", "theme", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon$SmallButtonWithIconStyle;", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tintColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "context", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon$SmallButtonWithIconStyle;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getIcon", "()Ljava/lang/String;", "getTheme", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon$SmallButtonWithIconStyle;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTintColor", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getContext", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon$SmallButtonWithIconStyle;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SmallButtonWithIconStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    /* loaded from: classes4.dex */
    public static final /* data */ class SmallButtonWithIcon extends ButtonV3Atom {
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<SmallButtonWithIcon> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;

        @NotNull
        private final String icon;
        private final Boolean isSelected;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;

        @NotNull
        private final SmallButtonWithIconStyle theme;
        private final String tintColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SmallButtonWithIcon> {
            @Override // android.os.Parcelable.Creator
            public final SmallButtonWithIcon createFromParcel(Parcel parcel) {
                Boolean valueOf;
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                String readString = parcel.readString();
                SmallButtonWithIconStyle valueOf2 = SmallButtonWithIconStyle.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                AtomActionDTO createFromParcel = parcel.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel);
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(SmallButtonWithIcon.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new SmallButtonWithIcon(create, readString, valueOf2, valueOf, createFromParcel, readString2, linkedHashMap, parcel.readInt() != 0 ? TestInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SmallButtonWithIcon[] newArray(int i11) {
                return new SmallButtonWithIcon[i11];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon$SmallButtonWithIconStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "STYLE_TYPE_INVALID", "STYLE_TYPE_PRIMARY", "STYLE_TYPE_SECONDARY", "STYLE_TYPE_SECONDARY_WHITE", "STYLE_TYPE_SECONDARY_DELETE", "STYLE_TYPE_SECONDARY_DELETE_WHITE", "STYLE_TYPE_SECONDARY_SELECTED_WHITE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SmallButtonWithIconStyle {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ SmallButtonWithIconStyle[] $VALUES;

            @NotNull
            private final String key;

            @i(name = "STYLE_TYPE_INVALID")
            public static final SmallButtonWithIconStyle STYLE_TYPE_INVALID = new SmallButtonWithIconStyle("STYLE_TYPE_INVALID", 0, "STYLE_TYPE_INVALID");

            @i(name = "STYLE_TYPE_PRIMARY")
            public static final SmallButtonWithIconStyle STYLE_TYPE_PRIMARY = new SmallButtonWithIconStyle("STYLE_TYPE_PRIMARY", 1, "STYLE_TYPE_PRIMARY");

            @i(name = "STYLE_TYPE_SECONDARY")
            public static final SmallButtonWithIconStyle STYLE_TYPE_SECONDARY = new SmallButtonWithIconStyle("STYLE_TYPE_SECONDARY", 2, "STYLE_TYPE_SECONDARY");

            @i(name = "STYLE_TYPE_SECONDARY_WHITE")
            public static final SmallButtonWithIconStyle STYLE_TYPE_SECONDARY_WHITE = new SmallButtonWithIconStyle("STYLE_TYPE_SECONDARY_WHITE", 3, "STYLE_TYPE_SECONDARY_WHITE");

            @i(name = "STYLE_TYPE_SECONDARY_DELETE")
            public static final SmallButtonWithIconStyle STYLE_TYPE_SECONDARY_DELETE = new SmallButtonWithIconStyle("STYLE_TYPE_SECONDARY_DELETE", 4, "STYLE_TYPE_SECONDARY_DELETE");

            @i(name = "STYLE_TYPE_SECONDARY_DELETE_WHITE")
            public static final SmallButtonWithIconStyle STYLE_TYPE_SECONDARY_DELETE_WHITE = new SmallButtonWithIconStyle("STYLE_TYPE_SECONDARY_DELETE_WHITE", 5, "STYLE_TYPE_SECONDARY_DELETE_WHITE");

            @i(name = "STYLE_TYPE_SECONDARY_SELECTED_WHITE")
            public static final SmallButtonWithIconStyle STYLE_TYPE_SECONDARY_SELECTED_WHITE = new SmallButtonWithIconStyle("STYLE_TYPE_SECONDARY_SELECTED_WHITE", 6, "STYLE_TYPE_SECONDARY_SELECTED_WHITE");

            private static final /* synthetic */ SmallButtonWithIconStyle[] $values() {
                return new SmallButtonWithIconStyle[]{STYLE_TYPE_INVALID, STYLE_TYPE_PRIMARY, STYLE_TYPE_SECONDARY, STYLE_TYPE_SECONDARY_WHITE, STYLE_TYPE_SECONDARY_DELETE, STYLE_TYPE_SECONDARY_DELETE_WHITE, STYLE_TYPE_SECONDARY_SELECTED_WHITE};
            }

            static {
                SmallButtonWithIconStyle[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private SmallButtonWithIconStyle(String str, int i11, String str2) {
                this.key = str2;
            }

            @NotNull
            public static Xc.a<SmallButtonWithIconStyle> getEntries() {
                return $ENTRIES;
            }

            public static SmallButtonWithIconStyle valueOf(String str) {
                return (SmallButtonWithIconStyle) Enum.valueOf(SmallButtonWithIconStyle.class, str);
            }

            public static SmallButtonWithIconStyle[] values() {
                return (SmallButtonWithIconStyle[]) $VALUES.clone();
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ SmallButtonWithIcon(ru.ozon.uni.atoms.utils.OzonSpannableString r13, java.lang.String r14, ru.ozon.uni.atoms.data.button.ButtonV3Atom.SmallButtonWithIcon.SmallButtonWithIconStyle r15, java.lang.Boolean r16, ru.ozon.uni.atoms.data.AtomActionDTO r17, java.lang.String r18, java.util.Map r19, ru.ozon.uni.atoms.data.TestInfo r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
            /*
                r12 = this;
                r0 = r22
                r1 = r0 & 8
                if (r1 == 0) goto La
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r6 = r1
                goto Lc
            La:
                r6 = r16
            Lc:
                r1 = r0 & 16
                r2 = 0
                if (r1 == 0) goto L13
                r7 = r2
                goto L15
            L13:
                r7 = r17
            L15:
                r1 = r0 & 32
                if (r1 == 0) goto L1b
                r8 = r2
                goto L1d
            L1b:
                r8 = r18
            L1d:
                r1 = r0 & 64
                if (r1 == 0) goto L23
                r9 = r2
                goto L25
            L23:
                r9 = r19
            L25:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L2b
                r10 = r2
                goto L2d
            L2b:
                r10 = r20
            L2d:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L37
                r11 = r2
                r3 = r13
                r4 = r14
                r5 = r15
                r2 = r12
                goto L3d
            L37:
                r11 = r21
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
            L3d:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.uni.atoms.data.button.ButtonV3Atom.SmallButtonWithIcon.<init>(ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, ru.ozon.uni.atoms.data.button.ButtonV3Atom$SmallButtonWithIcon$SmallButtonWithIconStyle, java.lang.Boolean, ru.ozon.uni.atoms.data.AtomActionDTO, java.lang.String, java.util.Map, ru.ozon.uni.atoms.data.TestInfo, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ SmallButtonWithIcon copy$default(SmallButtonWithIcon smallButtonWithIcon, OzonSpannableString ozonSpannableString, String str, SmallButtonWithIconStyle smallButtonWithIconStyle, Boolean bool, AtomActionDTO atomActionDTO, String str2, Map map, TestInfo testInfo, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = smallButtonWithIcon.text;
            }
            if ((i11 & 2) != 0) {
                str = smallButtonWithIcon.icon;
            }
            if ((i11 & 4) != 0) {
                smallButtonWithIconStyle = smallButtonWithIcon.theme;
            }
            if ((i11 & 8) != 0) {
                bool = smallButtonWithIcon.isSelected;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = smallButtonWithIcon.action;
            }
            if ((i11 & 32) != 0) {
                str2 = smallButtonWithIcon.tintColor;
            }
            if ((i11 & 64) != 0) {
                map = smallButtonWithIcon.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                testInfo = smallButtonWithIcon.testInfo;
            }
            if ((i11 & 256) != 0) {
                str3 = smallButtonWithIcon.context;
            }
            TestInfo testInfo2 = testInfo;
            String str4 = str3;
            String str5 = str2;
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            SmallButtonWithIconStyle smallButtonWithIconStyle2 = smallButtonWithIconStyle;
            return smallButtonWithIcon.copy(ozonSpannableString, str, smallButtonWithIconStyle2, bool, atomActionDTO2, str5, map2, testInfo2, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final SmallButtonWithIconStyle getTheme() {
            return this.theme;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        /* renamed from: component8, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component9, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        @NotNull
        public final SmallButtonWithIcon copy(@NotNull OzonSpannableString text, @NotNull String icon, @NotNull SmallButtonWithIconStyle theme, Boolean isSelected, AtomActionDTO action, String tintColor, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, String context) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(theme, "theme");
            return new SmallButtonWithIcon(text, icon, theme, isSelected, action, tintColor, trackingInfo, testInfo, context);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmallButtonWithIcon)) {
                return false;
            }
            SmallButtonWithIcon smallButtonWithIcon = (SmallButtonWithIcon) other;
            return Intrinsics.d(this.text, smallButtonWithIcon.text) && Intrinsics.d(this.icon, smallButtonWithIcon.icon) && this.theme == smallButtonWithIcon.theme && Intrinsics.d(this.isSelected, smallButtonWithIcon.isSelected) && Intrinsics.d(this.action, smallButtonWithIcon.action) && Intrinsics.d(this.tintColor, smallButtonWithIcon.tintColor) && Intrinsics.d(this.trackingInfo, smallButtonWithIcon.trackingInfo) && Intrinsics.d(this.testInfo, smallButtonWithIcon.testInfo) && Intrinsics.d(this.context, smallButtonWithIcon.context);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_small_button_with_icon;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        public final SmallButtonWithIconStyle getTheme() {
            return this.theme;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        @Override // ru.ozon.uni.atoms.data.button.ButtonV3Atom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.theme.hashCode() + g.a(this.text.hashCode() * 31, 31, this.icon)) * 31;
            Boolean bool = this.isSelected;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.tintColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode6 = (hashCode5 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            String str2 = this.context;
            return hashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            String str = this.icon;
            SmallButtonWithIconStyle smallButtonWithIconStyle = this.theme;
            Boolean bool = this.isSelected;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.tintColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            String str3 = this.context;
            StringBuilder f7 = GR.b.f("SmallButtonWithIcon(text=", ozonSpannableString, ", icon=", str, ", theme=");
            f7.append(smallButtonWithIconStyle);
            f7.append(", isSelected=");
            f7.append(bool);
            f7.append(", action=");
            HY.b.d(", tintColor=", str2, ", trackingInfo=", f7, atomActionDTO);
            f7.append(map);
            f7.append(", testInfo=");
            f7.append(testInfo);
            f7.append(", context=");
            return o0.c(f7, str3, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            dest.writeString(this.icon);
            dest.writeString(this.theme.name());
            Boolean bool = this.isSelected;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                D40.c.c(dest, 1, bool);
            }
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                atomActionDTO.writeToParcel(dest, flags);
            }
            dest.writeString(this.tintColor);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator e11 = J.e(map, dest, 1);
                while (e11.hasNext()) {
                    Map.Entry entry = (Map.Entry) e11.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeParcelable((Parcelable) entry.getValue(), flags);
                }
            }
            TestInfo testInfo = this.testInfo;
            if (testInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                testInfo.writeToParcel(dest, flags);
            }
            dest.writeString(this.context);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmallButtonWithIcon(@NotNull OzonSpannableString text, @NotNull String icon, @NotNull SmallButtonWithIconStyle theme, Boolean bool, AtomActionDTO atomActionDTO, String str, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, String str2) {
            super(AtomTypeImpl.SMALL_BUTTON_WITH_ICON, str2, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.text = text;
            this.icon = icon;
            this.theme = theme;
            this.isSelected = bool;
            this.action = atomActionDTO;
            this.tintColor = str;
            this.trackingInfo = map;
            this.testInfo = testInfo;
            this.context = str2;
        }
    }

    public /* synthetic */ ButtonV3Atom(AtomTypeImpl atomTypeImpl, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomTypeImpl, str, (i11 & 4) != 0 ? null : testInfo, (i11 & 8) != 0 ? null : map, null);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    @NotNull
    public AtomTypeImpl getType() {
        return this.type;
    }

    private ButtonV3Atom(AtomTypeImpl atomTypeImpl, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(atomTypeImpl, str, map, null, 8, null);
        this.type = atomTypeImpl;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
