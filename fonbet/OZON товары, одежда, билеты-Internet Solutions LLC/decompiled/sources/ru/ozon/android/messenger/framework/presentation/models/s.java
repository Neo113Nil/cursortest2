package ru.ozon.android.messenger.framework.presentation.models;

import B0.C2454a;
import C.J;
import C.o0;
import Kk.C3532b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.presentation.models.p;

/* loaded from: classes10.dex */
public final class s extends p {

    @NotNull
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f91529e;

    /* renamed from: f, reason: collision with root package name */
    private final String f91530f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final t f91531g;

    /* renamed from: h, reason: collision with root package name */
    private final C9515b f91532h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final DateTime f91533i;

    /* renamed from: j, reason: collision with root package name */
    private final DateTime f91534j;

    /* renamed from: k, reason: collision with root package name */
    private final double f91535k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f91536l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f91537m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f91538n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f91539o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f91540p;

    /* renamed from: q, reason: collision with root package name */
    private final int f91541q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final z f91542r;

    /* renamed from: s, reason: collision with root package name */
    private final ContextMenuDTO f91543s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final p.b f91544t;

    /* renamed from: u, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f91545u;

    /* renamed from: v, reason: collision with root package name */
    private final String f91546v;

    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            boolean z11;
            boolean z12;
            boolean z13;
            int i11;
            C9515b c9515b;
            LinkedHashMap linkedHashMap;
            String str;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            t tVar = (t) parcel.readParcelable(s.class.getClassLoader());
            C9515b createFromParcel = parcel.readInt() == 0 ? null : C9515b.CREATOR.createFromParcel(parcel);
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            double readDouble = parcel.readDouble();
            boolean z14 = true;
            boolean z15 = false;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z14 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = false;
                z15 = z11;
            } else {
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                z13 = z11;
            } else {
                z13 = z11;
                z11 = z12 ? 1 : 0;
            }
            if (parcel.readInt() != 0) {
                boolean z17 = z13;
                i11 = z12 ? 1 : 0;
                z12 = z17;
            } else {
                i11 = z12 ? 1 : 0;
            }
            int readInt = parcel.readInt();
            z zVar = (z) parcel.readParcelable(s.class.getClassLoader());
            ContextMenuDTO createFromParcel2 = parcel.readInt() == 0 ? null : ContextMenuDTO.CREATOR.createFromParcel(parcel);
            p.b createFromParcel3 = p.b.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                c9515b = createFromParcel;
                str = readString;
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                c9515b = createFromParcel;
                linkedHashMap = new LinkedHashMap(readInt2);
                str = readString;
                int i12 = i11;
                while (i12 != readInt2) {
                    linkedHashMap.put(parcel.readString(), MessengerTrackingInfo.CREATOR.createFromParcel(parcel));
                    i12++;
                    readInt2 = readInt2;
                }
            }
            return new s(str, readString2, tVar, c9515b, dateTime, dateTime2, readDouble, z16, z14, z15, z11, z12, readInt, zVar, createFromParcel2, createFromParcel3, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i11) {
            return new s[i11];
        }
    }

    public /* synthetic */ s(String str, String str2, t tVar, C9515b c9515b, DateTime dateTime, DateTime dateTime2, double d11, boolean z11, boolean z12, boolean z13, boolean z14, int i11, z zVar, ContextMenuDTO contextMenuDTO, p.b bVar, Map map, String str3, int i12) {
        this(str, str2, tVar, c9515b, dateTime, dateTime2, d11, z11, z12, z13, false, (i12 & 2048) != 0 ? false : z14, i11, zVar, contextMenuDTO, (32768 & i12) != 0 ? p.b.DEFAULT : bVar, (Map<String, MessengerTrackingInfo>) ((i12 & 65536) != 0 ? null : map), str3);
    }

    public static s d(s sVar, String str, t tVar, DateTime dateTime, double d11, boolean z11, boolean z12, int i11, z zVar, int i12) {
        String id2 = sVar.f91529e;
        String str2 = (i12 & 2) != 0 ? sVar.f91530f : str;
        t msgLayoutType = (i12 & 4) != 0 ? sVar.f91531g : tVar;
        C9515b c9515b = sVar.f91532h;
        DateTime createdAt = (i12 & 16) != 0 ? sVar.f91533i : dateTime;
        DateTime dateTime2 = sVar.f91534j;
        double d12 = (i12 & 64) != 0 ? sVar.f91535k : d11;
        boolean z13 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? sVar.f91536l : true;
        boolean z14 = sVar.f91537m;
        boolean z15 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? sVar.f91538n : true;
        boolean z16 = (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? sVar.f91539o : z11;
        boolean z17 = (i12 & 2048) != 0 ? sVar.f91540p : z12;
        int i13 = (i12 & 4096) != 0 ? sVar.f91541q : i11;
        z status = (i12 & 8192) != 0 ? sVar.f91542r : zVar;
        String str3 = str2;
        ContextMenuDTO contextMenuDTO = sVar.f91543s;
        p.b position = sVar.f91544t;
        Map<String, MessengerTrackingInfo> map = sVar.f91545u;
        String str4 = sVar.f91546v;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(msgLayoutType, "msgLayoutType");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(position, "position");
        return new s(id2, str3, msgLayoutType, c9515b, createdAt, dateTime2, d12, z13, z14, z15, z16, z17, i13, status, contextMenuDTO, position, map, str4);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p
    public final int a() {
        return this.f91541q;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p
    public final double c() {
        return this.f91535k;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final C9515b e() {
        return this.f91532h;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f91529e, sVar.f91529e) && Intrinsics.d(this.f91530f, sVar.f91530f) && Intrinsics.d(this.f91531g, sVar.f91531g) && Intrinsics.d(this.f91532h, sVar.f91532h) && Intrinsics.d(this.f91533i, sVar.f91533i) && Intrinsics.d(this.f91534j, sVar.f91534j) && Double.compare(this.f91535k, sVar.f91535k) == 0 && this.f91536l == sVar.f91536l && this.f91537m == sVar.f91537m && this.f91538n == sVar.f91538n && this.f91539o == sVar.f91539o && this.f91540p == sVar.f91540p && this.f91541q == sVar.f91541q && Intrinsics.d(this.f91542r, sVar.f91542r) && Intrinsics.d(this.f91543s, sVar.f91543s) && this.f91544t == sVar.f91544t && Intrinsics.d(this.f91545u, sVar.f91545u) && Intrinsics.d(this.f91546v, sVar.f91546v);
    }

    public final boolean f() {
        return this.f91539o;
    }

    public final ContextMenuDTO g() {
        return this.f91543s;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p
    @NotNull
    public final String getId() {
        return this.f91529e;
    }

    @NotNull
    public final DateTime h() {
        return this.f91533i;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p
    public final int hashCode() {
        int hashCode = this.f91529e.hashCode() * 31;
        String str = this.f91530f;
        int hashCode2 = (this.f91531g.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        C9515b c9515b = this.f91532h;
        int a11 = GR.b.a(this.f91533i, (hashCode2 + (c9515b == null ? 0 : c9515b.hashCode())) * 31, 31);
        DateTime dateTime = this.f91534j;
        int hashCode3 = (this.f91542r.hashCode() + C2454a.a(this.f91541q, C3532b.a(C3532b.a(C3532b.a(C3532b.a(C3532b.a(Pk0.g.a((a11 + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.f91535k), 31, this.f91536l), 31, this.f91537m), 31, this.f91538n), 31, this.f91539o), 31, this.f91540p), 31)) * 31;
        ContextMenuDTO contextMenuDTO = this.f91543s;
        int hashCode4 = (this.f91544t.hashCode() + ((hashCode3 + (contextMenuDTO == null ? 0 : contextMenuDTO.hashCode())) * 31)) * 31;
        Map<String, MessengerTrackingInfo> map = this.f91545u;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f91546v;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.f91530f;
    }

    @NotNull
    public final t j() {
        return this.f91531g;
    }

    @NotNull
    public final z k() {
        return this.f91542r;
    }

    public final Map<String, MessengerTrackingInfo> l() {
        return this.f91545u;
    }

    public final String n() {
        return this.f91546v;
    }

    public final boolean o() {
        return this.f91538n;
    }

    public final boolean p() {
        return this.f91537m;
    }

    public final boolean q() {
        return this.f91536l;
    }

    public final boolean r() {
        return this.f91540p;
    }

    public final boolean t() {
        return (this.f91536l || this.f91537m) ? false : true;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageItemInfo(id=");
        sb2.append(this.f91529e);
        sb2.append(", localId=");
        sb2.append(this.f91530f);
        sb2.append(", msgLayoutType=");
        sb2.append(this.f91531g);
        sb2.append(", author=");
        sb2.append(this.f91532h);
        sb2.append(", createdAt=");
        sb2.append(this.f91533i);
        sb2.append(", updatedAt=");
        sb2.append(this.f91534j);
        sb2.append(", orderBy=");
        sb2.append(this.f91535k);
        sb2.append(", isRead=");
        sb2.append(this.f91536l);
        sb2.append(", isMine=");
        sb2.append(this.f91537m);
        sb2.append(", isFailed=");
        sb2.append(this.f91538n);
        sb2.append(", authorNameVisible=");
        sb2.append(this.f91539o);
        sb2.append(", isSendingMessage=");
        sb2.append(this.f91540p);
        sb2.append(", blocksCount=");
        sb2.append(this.f91541q);
        sb2.append(", status=");
        sb2.append(this.f91542r);
        sb2.append(", contextMenu=");
        sb2.append(this.f91543s);
        sb2.append(", position=");
        sb2.append(this.f91544t);
        sb2.append(", trackingInfo=");
        sb2.append(this.f91545u);
        sb2.append(", updateStatusLabel=");
        return o0.c(sb2, this.f91546v, ")");
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.p, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91529e);
        dest.writeString(this.f91530f);
        dest.writeParcelable(this.f91531g, i11);
        C9515b c9515b = this.f91532h;
        if (c9515b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c9515b.writeToParcel(dest, i11);
        }
        dest.writeSerializable(this.f91533i);
        dest.writeSerializable(this.f91534j);
        dest.writeDouble(this.f91535k);
        dest.writeInt(this.f91536l ? 1 : 0);
        dest.writeInt(this.f91537m ? 1 : 0);
        dest.writeInt(this.f91538n ? 1 : 0);
        dest.writeInt(this.f91539o ? 1 : 0);
        dest.writeInt(this.f91540p ? 1 : 0);
        dest.writeInt(this.f91541q);
        dest.writeParcelable(this.f91542r, i11);
        ContextMenuDTO contextMenuDTO = this.f91543s;
        if (contextMenuDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contextMenuDTO.writeToParcel(dest, i11);
        }
        this.f91544t.writeToParcel(dest, i11);
        Map<String, MessengerTrackingInfo> map = this.f91545u;
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
        dest.writeString(this.f91546v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@NotNull String id2, String str, @NotNull t msgLayoutType, C9515b c9515b, @NotNull DateTime createdAt, DateTime dateTime, double d11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, @NotNull z status, ContextMenuDTO contextMenuDTO, @NotNull p.b position, Map<String, MessengerTrackingInfo> map, String str2) {
        super(id2, i11, d11, position);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(msgLayoutType, "msgLayoutType");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f91529e = id2;
        this.f91530f = str;
        this.f91531g = msgLayoutType;
        this.f91532h = c9515b;
        this.f91533i = createdAt;
        this.f91534j = dateTime;
        this.f91535k = d11;
        this.f91536l = z11;
        this.f91537m = z12;
        this.f91538n = z13;
        this.f91539o = z14;
        this.f91540p = z15;
        this.f91541q = i11;
        this.f91542r = status;
        this.f91543s = contextMenuDTO;
        this.f91544t = position;
        this.f91545u = map;
        this.f91546v = str2;
    }
}
