package ru.ozon.app.android.account.orders.orderProduct.viewObject;

import D3.h;
import G.g;
import Lh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.cscore.padding.Padding;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b5\u00104R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/viewObject/OrderProductItemVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "images", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "spaceBetween", "", "backgroundColor", "Lru/ozon/app/android/cscore/padding/Padding;", "imagePaddings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "imageCommon", "common", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;Lru/ozon/app/android/cscore/padding/Padding;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getSpaceBetween", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/cscore/padding/Padding;", "getImagePaddings", "()Lru/ozon/app/android/cscore/padding/Padding;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getImageCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderProductItemVO implements c {
    private final String backgroundColor;
    private final CellDTO cell;
    private final CommonControlSettings common;
    private final long id;
    private final CommonControlSettings imageCommon;
    private final Padding imagePaddings;

    @NotNull
    private final List<ImageVO> images;

    @NotNull
    private final CommonCellSettings.LayoutPadding spaceBetween;
    private final t tokenizedEvent;

    public OrderProductItemVO(long j11, CellDTO cellDTO, @NotNull List<ImageVO> images, @NotNull CommonCellSettings.LayoutPadding spaceBetween, String str, Padding padding, CommonControlSettings commonControlSettings, CommonControlSettings commonControlSettings2, t tVar) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(spaceBetween, "spaceBetween");
        this.id = j11;
        this.cell = cellDTO;
        this.images = images;
        this.spaceBetween = spaceBetween;
        this.backgroundColor = str;
        this.imagePaddings = padding;
        this.imageCommon = commonControlSettings;
        this.common = commonControlSettings2;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderProductItemVO)) {
            return false;
        }
        OrderProductItemVO orderProductItemVO = (OrderProductItemVO) other;
        return this.id == orderProductItemVO.id && Intrinsics.d(this.cell, orderProductItemVO.cell) && Intrinsics.d(this.images, orderProductItemVO.images) && this.spaceBetween == orderProductItemVO.spaceBetween && Intrinsics.d(this.backgroundColor, orderProductItemVO.backgroundColor) && Intrinsics.d(this.imagePaddings, orderProductItemVO.imagePaddings) && Intrinsics.d(this.imageCommon, orderProductItemVO.imageCommon) && Intrinsics.d(this.common, orderProductItemVO.common) && Intrinsics.d(this.tokenizedEvent, orderProductItemVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CellDTO getCell() {
        return this.cell;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Padding getImagePaddings() {
        return this.imagePaddings;
    }

    @NotNull
    public final List<ImageVO> getImages() {
        return this.images;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final CommonCellSettings.LayoutPadding getSpaceBetween() {
        return this.spaceBetween;
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
        CellDTO cellDTO = this.cell;
        int a11 = Ef0.c.a(this.spaceBetween, g.b((hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31, 31, this.images), 31);
        String str = this.backgroundColor;
        int hashCode2 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Padding padding = this.imagePaddings;
        int hashCode3 = (hashCode2 + (padding == null ? 0 : padding.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.imageCommon;
        int hashCode4 = (hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        CommonControlSettings commonControlSettings2 = this.common;
        int hashCode5 = (hashCode4 + (commonControlSettings2 == null ? 0 : commonControlSettings2.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        List<ImageVO> list = this.images;
        CommonCellSettings.LayoutPadding layoutPadding = this.spaceBetween;
        String str = this.backgroundColor;
        Padding padding = this.imagePaddings;
        CommonControlSettings commonControlSettings = this.imageCommon;
        CommonControlSettings commonControlSettings2 = this.common;
        t tVar = this.tokenizedEvent;
        StringBuilder e11 = h.e("OrderProductItemVO(id=", j11, ", cell=", cellDTO);
        e11.append(", images=");
        e11.append(list);
        e11.append(", spaceBetween=");
        e11.append(layoutPadding);
        e11.append(", backgroundColor=");
        e11.append(str);
        e11.append(", imagePaddings=");
        e11.append(padding);
        e11.append(", imageCommon=");
        e11.append(commonControlSettings);
        e11.append(", common=");
        e11.append(commonControlSettings2);
        return a.b(e11, ", tokenizedEvent=", tVar, ")");
    }
}
