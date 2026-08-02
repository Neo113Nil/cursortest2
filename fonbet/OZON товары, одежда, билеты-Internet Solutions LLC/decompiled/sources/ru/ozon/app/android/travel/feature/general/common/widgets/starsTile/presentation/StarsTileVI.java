package ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.presentation;

import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.starsBlock.StarsBalanceMoleculeVI;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/starsTile/presentation/StarsTileVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;", "firstBlock", "secondBlock", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;", "getFirstBlock", "()Lru/ozon/app/android/travel/molecules/view/starsBlock/StarsBalanceMoleculeVI;", "getSecondBlock", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StarsTileVI implements c {
    private final String backgroundColor;

    @NotNull
    private final StarsBalanceMoleculeVI firstBlock;
    private final long id;

    @NotNull
    private final StarsBalanceMoleculeVI secondBlock;
    private final t tokenizedEvent;

    public StarsTileVI(long j11, @NotNull StarsBalanceMoleculeVI firstBlock, @NotNull StarsBalanceMoleculeVI secondBlock, String str, t tVar) {
        Intrinsics.checkNotNullParameter(firstBlock, "firstBlock");
        Intrinsics.checkNotNullParameter(secondBlock, "secondBlock");
        this.id = j11;
        this.firstBlock = firstBlock;
        this.secondBlock = secondBlock;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StarsTileVI)) {
            return false;
        }
        StarsTileVI starsTileVI = (StarsTileVI) other;
        return this.id == starsTileVI.id && Intrinsics.d(this.firstBlock, starsTileVI.firstBlock) && Intrinsics.d(this.secondBlock, starsTileVI.secondBlock) && Intrinsics.d(this.backgroundColor, starsTileVI.backgroundColor) && Intrinsics.d(this.tokenizedEvent, starsTileVI.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final StarsBalanceMoleculeVI getFirstBlock() {
        return this.firstBlock;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final StarsBalanceMoleculeVI getSecondBlock() {
        return this.secondBlock;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.secondBlock.hashCode() + ((this.firstBlock.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        StarsBalanceMoleculeVI starsBalanceMoleculeVI = this.firstBlock;
        StarsBalanceMoleculeVI starsBalanceMoleculeVI2 = this.secondBlock;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("StarsTileVI(id=");
        sb2.append(j11);
        sb2.append(", firstBlock=");
        sb2.append(starsBalanceMoleculeVI);
        sb2.append(", secondBlock=");
        sb2.append(starsBalanceMoleculeVI2);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
