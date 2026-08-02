package t5;

import A5.k;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: t5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC9758c {

    /* renamed from: t5.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f99170a;

        /* renamed from: b, reason: collision with root package name */
        private double f99171b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f99172c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f99173d;

        public a(@NotNull Context context) {
            this.f99170a = context;
            int i11 = k.f430d;
            double d11 = 0.2d;
            try {
                Object systemService = androidx.core.content.a.getSystemService(context, ActivityManager.class);
                Intrinsics.f(systemService);
                if (((ActivityManager) systemService).isLowRamDevice()) {
                    d11 = 0.15d;
                }
            } catch (Exception unused) {
            }
            this.f99171b = d11;
            this.f99172c = true;
            this.f99173d = true;
        }

        @NotNull
        public final C9760e a() {
            InterfaceC9763h c9756a;
            int i11;
            int i12;
            InterfaceC9764i c9762g = this.f99173d ? new C9762g() : new C9757b();
            if (this.f99172c) {
                double d11 = this.f99171b;
                if (d11 > 0.0d) {
                    Context context = this.f99170a;
                    int i13 = k.f430d;
                    try {
                        Object systemService = androidx.core.content.a.getSystemService(context, ActivityManager.class);
                        Intrinsics.f(systemService);
                        ActivityManager activityManager = (ActivityManager) systemService;
                        i12 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    } catch (Exception unused) {
                        i12 = 256;
                    }
                    double d12 = d11 * i12;
                    double d13 = UserVerificationMethods.USER_VERIFY_ALL;
                    i11 = (int) (d12 * d13 * d13);
                } else {
                    i11 = 0;
                }
                c9756a = i11 > 0 ? new C9761f(i11, c9762g) : new C9756a(c9762g);
            } else {
                c9756a = new C9756a(c9762g);
            }
            return new C9760e(c9756a, c9762g);
        }
    }

    /* renamed from: t5.c$b */
    public static final class b implements Parcelable {

        @Deprecated
        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f99174a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, String> f99175b;

        /* renamed from: t5.c$b$a */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                Intrinsics.f(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i11 = 0; i11 < readInt; i11++) {
                    String readString2 = parcel.readString();
                    Intrinsics.f(readString2);
                    String readString3 = parcel.readString();
                    Intrinsics.f(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new b(readString, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(@NotNull String str, @NotNull Map<String, String> map) {
            this.f99174a = str;
            this.f99175b = map;
        }

        public static b a(b bVar, Map map) {
            String str = bVar.f99174a;
            bVar.getClass();
            return new b(str, map);
        }

        @NotNull
        public final Map<String, String> b() {
            return this.f99175b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f99174a, bVar.f99174a) && Intrinsics.d(this.f99175b, bVar.f99175b);
        }

        public final int hashCode() {
            return this.f99175b.hashCode() + (this.f99174a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Key(key=" + this.f99174a + ", extras=" + this.f99175b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i11) {
            parcel.writeString(this.f99174a);
            Map<String, String> map = this.f99175b;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }
    }

    /* renamed from: t5.c$c, reason: collision with other inner class name */
    public static final class C2178c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Bitmap f99176a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, Object> f99177b;

        public C2178c(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
            this.f99176a = bitmap;
            this.f99177b = map;
        }

        @NotNull
        public final Bitmap a() {
            return this.f99176a;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.f99177b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2178c)) {
                return false;
            }
            C2178c c2178c = (C2178c) obj;
            return Intrinsics.d(this.f99176a, c2178c.f99176a) && Intrinsics.d(this.f99177b, c2178c.f99177b);
        }

        public final int hashCode() {
            return this.f99177b.hashCode() + (this.f99176a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Value(bitmap=" + this.f99176a + ", extras=" + this.f99177b + ')';
        }
    }

    void a(int i11);

    C2178c b(@NotNull b bVar);

    void c(@NotNull b bVar, @NotNull C2178c c2178c);
}
