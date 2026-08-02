package ru.ozon.app.android.monetization.widgets.skuListCopy.presentation;

import Bi.b;
import D3.h;
import De.C2859b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/monetization/widgets/skuListCopy/presentation/SkuListItemVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "skuCell", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "skuButton", "linkButton", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSkuCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSkuButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getLinkButton", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SkuListItemVI implements c {
    private final long id;

    @NotNull
    private final ButtonV3DTO linkButton;

    @NotNull
    private final ButtonV3DTO skuButton;

    @NotNull
    private final CellDTO skuCell;
    private final TestInfo testInfo;

    public SkuListItemVI(long j11, @NotNull CellDTO skuCell, @NotNull ButtonV3DTO skuButton, @NotNull ButtonV3DTO linkButton, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(skuCell, "skuCell");
        Intrinsics.checkNotNullParameter(skuButton, "skuButton");
        Intrinsics.checkNotNullParameter(linkButton, "linkButton");
        this.id = j11;
        this.skuCell = skuCell;
        this.skuButton = skuButton;
        this.linkButton = linkButton;
        this.testInfo = testInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkuListItemVI)) {
            return false;
        }
        SkuListItemVI skuListItemVI = (SkuListItemVI) other;
        return this.id == skuListItemVI.id && Intrinsics.d(this.skuCell, skuListItemVI.skuCell) && Intrinsics.d(this.skuButton, skuListItemVI.skuButton) && Intrinsics.d(this.linkButton, skuListItemVI.linkButton) && Intrinsics.d(this.testInfo, skuListItemVI.testInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ButtonV3DTO getLinkButton() {
        return this.linkButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getSkuButton() {
        return this.skuButton;
    }

    @NotNull
    public final CellDTO getSkuCell() {
        return this.skuCell;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.linkButton, C2859b.c(this.skuButton, b.c(this.skuCell, Long.hashCode(this.id) * 31, 31), 31), 31);
        TestInfo testInfo = this.testInfo;
        return c11 + (testInfo == null ? 0 : testInfo.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.skuCell;
        ButtonV3DTO buttonV3DTO = this.skuButton;
        ButtonV3DTO buttonV3DTO2 = this.linkButton;
        TestInfo testInfo = this.testInfo;
        StringBuilder e11 = h.e("SkuListItemVI(id=", j11, ", skuCell=", cellDTO);
        e11.append(", skuButton=");
        e11.append(buttonV3DTO);
        e11.append(", linkButton=");
        e11.append(buttonV3DTO2);
        e11.append(", testInfo=");
        e11.append(testInfo);
        e11.append(")");
        return e11.toString();
    }
}
