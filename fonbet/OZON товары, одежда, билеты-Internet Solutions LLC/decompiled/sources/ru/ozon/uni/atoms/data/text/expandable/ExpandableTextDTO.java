package ru.ozon.uni.atoms.data.text.expandable;

import B3.p;
import C.J;
import D40.d;
import De.C2859b;
import Ds.C2880a;
import Ep.a;
import I0.C3173b;
import Kk.C3532b;
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
import ru.ozon.uni.atoms.common.HTMLTagSupport;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.DsAtomsType;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bã\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010 J\b\u0010>\u001a\u00020\u000fH\u0016J\t\u0010?\u001a\u00020\u0004HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0017\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010L\u001a\u00020\rHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jì\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010RJ\u0006\u0010S\u001a\u00020\u000fJ\u0013\u0010T\u001a\u00020\r2\b\u0010U\u001a\u0004\u0018\u00010VHÖ\u0003J\t\u0010W\u001a\u00020\u000fHÖ\u0001J\t\u0010X\u001a\u00020\u000bHÖ\u0001J\u0016\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010*R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u001a\u0010\u001a\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u00109R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)¨\u0006^"}, d2 = {"Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/uni/atoms/common/HTMLTagSupport;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "leftPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightPadding", "preset", "Lru/ozon/uni/atoms/data/text/TextPreset;", "textColor", "", "isExpanded", "", "numberOfLines", "", "moreText", "moreBackgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "context", "tagSupported", "topPadding", "bottomPadding", "typographyToken", "moreTextTypographyToken", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/text/TextPreset;Ljava/lang/String;ZLjava/lang/Integer;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/String;ZLru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightPadding", "getPreset", "()Lru/ozon/uni/atoms/data/text/TextPreset;", "getTextColor", "()Ljava/lang/String;", "()Z", "getNumberOfLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMoreText", "getMoreBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getContext", "getTagSupported", "setTagSupported", "(Z)V", "getTopPadding", "getBottomPadding", "getTypographyToken", "getMoreTextTypographyToken", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/text/TextPreset;Ljava/lang/String;ZLjava/lang/Integer;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/lang/String;ZLru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/uni/atoms/data/text/expandable/ExpandableTextDTO;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ExpandableTextDTO extends AtomDTO implements HTMLTagSupport {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ExpandableTextDTO> CREATOR = new Creator();
    private final AtomActionDTO action;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding bottomPadding;
    private final String context;
    private final boolean isExpanded;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding leftPadding;
    private final String moreBackgroundColor;
    private final OzonSpannableString moreText;
    private final String moreTextTypographyToken;
    private final Integer numberOfLines;

    @EnumNullFallback
    private final TextPreset preset;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding rightPadding;
    private transient boolean tagSupported;
    private final TestInfo testInfo;

    @NotNull
    private final OzonSpannableString text;
    private final String textColor;

    @EnumNullFallback
    private final CommonCellSettings.LayoutPadding topPadding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String typographyToken;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ExpandableTextDTO> {
        @Override // android.os.Parcelable.Creator
        public final ExpandableTextDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            CommonCellSettings.LayoutPadding layoutPadding;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
            CommonCellSettings.LayoutPadding valueOf = parcel2.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel2.readString());
            CommonCellSettings.LayoutPadding valueOf2 = parcel2.readInt() == 0 ? null : CommonCellSettings.LayoutPadding.valueOf(parcel2.readString());
            TextPreset valueOf3 = parcel2.readInt() == 0 ? null : TextPreset.valueOf(parcel2.readString());
            String readString = parcel2.readString();
            boolean z11 = parcel2.readInt() != 0;
            Integer valueOf4 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
            TextPreset textPreset = valueOf3;
            String readString2 = parcel2.readString();
            AtomActionDTO createFromParcel = parcel2.readInt() == 0 ? null : AtomActionDTO.CREATOR.createFromParcel(parcel2);
            TestInfo createFromParcel2 = parcel2.readInt() == 0 ? null : TestInfo.CREATOR.createFromParcel(parcel2);
            if (parcel2.readInt() == 0) {
                layoutPadding = null;
                linkedHashMap = null;
            } else {
                int readInt = parcel2.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(ExpandableTextDTO.class, parcel2, linkedHashMap, parcel2.readString(), i11, 1);
                    parcel2 = parcel;
                    readInt = readInt;
                }
                layoutPadding = null;
            }
            String readString3 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            CommonCellSettings.LayoutPadding valueOf5 = parcel.readInt() == 0 ? layoutPadding : CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                layoutPadding = CommonCellSettings.LayoutPadding.valueOf(parcel.readString());
            }
            return new ExpandableTextDTO(create, valueOf, valueOf2, textPreset, readString, z11, valueOf4, create2, readString2, createFromParcel, createFromParcel2, linkedHashMap, readString3, z12, valueOf5, layoutPadding, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExpandableTextDTO[] newArray(int i11) {
            return new ExpandableTextDTO[i11];
        }
    }

    public /* synthetic */ ExpandableTextDTO(OzonSpannableString ozonSpannableString, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, TextPreset textPreset, String str, boolean z11, Integer num, OzonSpannableString ozonSpannableString2, String str2, AtomActionDTO atomActionDTO, TestInfo testInfo, Map map, String str3, boolean z12, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(ozonSpannableString, (i11 & 2) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 8) != 0 ? null : textPreset, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : ozonSpannableString2, (i11 & 256) != 0 ? null : str2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : testInfo, (i11 & 2048) != 0 ? null : map, (i11 & 4096) != 0 ? null : str3, (i11 & 8192) == 0 ? z12 : false, (i11 & 16384) != 0 ? null : layoutPadding3, (i11 & 32768) != 0 ? null : layoutPadding4, (i11 & 65536) != 0 ? null : str4, (i11 & 131072) != 0 ? null : str5);
    }

    public static /* synthetic */ ExpandableTextDTO copy$default(ExpandableTextDTO expandableTextDTO, OzonSpannableString ozonSpannableString, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, TextPreset textPreset, String str, boolean z11, Integer num, OzonSpannableString ozonSpannableString2, String str2, AtomActionDTO atomActionDTO, TestInfo testInfo, Map map, String str3, boolean z12, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, String str4, String str5, int i11, Object obj) {
        String str6;
        String str7;
        OzonSpannableString ozonSpannableString3 = (i11 & 1) != 0 ? expandableTextDTO.text : ozonSpannableString;
        CommonCellSettings.LayoutPadding layoutPadding5 = (i11 & 2) != 0 ? expandableTextDTO.leftPadding : layoutPadding;
        CommonCellSettings.LayoutPadding layoutPadding6 = (i11 & 4) != 0 ? expandableTextDTO.rightPadding : layoutPadding2;
        TextPreset textPreset2 = (i11 & 8) != 0 ? expandableTextDTO.preset : textPreset;
        String str8 = (i11 & 16) != 0 ? expandableTextDTO.textColor : str;
        boolean z13 = (i11 & 32) != 0 ? expandableTextDTO.isExpanded : z11;
        Integer num2 = (i11 & 64) != 0 ? expandableTextDTO.numberOfLines : num;
        OzonSpannableString ozonSpannableString4 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? expandableTextDTO.moreText : ozonSpannableString2;
        String str9 = (i11 & 256) != 0 ? expandableTextDTO.moreBackgroundColor : str2;
        AtomActionDTO atomActionDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? expandableTextDTO.action : atomActionDTO;
        TestInfo testInfo2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? expandableTextDTO.testInfo : testInfo;
        Map map2 = (i11 & 2048) != 0 ? expandableTextDTO.trackingInfo : map;
        String str10 = (i11 & 4096) != 0 ? expandableTextDTO.context : str3;
        boolean z14 = (i11 & 8192) != 0 ? expandableTextDTO.tagSupported : z12;
        OzonSpannableString ozonSpannableString5 = ozonSpannableString3;
        CommonCellSettings.LayoutPadding layoutPadding7 = (i11 & 16384) != 0 ? expandableTextDTO.topPadding : layoutPadding3;
        CommonCellSettings.LayoutPadding layoutPadding8 = (i11 & 32768) != 0 ? expandableTextDTO.bottomPadding : layoutPadding4;
        String str11 = (i11 & 65536) != 0 ? expandableTextDTO.typographyToken : str4;
        if ((i11 & 131072) != 0) {
            str7 = str11;
            str6 = expandableTextDTO.moreTextTypographyToken;
        } else {
            str6 = str5;
            str7 = str11;
        }
        return expandableTextDTO.copy(ozonSpannableString5, layoutPadding5, layoutPadding6, textPreset2, str8, z13, num2, ozonSpannableString4, str9, atomActionDTO2, testInfo2, map2, str10, z14, layoutPadding7, layoutPadding8, str7, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component11, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getTagSupported() {
        return this.tagSupported;
    }

    /* renamed from: component15, reason: from getter */
    public final CommonCellSettings.LayoutPadding getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component16, reason: from getter */
    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component17, reason: from getter */
    public final String getTypographyToken() {
        return this.typographyToken;
    }

    /* renamed from: component18, reason: from getter */
    public final String getMoreTextTypographyToken() {
        return this.moreTextTypographyToken;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final TextPreset getPreset() {
        return this.preset;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getNumberOfLines() {
        return this.numberOfLines;
    }

    /* renamed from: component8, reason: from getter */
    public final OzonSpannableString getMoreText() {
        return this.moreText;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMoreBackgroundColor() {
        return this.moreBackgroundColor;
    }

    @NotNull
    public final ExpandableTextDTO copy(@NotNull OzonSpannableString text, CommonCellSettings.LayoutPadding leftPadding, CommonCellSettings.LayoutPadding rightPadding, TextPreset preset, String textColor, boolean isExpanded, Integer numberOfLines, OzonSpannableString moreText, String moreBackgroundColor, AtomActionDTO action, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, String context, boolean tagSupported, CommonCellSettings.LayoutPadding topPadding, CommonCellSettings.LayoutPadding bottomPadding, String typographyToken, String moreTextTypographyToken) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new ExpandableTextDTO(text, leftPadding, rightPadding, preset, textColor, isExpanded, numberOfLines, moreText, moreBackgroundColor, action, testInfo, trackingInfo, context, tagSupported, topPadding, bottomPadding, typographyToken, moreTextTypographyToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableTextDTO)) {
            return false;
        }
        ExpandableTextDTO expandableTextDTO = (ExpandableTextDTO) other;
        return Intrinsics.d(this.text, expandableTextDTO.text) && this.leftPadding == expandableTextDTO.leftPadding && this.rightPadding == expandableTextDTO.rightPadding && this.preset == expandableTextDTO.preset && Intrinsics.d(this.textColor, expandableTextDTO.textColor) && this.isExpanded == expandableTextDTO.isExpanded && Intrinsics.d(this.numberOfLines, expandableTextDTO.numberOfLines) && Intrinsics.d(this.moreText, expandableTextDTO.moreText) && Intrinsics.d(this.moreBackgroundColor, expandableTextDTO.moreBackgroundColor) && Intrinsics.d(this.action, expandableTextDTO.action) && Intrinsics.d(this.testInfo, expandableTextDTO.testInfo) && Intrinsics.d(this.trackingInfo, expandableTextDTO.trackingInfo) && Intrinsics.d(this.context, expandableTextDTO.context) && this.tagSupported == expandableTextDTO.tagSupported && this.topPadding == expandableTextDTO.topPadding && this.bottomPadding == expandableTextDTO.bottomPadding && Intrinsics.d(this.typographyToken, expandableTextDTO.typographyToken) && Intrinsics.d(this.moreTextTypographyToken, expandableTextDTO.moreTextTypographyToken);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final CommonCellSettings.LayoutPadding getBottomPadding() {
        return this.bottomPadding;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.expandableText;
    }

    public final CommonCellSettings.LayoutPadding getLeftPadding() {
        return this.leftPadding;
    }

    public final String getMoreBackgroundColor() {
        return this.moreBackgroundColor;
    }

    public final OzonSpannableString getMoreText() {
        return this.moreText;
    }

    public final String getMoreTextTypographyToken() {
        return this.moreTextTypographyToken;
    }

    public final Integer getNumberOfLines() {
        return this.numberOfLines;
    }

    public final TextPreset getPreset() {
        return this.preset;
    }

    public final CommonCellSettings.LayoutPadding getRightPadding() {
        return this.rightPadding;
    }

    public boolean getTagSupported() {
        return this.tagSupported;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OzonSpannableString getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final CommonCellSettings.LayoutPadding getTopPadding() {
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
        CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
        int hashCode2 = (hashCode + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
        int hashCode3 = (hashCode2 + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
        TextPreset textPreset = this.preset;
        int hashCode4 = (hashCode3 + (textPreset == null ? 0 : textPreset.hashCode())) * 31;
        String str = this.textColor;
        int a11 = C3532b.a((hashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isExpanded);
        Integer num = this.numberOfLines;
        int hashCode5 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        OzonSpannableString ozonSpannableString = this.moreText;
        int hashCode6 = (hashCode5 + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        String str2 = this.moreBackgroundColor;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode8 = (hashCode7 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode9 = (hashCode8 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.context;
        int a12 = C3532b.a((hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.tagSupported);
        CommonCellSettings.LayoutPadding layoutPadding3 = this.topPadding;
        int hashCode11 = (a12 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
        int hashCode12 = (hashCode11 + (layoutPadding4 == null ? 0 : layoutPadding4.hashCode())) * 31;
        String str4 = this.typographyToken;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.moreTextTypographyToken;
        return hashCode13 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    @Override // ru.ozon.uni.atoms.common.HTMLTagSupport
    public void setTagSupported(boolean z11) {
        this.tagSupported = z11;
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
        TextPreset textPreset = this.preset;
        String str = this.textColor;
        boolean z11 = this.isExpanded;
        Integer num = this.numberOfLines;
        OzonSpannableString ozonSpannableString2 = this.moreText;
        String str2 = this.moreBackgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str3 = this.context;
        boolean z12 = this.tagSupported;
        CommonCellSettings.LayoutPadding layoutPadding3 = this.topPadding;
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
        String str4 = this.typographyToken;
        String str5 = this.moreTextTypographyToken;
        StringBuilder sb2 = new StringBuilder("ExpandableTextDTO(text=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", leftPadding=");
        sb2.append(layoutPadding);
        sb2.append(", rightPadding=");
        sb2.append(layoutPadding2);
        sb2.append(", preset=");
        sb2.append(textPreset);
        sb2.append(", textColor=");
        C2880a.c(str, ", isExpanded=", ", numberOfLines=", sb2, z11);
        sb2.append(num);
        sb2.append(", moreText=");
        sb2.append((Object) ozonSpannableString2);
        sb2.append(", moreBackgroundColor=");
        p.c(str2, ", action=", ", testInfo=", sb2, atomActionDTO);
        sb2.append(testInfo);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", context=");
        C2880a.c(str3, ", tagSupported=", ", topPadding=", sb2, z12);
        a.f(sb2, layoutPadding3, ", bottomPadding=", layoutPadding4, ", typographyToken=");
        return C3173b.c(sb2, str4, ", moreTextTypographyToken=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
        ozonSpannableStringParceler.write(this.text, dest, flags);
        CommonCellSettings.LayoutPadding layoutPadding = this.leftPadding;
        if (layoutPadding == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding);
        }
        CommonCellSettings.LayoutPadding layoutPadding2 = this.rightPadding;
        if (layoutPadding2 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding2);
        }
        TextPreset textPreset = this.preset;
        if (textPreset == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(textPreset.name());
        }
        dest.writeString(this.textColor);
        dest.writeInt(this.isExpanded ? 1 : 0);
        Integer num = this.numberOfLines;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
        }
        ozonSpannableStringParceler.write(this.moreText, dest, flags);
        dest.writeString(this.moreBackgroundColor);
        AtomActionDTO atomActionDTO = this.action;
        if (atomActionDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            atomActionDTO.writeToParcel(dest, flags);
        }
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
        dest.writeString(this.context);
        dest.writeInt(this.tagSupported ? 1 : 0);
        CommonCellSettings.LayoutPadding layoutPadding3 = this.topPadding;
        if (layoutPadding3 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding3);
        }
        CommonCellSettings.LayoutPadding layoutPadding4 = this.bottomPadding;
        if (layoutPadding4 == null) {
            dest.writeInt(0);
        } else {
            d.d(dest, 1, layoutPadding4);
        }
        dest.writeString(this.typographyToken);
        dest.writeString(this.moreTextTypographyToken);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableTextDTO(@NotNull OzonSpannableString text, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, TextPreset textPreset, String str, boolean z11, Integer num, OzonSpannableString ozonSpannableString, String str2, AtomActionDTO atomActionDTO, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, String str3, boolean z12, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, String str4, String str5) {
        super(DsAtomsType.EXPANDABLE_TEXT, str3, map, testInfo);
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.leftPadding = layoutPadding;
        this.rightPadding = layoutPadding2;
        this.preset = textPreset;
        this.textColor = str;
        this.isExpanded = z11;
        this.numberOfLines = num;
        this.moreText = ozonSpannableString;
        this.moreBackgroundColor = str2;
        this.action = atomActionDTO;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.context = str3;
        this.tagSupported = z12;
        this.topPadding = layoutPadding3;
        this.bottomPadding = layoutPadding4;
        this.typographyToken = str4;
        this.moreTextTypographyToken = str5;
    }
}
