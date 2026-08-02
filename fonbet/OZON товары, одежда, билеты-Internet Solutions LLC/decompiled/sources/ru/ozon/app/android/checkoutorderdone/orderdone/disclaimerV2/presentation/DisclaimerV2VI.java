package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.cscore.padding.PaddingCompose;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/DisclaimerV2VI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/TimerVI;", DynamicElementDTO.TIMER, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/app/android/cscore/padding/PaddingCompose;", "paddings", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/TimerVI;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/cscore/padding/PaddingCompose;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/TimerVI;", "getTimer", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/TimerVI;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/app/android/cscore/padding/PaddingCompose;", "getPaddings", "()Lru/ozon/app/android/cscore/padding/PaddingCompose;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisclaimerV2VI implements c {

    @NotNull
    private final DisclaimerDTO disclaimer;
    private final long id;

    @NotNull
    private final PaddingCompose paddings;
    private final TestInfo testInfo;
    private final TimerVI timer;
    private final t tokenizedEvent;

    public DisclaimerV2VI(long j11, TimerVI timerVI, @NotNull DisclaimerDTO disclaimer, TestInfo testInfo, @NotNull PaddingCompose paddings, t tVar) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = j11;
        this.timer = timerVI;
        this.disclaimer = disclaimer;
        this.testInfo = testInfo;
        this.paddings = paddings;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerV2VI)) {
            return false;
        }
        DisclaimerV2VI disclaimerV2VI = (DisclaimerV2VI) other;
        return this.id == disclaimerV2VI.id && Intrinsics.d(this.timer, disclaimerV2VI.timer) && Intrinsics.d(this.disclaimer, disclaimerV2VI.disclaimer) && Intrinsics.d(this.testInfo, disclaimerV2VI.testInfo) && Intrinsics.d(this.paddings, disclaimerV2VI.paddings) && Intrinsics.d(this.tokenizedEvent, disclaimerV2VI.tokenizedEvent);
    }

    @NotNull
    public final DisclaimerDTO getDisclaimer() {
        return this.disclaimer;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PaddingCompose getPaddings() {
        return this.paddings;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TimerVI getTimer() {
        return this.timer;
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
        TimerVI timerVI = this.timer;
        int hashCode2 = (this.disclaimer.hashCode() + ((hashCode + (timerVI == null ? 0 : timerVI.hashCode())) * 31)) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode3 = (this.paddings.hashCode() + ((hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DisclaimerV2VI(id=" + this.id + ", timer=" + this.timer + ", disclaimer=" + this.disclaimer + ", testInfo=" + this.testInfo + ", paddings=" + this.paddings + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
