package ru.ozon.app.android.ui.switchingbutton;

import Ve.C4598rp;
import W10.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;", "", "", "voId", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "switchingButton", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "<init>", "(JLru/ozon/app/android/atoms/data/button/SwitchingButton;Lru/ozon/uni/atoms/af/AtomAction;LW10/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getVoId", "()J", "Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "getSwitchingButton", "()Lru/ozon/app/android/atoms/data/button/SwitchingButton;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LW10/c;", "getTrackingData", "()LW10/c;", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SwitchingButtonAction {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final SwitchingButton switchingButton;
    private final c trackingData;
    private final long voId;

    public SwitchingButtonAction(long j11, @NotNull SwitchingButton switchingButton, @NotNull AtomAction action, c cVar) {
        Intrinsics.checkNotNullParameter(switchingButton, "switchingButton");
        Intrinsics.checkNotNullParameter(action, "action");
        this.voId = j11;
        this.switchingButton = switchingButton;
        this.action = action;
        this.trackingData = cVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchingButtonAction)) {
            return false;
        }
        SwitchingButtonAction switchingButtonAction = (SwitchingButtonAction) other;
        return this.voId == switchingButtonAction.voId && Intrinsics.d(this.switchingButton, switchingButtonAction.switchingButton) && Intrinsics.d(this.action, switchingButtonAction.action) && Intrinsics.d(this.trackingData, switchingButtonAction.trackingData);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final SwitchingButton getSwitchingButton() {
        return this.switchingButton;
    }

    public final c getTrackingData() {
        return this.trackingData;
    }

    public final long getVoId() {
        return this.voId;
    }

    public int hashCode() {
        int a11 = C4598rp.a(this.action, (this.switchingButton.hashCode() + (Long.hashCode(this.voId) * 31)) * 31, 31);
        c cVar = this.trackingData;
        return a11 + (cVar == null ? 0 : cVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "SwitchingButtonAction(voId=" + this.voId + ", switchingButton=" + this.switchingButton + ", action=" + this.action + ", trackingData=" + this.trackingData + ")";
    }
}
