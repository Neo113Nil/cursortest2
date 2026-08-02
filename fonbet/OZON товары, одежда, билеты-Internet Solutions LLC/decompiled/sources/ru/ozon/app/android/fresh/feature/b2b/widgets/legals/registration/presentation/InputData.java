package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import Ak.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/InputData;", "", "", "text", "", "isCheckBoxMarked", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Z", "()Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class InputData {
    private final boolean isCheckBoxMarked;

    @NotNull
    private final String text;

    public InputData(@NotNull String text, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.isCheckBoxMarked = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputData)) {
            return false;
        }
        InputData inputData = (InputData) other;
        return Intrinsics.d(this.text, inputData.text) && this.isCheckBoxMarked == inputData.isCheckBoxMarked;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCheckBoxMarked) + (this.text.hashCode() * 31);
    }

    /* renamed from: isCheckBoxMarked, reason: from getter */
    public final boolean getIsCheckBoxMarked() {
        return this.isCheckBoxMarked;
    }

    @NotNull
    public String toString() {
        return b.f("InputData(text=", this.text, ", isCheckBoxMarked=", ")", this.isCheckBoxMarked);
    }
}
