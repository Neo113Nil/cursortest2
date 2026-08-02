package ru.ozon.app.android.storage.entity.bundle;

import Ak.C2436a;
import G.g;
import g.C6594f;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001f\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/storage/entity/bundle/BundleState;", "", "", "id", "", "guid", "", "bundle", "", "blobSize", "screenGuid", "<init>", "(JLjava/lang/String;[BILjava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "J", "getId", "()J", "Ljava/lang/String;", "getGuid", "[B", "getBundle", "()[B", "I", "getBlobSize", "getScreenGuid", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BundleState {
    private final int blobSize;

    @NotNull
    private final byte[] bundle;

    @NotNull
    private final String guid;
    private final long id;

    @NotNull
    private final String screenGuid;

    public BundleState(long j11, @NotNull String guid, @NotNull byte[] bundle, int i11, @NotNull String screenGuid) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(screenGuid, "screenGuid");
        this.id = j11;
        this.guid = guid;
        this.bundle = bundle;
        this.blobSize = i11;
        this.screenGuid = screenGuid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!BundleState.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.storage.entity.bundle.BundleState");
        BundleState bundleState = (BundleState) other;
        return this.id == bundleState.id && Intrinsics.d(this.guid, bundleState.guid) && Arrays.equals(this.bundle, bundleState.bundle) && this.blobSize == bundleState.blobSize && Intrinsics.d(this.screenGuid, bundleState.screenGuid);
    }

    public final int getBlobSize() {
        return this.blobSize;
    }

    @NotNull
    public final byte[] getBundle() {
        return this.bundle;
    }

    @NotNull
    public final String getGuid() {
        return this.guid;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getScreenGuid() {
        return this.screenGuid;
    }

    public int hashCode() {
        return this.screenGuid.hashCode() + ((((Arrays.hashCode(this.bundle) + g.a(Long.hashCode(this.id) * 31, 31, this.guid)) * 31) + this.blobSize) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.guid;
        String arrays = Arrays.toString(this.bundle);
        int i11 = this.blobSize;
        String str2 = this.screenGuid;
        StringBuilder c11 = C2436a.c(j11, "BundleState(id=", ", guid=", str);
        c11.append(", bundle=");
        c11.append(arrays);
        c11.append(", blobSize=");
        c11.append(i11);
        return C6594f.a(", screenGuid=", str2, ")", c11);
    }

    public /* synthetic */ BundleState(long j11, String str, byte[] bArr, int i11, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0L : j11, str, bArr, i11, str2);
    }
}
