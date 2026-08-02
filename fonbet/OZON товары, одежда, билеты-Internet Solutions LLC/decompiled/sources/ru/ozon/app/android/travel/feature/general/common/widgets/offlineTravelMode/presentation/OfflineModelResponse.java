package ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.presentation;

import B0.C2454a;
import G.g;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\"#B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse;", "", "widgetsHash", "", "cacheLifetime", "", "widgets", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$OfflineModelWidget;", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$State;", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$State;)V", "getWidgetsHash", "()Ljava/lang/String;", "getCacheLifetime", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getWidgets", "()Ljava/util/List;", "getState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$State;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$State;)Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse;", "equals", "", "other", "hashCode", "", "toString", "OfflineModelWidget", "State", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfflineModelResponse {
    public static final int $stable = 8;
    private final Double cacheLifetime;

    @EnumNullFallback
    @NotNull
    private final State state;
    private final List<OfflineModelWidget> widgets;
    private final String widgetsHash;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$OfflineModelWidget;", "", "vertical", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "version", "", "stateJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getVertical", "()Ljava/lang/String;", "getName", "getVersion", "()I", "getStateJson", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OfflineModelWidget {
        public static final int $stable = 0;

        @NotNull
        private final String name;

        @NotNull
        private final String stateJson;
        private final int version;

        @NotNull
        private final String vertical;

        public OfflineModelWidget(@NotNull String vertical, @NotNull String name, int i11, @NotNull String stateJson) {
            Intrinsics.checkNotNullParameter(vertical, "vertical");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(stateJson, "stateJson");
            this.vertical = vertical;
            this.name = name;
            this.version = i11;
            this.stateJson = stateJson;
        }

        public static /* synthetic */ OfflineModelWidget copy$default(OfflineModelWidget offlineModelWidget, String str, String str2, int i11, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = offlineModelWidget.vertical;
            }
            if ((i12 & 2) != 0) {
                str2 = offlineModelWidget.name;
            }
            if ((i12 & 4) != 0) {
                i11 = offlineModelWidget.version;
            }
            if ((i12 & 8) != 0) {
                str3 = offlineModelWidget.stateJson;
            }
            return offlineModelWidget.copy(str, str2, i11, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getVertical() {
            return this.vertical;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getStateJson() {
            return this.stateJson;
        }

        @NotNull
        public final OfflineModelWidget copy(@NotNull String vertical, @NotNull String name, int version, @NotNull String stateJson) {
            Intrinsics.checkNotNullParameter(vertical, "vertical");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(stateJson, "stateJson");
            return new OfflineModelWidget(vertical, name, version, stateJson);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfflineModelWidget)) {
                return false;
            }
            OfflineModelWidget offlineModelWidget = (OfflineModelWidget) other;
            return Intrinsics.d(this.vertical, offlineModelWidget.vertical) && Intrinsics.d(this.name, offlineModelWidget.name) && this.version == offlineModelWidget.version && Intrinsics.d(this.stateJson, offlineModelWidget.stateJson);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getStateJson() {
            return this.stateJson;
        }

        public final int getVersion() {
            return this.version;
        }

        @NotNull
        public final String getVertical() {
            return this.vertical;
        }

        public int hashCode() {
            return this.stateJson.hashCode() + C2454a.a(this.version, g.a(this.vertical.hashCode() * 31, 31, this.name), 31);
        }

        @NotNull
        public String toString() {
            String str = this.vertical;
            String str2 = this.name;
            int i11 = this.version;
            String str3 = this.stateJson;
            StringBuilder d11 = C3660k.d("OfflineModelWidget(vertical=", str, ", name=", str2, ", version=");
            d11.append(i11);
            d11.append(", stateJson=");
            d11.append(str3);
            d11.append(")");
            return d11.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/offlineTravelMode/presentation/OfflineModelResponse$State;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_NEW", "STATE_NOT_CHANGED", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @i(name = "STATE_NEW")
        public static final State STATE_NEW = new State("STATE_NEW", 0);

        @i(name = "STATE_NOT_CHANGED")
        public static final State STATE_NOT_CHANGED = new State("STATE_NOT_CHANGED", 1);

        private static final /* synthetic */ State[] $values() {
            return new State[]{STATE_NEW, STATE_NOT_CHANGED};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public OfflineModelResponse(String str, Double d11, List<OfflineModelWidget> list, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.widgetsHash = str;
        this.cacheLifetime = d11;
        this.widgets = list;
        this.state = state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfflineModelResponse copy$default(OfflineModelResponse offlineModelResponse, String str, Double d11, List list, State state, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = offlineModelResponse.widgetsHash;
        }
        if ((i11 & 2) != 0) {
            d11 = offlineModelResponse.cacheLifetime;
        }
        if ((i11 & 4) != 0) {
            list = offlineModelResponse.widgets;
        }
        if ((i11 & 8) != 0) {
            state = offlineModelResponse.state;
        }
        return offlineModelResponse.copy(str, d11, list, state);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetsHash() {
        return this.widgetsHash;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getCacheLifetime() {
        return this.cacheLifetime;
    }

    public final List<OfflineModelWidget> component3() {
        return this.widgets;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @NotNull
    public final OfflineModelResponse copy(String widgetsHash, Double cacheLifetime, List<OfflineModelWidget> widgets, @NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new OfflineModelResponse(widgetsHash, cacheLifetime, widgets, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineModelResponse)) {
            return false;
        }
        OfflineModelResponse offlineModelResponse = (OfflineModelResponse) other;
        return Intrinsics.d(this.widgetsHash, offlineModelResponse.widgetsHash) && Intrinsics.d(this.cacheLifetime, offlineModelResponse.cacheLifetime) && Intrinsics.d(this.widgets, offlineModelResponse.widgets) && this.state == offlineModelResponse.state;
    }

    public final Double getCacheLifetime() {
        return this.cacheLifetime;
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    public final List<OfflineModelWidget> getWidgets() {
        return this.widgets;
    }

    public final String getWidgetsHash() {
        return this.widgetsHash;
    }

    public int hashCode() {
        String str = this.widgetsHash;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d11 = this.cacheLifetime;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        List<OfflineModelWidget> list = this.widgets;
        return this.state.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "OfflineModelResponse(widgetsHash=" + this.widgetsHash + ", cacheLifetime=" + this.cacheLifetime + ", widgets=" + this.widgets + ", state=" + this.state + ")";
    }

    public /* synthetic */ OfflineModelResponse(String str, Double d11, List list, State state, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d11, list, (i11 & 8) != 0 ? State.STATE_NOT_CHANGED : state);
    }
}
