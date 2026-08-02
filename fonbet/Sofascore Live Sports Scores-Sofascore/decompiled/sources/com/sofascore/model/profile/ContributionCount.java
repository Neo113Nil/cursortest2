package com.sofascore.model.profile;

import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006)"}, d2 = {"Lcom/sofascore/model/profile/ContributionCount;", "", "Lcom/sofascore/model/profile/ContributionType;", "eventSuggestType", "", "count", "<init>", "(Lcom/sofascore/model/profile/ContributionType;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/profile/ContributionType;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/ContributionCount;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/profile/ContributionType;", "component2", "()I", "copy", "(Lcom/sofascore/model/profile/ContributionType;I)Lcom/sofascore/model/profile/ContributionCount;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/profile/ContributionType;", "getEventSuggestType", "I", "getCount", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContributionCount {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int count;

    @Nullable
    private final ContributionType eventSuggestType;

    public /* synthetic */ ContributionCount(int i, ContributionType contributionType, int i2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, ContributionCount$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventSuggestType = contributionType;
        this.count = i2;
    }

    public static /* synthetic */ ContributionCount copy$default(ContributionCount contributionCount, ContributionType contributionType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            contributionType = contributionCount.eventSuggestType;
        }
        if ((i2 & 2) != 0) {
            i = contributionCount.count;
        }
        return contributionCount.copy(contributionType, i);
    }

    public static final /* synthetic */ void write$Self$model_release(ContributionCount self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, ContributionTypeSerializer.INSTANCE, self.eventSuggestType);
        output.u(1, self.count, serialDesc);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ContributionType getEventSuggestType() {
        return this.eventSuggestType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final ContributionCount copy(@Nullable ContributionType eventSuggestType, int count) {
        return new ContributionCount(eventSuggestType, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributionCount)) {
            return false;
        }
        ContributionCount contributionCount = (ContributionCount) other;
        return this.eventSuggestType == contributionCount.eventSuggestType && this.count == contributionCount.count;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final ContributionType getEventSuggestType() {
        return this.eventSuggestType;
    }

    public int hashCode() {
        ContributionType contributionType = this.eventSuggestType;
        return Integer.hashCode(this.count) + ((contributionType == null ? 0 : contributionType.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "ContributionCount(eventSuggestType=" + this.eventSuggestType + ", count=" + this.count + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/ContributionCount$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/ContributionCount;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ContributionCount$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ContributionCount(@Nullable ContributionType contributionType, int i) {
        this.eventSuggestType = contributionType;
        this.count = i;
    }
}
