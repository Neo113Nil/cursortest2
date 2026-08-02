package r4;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import t4.C6442b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final a f63955f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final List f63956a;

    /* renamed from: b, reason: collision with root package name */
    public final List f63957b;

    /* renamed from: c, reason: collision with root package name */
    public final List f63958c;

    /* renamed from: d, reason: collision with root package name */
    public final List f63959d;

    /* renamed from: e, reason: collision with root package name */
    public final int f63960e;

    public static final class a {

        /* renamed from: r4.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0888a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(ReadableMap readableMap) {
            if (readableMap == null) {
                return null;
            }
            return new d(b(readableMap.getArray("object")), b(readableMap.getArray("request")), b(readableMap.getArray("session")), b(readableMap.getArray("status")), C6442b.e(readableMap, "mode", 1));
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0019 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List b(ReadableArray readableArray) {
            Object valueOf;
            if (readableArray == null) {
                return CollectionsKt.emptyList();
            }
            IntRange until = RangesKt.until(0, readableArray.size());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                ReadableMap map = readableArray.getMap(((IntIterator) it).nextInt());
                Pair pair = null;
                String string = map != null ? map.getString("key") : null;
                ReadableType type = map != null ? map.getType(EventKeys.VALUE_KEY) : null;
                int i10 = type == null ? -1 : C0888a.$EnumSwitchMapping$0[type.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2 && map != null) {
                        valueOf = map.getString(EventKeys.VALUE_KEY);
                        if (string != null && valueOf != null) {
                            pair = new Pair(string, valueOf);
                        }
                        if (pair == null) {
                            arrayList.add(pair);
                        }
                    }
                    valueOf = null;
                    if (string != null) {
                        pair = new Pair(string, valueOf);
                    }
                    if (pair == null) {
                    }
                } else {
                    if (map != null) {
                        valueOf = Double.valueOf(map.getDouble(EventKeys.VALUE_KEY));
                        if (string != null) {
                        }
                        if (pair == null) {
                        }
                    }
                    valueOf = null;
                    if (string != null) {
                    }
                    if (pair == null) {
                    }
                }
            }
            return arrayList;
        }

        public a() {
        }
    }

    public d(List cmcdObject, List cmcdRequest, List cmcdSession, List cmcdStatus, int i10) {
        Intrinsics.checkNotNullParameter(cmcdObject, "cmcdObject");
        Intrinsics.checkNotNullParameter(cmcdRequest, "cmcdRequest");
        Intrinsics.checkNotNullParameter(cmcdSession, "cmcdSession");
        Intrinsics.checkNotNullParameter(cmcdStatus, "cmcdStatus");
        this.f63956a = cmcdObject;
        this.f63957b = cmcdRequest;
        this.f63958c = cmcdSession;
        this.f63959d = cmcdStatus;
        this.f63960e = i10;
    }

    public final List a() {
        return this.f63956a;
    }

    public final List b() {
        return this.f63957b;
    }

    public final List c() {
        return this.f63958c;
    }

    public final List d() {
        return this.f63959d;
    }

    public final int e() {
        return this.f63960e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f63956a, dVar.f63956a) && Intrinsics.areEqual(this.f63957b, dVar.f63957b) && Intrinsics.areEqual(this.f63958c, dVar.f63958c) && Intrinsics.areEqual(this.f63959d, dVar.f63959d) && this.f63960e == dVar.f63960e;
    }

    public int hashCode() {
        return (((((((this.f63956a.hashCode() * 31) + this.f63957b.hashCode()) * 31) + this.f63958c.hashCode()) * 31) + this.f63959d.hashCode()) * 31) + Integer.hashCode(this.f63960e);
    }

    public String toString() {
        return "CMCDProps(cmcdObject=" + this.f63956a + ", cmcdRequest=" + this.f63957b + ", cmcdSession=" + this.f63958c + ", cmcdStatus=" + this.f63959d + ", mode=" + this.f63960e + ")";
    }
}
