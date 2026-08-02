package com.sofascore.model.newNetwork.mediaposts;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.h75;
import defpackage.joa;
import defpackage.km5;
import defpackage.ljg;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t2e;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BI\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b*\u0010+Jb\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010!J\u001a\u00103\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010%R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010)R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010C\u0012\u0004\bE\u0010@\u001a\u0004\bD\u0010+¨\u0006H"}, d2 = {"Lcom/sofascore/model/newNetwork/mediaposts/PersonalizedMediaPost;", "", "", "eventId", "id", "Lcom/sofascore/model/newNetwork/mediaposts/MediaType;", "type", "", "createdAtTimestamp", "", "postIds", "", "finalScore", "", "pinnedPost", "<init>", "(Ljava/lang/Integer;ILcom/sofascore/model/newNetwork/mediaposts/MediaType;JLjava/util/List;Ljava/lang/Double;Z)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;ILcom/sofascore/model/newNetwork/mediaposts/MediaType;JLjava/lang/Double;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/mediaposts/PersonalizedMediaPost;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()I", "component3", "()Lcom/sofascore/model/newNetwork/mediaposts/MediaType;", "component4", "()J", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/Double;", "component7", "()Z", "copy", "(Ljava/lang/Integer;ILcom/sofascore/model/newNetwork/mediaposts/MediaType;JLjava/util/List;Ljava/lang/Double;Z)Lcom/sofascore/model/newNetwork/mediaposts/PersonalizedMediaPost;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getEventId", "I", "getId", "Lcom/sofascore/model/newNetwork/mediaposts/MediaType;", "getType", "J", "getCreatedAtTimestamp", "Ljava/util/List;", "getPostIds", "getPostIds$annotations", "()V", "Ljava/lang/Double;", "getFinalScore", "Z", "getPinnedPost", "getPinnedPost$annotations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PersonalizedMediaPost {
    private final long createdAtTimestamp;

    @Nullable
    private final Integer eventId;

    @Nullable
    private final Double finalScore;
    private final int id;
    private final boolean pinnedPost;

    @NotNull
    private final List<PersonalizedMediaPost> postIds;

    @Nullable
    private final MediaType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new t2e(13)), null, null};

    public PersonalizedMediaPost(int i, Integer num, int i2, MediaType mediaType, long j, Double d, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, PersonalizedMediaPost$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.eventId = num;
        this.id = i2;
        this.type = mediaType;
        this.createdAtTimestamp = j;
        this.postIds = km5.a;
        if ((i & 16) == 0) {
            this.finalScore = null;
        } else {
            this.finalScore = d;
        }
        this.pinnedPost = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MediaType.INSTANCE.serializer();
    }

    public static /* synthetic */ PersonalizedMediaPost copy$default(PersonalizedMediaPost personalizedMediaPost, Integer num, int i, MediaType mediaType, long j, List list, Double d, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = personalizedMediaPost.eventId;
        }
        if ((i2 & 2) != 0) {
            i = personalizedMediaPost.id;
        }
        if ((i2 & 4) != 0) {
            mediaType = personalizedMediaPost.type;
        }
        if ((i2 & 8) != 0) {
            j = personalizedMediaPost.createdAtTimestamp;
        }
        if ((i2 & 16) != 0) {
            list = personalizedMediaPost.postIds;
        }
        if ((i2 & 32) != 0) {
            d = personalizedMediaPost.finalScore;
        }
        if ((i2 & 64) != 0) {
            z = personalizedMediaPost.pinnedPost;
        }
        boolean z2 = z;
        List list2 = list;
        long j2 = j;
        MediaType mediaType2 = mediaType;
        return personalizedMediaPost.copy(num, i, mediaType2, j2, list2, d, z2);
    }

    public static final /* synthetic */ void write$Self$model_release(PersonalizedMediaPost self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, a7a.a, self.eventId);
        output.u(1, self.id, serialDesc);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.type);
        output.E(serialDesc, 3, self.createdAtTimestamp);
        if (!output.o(serialDesc) && self.finalScore == null) {
            return;
        }
        output.h(serialDesc, 4, h75.a, self.finalScore);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final MediaType getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @NotNull
    public final List<PersonalizedMediaPost> component5() {
        return this.postIds;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getFinalScore() {
        return this.finalScore;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getPinnedPost() {
        return this.pinnedPost;
    }

    @NotNull
    public final PersonalizedMediaPost copy(@Nullable Integer eventId, int id, @Nullable MediaType type, long createdAtTimestamp, @NotNull List<PersonalizedMediaPost> postIds, @Nullable Double finalScore, boolean pinnedPost) {
        postIds.getClass();
        return new PersonalizedMediaPost(eventId, id, type, createdAtTimestamp, postIds, finalScore, pinnedPost);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalizedMediaPost)) {
            return false;
        }
        PersonalizedMediaPost personalizedMediaPost = (PersonalizedMediaPost) other;
        return Intrinsics.c(this.eventId, personalizedMediaPost.eventId) && this.id == personalizedMediaPost.id && this.type == personalizedMediaPost.type && this.createdAtTimestamp == personalizedMediaPost.createdAtTimestamp && Intrinsics.c(this.postIds, personalizedMediaPost.postIds) && Intrinsics.c(this.finalScore, personalizedMediaPost.finalScore) && this.pinnedPost == personalizedMediaPost.pinnedPost;
    }

    public final long getCreatedAtTimestamp() {
        return this.createdAtTimestamp;
    }

    @Nullable
    public final Integer getEventId() {
        return this.eventId;
    }

    @Nullable
    public final Double getFinalScore() {
        return this.finalScore;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getPinnedPost() {
        return this.pinnedPost;
    }

    @NotNull
    public final List<PersonalizedMediaPost> getPostIds() {
        return this.postIds;
    }

    @Nullable
    public final MediaType getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.eventId;
        int a = wv8.a(this.id, (num == null ? 0 : num.hashCode()) * 31, 31);
        MediaType mediaType = this.type;
        int d = dmi.d(ljg.c((a + (mediaType == null ? 0 : mediaType.hashCode())) * 31, 31, this.createdAtTimestamp), 31, this.postIds);
        Double d2 = this.finalScore;
        return Boolean.hashCode(this.pinnedPost) + ((d + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "PersonalizedMediaPost(eventId=" + this.eventId + ", id=" + this.id + ", type=" + this.type + ", createdAtTimestamp=" + this.createdAtTimestamp + ", postIds=" + this.postIds + ", finalScore=" + this.finalScore + ", pinnedPost=" + this.pinnedPost + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/mediaposts/PersonalizedMediaPost$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/mediaposts/PersonalizedMediaPost;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PersonalizedMediaPost$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getPinnedPost$annotations() {
    }

    public static /* synthetic */ void getPostIds$annotations() {
    }

    public PersonalizedMediaPost(@Nullable Integer num, int i, @Nullable MediaType mediaType, long j, @NotNull List<PersonalizedMediaPost> list, @Nullable Double d, boolean z) {
        list.getClass();
        this.eventId = num;
        this.id = i;
        this.type = mediaType;
        this.createdAtTimestamp = j;
        this.postIds = list;
        this.finalScore = d;
        this.pinnedPost = z;
    }

    public PersonalizedMediaPost(Integer num, int i, MediaType mediaType, long j, List list, Double d, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, i, mediaType, j, (List<PersonalizedMediaPost>) ((i2 & 16) != 0 ? km5.a : list), (i2 & 32) != 0 ? null : d, (i2 & 64) != 0 ? false : z);
    }
}
