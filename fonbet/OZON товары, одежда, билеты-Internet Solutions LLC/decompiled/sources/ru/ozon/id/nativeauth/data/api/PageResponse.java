package ru.ozon.id.nativeauth.data.api;

import C.C2702w;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/id/nativeauth/data/api/PageResponse;", "T", "", "data", "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lru/ozon/id/nativeauth/data/api/PageResponse;", "equals", "", "other", "hashCode", "", "toString", "", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PageResponse<T> {
    private final T data;

    public PageResponse(T t2) {
        this.data = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageResponse copy$default(PageResponse pageResponse, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = pageResponse.data;
        }
        return pageResponse.copy(obj);
    }

    public final T component1() {
        return this.data;
    }

    @NotNull
    public final PageResponse<T> copy(T data) {
        return new PageResponse<>(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PageResponse) && Intrinsics.d(this.data, ((PageResponse) other).data);
    }

    public final T getData() {
        return this.data;
    }

    public int hashCode() {
        T t2 = this.data;
        if (t2 == null) {
            return 0;
        }
        return t2.hashCode();
    }

    @NotNull
    public String toString() {
        return C2702w.c(this.data, "PageResponse(data=", ")");
    }
}
