package ru.ozon.app.android.travel.molecules.dto.asyncAction;

import K1.G;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "", "type", "Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO$AsyncBehaviorType;", "asyncParams", "", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO$AsyncBehaviorType;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getType", "()Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO$AsyncBehaviorType;", "getAsyncParams", "()Ljava/util/Map;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AsyncBehaviorType", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AsyncActionDTO {
    private final AtomActionDTO action;
    private final Map<String, String> asyncParams;

    @NotNull
    private final AsyncBehaviorType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO$AsyncBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "UNDEFINED", "NO_ACTION", "FETCH_STATE", "ACTION_STATE", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncBehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AsyncBehaviorType[] $VALUES;
        public static final AsyncBehaviorType UNDEFINED = new AsyncBehaviorType("UNDEFINED", 0);
        public static final AsyncBehaviorType NO_ACTION = new AsyncBehaviorType("NO_ACTION", 1);
        public static final AsyncBehaviorType FETCH_STATE = new AsyncBehaviorType("FETCH_STATE", 2);
        public static final AsyncBehaviorType ACTION_STATE = new AsyncBehaviorType("ACTION_STATE", 3);

        private static final /* synthetic */ AsyncBehaviorType[] $values() {
            return new AsyncBehaviorType[]{UNDEFINED, NO_ACTION, FETCH_STATE, ACTION_STATE};
        }

        static {
            AsyncBehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AsyncBehaviorType(String str, int i11) {
        }

        public static AsyncBehaviorType valueOf(String str) {
            return (AsyncBehaviorType) Enum.valueOf(AsyncBehaviorType.class, str);
        }

        public static AsyncBehaviorType[] values() {
            return (AsyncBehaviorType[]) $VALUES.clone();
        }
    }

    public AsyncActionDTO(@NotNull AsyncBehaviorType type, Map<String, String> map, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.asyncParams = map;
        this.action = atomActionDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AsyncActionDTO copy$default(AsyncActionDTO asyncActionDTO, AsyncBehaviorType asyncBehaviorType, Map map, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            asyncBehaviorType = asyncActionDTO.type;
        }
        if ((i11 & 2) != 0) {
            map = asyncActionDTO.asyncParams;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = asyncActionDTO.action;
        }
        return asyncActionDTO.copy(asyncBehaviorType, map, atomActionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AsyncBehaviorType getType() {
        return this.type;
    }

    public final Map<String, String> component2() {
        return this.asyncParams;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final AsyncActionDTO copy(@NotNull AsyncBehaviorType type, Map<String, String> asyncParams, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new AsyncActionDTO(type, asyncParams, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncActionDTO)) {
            return false;
        }
        AsyncActionDTO asyncActionDTO = (AsyncActionDTO) other;
        return this.type == asyncActionDTO.type && Intrinsics.d(this.asyncParams, asyncActionDTO.asyncParams) && Intrinsics.d(this.action, asyncActionDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    @NotNull
    public final AsyncBehaviorType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Map<String, String> map = this.asyncParams;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AsyncBehaviorType asyncBehaviorType = this.type;
        Map<String, String> map = this.asyncParams;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder sb2 = new StringBuilder("AsyncActionDTO(type=");
        sb2.append(asyncBehaviorType);
        sb2.append(", asyncParams=");
        sb2.append(map);
        sb2.append(", action=");
        return G.c(sb2, atomActionDTO, ")");
    }
}
