package ru.ozon.app.android.rfbs.deliverycomplain.data;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/data/EnterComplainState;", "", "description", "", HammersV3BodyDTO.PLACEHOLDER, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getPlaceholder", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EnterComplainState {
    public static final int $stable = 0;

    @NotNull
    private final String description;
    private final String placeholder;

    public EnterComplainState(@NotNull String description, String str) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.description = description;
        this.placeholder = str;
    }

    public static /* synthetic */ EnterComplainState copy$default(EnterComplainState enterComplainState, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = enterComplainState.description;
        }
        if ((i11 & 2) != 0) {
            str2 = enterComplainState.placeholder;
        }
        return enterComplainState.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final EnterComplainState copy(@NotNull String description, String placeholder) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new EnterComplainState(description, placeholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterComplainState)) {
            return false;
        }
        EnterComplainState enterComplainState = (EnterComplainState) other;
        return Intrinsics.d(this.description, enterComplainState.description) && Intrinsics.d(this.placeholder, enterComplainState.placeholder);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        int hashCode = this.description.hashCode() * 31;
        String str = this.placeholder;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return e.a("EnterComplainState(description=", this.description, ", placeholder=", this.placeholder, ")");
    }
}
