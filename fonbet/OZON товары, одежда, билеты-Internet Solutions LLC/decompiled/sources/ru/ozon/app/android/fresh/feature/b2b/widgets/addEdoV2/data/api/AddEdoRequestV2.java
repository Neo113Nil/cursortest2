package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.api;

import V.e;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/api/AddEdoRequestV2;", "", "clientId", "", "edoId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getEdoId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddEdoRequestV2 {
    public static final int $stable = 0;

    @NotNull
    private final String clientId;

    @NotNull
    private final String edoId;

    public AddEdoRequestV2(@NotNull String clientId, @i(name = "EDOID") @NotNull String edoId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(edoId, "edoId");
        this.clientId = clientId;
        this.edoId = edoId;
    }

    public static /* synthetic */ AddEdoRequestV2 copy$default(AddEdoRequestV2 addEdoRequestV2, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addEdoRequestV2.clientId;
        }
        if ((i11 & 2) != 0) {
            str2 = addEdoRequestV2.edoId;
        }
        return addEdoRequestV2.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEdoId() {
        return this.edoId;
    }

    @NotNull
    public final AddEdoRequestV2 copy(@NotNull String clientId, @i(name = "EDOID") @NotNull String edoId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(edoId, "edoId");
        return new AddEdoRequestV2(clientId, edoId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddEdoRequestV2)) {
            return false;
        }
        AddEdoRequestV2 addEdoRequestV2 = (AddEdoRequestV2) other;
        return Intrinsics.d(this.clientId, addEdoRequestV2.clientId) && Intrinsics.d(this.edoId, addEdoRequestV2.edoId);
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getEdoId() {
        return this.edoId;
    }

    public int hashCode() {
        return this.edoId.hashCode() + (this.clientId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("AddEdoRequestV2(clientId=", this.clientId, ", edoId=", this.edoId, ")");
    }
}
