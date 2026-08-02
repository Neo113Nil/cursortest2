package ru.ozon.app.android.travel.feature.general.common.widgets.travelNavTitle.v3.data;

import Bk.C2638a;
import Xc.a;
import Xc.b;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001#BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelNavTitle/v3/data/TravelNavTitleV3DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subTitle", ImagesContract.URL, "", "backButtonTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "backButtonBehaviorType", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelNavTitle/v3/data/TravelNavTitleV3DTO$BackButtonBehaviorType;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/travel/feature/general/common/widgets/travelNavTitle/v3/data/TravelNavTitleV3DTO$BackButtonBehaviorType;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubTitle", "getUrl", "()Ljava/lang/String;", "getBackButtonTrackingInfo", "()Ljava/util/Map;", "getBackButtonBehaviorType", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelNavTitle/v3/data/TravelNavTitleV3DTO$BackButtonBehaviorType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "BackButtonBehaviorType", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelNavTitleV3DTO {
    public static final int $stable = 8;

    @EnumNullFallback
    @NotNull
    private final BackButtonBehaviorType backButtonBehaviorType;
    private final Map<String, TokenizedTrackingInfo> backButtonTrackingInfo;
    private final TextAtom subTitle;

    @NotNull
    private final TextAtom title;
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelNavTitle/v3/data/TravelNavTitleV3DTO$BackButtonBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "BACK", "BACK_WITH_FLOW", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackButtonBehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BackButtonBehaviorType[] $VALUES;

        @i(name = "BACK")
        public static final BackButtonBehaviorType BACK = new BackButtonBehaviorType("BACK", 0);

        @i(name = "BACK_WITH_FLOW")
        public static final BackButtonBehaviorType BACK_WITH_FLOW = new BackButtonBehaviorType("BACK_WITH_FLOW", 1);

        private static final /* synthetic */ BackButtonBehaviorType[] $values() {
            return new BackButtonBehaviorType[]{BACK, BACK_WITH_FLOW};
        }

        static {
            BackButtonBehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BackButtonBehaviorType(String str, int i11) {
        }

        public static BackButtonBehaviorType valueOf(String str) {
            return (BackButtonBehaviorType) Enum.valueOf(BackButtonBehaviorType.class, str);
        }

        public static BackButtonBehaviorType[] values() {
            return (BackButtonBehaviorType[]) $VALUES.clone();
        }
    }

    public TravelNavTitleV3DTO(@NotNull TextAtom title, TextAtom textAtom, String str, Map<String, TokenizedTrackingInfo> map, @NotNull BackButtonBehaviorType backButtonBehaviorType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backButtonBehaviorType, "backButtonBehaviorType");
        this.title = title;
        this.subTitle = textAtom;
        this.url = str;
        this.backButtonTrackingInfo = map;
        this.backButtonBehaviorType = backButtonBehaviorType;
    }

    public static /* synthetic */ TravelNavTitleV3DTO copy$default(TravelNavTitleV3DTO travelNavTitleV3DTO, TextAtom textAtom, TextAtom textAtom2, String str, Map map, BackButtonBehaviorType backButtonBehaviorType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = travelNavTitleV3DTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = travelNavTitleV3DTO.subTitle;
        }
        if ((i11 & 4) != 0) {
            str = travelNavTitleV3DTO.url;
        }
        if ((i11 & 8) != 0) {
            map = travelNavTitleV3DTO.backButtonTrackingInfo;
        }
        if ((i11 & 16) != 0) {
            backButtonBehaviorType = travelNavTitleV3DTO.backButtonBehaviorType;
        }
        BackButtonBehaviorType backButtonBehaviorType2 = backButtonBehaviorType;
        String str2 = str;
        return travelNavTitleV3DTO.copy(textAtom, textAtom2, str2, map, backButtonBehaviorType2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.backButtonTrackingInfo;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BackButtonBehaviorType getBackButtonBehaviorType() {
        return this.backButtonBehaviorType;
    }

    @NotNull
    public final TravelNavTitleV3DTO copy(@NotNull TextAtom title, TextAtom subTitle, String url, Map<String, TokenizedTrackingInfo> backButtonTrackingInfo, @NotNull BackButtonBehaviorType backButtonBehaviorType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backButtonBehaviorType, "backButtonBehaviorType");
        return new TravelNavTitleV3DTO(title, subTitle, url, backButtonTrackingInfo, backButtonBehaviorType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelNavTitleV3DTO)) {
            return false;
        }
        TravelNavTitleV3DTO travelNavTitleV3DTO = (TravelNavTitleV3DTO) other;
        return Intrinsics.d(this.title, travelNavTitleV3DTO.title) && Intrinsics.d(this.subTitle, travelNavTitleV3DTO.subTitle) && Intrinsics.d(this.url, travelNavTitleV3DTO.url) && Intrinsics.d(this.backButtonTrackingInfo, travelNavTitleV3DTO.backButtonTrackingInfo) && this.backButtonBehaviorType == travelNavTitleV3DTO.backButtonBehaviorType;
    }

    @NotNull
    public final BackButtonBehaviorType getBackButtonBehaviorType() {
        return this.backButtonBehaviorType;
    }

    public final Map<String, TokenizedTrackingInfo> getBackButtonTrackingInfo() {
        return this.backButtonTrackingInfo;
    }

    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.subTitle;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str = this.url;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.backButtonTrackingInfo;
        return this.backButtonBehaviorType.hashCode() + ((hashCode3 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subTitle;
        String str = this.url;
        Map<String, TokenizedTrackingInfo> map = this.backButtonTrackingInfo;
        BackButtonBehaviorType backButtonBehaviorType = this.backButtonBehaviorType;
        StringBuilder a11 = HY.a.a("TravelNavTitleV3DTO(title=", textAtom, ", subTitle=", textAtom2, ", url=");
        C2638a.e(a11, str, ", backButtonTrackingInfo=", map, ", backButtonBehaviorType=");
        a11.append(backButtonBehaviorType);
        a11.append(")");
        return a11.toString();
    }

    public /* synthetic */ TravelNavTitleV3DTO(TextAtom textAtom, TextAtom textAtom2, String str, Map map, BackButtonBehaviorType backButtonBehaviorType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, str, map, (i11 & 16) != 0 ? BackButtonBehaviorType.BACK_WITH_FLOW : backButtonBehaviorType);
    }
}
