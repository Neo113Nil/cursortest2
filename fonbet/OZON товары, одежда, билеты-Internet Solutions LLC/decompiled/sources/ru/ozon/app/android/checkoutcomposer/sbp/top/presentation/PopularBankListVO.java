package ru.ozon.app.android.checkoutcomposer.sbp.top.presentation;

import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/top/presentation/PopularBankListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "banks", "Lru/ozon/uni/android/flashbar/model/Restriction;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "", "backgroundColor", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/uni/android/flashbar/model/Restriction;Ljava/lang/String;LWZ/t;)V", "J", "getId", "()J", "Ljava/util/List;", "getBanks", "()Ljava/util/List;", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "Ljava/lang/String;", "getBackgroundColor", "()Ljava/lang/String;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PopularBankListVO implements c {
    private final String backgroundColor;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle> banks;
    private final long id;
    private final Restriction restriction;
    private final t tokenizedEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public PopularBankListVO(long j11, @NotNull List<? extends CellAtom.CellAtomWithSubtitle> banks, Restriction restriction, String str, t tVar) {
        Intrinsics.checkNotNullParameter(banks, "banks");
        this.id = j11;
        this.banks = banks;
        this.restriction = restriction;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle> getBanks() {
        return this.banks;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Restriction getRestriction() {
        return this.restriction;
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
}
