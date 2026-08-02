package ru.ozon.app.android.atoms.data.list;

import B0.A0;
import C.J;
import De.C2859b;
import Ds.C2880a;
import G.g;
import GR.b;
import Kk.C3532b;
import Nh.a;
import T7.P;
import Ul.C4070a;
import V.e;
import android.os.Parcel;
import android.os.Parcelable;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.app.android.atoms.proto.OneOfSignature;
import ru.ozon.app.android.atoms.proto.ProtoOneOf;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001bB?\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0006\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "type", "Lru/ozon/uni/atoms/data/Type;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "BulletListElement", "IconTextMediumListElement", "IconWithTitleMediumListElement", "NumberedListElement", "TableRowListElement", "ListElement", "Marker", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$BulletListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$IconTextMediumListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$IconWithTitleMediumListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$ListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$NumberedListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$TableRowListElement;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ListElementAtom extends AtomDTO {
    private final String context;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final Type type;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0006\u0010$\u001a\u00020\u001cJ\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u001cHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006/"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$IconTextMediumListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "icon", "", "hasSeparator", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZLru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getIcon", "()Ljava/lang/String;", "getHasSeparator", "()Z", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconTextMediumListElement extends ListElementAtom {

        @NotNull
        public static final Parcelable.Creator<IconTextMediumListElement> CREATOR = new Creator();
        private final String context;
        private final boolean hasSeparator;

        @NotNull
        private final String icon;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<IconTextMediumListElement> {
            @Override // android.os.Parcelable.Creator
            public final IconTextMediumListElement createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                String readString = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                TestInfo testInfo = (TestInfo) parcel.readParcelable(IconTextMediumListElement.class.getClassLoader());
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(IconTextMediumListElement.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new IconTextMediumListElement(create, readString, z11, testInfo, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final IconTextMediumListElement[] newArray(int i11) {
                return new IconTextMediumListElement[i11];
            }
        }

        public /* synthetic */ IconTextMediumListElement(OzonSpannableString ozonSpannableString, String str, boolean z11, TestInfo testInfo, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : map);
        }

        public static /* synthetic */ IconTextMediumListElement copy$default(IconTextMediumListElement iconTextMediumListElement, OzonSpannableString ozonSpannableString, String str, boolean z11, TestInfo testInfo, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = iconTextMediumListElement.text;
            }
            if ((i11 & 2) != 0) {
                str = iconTextMediumListElement.icon;
            }
            if ((i11 & 4) != 0) {
                z11 = iconTextMediumListElement.hasSeparator;
            }
            if ((i11 & 8) != 0) {
                testInfo = iconTextMediumListElement.testInfo;
            }
            if ((i11 & 16) != 0) {
                str2 = iconTextMediumListElement.context;
            }
            if ((i11 & 32) != 0) {
                map = iconTextMediumListElement.trackingInfo;
            }
            String str3 = str2;
            Map map2 = map;
            return iconTextMediumListElement.copy(ozonSpannableString, str, z11, testInfo, str3, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final IconTextMediumListElement copy(@NotNull OzonSpannableString text, @NotNull String icon, boolean hasSeparator, TestInfo testInfo, String context, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new IconTextMediumListElement(text, icon, hasSeparator, testInfo, context, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconTextMediumListElement)) {
                return false;
            }
            IconTextMediumListElement iconTextMediumListElement = (IconTextMediumListElement) other;
            return Intrinsics.d(this.text, iconTextMediumListElement.text) && Intrinsics.d(this.icon, iconTextMediumListElement.icon) && this.hasSeparator == iconTextMediumListElement.hasSeparator && Intrinsics.d(this.testInfo, iconTextMediumListElement.testInfo) && Intrinsics.d(this.context, iconTextMediumListElement.context) && Intrinsics.d(this.trackingInfo, iconTextMediumListElement.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_icon_text_medium_list_element;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(this.text.hashCode() * 31, 31, this.icon), 31, this.hasSeparator);
            TestInfo testInfo = this.testInfo;
            int hashCode = (a11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            String str = this.context;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            String str = this.icon;
            boolean z11 = this.hasSeparator;
            TestInfo testInfo = this.testInfo;
            String str2 = this.context;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder f7 = b.f("IconTextMediumListElement(text=", ozonSpannableString, ", icon=", str, ", hasSeparator=");
            f7.append(z11);
            f7.append(", testInfo=");
            f7.append(testInfo);
            f7.append(", context=");
            return C4070a.a(f7, str2, ", trackingInfo=", map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            dest.writeString(this.icon);
            dest.writeInt(this.hasSeparator ? 1 : 0);
            dest.writeParcelable(this.testInfo, flags);
            dest.writeString(this.context);
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
        public IconTextMediumListElement(@NotNull OzonSpannableString text, @NotNull String icon, boolean z11, TestInfo testInfo, String str, Map<String, TokenizedTrackingInfo> map) {
            super(Type.LIST_ELEMENT_ICON_TEXT_MEDIUM, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.text = text;
            this.icon = icon;
            this.hasSeparator = z11;
            this.testInfo = testInfo;
            this.context = str;
            this.trackingInfo = map;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020\u001eJ\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001eHÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$IconWithTitleMediumListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "icon", "", "hasSeparator", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZLru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "getIcon", "()Ljava/lang/String;", "getHasSeparator", "()Z", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconWithTitleMediumListElement extends ListElementAtom {

        @NotNull
        public static final Parcelable.Creator<IconWithTitleMediumListElement> CREATOR = new Creator();
        private final String context;
        private final boolean hasSeparator;

        @NotNull
        private final String icon;

        @NotNull
        private final OzonSpannableString subtitle;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<IconWithTitleMediumListElement> {
            @Override // android.os.Parcelable.Creator
            public final IconWithTitleMediumListElement createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                OzonSpannableString create = ozonSpannableStringParceler.create(parcel);
                OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel);
                String readString = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                TestInfo testInfo = (TestInfo) parcel.readParcelable(IconWithTitleMediumListElement.class.getClassLoader());
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(IconWithTitleMediumListElement.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new IconWithTitleMediumListElement(create, create2, readString, z11, testInfo, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final IconWithTitleMediumListElement[] newArray(int i11) {
                return new IconWithTitleMediumListElement[i11];
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ IconWithTitleMediumListElement(ru.ozon.uni.atoms.utils.OzonSpannableString r9, ru.ozon.uni.atoms.utils.OzonSpannableString r10, java.lang.String r11, boolean r12, ru.ozon.uni.atoms.data.TestInfo r13, java.lang.String r14, java.util.Map r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
            /*
                r8 = this;
                r0 = r16 & 8
                if (r0 == 0) goto L5
                r12 = 0
            L5:
                r4 = r12
                r12 = r16 & 16
                r0 = 0
                if (r12 == 0) goto Ld
                r5 = r0
                goto Le
            Ld:
                r5 = r13
            Le:
                r12 = r16 & 32
                if (r12 == 0) goto L14
                r6 = r0
                goto L15
            L14:
                r6 = r14
            L15:
                r12 = r16 & 64
                if (r12 == 0) goto L1f
                r7 = r0
                r1 = r9
                r2 = r10
                r3 = r11
                r0 = r8
                goto L24
            L1f:
                r7 = r15
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
            L24:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.atoms.data.list.ListElementAtom.IconWithTitleMediumListElement.<init>(ru.ozon.uni.atoms.utils.OzonSpannableString, ru.ozon.uni.atoms.utils.OzonSpannableString, java.lang.String, boolean, ru.ozon.uni.atoms.data.TestInfo, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ IconWithTitleMediumListElement copy$default(IconWithTitleMediumListElement iconWithTitleMediumListElement, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, boolean z11, TestInfo testInfo, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = iconWithTitleMediumListElement.title;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString2 = iconWithTitleMediumListElement.subtitle;
            }
            if ((i11 & 4) != 0) {
                str = iconWithTitleMediumListElement.icon;
            }
            if ((i11 & 8) != 0) {
                z11 = iconWithTitleMediumListElement.hasSeparator;
            }
            if ((i11 & 16) != 0) {
                testInfo = iconWithTitleMediumListElement.testInfo;
            }
            if ((i11 & 32) != 0) {
                str2 = iconWithTitleMediumListElement.context;
            }
            if ((i11 & 64) != 0) {
                map = iconWithTitleMediumListElement.trackingInfo;
            }
            String str3 = str2;
            Map map2 = map;
            TestInfo testInfo2 = testInfo;
            String str4 = str;
            return iconWithTitleMediumListElement.copy(ozonSpannableString, ozonSpannableString2, str4, z11, testInfo2, str3, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        /* renamed from: component5, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final IconWithTitleMediumListElement copy(@NotNull OzonSpannableString title, @NotNull OzonSpannableString subtitle, @NotNull String icon, boolean hasSeparator, TestInfo testInfo, String context, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new IconWithTitleMediumListElement(title, subtitle, icon, hasSeparator, testInfo, context, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconWithTitleMediumListElement)) {
                return false;
            }
            IconWithTitleMediumListElement iconWithTitleMediumListElement = (IconWithTitleMediumListElement) other;
            return Intrinsics.d(this.title, iconWithTitleMediumListElement.title) && Intrinsics.d(this.subtitle, iconWithTitleMediumListElement.subtitle) && Intrinsics.d(this.icon, iconWithTitleMediumListElement.icon) && this.hasSeparator == iconWithTitleMediumListElement.hasSeparator && Intrinsics.d(this.testInfo, iconWithTitleMediumListElement.testInfo) && Intrinsics.d(this.context, iconWithTitleMediumListElement.context) && Intrinsics.d(this.trackingInfo, iconWithTitleMediumListElement.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_icon_with_title_medium_list_element;
        }

        @NotNull
        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(P.c(this.subtitle, this.title.hashCode() * 31, 31), 31, this.icon), 31, this.hasSeparator);
            TestInfo testInfo = this.testInfo;
            int hashCode = (a11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            String str = this.context;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.title;
            OzonSpannableString ozonSpannableString2 = this.subtitle;
            String str = this.icon;
            boolean z11 = this.hasSeparator;
            TestInfo testInfo = this.testInfo;
            String str2 = this.context;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("IconWithTitleMediumListElement(title=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", subtitle=");
            sb2.append((Object) ozonSpannableString2);
            sb2.append(", icon=");
            C2880a.c(str, ", hasSeparator=", ", testInfo=", sb2, z11);
            sb2.append(testInfo);
            sb2.append(", context=");
            sb2.append(str2);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            ozonSpannableStringParceler.write(this.title, dest, flags);
            ozonSpannableStringParceler.write(this.subtitle, dest, flags);
            dest.writeString(this.icon);
            dest.writeInt(this.hasSeparator ? 1 : 0);
            dest.writeParcelable(this.testInfo, flags);
            dest.writeString(this.context);
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
        public IconWithTitleMediumListElement(@NotNull OzonSpannableString title, @NotNull OzonSpannableString subtitle, @NotNull String icon, boolean z11, TestInfo testInfo, String str, Map<String, TokenizedTrackingInfo> map) {
            super(Type.LIST_ELEMENT_ICON_WITH_TITLE_MEDIUM, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.title = title;
            this.subtitle = subtitle;
            this.icon = icon;
            this.hasSeparator = z11;
            this.testInfo = testInfo;
            this.context = str;
            this.trackingInfo = map;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jk\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0006\u0010*\u001a\u00020!J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020!HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00065"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$ListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom;", "marker", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "atoms", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "hasSeparator", "", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getMarker", "()Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker;", "getTitle", "()Ljava/lang/String;", "getAtoms", "()Ljava/util/List;", "getHasSeparator", "()Z", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ListElement extends ListElementAtom {

        @NotNull
        public static final Parcelable.Creator<ListElement> CREATOR = new Creator();
        private final List<AtomDTO> atoms;
        private final String context;
        private final boolean hasSeparator;

        @NotNull
        private final Marker marker;
        private final TestInfo testInfo;
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<ListElement> {
            @Override // android.os.Parcelable.Creator
            public final ListElement createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Marker marker = (Marker) parcel.readParcelable(ListElement.class.getClassLoader());
                String readString = parcel.readString();
                LinkedHashMap linkedHashMap = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = Bi.b.a(ListElement.class, parcel, arrayList2, i11, 1);
                    }
                    arrayList = arrayList2;
                }
                boolean z11 = parcel.readInt() != 0;
                String readString2 = parcel.readString();
                TestInfo testInfo = (TestInfo) parcel.readParcelable(ListElement.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt2);
                    int i12 = 0;
                    while (i12 != readInt2) {
                        i12 = C2859b.a(ListElement.class, parcel, linkedHashMap, parcel.readString(), i12, 1);
                    }
                }
                return new ListElement(marker, readString, arrayList, z11, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final ListElement[] newArray(int i11) {
                return new ListElement[i11];
            }
        }

        public /* synthetic */ ListElement(Marker marker, String str, List list, boolean z11, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(marker, str, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ ListElement copy$default(ListElement listElement, Marker marker, String str, List list, boolean z11, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                marker = listElement.marker;
            }
            if ((i11 & 2) != 0) {
                str = listElement.title;
            }
            if ((i11 & 4) != 0) {
                list = listElement.atoms;
            }
            if ((i11 & 8) != 0) {
                z11 = listElement.hasSeparator;
            }
            if ((i11 & 16) != 0) {
                str2 = listElement.context;
            }
            if ((i11 & 32) != 0) {
                testInfo = listElement.testInfo;
            }
            if ((i11 & 64) != 0) {
                map = listElement.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str3 = str2;
            List list2 = list;
            return listElement.copy(marker, str, list2, z11, str3, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Marker getMarker() {
            return this.marker;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<AtomDTO> component3() {
            return this.atoms;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component6, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final ListElement copy(@NotNull Marker marker, String title, List<? extends AtomDTO> atoms, boolean hasSeparator, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(marker, "marker");
            return new ListElement(marker, title, atoms, hasSeparator, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListElement)) {
                return false;
            }
            ListElement listElement = (ListElement) other;
            return Intrinsics.d(this.marker, listElement.marker) && Intrinsics.d(this.title, listElement.title) && Intrinsics.d(this.atoms, listElement.atoms) && this.hasSeparator == listElement.hasSeparator && Intrinsics.d(this.context, listElement.context) && Intrinsics.d(this.testInfo, listElement.testInfo) && Intrinsics.d(this.trackingInfo, listElement.trackingInfo);
        }

        public final List<AtomDTO> getAtoms() {
            return this.atoms;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_list_element;
        }

        @NotNull
        public final Marker getMarker() {
            return this.marker;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final String getTitle() {
            return this.title;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.marker.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<AtomDTO> list = this.atoms;
            int a11 = C3532b.a((hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.hasSeparator);
            String str2 = this.context;
            int hashCode3 = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Marker marker = this.marker;
            String str = this.title;
            List<AtomDTO> list = this.atoms;
            boolean z11 = this.hasSeparator;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ListElement(marker=");
            sb2.append(marker);
            sb2.append(", title=");
            sb2.append(str);
            sb2.append(", atoms=");
            sb2.append(list);
            sb2.append(", hasSeparator=");
            sb2.append(z11);
            sb2.append(", context=");
            C4070a.b(sb2, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.marker, flags);
            dest.writeString(this.title);
            List<AtomDTO> list = this.atoms;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    dest.writeParcelable((Parcelable) c11.next(), flags);
                }
            }
            dest.writeInt(this.hasSeparator ? 1 : 0);
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
        /* JADX WARN: Multi-variable type inference failed */
        public ListElement(@NotNull Marker marker, String str, List<? extends AtomDTO> list, boolean z11, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.LIST_ELEMENT, str2, testInfo, map, null);
            Intrinsics.checkNotNullParameter(marker, "marker");
            this.marker = marker;
            this.title = str;
            this.atoms = list;
            this.hasSeparator = z11;
            this.context = str2;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker;", "Landroid/os/Parcelable;", "<init>", "()V", "Number", "Bullet", "Icon", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Bullet;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Number;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ProtoOneOf(label = "type", signatures = {@OneOfSignature(name = "icon", type = Icon.class), @OneOfSignature(name = "number", type = Number.class), @OneOfSignature(name = "bullet", type = Bullet.class)})
    /* loaded from: classes11.dex */
    public static abstract class Marker implements Parcelable {

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Bullet;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker;", "color", "", "<init>", "(Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Bullet extends Marker {

            @NotNull
            public static final Parcelable.Creator<Bullet> CREATOR = new Creator();
            private final String color;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Bullet> {
                @Override // android.os.Parcelable.Creator
                public final Bullet createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Bullet(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Bullet[] newArray(int i11) {
                    return new Bullet[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Bullet() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Bullet copy$default(Bullet bullet, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = bullet.color;
                }
                return bullet.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            @NotNull
            public final Bullet copy(String color) {
                return new Bullet(color);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Bullet) && Intrinsics.d(this.color, ((Bullet) other).color);
            }

            public final String getColor() {
                return this.color;
            }

            public int hashCode() {
                String str = this.color;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Bullet(color=", this.color, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.color);
            }

            public /* synthetic */ Bullet(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }

            public Bullet(String str) {
                super(null);
                this.color = str;
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker;", "image", "", "tintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "getTintColor", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Icon extends Marker {

            @NotNull
            public static final Parcelable.Creator<Icon> CREATOR = new Creator();

            @NotNull
            private final String image;
            private final String tintColor;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Icon> {
                @Override // android.os.Parcelable.Creator
                public final Icon createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Icon(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Icon[] newArray(int i11) {
                    return new Icon[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Icon(@NotNull String image, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.tintColor = str;
            }

            public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = icon.image;
                }
                if ((i11 & 2) != 0) {
                    str2 = icon.tintColor;
                }
                return icon.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final String getTintColor() {
                return this.tintColor;
            }

            @NotNull
            public final Icon copy(@NotNull String image, String tintColor) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new Icon(image, tintColor);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) other;
                return Intrinsics.d(this.image, icon.image) && Intrinsics.d(this.tintColor, icon.tintColor);
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final String getTintColor() {
                return this.tintColor;
            }

            public int hashCode() {
                int hashCode = this.image.hashCode() * 31;
                String str = this.tintColor;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("Icon(image=", this.image, ", tintColor=", this.tintColor, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.image);
                dest.writeString(this.tintColor);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Number;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker;", "number", "", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/String;", "getColor", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Number extends Marker {

            @NotNull
            public static final Parcelable.Creator<Number> CREATOR = new Creator();
            private final String color;

            @NotNull
            private final String number;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Number> {
                @Override // android.os.Parcelable.Creator
                public final Number createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Number(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Number[] newArray(int i11) {
                    return new Number[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Number(@NotNull String number, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(number, "number");
                this.number = number;
                this.color = str;
            }

            public static /* synthetic */ Number copy$default(Number number, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = number.number;
                }
                if ((i11 & 2) != 0) {
                    str2 = number.color;
                }
                return number.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getNumber() {
                return this.number;
            }

            /* renamed from: component2, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            @NotNull
            public final Number copy(@NotNull String number, String color) {
                Intrinsics.checkNotNullParameter(number, "number");
                return new Number(number, color);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Number)) {
                    return false;
                }
                Number number = (Number) other;
                return Intrinsics.d(this.number, number.number) && Intrinsics.d(this.color, number.color);
            }

            public final String getColor() {
                return this.color;
            }

            @NotNull
            public final String getNumber() {
                return this.number;
            }

            public int hashCode() {
                int hashCode = this.number.hashCode() * 31;
                String str = this.color;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("Number(number=", this.number, ", color=", this.color, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.number);
                dest.writeString(this.color);
            }
        }

        public /* synthetic */ Marker(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Marker() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J{\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0006\u0010-\u001a\u00020\"J\u0013\u0010.\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\"HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00068"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$TableRowListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom;", "textRight", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textLeft", "textStyle", "", "textColor", "hasSeparator", "", "rightIcon", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTextRight", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextLeft", "getTextStyle", "()Ljava/lang/String;", "getTextColor", "getHasSeparator", "()Z", "getRightIcon", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TableRowListElement extends ListElementAtom {

        @NotNull
        public static final Parcelable.Creator<TableRowListElement> CREATOR = new Creator();
        private final String context;
        private final boolean hasSeparator;
        private final String rightIcon;
        private final TestInfo testInfo;
        private final String textColor;

        @NotNull
        private final OzonSpannableString textLeft;

        @NotNull
        private final OzonSpannableString textRight;
        private final String textStyle;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<TableRowListElement> {
            @Override // android.os.Parcelable.Creator
            public final TableRowListElement createFromParcel(Parcel parcel) {
                OzonSpannableString ozonSpannableString;
                boolean z11;
                LinkedHashMap linkedHashMap;
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                OzonSpannableString create = ozonSpannableStringParceler.create(parcel2);
                OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel2);
                String readString = parcel2.readString();
                String readString2 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    ozonSpannableString = create;
                    z11 = true;
                } else {
                    ozonSpannableString = create;
                    z11 = false;
                }
                String readString3 = parcel2.readString();
                String readString4 = parcel2.readString();
                TestInfo testInfo = (TestInfo) parcel2.readParcelable(TableRowListElement.class.getClassLoader());
                if (parcel2.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel2.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(TableRowListElement.class, parcel2, linkedHashMap2, parcel2.readString(), i11, 1);
                        parcel2 = parcel;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new TableRowListElement(ozonSpannableString, create2, readString, readString2, z11, readString3, readString4, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final TableRowListElement[] newArray(int i11) {
                return new TableRowListElement[i11];
            }
        }

        public /* synthetic */ TableRowListElement(OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, String str2, boolean z11, String str3, String str4, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, ozonSpannableString2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : testInfo, (i11 & 256) != 0 ? null : map);
        }

        public static /* synthetic */ TableRowListElement copy$default(TableRowListElement tableRowListElement, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, String str2, boolean z11, String str3, String str4, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = tableRowListElement.textRight;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString2 = tableRowListElement.textLeft;
            }
            if ((i11 & 4) != 0) {
                str = tableRowListElement.textStyle;
            }
            if ((i11 & 8) != 0) {
                str2 = tableRowListElement.textColor;
            }
            if ((i11 & 16) != 0) {
                z11 = tableRowListElement.hasSeparator;
            }
            if ((i11 & 32) != 0) {
                str3 = tableRowListElement.rightIcon;
            }
            if ((i11 & 64) != 0) {
                str4 = tableRowListElement.context;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                testInfo = tableRowListElement.testInfo;
            }
            if ((i11 & 256) != 0) {
                map = tableRowListElement.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str5 = str3;
            String str6 = str4;
            boolean z12 = z11;
            String str7 = str;
            return tableRowListElement.copy(ozonSpannableString, ozonSpannableString2, str7, str2, z12, str5, str6, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTextRight() {
            return this.textRight;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getTextLeft() {
            return this.textLeft;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTextStyle() {
            return this.textStyle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        /* renamed from: component6, reason: from getter */
        public final String getRightIcon() {
            return this.rightIcon;
        }

        /* renamed from: component7, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component8, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final TableRowListElement copy(@NotNull OzonSpannableString textRight, @NotNull OzonSpannableString textLeft, String textStyle, String textColor, boolean hasSeparator, String rightIcon, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(textRight, "textRight");
            Intrinsics.checkNotNullParameter(textLeft, "textLeft");
            return new TableRowListElement(textRight, textLeft, textStyle, textColor, hasSeparator, rightIcon, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TableRowListElement)) {
                return false;
            }
            TableRowListElement tableRowListElement = (TableRowListElement) other;
            return Intrinsics.d(this.textRight, tableRowListElement.textRight) && Intrinsics.d(this.textLeft, tableRowListElement.textLeft) && Intrinsics.d(this.textStyle, tableRowListElement.textStyle) && Intrinsics.d(this.textColor, tableRowListElement.textColor) && this.hasSeparator == tableRowListElement.hasSeparator && Intrinsics.d(this.rightIcon, tableRowListElement.rightIcon) && Intrinsics.d(this.context, tableRowListElement.context) && Intrinsics.d(this.testInfo, tableRowListElement.testInfo) && Intrinsics.d(this.trackingInfo, tableRowListElement.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_table_row_list_element;
        }

        public final String getRightIcon() {
            return this.rightIcon;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final OzonSpannableString getTextLeft() {
            return this.textLeft;
        }

        @NotNull
        public final OzonSpannableString getTextRight() {
            return this.textRight;
        }

        public final String getTextStyle() {
            return this.textStyle;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int c11 = P.c(this.textLeft, this.textRight.hashCode() * 31, 31);
            String str = this.textStyle;
            int hashCode = (c11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.textColor;
            int a11 = C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.hasSeparator);
            String str3 = this.rightIcon;
            int hashCode2 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.context;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.textRight;
            OzonSpannableString ozonSpannableString2 = this.textLeft;
            String str = this.textStyle;
            String str2 = this.textColor;
            boolean z11 = this.hasSeparator;
            String str3 = this.rightIcon;
            String str4 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("TableRowListElement(textRight=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", textLeft=");
            sb2.append((Object) ozonSpannableString2);
            sb2.append(", textStyle=");
            a.h(sb2, str, ", textColor=", str2, ", hasSeparator=");
            C5766e.a(", rightIcon=", str3, ", context=", sb2, z11);
            C4070a.b(sb2, str4, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            ozonSpannableStringParceler.write(this.textRight, dest, flags);
            ozonSpannableStringParceler.write(this.textLeft, dest, flags);
            dest.writeString(this.textStyle);
            dest.writeString(this.textColor);
            dest.writeInt(this.hasSeparator ? 1 : 0);
            dest.writeString(this.rightIcon);
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
        public TableRowListElement(@NotNull OzonSpannableString textRight, @NotNull OzonSpannableString textLeft, String str, String str2, boolean z11, String str3, String str4, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.LIST_ELEMENT_TABLE_ROW, str4, testInfo, map, null);
            Intrinsics.checkNotNullParameter(textRight, "textRight");
            Intrinsics.checkNotNullParameter(textLeft, "textLeft");
            this.textRight = textRight;
            this.textLeft = textLeft;
            this.textStyle = str;
            this.textColor = str2;
            this.hasSeparator = z11;
            this.rightIcon = str3;
            this.context = str4;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    public /* synthetic */ ListElementAtom(Type type, String str, TestInfo testInfo, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, testInfo, map);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0006\u0010$\u001a\u00020\u001cJ\u0013\u0010%\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u001cHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00060"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$BulletListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textColor", "", "hasSeparator", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "context", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZLru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTextColor", "()Ljava/lang/String;", "getHasSeparator", "()Z", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getContext", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class BulletListElement extends ListElementAtom {
        private final String context;
        private final boolean hasSeparator;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;

        @NotNull
        private final String textColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<BulletListElement> CREATOR = new Creator();

        @NotNull
        private static final String defaultColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$BulletListElement$Companion;", "", "<init>", "()V", "defaultColor", "", "getDefaultColor", "()Ljava/lang/String;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final String getDefaultColor() {
                return BulletListElement.defaultColor;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<BulletListElement> {
            @Override // android.os.Parcelable.Creator
            public final BulletListElement createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
                String readString = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                TestInfo testInfo = (TestInfo) parcel.readParcelable(BulletListElement.class.getClassLoader());
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(BulletListElement.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new BulletListElement(create, readString, z11, testInfo, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final BulletListElement[] newArray(int i11) {
                return new BulletListElement[i11];
            }
        }

        public /* synthetic */ BulletListElement(OzonSpannableString ozonSpannableString, String str, boolean z11, TestInfo testInfo, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? defaultColor : str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : testInfo, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : map);
        }

        public static /* synthetic */ BulletListElement copy$default(BulletListElement bulletListElement, OzonSpannableString ozonSpannableString, String str, boolean z11, TestInfo testInfo, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = bulletListElement.text;
            }
            if ((i11 & 2) != 0) {
                str = bulletListElement.textColor;
            }
            if ((i11 & 4) != 0) {
                z11 = bulletListElement.hasSeparator;
            }
            if ((i11 & 8) != 0) {
                testInfo = bulletListElement.testInfo;
            }
            if ((i11 & 16) != 0) {
                str2 = bulletListElement.context;
            }
            if ((i11 & 32) != 0) {
                map = bulletListElement.trackingInfo;
            }
            String str3 = str2;
            Map map2 = map;
            return bulletListElement.copy(ozonSpannableString, str, z11, testInfo, str3, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final BulletListElement copy(@NotNull OzonSpannableString text, @NotNull String textColor, boolean hasSeparator, TestInfo testInfo, String context, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            return new BulletListElement(text, textColor, hasSeparator, testInfo, context, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BulletListElement)) {
                return false;
            }
            BulletListElement bulletListElement = (BulletListElement) other;
            return Intrinsics.d(this.text, bulletListElement.text) && Intrinsics.d(this.textColor, bulletListElement.textColor) && this.hasSeparator == bulletListElement.hasSeparator && Intrinsics.d(this.testInfo, bulletListElement.testInfo) && Intrinsics.d(this.context, bulletListElement.context) && Intrinsics.d(this.trackingInfo, bulletListElement.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_bullet_list_element;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        public final String getTextColor() {
            return this.textColor;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(this.text.hashCode() * 31, 31, this.textColor), 31, this.hasSeparator);
            TestInfo testInfo = this.testInfo;
            int hashCode = (a11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            String str = this.context;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            String str = this.textColor;
            boolean z11 = this.hasSeparator;
            TestInfo testInfo = this.testInfo;
            String str2 = this.context;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder f7 = b.f("BulletListElement(text=", ozonSpannableString, ", textColor=", str, ", hasSeparator=");
            f7.append(z11);
            f7.append(", testInfo=");
            f7.append(testInfo);
            f7.append(", context=");
            return C4070a.a(f7, str2, ", trackingInfo=", map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            dest.writeString(this.textColor);
            dest.writeInt(this.hasSeparator ? 1 : 0);
            dest.writeParcelable(this.testInfo, flags);
            dest.writeString(this.context);
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
        public BulletListElement(@NotNull OzonSpannableString text, @NotNull String textColor, boolean z11, TestInfo testInfo, String str, Map<String, TokenizedTrackingInfo> map) {
            super(Type.LIST_ELEMENT_BULLET, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            this.text = text;
            this.textColor = textColor;
            this.hasSeparator = z11;
            this.testInfo = testInfo;
            this.context = str;
            this.trackingInfo = map;
        }
    }

    public /* synthetic */ ListElementAtom(Type type, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, (i11 & 4) != 0 ? null : testInfo, (i11 & 8) != 0 ? null : map, null);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    @NotNull
    public Type getType() {
        return this.type;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010'\u001a\u00020\u001eJ\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001eHÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, d2 = {"Lru/ozon/app/android/atoms/data/list/ListElementAtom$NumberedListElement;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "number", "textColor", "", "hasSeparator", "", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getNumber", "getTextColor", "()Ljava/lang/String;", "getHasSeparator", "()Z", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NumberedListElement extends ListElementAtom {

        @NotNull
        public static final Parcelable.Creator<NumberedListElement> CREATOR = new Creator();
        private final String context;
        private final boolean hasSeparator;

        @NotNull
        private final OzonSpannableString number;
        private final TestInfo testInfo;

        @NotNull
        private final OzonSpannableString text;

        @NotNull
        private final String textColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<NumberedListElement> {
            @Override // android.os.Parcelable.Creator
            public final NumberedListElement createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
                OzonSpannableString create = ozonSpannableStringParceler.create(parcel);
                OzonSpannableString create2 = ozonSpannableStringParceler.create(parcel);
                String readString = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                String readString2 = parcel.readString();
                TestInfo testInfo = (TestInfo) parcel.readParcelable(NumberedListElement.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = C2859b.a(NumberedListElement.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new NumberedListElement(create, create2, readString, z11, readString2, testInfo, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final NumberedListElement[] newArray(int i11) {
                return new NumberedListElement[i11];
            }
        }

        public /* synthetic */ NumberedListElement(OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, boolean z11, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? new OzonSpannableString("1") : ozonSpannableString2, (i11 & 4) != 0 ? BulletListElement.INSTANCE.getDefaultColor() : str, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ NumberedListElement copy$default(NumberedListElement numberedListElement, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, boolean z11, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = numberedListElement.text;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString2 = numberedListElement.number;
            }
            if ((i11 & 4) != 0) {
                str = numberedListElement.textColor;
            }
            if ((i11 & 8) != 0) {
                z11 = numberedListElement.hasSeparator;
            }
            if ((i11 & 16) != 0) {
                str2 = numberedListElement.context;
            }
            if ((i11 & 32) != 0) {
                testInfo = numberedListElement.testInfo;
            }
            if ((i11 & 64) != 0) {
                map = numberedListElement.trackingInfo;
            }
            TestInfo testInfo2 = testInfo;
            Map map2 = map;
            String str3 = str2;
            String str4 = str;
            return numberedListElement.copy(ozonSpannableString, ozonSpannableString2, str4, z11, str3, testInfo2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getNumber() {
            return this.number;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        /* renamed from: component5, reason: from getter */
        public final String getContext() {
            return this.context;
        }

        /* renamed from: component6, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final NumberedListElement copy(@NotNull OzonSpannableString text, @NotNull OzonSpannableString number, @NotNull String textColor, boolean hasSeparator, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            return new NumberedListElement(text, number, textColor, hasSeparator, context, testInfo, trackingInfo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NumberedListElement)) {
                return false;
            }
            NumberedListElement numberedListElement = (NumberedListElement) other;
            return Intrinsics.d(this.text, numberedListElement.text) && Intrinsics.d(this.number, numberedListElement.number) && Intrinsics.d(this.textColor, numberedListElement.textColor) && this.hasSeparator == numberedListElement.hasSeparator && Intrinsics.d(this.context, numberedListElement.context) && Intrinsics.d(this.testInfo, numberedListElement.testInfo) && Intrinsics.d(this.trackingInfo, numberedListElement.trackingInfo);
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public String getContext() {
            return this.context;
        }

        public final boolean getHasSeparator() {
            return this.hasSeparator;
        }

        @Override // lk0.InterfaceC7968a
        public int getItemType() {
            return R$id.atom_type_numbered_list_element;
        }

        @NotNull
        public final OzonSpannableString getNumber() {
            return this.number;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        @NotNull
        public final String getTextColor() {
            return this.textColor;
        }

        @Override // ru.ozon.app.android.atoms.data.list.ListElementAtom, ru.ozon.uni.atoms.data.AtomDTO
        public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(P.c(this.number, this.text.hashCode() * 31, 31), 31, this.textColor), 31, this.hasSeparator);
            String str = this.context;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode2 = (hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            OzonSpannableString ozonSpannableString2 = this.number;
            String str = this.textColor;
            boolean z11 = this.hasSeparator;
            String str2 = this.context;
            TestInfo testInfo = this.testInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("NumberedListElement(text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", number=");
            sb2.append((Object) ozonSpannableString2);
            sb2.append(", textColor=");
            C2880a.c(str, ", hasSeparator=", ", context=", sb2, z11);
            C4070a.b(sb2, str2, ", testInfo=", testInfo, ", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler ozonSpannableStringParceler = OzonSpannableStringParceler.INSTANCE;
            ozonSpannableStringParceler.write(this.text, dest, flags);
            ozonSpannableStringParceler.write(this.number, dest, flags);
            dest.writeString(this.textColor);
            dest.writeInt(this.hasSeparator ? 1 : 0);
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
        public NumberedListElement(@NotNull OzonSpannableString text, @NotNull OzonSpannableString number, @NotNull String textColor, boolean z11, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
            super(Type.LIST_ELEMENT_NUMBERED, str, testInfo, map, null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            this.text = text;
            this.number = number;
            this.textColor = textColor;
            this.hasSeparator = z11;
            this.context = str;
            this.testInfo = testInfo;
            this.trackingInfo = map;
        }
    }

    private ListElementAtom(Type type, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(type, str, map, testInfo);
        this.type = type;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
