package ru.ozon.android.messenger.framework.data.remote.models;

import B0.C2454a;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/ComposedMessageInfo;", "", "guid", "", "num", "", "total", "<init>", "(Ljava/lang/String;II)V", "getGuid", "()Ljava/lang/String;", "getNum", "()I", "getTotal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ComposedMessageInfo {
    public static final int $stable = 0;

    @NotNull
    private final String guid;
    private final int num;
    private final int total;

    public ComposedMessageInfo(@NotNull String guid, int i11, int i12) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        this.guid = guid;
        this.num = i11;
        this.total = i12;
    }

    public static /* synthetic */ ComposedMessageInfo copy$default(ComposedMessageInfo composedMessageInfo, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = composedMessageInfo.guid;
        }
        if ((i13 & 2) != 0) {
            i11 = composedMessageInfo.num;
        }
        if ((i13 & 4) != 0) {
            i12 = composedMessageInfo.total;
        }
        return composedMessageInfo.copy(str, i11, i12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNum() {
        return this.num;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    @NotNull
    public final ComposedMessageInfo copy(@NotNull String guid, int num, int total) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        return new ComposedMessageInfo(guid, num, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposedMessageInfo)) {
            return false;
        }
        ComposedMessageInfo composedMessageInfo = (ComposedMessageInfo) other;
        return Intrinsics.d(this.guid, composedMessageInfo.guid) && this.num == composedMessageInfo.num && this.total == composedMessageInfo.total;
    }

    @NotNull
    public final String getGuid() {
        return this.guid;
    }

    public final int getNum() {
        return this.num;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Integer.hashCode(this.total) + C2454a.a(this.num, this.guid.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.guid;
        return K00.b.e(this.total, ")", C3660k.c(this.num, "ComposedMessageInfo(guid=", str, ", num=", ", total="));
    }
}
