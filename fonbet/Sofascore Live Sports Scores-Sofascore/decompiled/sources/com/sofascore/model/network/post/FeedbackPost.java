package com.sofascore.model.network.post;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4259pg;
import com.ironsource.L6;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u001a¨\u00063"}, d2 = {"Lcom/sofascore/model/network/post/FeedbackPost;", "", "", "uuid", "", "version", NotificationCompat.CATEGORY_EMAIL, L6.F, "phoneModel", "feedback", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/post/FeedbackPost;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/network/post/FeedbackPost;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "I", C4259pg.b, "getEmail", "getOs", "getPhoneModel", "getFeedback", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FeedbackPost {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String email;

    @NotNull
    private final String feedback;

    @NotNull
    private final String os;

    @NotNull
    private final String phoneModel;

    @NotNull
    private final String uuid;
    private final int version;

    public /* synthetic */ FeedbackPost(int i, String str, int i2, String str2, String str3, String str4, String str5, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, FeedbackPost$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.version = i2;
        this.email = str2;
        this.os = str3;
        this.phoneModel = str4;
        this.feedback = str5;
    }

    public static /* synthetic */ FeedbackPost copy$default(FeedbackPost feedbackPost, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedbackPost.uuid;
        }
        if ((i2 & 2) != 0) {
            i = feedbackPost.version;
        }
        if ((i2 & 4) != 0) {
            str2 = feedbackPost.email;
        }
        if ((i2 & 8) != 0) {
            str3 = feedbackPost.os;
        }
        if ((i2 & 16) != 0) {
            str4 = feedbackPost.phoneModel;
        }
        if ((i2 & 32) != 0) {
            str5 = feedbackPost.feedback;
        }
        String str6 = str4;
        String str7 = str5;
        return feedbackPost.copy(str, i, str2, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$model_release(FeedbackPost self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.uuid);
        output.u(1, self.version, serialDesc);
        output.h(serialDesc, 2, uhi.a, self.email);
        output.y(serialDesc, 3, self.os);
        output.y(serialDesc, 4, self.phoneModel);
        output.y(serialDesc, 5, self.feedback);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPhoneModel() {
        return this.phoneModel;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getFeedback() {
        return this.feedback;
    }

    @NotNull
    public final FeedbackPost copy(@NotNull String uuid, int version, @Nullable String email, @NotNull String os, @NotNull String phoneModel, @NotNull String feedback) {
        uuid.getClass();
        os.getClass();
        phoneModel.getClass();
        feedback.getClass();
        return new FeedbackPost(uuid, version, email, os, phoneModel, feedback);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackPost)) {
            return false;
        }
        FeedbackPost feedbackPost = (FeedbackPost) other;
        return Intrinsics.c(this.uuid, feedbackPost.uuid) && this.version == feedbackPost.version && Intrinsics.c(this.email, feedbackPost.email) && Intrinsics.c(this.os, feedbackPost.os) && Intrinsics.c(this.phoneModel, feedbackPost.phoneModel) && Intrinsics.c(this.feedback, feedbackPost.feedback);
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getFeedback() {
        return this.feedback;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getPhoneModel() {
        return this.phoneModel;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int a = wv8.a(this.version, this.uuid.hashCode() * 31, 31);
        String str = this.email;
        return this.feedback.hashCode() + dmi.c(dmi.c((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.os), 31, this.phoneModel);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        int i = this.version;
        String str2 = this.email;
        String str3 = this.os;
        String str4 = this.phoneModel;
        String str5 = this.feedback;
        StringBuilder q = mz1.q(i, "FeedbackPost(uuid=", str, ", version=", ", email=");
        bf3.v(q, str2, ", os=", str3, ", phoneModel=");
        return fc6.o(q, str4, ", feedback=", str5, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/post/FeedbackPost$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/post/FeedbackPost;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FeedbackPost$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FeedbackPost(@NotNull String str, int i, @Nullable String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        w1l.y(str, str3, str4, str5);
        this.uuid = str;
        this.version = i;
        this.email = str2;
        this.os = str3;
        this.phoneModel = str4;
        this.feedback = str5;
    }
}
