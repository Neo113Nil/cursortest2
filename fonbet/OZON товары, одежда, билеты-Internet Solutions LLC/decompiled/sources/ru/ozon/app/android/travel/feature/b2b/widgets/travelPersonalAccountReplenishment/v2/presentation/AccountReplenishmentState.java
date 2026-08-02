package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import J0.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/AccountReplenishmentState;", "", "", "newInput", "", "previousSelectedTagPosition", "currentSelectedTagPosition", "cursorPosition", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNewInput", "Ljava/lang/Integer;", "getPreviousSelectedTagPosition", "()Ljava/lang/Integer;", "getCurrentSelectedTagPosition", "I", "getCursorPosition", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AccountReplenishmentState {
    private final Integer currentSelectedTagPosition;
    private final int cursorPosition;

    @NotNull
    private final String newInput;
    private final Integer previousSelectedTagPosition;

    public AccountReplenishmentState(@NotNull String newInput, Integer num, Integer num2, int i11) {
        Intrinsics.checkNotNullParameter(newInput, "newInput");
        this.newInput = newInput;
        this.previousSelectedTagPosition = num;
        this.currentSelectedTagPosition = num2;
        this.cursorPosition = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountReplenishmentState)) {
            return false;
        }
        AccountReplenishmentState accountReplenishmentState = (AccountReplenishmentState) other;
        return Intrinsics.d(this.newInput, accountReplenishmentState.newInput) && Intrinsics.d(this.previousSelectedTagPosition, accountReplenishmentState.previousSelectedTagPosition) && Intrinsics.d(this.currentSelectedTagPosition, accountReplenishmentState.currentSelectedTagPosition) && this.cursorPosition == accountReplenishmentState.cursorPosition;
    }

    public final Integer getCurrentSelectedTagPosition() {
        return this.currentSelectedTagPosition;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    @NotNull
    public final String getNewInput() {
        return this.newInput;
    }

    public final Integer getPreviousSelectedTagPosition() {
        return this.previousSelectedTagPosition;
    }

    public int hashCode() {
        int hashCode = this.newInput.hashCode() * 31;
        Integer num = this.previousSelectedTagPosition;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.currentSelectedTagPosition;
        return Integer.hashCode(this.cursorPosition) + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.newInput;
        Integer num = this.previousSelectedTagPosition;
        Integer num2 = this.currentSelectedTagPosition;
        int i11 = this.cursorPosition;
        StringBuilder b11 = P.b("AccountReplenishmentState(newInput=", str, num, ", previousSelectedTagPosition=", ", currentSelectedTagPosition=");
        b11.append(num2);
        b11.append(", cursorPosition=");
        b11.append(i11);
        b11.append(")");
        return b11.toString();
    }
}
