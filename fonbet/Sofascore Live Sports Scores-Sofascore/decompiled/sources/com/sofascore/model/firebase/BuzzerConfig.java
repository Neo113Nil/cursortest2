package com.sofascore.model.firebase;

import defpackage.lnb;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/sofascore/model/firebase/BuzzerConfig;", "Ljava/io/Serializable;", "tileOrderConfig", "", "<init>", "(Ljava/lang/String;)V", "getTileOrderConfig", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BuzzerConfig implements Serializable {

    @NotNull
    private final String tileOrderConfig;

    public BuzzerConfig(@NotNull String str) {
        str.getClass();
        this.tileOrderConfig = str;
    }

    public static /* synthetic */ BuzzerConfig copy$default(BuzzerConfig buzzerConfig, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buzzerConfig.tileOrderConfig;
        }
        return buzzerConfig.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTileOrderConfig() {
        return this.tileOrderConfig;
    }

    @NotNull
    public final BuzzerConfig copy(@NotNull String tileOrderConfig) {
        tileOrderConfig.getClass();
        return new BuzzerConfig(tileOrderConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BuzzerConfig) && Intrinsics.c(this.tileOrderConfig, ((BuzzerConfig) other).tileOrderConfig);
    }

    @NotNull
    public final String getTileOrderConfig() {
        return this.tileOrderConfig;
    }

    public int hashCode() {
        return this.tileOrderConfig.hashCode();
    }

    @NotNull
    public String toString() {
        return lnb.o("BuzzerConfig(tileOrderConfig=", this.tileOrderConfig, ")");
    }
}
