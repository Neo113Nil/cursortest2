package ru.ozon.android.messenger.framework.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class q implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<u> f91455a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final p f91456b;

    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Ak.b.b(u.CREATOR, parcel, arrayList, i11, 1);
            }
            return new q(arrayList, (p) parcel.readParcelable(q.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i11) {
            return new q[i11];
        }
    }

    public q(@NotNull List<u> blocks, @NotNull p itemInfo) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        this.f91455a = blocks;
        this.f91456b = itemInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [ru.ozon.android.messenger.framework.presentation.models.p] */
    public static q a(q qVar, List blocks, s sVar, int i11) {
        if ((i11 & 1) != 0) {
            blocks = qVar.f91455a;
        }
        s itemInfo = sVar;
        if ((i11 & 2) != 0) {
            itemInfo = qVar.f91456b;
        }
        qVar.getClass();
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        return new q(blocks, itemInfo);
    }

    @NotNull
    public final List<u> b() {
        return this.f91455a;
    }

    @NotNull
    public final p c() {
        return this.f91456b;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.core.viewmapper.e d() {
        return ((u) C7714v.K(this.f91455a)).d();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f91455a, qVar.f91455a) && Intrinsics.d(this.f91456b, qVar.f91456b);
    }

    public final int hashCode() {
        return this.f91456b.hashCode() + (this.f91455a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ItemVO(blocks=" + this.f91455a + ", itemInfo=" + this.f91456b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.f91455a, dest);
        while (c11.hasNext()) {
            ((u) c11.next()).writeToParcel(dest, i11);
        }
        dest.writeParcelable(this.f91456b, i11);
    }
}
