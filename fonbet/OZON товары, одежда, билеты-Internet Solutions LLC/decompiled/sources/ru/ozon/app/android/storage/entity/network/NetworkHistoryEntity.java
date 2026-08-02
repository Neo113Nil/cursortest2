package ru.ozon.app.android.storage.entity.network;

import Ak.C2436a;
import G.g;
import Pk0.b;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/storage/entity/network/NetworkHistoryEntity;", "", "", "id", "", "traceId", ImagesContract.URL, "", "responseTime", "time", "<init>", "(JLjava/lang/String;Ljava/lang/String;FJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getTraceId", "getUrl", "F", "getResponseTime", "()F", "getTime", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NetworkHistoryEntity {
    private final long id;
    private final float responseTime;
    private final long time;
    private final String traceId;

    @NotNull
    private final String url;

    public NetworkHistoryEntity(long j11, String str, @NotNull String url, float f7, long j12) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = j11;
        this.traceId = str;
        this.url = url;
        this.responseTime = f7;
        this.time = j12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkHistoryEntity)) {
            return false;
        }
        NetworkHistoryEntity networkHistoryEntity = (NetworkHistoryEntity) other;
        return this.id == networkHistoryEntity.id && Intrinsics.d(this.traceId, networkHistoryEntity.traceId) && Intrinsics.d(this.url, networkHistoryEntity.url) && Float.compare(this.responseTime, networkHistoryEntity.responseTime) == 0 && this.time == networkHistoryEntity.time;
    }

    public final long getId() {
        return this.id;
    }

    public final float getResponseTime() {
        return this.responseTime;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.traceId;
        return Long.hashCode(this.time) + b.a(this.responseTime, g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.url), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.traceId;
        String str2 = this.url;
        float f7 = this.responseTime;
        long j12 = this.time;
        StringBuilder c11 = C2436a.c(j11, "NetworkHistoryEntity(id=", ", traceId=", str);
        c11.append(", url=");
        c11.append(str2);
        c11.append(", responseTime=");
        c11.append(f7);
        c11.append(", time=");
        c11.append(j12);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ NetworkHistoryEntity(long j11, String str, String str2, float f7, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, str, str2, f7, j12);
    }
}
