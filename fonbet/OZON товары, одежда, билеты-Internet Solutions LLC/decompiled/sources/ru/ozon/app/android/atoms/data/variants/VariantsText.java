package ru.ozon.app.android.atoms.data.variants;

import Ak.b;
import Bi.a;
import C.J;
import De.C2859b;
import Kk.C3532b;
import Pk0.h;
import Sc.InterfaceC3999a;
import Ve.C4636t5;
import android.os.Parcel;
import android.os.Parcelable;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0017HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lru/ozon/app/android/atoms/data/variants/VariantsText;", "Lru/ozon/uni/atoms/data/AtomDTO;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "items", "", "Lru/ozon/app/android/atoms/data/variants/VariantsText$VariantText;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/util/List;)V", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItems", "()Ljava/util/List;", "getItemType", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "VariantText", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class VariantsText extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<VariantsText> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final List<VariantText> items;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VariantsText> {
        @Override // android.os.Parcelable.Creator
        public final VariantsText createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            TestInfo testInfo = (TestInfo) parcel.readParcelable(VariantsText.class.getClassLoader());
            int i11 = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i12 = 0;
                while (i12 != readInt) {
                    i12 = C2859b.a(VariantsText.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (i11 != readInt2) {
                i11 = b.b(VariantText.CREATOR, parcel, arrayList, i11, 1);
            }
            return new VariantsText(readString, testInfo, linkedHashMap, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VariantsText[] newArray(int i11) {
            return new VariantsText[i11];
        }
    }

    public /* synthetic */ VariantsText(String str, TestInfo testInfo, Map map, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : testInfo, (i11 & 4) != 0 ? null : map, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VariantsText copy$default(VariantsText variantsText, String str, TestInfo testInfo, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = variantsText.context;
        }
        if ((i11 & 2) != 0) {
            testInfo = variantsText.testInfo;
        }
        if ((i11 & 4) != 0) {
            map = variantsText.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            list = variantsText.items;
        }
        return variantsText.copy(str, testInfo, map, list);
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
    public final List<VariantText> component4() {
        return this.items;
    }

    @NotNull
    public final VariantsText copy(String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull List<VariantText> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new VariantsText(context, testInfo, trackingInfo, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VariantsText)) {
            return false;
        }
        VariantsText variantsText = (VariantsText) other;
        return Intrinsics.d(this.context, variantsText.context) && Intrinsics.d(this.testInfo, variantsText.testInfo) && Intrinsics.d(this.trackingInfo, variantsText.trackingInfo) && Intrinsics.d(this.items, variantsText.items);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_variants_text;
    }

    @NotNull
    public final List<VariantText> getItems() {
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
        return "VariantsText(context=" + this.context + ", testInfo=" + this.testInfo + ", trackingInfo=" + this.trackingInfo + ", items=" + this.items + ")";
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
        Iterator c11 = a.c(this.items, dest);
        while (c11.hasNext()) {
            ((VariantText) c11.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariantsText(String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, @NotNull List<VariantText> items) {
        super(Type.VARIANTS_TEXT, str, map, testInfo);
        Intrinsics.checkNotNullParameter(items, "items");
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.items = items;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/atoms/data/variants/VariantsText$VariantText;", "Landroid/os/Parcelable;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isSelected", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;ZLru/ozon/uni/atoms/data/TestInfo;)V", "getTitle", "()Ljava/lang/String;", "()Z", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VariantText implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<VariantText> CREATOR = new Creator();
        private final boolean isSelected;
        private final TestInfo testInfo;

        @NotNull
        private final String title;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VariantText> {
            @Override // android.os.Parcelable.Creator
            public final VariantText createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VariantText(parcel.readString(), parcel.readInt() != 0, (TestInfo) parcel.readParcelable(VariantText.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final VariantText[] newArray(int i11) {
                return new VariantText[i11];
            }
        }

        public VariantText(@NotNull String title, boolean z11, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.isSelected = z11;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ VariantText copy$default(VariantText variantText, String str, boolean z11, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = variantText.title;
            }
            if ((i11 & 2) != 0) {
                z11 = variantText.isSelected;
            }
            if ((i11 & 4) != 0) {
                testInfo = variantText.testInfo;
            }
            return variantText.copy(str, z11, testInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component3, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final VariantText copy(@NotNull String title, boolean isSelected, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new VariantText(title, isSelected, testInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VariantText)) {
                return false;
            }
            VariantText variantText = (VariantText) other;
            return Intrinsics.d(this.title, variantText.title) && this.isSelected == variantText.isSelected && Intrinsics.d(this.testInfo, variantText.testInfo);
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.title.hashCode() * 31, 31, this.isSelected);
            TestInfo testInfo = this.testInfo;
            return a11 + (testInfo == null ? 0 : testInfo.hashCode());
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            boolean z11 = this.isSelected;
            return h.c(C4636t5.b("VariantText(title=", str, ", isSelected=", ", testInfo=", z11), this.testInfo, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeInt(this.isSelected ? 1 : 0);
            dest.writeParcelable(this.testInfo, flags);
        }

        public /* synthetic */ VariantText(String str, boolean z11, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z11, (i11 & 4) != 0 ? null : testInfo);
        }
    }
}
