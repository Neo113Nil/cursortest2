package com.sofascore.model.mvvm.model.chat;

import defpackage.bf3;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sofascore/model/mvvm/model/chat/ChatImageUrls;", "", "", "fullUrl", "thumbnailUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/mvvm/model/chat/ChatImageUrls;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/mvvm/model/chat/ChatImageUrls;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFullUrl", "getThumbnailUrl", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ChatImageUrls {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String fullUrl;

    @NotNull
    private final String thumbnailUrl;

    public /* synthetic */ ChatImageUrls(int i, String str, String str2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, ChatImageUrls$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.fullUrl = str;
        this.thumbnailUrl = str2;
    }

    public static /* synthetic */ ChatImageUrls copy$default(ChatImageUrls chatImageUrls, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatImageUrls.fullUrl;
        }
        if ((i & 2) != 0) {
            str2 = chatImageUrls.thumbnailUrl;
        }
        return chatImageUrls.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(ChatImageUrls self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.fullUrl);
        output.y(serialDesc, 1, self.thumbnailUrl);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFullUrl() {
        return this.fullUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @NotNull
    public final ChatImageUrls copy(@NotNull String fullUrl, @NotNull String thumbnailUrl) {
        fullUrl.getClass();
        thumbnailUrl.getClass();
        return new ChatImageUrls(fullUrl, thumbnailUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatImageUrls)) {
            return false;
        }
        ChatImageUrls chatImageUrls = (ChatImageUrls) other;
        return Intrinsics.c(this.fullUrl, chatImageUrls.fullUrl) && Intrinsics.c(this.thumbnailUrl, chatImageUrls.thumbnailUrl);
    }

    @NotNull
    public final String getFullUrl() {
        return this.fullUrl;
    }

    @NotNull
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return this.thumbnailUrl.hashCode() + (this.fullUrl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return bf3.k("ChatImageUrls(fullUrl=", this.fullUrl, ", thumbnailUrl=", this.thumbnailUrl, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/chat/ChatImageUrls$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/chat/ChatImageUrls;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ChatImageUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ChatImageUrls(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.fullUrl = str;
        this.thumbnailUrl = str2;
    }
}
