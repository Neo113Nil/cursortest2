package Z5;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ChunkMetadata f14653a;

    @NotNull
    private final byte[] data;

    public b(ChunkMetadata metadata, byte[] data) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f14653a = metadata;
        this.data = data;
    }

    public final byte[] a() {
        return this.data;
    }

    public final ChunkMetadata b() {
        return this.f14653a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.coralogix.android.sdk.session_replay.internal.networking.ChunkUploadRequest");
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f14653a, bVar.f14653a) && Arrays.equals(this.data, bVar.data);
    }

    public int hashCode() {
        return (this.f14653a.hashCode() * 31) + Arrays.hashCode(this.data);
    }

    public String toString() {
        return "ChunkUploadRequest(metadata=" + this.f14653a + ", data=" + Arrays.toString(this.data) + ")";
    }
}
