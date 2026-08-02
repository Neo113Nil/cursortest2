package ru.ozon.uni.atoms.data.icon;

import C.J;
import D40.c;
import De.C2859b;
import De.C2860c;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004abcdBß\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eBÕ\u0001\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001fJ\b\u0010A\u001a\u00020\u0012H\u0016JÙ\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010CJ\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010Q\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0017\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u001cHÆ\u0003Jæ\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010UJ\u0006\u0010V\u001a\u00020\u0012J\u0013\u0010W\u001a\u00020\u00052\b\u0010X\u001a\u0004\u0018\u00010YHÖ\u0003J\t\u0010Z\u001a\u00020\u0012HÖ\u0001J\t\u0010[\u001a\u00020\tHÖ\u0001J\u0016\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010&\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010&\u0012\u0004\b5\u0010#\u001a\u0004\b\u0013\u0010%R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010&\u001a\u0004\b6\u0010%R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0017\u0010>\u001a\u00020\u0007¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010#\u001a\u0004\b@\u0010(¨\u0006e"}, d2 = {"Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "size", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "hasShape", "", "shape", "Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;", "text", "", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "backgroundImage", "backgroundColor", "textColor", "textStyle", "borderColor", "borderWidth", "", "isBorderInside", "hasParanja", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "backgroundImageFitType", "Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;)V", "(Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getSize", "()Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "getHasShape$annotations", "()V", "getHasShape", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShape", "()Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;", "getText", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getBackgroundImage", "getBackgroundColor", "getTextColor", "getTextStyle", "getBorderColor", "getBorderWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isBorderInside$annotations", "getHasParanja", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getBackgroundImageFitType", "()Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;", "compatShape", "getCompatShape$annotations", "getCompatShape", "getItemType", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "(Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;)Lru/ozon/uni/atoms/data/icon/IconDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "IconSize", "IconShape", "ContentType", "FitType", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class IconDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<IconDTO> CREATOR = new Creator();
    private final String backgroundColor;
    private final String backgroundImage;

    @EnumNullFallback
    private final FitType backgroundImageFitType;
    private final String borderColor;
    private final Integer borderWidth;

    @NotNull
    private final transient IconShape compatShape;
    private final String context;
    private final Boolean hasParanja;
    private final Boolean hasShape;
    private final CommonAtomIconDTO icon;
    private final Boolean isBorderInside;

    @EnumNullFallback
    private final IconShape shape;

    @EnumNullFallback
    private final IconSize size;
    private final TestInfo testInfo;
    private final String text;
    private final String textColor;
    private final String textStyle;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/atoms/data/icon/IconDTO$ContentType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "GRAPHIC", "NONE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContentType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;
        public static final ContentType TEXT = new ContentType("TEXT", 0);
        public static final ContentType GRAPHIC = new ContentType("GRAPHIC", 1);
        public static final ContentType NONE = new ContentType("NONE", 2);

        private static final /* synthetic */ ContentType[] $values() {
            return new ContentType[]{TEXT, GRAPHIC, NONE};
        }

        static {
            ContentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ContentType(String str, int i11) {
        }

        @NotNull
        public static a<ContentType> getEntries() {
            return $ENTRIES;
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconDTO> {
        @Override // android.os.Parcelable.Creator
        public final IconDTO createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            LinkedHashMap linkedHashMap;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            IconSize valueOf4 = parcel2.readInt() == 0 ? null : IconSize.valueOf(parcel2.readString());
            if (parcel2.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel2.readInt() != 0);
            }
            IconShape valueOf5 = parcel2.readInt() == 0 ? null : IconShape.valueOf(parcel2.readString());
            String readString = parcel2.readString();
            CommonAtomIconDTO createFromParcel = parcel2.readInt() == 0 ? null : CommonAtomIconDTO.CREATOR.createFromParcel(parcel2);
            String readString2 = parcel2.readString();
            String readString3 = parcel2.readString();
            String readString4 = parcel2.readString();
            String readString5 = parcel2.readString();
            String readString6 = parcel2.readString();
            Integer valueOf6 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            if (parcel2.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            if (parcel2.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel2.readInt() != 0);
            }
            String readString7 = parcel2.readString();
            TestInfo createFromParcel2 = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
            if (parcel2.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel2.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(IconDTO.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new IconDTO(valueOf4, valueOf, valueOf5, readString, createFromParcel, readString2, readString3, readString4, readString5, readString6, valueOf6, valueOf2, valueOf3, readString7, createFromParcel2, linkedHashMap, parcel.readInt() != 0 ? FitType.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final IconDTO[] newArray(int i11) {
            return new IconDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/atoms/data/icon/IconDTO$FitType;", "", "<init>", "(Ljava/lang/String;I)V", "FILL_CENTER", "FIT_CENTER", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FitType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FitType[] $VALUES;
        public static final FitType FILL_CENTER = new FitType("FILL_CENTER", 0);
        public static final FitType FIT_CENTER = new FitType("FIT_CENTER", 1);

        private static final /* synthetic */ FitType[] $values() {
            return new FitType[]{FILL_CENTER, FIT_CENTER};
        }

        static {
            FitType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FitType(String str, int i11) {
        }

        @NotNull
        public static a<FitType> getEntries() {
            return $ENTRIES;
        }

        public static FitType valueOf(String str) {
            return (FitType) Enum.valueOf(FitType.class, str);
        }

        public static FitType[] values() {
            return (FitType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/atoms/data/icon/IconDTO$IconShape;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "SQUIRCLE", "SHAPE_NONE", "SHAPE_SQUIRCLE_FORCE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconShape {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconShape[] $VALUES;
        public static final IconShape CIRCLE = new IconShape("CIRCLE", 0);
        public static final IconShape SQUIRCLE = new IconShape("SQUIRCLE", 1);
        public static final IconShape SHAPE_NONE = new IconShape("SHAPE_NONE", 2);
        public static final IconShape SHAPE_SQUIRCLE_FORCE = new IconShape("SHAPE_SQUIRCLE_FORCE", 3);

        private static final /* synthetic */ IconShape[] $values() {
            return new IconShape[]{CIRCLE, SQUIRCLE, SHAPE_NONE, SHAPE_SQUIRCLE_FORCE};
        }

        static {
            IconShape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconShape(String str, int i11) {
        }

        @NotNull
        public static a<IconShape> getEntries() {
            return $ENTRIES;
        }

        public static IconShape valueOf(String str) {
            return (IconShape) Enum.valueOf(IconShape.class, str);
        }

        public static IconShape[] values() {
            return (IconShape[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/atoms/data/icon/IconDTO$IconSize;", "", "size", "", "sizeShape", "padding", "borderWidth", "cornerRadius", "<init>", "(Ljava/lang/String;IIIIII)V", "getSize", "()I", "getSizeShape", "getPadding", "getBorderWidth", "getCornerRadius", "SIZE_200", "SIZE_300", "SIZE_400", "SIZE_500", "SIZE_600", "SIZE_700", "SIZE_800", "SIZE_900", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconSize[] $VALUES;
        public static final IconSize SIZE_200 = new IconSize("SIZE_200", 0, 12, 16, 2, 1, 4);
        public static final IconSize SIZE_300 = new IconSize("SIZE_300", 1, 16, 24, 2, 2, 6);
        public static final IconSize SIZE_400 = new IconSize("SIZE_400", 2, 20, 32, 4, 2, 10);
        public static final IconSize SIZE_500 = new IconSize("SIZE_500", 3, 24, 44, 6, 2, 12);
        public static final IconSize SIZE_600 = new IconSize("SIZE_600", 4, 32, 56, 8, 2, 16);
        public static final IconSize SIZE_700 = new IconSize("SIZE_700", 5, 40, 72, 10, 2, 20);
        public static final IconSize SIZE_800 = new IconSize("SIZE_800", 6, 48, 88, 12, 3, 24);
        public static final IconSize SIZE_900 = new IconSize("SIZE_900", 7, 64, 112, 16, 4, 32);
        private final int borderWidth;
        private final int cornerRadius;
        private final int padding;
        private final int size;
        private final int sizeShape;

        private static final /* synthetic */ IconSize[] $values() {
            return new IconSize[]{SIZE_200, SIZE_300, SIZE_400, SIZE_500, SIZE_600, SIZE_700, SIZE_800, SIZE_900};
        }

        static {
            IconSize[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconSize(String str, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.size = i12;
            this.sizeShape = i13;
            this.padding = i14;
            this.borderWidth = i15;
            this.cornerRadius = i16;
        }

        @NotNull
        public static a<IconSize> getEntries() {
            return $ENTRIES;
        }

        public static IconSize valueOf(String str) {
            return (IconSize) Enum.valueOf(IconSize.class, str);
        }

        public static IconSize[] values() {
            return (IconSize[]) $VALUES.clone();
        }

        public final int getBorderWidth() {
            return this.borderWidth;
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getSize() {
            return this.size;
        }

        public final int getSizeShape() {
            return this.sizeShape;
        }
    }

    public IconDTO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ IconDTO copy$default(IconDTO iconDTO, IconSize iconSize, Boolean bool, IconShape iconShape, String str, CommonAtomIconDTO commonAtomIconDTO, String str2, String str3, String str4, String str5, String str6, Integer num, Boolean bool2, Boolean bool3, String str7, TestInfo testInfo, Map map, FitType fitType, int i11, Object obj) {
        FitType fitType2;
        Map map2;
        IconSize iconSize2;
        IconDTO iconDTO2;
        TestInfo testInfo2;
        Boolean bool4;
        IconShape iconShape2;
        String str8;
        CommonAtomIconDTO commonAtomIconDTO2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Integer num2;
        Boolean bool5;
        Boolean bool6;
        String str14;
        IconSize iconSize3 = (i11 & 1) != 0 ? iconDTO.size : iconSize;
        Boolean bool7 = (i11 & 2) != 0 ? iconDTO.hasShape : bool;
        IconShape iconShape3 = (i11 & 4) != 0 ? iconDTO.shape : iconShape;
        String str15 = (i11 & 8) != 0 ? iconDTO.text : str;
        CommonAtomIconDTO commonAtomIconDTO3 = (i11 & 16) != 0 ? iconDTO.icon : commonAtomIconDTO;
        String str16 = (i11 & 32) != 0 ? iconDTO.backgroundImage : str2;
        String str17 = (i11 & 64) != 0 ? iconDTO.backgroundColor : str3;
        String str18 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iconDTO.textColor : str4;
        String str19 = (i11 & 256) != 0 ? iconDTO.textStyle : str5;
        String str20 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iconDTO.borderColor : str6;
        Integer num3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iconDTO.borderWidth : num;
        Boolean bool8 = (i11 & 2048) != 0 ? iconDTO.isBorderInside : bool2;
        Boolean bool9 = (i11 & 4096) != 0 ? iconDTO.hasParanja : bool3;
        String str21 = (i11 & 8192) != 0 ? iconDTO.context : str7;
        IconSize iconSize4 = iconSize3;
        TestInfo testInfo3 = (i11 & 16384) != 0 ? iconDTO.testInfo : testInfo;
        Map map3 = (i11 & 32768) != 0 ? iconDTO.trackingInfo : map;
        if ((i11 & 65536) != 0) {
            map2 = map3;
            fitType2 = iconDTO.backgroundImageFitType;
            testInfo2 = testInfo3;
            bool4 = bool7;
            iconShape2 = iconShape3;
            str8 = str15;
            commonAtomIconDTO2 = commonAtomIconDTO3;
            str9 = str16;
            str10 = str17;
            str11 = str18;
            str12 = str19;
            str13 = str20;
            num2 = num3;
            bool5 = bool8;
            bool6 = bool9;
            str14 = str21;
            iconSize2 = iconSize4;
            iconDTO2 = iconDTO;
        } else {
            fitType2 = fitType;
            map2 = map3;
            iconSize2 = iconSize4;
            iconDTO2 = iconDTO;
            testInfo2 = testInfo3;
            bool4 = bool7;
            iconShape2 = iconShape3;
            str8 = str15;
            commonAtomIconDTO2 = commonAtomIconDTO3;
            str9 = str16;
            str10 = str17;
            str11 = str18;
            str12 = str19;
            str13 = str20;
            num2 = num3;
            bool5 = bool8;
            bool6 = bool9;
            str14 = str21;
        }
        return iconDTO2.copy(iconSize2, bool4, iconShape2, str8, commonAtomIconDTO2, str9, str10, str11, str12, str13, num2, bool5, bool6, str14, testInfo2, map2, fitType2);
    }

    public static /* synthetic */ void getCompatShape$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getHasShape$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void isBorderInside$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final IconSize getSize() {
        return this.size;
    }

    /* renamed from: component10, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getBorderWidth() {
        return this.borderWidth;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getIsBorderInside() {
        return this.isBorderInside;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getHasParanja() {
        return this.hasParanja;
    }

    /* renamed from: component14, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component15, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component16() {
        return this.trackingInfo;
    }

    /* renamed from: component17, reason: from getter */
    public final FitType getBackgroundImageFitType() {
        return this.backgroundImageFitType;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasShape() {
        return this.hasShape;
    }

    /* renamed from: component3, reason: from getter */
    public final IconShape getShape() {
        return this.shape;
    }

    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonAtomIconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    public final IconDTO copy(IconSize size, Boolean hasShape, IconShape shape, String text, CommonAtomIconDTO icon, String backgroundImage, String backgroundColor, String textColor, String textStyle, String borderColor, Integer borderWidth, Boolean isBorderInside, Boolean hasParanja, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, FitType backgroundImageFitType) {
        return new IconDTO(size, hasShape, shape, text, icon, backgroundImage, backgroundColor, textColor, textStyle, borderColor, borderWidth, isBorderInside, hasParanja, context, testInfo, trackingInfo, backgroundImageFitType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconDTO)) {
            return false;
        }
        IconDTO iconDTO = (IconDTO) other;
        return this.size == iconDTO.size && Intrinsics.d(this.hasShape, iconDTO.hasShape) && this.shape == iconDTO.shape && Intrinsics.d(this.text, iconDTO.text) && Intrinsics.d(this.icon, iconDTO.icon) && Intrinsics.d(this.backgroundImage, iconDTO.backgroundImage) && Intrinsics.d(this.backgroundColor, iconDTO.backgroundColor) && Intrinsics.d(this.textColor, iconDTO.textColor) && Intrinsics.d(this.textStyle, iconDTO.textStyle) && Intrinsics.d(this.borderColor, iconDTO.borderColor) && Intrinsics.d(this.borderWidth, iconDTO.borderWidth) && Intrinsics.d(this.isBorderInside, iconDTO.isBorderInside) && Intrinsics.d(this.hasParanja, iconDTO.hasParanja) && Intrinsics.d(this.context, iconDTO.context) && Intrinsics.d(this.testInfo, iconDTO.testInfo) && Intrinsics.d(this.trackingInfo, iconDTO.trackingInfo) && this.backgroundImageFitType == iconDTO.backgroundImageFitType;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final FitType getBackgroundImageFitType() {
        return this.backgroundImageFitType;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final Integer getBorderWidth() {
        return this.borderWidth;
    }

    @NotNull
    public final IconShape getCompatShape() {
        return this.compatShape;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public final Boolean getHasParanja() {
        return this.hasParanja;
    }

    public final Boolean getHasShape() {
        return this.hasShape;
    }

    public final CommonAtomIconDTO getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.icon;
    }

    public final IconShape getShape() {
        return this.shape;
    }

    public final IconSize getSize() {
        return this.size;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTextStyle() {
        return this.textStyle;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        IconSize iconSize = this.size;
        int hashCode = (iconSize == null ? 0 : iconSize.hashCode()) * 31;
        Boolean bool = this.hasShape;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        IconShape iconShape = this.shape;
        int hashCode3 = (hashCode2 + (iconShape == null ? 0 : iconShape.hashCode())) * 31;
        String str = this.text;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CommonAtomIconDTO commonAtomIconDTO = this.icon;
        int hashCode5 = (hashCode4 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        String str2 = this.backgroundImage;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColor;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.textStyle;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.borderColor;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.borderWidth;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.isBorderInside;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasParanja;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str7 = this.context;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode15 = (hashCode14 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode16 = (hashCode15 + (map == null ? 0 : map.hashCode())) * 31;
        FitType fitType = this.backgroundImageFitType;
        return hashCode16 + (fitType != null ? fitType.hashCode() : 0);
    }

    public final Boolean isBorderInside() {
        return this.isBorderInside;
    }

    @NotNull
    public String toString() {
        IconSize iconSize = this.size;
        Boolean bool = this.hasShape;
        IconShape iconShape = this.shape;
        String str = this.text;
        CommonAtomIconDTO commonAtomIconDTO = this.icon;
        String str2 = this.backgroundImage;
        String str3 = this.backgroundColor;
        String str4 = this.textColor;
        String str5 = this.textStyle;
        String str6 = this.borderColor;
        Integer num = this.borderWidth;
        Boolean bool2 = this.isBorderInside;
        Boolean bool3 = this.hasParanja;
        String str7 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        FitType fitType = this.backgroundImageFitType;
        StringBuilder sb2 = new StringBuilder("IconDTO(size=");
        sb2.append(iconSize);
        sb2.append(", hasShape=");
        sb2.append(bool);
        sb2.append(", shape=");
        sb2.append(iconShape);
        sb2.append(", text=");
        sb2.append(str);
        sb2.append(", icon=");
        sb2.append(commonAtomIconDTO);
        sb2.append(", backgroundImage=");
        sb2.append(str2);
        sb2.append(", backgroundColor=");
        Nh.a.h(sb2, str3, ", textColor=", str4, ", textStyle=");
        Nh.a.h(sb2, str5, ", borderColor=", str6, ", borderWidth=");
        C2860c.f(bool2, num, ", isBorderInside=", ", hasParanja=", sb2);
        HY.b.c(bool3, ", context=", str7, ", testInfo=", sb2);
        sb2.append(testInfo);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", backgroundImageFitType=");
        sb2.append(fitType);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        IconSize iconSize = this.size;
        if (iconSize == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconSize.name());
        }
        Boolean bool = this.hasShape;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool);
        }
        IconShape iconShape = this.shape;
        if (iconShape == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconShape.name());
        }
        dest.writeString(this.text);
        CommonAtomIconDTO commonAtomIconDTO = this.icon;
        if (commonAtomIconDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonAtomIconDTO.writeToParcel(dest, flags);
        }
        dest.writeString(this.backgroundImage);
        dest.writeString(this.backgroundColor);
        dest.writeString(this.textColor);
        dest.writeString(this.textStyle);
        dest.writeString(this.borderColor);
        Integer num = this.borderWidth;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        Boolean bool2 = this.isBorderInside;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool2);
        }
        Boolean bool3 = this.hasParanja;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            c.c(dest, 1, bool3);
        }
        dest.writeString(this.context);
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        FitType fitType = this.backgroundImageFitType;
        if (fitType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fitType.name());
        }
    }

    public /* synthetic */ IconDTO(IconSize iconSize, Boolean bool, IconShape iconShape, String str, CommonAtomIconDTO commonAtomIconDTO, String str2, String str3, String str4, String str5, String str6, Integer num, Boolean bool2, Boolean bool3, String str7, TestInfo testInfo, Map map, FitType fitType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IconSize.SIZE_500 : iconSize, (i11 & 2) != 0 ? Boolean.TRUE : bool, (i11 & 4) != 0 ? null : iconShape, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : commonAtomIconDTO, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : num, (i11 & 2048) != 0 ? Boolean.TRUE : bool2, (i11 & 4096) != 0 ? Boolean.FALSE : bool3, (i11 & 8192) != 0 ? null : str7, (i11 & 16384) != 0 ? null : testInfo, (i11 & 32768) != 0 ? null : map, (i11 & 65536) != 0 ? FitType.FILL_CENTER : fitType);
    }

    @InterfaceC3999a
    @NotNull
    public final IconDTO copy(IconSize size, Boolean hasShape, IconShape shape, String text, CommonAtomIconDTO icon, String backgroundImage, String backgroundColor, String textColor, String textStyle, String borderColor, Integer borderWidth, Boolean isBorderInside, Boolean hasParanja, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return copy(size, hasShape, shape, text, icon, backgroundImage, backgroundColor, textColor, textStyle, borderColor, borderWidth, isBorderInside, hasParanja, context, testInfo, trackingInfo, this.backgroundImageFitType);
    }

    public IconDTO(IconSize iconSize, Boolean bool, IconShape iconShape, String str, CommonAtomIconDTO commonAtomIconDTO, String str2, String str3, String str4, String str5, String str6, Integer num, Boolean bool2, Boolean bool3, String str7, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, FitType fitType) {
        super(DsAtomsType.ICON, str7, map, testInfo);
        this.size = iconSize;
        this.hasShape = bool;
        this.shape = iconShape;
        this.text = str;
        this.icon = commonAtomIconDTO;
        this.backgroundImage = str2;
        this.backgroundColor = str3;
        this.textColor = str4;
        this.textStyle = str5;
        this.borderColor = str6;
        this.borderWidth = num;
        this.isBorderInside = bool2;
        this.hasParanja = bool3;
        this.context = str7;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.backgroundImageFitType = fitType;
        this.compatShape = iconShape == null ? Intrinsics.d(bool, Boolean.FALSE) ? IconShape.SHAPE_NONE : IconShape.SQUIRCLE : iconShape;
    }

    public /* synthetic */ IconDTO(IconSize iconSize, Boolean bool, IconShape iconShape, String str, CommonAtomIconDTO commonAtomIconDTO, String str2, String str3, String str4, String str5, String str6, Integer num, Boolean bool2, Boolean bool3, String str7, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IconSize.SIZE_500 : iconSize, (i11 & 2) != 0 ? Boolean.TRUE : bool, (i11 & 4) != 0 ? null : iconShape, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : commonAtomIconDTO, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : num, (i11 & 2048) != 0 ? Boolean.TRUE : bool2, (i11 & 4096) != 0 ? Boolean.FALSE : bool3, (i11 & 8192) != 0 ? null : str7, (i11 & 16384) != 0 ? null : testInfo, (i11 & 32768) != 0 ? null : map);
    }

    public IconDTO(IconSize iconSize, Boolean bool, IconShape iconShape, String str, CommonAtomIconDTO commonAtomIconDTO, String str2, String str3, String str4, String str5, String str6, Integer num, Boolean bool2, Boolean bool3, String str7, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        this(iconSize, bool, iconShape, str, commonAtomIconDTO, str2, str3, str4, str5, str6, num, bool2, bool3, str7, testInfo, map, FitType.FILL_CENTER);
    }
}
