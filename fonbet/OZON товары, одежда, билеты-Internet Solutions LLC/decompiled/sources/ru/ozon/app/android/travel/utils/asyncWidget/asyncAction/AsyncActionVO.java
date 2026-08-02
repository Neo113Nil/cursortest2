package ru.ozon.app.android.travel.utils.asyncWidget.asyncAction;

import Xc.a;
import Xc.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO$AsyncBehaviorType;", "type", "", "asyncData", "", "asyncParams", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO$AsyncBehaviorType;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "copy", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO$AsyncBehaviorType;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO$AsyncBehaviorType;", "getType", "()Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO$AsyncBehaviorType;", "Ljava/lang/String;", "getAsyncData", "Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "AsyncBehaviorType", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AsyncActionVO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final String asyncData;
    private final Map<String, String> asyncParams;

    @NotNull
    private final AsyncBehaviorType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO$AsyncBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "UNDEFINED", "NO_ACTION", "FETCH_STATE", "ACTION_STATE", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public AsyncActionVO(@NotNull AsyncBehaviorType type, String str, Map<String, String> map, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.asyncData = str;
        this.asyncParams = map;
        this.action = atomActionDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AsyncActionVO copy$default(AsyncActionVO asyncActionVO, AsyncBehaviorType asyncBehaviorType, String str, Map map, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            asyncBehaviorType = asyncActionVO.type;
        }
        if ((i11 & 2) != 0) {
            str = asyncActionVO.asyncData;
        }
        if ((i11 & 4) != 0) {
            map = asyncActionVO.asyncParams;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = asyncActionVO.action;
        }
        return asyncActionVO.copy(asyncBehaviorType, str, map, atomActionDTO);
    }

    @NotNull
    public final AsyncActionVO copy(@NotNull AsyncBehaviorType type, String asyncData, Map<String, String> asyncParams, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new AsyncActionVO(type, asyncData, asyncParams, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncActionVO)) {
            return false;
        }
        AsyncActionVO asyncActionVO = (AsyncActionVO) other;
        return this.type == asyncActionVO.type && Intrinsics.d(this.asyncData, asyncActionVO.asyncData) && Intrinsics.d(this.asyncParams, asyncActionVO.asyncParams) && Intrinsics.d(this.action, asyncActionVO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getAsyncData() {
        return this.asyncData;
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
        String str = this.asyncData;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.asyncParams;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode3 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AsyncActionVO(type=" + this.type + ", asyncData=" + this.asyncData + ", asyncParams=" + this.asyncParams + ", action=" + this.action + ")";
    }
}
