package ru.ozon.app.android.travel.feature.general.common.widgets.disclaimer.v2.presentation;

import GR.b;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b$\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010\u0010¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/disclaimer/v2/presentation/DisclaimerV2VO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "disclaimerContent", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimerContent", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "Ljava/lang/String;", "getBackgroundColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DisclaimerV2VO implements c {
    public static final int $stable = DisclaimerDTO.$stable;
    private final String backgroundColor;

    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final DisclaimerDTO disclaimerContent;
    private final long id;

    @NotNull
    private final Paddings leftPadding;

    @NotNull
    private final Paddings rightPadding;

    @NotNull
    private final Paddings topPadding;

    public DisclaimerV2VO(long j11, @NotNull DisclaimerDTO disclaimerContent, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding, String str) {
        Intrinsics.checkNotNullParameter(disclaimerContent, "disclaimerContent");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        this.id = j11;
        this.disclaimerContent = disclaimerContent;
        this.topPadding = topPadding;
        this.bottomPadding = bottomPadding;
        this.leftPadding = leftPadding;
        this.rightPadding = rightPadding;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerV2VO)) {
            return false;
        }
        DisclaimerV2VO disclaimerV2VO = (DisclaimerV2VO) other;
        return this.id == disclaimerV2VO.id && Intrinsics.d(this.disclaimerContent, disclaimerV2VO.disclaimerContent) && this.topPadding == disclaimerV2VO.topPadding && this.bottomPadding == disclaimerV2VO.bottomPadding && this.leftPadding == disclaimerV2VO.leftPadding && this.rightPadding == disclaimerV2VO.rightPadding && Intrinsics.d(this.backgroundColor, disclaimerV2VO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final DisclaimerDTO getDisclaimerContent() {
        return this.disclaimerContent;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = b.b(this.rightPadding, b.b(this.leftPadding, b.b(this.bottomPadding, b.b(this.topPadding, (this.disclaimerContent.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31), 31), 31), 31);
        String str = this.backgroundColor;
        return b11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        DisclaimerDTO disclaimerDTO = this.disclaimerContent;
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.bottomPadding;
        Paddings paddings3 = this.leftPadding;
        Paddings paddings4 = this.rightPadding;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("DisclaimerV2VO(id=");
        sb2.append(j11);
        sb2.append(", disclaimerContent=");
        sb2.append(disclaimerDTO);
        sb2.append(", topPadding=");
        sb2.append(paddings);
        sb2.append(", bottomPadding=");
        sb2.append(paddings2);
        sb2.append(", leftPadding=");
        sb2.append(paddings3);
        sb2.append(", rightPadding=");
        sb2.append(paddings4);
        return C6594f.a(", backgroundColor=", str, ")", sb2);
    }
}
