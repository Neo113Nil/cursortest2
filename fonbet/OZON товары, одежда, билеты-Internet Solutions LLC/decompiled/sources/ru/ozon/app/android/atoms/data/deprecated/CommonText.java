package ru.ozon.app.android.atoms.data.deprecated;

import B3.p;
import C.J;
import De.C2859b;
import N3.C3660k;
import Nh.a;
import Ns.b;
import Sc.InterfaceC3999a;
import T7.P;
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
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@InterfaceC3999a
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001:\u0003'()B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0014\u0010!\u001a\u0004\u0018\u00010\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0010¨\u0006*"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "Lru/ozon/uni/atoms/data/AtomDTO;", "type", "Lru/ozon/uni/atoms/data/Type;", "context", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getContext", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "image", "getImage", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "maxLines", "", "getMaxLines", "()Ljava/lang/Integer;", "textColor", "getTextColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "imageRight", "getImageRight", "TextSmall", "TextMedium", "TextFooter", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CommonText extends AtomDTO {
    private final String context;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final Type type;

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010(\u001a\u00020\bH\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u008e\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00104J\u0006\u00105\u001a\u00020\bJ\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\bHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006A"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextFooter;", "Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "image", "", "imageRight", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "maxLines", "", "textColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "type", "Lru/ozon/uni/atoms/data/Type;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getImage", "()Ljava/lang/String;", "getImageRight", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextFooter;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TextFooter extends CommonText {

        @NotNull
        public static final Parcelable.Creator<TextFooter> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final String image;
        private final String imageRight;
        private final Integer maxLines;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final String textColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final Type type;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<TextFooter> {
            @Override // android.os.Parcelable.Creator
            public final TextFooter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                LinkedHashMap linkedHashMap = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString3 = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(TextFooter.class.getClassLoader());
                Type valueOf2 = Type.valueOf(parcel.readString());
                Integer num = valueOf;
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(TextFooter.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new TextFooter(readString, readString2, create, num, readString3, atomActionDTO, valueOf2, readString4, linkedHashMap, (TestInfo) parcel.readParcelable(TextFooter.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final TextFooter[] newArray(int i11) {
                return new TextFooter[i11];
            }
        }

        public /* synthetic */ TextFooter(String str, String str2, OzonSpannableString ozonSpannableString, Integer num, String str3, AtomActionDTO atomActionDTO, Type type, String str4, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, ozonSpannableString, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str3, (i11 & 32) != 0 ? null : atomActionDTO, (i11 & 64) != 0 ? Type.TEXT_FOOTER : type, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : testInfo);
        }

        public static /* synthetic */ TextFooter copy$default(TextFooter textFooter, String str, String str2, OzonSpannableString ozonSpannableString, Integer num, String str3, AtomActionDTO atomActionDTO, Type type, String str4, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textFooter.image;
            }
            if ((i11 & 2) != 0) {
                str2 = textFooter.imageRight;
            }
            if ((i11 & 4) != 0) {
                ozonSpannableString = textFooter.text;
            }
            if ((i11 & 8) != 0) {
                num = textFooter.maxLines;
            }
            if ((i11 & 16) != 0) {
                str3 = textFooter.textColor;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = textFooter.action;
            }
            if ((i11 & 64) != 0) {
                type = textFooter.type;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = textFooter.context;
            }
            if ((i11 & 256) != 0) {
                map = textFooter.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                testInfo = textFooter.testInfo;
            }
            Map map2 = map;
            TestInfo testInfo2 = testInfo;
            Type type2 = type;
            String str5 = str4;
            String str6 = str3;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return textFooter.copy(str, str2, ozonSpannableString, num, str6, atomActionDTO2, type2, str5, map2, testInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component10, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImageRight() {
            return this.imageRight;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component8, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final TextFooter copy(String image, String imageRight, @NotNull OzonSpannableString text, Integer maxLines, String textColor, AtomActionDTO action, @NotNull Type type, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            return new TextFooter(image, imageRight, text, maxLines, textColor, action, type, context, trackingInfo, testInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextFooter)) {
                return false;
            }
            TextFooter textFooter = (TextFooter) other;
            return Intrinsics.d(this.image, textFooter.image) && Intrinsics.d(this.imageRight, textFooter.imageRight) && Intrinsics.d(this.text, textFooter.text) && Intrinsics.d(this.maxLines, textFooter.maxLines) && Intrinsics.d(this.textColor, textFooter.textColor) && Intrinsics.d(this.action, textFooter.action) && this.type == textFooter.type && Intrinsics.d(this.context, textFooter.context) && Intrinsics.d(this.trackingInfo, textFooter.trackingInfo) && Intrinsics.d(this.testInfo, textFooter.testInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public String getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public String getImageRight() {
            return this.imageRight;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_text_footer;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public Integer getMaxLines() {
            return this.maxLines;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        @NotNull
        public OzonSpannableString getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public String getTextColor() {
            return this.textColor;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.image;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.imageRight;
            int c11 = P.c(this.text, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            Integer num = this.maxLines;
            int hashCode2 = (c11 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.textColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (this.type.hashCode() + ((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31)) * 31;
            String str4 = this.context;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode6 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.imageRight;
            OzonSpannableString ozonSpannableString = this.text;
            Integer num = this.maxLines;
            String str3 = this.textColor;
            AtomActionDTO atomActionDTO = this.action;
            Type type = this.type;
            String str4 = this.context;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("TextFooter(image=", str, ", imageRight=", str2, ", text=");
            d11.append((Object) ozonSpannableString);
            d11.append(", maxLines=");
            d11.append(num);
            d11.append(", textColor=");
            p.c(str3, ", action=", ", type=", d11, atomActionDTO);
            d11.append(type);
            d11.append(", context=");
            d11.append(str4);
            d11.append(", trackingInfo=");
            return b.b(", testInfo=", ")", d11, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.image);
            dest.writeString(this.imageRight);
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            Integer num = this.maxLines;
            if (num == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num);
            }
            dest.writeString(this.textColor);
            dest.writeParcelable(this.action, flags);
            dest.writeString(this.type.name());
            dest.writeString(this.context);
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
            dest.writeParcelable(this.testInfo, flags);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        @NotNull
        public Type getType() {
            return this.type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextFooter(String str, String str2, @NotNull OzonSpannableString text, Integer num, String str3, AtomActionDTO atomActionDTO, @NotNull Type type, String str4, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            super(type, str4, map, testInfo);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            this.image = str;
            this.imageRight = str2;
            this.text = text;
            this.maxLines = num;
            this.textColor = str3;
            this.action = atomActionDTO;
            this.type = type;
            this.context = str4;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0001AB\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010(\u001a\u00020\bH\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u008e\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00104J\u0006\u00105\u001a\u00020\bJ\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\bHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006B"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;", "Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "image", "", "imageRight", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "maxLines", "", "textColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "type", "Lru/ozon/uni/atoms/data/Type;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getImage", "()Ljava/lang/String;", "getImageRight", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TextMedium extends CommonText {

        @NotNull
        public static final String DEFAULT_TEXT_COLOR = "ozTextPrimary";
        private final AtomActionDTO action;
        private final String context;
        private final String image;
        private final String imageRight;
        private final Integer maxLines;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final String textColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final Type type;

        @NotNull
        public static final Parcelable.Creator<TextMedium> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<TextMedium> {
            @Override // android.os.Parcelable.Creator
            public final TextMedium createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                LinkedHashMap linkedHashMap = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString3 = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(TextMedium.class.getClassLoader());
                Type valueOf2 = Type.valueOf(parcel.readString());
                Integer num = valueOf;
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(TextMedium.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new TextMedium(readString, readString2, create, num, readString3, atomActionDTO, valueOf2, readString4, linkedHashMap, (TestInfo) parcel.readParcelable(TextMedium.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final TextMedium[] newArray(int i11) {
                return new TextMedium[i11];
            }
        }

        public /* synthetic */ TextMedium(String str, String str2, OzonSpannableString ozonSpannableString, Integer num, String str3, AtomActionDTO atomActionDTO, Type type, String str4, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, ozonSpannableString, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str3, (i11 & 32) != 0 ? null : atomActionDTO, (i11 & 64) != 0 ? Type.TEXT_MEDIUM : type, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : testInfo);
        }

        public static /* synthetic */ TextMedium copy$default(TextMedium textMedium, String str, String str2, OzonSpannableString ozonSpannableString, Integer num, String str3, AtomActionDTO atomActionDTO, Type type, String str4, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textMedium.image;
            }
            if ((i11 & 2) != 0) {
                str2 = textMedium.imageRight;
            }
            if ((i11 & 4) != 0) {
                ozonSpannableString = textMedium.text;
            }
            if ((i11 & 8) != 0) {
                num = textMedium.maxLines;
            }
            if ((i11 & 16) != 0) {
                str3 = textMedium.textColor;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = textMedium.action;
            }
            if ((i11 & 64) != 0) {
                type = textMedium.type;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = textMedium.context;
            }
            if ((i11 & 256) != 0) {
                map = textMedium.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                testInfo = textMedium.testInfo;
            }
            Map map2 = map;
            TestInfo testInfo2 = testInfo;
            Type type2 = type;
            String str5 = str4;
            String str6 = str3;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return textMedium.copy(str, str2, ozonSpannableString, num, str6, atomActionDTO2, type2, str5, map2, testInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component10, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImageRight() {
            return this.imageRight;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component8, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final TextMedium copy(String image, String imageRight, @NotNull OzonSpannableString text, Integer maxLines, String textColor, AtomActionDTO action, @NotNull Type type, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            return new TextMedium(image, imageRight, text, maxLines, textColor, action, type, context, trackingInfo, testInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextMedium)) {
                return false;
            }
            TextMedium textMedium = (TextMedium) other;
            return Intrinsics.d(this.image, textMedium.image) && Intrinsics.d(this.imageRight, textMedium.imageRight) && Intrinsics.d(this.text, textMedium.text) && Intrinsics.d(this.maxLines, textMedium.maxLines) && Intrinsics.d(this.textColor, textMedium.textColor) && Intrinsics.d(this.action, textMedium.action) && this.type == textMedium.type && Intrinsics.d(this.context, textMedium.context) && Intrinsics.d(this.trackingInfo, textMedium.trackingInfo) && Intrinsics.d(this.testInfo, textMedium.testInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public String getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public String getImageRight() {
            return this.imageRight;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_text_medium;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public Integer getMaxLines() {
            return this.maxLines;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        @NotNull
        public OzonSpannableString getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public String getTextColor() {
            return this.textColor;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.image;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.imageRight;
            int c11 = P.c(this.text, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            Integer num = this.maxLines;
            int hashCode2 = (c11 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.textColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (this.type.hashCode() + ((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31)) * 31;
            String str4 = this.context;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode6 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.imageRight;
            OzonSpannableString ozonSpannableString = this.text;
            Integer num = this.maxLines;
            String str3 = this.textColor;
            AtomActionDTO atomActionDTO = this.action;
            Type type = this.type;
            String str4 = this.context;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("TextMedium(image=", str, ", imageRight=", str2, ", text=");
            d11.append((Object) ozonSpannableString);
            d11.append(", maxLines=");
            d11.append(num);
            d11.append(", textColor=");
            p.c(str3, ", action=", ", type=", d11, atomActionDTO);
            d11.append(type);
            d11.append(", context=");
            d11.append(str4);
            d11.append(", trackingInfo=");
            return b.b(", testInfo=", ")", d11, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.image);
            dest.writeString(this.imageRight);
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            Integer num = this.maxLines;
            if (num == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num);
            }
            dest.writeString(this.textColor);
            dest.writeParcelable(this.action, flags);
            dest.writeString(this.type.name());
            dest.writeString(this.context);
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
            dest.writeParcelable(this.testInfo, flags);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        @NotNull
        public Type getType() {
            return this.type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextMedium(String str, String str2, @NotNull OzonSpannableString text, Integer num, String str3, AtomActionDTO atomActionDTO, @NotNull Type type, String str4, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            super(type, str4, map, testInfo);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            this.image = str;
            this.imageRight = str2;
            this.text = text;
            this.maxLines = num;
            this.textColor = str3;
            this.action = atomActionDTO;
            this.type = type;
            this.context = str4;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010(\u001a\u00020\bH\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u008e\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00104J\u0006\u00105\u001a\u00020\bJ\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u00020\bHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006A"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextSmall;", "Lru/ozon/app/android/atoms/data/deprecated/CommonText;", "image", "", "imageRight", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "maxLines", "", "textColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "type", "Lru/ozon/uni/atoms/data/Type;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getImage", "()Ljava/lang/String;", "getImageRight", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getMaxLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextSmall;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TextSmall extends CommonText {

        @NotNull
        public static final Parcelable.Creator<TextSmall> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final String image;
        private final String imageRight;
        private final Integer maxLines;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final String textColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final Type type;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<TextSmall> {
            @Override // android.os.Parcelable.Creator
            public final TextSmall createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                LinkedHashMap linkedHashMap = null;
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString3 = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(TextSmall.class.getClassLoader());
                Type valueOf2 = Type.valueOf(parcel.readString());
                Integer num = valueOf;
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(TextSmall.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new TextSmall(readString, readString2, create, num, readString3, atomActionDTO, valueOf2, readString4, linkedHashMap, (TestInfo) parcel.readParcelable(TextSmall.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final TextSmall[] newArray(int i11) {
                return new TextSmall[i11];
            }
        }

        public /* synthetic */ TextSmall(String str, String str2, OzonSpannableString ozonSpannableString, Integer num, String str3, AtomActionDTO atomActionDTO, Type type, String str4, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, ozonSpannableString, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str3, (i11 & 32) != 0 ? null : atomActionDTO, (i11 & 64) != 0 ? Type.TEXT_SMALL : type, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : testInfo);
        }

        public static /* synthetic */ TextSmall copy$default(TextSmall textSmall, String str, String str2, OzonSpannableString ozonSpannableString, Integer num, String str3, AtomActionDTO atomActionDTO, Type type, String str4, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textSmall.image;
            }
            if ((i11 & 2) != 0) {
                str2 = textSmall.imageRight;
            }
            if ((i11 & 4) != 0) {
                ozonSpannableString = textSmall.text;
            }
            if ((i11 & 8) != 0) {
                num = textSmall.maxLines;
            }
            if ((i11 & 16) != 0) {
                str3 = textSmall.textColor;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = textSmall.action;
            }
            if ((i11 & 64) != 0) {
                type = textSmall.type;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = textSmall.context;
            }
            if ((i11 & 256) != 0) {
                map = textSmall.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                testInfo = textSmall.testInfo;
            }
            Map map2 = map;
            TestInfo testInfo2 = testInfo;
            Type type2 = type;
            String str5 = str4;
            String str6 = str3;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return textSmall.copy(str, str2, ozonSpannableString, num, str6, atomActionDTO2, type2, str5, map2, testInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component10, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImageRight() {
            return this.imageRight;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getMaxLines() {
            return this.maxLines;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component8, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final TextSmall copy(String image, String imageRight, @NotNull OzonSpannableString text, Integer maxLines, String textColor, AtomActionDTO action, @NotNull Type type, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            return new TextSmall(image, imageRight, text, maxLines, textColor, action, type, context, trackingInfo, testInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextSmall)) {
                return false;
            }
            TextSmall textSmall = (TextSmall) other;
            return Intrinsics.d(this.image, textSmall.image) && Intrinsics.d(this.imageRight, textSmall.imageRight) && Intrinsics.d(this.text, textSmall.text) && Intrinsics.d(this.maxLines, textSmall.maxLines) && Intrinsics.d(this.textColor, textSmall.textColor) && Intrinsics.d(this.action, textSmall.action) && this.type == textSmall.type && Intrinsics.d(this.context, textSmall.context) && Intrinsics.d(this.trackingInfo, textSmall.trackingInfo) && Intrinsics.d(this.testInfo, textSmall.testInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public String getImage() {
            return this.image;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public String getImageRight() {
            return this.imageRight;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_text_small;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public Integer getMaxLines() {
            return this.maxLines;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        @NotNull
        public OzonSpannableString getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText
        public String getTextColor() {
            return this.textColor;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            String str = this.image;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.imageRight;
            int c11 = P.c(this.text, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            Integer num = this.maxLines;
            int hashCode2 = (c11 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.textColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (this.type.hashCode() + ((hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31)) * 31;
            String str4 = this.context;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode6 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.imageRight;
            OzonSpannableString ozonSpannableString = this.text;
            Integer num = this.maxLines;
            String str3 = this.textColor;
            AtomActionDTO atomActionDTO = this.action;
            Type type = this.type;
            String str4 = this.context;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("TextSmall(image=", str, ", imageRight=", str2, ", text=");
            d11.append((Object) ozonSpannableString);
            d11.append(", maxLines=");
            d11.append(num);
            d11.append(", textColor=");
            p.c(str3, ", action=", ", type=", d11, atomActionDTO);
            d11.append(type);
            d11.append(", context=");
            d11.append(str4);
            d11.append(", trackingInfo=");
            return b.b(", testInfo=", ")", d11, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.image);
            dest.writeString(this.imageRight);
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            Integer num = this.maxLines;
            if (num == null) {
                dest.writeInt(0);
            } else {
                a.f(dest, 1, num);
            }
            dest.writeString(this.textColor);
            dest.writeParcelable(this.action, flags);
            dest.writeString(this.type.name());
            dest.writeString(this.context);
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
            dest.writeParcelable(this.testInfo, flags);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonText, ru.ozon.uni.atoms.data.AtomDTO
        @NotNull
        public Type getType() {
            return this.type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextSmall(String str, String str2, @NotNull OzonSpannableString text, Integer num, String str3, AtomActionDTO atomActionDTO, @NotNull Type type, String str4, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            super(type, str4, map, testInfo);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(type, "type");
            this.image = str;
            this.imageRight = str2;
            this.text = text;
            this.maxLines = num;
            this.textColor = str3;
            this.action = atomActionDTO;
            this.type = type;
            this.context = str4;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }
    }

    public /* synthetic */ CommonText(Type type, String str, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : testInfo);
    }

    public abstract AtomActionDTO getAction();

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    public abstract String getImage();

    public abstract String getImageRight();

    public abstract Integer getMaxLines();

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public abstract OzonSpannableString getText();

    public abstract String getTextColor();

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonText(@NotNull Type type, String str, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(type, str, map, null, 8, null);
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.context = str;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    @NotNull
    public Type getType() {
        return this.type;
    }
}
