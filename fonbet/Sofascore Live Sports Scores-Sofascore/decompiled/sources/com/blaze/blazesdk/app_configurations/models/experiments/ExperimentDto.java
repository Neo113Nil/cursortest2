package com.blaze.blazesdk.app_configurations.models.experiments;

import androidx.annotation.Keep;
import defpackage.dmi;
import defpackage.o6a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/blaze/blazesdk/app_configurations/models/experiments/ExperimentDto;", "", "id", "", "type", "variants", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getType", "getVariants", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExperimentDto {
    public static final int $stable = 8;

    @NotNull
    private final String id;

    @NotNull
    private final String type;

    @NotNull
    private final Map<String, Double> variants;

    public ExperimentDto(@NotNull String str, @NotNull String str2, @NotNull Map<String, Double> map) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.id = str;
        this.type = str2;
        this.variants = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExperimentDto copy$default(ExperimentDto experimentDto, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = experimentDto.id;
        }
        if ((i & 2) != 0) {
            str2 = experimentDto.type;
        }
        if ((i & 4) != 0) {
            map = experimentDto.variants;
        }
        return experimentDto.copy(str, str2, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Map<String, Double> component3() {
        return this.variants;
    }

    @NotNull
    public final ExperimentDto copy(@NotNull String id, @NotNull String type, @NotNull Map<String, Double> variants) {
        id.getClass();
        type.getClass();
        variants.getClass();
        return new ExperimentDto(id, type, variants);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperimentDto)) {
            return false;
        }
        ExperimentDto experimentDto = (ExperimentDto) other;
        return Intrinsics.c(this.id, experimentDto.id) && Intrinsics.c(this.type, experimentDto.type) && Intrinsics.c(this.variants, experimentDto.variants);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Map<String, Double> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return this.variants.hashCode() + o6a.k(this.type, this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ExperimentDto(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", variants=");
        return dmi.s(sb, this.variants, ')');
    }
}
