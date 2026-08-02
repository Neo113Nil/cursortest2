package ru.ozon.app.android.commonwidgets.widgets.restrictions.data;

import G.g;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO;", "", "restrictions", "", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$WidgetRestrictionDTO;", "showOnceStrategy", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$ShowOnceStrategy;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$ShowOnceStrategy;)V", "getRestrictions", "()Ljava/util/List;", "getShowOnceStrategy", "()Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$ShowOnceStrategy;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WidgetRestrictionDTO", "ShowOnceStrategy", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RestrictionsDTO {

    @NotNull
    private final List<WidgetRestrictionDTO> restrictions;
    private final ShowOnceStrategy showOnceStrategy;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$ShowOnceStrategy;", "", "token", "", "lifetime", "Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$ShowOnceStrategy$Lifetime;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$ShowOnceStrategy$Lifetime;)V", "getToken", "()Ljava/lang/String;", "getLifetime", "()Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$ShowOnceStrategy$Lifetime;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Lifetime", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ShowOnceStrategy {

        @NotNull
        private final Lifetime lifetime;

        @NotNull
        private final String token;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$ShowOnceStrategy$Lifetime;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PER_APP", "PER_SCREEN", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Lifetime {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Lifetime[] $VALUES;

            @i(name = "perApp")
            public static final Lifetime PER_APP = new Lifetime("PER_APP", 0, "perApp");

            @i(name = "perScreen")
            public static final Lifetime PER_SCREEN = new Lifetime("PER_SCREEN", 1, "perScreen");

            @NotNull
            private final String value;

            private static final /* synthetic */ Lifetime[] $values() {
                return new Lifetime[]{PER_APP, PER_SCREEN};
            }

            static {
                Lifetime[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Lifetime(String str, int i11, String str2) {
                this.value = str2;
            }

            public static Lifetime valueOf(String str) {
                return (Lifetime) Enum.valueOf(Lifetime.class, str);
            }

            public static Lifetime[] values() {
                return (Lifetime[]) $VALUES.clone();
            }
        }

        public ShowOnceStrategy(@NotNull String token, @NotNull Lifetime lifetime) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(lifetime, "lifetime");
            this.token = token;
            this.lifetime = lifetime;
        }

        public static /* synthetic */ ShowOnceStrategy copy$default(ShowOnceStrategy showOnceStrategy, String str, Lifetime lifetime, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = showOnceStrategy.token;
            }
            if ((i11 & 2) != 0) {
                lifetime = showOnceStrategy.lifetime;
            }
            return showOnceStrategy.copy(str, lifetime);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Lifetime getLifetime() {
            return this.lifetime;
        }

        @NotNull
        public final ShowOnceStrategy copy(@NotNull String token, @NotNull Lifetime lifetime) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(lifetime, "lifetime");
            return new ShowOnceStrategy(token, lifetime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowOnceStrategy)) {
                return false;
            }
            ShowOnceStrategy showOnceStrategy = (ShowOnceStrategy) other;
            return Intrinsics.d(this.token, showOnceStrategy.token) && this.lifetime == showOnceStrategy.lifetime;
        }

        @NotNull
        public final Lifetime getLifetime() {
            return this.lifetime;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.lifetime.hashCode() + (this.token.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ShowOnceStrategy(token=" + this.token + ", lifetime=" + this.lifetime + ")";
        }
    }

    public RestrictionsDTO(@NotNull List<WidgetRestrictionDTO> restrictions, ShowOnceStrategy showOnceStrategy) {
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.restrictions = restrictions;
        this.showOnceStrategy = showOnceStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RestrictionsDTO copy$default(RestrictionsDTO restrictionsDTO, List list, ShowOnceStrategy showOnceStrategy, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = restrictionsDTO.restrictions;
        }
        if ((i11 & 2) != 0) {
            showOnceStrategy = restrictionsDTO.showOnceStrategy;
        }
        return restrictionsDTO.copy(list, showOnceStrategy);
    }

    @NotNull
    public final List<WidgetRestrictionDTO> component1() {
        return this.restrictions;
    }

    /* renamed from: component2, reason: from getter */
    public final ShowOnceStrategy getShowOnceStrategy() {
        return this.showOnceStrategy;
    }

    @NotNull
    public final RestrictionsDTO copy(@NotNull List<WidgetRestrictionDTO> restrictions, ShowOnceStrategy showOnceStrategy) {
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        return new RestrictionsDTO(restrictions, showOnceStrategy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictionsDTO)) {
            return false;
        }
        RestrictionsDTO restrictionsDTO = (RestrictionsDTO) other;
        return Intrinsics.d(this.restrictions, restrictionsDTO.restrictions) && Intrinsics.d(this.showOnceStrategy, restrictionsDTO.showOnceStrategy);
    }

    @NotNull
    public final List<WidgetRestrictionDTO> getRestrictions() {
        return this.restrictions;
    }

    public final ShowOnceStrategy getShowOnceStrategy() {
        return this.showOnceStrategy;
    }

    public int hashCode() {
        int hashCode = this.restrictions.hashCode() * 31;
        ShowOnceStrategy showOnceStrategy = this.showOnceStrategy;
        return hashCode + (showOnceStrategy == null ? 0 : showOnceStrategy.hashCode());
    }

    @NotNull
    public String toString() {
        return "RestrictionsDTO(restrictions=" + this.restrictions + ", showOnceStrategy=" + this.showOnceStrategy + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0089\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/data/RestrictionsDTO$WidgetRestrictionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "message", "image", "imageTintColor", "type", "lifetime", "action", "Lru/ozon/uni/android/flashbar/model/Restriction$Action;", "context", "progress", "Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/android/flashbar/model/Restriction$Action;Ljava/lang/String;Lru/ozon/uni/android/flashbar/model/Restriction$Progress;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getImage", "getImageTintColor", "getType", "getLifetime", "getAction", "()Lru/ozon/uni/android/flashbar/model/Restriction$Action;", "getContext", "getProgress", "()Lru/ozon/uni/android/flashbar/model/Restriction$Progress;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetRestrictionDTO {
        private final Restriction.Action action;
        private final String context;
        private final String image;
        private final String imageTintColor;
        private final String lifetime;

        @NotNull
        private final String message;
        private final Restriction.Progress progress;
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final String type;

        public WidgetRestrictionDTO(String str, @NotNull String message, String str2, String str3, @NotNull String type, String str4, Restriction.Action action, String str5, Restriction.Progress progress, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(type, "type");
            this.title = str;
            this.message = message;
            this.image = str2;
            this.imageTintColor = str3;
            this.type = type;
            this.lifetime = str4;
            this.action = action;
            this.context = str5;
            this.progress = progress;
            this.trackingInfo = map;
        }

        public static /* synthetic */ WidgetRestrictionDTO copy$default(WidgetRestrictionDTO widgetRestrictionDTO, String str, String str2, String str3, String str4, String str5, String str6, Restriction.Action action, String str7, Restriction.Progress progress, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = widgetRestrictionDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = widgetRestrictionDTO.message;
            }
            if ((i11 & 4) != 0) {
                str3 = widgetRestrictionDTO.image;
            }
            if ((i11 & 8) != 0) {
                str4 = widgetRestrictionDTO.imageTintColor;
            }
            if ((i11 & 16) != 0) {
                str5 = widgetRestrictionDTO.type;
            }
            if ((i11 & 32) != 0) {
                str6 = widgetRestrictionDTO.lifetime;
            }
            if ((i11 & 64) != 0) {
                action = widgetRestrictionDTO.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str7 = widgetRestrictionDTO.context;
            }
            if ((i11 & 256) != 0) {
                progress = widgetRestrictionDTO.progress;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = widgetRestrictionDTO.trackingInfo;
            }
            Restriction.Progress progress2 = progress;
            Map map2 = map;
            Restriction.Action action2 = action;
            String str8 = str7;
            String str9 = str5;
            String str10 = str6;
            return widgetRestrictionDTO.copy(str, str2, str3, str4, str9, str10, action2, str8, progress2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component4, reason: from getter */
        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component6, reason: from getter */
        public final String getLifetime() {
            return this.lifetime;
        }

        /* renamed from: component7, reason: from getter */
        public final Restriction.Action getAction() {
            return this.action;
        }

        /* renamed from: component8, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component9, reason: from getter */
        public final Restriction.Progress getProgress() {
            return this.progress;
        }

        @NotNull
        public final WidgetRestrictionDTO copy(String title, @NotNull String message, String image, String imageTintColor, @NotNull String type, String lifetime, Restriction.Action action, String context, Restriction.Progress progress, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(type, "type");
            return new WidgetRestrictionDTO(title, message, image, imageTintColor, type, lifetime, action, context, progress, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetRestrictionDTO)) {
                return false;
            }
            WidgetRestrictionDTO widgetRestrictionDTO = (WidgetRestrictionDTO) other;
            return Intrinsics.d(this.title, widgetRestrictionDTO.title) && Intrinsics.d(this.message, widgetRestrictionDTO.message) && Intrinsics.d(this.image, widgetRestrictionDTO.image) && Intrinsics.d(this.imageTintColor, widgetRestrictionDTO.imageTintColor) && Intrinsics.d(this.type, widgetRestrictionDTO.type) && Intrinsics.d(this.lifetime, widgetRestrictionDTO.lifetime) && Intrinsics.d(this.action, widgetRestrictionDTO.action) && Intrinsics.d(this.context, widgetRestrictionDTO.context) && Intrinsics.d(this.progress, widgetRestrictionDTO.progress) && Intrinsics.d(this.trackingInfo, widgetRestrictionDTO.trackingInfo);
        }

        public final Restriction.Action getAction() {
            return this.action;
        }

        public final String getContext() {
            return this.context;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        public final String getLifetime() {
            return this.lifetime;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final Restriction.Progress getProgress() {
            return this.progress;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.title;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
            String str2 = this.image;
            int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageTintColor;
            int a12 = g.a((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.type);
            String str4 = this.lifetime;
            int hashCode2 = (a12 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Restriction.Action action = this.action;
            int hashCode3 = (hashCode2 + (action == null ? 0 : action.hashCode())) * 31;
            String str5 = this.context;
            int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Restriction.Progress progress = this.progress;
            int hashCode5 = (hashCode4 + (progress == null ? 0 : progress.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.message;
            String str3 = this.image;
            String str4 = this.imageTintColor;
            String str5 = this.type;
            String str6 = this.lifetime;
            Restriction.Action action = this.action;
            String str7 = this.context;
            Restriction.Progress progress = this.progress;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("WidgetRestrictionDTO(title=", str, ", message=", str2, ", image=");
            Nh.a.h(d11, str3, ", imageTintColor=", str4, ", type=");
            Nh.a.h(d11, str5, ", lifetime=", str6, ", action=");
            d11.append(action);
            d11.append(", context=");
            d11.append(str7);
            d11.append(", progress=");
            d11.append(progress);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ WidgetRestrictionDTO(String str, String str2, String str3, String str4, String str5, String str6, Restriction.Action action, String str7, Restriction.Progress progress, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : action, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str7, (i11 & 256) != 0 ? null : progress, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map);
        }
    }
}
