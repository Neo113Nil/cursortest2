package ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager;

import Ak.C2436a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent;", "", "", "sku", "", "selectionUuid", "<init>", "(JLjava/lang/String;)V", "J", "getSku", "()J", "Ljava/lang/String;", "getSelectionUuid", "()Ljava/lang/String;", "ProductRemovalStarted", "ProductRemoved", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent$ProductRemovalStarted;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent$ProductRemoved;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SelectionProductEvent {

    @NotNull
    private final String selectionUuid;
    private final long sku;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent$ProductRemovalStarted;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent;", "", "sku", "", "selectionUuid", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Ljava/lang/String;", "getSelectionUuid", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductRemovalStarted extends SelectionProductEvent {

        @NotNull
        private final String selectionUuid;
        private final long sku;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductRemovalStarted(long j11, @NotNull String selectionUuid) {
            super(j11, selectionUuid, null);
            Intrinsics.checkNotNullParameter(selectionUuid, "selectionUuid");
            this.sku = j11;
            this.selectionUuid = selectionUuid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductRemovalStarted)) {
                return false;
            }
            ProductRemovalStarted productRemovalStarted = (ProductRemovalStarted) other;
            return this.sku == productRemovalStarted.sku && Intrinsics.d(this.selectionUuid, productRemovalStarted.selectionUuid);
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent
        @NotNull
        public String getSelectionUuid() {
            return this.selectionUuid;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent
        public long getSku() {
            return this.sku;
        }

        public int hashCode() {
            return this.selectionUuid.hashCode() + (Long.hashCode(this.sku) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder c11 = C2436a.c(this.sku, "ProductRemovalStarted(sku=", ", selectionUuid=", this.selectionUuid);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent$ProductRemoved;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent;", "", "", "sku", "", "selectionUuid", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent$Result$ActionResult;", "result", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent$Result$ActionResult;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "Ljava/lang/String;", "getSelectionUuid", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent$Result$ActionResult;", "getResult", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/selectionProductsManager/SelectionProductEvent$Result$ActionResult;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductRemoved extends SelectionProductEvent {

        @NotNull
        private final SelectionProductEvent$Result$ActionResult result;

        @NotNull
        private final String selectionUuid;
        private final long sku;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductRemoved(long j11, @NotNull String selectionUuid, @NotNull SelectionProductEvent$Result$ActionResult result) {
            super(j11, selectionUuid, null);
            Intrinsics.checkNotNullParameter(selectionUuid, "selectionUuid");
            Intrinsics.checkNotNullParameter(result, "result");
            this.sku = j11;
            this.selectionUuid = selectionUuid;
            this.result = result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductRemoved)) {
                return false;
            }
            ProductRemoved productRemoved = (ProductRemoved) other;
            return this.sku == productRemoved.sku && Intrinsics.d(this.selectionUuid, productRemoved.selectionUuid) && this.result == productRemoved.result;
        }

        @NotNull
        public SelectionProductEvent$Result$ActionResult getResult() {
            return this.result;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent
        @NotNull
        public String getSelectionUuid() {
            return this.selectionUuid;
        }

        @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.selections.selectionProductsManager.SelectionProductEvent
        public long getSku() {
            return this.sku;
        }

        public int hashCode() {
            return this.result.hashCode() + g.a(Long.hashCode(this.sku) * 31, 31, this.selectionUuid);
        }

        @NotNull
        public String toString() {
            long j11 = this.sku;
            String str = this.selectionUuid;
            SelectionProductEvent$Result$ActionResult selectionProductEvent$Result$ActionResult = this.result;
            StringBuilder c11 = C2436a.c(j11, "ProductRemoved(sku=", ", selectionUuid=", str);
            c11.append(", result=");
            c11.append(selectionProductEvent$Result$ActionResult);
            c11.append(")");
            return c11.toString();
        }
    }

    public /* synthetic */ SelectionProductEvent(long j11, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str);
    }

    @NotNull
    public String getSelectionUuid() {
        return this.selectionUuid;
    }

    public long getSku() {
        return this.sku;
    }

    private SelectionProductEvent(long j11, String str) {
        this.sku = j11;
        this.selectionUuid = str;
    }
}
