package ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel;

import Pk0.a;
import W10.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/PageState;", "", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "vo", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "silentRefresh", "<init>", "(Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;LW10/c;Z)V", "copy", "(Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;LW10/c;Z)Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/PageState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "getVo", "()Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "LW10/c;", "getTrackingData", "()LW10/c;", "Z", "getSilentRefresh", "()Z", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PageState {
    private final boolean silentRefresh;
    private final c trackingData;

    @NotNull
    private final OTPWidgetVO vo;

    public PageState(@NotNull OTPWidgetVO vo, c cVar, boolean z11) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.vo = vo;
        this.trackingData = cVar;
        this.silentRefresh = z11;
    }

    public static /* synthetic */ PageState copy$default(PageState pageState, OTPWidgetVO oTPWidgetVO, c cVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            oTPWidgetVO = pageState.vo;
        }
        if ((i11 & 2) != 0) {
            cVar = pageState.trackingData;
        }
        if ((i11 & 4) != 0) {
            z11 = pageState.silentRefresh;
        }
        return pageState.copy(oTPWidgetVO, cVar, z11);
    }

    @NotNull
    public final PageState copy(@NotNull OTPWidgetVO vo, c trackingData, boolean silentRefresh) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        return new PageState(vo, trackingData, silentRefresh);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageState)) {
            return false;
        }
        PageState pageState = (PageState) other;
        return Intrinsics.d(this.vo, pageState.vo) && Intrinsics.d(this.trackingData, pageState.trackingData) && this.silentRefresh == pageState.silentRefresh;
    }

    public final boolean getSilentRefresh() {
        return this.silentRefresh;
    }

    public final c getTrackingData() {
        return this.trackingData;
    }

    @NotNull
    public final OTPWidgetVO getVo() {
        return this.vo;
    }

    public int hashCode() {
        int hashCode = this.vo.hashCode() * 31;
        c cVar = this.trackingData;
        return Boolean.hashCode(this.silentRefresh) + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        OTPWidgetVO oTPWidgetVO = this.vo;
        c cVar = this.trackingData;
        boolean z11 = this.silentRefresh;
        StringBuilder sb2 = new StringBuilder("PageState(vo=");
        sb2.append(oTPWidgetVO);
        sb2.append(", trackingData=");
        sb2.append(cVar);
        sb2.append(", silentRefresh=");
        return a.a(")", sb2, z11);
    }

    public /* synthetic */ PageState(OTPWidgetVO oTPWidgetVO, c cVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(oTPWidgetVO, cVar, (i11 & 4) != 0 ? false : z11);
    }
}
