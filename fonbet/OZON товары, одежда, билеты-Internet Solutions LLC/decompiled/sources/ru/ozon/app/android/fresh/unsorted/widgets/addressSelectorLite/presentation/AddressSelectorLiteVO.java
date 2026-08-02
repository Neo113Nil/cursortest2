package ru.ozon.app.android.fresh.unsorted.widgets.addressSelectorLite.presentation;

import Ak.C2436a;
import G.g;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/addressSelectorLite/presentation/AddressSelectorLiteVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAddress", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressSelectorLiteVO implements c {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final String address;
    private final long id;
    private final t trackingInfo;

    public AddressSelectorLiteVO(long j11, @NotNull String address, @NotNull AtomAction action, t tVar) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.address = address;
        this.action = action;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSelectorLiteVO)) {
            return false;
        }
        AddressSelectorLiteVO addressSelectorLiteVO = (AddressSelectorLiteVO) other;
        return this.id == addressSelectorLiteVO.id && Intrinsics.d(this.address, addressSelectorLiteVO.address) && Intrinsics.d(this.action, addressSelectorLiteVO.action) && Intrinsics.d(this.trackingInfo, addressSelectorLiteVO.trackingInfo);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C4598rp.a(this.action, g.a(Long.hashCode(this.id) * 31, 31, this.address), 31);
        t tVar = this.trackingInfo;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.address;
        AtomAction atomAction = this.action;
        t tVar = this.trackingInfo;
        StringBuilder c11 = C2436a.c(j11, "AddressSelectorLiteVO(id=", ", address=", str);
        Fj.c.e(tVar, ", action=", ", trackingInfo=", c11, atomAction);
        c11.append(")");
        return c11.toString();
    }
}
