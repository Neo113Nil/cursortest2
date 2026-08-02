package ru.ozon.android.messenger.blocks.ratemessenger.sucessstate;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.c;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/RateMessengerSuccessModalDto;", "", "Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/Data;", "data", "", "error", "<init>", "(Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/Data;Ljava/lang/String;)V", "Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/c;", "map", "()Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/c;", "component1", "()Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/Data;", "component2", "()Ljava/lang/String;", "copy", "(Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/Data;Ljava/lang/String;)Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/RateMessengerSuccessModalDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/messenger/blocks/ratemessenger/sucessstate/Data;", "getData", "Ljava/lang/String;", "getError", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RateMessengerSuccessModalDto {
    public static final int $stable = 8;

    @NotNull
    private final Data data;
    private final String error;

    public RateMessengerSuccessModalDto(@NotNull Data data, String str) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.error = str;
    }

    public static /* synthetic */ RateMessengerSuccessModalDto copy$default(RateMessengerSuccessModalDto rateMessengerSuccessModalDto, Data data, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            data = rateMessengerSuccessModalDto.data;
        }
        if ((i11 & 2) != 0) {
            str = rateMessengerSuccessModalDto.error;
        }
        return rateMessengerSuccessModalDto.copy(data, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final RateMessengerSuccessModalDto copy(@NotNull Data data, String error) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new RateMessengerSuccessModalDto(data, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateMessengerSuccessModalDto)) {
            return false;
        }
        RateMessengerSuccessModalDto rateMessengerSuccessModalDto = (RateMessengerSuccessModalDto) other;
        return Intrinsics.d(this.data, rateMessengerSuccessModalDto.data) && Intrinsics.d(this.error, rateMessengerSuccessModalDto.error);
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    public final String getError() {
        return this.error;
    }

    public int hashCode() {
        int hashCode = this.data.hashCode() * 31;
        String str = this.error;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final c map() {
        String str = this.error;
        if (str != null && str.length() != 0) {
            return new c.a(this.error);
        }
        SuccessState successState = this.data.getSuccessState();
        return new c.b(successState.getTitle(), successState.getDescription(), successState.getImageUrl(), successState.getButton(), successState.getTrackingInfo());
    }

    @NotNull
    public String toString() {
        return "RateMessengerSuccessModalDto(data=" + this.data + ", error=" + this.error + ")";
    }
}
