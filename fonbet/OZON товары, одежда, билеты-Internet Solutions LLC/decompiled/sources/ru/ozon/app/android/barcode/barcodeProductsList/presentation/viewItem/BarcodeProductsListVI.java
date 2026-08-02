package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem;

import Bi.b;
import D3.h;
import El.C2971a;
import G.g;
import Kk.C3532b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.barcode.barcodeProductsList.data.VerticalPaddingDTO;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J~\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/Item;", "items", "Lru/ozon/app/android/barcode/barcodeProductsList/data/VerticalPaddingDTO;", "verticalPadding", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/app/android/barcode/barcodeProductsList/data/VerticalPaddingDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;ZLWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/app/android/barcode/barcodeProductsList/data/VerticalPaddingDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;ZLWZ/t;)Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/BarcodeProductsListVI;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getHeader", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/barcode/barcodeProductsList/data/VerticalPaddingDTO;", "getVerticalPadding", "()Lru/ozon/app/android/barcode/barcodeProductsList/data/VerticalPaddingDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Z", "getExpanded", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodeProductsListVI implements c {
    private final boolean expanded;

    @NotNull
    private final CellDTO header;
    private final long id;

    @NotNull
    private final List<Item> items;
    private final TestInfo testInfo;
    private final t tokenizedEvent;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final VerticalPaddingDTO verticalPadding;

    public BarcodeProductsListVI(long j11, @NotNull CellDTO header, @NotNull List<Item> items, @NotNull VerticalPaddingDTO verticalPadding, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, boolean z11, t tVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(verticalPadding, "verticalPadding");
        this.id = j11;
        this.header = header;
        this.items = items;
        this.verticalPadding = verticalPadding;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.expanded = z11;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ BarcodeProductsListVI copy$default(BarcodeProductsListVI barcodeProductsListVI, long j11, CellDTO cellDTO, List list, VerticalPaddingDTO verticalPaddingDTO, Map map, TestInfo testInfo, boolean z11, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = barcodeProductsListVI.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            cellDTO = barcodeProductsListVI.header;
        }
        CellDTO cellDTO2 = cellDTO;
        if ((i11 & 4) != 0) {
            list = barcodeProductsListVI.items;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            verticalPaddingDTO = barcodeProductsListVI.verticalPadding;
        }
        return barcodeProductsListVI.copy(j12, cellDTO2, list2, verticalPaddingDTO, (i11 & 16) != 0 ? barcodeProductsListVI.trackingInfo : map, (i11 & 32) != 0 ? barcodeProductsListVI.testInfo : testInfo, (i11 & 64) != 0 ? barcodeProductsListVI.expanded : z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? barcodeProductsListVI.tokenizedEvent : tVar);
    }

    @NotNull
    public final BarcodeProductsListVI copy(long id2, @NotNull CellDTO header, @NotNull List<Item> items, @NotNull VerticalPaddingDTO verticalPadding, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, boolean expanded, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(verticalPadding, "verticalPadding");
        return new BarcodeProductsListVI(id2, header, items, verticalPadding, trackingInfo, testInfo, expanded, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeProductsListVI)) {
            return false;
        }
        BarcodeProductsListVI barcodeProductsListVI = (BarcodeProductsListVI) other;
        return this.id == barcodeProductsListVI.id && Intrinsics.d(this.header, barcodeProductsListVI.header) && Intrinsics.d(this.items, barcodeProductsListVI.items) && Intrinsics.d(this.verticalPadding, barcodeProductsListVI.verticalPadding) && Intrinsics.d(this.trackingInfo, barcodeProductsListVI.trackingInfo) && Intrinsics.d(this.testInfo, barcodeProductsListVI.testInfo) && this.expanded == barcodeProductsListVI.expanded && Intrinsics.d(this.tokenizedEvent, barcodeProductsListVI.tokenizedEvent);
    }

    public final boolean getExpanded() {
        return this.expanded;
    }

    @NotNull
    public final CellDTO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final VerticalPaddingDTO getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.verticalPadding.hashCode() + g.b(b.c(this.header, Long.hashCode(this.id) * 31, 31), 31, this.items)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int a11 = C3532b.a((hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31, 31, this.expanded);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.header;
        List<Item> list = this.items;
        VerticalPaddingDTO verticalPaddingDTO = this.verticalPadding;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        boolean z11 = this.expanded;
        t tVar = this.tokenizedEvent;
        StringBuilder e11 = h.e("BarcodeProductsListVI(id=", j11, ", header=", cellDTO);
        e11.append(", items=");
        e11.append(list);
        e11.append(", verticalPadding=");
        e11.append(verticalPaddingDTO);
        e11.append(", trackingInfo=");
        e11.append(map);
        e11.append(", testInfo=");
        e11.append(testInfo);
        C2971a.d(e11, ", expanded=", z11, ", tokenizedEvent=", tVar);
        e11.append(")");
        return e11.toString();
    }
}
