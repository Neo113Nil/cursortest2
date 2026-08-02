package ru.ozon.app.android.atoms.data.deprecated;

import C.J;
import Cm.e;
import De.C2859b;
import G.g;
import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000212B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010%\u001a\u00020\u001dJ\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u001dHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00063"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/BulletElements;", "Lru/ozon/uni/atoms/data/AtomDTO;", "style", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements$BulletStyle;", "textColor", "", "items", "", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements$Item;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/deprecated/BulletElements$BulletStyle;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getStyle", "()Lru/ozon/app/android/atoms/data/deprecated/BulletElements$BulletStyle;", "getTextColor", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BulletStyle", "Item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BulletElements extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<BulletElements> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final List<Item> items;

    @NotNull
    private final BulletStyle style;
    private final TestInfo testInfo;
    private final String textColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/BulletElements$BulletStyle;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "SMALL", "MEDIUM", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BulletStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ BulletStyle[] $VALUES;

        @NotNull
        private final String key;

        @i(name = "small")
        public static final BulletStyle SMALL = new BulletStyle("SMALL", 0, "small");

        @i(name = "medium")
        public static final BulletStyle MEDIUM = new BulletStyle("MEDIUM", 1, "medium");

        private static final /* synthetic */ BulletStyle[] $values() {
            return new BulletStyle[]{SMALL, MEDIUM};
        }

        static {
            BulletStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private BulletStyle(String str, int i11, String str2) {
            this.key = str2;
        }

        @NotNull
        public static a<BulletStyle> getEntries() {
            return $ENTRIES;
        }

        public static BulletStyle valueOf(String str) {
            return (BulletStyle) Enum.valueOf(BulletStyle.class, str);
        }

        public static BulletStyle[] values() {
            return (BulletStyle[]) $VALUES.clone();
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<BulletElements> {
        @Override // android.os.Parcelable.Creator
        public final BulletElements createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BulletStyle valueOf = BulletStyle.valueOf(parcel.readString());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Ak.b.b(Item.CREATOR, parcel, arrayList, i11, 1);
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(BulletElements.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new BulletElements(valueOf, readString, arrayList, readString2, linkedHashMap, (TestInfo) parcel.readParcelable(BulletElements.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BulletElements[] newArray(int i11) {
            return new BulletElements[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/BulletElements$Item;", "Landroid/os/Parcelable;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Item implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Item> CREATOR = new Creator();

        @NotNull
        private final OzonSpannableString text;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Item> {
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Item(OzonSpannableStringParceler.INSTANCE.create(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i11) {
                return new Item[i11];
            }
        }

        public Item(@NotNull OzonSpannableString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public static /* synthetic */ Item copy$default(Item item, OzonSpannableString ozonSpannableString, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = item.text;
            }
            return item.copy(ozonSpannableString);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        public final Item copy(@NotNull OzonSpannableString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Item(text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Item) && Intrinsics.d(this.text, ((Item) other).text);
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return "Item(text=" + ((Object) this.text) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BulletElements(ru.ozon.app.android.atoms.data.deprecated.BulletElements.BulletStyle r2, java.lang.String r3, java.util.List r4, java.lang.String r5, java.util.Map r6, ru.ozon.uni.atoms.data.TestInfo r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            ru.ozon.app.android.atoms.data.deprecated.BulletElements$BulletStyle r2 = ru.ozon.app.android.atoms.data.deprecated.BulletElements.BulletStyle.MEDIUM
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 8
            if (r9 == 0) goto L11
            r5 = r0
        L11:
            r9 = r8 & 16
            if (r9 == 0) goto L16
            r6 = r0
        L16:
            r8 = r8 & 32
            if (r8 == 0) goto L22
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L29
        L22:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L29:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.deprecated.BulletElements.<init>(ru.ozon.app.android.atoms.data.deprecated.BulletElements$BulletStyle, java.lang.String, java.util.List, java.lang.String, java.util.Map, ru.ozon.uni.atoms.data.TestInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ BulletElements copy$default(BulletElements bulletElements, BulletStyle bulletStyle, String str, List list, String str2, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bulletStyle = bulletElements.style;
        }
        if ((i11 & 2) != 0) {
            str = bulletElements.textColor;
        }
        if ((i11 & 4) != 0) {
            list = bulletElements.items;
        }
        if ((i11 & 8) != 0) {
            str2 = bulletElements.context;
        }
        if ((i11 & 16) != 0) {
            map = bulletElements.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            testInfo = bulletElements.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        return bulletElements.copy(bulletStyle, str, list, str2, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BulletStyle getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final List<Item> component3() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final BulletElements copy(@NotNull BulletStyle style, String textColor, @NotNull List<Item> items, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(items, "items");
        return new BulletElements(style, textColor, items, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulletElements)) {
            return false;
        }
        BulletElements bulletElements = (BulletElements) other;
        return this.style == bulletElements.style && Intrinsics.d(this.textColor, bulletElements.textColor) && Intrinsics.d(this.items, bulletElements.items) && Intrinsics.d(this.context, bulletElements.context) && Intrinsics.d(this.trackingInfo, bulletElements.trackingInfo) && Intrinsics.d(this.testInfo, bulletElements.testInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_bullet_elements;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    @NotNull
    public final BulletStyle getStyle() {
        return this.style;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.style.hashCode() * 31;
        String str = this.textColor;
        int b11 = g.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.items);
        String str2 = this.context;
        int hashCode2 = (b11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BulletStyle bulletStyle = this.style;
        String str = this.textColor;
        List<Item> list = this.items;
        String str2 = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("BulletElements(style=");
        sb2.append(bulletStyle);
        sb2.append(", textColor=");
        sb2.append(str);
        sb2.append(", items=");
        e.i(", context=", str2, ", trackingInfo=", sb2, list);
        return Ns.b.b(", testInfo=", ")", sb2, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.style.name());
        dest.writeString(this.textColor);
        Iterator c11 = Bi.a.c(this.items, dest);
        while (c11.hasNext()) {
            ((Item) c11.next()).writeToParcel(dest, flags);
        }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletElements(@NotNull BulletStyle style, String str, @NotNull List<Item> items, String str2, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(Type.BULLET_ELEMENTS, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(items, "items");
        this.style = style;
        this.textColor = str;
        this.items = items;
        this.context = str2;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
