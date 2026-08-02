package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model;

import Cm.e;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b%\b\u0080\b\u0018\u0000 E2\u00060\u0001j\u0002`\u0002:\u0003EFGBu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u001f\u0010\u0015\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b=\u00103R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010AR\u0011\u0010D\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "index", "", "id", "", "image", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "pixel", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "ratio", "impressionTokenizedEvent", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignOptions;", "designOptions", "<init>", "(IJLjava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Float;LWZ/t;Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignOptions;)V", "", "imageWasLoaded", "", "setImageWasLoaded", "(Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "J", "getId", "()J", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/util/List;", "getPixel", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/Float;", "getRatio", "()Ljava/lang/Float;", "getImpressionTokenizedEvent", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignOptions;", "getDesignOptions", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignOptions;", "Z", "getCanTrack", "()Z", "canTrack", "Companion", "DesignOptions", "DesignTypeVO", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AdvBannerV4ItemVO implements c {

    @NotNull
    private final AtomActionDTO action;
    private final BadgeDTO badge;

    @NotNull
    private final DesignOptions designOptions;
    private final long id;
    private final String image;
    private boolean imageWasLoaded;
    private final t impressionTokenizedEvent;
    private final int index;
    private final List<Pixel> pixel;
    private final Float ratio;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignOptions;", "", "", "topCornerRadius", "bottomCornerRadius", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTopCornerRadius", "getBottomCornerRadius", "Companion", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DesignOptions {
        private final int bottomCornerRadius;
        private final int topCornerRadius;

        public DesignOptions(int i11, int i12) {
            this.topCornerRadius = i11;
            this.bottomCornerRadius = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DesignOptions)) {
                return false;
            }
            DesignOptions designOptions = (DesignOptions) other;
            return this.topCornerRadius == designOptions.topCornerRadius && this.bottomCornerRadius == designOptions.bottomCornerRadius;
        }

        public final int getBottomCornerRadius() {
            return this.bottomCornerRadius;
        }

        public final int getTopCornerRadius() {
            return this.topCornerRadius;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottomCornerRadius) + (Integer.hashCode(this.topCornerRadius) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("DesignOptions(topCornerRadius=", this.topCornerRadius, ", bottomCornerRadius=", ")", this.bottomCornerRadius);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignTypeVO;", "", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignTypeVO$Type;", "type", "<init>", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignTypeVO$Type;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignTypeVO$Type;", "getType", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignTypeVO$Type;", "Type", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DesignTypeVO {

        @NotNull
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignTypeVO$Type;", "", "", "columnCount", "<init>", "(Ljava/lang/String;II)V", "I", "getColumnCount", "()I", "Companion", "PLAIN_1", FraudMonInfo.UNKNOWN, "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE;
            public static final Type PLAIN_1 = new Type("PLAIN_1", 0, 1);
            public static final Type UNKNOWN = new Type(FraudMonInfo.UNKNOWN, 1, 0, 1, null);
            private final int columnCount;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignTypeVO$Type$Companion;", "", "<init>", "()V", "fromString", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO$DesignTypeVO$Type;", "type", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final Type fromString(@NotNull String type) {
                    Intrinsics.checkNotNullParameter(type, "type");
                    return Intrinsics.d(type, "PLAIN1") ? Type.PLAIN_1 : Type.UNKNOWN;
                }

                private Companion() {
                }
            }

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{PLAIN_1, UNKNOWN};
            }

            static {
                Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
                INSTANCE = new Companion(null);
            }

            private Type(String str, int i11, int i12) {
                this.columnCount = i12;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            /* synthetic */ Type(String str, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i11, (i13 & 1) != 0 ? 0 : i12);
            }
        }

        public DesignTypeVO(@NotNull Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DesignTypeVO) && this.type == ((DesignTypeVO) other).type;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return "DesignTypeVO(type=" + this.type + ")";
        }
    }

    public AdvBannerV4ItemVO(int i11, long j11, String str, @NotNull AtomActionDTO action, t tVar, List<Pixel> list, BadgeDTO badgeDTO, Float f7, t tVar2, @NotNull DesignOptions designOptions) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(designOptions, "designOptions");
        this.index = i11;
        this.id = j11;
        this.image = str;
        this.action = action;
        this.tokenizedEvent = tVar;
        this.pixel = list;
        this.badge = badgeDTO;
        this.ratio = f7;
        this.impressionTokenizedEvent = tVar2;
        this.designOptions = designOptions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvBannerV4ItemVO)) {
            return false;
        }
        AdvBannerV4ItemVO advBannerV4ItemVO = (AdvBannerV4ItemVO) other;
        return this.index == advBannerV4ItemVO.index && this.id == advBannerV4ItemVO.id && Intrinsics.d(this.image, advBannerV4ItemVO.image) && Intrinsics.d(this.action, advBannerV4ItemVO.action) && Intrinsics.d(this.tokenizedEvent, advBannerV4ItemVO.tokenizedEvent) && Intrinsics.d(this.pixel, advBannerV4ItemVO.pixel) && Intrinsics.d(this.badge, advBannerV4ItemVO.badge) && Intrinsics.d(this.ratio, advBannerV4ItemVO.ratio) && Intrinsics.d(this.impressionTokenizedEvent, advBannerV4ItemVO.impressionTokenizedEvent) && Intrinsics.d(this.designOptions, advBannerV4ItemVO.designOptions);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final boolean getCanTrack() {
        return this.imageWasLoaded;
    }

    @NotNull
    public final DesignOptions getDesignOptions() {
        return this.designOptions;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final t getImpressionTokenizedEvent() {
        return this.impressionTokenizedEvent;
    }

    public final List<Pixel> getPixel() {
        return this.pixel;
    }

    public final Float getRatio() {
        return this.ratio;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Pk0.c.a(Integer.hashCode(this.index) * 31, 31, this.id);
        String str = this.image;
        int b11 = Ih.a.b(this.action, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31);
        t tVar = this.tokenizedEvent;
        int hashCode = (b11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<Pixel> list = this.pixel;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Float f7 = this.ratio;
        int hashCode4 = (hashCode3 + (f7 == null ? 0 : f7.hashCode())) * 31;
        t tVar2 = this.impressionTokenizedEvent;
        return this.designOptions.hashCode() + ((hashCode4 + (tVar2 != null ? tVar2.hashCode() : 0)) * 31);
    }

    public final void setImageWasLoaded(boolean imageWasLoaded) {
        this.imageWasLoaded = imageWasLoaded;
    }

    @NotNull
    public String toString() {
        return "AdvBannerV4ItemVO(index=" + this.index + ", id=" + this.id + ", image=" + this.image + ", action=" + this.action + ", tokenizedEvent=" + this.tokenizedEvent + ", pixel=" + this.pixel + ", badge=" + this.badge + ", ratio=" + this.ratio + ", impressionTokenizedEvent=" + this.impressionTokenizedEvent + ", designOptions=" + this.designOptions + ")";
    }
}
