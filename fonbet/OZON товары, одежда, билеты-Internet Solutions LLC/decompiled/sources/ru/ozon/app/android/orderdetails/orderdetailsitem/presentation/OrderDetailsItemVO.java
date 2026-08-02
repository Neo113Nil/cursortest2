package ru.ozon.app.android.orderdetails.orderdetailsitem.presentation;

import El.C2971a;
import G.g;
import Kk.C3532b;
import Lh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.ButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdetailsitem/presentation/OrderDetailsItemVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/cell/ButtonTitleSubtitleCellDTO;", "cell", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "images", "", "hasSeparator", "", "buttonsInRow", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/cell/ButtonTitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;ZLjava/util/List;Lru/ozon/uni/atoms/data/TestInfo;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/cell/ButtonTitleSubtitleCellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/cell/ButtonTitleSubtitleCellDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "getImages", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "Z", "getHasSeparator", "()Z", "Ljava/util/List;", "getButtonsInRow", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderDetailsItemVO implements c {
    private final ButtonV3DTO button;

    @NotNull
    private final List<ButtonV3DTO> buttonsInRow;

    @NotNull
    private final ButtonTitleSubtitleCellDTO cell;
    private final boolean hasSeparator;

    @NotNull
    private final IconDTO icon;
    private final long id;
    private final ImagesVO images;
    private final TestInfo testInfo;
    private final t tokenizedEvent;

    public OrderDetailsItemVO(long j11, @NotNull IconDTO icon, @NotNull ButtonTitleSubtitleCellDTO cell, ButtonV3DTO buttonV3DTO, ImagesVO imagesVO, boolean z11, @NotNull List<ButtonV3DTO> buttonsInRow, TestInfo testInfo, t tVar) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(buttonsInRow, "buttonsInRow");
        this.id = j11;
        this.icon = icon;
        this.cell = cell;
        this.button = buttonV3DTO;
        this.images = imagesVO;
        this.hasSeparator = z11;
        this.buttonsInRow = buttonsInRow;
        this.testInfo = testInfo;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailsItemVO)) {
            return false;
        }
        OrderDetailsItemVO orderDetailsItemVO = (OrderDetailsItemVO) other;
        return this.id == orderDetailsItemVO.id && Intrinsics.d(this.icon, orderDetailsItemVO.icon) && Intrinsics.d(this.cell, orderDetailsItemVO.cell) && Intrinsics.d(this.button, orderDetailsItemVO.button) && Intrinsics.d(this.images, orderDetailsItemVO.images) && this.hasSeparator == orderDetailsItemVO.hasSeparator && Intrinsics.d(this.buttonsInRow, orderDetailsItemVO.buttonsInRow) && Intrinsics.d(this.testInfo, orderDetailsItemVO.testInfo) && Intrinsics.d(this.tokenizedEvent, orderDetailsItemVO.tokenizedEvent);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtonsInRow() {
        return this.buttonsInRow;
    }

    @NotNull
    public final ButtonTitleSubtitleCellDTO getCell() {
        return this.cell;
    }

    public final boolean getHasSeparator() {
        return this.hasSeparator;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImagesVO getImages() {
        return this.images;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.cell.hashCode() + C2971a.a(this.icon, Long.hashCode(this.id) * 31, 31)) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode2 = (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        ImagesVO imagesVO = this.images;
        int b11 = g.b(C3532b.a((hashCode2 + (imagesVO == null ? 0 : imagesVO.hashCode())) * 31, 31, this.hasSeparator), 31, this.buttonsInRow);
        TestInfo testInfo = this.testInfo;
        int hashCode3 = (b11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.icon;
        ButtonTitleSubtitleCellDTO buttonTitleSubtitleCellDTO = this.cell;
        ButtonV3DTO buttonV3DTO = this.button;
        ImagesVO imagesVO = this.images;
        boolean z11 = this.hasSeparator;
        List<ButtonV3DTO> list = this.buttonsInRow;
        TestInfo testInfo = this.testInfo;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = D40.c.b("OrderDetailsItemVO(id=", j11, ", icon=", iconDTO);
        b11.append(", cell=");
        b11.append(buttonTitleSubtitleCellDTO);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(", images=");
        b11.append(imagesVO);
        b11.append(", hasSeparator=");
        b11.append(z11);
        b11.append(", buttonsInRow=");
        b11.append(list);
        b11.append(", testInfo=");
        b11.append(testInfo);
        return a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
