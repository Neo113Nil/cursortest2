package ru.ozon.android.messenger.blocks.originalText;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003JC\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/android/messenger/blocks/originalText/OriginalTextDTO;", "", "button", "Lru/ozon/android/messenger/blocks/originalText/OriginalTextDTO$OriginalTextButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "lexemes", "<init>", "(Lru/ozon/android/messenger/blocks/originalText/OriginalTextDTO$OriginalTextButtonDTO;Ljava/util/Map;Ljava/util/Map;)V", "getButton", "()Lru/ozon/android/messenger/blocks/originalText/OriginalTextDTO$OriginalTextButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getLexemes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "OriginalTextButtonDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OriginalTextDTO {
    public static final int $stable = 8;

    @NotNull
    private final OriginalTextButtonDTO button;
    private final Map<String, String> lexemes;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/android/messenger/blocks/originalText/OriginalTextDTO$OriginalTextButtonDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "", "iconTintColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Ljava/lang/String;", "getIconTintColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OriginalTextButtonDTO {
        public static final int $stable = 0;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String icon;

        @NotNull
        private final String iconTintColor;

        @NotNull
        private final TextDTO text;

        public OriginalTextButtonDTO(@NotNull TextDTO text, @NotNull String icon, @NotNull String iconTintColor, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(iconTintColor, "iconTintColor");
            Intrinsics.checkNotNullParameter(action, "action");
            this.text = text;
            this.icon = icon;
            this.iconTintColor = iconTintColor;
            this.action = action;
        }

        public static /* synthetic */ OriginalTextButtonDTO copy$default(OriginalTextButtonDTO originalTextButtonDTO, TextDTO textDTO, String str, String str2, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = originalTextButtonDTO.text;
            }
            if ((i11 & 2) != 0) {
                str = originalTextButtonDTO.icon;
            }
            if ((i11 & 4) != 0) {
                str2 = originalTextButtonDTO.iconTintColor;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = originalTextButtonDTO.action;
            }
            return originalTextButtonDTO.copy(textDTO, str, str2, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final OriginalTextButtonDTO copy(@NotNull TextDTO text, @NotNull String icon, @NotNull String iconTintColor, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(iconTintColor, "iconTintColor");
            Intrinsics.checkNotNullParameter(action, "action");
            return new OriginalTextButtonDTO(text, icon, iconTintColor, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OriginalTextButtonDTO)) {
                return false;
            }
            OriginalTextButtonDTO originalTextButtonDTO = (OriginalTextButtonDTO) other;
            return Intrinsics.d(this.text, originalTextButtonDTO.text) && Intrinsics.d(this.icon, originalTextButtonDTO.icon) && Intrinsics.d(this.iconTintColor, originalTextButtonDTO.iconTintColor) && Intrinsics.d(this.action, originalTextButtonDTO.action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getIconTintColor() {
            return this.iconTintColor;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.action.hashCode() + G.g.a(G.g.a(this.text.hashCode() * 31, 31, this.icon), 31, this.iconTintColor);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            String str = this.icon;
            String str2 = this.iconTintColor;
            AtomActionDTO atomActionDTO = this.action;
            StringBuilder f7 = D3.g.f("OriginalTextButtonDTO(text=", textDTO, ", icon=", str, ", iconTintColor=");
            f7.append(str2);
            f7.append(", action=");
            f7.append(atomActionDTO);
            f7.append(")");
            return f7.toString();
        }
    }

    public OriginalTextDTO(@NotNull OriginalTextButtonDTO button, Map<String, MessengerTrackingInfo> map, Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.trackingInfo = map;
        this.lexemes = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OriginalTextDTO copy$default(OriginalTextDTO originalTextDTO, OriginalTextButtonDTO originalTextButtonDTO, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            originalTextButtonDTO = originalTextDTO.button;
        }
        if ((i11 & 2) != 0) {
            map = originalTextDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            map2 = originalTextDTO.lexemes;
        }
        return originalTextDTO.copy(originalTextButtonDTO, map, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OriginalTextButtonDTO getButton() {
        return this.button;
    }

    public final Map<String, MessengerTrackingInfo> component2() {
        return this.trackingInfo;
    }

    public final Map<String, String> component3() {
        return this.lexemes;
    }

    @NotNull
    public final OriginalTextDTO copy(@NotNull OriginalTextButtonDTO button, Map<String, MessengerTrackingInfo> trackingInfo, Map<String, String> lexemes) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new OriginalTextDTO(button, trackingInfo, lexemes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OriginalTextDTO)) {
            return false;
        }
        OriginalTextDTO originalTextDTO = (OriginalTextDTO) other;
        return Intrinsics.d(this.button, originalTextDTO.button) && Intrinsics.d(this.trackingInfo, originalTextDTO.trackingInfo) && Intrinsics.d(this.lexemes, originalTextDTO.lexemes);
    }

    @NotNull
    public final OriginalTextButtonDTO getButton() {
        return this.button;
    }

    public final Map<String, String> getLexemes() {
        return this.lexemes;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.lexemes;
        return hashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OriginalTextButtonDTO originalTextButtonDTO = this.button;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        Map<String, String> map2 = this.lexemes;
        StringBuilder sb2 = new StringBuilder("OriginalTextDTO(button=");
        sb2.append(originalTextButtonDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", lexemes=");
        return P.f(sb2, map2, ")");
    }
}
