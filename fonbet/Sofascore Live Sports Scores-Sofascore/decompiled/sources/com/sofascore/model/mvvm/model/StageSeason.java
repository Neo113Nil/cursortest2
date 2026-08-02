package com.sofascore.model.mvvm.model;

import com.sofascore.model.network.response.SearchResponseKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eB-\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010&J`\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010 J\u0010\u0010+\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b+\u0010$J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b=\u0010&¨\u0006@"}, d2 = {"Lcom/sofascore/model/mvvm/model/StageSeason;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/UniqueStage;", SearchResponseKt.UNIQUE_STAGE_ENTITY, "", "description", "slug", "year", "", "id", "", "startDateTimestamp", "endDateTimestamp", "<init>", "(Lcom/sofascore/model/mvvm/model/UniqueStage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/Long;)V", "(Lcom/sofascore/model/mvvm/model/UniqueStage;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/UniqueStage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/StageSeason;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/UniqueStage;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()I", "component6", "()Ljava/lang/Long;", "component7", "copy", "(Lcom/sofascore/model/mvvm/model/UniqueStage;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/Long;)Lcom/sofascore/model/mvvm/model/StageSeason;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/UniqueStage;", "getUniqueStage", "setUniqueStage", "(Lcom/sofascore/model/mvvm/model/UniqueStage;)V", "Ljava/lang/String;", "getDescription", "getSlug", "getYear", "I", "getId", "Ljava/lang/Long;", "getStartDateTimestamp", "getEndDateTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StageSeason implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String description;

    @Nullable
    private final Long endDateTimestamp;
    private final int id;

    @Nullable
    private final String slug;

    @Nullable
    private final Long startDateTimestamp;

    @Nullable
    private UniqueStage uniqueStage;

    @Nullable
    private final String year;

    public /* synthetic */ StageSeason(int i, UniqueStage uniqueStage, String str, String str2, String str3, int i2, Long l, Long l2, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, StageSeason$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uniqueStage = uniqueStage;
        this.description = str;
        this.slug = str2;
        this.year = str3;
        this.id = i2;
        this.startDateTimestamp = l;
        this.endDateTimestamp = l2;
    }

    public static /* synthetic */ StageSeason copy$default(StageSeason stageSeason, UniqueStage uniqueStage, String str, String str2, String str3, int i, Long l, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uniqueStage = stageSeason.uniqueStage;
        }
        if ((i2 & 2) != 0) {
            str = stageSeason.description;
        }
        if ((i2 & 4) != 0) {
            str2 = stageSeason.slug;
        }
        if ((i2 & 8) != 0) {
            str3 = stageSeason.year;
        }
        if ((i2 & 16) != 0) {
            i = stageSeason.id;
        }
        if ((i2 & 32) != 0) {
            l = stageSeason.startDateTimestamp;
        }
        if ((i2 & 64) != 0) {
            l2 = stageSeason.endDateTimestamp;
        }
        Long l3 = l;
        Long l4 = l2;
        int i3 = i;
        String str4 = str2;
        return stageSeason.copy(uniqueStage, str, str4, str3, i3, l3, l4);
    }

    public static final /* synthetic */ void write$Self$model_release(StageSeason self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, UniqueStage$$serializer.INSTANCE, self.uniqueStage);
        output.y(serialDesc, 1, self.description);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 2, uhiVar, self.slug);
        output.h(serialDesc, 3, uhiVar, self.year);
        output.u(4, self.id, serialDesc);
        lkb lkbVar = lkb.a;
        output.h(serialDesc, 5, lkbVar, self.startDateTimestamp);
        output.h(serialDesc, 6, lkbVar, self.endDateTimestamp);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final UniqueStage getUniqueStage() {
        return this.uniqueStage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    /* renamed from: component5, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Long getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    @NotNull
    public final StageSeason copy(@Nullable UniqueStage uniqueStage, @NotNull String description, @Nullable String slug, @Nullable String year, int id, @Nullable Long startDateTimestamp, @Nullable Long endDateTimestamp) {
        description.getClass();
        return new StageSeason(uniqueStage, description, slug, year, id, startDateTimestamp, endDateTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageSeason)) {
            return false;
        }
        StageSeason stageSeason = (StageSeason) other;
        return Intrinsics.c(this.uniqueStage, stageSeason.uniqueStage) && Intrinsics.c(this.description, stageSeason.description) && Intrinsics.c(this.slug, stageSeason.slug) && Intrinsics.c(this.year, stageSeason.year) && this.id == stageSeason.id && Intrinsics.c(this.startDateTimestamp, stageSeason.startDateTimestamp) && Intrinsics.c(this.endDateTimestamp, stageSeason.endDateTimestamp);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Long getEndDateTimestamp() {
        return this.endDateTimestamp;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getSlug() {
        return this.slug;
    }

    @Nullable
    public final Long getStartDateTimestamp() {
        return this.startDateTimestamp;
    }

    @Nullable
    public final UniqueStage getUniqueStage() {
        return this.uniqueStage;
    }

    @Nullable
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        UniqueStage uniqueStage = this.uniqueStage;
        int c = dmi.c((uniqueStage == null ? 0 : uniqueStage.hashCode()) * 31, 31, this.description);
        String str = this.slug;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.year;
        int a = wv8.a(this.id, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Long l = this.startDateTimestamp;
        int hashCode2 = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endDateTimestamp;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final void setUniqueStage(@Nullable UniqueStage uniqueStage) {
        this.uniqueStage = uniqueStage;
    }

    @NotNull
    public String toString() {
        UniqueStage uniqueStage = this.uniqueStage;
        String str = this.description;
        String str2 = this.slug;
        String str3 = this.year;
        int i = this.id;
        Long l = this.startDateTimestamp;
        Long l2 = this.endDateTimestamp;
        StringBuilder sb = new StringBuilder("StageSeason(uniqueStage=");
        sb.append(uniqueStage);
        sb.append(", description=");
        sb.append(str);
        sb.append(", slug=");
        bf3.v(sb, str2, ", year=", str3, ", id=");
        sb.append(i);
        sb.append(", startDateTimestamp=");
        sb.append(l);
        sb.append(", endDateTimestamp=");
        sb.append(l2);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/StageSeason$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/StageSeason;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageSeason$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageSeason(@Nullable UniqueStage uniqueStage, @NotNull String str, @Nullable String str2, @Nullable String str3, int i, @Nullable Long l, @Nullable Long l2) {
        str.getClass();
        this.uniqueStage = uniqueStage;
        this.description = str;
        this.slug = str2;
        this.year = str3;
        this.id = i;
        this.startDateTimestamp = l;
        this.endDateTimestamp = l2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StageSeason(@Nullable UniqueStage uniqueStage, @NotNull String str, @Nullable String str2, int i) {
        this(uniqueStage, str, "", str2, i, null, null);
        str.getClass();
    }
}
