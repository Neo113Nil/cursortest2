package com.vk.attachpicker.screen.filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.j5g;
import xsna.jgp;
import xsna.rbq;
import xsna.v900;
import xsna.w900;
import xsna.wmi0;
import xsna.x900;
import xsna.y900;
import xsna.zcl;

/* compiled from: LocalExtendedLutsDataSource.kt */
/* loaded from: classes15.dex */
public final class LocalExtendedLutsDataSource {

    /* compiled from: LocalExtendedLutsDataSource.kt */
    public static abstract class LutListItemWrapper implements Serializer.StreamParcelable {
        public /* synthetic */ LutListItemWrapper(zcl zclVar) {
            this();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        public LutListItemWrapper() {
        }
    }

    public static rbq a() {
        Object v900Var;
        List list = (List) wmi0.a.e("photo_editor_luts_cache").a();
        if (list.isEmpty()) {
            return null;
        }
        DataWrapper dataWrapper = (DataWrapper) j5g.Y(list);
        List<LutListItemWrapper> list2 = dataWrapper.b;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (LutListItemWrapper lutListItemWrapper : list2) {
            if (lutListItemWrapper instanceof LutCategoryWrapper) {
                LutCategoryWrapper lutCategoryWrapper = (LutCategoryWrapper) lutListItemWrapper;
                int i = lutCategoryWrapper.b;
                String str = lutCategoryWrapper.c;
                boolean z = lutCategoryWrapper.d;
                List<LutWrapper> list3 = lutCategoryWrapper.e;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                for (LutWrapper lutWrapper : list3) {
                    arrayList2.add(new v900(lutWrapper.b, lutWrapper.c, lutWrapper.d, x900.c.a));
                }
                v900Var = new w900(i, str, z, arrayList2);
            } else {
                if (!(lutListItemWrapper instanceof LutWrapper)) {
                    throw new NoWhenBranchMatchedException();
                }
                LutWrapper lutWrapper2 = (LutWrapper) lutListItemWrapper;
                v900Var = new v900(lutWrapper2.b, lutWrapper2.c, lutWrapper2.d, x900.c.a);
            }
            arrayList.add(v900Var);
        }
        return new rbq(arrayList, dataWrapper.c);
    }

    /* compiled from: LocalExtendedLutsDataSource.kt */
    public static final class LutWrapper extends LutListItemWrapper {
        public static final Serializer.c<LutWrapper> CREATOR = new a();
        public final int b;
        public final String c;
        public final boolean d;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<LutWrapper> {
            @Override // com.vk.core.serialize.Serializer.c
            public final LutWrapper a(Serializer serializer) {
                int u = serializer.u();
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                return new LutWrapper(u, H, serializer.m());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LutWrapper[i];
            }
        }

        public LutWrapper(v900 v900Var) {
            this(v900Var.c, v900Var.d, v900Var.e);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.j0(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
        }

        public LutWrapper(int i, String str, boolean z) {
            super(null);
            this.b = i;
            this.c = str;
            this.d = z;
        }
    }

    /* compiled from: LocalExtendedLutsDataSource.kt */
    public static final class DataWrapper implements Serializer.StreamParcelable {
        public static final Serializer.c<DataWrapper> CREATOR = new a();
        public final List<LutListItemWrapper> b;
        public final Map<Integer, String> c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<DataWrapper> {
            @Override // com.vk.core.serialize.Serializer.c
            public final DataWrapper a(Serializer serializer) {
                Map map;
                ArrayList B = serializer.B(LutListItemWrapper.class.getClassLoader());
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                try {
                    int u = serializer.u();
                    if (u >= 0) {
                        map = new LinkedHashMap();
                        for (int i = 0; i < u; i++) {
                            Integer valueOf = Integer.valueOf(serializer.u());
                            String H = serializer.H();
                            if (H == null) {
                                H = "";
                            }
                            map.put(valueOf, H);
                        }
                    } else {
                        map = jgp.b;
                    }
                    return new DataWrapper(B, map);
                } finally {
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DataWrapper[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DataWrapper(rbq rbqVar) {
            this(r1, rbqVar.b);
            Parcelable lutCategoryWrapper;
            ArrayList<y900> arrayList = rbqVar.a;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (y900 y900Var : arrayList) {
                if (y900Var instanceof v900) {
                    lutCategoryWrapper = new LutWrapper((v900) y900Var);
                } else {
                    if (!(y900Var instanceof w900)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lutCategoryWrapper = new LutCategoryWrapper((w900) y900Var);
                }
                arrayList2.add(lutCategoryWrapper);
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.f0(this.b);
            Map<Integer, String> map = this.c;
            if (map == null) {
                serializer.S(-1);
                return;
            }
            Iterator c = n.c(serializer, map);
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                serializer.S(((Number) entry.getKey()).intValue());
                serializer.j0((String) entry.getValue());
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataWrapper(List<? extends LutListItemWrapper> list, Map<Integer, String> map) {
            this.b = list;
            this.c = map;
        }
    }

    /* compiled from: LocalExtendedLutsDataSource.kt */
    public static final class LutCategoryWrapper extends LutListItemWrapper {
        public static final Serializer.c<LutCategoryWrapper> CREATOR = new a();
        public final int b;
        public final String c;
        public final boolean d;
        public final List<LutWrapper> e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<LutCategoryWrapper> {
            @Override // com.vk.core.serialize.Serializer.c
            public final LutCategoryWrapper a(Serializer serializer) {
                int u = serializer.u();
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                return new LutCategoryWrapper(u, H, serializer.m(), serializer.B(LutWrapper.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LutCategoryWrapper[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public LutCategoryWrapper(w900 w900Var) {
            this(r0, r1, r2, r3);
            int i = w900Var.c;
            String str = w900Var.d;
            boolean z = w900Var.e;
            List<v900> list = w900Var.f;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new LutWrapper((v900) it.next()));
            }
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.b);
            serializer.j0(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
            serializer.f0(this.e);
        }

        public LutCategoryWrapper(int i, String str, boolean z, List<LutWrapper> list) {
            super(null);
            this.b = i;
            this.c = str;
            this.d = z;
            this.e = list;
        }
    }
}
