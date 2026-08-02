package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation;

import Ak.C2436a;
import El.C2971a;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\n\u0010\"R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "delay", "", "refreshFromBackground", "refreshFromAnotherPage", "isSilent", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/Double;ZZZLWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Double;", "getDelay", "()Ljava/lang/Double;", "Z", "getRefreshFromBackground", "()Z", "getRefreshFromAnotherPage", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AdvRefreshWithDelayVO implements c {
    private final Double delay;
    private final long id;
    private final boolean isSilent;
    private final boolean refreshFromAnotherPage;
    private final boolean refreshFromBackground;
    private final t tokenizedEvent;

    public AdvRefreshWithDelayVO(long j11, Double d11, boolean z11, boolean z12, boolean z13, t tVar) {
        this.id = j11;
        this.delay = d11;
        this.refreshFromBackground = z11;
        this.refreshFromAnotherPage = z12;
        this.isSilent = z13;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvRefreshWithDelayVO)) {
            return false;
        }
        AdvRefreshWithDelayVO advRefreshWithDelayVO = (AdvRefreshWithDelayVO) other;
        return this.id == advRefreshWithDelayVO.id && Intrinsics.d(this.delay, advRefreshWithDelayVO.delay) && this.refreshFromBackground == advRefreshWithDelayVO.refreshFromBackground && this.refreshFromAnotherPage == advRefreshWithDelayVO.refreshFromAnotherPage && this.isSilent == advRefreshWithDelayVO.isSilent && Intrinsics.d(this.tokenizedEvent, advRefreshWithDelayVO.tokenizedEvent);
    }

    public final Double getDelay() {
        return this.delay;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final boolean getRefreshFromAnotherPage() {
        return this.refreshFromAnotherPage;
    }

    public final boolean getRefreshFromBackground() {
        return this.refreshFromBackground;
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
        Double d11 = this.delay;
        int a11 = C3532b.a(C3532b.a(C3532b.a((hashCode + (d11 == null ? 0 : d11.hashCode())) * 31, 31, this.refreshFromBackground), 31, this.refreshFromAnotherPage), 31, this.isSilent);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isSilent, reason: from getter */
    public final boolean getIsSilent() {
        return this.isSilent;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Double d11 = this.delay;
        boolean z11 = this.refreshFromBackground;
        boolean z12 = this.refreshFromAnotherPage;
        boolean z13 = this.isSilent;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("AdvRefreshWithDelayVO(id=");
        sb2.append(j11);
        sb2.append(", delay=");
        sb2.append(d11);
        C2436a.e(", refreshFromBackground=", ", refreshFromAnotherPage=", sb2, z11, z12);
        C2971a.d(sb2, ", isSilent=", z13, ", tokenizedEvent=", tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
