package ru.ozon.app.android.pdp.widgets.translateButton.data;

import Lh.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateAttributesRequest;", "", "sku", "", "attributeKeys", "", "", "<init>", "(JLjava/util/List;)V", "getSku", "()J", "getAttributeKeys", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TranslateAttributesRequest {
    public static final int $stable = 8;

    @NotNull
    private final List<String> attributeKeys;
    private final long sku;

    public TranslateAttributesRequest(long j11, @i(name = "attribute_keys") @NotNull List<String> attributeKeys) {
        Intrinsics.checkNotNullParameter(attributeKeys, "attributeKeys");
        this.sku = j11;
        this.attributeKeys = attributeKeys;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TranslateAttributesRequest copy$default(TranslateAttributesRequest translateAttributesRequest, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = translateAttributesRequest.sku;
        }
        if ((i11 & 2) != 0) {
            list = translateAttributesRequest.attributeKeys;
        }
        return translateAttributesRequest.copy(j11, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSku() {
        return this.sku;
    }

    @NotNull
    public final List<String> component2() {
        return this.attributeKeys;
    }

    @NotNull
    public final TranslateAttributesRequest copy(long sku, @i(name = "attribute_keys") @NotNull List<String> attributeKeys) {
        Intrinsics.checkNotNullParameter(attributeKeys, "attributeKeys");
        return new TranslateAttributesRequest(sku, attributeKeys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslateAttributesRequest)) {
            return false;
        }
        TranslateAttributesRequest translateAttributesRequest = (TranslateAttributesRequest) other;
        return this.sku == translateAttributesRequest.sku && Intrinsics.d(this.attributeKeys, translateAttributesRequest.attributeKeys);
    }

    @NotNull
    public final List<String> getAttributeKeys() {
        return this.attributeKeys;
    }

    public final long getSku() {
        return this.sku;
    }

    public int hashCode() {
        return this.attributeKeys.hashCode() + (Long.hashCode(this.sku) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.sku, "TranslateAttributesRequest(sku=", ", attributeKeys=", this.attributeKeys);
        b11.append(")");
        return b11.toString();
    }
}
