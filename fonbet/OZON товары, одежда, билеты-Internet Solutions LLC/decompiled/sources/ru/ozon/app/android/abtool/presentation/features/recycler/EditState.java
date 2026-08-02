package ru.ozon.app.android.abtool.presentation.features.recycler;

import B90.C2618u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/EditState;", "", "", "text", "", "selection", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "I", "getSelection", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EditState {
    private final int selection;

    @NotNull
    private final String text;

    public EditState(@NotNull String text, int i11) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.selection = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditState)) {
            return false;
        }
        EditState editState = (EditState) other;
        return Intrinsics.d(this.text, editState.text) && this.selection == editState.selection;
    }

    public final int getSelection() {
        return this.selection;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Integer.hashCode(this.selection) + (this.text.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2618u.f(this.selection, "EditState(text=", this.text, ", selection=", ")");
    }
}
