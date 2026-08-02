package r4;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t4.C6442b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final a f63976d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public String f63977a;

    /* renamed from: b, reason: collision with root package name */
    public String f63978b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63979c;

    @NotNull
    private String[] drmLicenseHeader = new String[0];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(ReadableMap readableMap) {
            if (readableMap != null && readableMap.hasKey("type")) {
                f fVar = new f();
                fVar.g(C6442b.g(readableMap, "type"));
                fVar.f(C6442b.g(readableMap, "licenseServer"));
                fVar.h(C6442b.b(readableMap, "multiDrm", false));
                ReadableArray a10 = C6442b.a(readableMap, "headers");
                if (fVar.c() != null && fVar.b() != null) {
                    if (a10 != null) {
                        ArrayList arrayList = new ArrayList();
                        int size = a10.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ReadableMap map = a10.getMap(i10);
                            arrayList.add(C6442b.g(map, "key"));
                            arrayList.add(C6442b.g(map, EventKeys.VALUE_KEY));
                        }
                        Object[] array = arrayList.toArray(new String[0]);
                        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
                        fVar.e((String[]) array);
                    }
                    return fVar;
                }
            }
            return null;
        }

        public a() {
        }
    }

    public final String[] a() {
        return this.drmLicenseHeader;
    }

    public final String b() {
        return this.f63978b;
    }

    public final String c() {
        return this.f63977a;
    }

    public final boolean d() {
        return this.f63979c;
    }

    public final void e(String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.drmLicenseHeader = strArr;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof f)) {
            f fVar = (f) obj;
            if (Intrinsics.areEqual(this.f63977a, fVar.f63977a) && Intrinsics.areEqual(this.f63978b, fVar.f63978b) && this.f63979c == fVar.f63979c && ArraysKt.contentDeepEquals(this.drmLicenseHeader, fVar.drmLicenseHeader)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str) {
        this.f63978b = str;
    }

    public final void g(String str) {
        this.f63977a = str;
    }

    public final void h(boolean z10) {
        this.f63979c = z10;
    }
}
