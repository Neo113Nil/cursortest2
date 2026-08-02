package com.sofascore.model.newNetwork;

import com.ironsource.L6;
import com.sofascore.model.chat.ChatImage;
import com.sofascore.model.chat.ChatImage$$serializer;
import defpackage.a7a;
import defpackage.bxe;
import defpackage.joa;
import defpackage.l98;
import defpackage.mz1;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBg\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\"\u0010\u001e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$Jf\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR)\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006:"}, d2 = {"Lcom/sofascore/model/newNetwork/PostChatMessage;", "", "", "text", L6.q, "", "trans", "Lcom/sofascore/model/chat/ChatImage;", "image", "country", "", "parentMessageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/sofascore/model/chat/ChatImage;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/sofascore/model/chat/ChatImage;Ljava/lang/String;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PostChatMessage;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Lcom/sofascore/model/chat/ChatImage;", "component5", "component6", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/sofascore/model/chat/ChatImage;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/PostChatMessage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getLang", "Ljava/util/Map;", "getTrans", "Lcom/sofascore/model/chat/ChatImage;", "getImage", "getCountry", "Ljava/lang/Integer;", "getParentMessageId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PostChatMessage {

    @Nullable
    private final String country;

    @Nullable
    private final ChatImage image;

    @Nullable
    private final String lang;

    @Nullable
    private final Integer parentMessageId;

    @NotNull
    private final String text;

    @Nullable
    private final Map<String, String> trans;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new bxe(18)), null, null, null};

    public /* synthetic */ PostChatMessage(int i, String str, String str2, Map map, ChatImage chatImage, String str3, Integer num, t5h t5hVar) {
        if (1 != (i & 1)) {
            oea.z(i, 1, PostChatMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.text = str;
        if ((i & 2) == 0) {
            this.lang = null;
        } else {
            this.lang = str2;
        }
        if ((i & 4) == 0) {
            this.trans = null;
        } else {
            this.trans = map;
        }
        if ((i & 8) == 0) {
            this.image = null;
        } else {
            this.image = chatImage;
        }
        if ((i & 16) == 0) {
            this.country = null;
        } else {
            this.country = str3;
        }
        if ((i & 32) == 0) {
            this.parentMessageId = null;
        } else {
            this.parentMessageId = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        uhi uhiVar = uhi.a;
        return new q79(l98.W(uhiVar), l98.W(uhiVar), 1);
    }

    public static /* synthetic */ PostChatMessage copy$default(PostChatMessage postChatMessage, String str, String str2, Map map, ChatImage chatImage, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postChatMessage.text;
        }
        if ((i & 2) != 0) {
            str2 = postChatMessage.lang;
        }
        if ((i & 4) != 0) {
            map = postChatMessage.trans;
        }
        if ((i & 8) != 0) {
            chatImage = postChatMessage.image;
        }
        if ((i & 16) != 0) {
            str3 = postChatMessage.country;
        }
        if ((i & 32) != 0) {
            num = postChatMessage.parentMessageId;
        }
        String str4 = str3;
        Integer num2 = num;
        return postChatMessage.copy(str, str2, map, chatImage, str4, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(PostChatMessage self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.text);
        if (output.o(serialDesc) || self.lang != null) {
            output.h(serialDesc, 1, uhi.a, self.lang);
        }
        if (output.o(serialDesc) || self.trans != null) {
            output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.trans);
        }
        if (output.o(serialDesc) || self.image != null) {
            output.h(serialDesc, 3, ChatImage$$serializer.INSTANCE, self.image);
        }
        if (output.o(serialDesc) || self.country != null) {
            output.h(serialDesc, 4, uhi.a, self.country);
        }
        if (!output.o(serialDesc) && self.parentMessageId == null) {
            return;
        }
        output.h(serialDesc, 5, a7a.a, self.parentMessageId);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.trans;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ChatImage getImage() {
        return this.image;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getParentMessageId() {
        return this.parentMessageId;
    }

    @NotNull
    public final PostChatMessage copy(@NotNull String text, @Nullable String lang, @Nullable Map<String, String> trans, @Nullable ChatImage image, @Nullable String country, @Nullable Integer parentMessageId) {
        text.getClass();
        return new PostChatMessage(text, lang, trans, image, country, parentMessageId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostChatMessage)) {
            return false;
        }
        PostChatMessage postChatMessage = (PostChatMessage) other;
        return Intrinsics.c(this.text, postChatMessage.text) && Intrinsics.c(this.lang, postChatMessage.lang) && Intrinsics.c(this.trans, postChatMessage.trans) && Intrinsics.c(this.image, postChatMessage.image) && Intrinsics.c(this.country, postChatMessage.country) && Intrinsics.c(this.parentMessageId, postChatMessage.parentMessageId);
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final ChatImage getImage() {
        return this.image;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final Integer getParentMessageId() {
        return this.parentMessageId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Map<String, String> getTrans() {
        return this.trans;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.lang;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.trans;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        ChatImage chatImage = this.image;
        int hashCode4 = (hashCode3 + (chatImage == null ? 0 : chatImage.hashCode())) * 31;
        String str2 = this.country;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.parentMessageId;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.lang;
        Map<String, String> map = this.trans;
        ChatImage chatImage = this.image;
        String str3 = this.country;
        Integer num = this.parentMessageId;
        StringBuilder s = mz1.s("PostChatMessage(text=", str, ", lang=", str2, ", trans=");
        s.append(map);
        s.append(", image=");
        s.append(chatImage);
        s.append(", country=");
        s.append(str3);
        s.append(", parentMessageId=");
        s.append(num);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PostChatMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PostChatMessage;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PostChatMessage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PostChatMessage(@NotNull String str, @Nullable String str2, @Nullable Map<String, String> map, @Nullable ChatImage chatImage, @Nullable String str3, @Nullable Integer num) {
        str.getClass();
        this.text = str;
        this.lang = str2;
        this.trans = map;
        this.image = chatImage;
        this.country = str3;
        this.parentMessageId = num;
    }

    public /* synthetic */ PostChatMessage(String str, String str2, Map map, ChatImage chatImage, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : chatImage, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num);
    }
}
