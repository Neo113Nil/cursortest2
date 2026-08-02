package ru.ozon.android.messenger.blocks.chat.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.uni.atoms.data.button.Icon;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJT\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b\u000e\u0010\u001c¨\u00061"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/common/PreviewVO;", "", "", "text", "", "Lru/ozon/uni/atoms/data/button/Icon;", "images", "Lorg/joda/time/DateTime;", "date", "Lru/ozon/android/messenger/framework/presentation/models/z;", "status", "Lru/ozon/android/messenger/blocks/chat/common/f;", "chatStatus", "", "isDraft", "<init>", "(Ljava/lang/String;Ljava/util/List;Lorg/joda/time/DateTime;Lru/ozon/android/messenger/framework/presentation/models/z;Lru/ozon/android/messenger/blocks/chat/common/f;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lorg/joda/time/DateTime;", "component4", "()Lru/ozon/android/messenger/framework/presentation/models/z;", "component5", "()Lru/ozon/android/messenger/blocks/chat/common/f;", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/util/List;Lorg/joda/time/DateTime;Lru/ozon/android/messenger/framework/presentation/models/z;Lru/ozon/android/messenger/blocks/chat/common/f;Z)Lru/ozon/android/messenger/blocks/chat/common/PreviewVO;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getImages", "Lorg/joda/time/DateTime;", "getDate", "Lru/ozon/android/messenger/framework/presentation/models/z;", "getStatus", "Lru/ozon/android/messenger/blocks/chat/common/f;", "getChatStatus", "Z", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PreviewVO {
    public static final int $stable = 8;
    private final f chatStatus;

    @NotNull
    private final DateTime date;

    @NotNull
    private final List<Icon> images;
    private final boolean isDraft;

    @NotNull
    private final z status;

    @NotNull
    private final String text;

    public PreviewVO(@NotNull String text, @NotNull List<Icon> images, @NotNull DateTime date, @NotNull z status, f fVar, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(status, "status");
        this.text = text;
        this.images = images;
        this.date = date;
        this.status = status;
        this.chatStatus = fVar;
        this.isDraft = z11;
    }

    public static /* synthetic */ PreviewVO copy$default(PreviewVO previewVO, String str, List list, DateTime dateTime, z zVar, f fVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = previewVO.text;
        }
        if ((i11 & 2) != 0) {
            list = previewVO.images;
        }
        if ((i11 & 4) != 0) {
            dateTime = previewVO.date;
        }
        if ((i11 & 8) != 0) {
            zVar = previewVO.status;
        }
        if ((i11 & 16) != 0) {
            fVar = previewVO.chatStatus;
        }
        if ((i11 & 32) != 0) {
            z11 = previewVO.isDraft;
        }
        f fVar2 = fVar;
        boolean z12 = z11;
        return previewVO.copy(str, list, dateTime, zVar, fVar2, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final List<Icon> component2() {
        return this.images;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DateTime getDate() {
        return this.date;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final z getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final f getChatStatus() {
        return this.chatStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsDraft() {
        return this.isDraft;
    }

    @NotNull
    public final PreviewVO copy(@NotNull String text, @NotNull List<Icon> images, @NotNull DateTime date, @NotNull z status, f chatStatus, boolean isDraft) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(status, "status");
        return new PreviewVO(text, images, date, status, chatStatus, isDraft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewVO)) {
            return false;
        }
        PreviewVO previewVO = (PreviewVO) other;
        return Intrinsics.d(this.text, previewVO.text) && Intrinsics.d(this.images, previewVO.images) && Intrinsics.d(this.date, previewVO.date) && Intrinsics.d(this.status, previewVO.status) && this.chatStatus == previewVO.chatStatus && this.isDraft == previewVO.isDraft;
    }

    public final f getChatStatus() {
        return this.chatStatus;
    }

    @NotNull
    public final DateTime getDate() {
        return this.date;
    }

    @NotNull
    public final List<Icon> getImages() {
        return this.images;
    }

    @NotNull
    public final z getStatus() {
        return this.status;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + GR.b.a(this.date, G.g.b(this.text.hashCode() * 31, 31, this.images), 31)) * 31;
        f fVar = this.chatStatus;
        return Boolean.hashCode(this.isDraft) + ((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31);
    }

    public final boolean isDraft() {
        return this.isDraft;
    }

    @NotNull
    public String toString() {
        String str = this.text;
        List<Icon> list = this.images;
        DateTime dateTime = this.date;
        z zVar = this.status;
        f fVar = this.chatStatus;
        boolean z11 = this.isDraft;
        StringBuilder f7 = Tl.b.f("PreviewVO(text=", str, ", images=", ", date=", list);
        f7.append(dateTime);
        f7.append(", status=");
        f7.append(zVar);
        f7.append(", chatStatus=");
        f7.append(fVar);
        f7.append(", isDraft=");
        f7.append(z11);
        f7.append(")");
        return f7.toString();
    }
}
