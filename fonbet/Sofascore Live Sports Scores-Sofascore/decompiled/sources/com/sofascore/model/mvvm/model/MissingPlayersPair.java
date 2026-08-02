package com.sofascore.model.mvvm.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/sofascore/model/mvvm/model/MissingPlayersPair;", "Ljava/io/Serializable;", "first", "Lcom/sofascore/model/mvvm/model/MissingPlayerData;", "second", "<init>", "(Lcom/sofascore/model/mvvm/model/MissingPlayerData;Lcom/sofascore/model/mvvm/model/MissingPlayerData;)V", "getFirst", "()Lcom/sofascore/model/mvvm/model/MissingPlayerData;", "getSecond", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MissingPlayersPair implements Serializable {

    @Nullable
    private final MissingPlayerData first;

    @Nullable
    private final MissingPlayerData second;

    public MissingPlayersPair(@Nullable MissingPlayerData missingPlayerData, @Nullable MissingPlayerData missingPlayerData2) {
        this.first = missingPlayerData;
        this.second = missingPlayerData2;
    }

    public static /* synthetic */ MissingPlayersPair copy$default(MissingPlayersPair missingPlayersPair, MissingPlayerData missingPlayerData, MissingPlayerData missingPlayerData2, int i, Object obj) {
        if ((i & 1) != 0) {
            missingPlayerData = missingPlayersPair.first;
        }
        if ((i & 2) != 0) {
            missingPlayerData2 = missingPlayersPair.second;
        }
        return missingPlayersPair.copy(missingPlayerData, missingPlayerData2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final MissingPlayerData getFirst() {
        return this.first;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final MissingPlayerData getSecond() {
        return this.second;
    }

    @NotNull
    public final MissingPlayersPair copy(@Nullable MissingPlayerData first, @Nullable MissingPlayerData second) {
        return new MissingPlayersPair(first, second);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MissingPlayersPair)) {
            return false;
        }
        MissingPlayersPair missingPlayersPair = (MissingPlayersPair) other;
        return Intrinsics.c(this.first, missingPlayersPair.first) && Intrinsics.c(this.second, missingPlayersPair.second);
    }

    @Nullable
    public final MissingPlayerData getFirst() {
        return this.first;
    }

    @Nullable
    public final MissingPlayerData getSecond() {
        return this.second;
    }

    public int hashCode() {
        MissingPlayerData missingPlayerData = this.first;
        int hashCode = (missingPlayerData == null ? 0 : missingPlayerData.hashCode()) * 31;
        MissingPlayerData missingPlayerData2 = this.second;
        return hashCode + (missingPlayerData2 != null ? missingPlayerData2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MissingPlayersPair(first=" + this.first + ", second=" + this.second + ")";
    }
}
