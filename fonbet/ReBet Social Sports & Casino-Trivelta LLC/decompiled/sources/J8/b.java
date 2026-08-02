package J8;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b extends com.facebook.imagepipeline.request.b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5959b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Map f5960a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(com.facebook.imagepipeline.request.c cVar, Map map) {
            return new b(cVar, map, null);
        }

        public a() {
        }
    }

    public /* synthetic */ b(com.facebook.imagepipeline.request.c cVar, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, map);
    }

    public final Map c() {
        return this.f5960a;
    }

    public b(com.facebook.imagepipeline.request.c cVar, Map map) {
        super(cVar);
        this.f5960a = map;
    }
}
