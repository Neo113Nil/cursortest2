package ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation;

import A00.a;
import Am.C2438a;
import B0.C2454a;
import K00.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/CaseUpdate;", "LA00/a$J$a;", "", "position", "firstSelectedPosition", "lastSelectedPosition", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPosition", "getFirstSelectedPosition", "getLastSelectedPosition", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CaseUpdate implements a.J.InterfaceC0007a {
    private final int firstSelectedPosition;
    private final int lastSelectedPosition;
    private final int position;

    public CaseUpdate(int i11, int i12, int i13) {
        this.position = i11;
        this.firstSelectedPosition = i12;
        this.lastSelectedPosition = i13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaseUpdate)) {
            return false;
        }
        CaseUpdate caseUpdate = (CaseUpdate) other;
        return this.position == caseUpdate.position && this.firstSelectedPosition == caseUpdate.firstSelectedPosition && this.lastSelectedPosition == caseUpdate.lastSelectedPosition;
    }

    public final int getFirstSelectedPosition() {
        return this.firstSelectedPosition;
    }

    public final int getLastSelectedPosition() {
        return this.lastSelectedPosition;
    }

    public final int getPosition() {
        return this.position;
    }

    public int hashCode() {
        return Integer.hashCode(this.lastSelectedPosition) + C2454a.a(this.firstSelectedPosition, Integer.hashCode(this.position) * 31, 31);
    }

    @NotNull
    public String toString() {
        return b.e(this.lastSelectedPosition, ")", C2438a.a("CaseUpdate(position=", this.position, ", firstSelectedPosition=", ", lastSelectedPosition=", this.firstSelectedPosition));
    }
}
