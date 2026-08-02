package ru.ozon.app.android.atoms.data.deprecated;

import Ak.b;
import B3.p;
import Bl.C2639a;
import C.J;
import De.C2859b;
import Kk.C3532b;
import N3.C3660k;
import Sc.InterfaceC3999a;
import Xc.a;
import android.os.Parcel;
import android.os.Parcelable;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
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

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002)*BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0017HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006+"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/Labels;", "Lru/ozon/uni/atoms/data/AtomDTO;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "items", "", "Lru/ozon/app/android/atoms/data/deprecated/Labels$Label;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/util/List;)V", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItems", "()Ljava/util/List;", "getItemType", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Label", "LabelType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Labels extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<Labels> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final List<Label> items;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<Labels> {
        @Override // android.os.Parcelable.Creator
        public final Labels createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            TestInfo testInfo = (TestInfo) parcel.readParcelable(Labels.class.getClassLoader());
            int i11 = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i12 = 0;
                while (i12 != readInt) {
                    i12 = C2859b.a(Labels.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (i11 != readInt2) {
                i11 = b.b(Label.CREATOR, parcel, arrayList, i11, 1);
            }
            return new Labels(readString, testInfo, linkedHashMap, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Labels[] newArray(int i11) {
            return new Labels[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/Labels$LabelType;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "TEXT", "ICON", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class LabelType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LabelType[] $VALUES;

        @NotNull
        private final String key;

        @i(name = "text")
        public static final LabelType TEXT = new LabelType("TEXT", 0, "text");

        @i(name = "icon")
        public static final LabelType ICON = new LabelType("ICON", 1, "icon");

        private static final /* synthetic */ LabelType[] $values() {
            return new LabelType[]{TEXT, ICON};
        }

        static {
            LabelType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private LabelType(String str, int i11, String str2) {
            this.key = str2;
        }

        @NotNull
        public static a<LabelType> getEntries() {
            return $ENTRIES;
        }

        public static LabelType valueOf(String str) {
            return (LabelType) Enum.valueOf(LabelType.class, str);
        }

        public static LabelType[] values() {
            return (LabelType[]) $VALUES.clone();
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    public /* synthetic */ Labels(String str, TestInfo testInfo, Map map, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : testInfo, (i11 & 4) != 0 ? null : map, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Labels copy$default(Labels labels, String str, TestInfo testInfo, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = labels.context;
        }
        if ((i11 & 2) != 0) {
            testInfo = labels.testInfo;
        }
        if ((i11 & 4) != 0) {
            map = labels.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            list = labels.items;
        }
        return labels.copy(str, testInfo, map, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<Label> component4() {
        return this.items;
    }

    @NotNull
    public final Labels copy(String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull List<Label> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new Labels(context, testInfo, trackingInfo, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Labels)) {
            return false;
        }
        Labels labels = (Labels) other;
        return Intrinsics.d(this.context, labels.context) && Intrinsics.d(this.testInfo, labels.testInfo) && Intrinsics.d(this.trackingInfo, labels.trackingInfo) && Intrinsics.d(this.items, labels.items);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_labels;
    }

    @NotNull
    public final List<Label> getItems() {
        return this.items;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.context;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.items.hashCode() + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "Labels(context=" + this.context + ", testInfo=" + this.testInfo + ", trackingInfo=" + this.trackingInfo + ", items=" + this.items + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.context);
        dest.writeParcelable(this.testInfo, flags);
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
        Iterator c11 = Bi.a.c(this.items, dest);
        while (c11.hasNext()) {
            ((Label) c11.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Labels(String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, @NotNull List<Label> items) {
        super(Type.LABELS, str, map, testInfo);
        Intrinsics.checkNotNullParameter(items, "items");
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.items = items;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0089\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0006\u0010-\u001a\u00020.J\u0013\u0010/\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00069"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/Labels$Label;", "Landroid/os/Parcelable;", "type", "", "text", "isBold", "", "image", "textColor", "backgroundColor", "tintColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getType", "()Ljava/lang/String;", "getText", "()Z", "getImage", "getTextColor", "getBackgroundColor", "getTintColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Label implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Label> CREATOR = new Creator();
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final String image;
        private final boolean isBold;
        private final TestInfo testInfo;
        private final String text;
        private final String textColor;
        private final String tintColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @NotNull
        private final String type;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Label> {
            @Override // android.os.Parcelable.Creator
            public final Label createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                String readString = parcel2.readString();
                String readString2 = parcel2.readString();
                boolean z11 = parcel2.readInt() != 0;
                String readString3 = parcel2.readString();
                String readString4 = parcel2.readString();
                String readString5 = parcel2.readString();
                boolean z12 = z11;
                String readString6 = parcel2.readString();
                AtomActionDTO atomActionDTO = (AtomActionDTO) parcel2.readParcelable(Label.class.getClassLoader());
                TestInfo testInfo = (TestInfo) parcel2.readParcelable(Label.class.getClassLoader());
                if (parcel2.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel2.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(Label.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                        parcel2 = parcel;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Label(readString, readString2, z12, readString3, readString4, readString5, readString6, atomActionDTO, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Label[] newArray(int i11) {
                return new Label[i11];
            }
        }

        public Label(@NotNull String type, String str, boolean z11, String str2, String str3, String str4, String str5, AtomActionDTO atomActionDTO, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.text = str;
            this.isBold = z11;
            this.image = str2;
            this.textColor = str3;
            this.backgroundColor = str4;
            this.tintColor = str5;
            this.action = atomActionDTO;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Label copy$default(Label label, String str, String str2, boolean z11, String str3, String str4, String str5, String str6, AtomActionDTO atomActionDTO, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = label.type;
            }
            if ((i11 & 2) != 0) {
                str2 = label.text;
            }
            if ((i11 & 4) != 0) {
                z11 = label.isBold;
            }
            if ((i11 & 8) != 0) {
                str3 = label.image;
            }
            if ((i11 & 16) != 0) {
                str4 = label.textColor;
            }
            if ((i11 & 32) != 0) {
                str5 = label.backgroundColor;
            }
            if ((i11 & 64) != 0) {
                str6 = label.tintColor;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomActionDTO = label.action;
            }
            if ((i11 & 256) != 0) {
                testInfo = label.testInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = label.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str7 = str6;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str8 = str4;
            String str9 = str5;
            return label.copy(str, str2, z11, str3, str8, str9, str7, atomActionDTO2, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsBold() {
            return this.isBold;
        }

        /* renamed from: component4, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final Label copy(@NotNull String type, String text, boolean isBold, String image, String textColor, String backgroundColor, String tintColor, AtomActionDTO action, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Label(type, text, isBold, image, textColor, backgroundColor, tintColor, action, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Label)) {
                return false;
            }
            Label label = (Label) other;
            return Intrinsics.d(this.type, label.type) && Intrinsics.d(this.text, label.text) && this.isBold == label.isBold && Intrinsics.d(this.image, label.image) && Intrinsics.d(this.textColor, label.textColor) && Intrinsics.d(this.backgroundColor, label.backgroundColor) && Intrinsics.d(this.tintColor, label.tintColor) && Intrinsics.d(this.action, label.action) && Intrinsics.d(this.testInfo, label.testInfo) && Intrinsics.d(this.trackingInfo, label.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getImage() {
            return this.image;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final String getText() {
            return this.text;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            String str = this.text;
            int a11 = C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.isBold);
            String str2 = this.image;
            int hashCode2 = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.textColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.backgroundColor;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.tintColor;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode7 = (hashCode6 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode7 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isBold() {
            return this.isBold;
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.text;
            boolean z11 = this.isBold;
            String str3 = this.image;
            String str4 = this.textColor;
            String str5 = this.backgroundColor;
            String str6 = this.tintColor;
            AtomActionDTO atomActionDTO = this.action;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("Label(type=", str, ", text=", str2, ", isBold=");
            C5766e.a(", image=", str3, ", textColor=", d11, z11);
            Nh.a.h(d11, str4, ", backgroundColor=", str5, ", tintColor=");
            p.c(str6, ", action=", ", testInfo=", d11, atomActionDTO);
            return C2639a.a(", trackingInfo=", ")", d11, map, testInfo);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type);
            dest.writeString(this.text);
            dest.writeInt(this.isBold ? 1 : 0);
            dest.writeString(this.image);
            dest.writeString(this.textColor);
            dest.writeString(this.backgroundColor);
            dest.writeString(this.tintColor);
            dest.writeParcelable(this.action, flags);
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

        public /* synthetic */ Label(String str, String str2, boolean z11, String str3, String str4, String str5, String str6, AtomActionDTO atomActionDTO, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : atomActionDTO, (i11 & 256) != 0 ? null : testInfo, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : map);
        }
    }
}
