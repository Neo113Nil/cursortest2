package ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.data;

import Ef0.c;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001:\u0001)BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J^\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/data/TravelTextDTO;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "backgroundColor", "", "offsetHorizontal", "", "offsetTop", "offsetBottom", "isCentered", "", "stickyBehavior", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/data/TravelTextDTO$StickyBehavior;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/data/TravelTextDTO$StickyBehavior;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBackgroundColor", "()Ljava/lang/String;", "getOffsetHorizontal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffsetTop", "getOffsetBottom", "()Z", "getStickyBehavior", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/data/TravelTextDTO$StickyBehavior;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/data/TravelTextDTO$StickyBehavior;)Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/data/TravelTextDTO;", "equals", "other", "hashCode", "toString", "StickyBehavior", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelTextDTO {
    public static final int $stable = TextAtom.$stable;
    private final String backgroundColor;
    private final boolean isCentered;
    private final Integer offsetBottom;
    private final Integer offsetHorizontal;
    private final Integer offsetTop;

    @EnumNullFallback
    private final StickyBehavior stickyBehavior;

    @NotNull
    private final TextAtom text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/data/TravelTextDTO$StickyBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "STICKY_BEHAVIOR_TOP", "STICKY_BEHAVIOR_BOTTOM", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public TravelTextDTO(@NotNull TextAtom text, String str, Integer num, Integer num2, Integer num3, boolean z11, StickyBehavior stickyBehavior) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.backgroundColor = str;
        this.offsetHorizontal = num;
        this.offsetTop = num2;
        this.offsetBottom = num3;
        this.isCentered = z11;
        this.stickyBehavior = stickyBehavior;
    }

    public static /* synthetic */ TravelTextDTO copy$default(TravelTextDTO travelTextDTO, TextAtom textAtom, String str, Integer num, Integer num2, Integer num3, boolean z11, StickyBehavior stickyBehavior, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelTextDTO.text;
        }
        if ((i11 & 2) != 0) {
            str = travelTextDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            num = travelTextDTO.offsetHorizontal;
        }
        if ((i11 & 8) != 0) {
            num2 = travelTextDTO.offsetTop;
        }
        if ((i11 & 16) != 0) {
            num3 = travelTextDTO.offsetBottom;
        }
        if ((i11 & 32) != 0) {
            z11 = travelTextDTO.isCentered;
        }
        if ((i11 & 64) != 0) {
            stickyBehavior = travelTextDTO.stickyBehavior;
        }
        boolean z12 = z11;
        StickyBehavior stickyBehavior2 = stickyBehavior;
        Integer num4 = num3;
        Integer num5 = num;
        return travelTextDTO.copy(textAtom, str, num5, num2, num4, z12, stickyBehavior2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getOffsetHorizontal() {
        return this.offsetHorizontal;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getOffsetTop() {
        return this.offsetTop;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getOffsetBottom() {
        return this.offsetBottom;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCentered() {
        return this.isCentered;
    }

    /* renamed from: component7, reason: from getter */
    public final StickyBehavior getStickyBehavior() {
        return this.stickyBehavior;
    }

    @NotNull
    public final TravelTextDTO copy(@NotNull TextAtom text, String backgroundColor, Integer offsetHorizontal, Integer offsetTop, Integer offsetBottom, boolean isCentered, StickyBehavior stickyBehavior) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TravelTextDTO(text, backgroundColor, offsetHorizontal, offsetTop, offsetBottom, isCentered, stickyBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelTextDTO)) {
            return false;
        }
        TravelTextDTO travelTextDTO = (TravelTextDTO) other;
        return Intrinsics.d(this.text, travelTextDTO.text) && Intrinsics.d(this.backgroundColor, travelTextDTO.backgroundColor) && Intrinsics.d(this.offsetHorizontal, travelTextDTO.offsetHorizontal) && Intrinsics.d(this.offsetTop, travelTextDTO.offsetTop) && Intrinsics.d(this.offsetBottom, travelTextDTO.offsetBottom) && this.isCentered == travelTextDTO.isCentered && this.stickyBehavior == travelTextDTO.stickyBehavior;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getOffsetBottom() {
        return this.offsetBottom;
    }

    public final Integer getOffsetHorizontal() {
        return this.offsetHorizontal;
    }

    public final Integer getOffsetTop() {
        return this.offsetTop;
    }

    public final StickyBehavior getStickyBehavior() {
        return this.stickyBehavior;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.offsetHorizontal;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.offsetTop;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.offsetBottom;
        int a11 = C3532b.a((hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.isCentered);
        StickyBehavior stickyBehavior = this.stickyBehavior;
        return a11 + (stickyBehavior != null ? stickyBehavior.hashCode() : 0);
    }

    public final boolean isCentered() {
        return this.isCentered;
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.text;
        String str = this.backgroundColor;
        Integer num = this.offsetHorizontal;
        Integer num2 = this.offsetTop;
        Integer num3 = this.offsetBottom;
        boolean z11 = this.isCentered;
        StickyBehavior stickyBehavior = this.stickyBehavior;
        StringBuilder d11 = Bl.b.d("TravelTextDTO(text=", ", backgroundColor=", str, ", offsetHorizontal=", textAtom);
        c.e(d11, num, ", offsetTop=", num2, ", offsetBottom=");
        d11.append(num3);
        d11.append(", isCentered=");
        d11.append(z11);
        d11.append(", stickyBehavior=");
        d11.append(stickyBehavior);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ TravelTextDTO(TextAtom textAtom, String str, Integer num, Integer num2, Integer num3, boolean z11, StickyBehavior stickyBehavior, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, str, num, num2, num3, (i11 & 32) != 0 ? false : z11, stickyBehavior);
    }
}
