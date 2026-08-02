package ru.ozon.app.android.abtool.presentation.debug;

import B0.A0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/abtool/presentation/debug/UiState;", "", "", "variants", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/ozon/app/android/abtool/presentation/debug/UiState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVariants", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UiState {

    @NotNull
    private final String variants;

    /* JADX WARN: Multi-variable type inference failed */
    public UiState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final UiState copy(@NotNull String variants) {
        Intrinsics.checkNotNullParameter(variants, "variants");
        return new UiState(variants);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UiState) && Intrinsics.d(this.variants, ((UiState) other).variants);
    }

    @NotNull
    public final String getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return this.variants.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("UiState(variants=", this.variants, ")");
    }

    public UiState(@NotNull String variants) {
        Intrinsics.checkNotNullParameter(variants, "variants");
        this.variants = variants;
    }

    public /* synthetic */ UiState(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
