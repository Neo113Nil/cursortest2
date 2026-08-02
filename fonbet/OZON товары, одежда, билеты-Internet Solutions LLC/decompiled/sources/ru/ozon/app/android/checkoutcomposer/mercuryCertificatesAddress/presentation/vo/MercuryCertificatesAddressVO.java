package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.vo;

import Ak.C2436a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;", "Ll20/c;", "", "id", "", "searchHint", "Lru/ozon/uni/atoms/af/AtomAction;", "searchAction", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lru/ozon/uni/atoms/af/AtomAction;", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "Ljava/lang/String;", "getSearchHint", "Lru/ozon/uni/atoms/af/AtomAction;", "getSearchAction", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MercuryCertificatesAddressVO implements c {
    public static final int $stable = AtomAction.$stable;
    private final long id;
    private final AtomAction searchAction;
    private final String searchHint;

    public MercuryCertificatesAddressVO(long j11, String str, AtomAction atomAction) {
        this.id = j11;
        this.searchHint = str;
        this.searchAction = atomAction;
    }

    public static /* synthetic */ MercuryCertificatesAddressVO copy$default(MercuryCertificatesAddressVO mercuryCertificatesAddressVO, long j11, String str, AtomAction atomAction, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = mercuryCertificatesAddressVO.id;
        }
        if ((i11 & 2) != 0) {
            str = mercuryCertificatesAddressVO.searchHint;
        }
        if ((i11 & 4) != 0) {
            atomAction = mercuryCertificatesAddressVO.searchAction;
        }
        return mercuryCertificatesAddressVO.copy(j11, str, atomAction);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomAction getSearchAction() {
        return this.searchAction;
    }

    @NotNull
    public final MercuryCertificatesAddressVO copy(long id2, String searchHint, AtomAction searchAction) {
        return new MercuryCertificatesAddressVO(id2, searchHint, searchAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MercuryCertificatesAddressVO)) {
            return false;
        }
        MercuryCertificatesAddressVO mercuryCertificatesAddressVO = (MercuryCertificatesAddressVO) other;
        return this.id == mercuryCertificatesAddressVO.id && Intrinsics.d(this.searchHint, mercuryCertificatesAddressVO.searchHint) && Intrinsics.d(this.searchAction, mercuryCertificatesAddressVO.searchAction);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final AtomAction getSearchAction() {
        return this.searchAction;
    }

    public final String getSearchHint() {
        return this.searchHint;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.searchHint;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AtomAction atomAction = this.searchAction;
        return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.searchHint;
        AtomAction atomAction = this.searchAction;
        StringBuilder c11 = C2436a.c(j11, "MercuryCertificatesAddressVO(id=", ", searchHint=", str);
        c11.append(", searchAction=");
        c11.append(atomAction);
        c11.append(")");
        return c11.toString();
    }
}
