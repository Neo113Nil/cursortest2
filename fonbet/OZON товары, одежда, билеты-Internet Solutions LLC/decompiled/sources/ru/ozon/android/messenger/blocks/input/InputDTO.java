package ru.ozon.android.messenger.blocks.input;

import G.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.ActionCurtainDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u009a\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0002\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019¨\u00067"}, d2 = {"Lru/ozon/android/messenger/blocks/input/InputDTO;", "", "isDisabled", "", HammersV3BodyDTO.PLACEHOLDER, "", "text", "chatId", "lexemes", "", "config", "Lru/ozon/android/messenger/blocks/input/ConfigDTO;", "customBlocks", "", "Lru/ozon/android/messenger/blocks/input/CustomBlockDTO;", "actionCurtain", "Lru/ozon/android/messenger/framework/data/remote/models/ActionCurtainDTO;", "sendButtonModes", "Lru/ozon/android/messenger/blocks/input/SendButtonModeDTO;", "currentModeName", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/android/messenger/blocks/input/ConfigDTO;Ljava/util/List;Lru/ozon/android/messenger/framework/data/remote/models/ActionCurtainDTO;Ljava/util/List;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPlaceholder", "()Ljava/lang/String;", "getText", "getChatId", "getLexemes", "()Ljava/util/Map;", "getConfig", "()Lru/ozon/android/messenger/blocks/input/ConfigDTO;", "getCustomBlocks", "()Ljava/util/List;", "getActionCurtain", "()Lru/ozon/android/messenger/framework/data/remote/models/ActionCurtainDTO;", "getSendButtonModes", "getCurrentModeName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/android/messenger/blocks/input/ConfigDTO;Ljava/util/List;Lru/ozon/android/messenger/framework/data/remote/models/ActionCurtainDTO;Ljava/util/List;Ljava/lang/String;)Lru/ozon/android/messenger/blocks/input/InputDTO;", "equals", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InputDTO {
    public static final int $stable = 8;
    private final ActionCurtainDTO actionCurtain;

    @NotNull
    private final String chatId;

    @NotNull
    private final ConfigDTO config;
    private final String currentModeName;
    private final List<CustomBlockDTO> customBlocks;
    private final Boolean isDisabled;
    private final Map<String, String> lexemes;
    private final String placeholder;
    private final List<SendButtonModeDTO> sendButtonModes;
    private final String text;

    public InputDTO(Boolean bool, String str, String str2, @NotNull String chatId, Map<String, String> map, @NotNull ConfigDTO config, List<CustomBlockDTO> list, ActionCurtainDTO actionCurtainDTO, List<SendButtonModeDTO> list2, String str3) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(config, "config");
        this.isDisabled = bool;
        this.placeholder = str;
        this.text = str2;
        this.chatId = chatId;
        this.lexemes = map;
        this.config = config;
        this.customBlocks = list;
        this.actionCurtain = actionCurtainDTO;
        this.sendButtonModes = list2;
        this.currentModeName = str3;
    }

    public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, Boolean bool, String str, String str2, String str3, Map map, ConfigDTO configDTO, List list, ActionCurtainDTO actionCurtainDTO, List list2, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = inputDTO.isDisabled;
        }
        if ((i11 & 2) != 0) {
            str = inputDTO.placeholder;
        }
        if ((i11 & 4) != 0) {
            str2 = inputDTO.text;
        }
        if ((i11 & 8) != 0) {
            str3 = inputDTO.chatId;
        }
        if ((i11 & 16) != 0) {
            map = inputDTO.lexemes;
        }
        if ((i11 & 32) != 0) {
            configDTO = inputDTO.config;
        }
        if ((i11 & 64) != 0) {
            list = inputDTO.customBlocks;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            actionCurtainDTO = inputDTO.actionCurtain;
        }
        if ((i11 & 256) != 0) {
            list2 = inputDTO.sendButtonModes;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str4 = inputDTO.currentModeName;
        }
        List list3 = list2;
        String str5 = str4;
        List list4 = list;
        ActionCurtainDTO actionCurtainDTO2 = actionCurtainDTO;
        Map map2 = map;
        ConfigDTO configDTO2 = configDTO;
        return inputDTO.copy(bool, str, str2, str3, map2, configDTO2, list4, actionCurtainDTO2, list3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCurrentModeName() {
        return this.currentModeName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    public final Map<String, String> component5() {
        return this.lexemes;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ConfigDTO getConfig() {
        return this.config;
    }

    public final List<CustomBlockDTO> component7() {
        return this.customBlocks;
    }

    /* renamed from: component8, reason: from getter */
    public final ActionCurtainDTO getActionCurtain() {
        return this.actionCurtain;
    }

    public final List<SendButtonModeDTO> component9() {
        return this.sendButtonModes;
    }

    @NotNull
    public final InputDTO copy(Boolean isDisabled, String placeholder, String text, @NotNull String chatId, Map<String, String> lexemes, @NotNull ConfigDTO config, List<CustomBlockDTO> customBlocks, ActionCurtainDTO actionCurtain, List<SendButtonModeDTO> sendButtonModes, String currentModeName) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(config, "config");
        return new InputDTO(isDisabled, placeholder, text, chatId, lexemes, config, customBlocks, actionCurtain, sendButtonModes, currentModeName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputDTO)) {
            return false;
        }
        InputDTO inputDTO = (InputDTO) other;
        return Intrinsics.d(this.isDisabled, inputDTO.isDisabled) && Intrinsics.d(this.placeholder, inputDTO.placeholder) && Intrinsics.d(this.text, inputDTO.text) && Intrinsics.d(this.chatId, inputDTO.chatId) && Intrinsics.d(this.lexemes, inputDTO.lexemes) && Intrinsics.d(this.config, inputDTO.config) && Intrinsics.d(this.customBlocks, inputDTO.customBlocks) && Intrinsics.d(this.actionCurtain, inputDTO.actionCurtain) && Intrinsics.d(this.sendButtonModes, inputDTO.sendButtonModes) && Intrinsics.d(this.currentModeName, inputDTO.currentModeName);
    }

    public final ActionCurtainDTO getActionCurtain() {
        return this.actionCurtain;
    }

    @NotNull
    public final String getChatId() {
        return this.chatId;
    }

    @NotNull
    public final ConfigDTO getConfig() {
        return this.config;
    }

    public final String getCurrentModeName() {
        return this.currentModeName;
    }

    public final List<CustomBlockDTO> getCustomBlocks() {
        return this.customBlocks;
    }

    public final Map<String, String> getLexemes() {
        return this.lexemes;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final List<SendButtonModeDTO> getSendButtonModes() {
        return this.sendButtonModes;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        Boolean bool = this.isDisabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.placeholder;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int a11 = g.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.chatId);
        Map<String, String> map = this.lexemes;
        int hashCode3 = (this.config.hashCode() + ((a11 + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        List<CustomBlockDTO> list = this.customBlocks;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ActionCurtainDTO actionCurtainDTO = this.actionCurtain;
        int hashCode5 = (hashCode4 + (actionCurtainDTO == null ? 0 : actionCurtainDTO.hashCode())) * 31;
        List<SendButtonModeDTO> list2 = this.sendButtonModes;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.currentModeName;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isDisabled;
        String str = this.placeholder;
        String str2 = this.text;
        String str3 = this.chatId;
        Map<String, String> map = this.lexemes;
        ConfigDTO configDTO = this.config;
        List<CustomBlockDTO> list = this.customBlocks;
        ActionCurtainDTO actionCurtainDTO = this.actionCurtain;
        List<SendButtonModeDTO> list2 = this.sendButtonModes;
        String str4 = this.currentModeName;
        StringBuilder e11 = D3.g.e("InputDTO(isDisabled=", bool, ", placeholder=", str, ", text=");
        Nh.a.h(e11, str2, ", chatId=", str3, ", lexemes=");
        e11.append(map);
        e11.append(", config=");
        e11.append(configDTO);
        e11.append(", customBlocks=");
        e11.append(list);
        e11.append(", actionCurtain=");
        e11.append(actionCurtainDTO);
        e11.append(", sendButtonModes=");
        e11.append(list2);
        e11.append(", currentModeName=");
        e11.append(str4);
        e11.append(")");
        return e11.toString();
    }
}
