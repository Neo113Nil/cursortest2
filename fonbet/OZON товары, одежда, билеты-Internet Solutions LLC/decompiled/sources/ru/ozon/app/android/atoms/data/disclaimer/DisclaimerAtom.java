package ru.ozon.app.android.atoms.data.disclaimer;

import Bi.b;
import C.J;
import De.C2859b;
import Hj.C3143a;
import Lc.a;
import Sc.InterfaceC3999a;
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
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000234BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J_\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0006\u0010'\u001a\u00020\u001fJ\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u001fHÖ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00065"}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Header;", "body", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Body;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "backgroundColor", "", "buttons", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Header;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Body;Lru/ozon/uni/atoms/data/button/Icon;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getHeader", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Header;", "getBody", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Body;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getBackgroundColor", "()Ljava/lang/String;", "getButtons", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Body", "Header", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DisclaimerAtom extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<DisclaimerAtom> CREATOR = new Creator();
    private final String backgroundColor;

    @NotNull
    private final Body body;
    private final List<ButtonV3Atom.SmallBorderlessButton> buttons;
    private final Header header;

    @NotNull
    private final Icon icon;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<DisclaimerAtom> {
        @Override // android.os.Parcelable.Creator
        public final DisclaimerAtom createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Header createFromParcel = parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel);
            Body createFromParcel2 = Body.CREATOR.createFromParcel(parcel);
            Icon icon = (Icon) parcel.readParcelable(DisclaimerAtom.class.getClassLoader());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = b.a(DisclaimerAtom.class, parcel, arrayList2, i11, 1);
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(DisclaimerAtom.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new DisclaimerAtom(createFromParcel, createFromParcel2, icon, readString, arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final DisclaimerAtom[] newArray(int i11) {
            return new DisclaimerAtom[i11];
        }
    }

    public /* synthetic */ DisclaimerAtom(Header header, Body body, Icon icon, String str, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(header, body, icon, str, list, (i11 & 32) != 0 ? null : map);
    }

    public static /* synthetic */ DisclaimerAtom copy$default(DisclaimerAtom disclaimerAtom, Header header, Body body, Icon icon, String str, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = disclaimerAtom.header;
        }
        if ((i11 & 2) != 0) {
            body = disclaimerAtom.body;
        }
        if ((i11 & 4) != 0) {
            icon = disclaimerAtom.icon;
        }
        if ((i11 & 8) != 0) {
            str = disclaimerAtom.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            list = disclaimerAtom.buttons;
        }
        if ((i11 & 32) != 0) {
            map = disclaimerAtom.trackingInfo;
        }
        List list2 = list;
        Map map2 = map;
        return disclaimerAtom.copy(header, body, icon, str, list2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Body getBody() {
        return this.body;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ButtonV3Atom.SmallBorderlessButton> component5() {
        return this.buttons;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final DisclaimerAtom copy(Header header, @NotNull Body body, @NotNull Icon icon, String backgroundColor, List<ButtonV3Atom.SmallBorderlessButton> buttons, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new DisclaimerAtom(header, body, icon, backgroundColor, buttons, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerAtom)) {
            return false;
        }
        DisclaimerAtom disclaimerAtom = (DisclaimerAtom) other;
        return Intrinsics.d(this.header, disclaimerAtom.header) && Intrinsics.d(this.body, disclaimerAtom.body) && Intrinsics.d(this.icon, disclaimerAtom.icon) && Intrinsics.d(this.backgroundColor, disclaimerAtom.backgroundColor) && Intrinsics.d(this.buttons, disclaimerAtom.buttons) && Intrinsics.d(this.trackingInfo, disclaimerAtom.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Body getBody() {
        return this.body;
    }

    public final List<ButtonV3Atom.SmallBorderlessButton> getButtons() {
        return this.buttons;
    }

    public final Header getHeader() {
        return this.header;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_disclaimer_atom;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Header header = this.header;
        int a11 = a.a(this.icon, (this.body.hashCode() + ((header == null ? 0 : header.hashCode()) * 31)) * 31, 31);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        List<ButtonV3Atom.SmallBorderlessButton> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Header header = this.header;
        Body body = this.body;
        Icon icon = this.icon;
        String str = this.backgroundColor;
        List<ButtonV3Atom.SmallBorderlessButton> list = this.buttons;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("DisclaimerAtom(header=");
        sb2.append(header);
        sb2.append(", body=");
        sb2.append(body);
        sb2.append(", icon=");
        sb2.append(icon);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", buttons=");
        return C3143a.h(sb2, list, ", trackingInfo=", map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Header header = this.header;
        if (header == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            header.writeToParcel(dest, flags);
        }
        this.body.writeToParcel(dest, flags);
        dest.writeParcelable(this.icon, flags);
        dest.writeString(this.backgroundColor);
        List<ButtonV3Atom.SmallBorderlessButton> list = this.buttons;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                dest.writeParcelable((Parcelable) c11.next(), flags);
            }
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
    public DisclaimerAtom(Header header, @NotNull Body body, @NotNull Icon icon, String str, List<ButtonV3Atom.SmallBorderlessButton> list, Map<String, TokenizedTrackingInfo> map) {
        super(Type.DISCLAIMER, null, map, null, 8, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.header = header;
        this.body = body;
        this.icon = icon;
        this.backgroundColor = str;
        this.buttons = list;
        this.trackingInfo = map;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Body;", "Landroid/os/Parcelable;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "color", "", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getColor", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Body implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Body> CREATOR = new Creator();
        private final String color;

        @NotNull
        private final OzonSpannableString text;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<Body> {
            @Override // android.os.Parcelable.Creator
            public final Body createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Body(OzonSpannableStringParceler.INSTANCE.create(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Body[] newArray(int i11) {
                return new Body[i11];
            }
        }

        public Body(@NotNull OzonSpannableString text, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.color = str;
        }

        public static /* synthetic */ Body copy$default(Body body, OzonSpannableString ozonSpannableString, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = body.text;
            }
            if ((i11 & 2) != 0) {
                str = body.color;
            }
            return body.copy(ozonSpannableString, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final Body copy(@NotNull OzonSpannableString text, String color) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Body(text, color);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Body)) {
                return false;
            }
            Body body = (Body) other;
            return Intrinsics.d(this.text, body.text) && Intrinsics.d(this.color, body.color);
        }

        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.color;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            return "Body(text=" + ((Object) ozonSpannableString) + ", color=" + this.color + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            dest.writeString(this.color);
        }

        public /* synthetic */ Body(OzonSpannableString ozonSpannableString, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_TETRIARY.getValue() : str);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Header;", "Landroid/os/Parcelable;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "color", "", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getColor", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Header implements Parcelable {
        private final String color;

        @NotNull
        private final OzonSpannableString text;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<Header> CREATOR = new Creator();

        @NotNull
        private static final StyleParser.OzColor DEFAULT_COLOR = StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom$Header$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/uikit/common/StyleParser$OzColor;", "DEFAULT_COLOR", "Lru/ozon/uni/android/uikit/common/StyleParser$OzColor;", "getDEFAULT_COLOR", "()Lru/ozon/uni/android/uikit/common/StyleParser$OzColor;", "getDEFAULT_COLOR$annotations", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final StyleParser.OzColor getDEFAULT_COLOR() {
                return Header.DEFAULT_COLOR;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<Header> {
            @Override // android.os.Parcelable.Creator
            public final Header createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Header(OzonSpannableStringParceler.INSTANCE.create(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Header[] newArray(int i11) {
                return new Header[i11];
            }
        }

        public Header(@NotNull OzonSpannableString text, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.color = str;
        }

        public static /* synthetic */ Header copy$default(Header header, OzonSpannableString ozonSpannableString, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = header.text;
            }
            if ((i11 & 2) != 0) {
                str = header.color;
            }
            return header.copy(ozonSpannableString, str);
        }

        @NotNull
        public static final StyleParser.OzColor getDEFAULT_COLOR() {
            return INSTANCE.getDEFAULT_COLOR();
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final Header copy(@NotNull OzonSpannableString text, String color) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Header(text, color);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.text, header.text) && Intrinsics.d(this.color, header.color);
        }

        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.color;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.text;
            return "Header(text=" + ((Object) ozonSpannableString) + ", color=" + this.color + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
            dest.writeString(this.color);
        }

        public /* synthetic */ Header(OzonSpannableString ozonSpannableString, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonSpannableString, (i11 & 2) != 0 ? DEFAULT_COLOR.getValue() : str);
        }
    }
}
