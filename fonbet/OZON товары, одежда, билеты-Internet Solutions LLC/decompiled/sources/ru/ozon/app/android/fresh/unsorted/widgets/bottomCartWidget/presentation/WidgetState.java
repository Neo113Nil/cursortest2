package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.data.BottomCartWidgetDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/WidgetState;", "", "<init>", "()V", "NewState", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/WidgetState$NewState;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class WidgetState {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/WidgetState$NewState;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/presentation/WidgetState;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/data/BottomCartWidgetDTO;", "dto", "", "", "trackingPayloads", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/data/BottomCartWidgetDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/data/BottomCartWidgetDTO;", "getDto", "()Lru/ozon/app/android/fresh/unsorted/widgets/bottomCartWidget/data/BottomCartWidgetDTO;", "Ljava/util/Map;", "getTrackingPayloads", "()Ljava/util/Map;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewState extends WidgetState {

        @NotNull
        private final BottomCartWidgetDTO dto;
        private final Map<String, String> trackingPayloads;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewState(@NotNull BottomCartWidgetDTO dto, Map<String, String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(dto, "dto");
            this.dto = dto;
            this.trackingPayloads = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewState)) {
                return false;
            }
            NewState newState = (NewState) other;
            return Intrinsics.d(this.dto, newState.dto) && Intrinsics.d(this.trackingPayloads, newState.trackingPayloads);
        }

        @NotNull
        public final BottomCartWidgetDTO getDto() {
            return this.dto;
        }

        public final Map<String, String> getTrackingPayloads() {
            return this.trackingPayloads;
        }

        public int hashCode() {
            int hashCode = this.dto.hashCode() * 31;
            Map<String, String> map = this.trackingPayloads;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "NewState(dto=" + this.dto + ", trackingPayloads=" + this.trackingPayloads + ")";
        }
    }

    public /* synthetic */ WidgetState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WidgetState() {
    }
}
