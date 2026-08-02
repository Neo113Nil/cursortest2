package ru.ozon.app.android.atoms.data.deprecated;

import C.J;
import De.C2859b;
import Ql.c;
import Sc.InterfaceC3999a;
import T7.P;
import Ul.C4070a;
import android.os.Parcel;
import android.os.Parcelable;
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
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@InterfaceC3999a
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u001b\u001c\u001d\u001e\u001f B?\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0006!\"#$%&¨\u0006'"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "Lru/ozon/uni/atoms/data/AtomDTO;", "type", "Lru/ozon/uni/atoms/data/Type;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "text", "getText", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "ButtonBlue", "ButtonBorderless", "ButtonBorderlessSmall", "ButtonBlueSmall", "ButtonSecondary", "ButtonSecondarySmall", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBlue;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBlueSmall;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBorderless;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBorderlessSmall;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonSecondary;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonSecondarySmall;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CommonButton extends AtomDTO {
    private final String context;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final Type type;

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0018HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBlue;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    /* loaded from: classes11.dex */
    public static final /* data */ class ButtonBlue extends CommonButton {

        @NotNull
        public static final Parcelable.Creator<ButtonBlue> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final TestInfo testInfo;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonBlue> {
            @Override // android.os.Parcelable.Creator
            public final ButtonBlue createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(ButtonBlue.class.getClassLoader());
                String readString2 = parcel.readString();
                TestInfo testInfo = (TestInfo) parcel.readParcelable(ButtonBlue.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(ButtonBlue.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new ButtonBlue(readString, atomActionDTO, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonBlue[] newArray(int i11) {
                return new ButtonBlue[i11];
            }
        }

        public /* synthetic */ ButtonBlue(String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map);
        }

        public static /* synthetic */ ButtonBlue copy$default(ButtonBlue buttonBlue, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonBlue.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = buttonBlue.action;
            }
            if ((i11 & 4) != 0) {
                str2 = buttonBlue.context;
            }
            if ((i11 & 8) != 0) {
                testInfo = buttonBlue.testInfo;
            }
            if ((i11 & 16) != 0) {
                map = buttonBlue.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return buttonBlue.copy(str, atomActionDTO, str3, testInfo, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final ButtonBlue copy(@NotNull String text, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ButtonBlue(text, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonBlue)) {
                return false;
            }
            ButtonBlue buttonBlue = (ButtonBlue) other;
            return Intrinsics.d(this.text, buttonBlue.text) && Intrinsics.d(this.action, buttonBlue.action) && Intrinsics.d(this.context, buttonBlue.context) && Intrinsics.d(this.testInfo, buttonBlue.testInfo) && Intrinsics.d(this.trackingInfo, buttonBlue.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_button_blue;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        @NotNull
        public String getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("ButtonBlue(text=", str, ", action=", atomActionDTO, ", context=");
            C4070a.b(c11, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeParcelable(this.action, flags);
            dest.writeString(this.context);
            dest.writeParcelable(this.testInfo, flags);
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
        public ButtonBlue(@NotNull String text, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.BUTTON, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0018HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBlueSmall;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ButtonBlueSmall extends CommonButton {

        @NotNull
        public static final Parcelable.Creator<ButtonBlueSmall> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final TestInfo testInfo;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<ButtonBlueSmall> {
            @Override // android.os.Parcelable.Creator
            public final ButtonBlueSmall createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(ButtonBlueSmall.class.getClassLoader());
                String readString2 = parcel.readString();
                TestInfo testInfo = (TestInfo) parcel.readParcelable(ButtonBlueSmall.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(ButtonBlueSmall.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new ButtonBlueSmall(readString, atomActionDTO, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonBlueSmall[] newArray(int i11) {
                return new ButtonBlueSmall[i11];
            }
        }

        public /* synthetic */ ButtonBlueSmall(String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map);
        }

        public static /* synthetic */ ButtonBlueSmall copy$default(ButtonBlueSmall buttonBlueSmall, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonBlueSmall.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = buttonBlueSmall.action;
            }
            if ((i11 & 4) != 0) {
                str2 = buttonBlueSmall.context;
            }
            if ((i11 & 8) != 0) {
                testInfo = buttonBlueSmall.testInfo;
            }
            if ((i11 & 16) != 0) {
                map = buttonBlueSmall.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return buttonBlueSmall.copy(str, atomActionDTO, str3, testInfo, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final ButtonBlueSmall copy(@NotNull String text, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ButtonBlueSmall(text, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonBlueSmall)) {
                return false;
            }
            ButtonBlueSmall buttonBlueSmall = (ButtonBlueSmall) other;
            return Intrinsics.d(this.text, buttonBlueSmall.text) && Intrinsics.d(this.action, buttonBlueSmall.action) && Intrinsics.d(this.context, buttonBlueSmall.context) && Intrinsics.d(this.testInfo, buttonBlueSmall.testInfo) && Intrinsics.d(this.trackingInfo, buttonBlueSmall.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_button_blue_small;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        @NotNull
        public String getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("ButtonBlueSmall(text=", str, ", action=", atomActionDTO, ", context=");
            C4070a.b(c11, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeParcelable(this.action, flags);
            dest.writeString(this.context);
            dest.writeParcelable(this.testInfo, flags);
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
        public ButtonBlueSmall(@NotNull String text, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.BUTTON_SMALL, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0018HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBorderless;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ButtonBorderless extends CommonButton {

        @NotNull
        public static final Parcelable.Creator<ButtonBorderless> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final TestInfo testInfo;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<ButtonBorderless> {
            @Override // android.os.Parcelable.Creator
            public final ButtonBorderless createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(ButtonBorderless.class.getClassLoader());
                String readString2 = parcel.readString();
                TestInfo testInfo = (TestInfo) parcel.readParcelable(ButtonBorderless.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(ButtonBorderless.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new ButtonBorderless(readString, atomActionDTO, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonBorderless[] newArray(int i11) {
                return new ButtonBorderless[i11];
            }
        }

        public /* synthetic */ ButtonBorderless(String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map);
        }

        public static /* synthetic */ ButtonBorderless copy$default(ButtonBorderless buttonBorderless, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonBorderless.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = buttonBorderless.action;
            }
            if ((i11 & 4) != 0) {
                str2 = buttonBorderless.context;
            }
            if ((i11 & 8) != 0) {
                testInfo = buttonBorderless.testInfo;
            }
            if ((i11 & 16) != 0) {
                map = buttonBorderless.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return buttonBorderless.copy(str, atomActionDTO, str3, testInfo, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final ButtonBorderless copy(@NotNull String text, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ButtonBorderless(text, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonBorderless)) {
                return false;
            }
            ButtonBorderless buttonBorderless = (ButtonBorderless) other;
            return Intrinsics.d(this.text, buttonBorderless.text) && Intrinsics.d(this.action, buttonBorderless.action) && Intrinsics.d(this.context, buttonBorderless.context) && Intrinsics.d(this.testInfo, buttonBorderless.testInfo) && Intrinsics.d(this.trackingInfo, buttonBorderless.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_button_borderless;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        @NotNull
        public String getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("ButtonBorderless(text=", str, ", action=", atomActionDTO, ", context=");
            C4070a.b(c11, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeParcelable(this.action, flags);
            dest.writeString(this.context);
            dest.writeParcelable(this.testInfo, flags);
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
        public ButtonBorderless(@NotNull String text, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.BUTTON_BORDERLESS, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0018HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBorderlessSmall;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ButtonBorderlessSmall extends CommonButton {

        @NotNull
        public static final Parcelable.Creator<ButtonBorderlessSmall> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final TestInfo testInfo;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<ButtonBorderlessSmall> {
            @Override // android.os.Parcelable.Creator
            public final ButtonBorderlessSmall createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(ButtonBorderlessSmall.class.getClassLoader());
                String readString2 = parcel.readString();
                TestInfo testInfo = (TestInfo) parcel.readParcelable(ButtonBorderlessSmall.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(ButtonBorderlessSmall.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new ButtonBorderlessSmall(readString, atomActionDTO, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonBorderlessSmall[] newArray(int i11) {
                return new ButtonBorderlessSmall[i11];
            }
        }

        public /* synthetic */ ButtonBorderlessSmall(String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map);
        }

        public static /* synthetic */ ButtonBorderlessSmall copy$default(ButtonBorderlessSmall buttonBorderlessSmall, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonBorderlessSmall.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = buttonBorderlessSmall.action;
            }
            if ((i11 & 4) != 0) {
                str2 = buttonBorderlessSmall.context;
            }
            if ((i11 & 8) != 0) {
                testInfo = buttonBorderlessSmall.testInfo;
            }
            if ((i11 & 16) != 0) {
                map = buttonBorderlessSmall.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return buttonBorderlessSmall.copy(str, atomActionDTO, str3, testInfo, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final ButtonBorderlessSmall copy(@NotNull String text, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ButtonBorderlessSmall(text, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonBorderlessSmall)) {
                return false;
            }
            ButtonBorderlessSmall buttonBorderlessSmall = (ButtonBorderlessSmall) other;
            return Intrinsics.d(this.text, buttonBorderlessSmall.text) && Intrinsics.d(this.action, buttonBorderlessSmall.action) && Intrinsics.d(this.context, buttonBorderlessSmall.context) && Intrinsics.d(this.testInfo, buttonBorderlessSmall.testInfo) && Intrinsics.d(this.trackingInfo, buttonBorderlessSmall.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_button_borderless;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        @NotNull
        public String getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("ButtonBorderlessSmall(text=", str, ", action=", atomActionDTO, ", context=");
            C4070a.b(c11, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeParcelable(this.action, flags);
            dest.writeString(this.context);
            dest.writeParcelable(this.testInfo, flags);
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
        public ButtonBorderlessSmall(@NotNull String text, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.BUTTON_BORDERLESS_SMALL, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0018HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonSecondary;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ButtonSecondary extends CommonButton {

        @NotNull
        public static final Parcelable.Creator<ButtonSecondary> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final TestInfo testInfo;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<ButtonSecondary> {
            @Override // android.os.Parcelable.Creator
            public final ButtonSecondary createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(ButtonSecondary.class.getClassLoader());
                String readString2 = parcel.readString();
                TestInfo testInfo = (TestInfo) parcel.readParcelable(ButtonSecondary.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(ButtonSecondary.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new ButtonSecondary(readString, atomActionDTO, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonSecondary[] newArray(int i11) {
                return new ButtonSecondary[i11];
            }
        }

        public /* synthetic */ ButtonSecondary(String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map);
        }

        public static /* synthetic */ ButtonSecondary copy$default(ButtonSecondary buttonSecondary, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonSecondary.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = buttonSecondary.action;
            }
            if ((i11 & 4) != 0) {
                str2 = buttonSecondary.context;
            }
            if ((i11 & 8) != 0) {
                testInfo = buttonSecondary.testInfo;
            }
            if ((i11 & 16) != 0) {
                map = buttonSecondary.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return buttonSecondary.copy(str, atomActionDTO, str3, testInfo, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final ButtonSecondary copy(@NotNull String text, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ButtonSecondary(text, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonSecondary)) {
                return false;
            }
            ButtonSecondary buttonSecondary = (ButtonSecondary) other;
            return Intrinsics.d(this.text, buttonSecondary.text) && Intrinsics.d(this.action, buttonSecondary.action) && Intrinsics.d(this.context, buttonSecondary.context) && Intrinsics.d(this.testInfo, buttonSecondary.testInfo) && Intrinsics.d(this.trackingInfo, buttonSecondary.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_button_secondary;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        @NotNull
        public String getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("ButtonSecondary(text=", str, ", action=", atomActionDTO, ", context=");
            C4070a.b(c11, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeParcelable(this.action, flags);
            dest.writeString(this.context);
            dest.writeParcelable(this.testInfo, flags);
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
        public ButtonSecondary(@NotNull String text, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.BUTTON_SECONDARY, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @InterfaceC3999a
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0018HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonSecondarySmall;", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton;", "text", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ButtonSecondarySmall extends CommonButton {

        @NotNull
        public static final Parcelable.Creator<ButtonSecondarySmall> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String context;
        private final TestInfo testInfo;

        @NotNull
        private final String text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<ButtonSecondarySmall> {
            @Override // android.os.Parcelable.Creator
            public final ButtonSecondarySmall createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel.readParcelable(ButtonSecondarySmall.class.getClassLoader());
                String readString2 = parcel.readString();
                TestInfo testInfo = (TestInfo) parcel.readParcelable(ButtonSecondarySmall.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(ButtonSecondarySmall.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new ButtonSecondarySmall(readString, atomActionDTO, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonSecondarySmall[] newArray(int i11) {
                return new ButtonSecondarySmall[i11];
            }
        }

        public /* synthetic */ ButtonSecondarySmall(String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : atomActionDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : map);
        }

        public static /* synthetic */ ButtonSecondarySmall copy$default(ButtonSecondarySmall buttonSecondarySmall, String str, AtomActionDTO atomActionDTO, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = buttonSecondarySmall.text;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = buttonSecondarySmall.action;
            }
            if ((i11 & 4) != 0) {
                str2 = buttonSecondarySmall.context;
            }
            if ((i11 & 8) != 0) {
                testInfo = buttonSecondarySmall.testInfo;
            }
            if ((i11 & 16) != 0) {
                map = buttonSecondarySmall.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return buttonSecondarySmall.copy(str, atomActionDTO, str3, testInfo, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final ButtonSecondarySmall copy(@NotNull String text, AtomActionDTO action, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ButtonSecondarySmall(text, action, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonSecondarySmall)) {
                return false;
            }
            ButtonSecondarySmall buttonSecondarySmall = (ButtonSecondarySmall) other;
            return Intrinsics.d(this.text, buttonSecondarySmall.text) && Intrinsics.d(this.action, buttonSecondarySmall.action) && Intrinsics.d(this.context, buttonSecondarySmall.context) && Intrinsics.d(this.testInfo, buttonSecondarySmall.testInfo) && Intrinsics.d(this.trackingInfo, buttonSecondarySmall.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        public AtomActionDTO getAction() {
            return this.action;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_button_secondary_small;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton
        @NotNull
        public String getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.atoms.data.deprecated.CommonButton, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.context;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            AtomActionDTO atomActionDTO = this.action;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = c.c("ButtonSecondarySmall(text=", str, ", action=", atomActionDTO, ", context=");
            C4070a.b(c11, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(c11, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.text);
            dest.writeParcelable(this.action, flags);
            dest.writeString(this.context);
            dest.writeParcelable(this.testInfo, flags);
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
        public ButtonSecondarySmall(@NotNull String text, AtomActionDTO atomActionDTO, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.BUTTON_SECONDARY_SMALL, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.action = atomActionDTO;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    public /* synthetic */ CommonButton(Type type, String str, TestInfo testInfo, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, testInfo, map);
    }

    public abstract AtomActionDTO getAction();

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public abstract String getText();

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public /* synthetic */ CommonButton(Type type, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, (i11 & 4) != 0 ? null : testInfo, (i11 & 8) != 0 ? null : map, null);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    @NotNull
    public Type getType() {
        return this.type;
    }

    private CommonButton(Type type, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(type, str, map, testInfo);
        this.type = type;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
