package ru.ozon.android.messenger.blocks.floatbutton;

import Ul.C4070a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J^\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/android/messenger/blocks/floatbutton/FloatButtonDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "cornerRadius", "", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/android/messenger/blocks/floatbutton/FloatButtonDTO;", "equals", "", "other", "hashCode", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FloatButtonDTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final Integer cornerRadius;

    @NotNull
    private final IconDTO icon;
    private final TextDTO text;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public FloatButtonDTO(@NotNull IconDTO icon, TextDTO textDTO, @NotNull AtomActionDTO action, Integer num, String str, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.icon = icon;
        this.text = textDTO;
        this.action = action;
        this.cornerRadius = num;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ FloatButtonDTO copy$default(FloatButtonDTO floatButtonDTO, IconDTO iconDTO, TextDTO textDTO, AtomActionDTO atomActionDTO, Integer num, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = floatButtonDTO.icon;
        }
        if ((i11 & 2) != 0) {
            textDTO = floatButtonDTO.text;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = floatButtonDTO.action;
        }
        if ((i11 & 8) != 0) {
            num = floatButtonDTO.cornerRadius;
        }
        if ((i11 & 16) != 0) {
            str = floatButtonDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            map = floatButtonDTO.trackingInfo;
        }
        String str2 = str;
        Map map2 = map;
        return floatButtonDTO.copy(iconDTO, textDTO, atomActionDTO, num, str2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, MessengerTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final FloatButtonDTO copy(@NotNull IconDTO icon, TextDTO text, @NotNull AtomActionDTO action, Integer cornerRadius, String backgroundColor, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        return new FloatButtonDTO(icon, text, action, cornerRadius, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloatButtonDTO)) {
            return false;
        }
        FloatButtonDTO floatButtonDTO = (FloatButtonDTO) other;
        return Intrinsics.d(this.icon, floatButtonDTO.icon) && Intrinsics.d(this.text, floatButtonDTO.text) && Intrinsics.d(this.action, floatButtonDTO.action) && Intrinsics.d(this.cornerRadius, floatButtonDTO.cornerRadius) && Intrinsics.d(this.backgroundColor, floatButtonDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, floatButtonDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        TextDTO textDTO = this.text;
        int b11 = Ih.a.b(this.action, (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        Integer num = this.cornerRadius;
        int hashCode2 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.text;
        AtomActionDTO atomActionDTO = this.action;
        Integer num = this.cornerRadius;
        String str = this.backgroundColor;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder i11 = Bi.b.i("FloatButtonDTO(icon=", ", text=", ", action=", iconDTO, textDTO);
        i11.append(atomActionDTO);
        i11.append(", cornerRadius=");
        i11.append(num);
        i11.append(", backgroundColor=");
        return C4070a.a(i11, str, ", trackingInfo=", map, ")");
    }
}
