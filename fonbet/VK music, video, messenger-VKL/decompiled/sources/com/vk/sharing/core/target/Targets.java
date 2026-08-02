package com.vk.sharing.core.target;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.sharing.api.dto.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class Targets implements Parcelable {
    public static final Parcelable.Creator<Targets> CREATOR = new a();
    public final transient LinkedList<Target> b;

    @Nullable
    public ArrayList<Target> c;

    @Nullable
    public ArrayList<Target> d;

    @Nullable
    public ArrayList<Target> e;
    public boolean f;

    @NonNull
    public String g;

    public class a implements Parcelable.Creator<Targets> {
        @Override // android.os.Parcelable.Creator
        public final Targets createFromParcel(Parcel parcel) {
            return new Targets(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Targets[] newArray(int i) {
            return new Targets[i];
        }
    }

    public Targets() {
        this.b = new LinkedList<>();
        this.g = "";
    }

    public static void e(ArrayList<Target> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < arrayList.size(); i++) {
            Target target = arrayList.get(i);
            if (target != null && target.c != null) {
                linkedHashSet.add(target);
            }
        }
        arrayList.clear();
        arrayList.addAll(linkedHashSet);
        linkedHashSet.clear();
    }

    public static void j(@Nullable Collection collection, @NonNull Target target) {
        Object obj;
        if (collection == null) {
            return;
        }
        Objects.requireNonNull(target);
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (target.equals((Target) obj)) {
                    break;
                }
            }
        }
        Target target2 = (Target) obj;
        if (target2 == null || target2 == target) {
            return;
        }
        target2.g = !target.g;
    }

    public final void a(@NonNull ArrayList<Target> arrayList) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.addAll(arrayList);
        e(this.d);
        Iterator<Target> it = this.d.iterator();
        while (it.hasNext()) {
            Target next = it.next();
            if (next != null && next.g) {
                this.b.add(next);
            }
        }
    }

    public final void d() {
        ArrayList<Target> arrayList = this.c;
        if (arrayList != null) {
            Iterator<Target> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().g = false;
            }
        }
        ArrayList<Target> arrayList2 = this.d;
        if (arrayList2 != null) {
            Iterator<Target> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Target next = it2.next();
                if (next != null) {
                    next.g = false;
                }
            }
        }
        this.b.clear();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final List<Target> f() {
        List list = this.c;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    @NonNull
    public final List<Target> g() {
        List list = this.d;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    public final boolean i() {
        return this.d != null;
    }

    public final void k(@NonNull Target target) {
        boolean z = target.g;
        target.g = !z;
        LinkedList<Target> linkedList = this.b;
        if (z) {
            linkedList.remove(target);
        } else {
            linkedList.add(target);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c != null) {
            parcel.writeInt(1);
            parcel.writeTypedList(this.c);
        } else {
            parcel.writeInt(0);
        }
        if (this.d != null) {
            parcel.writeInt(1);
            parcel.writeTypedList(this.d);
        } else {
            parcel.writeInt(0);
        }
        if (this.e != null) {
            parcel.writeInt(1);
            parcel.writeTypedList(this.e);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.g);
    }

    public Targets(Parcel parcel) {
        this.b = new LinkedList<>();
        this.g = "";
        int readInt = parcel.readInt();
        if (readInt == 1) {
            ArrayList<Target> arrayList = new ArrayList<>(readInt);
            this.c = arrayList;
            parcel.readTypedList(arrayList, Target.CREATOR);
            Iterator<Target> it = this.c.iterator();
            while (it.hasNext()) {
                Target next = it.next();
                if (next.g) {
                    this.b.add(next);
                }
            }
        }
        if (parcel.readInt() == 1) {
            ArrayList<Target> arrayList2 = new ArrayList<>();
            this.d = arrayList2;
            parcel.readTypedList(arrayList2, Target.CREATOR);
        }
        if (parcel.readInt() == 1) {
            ArrayList<Target> arrayList3 = new ArrayList<>();
            this.e = arrayList3;
            parcel.readTypedList(arrayList3, Target.CREATOR);
        }
        this.f = parcel.readByte() == 1;
        this.g = parcel.readString();
        e(this.c);
        e(this.d);
        e(this.e);
    }
}
