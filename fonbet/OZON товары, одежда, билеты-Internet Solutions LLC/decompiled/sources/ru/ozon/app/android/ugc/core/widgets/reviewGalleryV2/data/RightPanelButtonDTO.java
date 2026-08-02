package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data;

import Sc.o;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.rightPanel.RightPanelItemDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0000J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/RightPanelButtonDTO;", "", "state", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/RightPanelButtonDTO$RightPanelState;", "normal", "Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemDTO;", "selected", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/RightPanelButtonDTO$RightPanelState;Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemDTO;Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemDTO;)V", "getState", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/RightPanelButtonDTO$RightPanelState;", "getNormal", "()Lru/ozon/app/android/storefront/core/socialAtoms/rightPanel/RightPanelItemDTO;", "getSelected", "getCurrentItem", "reverseState", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "RightPanelState", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RightPanelButtonDTO {
    public static final int $stable = 8;

    @NotNull
    private final RightPanelItemDTO normal;
    private final RightPanelItemDTO selected;

    @NotNull
    private final RightPanelState state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007j\u0002\b\u0004j\u0002\b\u0005¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/RightPanelButtonDTO$RightPanelState;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "SELECTED", "isSelected", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RightPanelState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RightPanelState[] $VALUES;

        @i(name = "normal")
        public static final RightPanelState NORMAL = new RightPanelState("NORMAL", 0);

        @i(name = "selected")
        public static final RightPanelState SELECTED = new RightPanelState("SELECTED", 1);

        private static final /* synthetic */ RightPanelState[] $values() {
            return new RightPanelState[]{NORMAL, SELECTED};
        }

        static {
            RightPanelState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RightPanelState(String str, int i11) {
        }

        public static RightPanelState valueOf(String str) {
            return (RightPanelState) Enum.valueOf(RightPanelState.class, str);
        }

        public static RightPanelState[] values() {
            return (RightPanelState[]) $VALUES.clone();
        }

        public final boolean isSelected() {
            return this == SELECTED;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RightPanelState.values().length];
            try {
                iArr[RightPanelState.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RightPanelState.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RightPanelButtonDTO(@NotNull RightPanelState state, @NotNull RightPanelItemDTO normal, RightPanelItemDTO rightPanelItemDTO) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(normal, "normal");
        this.state = state;
        this.normal = normal;
        this.selected = rightPanelItemDTO;
    }

    public static /* synthetic */ RightPanelButtonDTO copy$default(RightPanelButtonDTO rightPanelButtonDTO, RightPanelState rightPanelState, RightPanelItemDTO rightPanelItemDTO, RightPanelItemDTO rightPanelItemDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rightPanelState = rightPanelButtonDTO.state;
        }
        if ((i11 & 2) != 0) {
            rightPanelItemDTO = rightPanelButtonDTO.normal;
        }
        if ((i11 & 4) != 0) {
            rightPanelItemDTO2 = rightPanelButtonDTO.selected;
        }
        return rightPanelButtonDTO.copy(rightPanelState, rightPanelItemDTO, rightPanelItemDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RightPanelState getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RightPanelItemDTO getNormal() {
        return this.normal;
    }

    /* renamed from: component3, reason: from getter */
    public final RightPanelItemDTO getSelected() {
        return this.selected;
    }

    @NotNull
    public final RightPanelButtonDTO copy(@NotNull RightPanelState state, @NotNull RightPanelItemDTO normal, RightPanelItemDTO selected) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(normal, "normal");
        return new RightPanelButtonDTO(state, normal, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RightPanelButtonDTO)) {
            return false;
        }
        RightPanelButtonDTO rightPanelButtonDTO = (RightPanelButtonDTO) other;
        return this.state == rightPanelButtonDTO.state && Intrinsics.d(this.normal, rightPanelButtonDTO.normal) && Intrinsics.d(this.selected, rightPanelButtonDTO.selected);
    }

    @NotNull
    public final RightPanelItemDTO getCurrentItem() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i11 == 1) {
            return this.normal;
        }
        if (i11 != 2) {
            throw new o();
        }
        RightPanelItemDTO rightPanelItemDTO = this.selected;
        return rightPanelItemDTO == null ? this.normal : rightPanelItemDTO;
    }

    @NotNull
    public final RightPanelItemDTO getNormal() {
        return this.normal;
    }

    public final RightPanelItemDTO getSelected() {
        return this.selected;
    }

    @NotNull
    public final RightPanelState getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode = (this.normal.hashCode() + (this.state.hashCode() * 31)) * 31;
        RightPanelItemDTO rightPanelItemDTO = this.selected;
        return hashCode + (rightPanelItemDTO == null ? 0 : rightPanelItemDTO.hashCode());
    }

    @NotNull
    public final RightPanelButtonDTO reverseState() {
        RightPanelState rightPanelState;
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i11 == 1) {
            rightPanelState = RightPanelState.SELECTED;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            rightPanelState = RightPanelState.NORMAL;
        }
        return copy$default(this, rightPanelState, null, null, 6, null);
    }

    @NotNull
    public String toString() {
        return "RightPanelButtonDTO(state=" + this.state + ", normal=" + this.normal + ", selected=" + this.selected + ")";
    }
}
