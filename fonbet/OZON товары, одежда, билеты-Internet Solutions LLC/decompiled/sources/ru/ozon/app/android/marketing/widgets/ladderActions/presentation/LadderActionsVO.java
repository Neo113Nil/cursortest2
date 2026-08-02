package ru.ozon.app.android.marketing.widgets.ladderActions.presentation;

import Ak.C2436a;
import De.C2859b;
import Fm.C3051a;
import G.g;
import J0.P;
import Pk0.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001'B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundColor", "cellSeparatorColor", "", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO$LadderActionsCellVO;", "cells", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;LWZ/t;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;LWZ/t;)Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "getCellSeparatorColor", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "LadderActionsCellVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LadderActionsVO implements c {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String cellSeparatorColor;

    @NotNull
    private final List<LadderActionsCellVO> cells;
    private final long id;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJZ\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b\r\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO$LadderActionsCellVO;", "", "", "skuId", "", "quantity", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "primaryPrice", "secondaryPrice", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "defaultButton", "activeButton", "", "isActive", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO$LadderActionsCellVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSkuId", "Ljava/lang/Integer;", "getQuantity", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrimaryPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSecondaryPrice", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDefaultButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getActiveButton", "Z", "()Z", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LadderActionsCellVO {
        public static final int $stable = PriceDTO.$stable;

        @NotNull
        private final ButtonV3DTO activeButton;

        @NotNull
        private final ButtonV3DTO defaultButton;
        private final boolean isActive;

        @NotNull
        private final PriceDTO primaryPrice;
        private final Integer quantity;

        @NotNull
        private final PriceDTO secondaryPrice;
        private final String skuId;

        public LadderActionsCellVO(String str, Integer num, @NotNull PriceDTO primaryPrice, @NotNull PriceDTO secondaryPrice, @NotNull ButtonV3DTO defaultButton, @NotNull ButtonV3DTO activeButton, boolean z11) {
            Intrinsics.checkNotNullParameter(primaryPrice, "primaryPrice");
            Intrinsics.checkNotNullParameter(secondaryPrice, "secondaryPrice");
            Intrinsics.checkNotNullParameter(defaultButton, "defaultButton");
            Intrinsics.checkNotNullParameter(activeButton, "activeButton");
            this.skuId = str;
            this.quantity = num;
            this.primaryPrice = primaryPrice;
            this.secondaryPrice = secondaryPrice;
            this.defaultButton = defaultButton;
            this.activeButton = activeButton;
            this.isActive = z11;
        }

        public static /* synthetic */ LadderActionsCellVO copy$default(LadderActionsCellVO ladderActionsCellVO, String str, Integer num, PriceDTO priceDTO, PriceDTO priceDTO2, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = ladderActionsCellVO.skuId;
            }
            if ((i11 & 2) != 0) {
                num = ladderActionsCellVO.quantity;
            }
            if ((i11 & 4) != 0) {
                priceDTO = ladderActionsCellVO.primaryPrice;
            }
            if ((i11 & 8) != 0) {
                priceDTO2 = ladderActionsCellVO.secondaryPrice;
            }
            if ((i11 & 16) != 0) {
                buttonV3DTO = ladderActionsCellVO.defaultButton;
            }
            if ((i11 & 32) != 0) {
                buttonV3DTO2 = ladderActionsCellVO.activeButton;
            }
            if ((i11 & 64) != 0) {
                z11 = ladderActionsCellVO.isActive;
            }
            ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
            boolean z12 = z11;
            ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
            PriceDTO priceDTO3 = priceDTO;
            return ladderActionsCellVO.copy(str, num, priceDTO3, priceDTO2, buttonV3DTO4, buttonV3DTO3, z12);
        }

        @NotNull
        public final LadderActionsCellVO copy(String skuId, Integer quantity, @NotNull PriceDTO primaryPrice, @NotNull PriceDTO secondaryPrice, @NotNull ButtonV3DTO defaultButton, @NotNull ButtonV3DTO activeButton, boolean isActive) {
            Intrinsics.checkNotNullParameter(primaryPrice, "primaryPrice");
            Intrinsics.checkNotNullParameter(secondaryPrice, "secondaryPrice");
            Intrinsics.checkNotNullParameter(defaultButton, "defaultButton");
            Intrinsics.checkNotNullParameter(activeButton, "activeButton");
            return new LadderActionsCellVO(skuId, quantity, primaryPrice, secondaryPrice, defaultButton, activeButton, isActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LadderActionsCellVO)) {
                return false;
            }
            LadderActionsCellVO ladderActionsCellVO = (LadderActionsCellVO) other;
            return Intrinsics.d(this.skuId, ladderActionsCellVO.skuId) && Intrinsics.d(this.quantity, ladderActionsCellVO.quantity) && Intrinsics.d(this.primaryPrice, ladderActionsCellVO.primaryPrice) && Intrinsics.d(this.secondaryPrice, ladderActionsCellVO.secondaryPrice) && Intrinsics.d(this.defaultButton, ladderActionsCellVO.defaultButton) && Intrinsics.d(this.activeButton, ladderActionsCellVO.activeButton) && this.isActive == ladderActionsCellVO.isActive;
        }

        @NotNull
        public final ButtonV3DTO getActiveButton() {
            return this.activeButton;
        }

        @NotNull
        public final ButtonV3DTO getDefaultButton() {
            return this.defaultButton;
        }

        @NotNull
        public final PriceDTO getPrimaryPrice() {
            return this.primaryPrice;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        @NotNull
        public final PriceDTO getSecondaryPrice() {
            return this.secondaryPrice;
        }

        public final String getSkuId() {
            return this.skuId;
        }

        public int hashCode() {
            String str = this.skuId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.quantity;
            return Boolean.hashCode(this.isActive) + C2859b.c(this.activeButton, C2859b.c(this.defaultButton, C3051a.b(this.secondaryPrice, C3051a.b(this.primaryPrice, (hashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31), 31);
        }

        /* renamed from: isActive, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            String str = this.skuId;
            Integer num = this.quantity;
            PriceDTO priceDTO = this.primaryPrice;
            PriceDTO priceDTO2 = this.secondaryPrice;
            ButtonV3DTO buttonV3DTO = this.defaultButton;
            ButtonV3DTO buttonV3DTO2 = this.activeButton;
            boolean z11 = this.isActive;
            StringBuilder b11 = P.b("LadderActionsCellVO(skuId=", str, num, ", quantity=", ", primaryPrice=");
            b11.append(priceDTO);
            b11.append(", secondaryPrice=");
            b11.append(priceDTO2);
            b11.append(", defaultButton=");
            b11.append(buttonV3DTO);
            b11.append(", activeButton=");
            b11.append(buttonV3DTO2);
            b11.append(", isActive=");
            return a.a(")", b11, z11);
        }
    }

    public LadderActionsVO(long j11, @NotNull String backgroundColor, @NotNull String cellSeparatorColor, @NotNull List<LadderActionsCellVO> cells, t tVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cellSeparatorColor, "cellSeparatorColor");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.id = j11;
        this.backgroundColor = backgroundColor;
        this.cellSeparatorColor = cellSeparatorColor;
        this.cells = cells;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ LadderActionsVO copy$default(LadderActionsVO ladderActionsVO, long j11, String str, String str2, List list, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = ladderActionsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = ladderActionsVO.backgroundColor;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = ladderActionsVO.cellSeparatorColor;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            list = ladderActionsVO.cells;
        }
        List list2 = list;
        if ((i11 & 16) != 0) {
            tVar = ladderActionsVO.tokenizedEvent;
        }
        return ladderActionsVO.copy(j12, str3, str4, list2, tVar);
    }

    @NotNull
    public final LadderActionsVO copy(long id2, @NotNull String backgroundColor, @NotNull String cellSeparatorColor, @NotNull List<LadderActionsCellVO> cells, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cellSeparatorColor, "cellSeparatorColor");
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new LadderActionsVO(id2, backgroundColor, cellSeparatorColor, cells, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LadderActionsVO)) {
            return false;
        }
        LadderActionsVO ladderActionsVO = (LadderActionsVO) other;
        return this.id == ladderActionsVO.id && Intrinsics.d(this.backgroundColor, ladderActionsVO.backgroundColor) && Intrinsics.d(this.cellSeparatorColor, ladderActionsVO.cellSeparatorColor) && Intrinsics.d(this.cells, ladderActionsVO.cells) && Intrinsics.d(this.tokenizedEvent, ladderActionsVO.tokenizedEvent);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getCellSeparatorColor() {
        return this.cellSeparatorColor;
    }

    @NotNull
    public final List<LadderActionsCellVO> getCells() {
        return this.cells;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int b11 = g.b(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.backgroundColor), 31, this.cellSeparatorColor), 31, this.cells);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        String str2 = this.cellSeparatorColor;
        List<LadderActionsCellVO> list = this.cells;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "LadderActionsVO(id=", ", backgroundColor=", str);
        Nh.a.g(", cellSeparatorColor=", str2, ", cells=", c11, list);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
