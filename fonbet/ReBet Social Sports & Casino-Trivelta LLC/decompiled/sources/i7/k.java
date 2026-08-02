package i7;

import d7.InterfaceC4015d;
import h7.C4487c;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z7.AbstractC6940d;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final a f48167d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f48168e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC6940d f48169a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48170b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48171c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Date until) {
            Intrinsics.checkNotNullParameter(until, "until");
            synchronized (k.f48168e) {
                try {
                    ConcurrentHashMap concurrentHashMap = k.f48168e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((m) entry.getValue()).b().compareTo(until) < 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        ((m) entry2.getValue()).a().clear();
                        k.f48168e.remove(entry2.getKey());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b(String cacheKey, j frameLoader) {
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            Intrinsics.checkNotNullParameter(frameLoader, "frameLoader");
            k.f48168e.put(cacheKey, new m(frameLoader, new Date()));
        }

        public a() {
        }
    }

    public k(AbstractC6940d platformBitmapFactory, int i10, int i11) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        this.f48169a = platformBitmapFactory;
        this.f48170b = i10;
        this.f48171c = i11;
    }

    public final j b(String cacheKey, e7.c bitmapFrameRenderer, InterfaceC4015d animationInformation) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        ConcurrentHashMap concurrentHashMap = f48168e;
        synchronized (concurrentHashMap) {
            m mVar = (m) concurrentHashMap.get(cacheKey);
            if (mVar == null) {
                Unit unit = Unit.INSTANCE;
                return new g(this.f48169a, bitmapFrameRenderer, new C4487c(this.f48170b), animationInformation, this.f48171c);
            }
            concurrentHashMap.remove(cacheKey);
            return mVar.a();
        }
    }
}
