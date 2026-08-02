package ru.ozon.android.messenger.blocks.chat.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.uni.atoms.data.button.Icon;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001:\u0001-B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JN\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018¨\u0006."}, d2 = {"Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "", "", "text", "", "Lru/ozon/uni/atoms/data/button/Icon;", "images", "Lorg/joda/time/DateTime;", "date", "Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO$a;", "status", "Lru/ozon/android/messenger/blocks/chat/common/f;", "chatStatus", "<init>", "(Ljava/lang/String;Ljava/util/List;Lorg/joda/time/DateTime;Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO$a;Lru/ozon/android/messenger/blocks/chat/common/f;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lorg/joda/time/DateTime;", "component4", "()Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO$a;", "component5", "()Lru/ozon/android/messenger/blocks/chat/common/f;", "copy", "(Ljava/lang/String;Ljava/util/List;Lorg/joda/time/DateTime;Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO$a;Lru/ozon/android/messenger/blocks/chat/common/f;)Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getImages", "Lorg/joda/time/DateTime;", "getDate", "Lru/ozon/android/messenger/blocks/chat/common/PreviewDTO$a;", "getStatus", "Lru/ozon/android/messenger/blocks/chat/common/f;", "getChatStatus", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PreviewDTO {
    public static final int $stable = 8;
    private final f chatStatus;

    @NotNull
    private final DateTime date;
    private final List<Icon> images;
    private final a status;

    @NotNull
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @com.squareup.moshi.i(name = "Delivered")
        public static final a DELIVERED;

        @com.squareup.moshi.i(name = "NoStatus")
        public static final a NO_STATUS;

        @com.squareup.moshi.i(name = "Read")
        public static final a READ;

        @NotNull
        private final String dtoName;

        static {
            a aVar = new a("NO_STATUS", 0, "NoStatus");
            NO_STATUS = aVar;
            a aVar2 = new a("DELIVERED", 1, "Delivered");
            DELIVERED = aVar2;
            a aVar3 = new a("READ", 2, "Read");
            READ = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a(String str, int i11, String str2) {
            this.dtoName = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public PreviewDTO(@NotNull String text, List<Icon> list, @NotNull DateTime date, a aVar, f fVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(date, "date");
        this.text = text;
        this.images = list;
        this.date = date;
        this.status = aVar;
        this.chatStatus = fVar;
    }

    public static /* synthetic */ PreviewDTO copy$default(PreviewDTO previewDTO, String str, List list, DateTime dateTime, a aVar, f fVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = previewDTO.text;
        }
        if ((i11 & 2) != 0) {
            list = previewDTO.images;
        }
        if ((i11 & 4) != 0) {
            dateTime = previewDTO.date;
        }
        if ((i11 & 8) != 0) {
            aVar = previewDTO.status;
        }
        if ((i11 & 16) != 0) {
            fVar = previewDTO.chatStatus;
        }
        f fVar2 = fVar;
        DateTime dateTime2 = dateTime;
        return previewDTO.copy(str, list, dateTime2, aVar, fVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<Icon> component2() {
        return this.images;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final DateTime getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final a getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final f getChatStatus() {
        return this.chatStatus;
    }

    @NotNull
    public final PreviewDTO copy(@NotNull String text, List<Icon> images, @NotNull DateTime date, a status, f chatStatus) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(date, "date");
        return new PreviewDTO(text, images, date, status, chatStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewDTO)) {
            return false;
        }
        PreviewDTO previewDTO = (PreviewDTO) other;
        return Intrinsics.d(this.text, previewDTO.text) && Intrinsics.d(this.images, previewDTO.images) && Intrinsics.d(this.date, previewDTO.date) && this.status == previewDTO.status && this.chatStatus == previewDTO.chatStatus;
    }

    public final f getChatStatus() {
        return this.chatStatus;
    }

    @NotNull
    public final DateTime getDate() {
        return this.date;
    }

    public final List<Icon> getImages() {
        return this.images;
    }

    public final a getStatus() {
        return this.status;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        List<Icon> list = this.images;
        int a11 = GR.b.a(this.date, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        a aVar = this.status;
        int hashCode2 = (a11 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        f fVar = this.chatStatus;
        return hashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        List<Icon> list = this.images;
        DateTime dateTime = this.date;
        a aVar = this.status;
        f fVar = this.chatStatus;
        StringBuilder f7 = Tl.b.f("PreviewDTO(text=", str, ", images=", ", date=", list);
        f7.append(dateTime);
        f7.append(", status=");
        f7.append(aVar);
        f7.append(", chatStatus=");
        f7.append(fVar);
        f7.append(")");
        return f7.toString();
    }
}
