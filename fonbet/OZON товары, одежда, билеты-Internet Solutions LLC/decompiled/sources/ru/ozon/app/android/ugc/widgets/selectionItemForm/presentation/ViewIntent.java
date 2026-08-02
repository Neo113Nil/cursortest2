package ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation;

import G.g;
import H3.c;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;", "", "FormOpened", "BackPressed", "SubmitPressed", "InputUpdated", "CellUpdated", "ProductsUpdated", "SheetAction", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$BackPressed;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$CellUpdated;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$FormOpened;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$InputUpdated;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$ProductsUpdated;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SubmitPressed;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ViewIntent {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$BackPressed;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackPressed implements ViewIntent {

        @NotNull
        public static final BackPressed INSTANCE = new BackPressed();

        private BackPressed() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BackPressed);
        }

        public int hashCode() {
            return -1630395722;
        }

        @NotNull
        public String toString() {
            return "BackPressed";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$CellUpdated;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;", "", "uploadKey", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadKey", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellUpdated implements ViewIntent {

        @NotNull
        private final String uploadKey;

        @NotNull
        private final Object value;

        public CellUpdated(@NotNull String uploadKey, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(value, "value");
            this.uploadKey = uploadKey;
            this.value = value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellUpdated)) {
                return false;
            }
            CellUpdated cellUpdated = (CellUpdated) other;
            return Intrinsics.d(this.uploadKey, cellUpdated.uploadKey) && Intrinsics.d(this.value, cellUpdated.value);
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        @NotNull
        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.uploadKey.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CellUpdated(uploadKey=" + this.uploadKey + ", value=" + this.value + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$FormOpened;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormOpened implements ViewIntent {

        @NotNull
        public static final FormOpened INSTANCE = new FormOpened();

        private FormOpened() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof FormOpened);
        }

        public int hashCode() {
            return 1328029042;
        }

        @NotNull
        public String toString() {
            return "FormOpened";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$InputUpdated;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;", "", "uploadKey", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "isRequired", "isInitialValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUploadKey", "getValue", "Z", "()Z", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputUpdated implements ViewIntent {
        private final boolean isInitialValue;
        private final boolean isRequired;

        @NotNull
        private final String uploadKey;

        @NotNull
        private final String value;

        public InputUpdated(@NotNull String uploadKey, @NotNull String value, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
            Intrinsics.checkNotNullParameter(value, "value");
            this.uploadKey = uploadKey;
            this.value = value;
            this.isRequired = z11;
            this.isInitialValue = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputUpdated)) {
                return false;
            }
            InputUpdated inputUpdated = (InputUpdated) other;
            return Intrinsics.d(this.uploadKey, inputUpdated.uploadKey) && Intrinsics.d(this.value, inputUpdated.value) && this.isRequired == inputUpdated.isRequired && this.isInitialValue == inputUpdated.isInitialValue;
        }

        @NotNull
        public final String getUploadKey() {
            return this.uploadKey;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInitialValue) + C3532b.a(g.a(this.uploadKey.hashCode() * 31, 31, this.value), 31, this.isRequired);
        }

        /* renamed from: isInitialValue, reason: from getter */
        public final boolean getIsInitialValue() {
            return this.isInitialValue;
        }

        /* renamed from: isRequired, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        @NotNull
        public String toString() {
            String str = this.uploadKey;
            String str2 = this.value;
            boolean z11 = this.isRequired;
            boolean z12 = this.isInitialValue;
            StringBuilder d11 = C3660k.d("InputUpdated(uploadKey=", str, ", value=", str2, ", isRequired=");
            d11.append(z11);
            d11.append(", isInitialValue=");
            d11.append(z12);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$ProductsUpdated;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;", "", "", "productIds", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getProductIds", "()Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductsUpdated implements ViewIntent {

        @NotNull
        private final List<String> productIds;

        public ProductsUpdated(@NotNull List<String> productIds) {
            Intrinsics.checkNotNullParameter(productIds, "productIds");
            this.productIds = productIds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProductsUpdated) && Intrinsics.d(this.productIds, ((ProductsUpdated) other).productIds);
        }

        @NotNull
        public final List<String> getProductIds() {
            return this.productIds;
        }

        public int hashCode() {
            return this.productIds.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("ProductsUpdated(productIds=", ")", this.productIds);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "action", "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "getAction", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "ActionType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SheetAction implements ViewIntent {

        @NotNull
        private final ActionType action;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "", "Dismiss", "LeavePage", "StayOnPage", "Other", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType$Dismiss;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType$LeavePage;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType$Other;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType$StayOnPage;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface ActionType {

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType$Dismiss;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Dismiss implements ActionType {

                @NotNull
                public static final Dismiss INSTANCE = new Dismiss();

                private Dismiss() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof Dismiss);
                }

                public int hashCode() {
                    return 824638954;
                }

                @NotNull
                public String toString() {
                    return "Dismiss";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType$LeavePage;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class LeavePage implements ActionType {

                @NotNull
                private final AtomAction.SendAnalytics action;

                public LeavePage(@NotNull AtomAction.SendAnalytics action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    this.action = action;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof LeavePage) && Intrinsics.d(this.action, ((LeavePage) other).action);
                }

                @NotNull
                public final AtomAction.SendAnalytics getAction() {
                    return this.action;
                }

                public int hashCode() {
                    return this.action.hashCode();
                }

                @NotNull
                public String toString() {
                    return "LeavePage(action=" + this.action + ")";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType$Other;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Other implements ActionType {
                public static final int $stable = AtomAction.$stable;

                @NotNull
                private final AtomAction action;

                public Other(@NotNull AtomAction action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    this.action = action;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Other) && Intrinsics.d(this.action, ((Other) other).action);
                }

                @NotNull
                public final AtomAction getAction() {
                    return this.action;
                }

                public int hashCode() {
                    return this.action.hashCode();
                }

                @NotNull
                public String toString() {
                    return Kk.c.e("Other(action=", ")", this.action);
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType$StayOnPage;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SheetAction$ActionType;", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class StayOnPage implements ActionType {

                @NotNull
                private final AtomAction.SendAnalytics action;

                public StayOnPage(@NotNull AtomAction.SendAnalytics action) {
                    Intrinsics.checkNotNullParameter(action, "action");
                    this.action = action;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof StayOnPage) && Intrinsics.d(this.action, ((StayOnPage) other).action);
                }

                @NotNull
                public final AtomAction.SendAnalytics getAction() {
                    return this.action;
                }

                public int hashCode() {
                    return this.action.hashCode();
                }

                @NotNull
                public String toString() {
                    return "StayOnPage(action=" + this.action + ")";
                }
            }
        }

        public SheetAction(@NotNull ActionType action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SheetAction) && Intrinsics.d(this.action, ((SheetAction) other).action);
        }

        @NotNull
        public final ActionType getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return "SheetAction(action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent$SubmitPressed;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitPressed implements ViewIntent {
        public static final int $stable = AtomAction.$stable;

        @NotNull
        private final AtomAction action;

        public SubmitPressed(@NotNull AtomAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubmitPressed) && Intrinsics.d(this.action, ((SubmitPressed) other).action);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @NotNull
        public String toString() {
            return Kk.c.e("SubmitPressed(action=", ")", this.action);
        }
    }
}
