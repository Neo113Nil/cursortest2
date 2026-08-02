package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class m implements ru.ozon.android.messenger.framework.presentation.models.g, Parcelable {

    @NotNull
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c f84726a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<q> f84727b;

    /* renamed from: c, reason: collision with root package name */
    private final String f84728c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f84729d;

    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ru.ozon.android.messenger.framework.presentation.models.c createFromParcel = ru.ozon.android.messenger.framework.presentation.models.c.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Ak.b.b(q.CREATOR, parcel, arrayList, i11, 1);
            }
            return new m(createFromParcel, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i11) {
            return new m[i11];
        }
    }

    public m(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull List<q> groups, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f84726a = blockId;
        this.f84727b = groups;
        this.f84728c = str;
        this.f84729d = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static m a(m mVar, ArrayList arrayList, String str, int i11) {
        ru.ozon.android.messenger.framework.presentation.models.c blockId = mVar.f84726a;
        List groups = arrayList;
        if ((i11 & 2) != 0) {
            groups = mVar.f84727b;
        }
        if ((i11 & 4) != 0) {
            str = mVar.f84728c;
        }
        boolean z11 = (i11 & 8) != 0 ? mVar.f84729d : true;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new m(blockId, groups, str, z11);
    }

    @NotNull
    public final List<q> b() {
        return this.f84727b;
    }

    public final String c() {
        return this.f84728c;
    }

    public final boolean d() {
        return this.f84729d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f84726a, mVar.f84726a) && Intrinsics.d(this.f84727b, mVar.f84727b) && Intrinsics.d(this.f84728c, mVar.f84728c) && this.f84729d == mVar.f84729d;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.f84726a;
    }

    public final int hashCode() {
        int b11 = G.g.b(this.f84726a.hashCode() * 31, 31, this.f84727b);
        String str = this.f84728c;
        return Boolean.hashCode(this.f84729d) + ((b11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatGroupListVO(blockId=");
        sb2.append(this.f84726a);
        sb2.append(", groups=");
        sb2.append(this.f84727b);
        sb2.append(", selectedGroupItemId=");
        sb2.append(this.f84728c);
        sb2.append(", isComposable=");
        return Pk0.a.a(")", sb2, this.f84729d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84726a.writeToParcel(dest, i11);
        Iterator c11 = Bi.a.c(this.f84727b, dest);
        while (c11.hasNext()) {
            ((q) c11.next()).writeToParcel(dest, i11);
        }
        dest.writeString(this.f84728c);
        dest.writeInt(this.f84729d ? 1 : 0);
    }
}
