package ru.ozon.app.android.atoms.data.common;

import Kk.C3532b;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.TestInfo;
import ru.ozon.app.android.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.app.android.atoms.utils.OzonSpannableString;
import ru.ozon.app.android.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002FGBm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,Jx\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b/\u0010 J\u0010\u00100\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u001a\u00102\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b8\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b9\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010(R\"\u0010\u0010\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010*\"\u0004\bB\u0010CR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010,¨\u0006H"}, d2 = {"Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "Landroid/os/Parcelable;", "", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "text", "", "textColor", "icon", "iconTintColor", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "iconPosition", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "truncatingMode", "", "numberOfLines", "", "tagSupported", "Lru/ozon/app/android/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;Ljava/lang/Integer;ZLru/ozon/app/android/atoms/data/TestInfo;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "component6", "()Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "component7", "()Ljava/lang/Integer;", "component8", "()Z", "component9", "()Lru/ozon/app/android/atoms/data/TestInfo;", "copy", "(Lru/ozon/app/android/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;Ljava/lang/Integer;ZLru/ozon/app/android/atoms/data/TestInfo;)Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "getText", "Ljava/lang/String;", "getTextColor", "getIcon", "getIconTintColor", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "getIconPosition", "Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTruncatingMode", "Ljava/lang/Integer;", "getNumberOfLines", "Z", "getTagSupported", "setTagSupported", "(Z)V", "Lru/ozon/app/android/atoms/data/TestInfo;", "getTestInfo", "IconPosition", "TruncatingMode", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommonAtomLabelDTO implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<CommonAtomLabelDTO> CREATOR = new Creator();
    private final String icon;

    @EnumNullFallback
    private final IconPosition iconPosition;
    private final String iconTintColor;
    private final Integer numberOfLines;
    private transient boolean tagSupported;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;
    private final String textColor;

    @EnumNullFallback
    private final TruncatingMode truncatingMode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CommonAtomLabelDTO> {
        @Override // android.os.Parcelable.Creator
        public final CommonAtomLabelDTO createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommonAtomLabelDTO(OzonSpannableStringParceler.INSTANCE.create(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : IconPosition.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TruncatingMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0 ? TestInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CommonAtomLabelDTO[] newArray(int i11) {
            return new CommonAtomLabelDTO[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$IconPosition;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconPosition[] $VALUES;
        public static final IconPosition START = new IconPosition("START", 0);
        public static final IconPosition END = new IconPosition("END", 1);

        private static final /* synthetic */ IconPosition[] $values() {
            return new IconPosition[]{START, END};
        }

        static {
            IconPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IconPosition(String str, int i11) {
        }

        @NotNull
        public static a<IconPosition> getEntries() {
            return $ENTRIES;
        }

        public static IconPosition valueOf(String str) {
            return (IconPosition) Enum.valueOf(IconPosition.class, str);
        }

        public static IconPosition[] values() {
            return (IconPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "", "<init>", "(Ljava/lang/String;I)V", "TAIL", "MIDDLE", "HEAD", "asTruncateAt", "Landroid/text/TextUtils$TruncateAt;", "getAsTruncateAt$design_system_release", "()Landroid/text/TextUtils$TruncateAt;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TruncatingMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TruncatingMode[] $VALUES;
        public static final TruncatingMode TAIL = new TruncatingMode("TAIL", 0);
        public static final TruncatingMode MIDDLE = new TruncatingMode("MIDDLE", 1);
        public static final TruncatingMode HEAD = new TruncatingMode("HEAD", 2);

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TruncatingMode.values().length];
                try {
                    iArr[TruncatingMode.TAIL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TruncatingMode.MIDDLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ TruncatingMode[] $values() {
            return new TruncatingMode[]{TAIL, MIDDLE, HEAD};
        }

        static {
            TruncatingMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TruncatingMode(String str, int i11) {
        }

        @NotNull
        public static a<TruncatingMode> getEntries() {
            return $ENTRIES;
        }

        public static TruncatingMode valueOf(String str) {
            return (TruncatingMode) Enum.valueOf(TruncatingMode.class, str);
        }

        public static TruncatingMode[] values() {
            return (TruncatingMode[]) $VALUES.clone();
        }

        @NotNull
        public final TextUtils.TruncateAt getAsTruncateAt$design_system_release() {
            int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            return i11 != 1 ? i11 != 2 ? TextUtils.TruncateAt.START : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.END;
        }
    }

    public CommonAtomLabelDTO(@NotNull OzonSpannableString text, String str, String str2, String str3, IconPosition iconPosition, TruncatingMode truncatingMode, Integer num, boolean z11, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.textColor = str;
        this.icon = str2;
        this.iconTintColor = str3;
        this.iconPosition = iconPosition;
        this.truncatingMode = truncatingMode;
        this.numberOfLines = num;
        this.tagSupported = z11;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ CommonAtomLabelDTO copy$default(CommonAtomLabelDTO commonAtomLabelDTO, OzonSpannableString ozonSpannableString, String str, String str2, String str3, IconPosition iconPosition, TruncatingMode truncatingMode, Integer num, boolean z11, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = commonAtomLabelDTO.text;
        }
        if ((i11 & 2) != 0) {
            str = commonAtomLabelDTO.textColor;
        }
        if ((i11 & 4) != 0) {
            str2 = commonAtomLabelDTO.icon;
        }
        if ((i11 & 8) != 0) {
            str3 = commonAtomLabelDTO.iconTintColor;
        }
        if ((i11 & 16) != 0) {
            iconPosition = commonAtomLabelDTO.iconPosition;
        }
        if ((i11 & 32) != 0) {
            truncatingMode = commonAtomLabelDTO.truncatingMode;
        }
        if ((i11 & 64) != 0) {
            num = commonAtomLabelDTO.numberOfLines;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = commonAtomLabelDTO.tagSupported;
        }
        if ((i11 & 256) != 0) {
            testInfo = commonAtomLabelDTO.testInfo;
        }
        boolean z12 = z11;
        TestInfo testInfo2 = testInfo;
        TruncatingMode truncatingMode2 = truncatingMode;
        Integer num2 = num;
        IconPosition iconPosition2 = iconPosition;
        String str4 = str2;
        return commonAtomLabelDTO.copy(ozonSpannableString, str, str4, str3, iconPosition2, truncatingMode2, num2, z12, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    /* renamed from: component5, reason: from getter */
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    /* renamed from: component6, reason: from getter */
    public final TruncatingMode getTruncatingMode() {
        return this.truncatingMode;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getNumberOfLines() {
        return this.numberOfLines;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getTagSupported() {
        return this.tagSupported;
    }

    /* renamed from: component9, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final CommonAtomLabelDTO copy(@NotNull OzonSpannableString text, String textColor, String icon, String iconTintColor, IconPosition iconPosition, TruncatingMode truncatingMode, Integer numberOfLines, boolean tagSupported, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new CommonAtomLabelDTO(text, textColor, icon, iconTintColor, iconPosition, truncatingMode, numberOfLines, tagSupported, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonAtomLabelDTO)) {
            return false;
        }
        CommonAtomLabelDTO commonAtomLabelDTO = (CommonAtomLabelDTO) other;
        return Intrinsics.d(this.text, commonAtomLabelDTO.text) && Intrinsics.d(this.textColor, commonAtomLabelDTO.textColor) && Intrinsics.d(this.icon, commonAtomLabelDTO.icon) && Intrinsics.d(this.iconTintColor, commonAtomLabelDTO.iconTintColor) && this.iconPosition == commonAtomLabelDTO.iconPosition && this.truncatingMode == commonAtomLabelDTO.truncatingMode && Intrinsics.d(this.numberOfLines, commonAtomLabelDTO.numberOfLines) && this.tagSupported == commonAtomLabelDTO.tagSupported && Intrinsics.d(this.testInfo, commonAtomLabelDTO.testInfo);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    public final String getIconTintColor() {
        return this.iconTintColor;
    }

    public final Integer getNumberOfLines() {
        return this.numberOfLines;
    }

    public boolean getTagSupported() {
        return this.tagSupported;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final TruncatingMode getTruncatingMode() {
        return this.truncatingMode;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.textColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconTintColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        IconPosition iconPosition = this.iconPosition;
        int hashCode5 = (hashCode4 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        TruncatingMode truncatingMode = this.truncatingMode;
        int hashCode6 = (hashCode5 + (truncatingMode == null ? 0 : truncatingMode.hashCode())) * 31;
        Integer num = this.numberOfLines;
        int a11 = C3532b.a((hashCode6 + (num == null ? 0 : num.hashCode())) * 31, 31, this.tagSupported);
        TestInfo testInfo = this.testInfo;
        return a11 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    public void setTagSupported(boolean z11) {
        this.tagSupported = z11;
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        String str = this.textColor;
        String str2 = this.icon;
        String str3 = this.iconTintColor;
        IconPosition iconPosition = this.iconPosition;
        TruncatingMode truncatingMode = this.truncatingMode;
        Integer num = this.numberOfLines;
        boolean z11 = this.tagSupported;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("CommonAtomLabelDTO(text=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", textColor=");
        sb2.append(str);
        sb2.append(", icon=");
        Nh.a.h(sb2, str2, ", iconTintColor=", str3, ", iconPosition=");
        sb2.append(iconPosition);
        sb2.append(", truncatingMode=");
        sb2.append(truncatingMode);
        sb2.append(", numberOfLines=");
        sb2.append(num);
        sb2.append(", tagSupported=");
        sb2.append(z11);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        dest.writeString(this.textColor);
        dest.writeString(this.icon);
        dest.writeString(this.iconTintColor);
        IconPosition iconPosition = this.iconPosition;
        if (iconPosition == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iconPosition.name());
        }
        TruncatingMode truncatingMode = this.truncatingMode;
        if (truncatingMode == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(truncatingMode.name());
        }
        Integer num = this.numberOfLines;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        dest.writeInt(this.tagSupported ? 1 : 0);
        TestInfo testInfo = this.testInfo;
        if (testInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testInfo.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ CommonAtomLabelDTO(OzonSpannableString ozonSpannableString, String str, String str2, String str3, IconPosition iconPosition, TruncatingMode truncatingMode, Integer num, boolean z11, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? IconPosition.END : iconPosition, (i11 & 32) != 0 ? TruncatingMode.TAIL : truncatingMode, (i11 & 64) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, (i11 & 256) != 0 ? null : testInfo);
    }
}
