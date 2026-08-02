package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model;

import Ak.C2436a;
import B0.C2454a;
import Cm.e;
import G.g;
import Kk.C3532b;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import spay.sdk.domain.model.FraudMonInfo;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b.\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u00062\u00060\u0007j\u0002`\b:\u0001[BÍ\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#\u0012\u0006\u0010&\u001a\u00020\u001e\u0012\u0006\u0010'\u001a\u00020\u001e¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b?\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b@\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\bD\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u00104\u001a\u0004\bE\u0010+R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u00104\u001a\u0004\bF\u0010+R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u00104\u001a\u0004\bG\u0010+R\u0017\u0010\u001a\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\bH\u0010+R\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\bI\u0010-R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010M\u001a\u0004\b\u001f\u0010NR\u001f\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!8\u0006¢\u0006\f\n\u0004\b\"\u0010O\u001a\u0004\bP\u0010QR\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b%\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b&\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010'\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010U\u001a\u0004\bX\u0010WR\u001a\u0010Y\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u00104\u001a\u0004\bZ\u0010+¨\u0006\\"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lru/ozon/app/android/composer/view/AppendBottom;", "Lm10/m;", "Lru/ozon/app/android/composer/view/KeepTop;", "Lm10/o;", "Lru/ozon/app/android/composer/view/WidgetComponent;", "", "index", "", "type", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;", "designType", "", "id", "serverId", "image", "link", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/UWDeeplink;", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "algorithm", "advId", "stateId", "positionInWidget", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "advBadge", "", "isImageBackgroundHidden", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "pixel", "needTopMargin", "needBottomMargin", "<init>", "(ILjava/lang/String;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/UWDeeplink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;LWZ/t;Ljava/util/List;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Ljava/lang/String;", "getType", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;", "getDesignType", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;", "J", "getId", "()J", "Ljava/lang/Long;", "getServerId", "()Ljava/lang/Long;", "getImage", "getLink", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/UWDeeplink;", "getDeeplink", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/UWDeeplink;", "getTitle", "getSubtitle", "getAlgorithm", "getAdvId", "getStateId", "getPositionInWidget", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAdvBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/util/List;", "getPixel", "()Ljava/util/List;", "Z", "getNeedTopMargin", "()Z", "getNeedBottomMargin", "widgetName", "getWidgetName", "DesignTypeVO", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ObjectItemVO implements c, InterfaceC8039a, m, o {
    private final BadgeDTO advBadge;
    private final String advId;
    private final String algorithm;
    private final UWDeeplink deeplink;

    @NotNull
    private final DesignTypeVO.Type designType;
    private final long id;
    private final String image;
    private final int index;
    private final Boolean isImageBackgroundHidden;
    private final String link;
    private final boolean needBottomMargin;
    private final boolean needTopMargin;
    private final List<Pixel> pixel;
    private final int positionInWidget;
    private final Long serverId;

    @NotNull
    private final String stateId;
    private final String subtitle;
    private final String title;
    private final t tokenizedEvent;
    private final String type;

    @NotNull
    private final String widgetName;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;", "type", "", "isFaded", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;", "getType", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;", "Z", "()Z", "Type", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DesignTypeVO {
        private final boolean isFaded;

        @NotNull
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;", "", "columnCount", "", "<init>", "(Ljava/lang/String;II)V", "getColumnCount", "()I", "GRID_1", "GRID_2", "GRID_3", "NAVI_2_G", FraudMonInfo.UNKNOWN, "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE;
            public static final Type GRID_1 = new Type("GRID_1", 0, 1);
            public static final Type GRID_2 = new Type("GRID_2", 1, 2);
            public static final Type GRID_3 = new Type("GRID_3", 2, 3);
            public static final Type NAVI_2_G = new Type("NAVI_2_G", 3, 2);
            public static final Type UNKNOWN = new Type(FraudMonInfo.UNKNOWN, 4, 0, 1, null);
            private final int columnCount;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type$Companion;", "", "<init>", "()V", "fromString", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO$DesignTypeVO$Type;", "type", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @NotNull
                public final Type fromString(@NotNull String type) {
                    Intrinsics.checkNotNullParameter(type, "type");
                    int hashCode = type.hashCode();
                    if (hashCode != 262004266) {
                        switch (hashCode) {
                            case 1942143548:
                                if (type.equals("object.grid1")) {
                                    return Type.GRID_1;
                                }
                                break;
                            case 1942143549:
                                if (type.equals("object.grid2")) {
                                    return Type.GRID_2;
                                }
                                break;
                            case 1942143550:
                                if (type.equals("object.grid3")) {
                                    return Type.GRID_3;
                                }
                                break;
                        }
                    } else if (type.equals("object.navi2g")) {
                        return Type.NAVI_2_G;
                    }
                    return Type.UNKNOWN;
                }

                private Companion() {
                }
            }

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{GRID_1, GRID_2, GRID_3, NAVI_2_G, UNKNOWN};
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

            public final int getColumnCount() {
                return this.columnCount;
            }

            /* synthetic */ Type(String str, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i11, (i13 & 1) != 0 ? 0 : i12);
            }
        }

        public DesignTypeVO(@NotNull Type type, boolean z11) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.isFaded = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DesignTypeVO)) {
                return false;
            }
            DesignTypeVO designTypeVO = (DesignTypeVO) other;
            return this.type == designTypeVO.type && this.isFaded == designTypeVO.isFaded;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFaded) + (this.type.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DesignTypeVO(type=" + this.type + ", isFaded=" + this.isFaded + ")";
        }
    }

    public ObjectItemVO(int i11, String str, @NotNull DesignTypeVO.Type designType, long j11, Long l11, String str2, String str3, UWDeeplink uWDeeplink, String str4, String str5, String str6, String str7, @NotNull String stateId, int i12, BadgeDTO badgeDTO, Boolean bool, t tVar, List<Pixel> list, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(designType, "designType");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        this.index = i11;
        this.type = str;
        this.designType = designType;
        this.id = j11;
        this.serverId = l11;
        this.image = str2;
        this.link = str3;
        this.deeplink = uWDeeplink;
        this.title = str4;
        this.subtitle = str5;
        this.algorithm = str6;
        this.advId = str7;
        this.stateId = stateId;
        this.positionInWidget = i12;
        this.advBadge = badgeDTO;
        this.isImageBackgroundHidden = bool;
        this.tokenizedEvent = tVar;
        this.pixel = list;
        this.needTopMargin = z11;
        this.needBottomMargin = z12;
        this.widgetName = stateId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObjectItemVO)) {
            return false;
        }
        ObjectItemVO objectItemVO = (ObjectItemVO) other;
        return this.index == objectItemVO.index && Intrinsics.d(this.type, objectItemVO.type) && this.designType == objectItemVO.designType && this.id == objectItemVO.id && Intrinsics.d(this.serverId, objectItemVO.serverId) && Intrinsics.d(this.image, objectItemVO.image) && Intrinsics.d(this.link, objectItemVO.link) && Intrinsics.d(this.deeplink, objectItemVO.deeplink) && Intrinsics.d(this.title, objectItemVO.title) && Intrinsics.d(this.subtitle, objectItemVO.subtitle) && Intrinsics.d(this.algorithm, objectItemVO.algorithm) && Intrinsics.d(this.advId, objectItemVO.advId) && Intrinsics.d(this.stateId, objectItemVO.stateId) && this.positionInWidget == objectItemVO.positionInWidget && Intrinsics.d(this.advBadge, objectItemVO.advBadge) && Intrinsics.d(this.isImageBackgroundHidden, objectItemVO.isImageBackgroundHidden) && Intrinsics.d(this.tokenizedEvent, objectItemVO.tokenizedEvent) && Intrinsics.d(this.pixel, objectItemVO.pixel) && this.needTopMargin == objectItemVO.needTopMargin && this.needBottomMargin == objectItemVO.needBottomMargin;
    }

    public final BadgeDTO getAdvBadge() {
        return this.advBadge;
    }

    public final UWDeeplink getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final DesignTypeVO.Type getDesignType() {
        return this.designType;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean getNeedBottomMargin() {
        return this.needBottomMargin;
    }

    public final boolean getNeedTopMargin() {
        return this.needTopMargin;
    }

    public final List<Pixel> getPixel() {
        return this.pixel;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getStateId() {
        return this.stateId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.index) * 31;
        String str = this.type;
        int a11 = Pk0.c.a((this.designType.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.id);
        Long l11 = this.serverId;
        int hashCode2 = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.image;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UWDeeplink uWDeeplink = this.deeplink;
        int hashCode5 = (hashCode4 + (uWDeeplink == null ? 0 : uWDeeplink.hashCode())) * 31;
        String str4 = this.title;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subtitle;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.algorithm;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.advId;
        int a12 = C2454a.a(this.positionInWidget, g.a((hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.stateId), 31);
        BadgeDTO badgeDTO = this.advBadge;
        int hashCode9 = (a12 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Boolean bool = this.isImageBackgroundHidden;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode11 = (hashCode10 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<Pixel> list = this.pixel;
        return Boolean.hashCode(this.needBottomMargin) + C3532b.a((hashCode11 + (list != null ? list.hashCode() : 0)) * 31, 31, this.needTopMargin);
    }

    /* renamed from: isImageBackgroundHidden, reason: from getter */
    public final Boolean getIsImageBackgroundHidden() {
        return this.isImageBackgroundHidden;
    }

    @NotNull
    public String toString() {
        int i11 = this.index;
        String str = this.type;
        DesignTypeVO.Type type = this.designType;
        long j11 = this.id;
        Long l11 = this.serverId;
        String str2 = this.image;
        String str3 = this.link;
        UWDeeplink uWDeeplink = this.deeplink;
        String str4 = this.title;
        String str5 = this.subtitle;
        String str6 = this.algorithm;
        String str7 = this.advId;
        String str8 = this.stateId;
        int i12 = this.positionInWidget;
        BadgeDTO badgeDTO = this.advBadge;
        Boolean bool = this.isImageBackgroundHidden;
        t tVar = this.tokenizedEvent;
        List<Pixel> list = this.pixel;
        boolean z11 = this.needTopMargin;
        boolean z12 = this.needBottomMargin;
        StringBuilder g10 = e.g(i11, "ObjectItemVO(index=", ", type=", str, ", designType=");
        g10.append(type);
        g10.append(", id=");
        g10.append(j11);
        g10.append(", serverId=");
        g10.append(l11);
        g10.append(", image=");
        g10.append(str2);
        g10.append(", link=");
        g10.append(str3);
        g10.append(", deeplink=");
        g10.append(uWDeeplink);
        Nh.a.h(g10, ", title=", str4, ", subtitle=", str5);
        Nh.a.h(g10, ", algorithm=", str6, ", advId=", str7);
        g10.append(", stateId=");
        g10.append(str8);
        g10.append(", positionInWidget=");
        g10.append(i12);
        g10.append(", advBadge=");
        g10.append(badgeDTO);
        g10.append(", isImageBackgroundHidden=");
        g10.append(bool);
        g10.append(", tokenizedEvent=");
        g10.append(tVar);
        g10.append(", pixel=");
        g10.append(list);
        C2436a.e(", needTopMargin=", ", needBottomMargin=", g10, z11, z12);
        g10.append(")");
        return g10.toString();
    }
}
