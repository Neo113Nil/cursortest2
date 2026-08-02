package ru.ozon.fintech.features.offline.data.model.cbottom;

import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/offline/data/model/cbottom/CbottomSheet;", "", "type", "", "layout", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getLayout", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CbottomSheet {

    @i(name = "layout")
    @NotNull
    private final String layout;

    @i(name = "type")
    @NotNull
    private final String type;

    public CbottomSheet(@NotNull String type, @NotNull String layout) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.type = type;
        this.layout = layout;
    }

    public static /* synthetic */ CbottomSheet copy$default(CbottomSheet cbottomSheet, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cbottomSheet.type;
        }
        if ((i11 & 2) != 0) {
            str2 = cbottomSheet.layout;
        }
        return cbottomSheet.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLayout() {
        return this.layout;
    }

    @NotNull
    public final CbottomSheet copy(@NotNull String type, @NotNull String layout) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(layout, "layout");
        return new CbottomSheet(type, layout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CbottomSheet)) {
            return false;
        }
        CbottomSheet cbottomSheet = (CbottomSheet) other;
        return Intrinsics.d(this.type, cbottomSheet.type) && Intrinsics.d(this.layout, cbottomSheet.layout);
    }

    @NotNull
    public final String getLayout() {
        return this.layout;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.layout.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("CbottomSheet(type=", this.type, ", layout=", this.layout, ")");
    }
}
