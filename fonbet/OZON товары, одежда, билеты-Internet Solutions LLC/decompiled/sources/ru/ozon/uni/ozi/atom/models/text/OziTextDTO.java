package ru.ozon.uni.ozi.atom.models.text;

import B0.C2454a;
import C.J;
import De.C2859b;
import N3.C3660k;
import T7.P;
import Ul.C4070a;
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
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.ozi.atom.models.OziAtomsType;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002FGB©\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010+\u001a\u00020\u0006H\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u00ad\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0001J\u0006\u0010:\u001a\u00020\u0006J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\u0006HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006H"}, d2 = {"Lru/ozon/uni/ozi/atom/models/text/OziTextDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "", "textColor", "maxLines", "", "textAlignment", "Lru/ozon/uni/ozi/atom/models/text/OziTextDTO$TextAlignment;", "preset", "Lru/ozon/uni/ozi/atom/models/text/OziTextDTO$TextPreset;", "typographyToken", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILru/ozon/uni/ozi/atom/models/text/OziTextDTO$TextAlignment;Lru/ozon/uni/ozi/atom/models/text/OziTextDTO$TextPreset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getTextColor", "getMaxLines", "()I", "getTextAlignment", "()Lru/ozon/uni/ozi/atom/models/text/OziTextDTO$TextAlignment;", "getPreset", "()Lru/ozon/uni/ozi/atom/models/text/OziTextDTO$TextPreset;", "getTypographyToken", "getTopPadding", "getBottomPadding", "getLeftPadding", "getRightPadding", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TextAlignment", "TextPreset", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OziTextDTO extends AtomDTO {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OziTextDTO> CREATOR = new Creator();
    private final String bottomPadding;
    private final String context;
    private final String leftPadding;
    private final int maxLines;
    private final TextPreset preset;
    private final String rightPadding;
    private final TestInfo testInfo;

    @NotNull
    private final String text;
    private final TextAlignment textAlignment;
    private final String textColor;
    private final String topPadding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String typographyToken;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OziTextDTO> {
        @Override // android.os.Parcelable.Creator
        public final OziTextDTO createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel2.readString();
            String readString2 = parcel2.readString();
            int readInt = parcel2.readInt();
            LinkedHashMap linkedHashMap = null;
            TextAlignment valueOf = parcel2.readInt() == 0 ? null : TextAlignment.valueOf(parcel2.readString());
            TextPreset valueOf2 = parcel2.readInt() == 0 ? null : TextPreset.valueOf(parcel2.readString());
            String readString3 = parcel2.readString();
            String readString4 = parcel2.readString();
            TextAlignment textAlignment = valueOf;
            String readString5 = parcel2.readString();
            TextPreset textPreset = valueOf2;
            String readString6 = parcel2.readString();
            String readString7 = parcel2.readString();
            String readString8 = parcel2.readString();
            TestInfo createFromParcel = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
            if (parcel2.readInt() != 0) {
                int readInt2 = parcel2.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                int i11 = 0;
                while (i11 != readInt2) {
                    i11 = C2859b.a(OziTextDTO.class, parcel2, linkedHashMap, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                    readInt2 = readInt2;
                }
            }
            return new OziTextDTO(readString, readString2, readInt, textAlignment, textPreset, readString3, readString4, readString5, readString6, readString7, readString8, createFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final OziTextDTO[] newArray(int i11) {
            return new OziTextDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/ozi/atom/models/text/OziTextDTO$TextAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "LEADING", "CENTER", "TRAILING", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextAlignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TextAlignment[] $VALUES;
        public static final TextAlignment LEADING = new TextAlignment("LEADING", 0);
        public static final TextAlignment CENTER = new TextAlignment("CENTER", 1);
        public static final TextAlignment TRAILING = new TextAlignment("TRAILING", 2);

        private static final /* synthetic */ TextAlignment[] $values() {
            return new TextAlignment[]{LEADING, CENTER, TRAILING};
        }

        static {
            TextAlignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TextAlignment(String str, int i11) {
        }

        public static TextAlignment valueOf(String str) {
            return (TextAlignment) Enum.valueOf(TextAlignment.class, str);
        }

        public static TextAlignment[] values() {
            return (TextAlignment[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/ozi/atom/models/text/OziTextDTO$TextPreset;", "", "<init>", "(Ljava/lang/String;I)V", "H1", "H2", "H3", "H4", "PARAGRAPH", "PARAGRAPH_COMPACT", "UI_H1", "UI_H2", "UI_H2_COMPACT", "PRESET_CUSTOM", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextPreset {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TextPreset[] $VALUES;

        /* renamed from: H1, reason: collision with root package name */
        public static final TextPreset f97940H1 = new TextPreset("H1", 0);

        /* renamed from: H2, reason: collision with root package name */
        public static final TextPreset f97941H2 = new TextPreset("H2", 1);

        /* renamed from: H3, reason: collision with root package name */
        public static final TextPreset f97942H3 = new TextPreset("H3", 2);

        /* renamed from: H4, reason: collision with root package name */
        public static final TextPreset f97943H4 = new TextPreset("H4", 3);
        public static final TextPreset PARAGRAPH = new TextPreset("PARAGRAPH", 4);
        public static final TextPreset PARAGRAPH_COMPACT = new TextPreset("PARAGRAPH_COMPACT", 5);
        public static final TextPreset UI_H1 = new TextPreset("UI_H1", 6);
        public static final TextPreset UI_H2 = new TextPreset("UI_H2", 7);
        public static final TextPreset UI_H2_COMPACT = new TextPreset("UI_H2_COMPACT", 8);
        public static final TextPreset PRESET_CUSTOM = new TextPreset("PRESET_CUSTOM", 9);

        private static final /* synthetic */ TextPreset[] $values() {
            return new TextPreset[]{f97940H1, f97941H2, f97942H3, f97943H4, PARAGRAPH, PARAGRAPH_COMPACT, UI_H1, UI_H2, UI_H2_COMPACT, PRESET_CUSTOM};
        }

        static {
            TextPreset[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TextPreset(String str, int i11) {
        }

        public static TextPreset valueOf(String str) {
            return (TextPreset) Enum.valueOf(TextPreset.class, str);
        }

        public static TextPreset[] values() {
            return (TextPreset[]) $VALUES.clone();
        }
    }

    public /* synthetic */ OziTextDTO(String str, String str2, int i11, TextAlignment textAlignment, TextPreset textPreset, String str3, String str4, String str5, String str6, String str7, String str8, TestInfo testInfo, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? Integer.MAX_VALUE : i11, (i12 & 8) != 0 ? null : textAlignment, (i12 & 16) != 0 ? null : textPreset, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : str4, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i12 & 256) != 0 ? null : str6, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str7, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str8, (i12 & 2048) != 0 ? null : testInfo, (i12 & 4096) != 0 ? null : map);
    }

    public static /* synthetic */ OziTextDTO copy$default(OziTextDTO oziTextDTO, String str, String str2, int i11, TextAlignment textAlignment, TextPreset textPreset, String str3, String str4, String str5, String str6, String str7, String str8, TestInfo testInfo, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = oziTextDTO.text;
        }
        return oziTextDTO.copy(str, (i12 & 2) != 0 ? oziTextDTO.textColor : str2, (i12 & 4) != 0 ? oziTextDTO.maxLines : i11, (i12 & 8) != 0 ? oziTextDTO.textAlignment : textAlignment, (i12 & 16) != 0 ? oziTextDTO.preset : textPreset, (i12 & 32) != 0 ? oziTextDTO.typographyToken : str3, (i12 & 64) != 0 ? oziTextDTO.topPadding : str4, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oziTextDTO.bottomPadding : str5, (i12 & 256) != 0 ? oziTextDTO.leftPadding : str6, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oziTextDTO.rightPadding : str7, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oziTextDTO.context : str8, (i12 & 2048) != 0 ? oziTextDTO.testInfo : testInfo, (i12 & 4096) != 0 ? oziTextDTO.trackingInfo : map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRightPadding() {
        return this.rightPadding;
    }

    /* renamed from: component11, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component12, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component13() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAlignment getTextAlignment() {
        return this.textAlignment;
    }

    /* renamed from: component5, reason: from getter */
    public final TextPreset getPreset() {
        return this.preset;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTypographyToken() {
        return this.typographyToken;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final OziTextDTO copy(@NotNull String text, String textColor, int maxLines, TextAlignment textAlignment, TextPreset preset, String typographyToken, String topPadding, String bottomPadding, String leftPadding, String rightPadding, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new OziTextDTO(text, textColor, maxLines, textAlignment, preset, typographyToken, topPadding, bottomPadding, leftPadding, rightPadding, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OziTextDTO)) {
            return false;
        }
        OziTextDTO oziTextDTO = (OziTextDTO) other;
        return Intrinsics.d(this.text, oziTextDTO.text) && Intrinsics.d(this.textColor, oziTextDTO.textColor) && this.maxLines == oziTextDTO.maxLines && this.textAlignment == oziTextDTO.textAlignment && this.preset == oziTextDTO.preset && Intrinsics.d(this.typographyToken, oziTextDTO.typographyToken) && Intrinsics.d(this.topPadding, oziTextDTO.topPadding) && Intrinsics.d(this.bottomPadding, oziTextDTO.bottomPadding) && Intrinsics.d(this.leftPadding, oziTextDTO.leftPadding) && Intrinsics.d(this.rightPadding, oziTextDTO.rightPadding) && Intrinsics.d(this.context, oziTextDTO.context) && Intrinsics.d(this.testInfo, oziTextDTO.testInfo) && Intrinsics.d(this.trackingInfo, oziTextDTO.trackingInfo);
    }

    public final String getBottomPadding() {
        return this.bottomPadding;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.oziText;
    }

    public final String getLeftPadding() {
        return this.leftPadding;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final TextPreset getPreset() {
        return this.preset;
    }

    public final String getRightPadding() {
        return this.rightPadding;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final TextAlignment getTextAlignment() {
        return this.textAlignment;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTopPadding() {
        return this.topPadding;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getTypographyToken() {
        return this.typographyToken;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.textColor;
        int a11 = C2454a.a(this.maxLines, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        TextAlignment textAlignment = this.textAlignment;
        int hashCode2 = (a11 + (textAlignment == null ? 0 : textAlignment.hashCode())) * 31;
        TextPreset textPreset = this.preset;
        int hashCode3 = (hashCode2 + (textPreset == null ? 0 : textPreset.hashCode())) * 31;
        String str2 = this.typographyToken;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topPadding;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bottomPadding;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.leftPadding;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rightPadding;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.context;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode10 = (hashCode9 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode10 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.textColor;
        int i11 = this.maxLines;
        TextAlignment textAlignment = this.textAlignment;
        TextPreset textPreset = this.preset;
        String str3 = this.typographyToken;
        String str4 = this.topPadding;
        String str5 = this.bottomPadding;
        String str6 = this.leftPadding;
        String str7 = this.rightPadding;
        String str8 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("OziTextDTO(text=", str, ", textColor=", str2, ", maxLines=");
        d11.append(i11);
        d11.append(", textAlignment=");
        d11.append(textAlignment);
        d11.append(", preset=");
        d11.append(textPreset);
        d11.append(", typographyToken=");
        d11.append(str3);
        d11.append(", topPadding=");
        Nh.a.h(d11, str4, ", bottomPadding=", str5, ", leftPadding=");
        Nh.a.h(d11, str6, ", rightPadding=", str7, ", context=");
        C4070a.b(d11, str8, ", testInfo=", testInfo, ", trackingInfo=");
        return P.f(d11, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.textColor);
        dest.writeInt(this.maxLines);
        TextAlignment textAlignment = this.textAlignment;
        if (textAlignment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(textAlignment.name());
        }
        TextPreset textPreset = this.preset;
        if (textPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(textPreset.name());
        }
        dest.writeString(this.typographyToken);
        dest.writeString(this.topPadding);
        dest.writeString(this.bottomPadding);
        dest.writeString(this.leftPadding);
        dest.writeString(this.rightPadding);
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
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OziTextDTO(@NotNull String text, String str, int i11, TextAlignment textAlignment, TextPreset textPreset, String str2, String str3, String str4, String str5, String str6, String str7, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(OziAtomsType.OziText, str7, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.textColor = str;
        this.maxLines = i11;
        this.textAlignment = textAlignment;
        this.preset = textPreset;
        this.typographyToken = str2;
        this.topPadding = str3;
        this.bottomPadding = str4;
        this.leftPadding = str5;
        this.rightPadding = str6;
        this.context = str7;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
