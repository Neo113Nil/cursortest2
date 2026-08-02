package ru.ozon.app.android.cml.delivery.widgets.secureDeal.presentation;

import B0.C2454a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.secureDeal.data.SecureDealMoleculeDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDeal/presentation/SecureDealVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "scrollWidgetKey", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "secureDeal", "LWZ/t;", "tokenizedEvent", "<init>", "(JILru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "getSecureDeal", "()Lru/ozon/app/android/cml/delivery/molecules/secureDeal/data/SecureDealMoleculeDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SecureDealVO implements c {
    private final long id;
    private final int scrollWidgetKey;

    @NotNull
    private final SecureDealMoleculeDTO secureDeal;
    private final t tokenizedEvent;

    public SecureDealVO(long j11, int i11, @NotNull SecureDealMoleculeDTO secureDeal, t tVar) {
        Intrinsics.checkNotNullParameter(secureDeal, "secureDeal");
        this.id = j11;
        this.scrollWidgetKey = i11;
        this.secureDeal = secureDeal;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecureDealVO)) {
            return false;
        }
        SecureDealVO secureDealVO = (SecureDealVO) other;
        return this.id == secureDealVO.id && this.scrollWidgetKey == secureDealVO.scrollWidgetKey && Intrinsics.d(this.secureDeal, secureDealVO.secureDeal) && Intrinsics.d(this.tokenizedEvent, secureDealVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(this.scrollWidgetKey);
    }

    @NotNull
    public final SecureDealMoleculeDTO getSecureDeal() {
        return this.secureDeal;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.secureDeal.hashCode() + C2454a.a(this.scrollWidgetKey, Long.hashCode(this.id) * 31, 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.scrollWidgetKey;
        SecureDealMoleculeDTO secureDealMoleculeDTO = this.secureDeal;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = Ql.c.b(j11, "SecureDealVO(id=", i11, ", scrollWidgetKey=");
        b11.append(", secureDeal=");
        b11.append(secureDealMoleculeDTO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
