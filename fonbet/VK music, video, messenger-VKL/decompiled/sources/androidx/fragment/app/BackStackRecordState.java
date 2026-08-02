package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.fragment.app.l;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Objects;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes12.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();
    public final int[] b;
    public final ArrayList<String> c;
    public final int[] d;
    public final int[] e;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final CharSequence j;
    public final int k;
    public final CharSequence l;
    public final ArrayList<String> m;
    public final ArrayList<String> n;
    public final boolean o;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.c.size();
        this.b = new int[size * 6];
        if (!aVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.c = new ArrayList<>(size);
        this.d = new int[size];
        this.e = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            l.a aVar2 = aVar.c.get(i2);
            int i3 = i + 1;
            this.b[i] = aVar2.a;
            ArrayList<String> arrayList = this.c;
            Fragment fragment = aVar2.b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.b;
            iArr[i3] = aVar2.c ? 1 : 0;
            iArr[i + 2] = aVar2.d;
            iArr[i + 3] = aVar2.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar2.f;
            i += 6;
            iArr[i4] = aVar2.g;
            this.d[i2] = aVar2.h.ordinal();
            this.e[i2] = aVar2.i.ordinal();
        }
        this.f = aVar.h;
        this.g = aVar.k;
        this.h = aVar.v;
        this.i = aVar.l;
        this.j = aVar.m;
        this.k = aVar.n;
        this.l = aVar.o;
        this.m = aVar.p;
        this.n = aVar.q;
        this.o = aVar.r;
    }

    @NonNull
    public final androidx.fragment.app.a a(@NonNull FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.b;
            boolean z = true;
            if (i2 >= iArr.length) {
                break;
            }
            l.a aVar2 = new l.a();
            int i4 = i2 + 1;
            aVar2.a = iArr[i2];
            if (FragmentManager.P(2)) {
                Objects.toString(aVar);
                int i5 = iArr[i4];
            }
            aVar2.h = Lifecycle.State.values()[this.d[i3]];
            aVar2.i = Lifecycle.State.values()[this.e[i3]];
            int i6 = i2 + 2;
            if (iArr[i4] == 0) {
                z = false;
            }
            aVar2.c = z;
            int i7 = iArr[i6];
            aVar2.d = i7;
            int i8 = iArr[i2 + 3];
            aVar2.e = i8;
            int i9 = i2 + 5;
            int i10 = iArr[i2 + 4];
            aVar2.f = i10;
            i2 += 6;
            int i11 = iArr[i9];
            aVar2.g = i11;
            aVar.d = i7;
            aVar.e = i8;
            aVar.f = i10;
            aVar.g = i11;
            aVar.b(aVar2);
            i3++;
        }
        aVar.h = this.f;
        aVar.k = this.g;
        aVar.i = true;
        aVar.l = this.i;
        aVar.m = this.j;
        aVar.n = this.k;
        aVar.o = this.l;
        aVar.p = this.m;
        aVar.q = this.n;
        aVar.r = this.o;
        aVar.v = this.h;
        while (true) {
            ArrayList<String> arrayList = this.c;
            if (i >= arrayList.size()) {
                aVar.j(1);
                return aVar;
            }
            String str = arrayList.get(i);
            if (str != null) {
                aVar.c.get(i).b = fragmentManager.c.b(str);
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.b);
        parcel.writeStringList(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.b = parcel.createIntArray();
        this.c = parcel.createStringArrayList();
        this.d = parcel.createIntArray();
        this.e = parcel.createIntArray();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.j = (CharSequence) creator.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) creator.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }
}
