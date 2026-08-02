package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation;

import A00.a;
import C.C2702w;
import P4.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/CurtainTimerUpdate;", "LA00/a$J$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "id", "J", "getId", "()J", "time", "getTime", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CurtainTimerUpdate implements a.J.InterfaceC0007a {
    private final long id;
    private final long time;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainTimerUpdate)) {
            return false;
        }
        CurtainTimerUpdate curtainTimerUpdate = (CurtainTimerUpdate) other;
        return this.id == curtainTimerUpdate.id && this.time == curtainTimerUpdate.time;
    }

    public final long getId() {
        return this.id;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time) + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return f.a(this.time, ")", C2702w.d(this.id, "CurtainTimerUpdate(id=", ", time="));
    }
}
