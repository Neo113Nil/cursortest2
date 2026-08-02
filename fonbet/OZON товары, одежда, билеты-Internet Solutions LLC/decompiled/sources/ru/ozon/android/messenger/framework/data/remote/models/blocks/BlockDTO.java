package ru.ozon.android.messenger.framework.data.remote.models.blocks;

import E0.C2942q;
import Pk0.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.parser.DataString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "version", "", "vertical", "state", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVersion", "()J", "getVertical", "getState", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BlockDTO {
    public static final int $stable = 0;

    @NotNull
    private final String name;

    @NotNull
    private final String state;
    private final long version;
    private final String vertical;

    public BlockDTO(@NotNull String name, long j11, String str, @DataString @NotNull String state) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        this.name = name;
        this.version = j11;
        this.vertical = str;
        this.state = state;
    }

    public static /* synthetic */ BlockDTO copy$default(BlockDTO blockDTO, String str, long j11, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = blockDTO.name;
        }
        if ((i11 & 2) != 0) {
            j11 = blockDTO.version;
        }
        if ((i11 & 4) != 0) {
            str2 = blockDTO.vertical;
        }
        if ((i11 & 8) != 0) {
            str3 = blockDTO.state;
        }
        return blockDTO.copy(str, j11, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVertical() {
        return this.vertical;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    public final BlockDTO copy(@NotNull String name, long version, String vertical, @DataString @NotNull String state) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        return new BlockDTO(name, version, vertical, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockDTO)) {
            return false;
        }
        BlockDTO blockDTO = (BlockDTO) other;
        return Intrinsics.d(this.name, blockDTO.name) && this.version == blockDTO.version && Intrinsics.d(this.vertical, blockDTO.vertical) && Intrinsics.d(this.state, blockDTO.state);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final long getVersion() {
        return this.version;
    }

    public final String getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        int a11 = c.a(this.name.hashCode() * 31, 31, this.version);
        String str = this.vertical;
        return this.state.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        long j11 = this.version;
        String str2 = this.vertical;
        String str3 = this.state;
        StringBuilder d11 = C2942q.d(j11, "BlockDTO(name=", str, ", version=");
        Nh.a.h(d11, ", vertical=", str2, ", state=", str3);
        d11.append(")");
        return d11.toString();
    }
}
