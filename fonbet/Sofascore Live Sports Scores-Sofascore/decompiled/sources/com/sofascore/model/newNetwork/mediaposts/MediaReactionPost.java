package com.sofascore.model.newNetwork.mediaposts;

import defpackage.bf3;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sofascore/model/newNetwork/mediaposts/MediaReactionPost;", "", "", "prevReactionType", "reactionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/mediaposts/MediaReactionPost;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/mediaposts/MediaReactionPost;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrevReactionType", "getReactionType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MediaReactionPost {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String prevReactionType;

    @Nullable
    private final String reactionType;

    public /* synthetic */ MediaReactionPost(int i, String str, String str2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, MediaReactionPost$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.prevReactionType = str;
        this.reactionType = str2;
    }

    public static /* synthetic */ MediaReactionPost copy$default(MediaReactionPost mediaReactionPost, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaReactionPost.prevReactionType;
        }
        if ((i & 2) != 0) {
            str2 = mediaReactionPost.reactionType;
        }
        return mediaReactionPost.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(MediaReactionPost self, wf3 output, SerialDescriptor serialDesc) {
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 0, uhiVar, self.prevReactionType);
        output.h(serialDesc, 1, uhiVar, self.reactionType);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPrevReactionType() {
        return this.prevReactionType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getReactionType() {
        return this.reactionType;
    }

    @NotNull
    public final MediaReactionPost copy(@Nullable String prevReactionType, @Nullable String reactionType) {
        return new MediaReactionPost(prevReactionType, reactionType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaReactionPost)) {
            return false;
        }
        MediaReactionPost mediaReactionPost = (MediaReactionPost) other;
        return Intrinsics.c(this.prevReactionType, mediaReactionPost.prevReactionType) && Intrinsics.c(this.reactionType, mediaReactionPost.reactionType);
    }

    @Nullable
    public final String getPrevReactionType() {
        return this.prevReactionType;
    }

    @Nullable
    public final String getReactionType() {
        return this.reactionType;
    }

    public int hashCode() {
        String str = this.prevReactionType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reactionType;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return bf3.k("MediaReactionPost(prevReactionType=", this.prevReactionType, ", reactionType=", this.reactionType, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/mediaposts/MediaReactionPost$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/mediaposts/MediaReactionPost;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MediaReactionPost$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MediaReactionPost(@Nullable String str, @Nullable String str2) {
        this.prevReactionType = str;
        this.reactionType = str2;
    }
}
