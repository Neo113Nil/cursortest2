package ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v2.data;

import D3.g;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v2/data/TravelTextV2DTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "isNeedToSupportAppTags", "", "stickyBehavior", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v2/data/TravelTextV2DTO$StickyBehavior;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;ZLru/ozon/app/android/travel/feature/general/common/widgets/travelText/v2/data/TravelTextV2DTO$StickyBehavior;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "()Z", "getStickyBehavior", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v2/data/TravelTextV2DTO$StickyBehavior;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "StickyBehavior", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTextV2DTO {
    public static final int $stable = 0;
    private final String backgroundColor;
    private final boolean isNeedToSupportAppTags;

    @EnumNullFallback
    private final StickyBehavior stickyBehavior;

    @NotNull
    private final TextDTO text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v2/data/TravelTextV2DTO$StickyBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "STICKY_BEHAVIOR_TOP", "STICKY_BEHAVIOR_BOTTOM", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StickyBehavior {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StickyBehavior[] $VALUES;

        @i(name = "STICKY_BEHAVIOR_TOP")
        public static final StickyBehavior STICKY_BEHAVIOR_TOP = new StickyBehavior("STICKY_BEHAVIOR_TOP", 0);

        @i(name = "STICKY_BEHAVIOR_BOTTOM")
        public static final StickyBehavior STICKY_BEHAVIOR_BOTTOM = new StickyBehavior("STICKY_BEHAVIOR_BOTTOM", 1);

        private static final /* synthetic */ StickyBehavior[] $values() {
            return new StickyBehavior[]{STICKY_BEHAVIOR_TOP, STICKY_BEHAVIOR_BOTTOM};
        }

        static {
            StickyBehavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private StickyBehavior(String str, int i11) {
        }

        public static StickyBehavior valueOf(String str) {
            return (StickyBehavior) Enum.valueOf(StickyBehavior.class, str);
        }

        public static StickyBehavior[] values() {
            return (StickyBehavior[]) $VALUES.clone();
        }
    }

    public TravelTextV2DTO(@NotNull TextDTO text, String str, boolean z11, StickyBehavior stickyBehavior) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.backgroundColor = str;
        this.isNeedToSupportAppTags = z11;
        this.stickyBehavior = stickyBehavior;
    }

    public static /* synthetic */ TravelTextV2DTO copy$default(TravelTextV2DTO travelTextV2DTO, TextDTO textDTO, String str, boolean z11, StickyBehavior stickyBehavior, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = travelTextV2DTO.text;
        }
        if ((i11 & 2) != 0) {
            str = travelTextV2DTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            z11 = travelTextV2DTO.isNeedToSupportAppTags;
        }
        if ((i11 & 8) != 0) {
            stickyBehavior = travelTextV2DTO.stickyBehavior;
        }
        return travelTextV2DTO.copy(textDTO, str, z11, stickyBehavior);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNeedToSupportAppTags() {
        return this.isNeedToSupportAppTags;
    }

    /* renamed from: component4, reason: from getter */
    public final StickyBehavior getStickyBehavior() {
        return this.stickyBehavior;
    }

    @NotNull
    public final TravelTextV2DTO copy(@NotNull TextDTO text, String backgroundColor, boolean isNeedToSupportAppTags, StickyBehavior stickyBehavior) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TravelTextV2DTO(text, backgroundColor, isNeedToSupportAppTags, stickyBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTextV2DTO)) {
            return false;
        }
        TravelTextV2DTO travelTextV2DTO = (TravelTextV2DTO) other;
        return Intrinsics.d(this.text, travelTextV2DTO.text) && Intrinsics.d(this.backgroundColor, travelTextV2DTO.backgroundColor) && this.isNeedToSupportAppTags == travelTextV2DTO.isNeedToSupportAppTags && this.stickyBehavior == travelTextV2DTO.stickyBehavior;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final StickyBehavior getStickyBehavior() {
        return this.stickyBehavior;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.backgroundColor;
        int a11 = C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isNeedToSupportAppTags);
        StickyBehavior stickyBehavior = this.stickyBehavior;
        return a11 + (stickyBehavior != null ? stickyBehavior.hashCode() : 0);
    }

    public final boolean isNeedToSupportAppTags() {
        return this.isNeedToSupportAppTags;
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        String str = this.backgroundColor;
        boolean z11 = this.isNeedToSupportAppTags;
        StickyBehavior stickyBehavior = this.stickyBehavior;
        StringBuilder f7 = g.f("TravelTextV2DTO(text=", textDTO, ", backgroundColor=", str, ", isNeedToSupportAppTags=");
        f7.append(z11);
        f7.append(", stickyBehavior=");
        f7.append(stickyBehavior);
        f7.append(")");
        return f7.toString();
    }

    public /* synthetic */ TravelTextV2DTO(TextDTO textDTO, String str, boolean z11, StickyBehavior stickyBehavior, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, str, (i11 & 4) != 0 ? false : z11, stickyBehavior);
    }
}
