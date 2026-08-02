package ru.ozon.android.messenger.blocks.ai.input.data;

import G.g;
import Ns.b;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001:\u0001=B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jx\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0016J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001dR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010!R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010#¨\u0006>"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO;", "", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO$OutlineColor;", "outlineColors", "cursorColor", "Lru/ozon/android/messenger/blocks/ai/input/data/a;", "mode", "", "Lru/ozon/android/messenger/blocks/ai/input/data/AiInputButton;", "iconButtons", "Lru/ozon/android/messenger/blocks/ai/input/data/Settings;", "settings", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO$OutlineColor;Ljava/lang/String;Lru/ozon/android/messenger/blocks/ai/input/data/a;Ljava/util/List;Lru/ozon/android/messenger/blocks/ai/input/data/Settings;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component3", "()Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO$OutlineColor;", "component4", "component5", "()Lru/ozon/android/messenger/blocks/ai/input/data/a;", "component6", "()Ljava/util/List;", "component7", "()Lru/ozon/android/messenger/blocks/ai/input/data/Settings;", "component8", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO$OutlineColor;Ljava/lang/String;Lru/ozon/android/messenger/blocks/ai/input/data/a;Ljava/util/List;Lru/ozon/android/messenger/blocks/ai/input/data/Settings;Ljava/util/Map;)Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPlaceholder", "Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO$OutlineColor;", "getOutlineColors", "getCursorColor", "Lru/ozon/android/messenger/blocks/ai/input/data/a;", "getMode", "Ljava/util/List;", "getIconButtons", "Lru/ozon/android/messenger/blocks/ai/input/data/Settings;", "getSettings", "Ljava/util/Map;", "getTrackingInfo", "OutlineColor", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AiInputDTO {
    public static final int $stable = 8;

    @NotNull
    private final String cursorColor;

    @NotNull
    private final List<AiInputButton> iconButtons;

    @NotNull
    private final a mode;

    @NotNull
    private final OutlineColor outlineColors;

    @NotNull
    private final TextDTO placeholder;
    private final Settings settings;
    private final String text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/input/data/AiInputDTO$OutlineColor;", "", "default", "", "focused", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefault", "()Ljava/lang/String;", "getFocused", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OutlineColor {
        public static final int $stable = 0;

        @NotNull
        private final String default;
        private final String focused;

        public OutlineColor(@NotNull String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "default");
            this.default = str;
            this.focused = str2;
        }

        public static /* synthetic */ OutlineColor copy$default(OutlineColor outlineColor, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = outlineColor.default;
            }
            if ((i11 & 2) != 0) {
                str2 = outlineColor.focused;
            }
            return outlineColor.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDefault() {
            return this.default;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFocused() {
            return this.focused;
        }

        @NotNull
        public final OutlineColor copy(@NotNull String r22, String focused) {
            Intrinsics.checkNotNullParameter(r22, "default");
            return new OutlineColor(r22, focused);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OutlineColor)) {
                return false;
            }
            OutlineColor outlineColor = (OutlineColor) other;
            return Intrinsics.d(this.default, outlineColor.default) && Intrinsics.d(this.focused, outlineColor.focused);
        }

        @NotNull
        public final String getDefault() {
            return this.default;
        }

        public final String getFocused() {
            return this.focused;
        }

        public int hashCode() {
            int hashCode = this.default.hashCode() * 31;
            String str = this.focused;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("OutlineColor(default=", this.default, ", focused=", this.focused, ")");
        }
    }

    public AiInputDTO(String str, @NotNull TextDTO placeholder, @NotNull OutlineColor outlineColors, @NotNull String cursorColor, @NotNull a mode, @NotNull List<AiInputButton> iconButtons, Settings settings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(outlineColors, "outlineColors");
        Intrinsics.checkNotNullParameter(cursorColor, "cursorColor");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(iconButtons, "iconButtons");
        this.text = str;
        this.placeholder = placeholder;
        this.outlineColors = outlineColors;
        this.cursorColor = cursorColor;
        this.mode = mode;
        this.iconButtons = iconButtons;
        this.settings = settings;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AiInputDTO copy$default(AiInputDTO aiInputDTO, String str, TextDTO textDTO, OutlineColor outlineColor, String str2, a aVar, List list, Settings settings, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aiInputDTO.text;
        }
        if ((i11 & 2) != 0) {
            textDTO = aiInputDTO.placeholder;
        }
        if ((i11 & 4) != 0) {
            outlineColor = aiInputDTO.outlineColors;
        }
        if ((i11 & 8) != 0) {
            str2 = aiInputDTO.cursorColor;
        }
        if ((i11 & 16) != 0) {
            aVar = aiInputDTO.mode;
        }
        if ((i11 & 32) != 0) {
            list = aiInputDTO.iconButtons;
        }
        if ((i11 & 64) != 0) {
            settings = aiInputDTO.settings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = aiInputDTO.trackingInfo;
        }
        Settings settings2 = settings;
        Map map2 = map;
        a aVar2 = aVar;
        List list2 = list;
        return aiInputDTO.copy(str, textDTO, outlineColor, str2, aVar2, list2, settings2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final OutlineColor getOutlineColors() {
        return this.outlineColors;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCursorColor() {
        return this.cursorColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final a getMode() {
        return this.mode;
    }

    @NotNull
    public final List<AiInputButton> component6() {
        return this.iconButtons;
    }

    /* renamed from: component7, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final AiInputDTO copy(String text, @NotNull TextDTO placeholder, @NotNull OutlineColor outlineColors, @NotNull String cursorColor, @NotNull a mode, @NotNull List<AiInputButton> iconButtons, Settings settings, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(outlineColors, "outlineColors");
        Intrinsics.checkNotNullParameter(cursorColor, "cursorColor");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(iconButtons, "iconButtons");
        return new AiInputDTO(text, placeholder, outlineColors, cursorColor, mode, iconButtons, settings, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiInputDTO)) {
            return false;
        }
        AiInputDTO aiInputDTO = (AiInputDTO) other;
        return Intrinsics.d(this.text, aiInputDTO.text) && Intrinsics.d(this.placeholder, aiInputDTO.placeholder) && Intrinsics.d(this.outlineColors, aiInputDTO.outlineColors) && Intrinsics.d(this.cursorColor, aiInputDTO.cursorColor) && this.mode == aiInputDTO.mode && Intrinsics.d(this.iconButtons, aiInputDTO.iconButtons) && Intrinsics.d(this.settings, aiInputDTO.settings) && Intrinsics.d(this.trackingInfo, aiInputDTO.trackingInfo);
    }

    @NotNull
    public final String getCursorColor() {
        return this.cursorColor;
    }

    @NotNull
    public final List<AiInputButton> getIconButtons() {
        return this.iconButtons;
    }

    @NotNull
    public final a getMode() {
        return this.mode;
    }

    @NotNull
    public final OutlineColor getOutlineColors() {
        return this.outlineColors;
    }

    @NotNull
    public final TextDTO getPlaceholder() {
        return this.placeholder;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public final String getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.text;
        int b11 = g.b((this.mode.hashCode() + g.a((this.outlineColors.hashCode() + b.a(this.placeholder, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31, 31, this.cursorColor)) * 31, 31, this.iconButtons);
        Settings settings = this.settings;
        int hashCode = (b11 + (settings == null ? 0 : settings.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        TextDTO textDTO = this.placeholder;
        OutlineColor outlineColor = this.outlineColors;
        String str2 = this.cursorColor;
        a aVar = this.mode;
        List<AiInputButton> list = this.iconButtons;
        Settings settings = this.settings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = Co.a.b("AiInputDTO(text=", textDTO, str, ", placeholder=", ", outlineColors=");
        b11.append(outlineColor);
        b11.append(", cursorColor=");
        b11.append(str2);
        b11.append(", mode=");
        b11.append(aVar);
        b11.append(", iconButtons=");
        b11.append(list);
        b11.append(", settings=");
        b11.append(settings);
        b11.append(", trackingInfo=");
        b11.append(map);
        b11.append(")");
        return b11.toString();
    }
}
