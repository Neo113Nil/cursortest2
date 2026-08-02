package r4;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f63989b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f63990a = new ArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(ReadableArray readableArray) {
            if (readableArray == null) {
                return null;
            }
            h hVar = new h();
            int size = readableArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = readableArray.getMap(i10);
                if (map != null) {
                    hVar.a().add(g.f63980e.e(map));
                }
            }
            return hVar;
        }

        public a() {
        }
    }

    public final ArrayList a() {
        return this.f63990a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        return Intrinsics.areEqual(this.f63990a, ((h) obj).f63990a);
    }
}
