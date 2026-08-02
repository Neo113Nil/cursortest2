package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.contacts;

import HY.b;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/contacts/ResponsePhotoData;", "", "pics", "", "", "<init>", "(Ljava/util/Map;)V", "getPics", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ResponsePhotoData {

    @NotNull
    private final Map<String, String> pics;

    public ResponsePhotoData(@i(name = "pics") @NotNull Map<String, String> pics) {
        Intrinsics.checkNotNullParameter(pics, "pics");
        this.pics = pics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponsePhotoData copy$default(ResponsePhotoData responsePhotoData, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = responsePhotoData.pics;
        }
        return responsePhotoData.copy(map);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.pics;
    }

    @NotNull
    public final ResponsePhotoData copy(@i(name = "pics") @NotNull Map<String, String> pics) {
        Intrinsics.checkNotNullParameter(pics, "pics");
        return new ResponsePhotoData(pics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResponsePhotoData) && Intrinsics.d(this.pics, ((ResponsePhotoData) other).pics);
    }

    @NotNull
    public final Map<String, String> getPics() {
        return this.pics;
    }

    public int hashCode() {
        return this.pics.hashCode();
    }

    @NotNull
    public String toString() {
        return b.b("ResponsePhotoData(pics=", ")", this.pics);
    }
}
