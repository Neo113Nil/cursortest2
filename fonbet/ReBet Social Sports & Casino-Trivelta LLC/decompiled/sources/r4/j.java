package r4;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t4.C6442b;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final a f64015h = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public int f64017b;

    /* renamed from: c, reason: collision with root package name */
    public int f64018c;

    /* renamed from: d, reason: collision with root package name */
    public int f64019d;

    /* renamed from: e, reason: collision with root package name */
    public int f64020e;

    /* renamed from: a, reason: collision with root package name */
    public int f64016a = -1;

    /* renamed from: f, reason: collision with root package name */
    public float f64021f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f64022g = true;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a(ReadableMap readableMap) {
            j jVar = new j();
            jVar.f64016a = C6442b.e(readableMap, ViewProps.FONT_SIZE, -1);
            jVar.f64020e = C6442b.e(readableMap, ViewProps.PADDING_BOTTOM, 0);
            jVar.f64019d = C6442b.e(readableMap, ViewProps.PADDING_TOP, 0);
            jVar.f64017b = C6442b.e(readableMap, ViewProps.PADDING_LEFT, 0);
            jVar.f64018c = C6442b.e(readableMap, ViewProps.PADDING_RIGHT, 0);
            jVar.f64021f = C6442b.d(readableMap, ViewProps.OPACITY, 1.0f);
            jVar.f64022g = C6442b.b(readableMap, "subtitlesFollowVideo", true);
            return jVar;
        }

        public a() {
        }
    }

    public final int h() {
        return this.f64016a;
    }

    public final float i() {
        return this.f64021f;
    }

    public final int j() {
        return this.f64020e;
    }

    public final int k() {
        return this.f64017b;
    }

    public final int l() {
        return this.f64018c;
    }

    public final int m() {
        return this.f64019d;
    }
}
