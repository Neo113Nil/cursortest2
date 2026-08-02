package com.sofascore.model.newNetwork;

import com.sofascore.model.util.ChatInterface;
import defpackage.a0f;
import defpackage.a7a;
import defpackage.duf;
import defpackage.joa;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.wtf;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/RiskyTopic;", "", "", "topic", "", "activity", "topicDomain", "topicDomainId", "Lcom/sofascore/model/util/ChatInterface;", "chatInterfaceModel", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/util/ChatInterface;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/util/ChatInterface;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/RiskyTopic;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/sofascore/model/util/ChatInterface;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Lcom/sofascore/model/util/ChatInterface;)Lcom/sofascore/model/newNetwork/RiskyTopic;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTopic", "I", "getActivity", "getTopicDomain", "Ljava/lang/Integer;", "getTopicDomainId", "Lcom/sofascore/model/util/ChatInterface;", "getChatInterfaceModel", "setChatInterfaceModel", "(Lcom/sofascore/model/util/ChatInterface;)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RiskyTopic {
    private final int activity;

    @Nullable
    private ChatInterface chatInterfaceModel;

    @NotNull
    private final String topic;

    @Nullable
    private final String topicDomain;

    @Nullable
    private final Integer topicDomainId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, ypa.a(ysa.b, new wtf(8))};

    public /* synthetic */ RiskyTopic(int i, String str, int i2, String str2, Integer num, ChatInterface chatInterface, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, RiskyTopic$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.topic = str;
        this.activity = i2;
        this.topicDomain = str2;
        this.topicDomainId = num;
        this.chatInterfaceModel = chatInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        return new a0f(duf.a.getOrCreateKotlinClass(ChatInterface.class), new Annotation[0]);
    }

    public static /* synthetic */ RiskyTopic copy$default(RiskyTopic riskyTopic, String str, int i, String str2, Integer num, ChatInterface chatInterface, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = riskyTopic.topic;
        }
        if ((i2 & 2) != 0) {
            i = riskyTopic.activity;
        }
        if ((i2 & 4) != 0) {
            str2 = riskyTopic.topicDomain;
        }
        if ((i2 & 8) != 0) {
            num = riskyTopic.topicDomainId;
        }
        if ((i2 & 16) != 0) {
            chatInterface = riskyTopic.chatInterfaceModel;
        }
        ChatInterface chatInterface2 = chatInterface;
        String str3 = str2;
        return riskyTopic.copy(str, i, str3, num, chatInterface2);
    }

    public static final /* synthetic */ void write$Self$model_release(RiskyTopic self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.topic);
        output.u(1, self.activity, serialDesc);
        output.h(serialDesc, 2, uhi.a, self.topicDomain);
        output.h(serialDesc, 3, a7a.a, self.topicDomainId);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.chatInterfaceModel);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* renamed from: component2, reason: from getter */
    public final int getActivity() {
        return this.activity;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTopicDomain() {
        return this.topicDomain;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTopicDomainId() {
        return this.topicDomainId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final ChatInterface getChatInterfaceModel() {
        return this.chatInterfaceModel;
    }

    @NotNull
    public final RiskyTopic copy(@NotNull String topic, int activity, @Nullable String topicDomain, @Nullable Integer topicDomainId, @Nullable ChatInterface chatInterfaceModel) {
        topic.getClass();
        return new RiskyTopic(topic, activity, topicDomain, topicDomainId, chatInterfaceModel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiskyTopic)) {
            return false;
        }
        RiskyTopic riskyTopic = (RiskyTopic) other;
        return Intrinsics.c(this.topic, riskyTopic.topic) && this.activity == riskyTopic.activity && Intrinsics.c(this.topicDomain, riskyTopic.topicDomain) && Intrinsics.c(this.topicDomainId, riskyTopic.topicDomainId) && Intrinsics.c(this.chatInterfaceModel, riskyTopic.chatInterfaceModel);
    }

    public final int getActivity() {
        return this.activity;
    }

    @Nullable
    public final ChatInterface getChatInterfaceModel() {
        return this.chatInterfaceModel;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    @Nullable
    public final String getTopicDomain() {
        return this.topicDomain;
    }

    @Nullable
    public final Integer getTopicDomainId() {
        return this.topicDomainId;
    }

    public int hashCode() {
        int a = wv8.a(this.activity, this.topic.hashCode() * 31, 31);
        String str = this.topicDomain;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.topicDomainId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ChatInterface chatInterface = this.chatInterfaceModel;
        return hashCode2 + (chatInterface != null ? chatInterface.hashCode() : 0);
    }

    public final void setChatInterfaceModel(@Nullable ChatInterface chatInterface) {
        this.chatInterfaceModel = chatInterface;
    }

    @NotNull
    public String toString() {
        String str = this.topic;
        int i = this.activity;
        String str2 = this.topicDomain;
        Integer num = this.topicDomainId;
        ChatInterface chatInterface = this.chatInterfaceModel;
        StringBuilder q = mz1.q(i, "RiskyTopic(topic=", str, ", activity=", ", topicDomain=");
        me4.o(num, str2, ", topicDomainId=", ", chatInterfaceModel=", q);
        q.append(chatInterface);
        q.append(")");
        return q.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/RiskyTopic$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/RiskyTopic;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RiskyTopic$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RiskyTopic(@NotNull String str, int i, @Nullable String str2, @Nullable Integer num, @Nullable ChatInterface chatInterface) {
        str.getClass();
        this.topic = str;
        this.activity = i;
        this.topicDomain = str2;
        this.topicDomainId = num;
        this.chatInterfaceModel = chatInterface;
    }
}
