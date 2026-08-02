package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.a70;
import defpackage.e6b;
import defpackage.fq8;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new b(0);
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public BackStackRecordState(a aVar) {
        int size = aVar.c.size();
        this.a = new int[size * 6];
        if (!aVar.i) {
            a70.r("Not on back stack");
            throw null;
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            fq8 fq8Var = (fq8) aVar.c.get(i2);
            int i3 = i + 1;
            this.a[i] = fq8Var.a;
            ArrayList arrayList = this.b;
            Fragment fragment = fq8Var.b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.a;
            iArr[i3] = fq8Var.c ? 1 : 0;
            iArr[i + 2] = fq8Var.d;
            iArr[i + 3] = fq8Var.e;
            int i4 = i + 5;
            iArr[i + 4] = fq8Var.f;
            i += 6;
            iArr[i4] = fq8Var.g;
            this.c[i2] = fq8Var.h.ordinal();
            this.d[i2] = fq8Var.i.ordinal();
        }
        this.e = aVar.h;
        this.f = aVar.k;
        this.g = aVar.v;
        this.h = aVar.l;
        this.i = aVar.m;
        this.j = aVar.n;
        this.k = aVar.o;
        this.l = aVar.p;
        this.m = aVar.q;
        this.n = aVar.r;
    }

    public final void a(a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            boolean z = true;
            if (i >= iArr.length) {
                aVar.h = this.e;
                aVar.k = this.f;
                aVar.i = true;
                aVar.l = this.h;
                aVar.m = this.i;
                aVar.n = this.j;
                aVar.o = this.k;
                aVar.p = this.l;
                aVar.q = this.m;
                aVar.r = this.n;
                return;
            }
            fq8 fq8Var = new fq8();
            int i3 = i + 1;
            fq8Var.a = iArr[i];
            if (s.O(2)) {
                Objects.toString(aVar);
                int i4 = iArr[i3];
            }
            fq8Var.h = e6b.values()[this.c[i2]];
            fq8Var.i = e6b.values()[this.d[i2]];
            int i5 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            fq8Var.c = z;
            int i6 = iArr[i5];
            fq8Var.d = i6;
            int i7 = iArr[i + 3];
            fq8Var.e = i7;
            int i8 = i + 5;
            int i9 = iArr[i + 4];
            fq8Var.f = i9;
            i += 6;
            int i10 = iArr[i8];
            fq8Var.g = i10;
            aVar.d = i6;
            aVar.e = i7;
            aVar.f = i9;
            aVar.g = i10;
            aVar.b(fq8Var);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
