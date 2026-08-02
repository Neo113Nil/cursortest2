package ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.delivery;

import Ak.C2436a;
import B0.C2454a;
import Bi.b;
import G.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/delivery/DeliveryVI;", "Ll20/c;", "", "id", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "images", "LWZ/t;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLjava/lang/String;ILru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "I", "getCornerRadius", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryVI implements c {
    private final String backgroundColor;

    @NotNull
    private final CellDTO cell;
    private final int cornerRadius;
    private final long id;

    @NotNull
    private final List<ImageVO> images;
    private final TestInfo testInfo;
    private final t tokenizedEvent;

    public DeliveryVI(long j11, String str, int i11, @NotNull CellDTO cell, @NotNull List<ImageVO> images, t tVar, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(images, "images");
        this.id = j11;
        this.backgroundColor = str;
        this.cornerRadius = i11;
        this.cell = cell;
        this.images = images;
        this.tokenizedEvent = tVar;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryVI)) {
            return false;
        }
        DeliveryVI deliveryVI = (DeliveryVI) other;
        return this.id == deliveryVI.id && Intrinsics.d(this.backgroundColor, deliveryVI.backgroundColor) && this.cornerRadius == deliveryVI.cornerRadius && Intrinsics.d(this.cell, deliveryVI.cell) && Intrinsics.d(this.images, deliveryVI.images) && Intrinsics.d(this.tokenizedEvent, deliveryVI.tokenizedEvent) && Intrinsics.d(this.testInfo, deliveryVI.testInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ImageVO> getImages() {
        return this.images;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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
        String str = this.backgroundColor;
        int b11 = g.b(b.c(this.cell, C2454a.a(this.cornerRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.images);
        t tVar = this.tokenizedEvent;
        int hashCode2 = (b11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        int i11 = this.cornerRadius;
        CellDTO cellDTO = this.cell;
        List<ImageVO> list = this.images;
        t tVar = this.tokenizedEvent;
        TestInfo testInfo = this.testInfo;
        StringBuilder c11 = C2436a.c(j11, "DeliveryVI(id=", ", backgroundColor=", str);
        c11.append(", cornerRadius=");
        c11.append(i11);
        c11.append(", cell=");
        c11.append(cellDTO);
        Ak.b.h(c11, ", images=", list, ", tokenizedEvent=", tVar);
        c11.append(", testInfo=");
        c11.append(testInfo);
        c11.append(")");
        return c11.toString();
    }
}
