package ru.ozon.app.android.storage.entity.bundle;

import Ql.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storage/entity/bundle/ShortInfoAboutBundleState;", "", "", "id", "", "blobSize", "<init>", "(JI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getBlobSize", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShortInfoAboutBundleState {
    private final int blobSize;
    private final long id;

    public ShortInfoAboutBundleState(long j11, int i11) {
        this.id = j11;
        this.blobSize = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortInfoAboutBundleState)) {
            return false;
        }
        ShortInfoAboutBundleState shortInfoAboutBundleState = (ShortInfoAboutBundleState) other;
        return this.id == shortInfoAboutBundleState.id && this.blobSize == shortInfoAboutBundleState.blobSize;
    }

    public final int getBlobSize() {
        return this.blobSize;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return Integer.hashCode(this.blobSize) + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = c.b(this.id, "ShortInfoAboutBundleState(id=", this.blobSize, ", blobSize=");
        b11.append(")");
        return b11.toString();
    }
}
