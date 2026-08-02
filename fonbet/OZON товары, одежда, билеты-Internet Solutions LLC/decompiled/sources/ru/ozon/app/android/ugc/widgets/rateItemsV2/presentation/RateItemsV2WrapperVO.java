package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import Ak.C2436a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2WrapperVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "asyncData", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "rateItemsV2VO", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "getRateItemsV2VO", "()Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2VO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RateItemsV2WrapperVO implements c {
    private final String asyncData;
    private final long id;
    private final RateItemsV2VO rateItemsV2VO;

    public RateItemsV2WrapperVO(long j11, String str, RateItemsV2VO rateItemsV2VO) {
        this.id = j11;
        this.asyncData = str;
        this.rateItemsV2VO = rateItemsV2VO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateItemsV2WrapperVO)) {
            return false;
        }
        RateItemsV2WrapperVO rateItemsV2WrapperVO = (RateItemsV2WrapperVO) other;
        return this.id == rateItemsV2WrapperVO.id && Intrinsics.d(this.asyncData, rateItemsV2WrapperVO.asyncData) && Intrinsics.d(this.rateItemsV2VO, rateItemsV2WrapperVO.rateItemsV2VO);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.asyncData;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RateItemsV2VO rateItemsV2VO = this.rateItemsV2VO;
        return hashCode2 + (rateItemsV2VO != null ? rateItemsV2VO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.asyncData;
        RateItemsV2VO rateItemsV2VO = this.rateItemsV2VO;
        StringBuilder c11 = C2436a.c(j11, "RateItemsV2WrapperVO(id=", ", asyncData=", str);
        c11.append(", rateItemsV2VO=");
        c11.append(rateItemsV2VO);
        c11.append(")");
        return c11.toString();
    }
}
