package ru.ozon.app.android.ugc.widgets.stickyBubble.data;

import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO;", "", "isSelected", "", "defaultState", "Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO$StickyBubbleStateDTO;", "selectedState", "selectedStateTimeout", "", "<init>", "(ZLru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO$StickyBubbleStateDTO;Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO$StickyBubbleStateDTO;Ljava/lang/Integer;)V", "()Z", "getDefaultState", "()Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO$StickyBubbleStateDTO;", "getSelectedState", "getSelectedStateTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ZLru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO$StickyBubbleStateDTO;Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO$StickyBubbleStateDTO;Ljava/lang/Integer;)Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO;", "equals", "other", "hashCode", "toString", "", "StickyBubbleStateDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StickyBubbleDTO {
    public static final int $stable = 8;

    @NotNull
    private final StickyBubbleStateDTO defaultState;
    private final boolean isSelected;
    private final StickyBubbleStateDTO selectedState;
    private final Integer selectedStateTimeout;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/widgets/stickyBubble/data/StickyBubbleDTO$StickyBubbleStateDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StickyBubbleStateDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public StickyBubbleStateDTO(@NotNull IconDTO icon, @NotNull TextDTO text, AtomActionDTO atomActionDTO, String str, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = icon;
            this.text = text;
            this.action = atomActionDTO;
            this.backgroundColor = str;
            this.trackingInfo = map;
        }

        public static /* synthetic */ StickyBubbleStateDTO copy$default(StickyBubbleStateDTO stickyBubbleStateDTO, IconDTO iconDTO, TextDTO textDTO, AtomActionDTO atomActionDTO, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = stickyBubbleStateDTO.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = stickyBubbleStateDTO.text;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = stickyBubbleStateDTO.action;
            }
            if ((i11 & 8) != 0) {
                str = stickyBubbleStateDTO.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                map = stickyBubbleStateDTO.trackingInfo;
            }
            Map map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return stickyBubbleStateDTO.copy(iconDTO, textDTO, atomActionDTO2, str, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final StickyBubbleStateDTO copy(@NotNull IconDTO icon, @NotNull TextDTO text, AtomActionDTO action, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            return new StickyBubbleStateDTO(icon, text, action, backgroundColor, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StickyBubbleStateDTO)) {
                return false;
            }
            StickyBubbleStateDTO stickyBubbleStateDTO = (StickyBubbleStateDTO) other;
            return Intrinsics.d(this.icon, stickyBubbleStateDTO.icon) && Intrinsics.d(this.text, stickyBubbleStateDTO.text) && Intrinsics.d(this.action, stickyBubbleStateDTO.action) && Intrinsics.d(this.backgroundColor, stickyBubbleStateDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, stickyBubbleStateDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.text, this.icon.hashCode() * 31, 31);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str = this.backgroundColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder i11 = Bi.b.i("StickyBubbleStateDTO(icon=", ", text=", ", action=", iconDTO, textDTO);
            HY.b.d(", backgroundColor=", str, ", trackingInfo=", i11, atomActionDTO);
            return P.f(i11, map, ")");
        }
    }

    public StickyBubbleDTO(boolean z11, @NotNull StickyBubbleStateDTO defaultState, StickyBubbleStateDTO stickyBubbleStateDTO, Integer num) {
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        this.isSelected = z11;
        this.defaultState = defaultState;
        this.selectedState = stickyBubbleStateDTO;
        this.selectedStateTimeout = num;
    }

    public static /* synthetic */ StickyBubbleDTO copy$default(StickyBubbleDTO stickyBubbleDTO, boolean z11, StickyBubbleStateDTO stickyBubbleStateDTO, StickyBubbleStateDTO stickyBubbleStateDTO2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = stickyBubbleDTO.isSelected;
        }
        if ((i11 & 2) != 0) {
            stickyBubbleStateDTO = stickyBubbleDTO.defaultState;
        }
        if ((i11 & 4) != 0) {
            stickyBubbleStateDTO2 = stickyBubbleDTO.selectedState;
        }
        if ((i11 & 8) != 0) {
            num = stickyBubbleDTO.selectedStateTimeout;
        }
        return stickyBubbleDTO.copy(z11, stickyBubbleStateDTO, stickyBubbleStateDTO2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final StickyBubbleStateDTO getDefaultState() {
        return this.defaultState;
    }

    /* renamed from: component3, reason: from getter */
    public final StickyBubbleStateDTO getSelectedState() {
        return this.selectedState;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getSelectedStateTimeout() {
        return this.selectedStateTimeout;
    }

    @NotNull
    public final StickyBubbleDTO copy(boolean isSelected, @NotNull StickyBubbleStateDTO defaultState, StickyBubbleStateDTO selectedState, Integer selectedStateTimeout) {
        Intrinsics.checkNotNullParameter(defaultState, "defaultState");
        return new StickyBubbleDTO(isSelected, defaultState, selectedState, selectedStateTimeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyBubbleDTO)) {
            return false;
        }
        StickyBubbleDTO stickyBubbleDTO = (StickyBubbleDTO) other;
        return this.isSelected == stickyBubbleDTO.isSelected && Intrinsics.d(this.defaultState, stickyBubbleDTO.defaultState) && Intrinsics.d(this.selectedState, stickyBubbleDTO.selectedState) && Intrinsics.d(this.selectedStateTimeout, stickyBubbleDTO.selectedStateTimeout);
    }

    @NotNull
    public final StickyBubbleStateDTO getDefaultState() {
        return this.defaultState;
    }

    public final StickyBubbleStateDTO getSelectedState() {
        return this.selectedState;
    }

    public final Integer getSelectedStateTimeout() {
        return this.selectedStateTimeout;
    }

    public int hashCode() {
        int hashCode = (this.defaultState.hashCode() + (Boolean.hashCode(this.isSelected) * 31)) * 31;
        StickyBubbleStateDTO stickyBubbleStateDTO = this.selectedState;
        int hashCode2 = (hashCode + (stickyBubbleStateDTO == null ? 0 : stickyBubbleStateDTO.hashCode())) * 31;
        Integer num = this.selectedStateTimeout;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        return "StickyBubbleDTO(isSelected=" + this.isSelected + ", defaultState=" + this.defaultState + ", selectedState=" + this.selectedState + ", selectedStateTimeout=" + this.selectedStateTimeout + ")";
    }
}
