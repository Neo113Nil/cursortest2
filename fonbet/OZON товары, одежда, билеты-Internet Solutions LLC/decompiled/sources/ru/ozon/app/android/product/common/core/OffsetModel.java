package ru.ozon.app.android.product.common.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/product/common/core/OffsetModel;", "", "", "isSkuGrid2", "", "bottom", "<init>", "(ZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "I", "getBottom", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OffsetModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int bottomWithoutSellerIcon = UiExtKt.toPx(6);
    private final int bottom;
    private final boolean isSkuGrid2;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/product/common/core/OffsetModel$Companion;", "", "<init>", "()V", "bottomWithoutSellerIcon", "", "getBottomWithoutSellerIcon", "()I", "bottomWithSellerIcon", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getBottomWithoutSellerIcon() {
            return OffsetModel.bottomWithoutSellerIcon;
        }

        private Companion() {
        }
    }

    public OffsetModel(boolean z11, int i11) {
        this.isSkuGrid2 = z11;
        this.bottom = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OffsetModel)) {
            return false;
        }
        OffsetModel offsetModel = (OffsetModel) other;
        return this.isSkuGrid2 == offsetModel.isSkuGrid2 && this.bottom == offsetModel.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public int hashCode() {
        return Integer.hashCode(this.bottom) + (Boolean.hashCode(this.isSkuGrid2) * 31);
    }

    /* renamed from: isSkuGrid2, reason: from getter */
    public final boolean getIsSkuGrid2() {
        return this.isSkuGrid2;
    }

    @NotNull
    public String toString() {
        return "OffsetModel(isSkuGrid2=" + this.isSkuGrid2 + ", bottom=" + this.bottom + ")";
    }

    public /* synthetic */ OffsetModel(boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? true : z11, i11);
    }
}
