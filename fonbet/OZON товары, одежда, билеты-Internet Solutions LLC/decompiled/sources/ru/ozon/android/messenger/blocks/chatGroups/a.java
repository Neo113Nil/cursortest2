package ru.ozon.android.messenger.blocks.chatGroups;

import C.J;
import C.o0;
import El.C2971a;
import Kk.C3532b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
public final class a implements g, Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C1479a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84652a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f84653b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f84654c;

    /* renamed from: d, reason: collision with root package name */
    private final m f84655d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f84656e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f84657f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final IconDTO f84658g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f84659h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f84660i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f84661j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final String f84662k;

    /* renamed from: ru.ozon.android.messenger.blocks.chatGroups.a$a, reason: collision with other inner class name */
    public static final class C1479a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            boolean z11;
            boolean z12;
            boolean z13;
            IconDTO iconDTO;
            boolean z14;
            int i11;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ru.ozon.android.messenger.framework.presentation.models.c createFromParcel = ru.ozon.android.messenger.framework.presentation.models.c.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            m createFromParcel2 = parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel);
            boolean z15 = true;
            boolean z16 = false;
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z15 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = false;
                z16 = z11;
            } else {
                z12 = false;
            }
            IconDTO iconDTO2 = (IconDTO) parcel.readParcelable(a.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z13 = z12;
                iconDTO = iconDTO2;
                z14 = z11;
            } else {
                z13 = z12;
                iconDTO = iconDTO2;
                z14 = z13 ? 1 : 0;
            }
            if (parcel.readInt() != 0) {
                int i12 = z13 ? 1 : 0;
                z13 = z11;
                i11 = i12;
            } else {
                i11 = z13 ? 1 : 0;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                while (i11 != readInt) {
                    linkedHashMap.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                    i11++;
                }
            }
            return new a(createFromParcel, readString, readString2, createFromParcel2, z15, z16, iconDTO, z14, z13, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull String name, @NotNull String chatType, m mVar, boolean z11, boolean z12, @NotNull IconDTO groupIcon, boolean z13, boolean z14, Map<String, MessengerTrackingInfo> map, @NotNull String uniqueKey) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(groupIcon, "groupIcon");
        Intrinsics.checkNotNullParameter(uniqueKey, "uniqueKey");
        this.f84652a = blockId;
        this.f84653b = name;
        this.f84654c = chatType;
        this.f84655d = mVar;
        this.f84656e = z11;
        this.f84657f = z12;
        this.f84658g = groupIcon;
        this.f84659h = z13;
        this.f84660i = z14;
        this.f84661j = map;
        this.f84662k = uniqueKey;
    }

    public static a a(a aVar, boolean z11, int i11) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = aVar.f84652a;
        String name = aVar.f84653b;
        String chatType = aVar.f84654c;
        m mVar = aVar.f84655d;
        if ((i11 & 16) != 0) {
            z11 = aVar.f84656e;
        }
        boolean z12 = z11;
        boolean z13 = (i11 & 32) != 0 ? aVar.f84657f : false;
        IconDTO groupIcon = aVar.f84658g;
        boolean z14 = aVar.f84659h;
        boolean z15 = aVar.f84660i;
        Map<String, MessengerTrackingInfo> map = aVar.f84661j;
        String uniqueKey = aVar.f84662k;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(groupIcon, "groupIcon");
        Intrinsics.checkNotNullParameter(uniqueKey, "uniqueKey");
        return new a(blockId, name, chatType, mVar, z12, z13, groupIcon, z14, z15, map, uniqueKey);
    }

    @NotNull
    public final String b() {
        return this.f84654c;
    }

    @NotNull
    public final IconDTO c() {
        return this.f84658g;
    }

    public final boolean d() {
        return this.f84659h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Map<String, MessengerTrackingInfo> e() {
        return this.f84661j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f84652a, aVar.f84652a) && Intrinsics.d(this.f84653b, aVar.f84653b) && Intrinsics.d(this.f84654c, aVar.f84654c) && Intrinsics.d(this.f84655d, aVar.f84655d) && this.f84656e == aVar.f84656e && this.f84657f == aVar.f84657f && Intrinsics.d(this.f84658g, aVar.f84658g) && this.f84659h == aVar.f84659h && this.f84660i == aVar.f84660i && Intrinsics.d(this.f84661j, aVar.f84661j) && Intrinsics.d(this.f84662k, aVar.f84662k);
    }

    public final m f() {
        return this.f84655d;
    }

    public final boolean g() {
        return this.f84656e;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84652a;
    }

    @NotNull
    public final String getName() {
        return this.f84653b;
    }

    public final boolean h() {
        return this.f84657f;
    }

    public final int hashCode() {
        int a11 = G.g.a(G.g.a(this.f84652a.hashCode() * 31, 31, this.f84653b), 31, this.f84654c);
        m mVar = this.f84655d;
        int a12 = C3532b.a(C3532b.a(C2971a.a(this.f84658g, C3532b.a(C3532b.a((a11 + (mVar == null ? 0 : mVar.hashCode())) * 31, 31, this.f84656e), 31, this.f84657f), 31), 31, this.f84659h), 31, this.f84660i);
        Map<String, MessengerTrackingInfo> map = this.f84661j;
        return this.f84662k.hashCode() + ((a12 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatGroupVO(blockId=");
        sb2.append(this.f84652a);
        sb2.append(", name=");
        sb2.append(this.f84653b);
        sb2.append(", chatType=");
        sb2.append(this.f84654c);
        sb2.append(", unreadCount=");
        sb2.append(this.f84655d);
        sb2.append(", isChecked=");
        sb2.append(this.f84656e);
        sb2.append(", isIconVisible=");
        sb2.append(this.f84657f);
        sb2.append(", groupIcon=");
        sb2.append(this.f84658g);
        sb2.append(", hasSearch=");
        sb2.append(this.f84659h);
        sb2.append(", isComposeItem=");
        sb2.append(this.f84660i);
        sb2.append(", trackingInfo=");
        sb2.append(this.f84661j);
        sb2.append(", uniqueKey=");
        return o0.c(sb2, this.f84662k, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84652a.writeToParcel(dest, i11);
        dest.writeString(this.f84653b);
        dest.writeString(this.f84654c);
        m mVar = this.f84655d;
        if (mVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mVar.writeToParcel(dest, i11);
        }
        dest.writeInt(this.f84656e ? 1 : 0);
        dest.writeInt(this.f84657f ? 1 : 0);
        dest.writeParcelable(this.f84658g, i11);
        dest.writeInt(this.f84659h ? 1 : 0);
        dest.writeInt(this.f84660i ? 1 : 0);
        Map<String, MessengerTrackingInfo> map = this.f84661j;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                ((MessengerTrackingInfo) entry.getValue()).writeToParcel(dest, i11);
            }
        }
        dest.writeString(this.f84662k);
    }
}
