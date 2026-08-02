package zd0;

import C.J;
import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACTION;
        public static final a CONSECUTIVE;
        public static final a MANUAL;
        public static final a SWIPE;
        public static final a TIMEOUT;

        static {
            a aVar = new a("SWIPE", 0);
            SWIPE = aVar;
            a aVar2 = new a("ACTION", 1);
            ACTION = aVar2;
            a aVar3 = new a("TIMEOUT", 2);
            TIMEOUT = aVar3;
            a aVar4 = new a("MANUAL", 3);
            MANUAL = aVar4;
            a aVar5 = new a("CONSECUTIVE", 4);
            CONSECUTIVE = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f108874a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f108875b;

        /* renamed from: c, reason: collision with root package name */
        private final LinkedHashMap f108876c;

        public b(String str, @NotNull String link, LinkedHashMap linkedHashMap) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.f108874a = str;
            this.f108875b = link;
            this.f108876c = linkedHashMap;
        }

        @NotNull
        public final String a() {
            return this.f108875b;
        }

        public final Map<String, C2348c> b() {
            return this.f108876c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f108874a, bVar.f108874a) && this.f108875b.equals(bVar.f108875b) && Intrinsics.d(this.f108876c, bVar.f108876c);
        }

        public final int hashCode() {
            String str = this.f108874a;
            int a11 = G.g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f108875b);
            LinkedHashMap linkedHashMap = this.f108876c;
            return a11 + (linkedHashMap != null ? linkedHashMap.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "OzonInAppPushAction(id=" + this.f108874a + ", link=" + this.f108875b + ", trackingInfo=" + this.f108876c + ")";
        }
    }

    /* renamed from: zd0.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C2348c implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<C2348c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f108877a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f108878b;

        /* renamed from: c, reason: collision with root package name */
        private final String f108879c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f108880d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<String, String> f108881e;

        /* renamed from: zd0.c$c$a */
        public static final class a implements Parcelable.Creator<C2348c> {
            @Override // android.os.Parcelable.Creator
            public final C2348c createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int i11 = 0;
                LinkedHashMap linkedHashMap = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i12 = 0;
                    while (i12 != readInt) {
                        i12 = Ak.b.b(C2348c.CREATOR, parcel, arrayList, i12, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt2);
                    while (i11 != readInt2) {
                        i11 = B6.b.a(parcel, linkedHashMap, parcel.readString(), i11, 1);
                    }
                }
                return new C2348c(readString, readString2, readString3, arrayList, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final C2348c[] newArray(int i11) {
                return new C2348c[i11];
            }
        }

        public C2348c(@NotNull String actionType, @NotNull String key, String str, ArrayList arrayList, Map map) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f108877a = actionType;
            this.f108878b = key;
            this.f108879c = str;
            this.f108880d = arrayList;
            this.f108881e = map;
        }

        @NotNull
        public final String a() {
            return this.f108878b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2348c)) {
                return false;
            }
            C2348c c2348c = (C2348c) obj;
            return Intrinsics.d(this.f108877a, c2348c.f108877a) && Intrinsics.d(this.f108878b, c2348c.f108878b) && Intrinsics.d(this.f108879c, c2348c.f108879c) && Intrinsics.d(this.f108880d, c2348c.f108880d) && Intrinsics.d(this.f108881e, c2348c.f108881e);
        }

        public final int hashCode() {
            int a11 = G.g.a(this.f108877a.hashCode() * 31, 31, this.f108878b);
            String str = this.f108879c;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            ArrayList arrayList = this.f108880d;
            int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            Map<String, String> map = this.f108881e;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OzonInAppPushTrackingInfo(actionType=");
            sb2.append(this.f108877a);
            sb2.append(", key=");
            sb2.append(this.f108878b);
            sb2.append(", sliceKey=");
            sb2.append(this.f108879c);
            sb2.append(", nested=");
            sb2.append(this.f108880d);
            sb2.append(", custom=");
            return P.f(sb2, this.f108881e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i11) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f108877a);
            dest.writeString(this.f108878b);
            dest.writeString(this.f108879c);
            ArrayList arrayList = this.f108880d;
            if (arrayList == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2348c) it.next()).writeToParcel(dest, i11);
                }
            }
            Map<String, String> map = this.f108881e;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
    }

    void onClick(@NotNull b bVar);

    void onDismiss(@NotNull a aVar, @NotNull Map<String, C2348c> map);

    void onShow(@NotNull Map<String, C2348c> map);
}
