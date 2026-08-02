package ru.ozon.android.messenger.blocks.chat.common;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO$a;", "type", "<init>", "(ILru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO$a;)V", "component1", "()I", "component2", "()Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO$a;", "copy", "(ILru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO$a;)Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getValue", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO$a;", "getType", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class UnreadCountIndicatorDTO {
    public static final int $stable = 0;

    @NotNull
    private final a type;
    private final int value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @com.squareup.moshi.i(name = "Active")
        public static final a ACTIVE;

        @com.squareup.moshi.i(name = "Invalid")
        public static final a INVALID;

        @com.squareup.moshi.i(name = "Muted")
        public static final a MUTED;

        static {
            a aVar = new a("INVALID", 0);
            INVALID = aVar;
            a aVar2 = new a("ACTIVE", 1);
            ACTIVE = aVar2;
            a aVar3 = new a("MUTED", 2);
            MUTED = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public UnreadCountIndicatorDTO(int i11, @NotNull a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.value = i11;
        this.type = type;
    }

    public static /* synthetic */ UnreadCountIndicatorDTO copy$default(UnreadCountIndicatorDTO unreadCountIndicatorDTO, int i11, a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = unreadCountIndicatorDTO.value;
        }
        if ((i12 & 2) != 0) {
            aVar = unreadCountIndicatorDTO.type;
        }
        return unreadCountIndicatorDTO.copy(i11, aVar);
    }

    /* renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final a getType() {
        return this.type;
    }

    @NotNull
    public final UnreadCountIndicatorDTO copy(int value, @NotNull a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new UnreadCountIndicatorDTO(value, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnreadCountIndicatorDTO)) {
            return false;
        }
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = (UnreadCountIndicatorDTO) other;
        return this.value == unreadCountIndicatorDTO.value && this.type == unreadCountIndicatorDTO.type;
    }

    @NotNull
    public final a getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.type.hashCode() + (Integer.hashCode(this.value) * 31);
    }

    @NotNull
    public String toString() {
        return "UnreadCountIndicatorDTO(value=" + this.value + ", type=" + this.type + ")";
    }
}
