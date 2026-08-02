package com.sofascore.model.newNetwork.post;

import com.sofascore.model.mvvm.model.chat.ChatImageUrls;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, d2 = {"Lcom/sofascore/model/newNetwork/post/ImageUploadResponse;", "", "Lcom/sofascore/model/mvvm/model/chat/ChatImageUrls;", "imageUrls", "<init>", "(Lcom/sofascore/model/mvvm/model/chat/ChatImageUrls;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/chat/ChatImageUrls;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/post/ImageUploadResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/chat/ChatImageUrls;", "copy", "(Lcom/sofascore/model/mvvm/model/chat/ChatImageUrls;)Lcom/sofascore/model/newNetwork/post/ImageUploadResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/chat/ChatImageUrls;", "getImageUrls", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ImageUploadResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ChatImageUrls imageUrls;

    public /* synthetic */ ImageUploadResponse(int i, ChatImageUrls chatImageUrls, t5h t5hVar) {
        if (1 == (i & 1)) {
            this.imageUrls = chatImageUrls;
        } else {
            oea.z(i, 1, ImageUploadResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ImageUploadResponse copy$default(ImageUploadResponse imageUploadResponse, ChatImageUrls chatImageUrls, int i, Object obj) {
        if ((i & 1) != 0) {
            chatImageUrls = imageUploadResponse.imageUrls;
        }
        return imageUploadResponse.copy(chatImageUrls);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ChatImageUrls getImageUrls() {
        return this.imageUrls;
    }

    @NotNull
    public final ImageUploadResponse copy(@NotNull ChatImageUrls imageUrls) {
        imageUrls.getClass();
        return new ImageUploadResponse(imageUrls);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageUploadResponse) && Intrinsics.c(this.imageUrls, ((ImageUploadResponse) other).imageUrls);
    }

    @NotNull
    public final ChatImageUrls getImageUrls() {
        return this.imageUrls;
    }

    public int hashCode() {
        return this.imageUrls.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImageUploadResponse(imageUrls=" + this.imageUrls + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/post/ImageUploadResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/post/ImageUploadResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ImageUploadResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ImageUploadResponse(@NotNull ChatImageUrls chatImageUrls) {
        chatImageUrls.getClass();
        this.imageUrls = chatImageUrls;
    }
}
