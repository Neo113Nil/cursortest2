package ru.ozon.android.messenger.blocks.curtain;

import C.J;
import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class c implements g, Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84971a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextDTO f84972b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageDTO f84973c;

    /* renamed from: d, reason: collision with root package name */
    private final TextDTO f84974d;

    /* renamed from: e, reason: collision with root package name */
    private final List<ButtonV3DTO> f84975e;

    /* renamed from: f, reason: collision with root package name */
    private final String f84976f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f84977g;

    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ru.ozon.android.messenger.framework.presentation.models.c createFromParcel = ru.ozon.android.messenger.framework.presentation.models.c.CREATOR.createFromParcel(parcel);
            TextDTO textDTO = (TextDTO) parcel.readParcelable(c.class.getClassLoader());
            ImageDTO imageDTO = (ImageDTO) parcel.readParcelable(c.class.getClassLoader());
            TextDTO textDTO2 = (TextDTO) parcel.readParcelable(c.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = Bi.b.a(c.class, parcel, arrayList, i11, 1);
                }
                linkedHashMap = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    linkedHashMap2.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new c(createFromParcel, textDTO, imageDTO, textDTO2, arrayList, readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull TextDTO title, ImageDTO imageDTO, TextDTO textDTO, List<ButtonV3DTO> list, String str, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f84971a = blockId;
        this.f84972b = title;
        this.f84973c = imageDTO;
        this.f84974d = textDTO;
        this.f84975e = list;
        this.f84976f = str;
        this.f84977g = map;
    }

    public final List<ButtonV3DTO> a() {
        return this.f84975e;
    }

    public final ImageDTO b() {
        return this.f84973c;
    }

    public final TextDTO c() {
        return this.f84974d;
    }

    @NotNull
    public final TextDTO d() {
        return this.f84972b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Map<String, MessengerTrackingInfo> e() {
        return this.f84977g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f84971a, cVar.f84971a) && Intrinsics.d(this.f84972b, cVar.f84972b) && Intrinsics.d(this.f84973c, cVar.f84973c) && Intrinsics.d(this.f84974d, cVar.f84974d) && Intrinsics.d(this.f84975e, cVar.f84975e) && Intrinsics.d(this.f84976f, cVar.f84976f) && Intrinsics.d(this.f84977g, cVar.f84977g);
    }

    public final String getBackgroundColor() {
        return this.f84976f;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84971a;
    }

    public final int hashCode() {
        int a11 = Ns.b.a(this.f84972b, this.f84971a.hashCode() * 31, 31);
        ImageDTO imageDTO = this.f84973c;
        int hashCode = (a11 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        TextDTO textDTO = this.f84974d;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<ButtonV3DTO> list = this.f84975e;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f84976f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.f84977g;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurtainModalVO(blockId=");
        sb2.append(this.f84971a);
        sb2.append(", title=");
        sb2.append(this.f84972b);
        sb2.append(", image=");
        sb2.append(this.f84973c);
        sb2.append(", message=");
        sb2.append(this.f84974d);
        sb2.append(", buttons=");
        sb2.append(this.f84975e);
        sb2.append(", backgroundColor=");
        sb2.append(this.f84976f);
        sb2.append(", trackingInfo=");
        return P.f(sb2, this.f84977g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84971a.writeToParcel(dest, i11);
        dest.writeParcelable(this.f84972b, i11);
        dest.writeParcelable(this.f84973c, i11);
        dest.writeParcelable(this.f84974d, i11);
        List<ButtonV3DTO> list = this.f84975e;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator c11 = J.c(dest, 1, list);
            while (c11.hasNext()) {
                dest.writeParcelable((Parcelable) c11.next(), i11);
            }
        }
        dest.writeString(this.f84976f);
        Map<String, MessengerTrackingInfo> map = this.f84977g;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            ((MessengerTrackingInfo) entry.getValue()).writeToParcel(dest, i11);
        }
    }
}
