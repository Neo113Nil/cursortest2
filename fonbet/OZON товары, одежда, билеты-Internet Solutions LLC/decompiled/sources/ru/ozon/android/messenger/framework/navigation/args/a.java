package ru.ozon.android.messenger.framework.navigation.args;

import Ak.b;
import Ve.Om;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C1641a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f89173a;

    /* renamed from: ru.ozon.android.messenger.framework.navigation.args.a$a, reason: collision with other inner class name */
    public static final class C1641a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(q.CREATOR, parcel, arrayList, i11, 1);
            }
            return new a(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(@NotNull ArrayList noUiItems) {
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        this.f89173a = noUiItems;
    }

    @NotNull
    public final List<q> a() {
        return this.f89173a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f89173a.equals(((a) obj).f89173a);
    }

    public final int hashCode() {
        return this.f89173a.hashCode();
    }

    @NotNull
    public final String toString() {
        return Om.a(")", new StringBuilder("SearchArgs(noUiItems="), this.f89173a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ArrayList arrayList = this.f89173a;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q) it.next()).writeToParcel(dest, i11);
        }
    }
}
