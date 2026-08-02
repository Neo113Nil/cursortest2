package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import A00.a;
import J0.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/AccountReplenishmentTagUpdateKey;", "LA00/a$J$a;", "", "newInput", "", "previousPosition", "currentPosition", "cursorPosition", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNewInput", "Ljava/lang/Integer;", "getPreviousPosition", "()Ljava/lang/Integer;", "getCurrentPosition", "I", "getCursorPosition", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountReplenishmentTagUpdateKey implements a.J.InterfaceC0007a {
    private final Integer currentPosition;
    private final int cursorPosition;

    @NotNull
    private final String newInput;
    private final Integer previousPosition;

    public AccountReplenishmentTagUpdateKey(@NotNull String newInput, Integer num, Integer num2, int i11) {
        Intrinsics.checkNotNullParameter(newInput, "newInput");
        this.newInput = newInput;
        this.previousPosition = num;
        this.currentPosition = num2;
        this.cursorPosition = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountReplenishmentTagUpdateKey)) {
            return false;
        }
        AccountReplenishmentTagUpdateKey accountReplenishmentTagUpdateKey = (AccountReplenishmentTagUpdateKey) other;
        return Intrinsics.d(this.newInput, accountReplenishmentTagUpdateKey.newInput) && Intrinsics.d(this.previousPosition, accountReplenishmentTagUpdateKey.previousPosition) && Intrinsics.d(this.currentPosition, accountReplenishmentTagUpdateKey.currentPosition) && this.cursorPosition == accountReplenishmentTagUpdateKey.cursorPosition;
    }

    public final Integer getCurrentPosition() {
        return this.currentPosition;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    @NotNull
    public final String getNewInput() {
        return this.newInput;
    }

    public final Integer getPreviousPosition() {
        return this.previousPosition;
    }

    public int hashCode() {
        int hashCode = this.newInput.hashCode() * 31;
        Integer num = this.previousPosition;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.currentPosition;
        return Integer.hashCode(this.cursorPosition) + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.newInput;
        Integer num = this.previousPosition;
        Integer num2 = this.currentPosition;
        int i11 = this.cursorPosition;
        StringBuilder b11 = P.b("AccountReplenishmentTagUpdateKey(newInput=", str, num, ", previousPosition=", ", currentPosition=");
        b11.append(num2);
        b11.append(", cursorPosition=");
        b11.append(i11);
        b11.append(")");
        return b11.toString();
    }
}
