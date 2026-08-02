package ru.ozon.app.android.marketing.ui.trustfactors.presentation;

import Ak.C2436a;
import Ak.b;
import G.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundColor", "", "Lru/ozon/app/android/marketing/ui/trustfactors/presentation/TrustFactorItemVO;", "trustFactors", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/util/List;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "Ljava/util/List;", "getTrustFactors", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "trust-factors_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TrustFactorsVO implements c {
    private final String backgroundColor;
    private final long id;
    private final t tokenizedEvent;

    @NotNull
    private final List<TrustFactorItemVO> trustFactors;

    public TrustFactorsVO(long j11, String str, @NotNull List<TrustFactorItemVO> trustFactors, t tVar) {
        Intrinsics.checkNotNullParameter(trustFactors, "trustFactors");
        this.id = j11;
        this.backgroundColor = str;
        this.trustFactors = trustFactors;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustFactorsVO)) {
            return false;
        }
        TrustFactorsVO trustFactorsVO = (TrustFactorsVO) other;
        return this.id == trustFactorsVO.id && Intrinsics.d(this.backgroundColor, trustFactorsVO.backgroundColor) && Intrinsics.d(this.trustFactors, trustFactorsVO.trustFactors) && Intrinsics.d(this.tokenizedEvent, trustFactorsVO.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
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

    @NotNull
    public final List<TrustFactorItemVO> getTrustFactors() {
        return this.trustFactors;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.backgroundColor;
        int b11 = g.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.trustFactors);
        t tVar = this.tokenizedEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        List<TrustFactorItemVO> list = this.trustFactors;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "TrustFactorsVO(id=", ", backgroundColor=", str);
        b.h(c11, ", trustFactors=", list, ", tokenizedEvent=", tVar);
        c11.append(")");
        return c11.toString();
    }
}
