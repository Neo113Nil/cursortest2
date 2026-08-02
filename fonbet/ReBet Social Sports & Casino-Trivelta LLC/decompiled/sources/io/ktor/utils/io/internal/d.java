package io.ktor.utils.io.internal;

import io.ktor.utils.io.internal.f;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import mh.AbstractC5587c;
import mh.AbstractC5589e;
import mh.C5588d;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49458a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f49459b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49460c;

    /* renamed from: d, reason: collision with root package name */
    public static final mh.f f49461d;

    /* renamed from: e, reason: collision with root package name */
    public static final mh.f f49462e;

    /* renamed from: f, reason: collision with root package name */
    public static final mh.f f49463f;

    public static final class a extends AbstractC5589e {
        @Override // mh.f
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public f.c V0() {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(d.a());
            Intrinsics.checkNotNullExpressionValue(allocateDirect, "allocateDirect(BUFFER_SIZE)");
            return new f.c(allocateDirect, 0, 2, null);
        }
    }

    public static final class b extends AbstractC5587c {
        public b(int i10) {
            super(i10);
        }

        @Override // mh.AbstractC5587c
        /* renamed from: m1, reason: merged with bridge method [inline-methods] */
        public void B(f.c instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            d.d().O1(instance.f49466a);
        }

        @Override // mh.AbstractC5587c
        /* renamed from: n1, reason: merged with bridge method [inline-methods] */
        public f.c U() {
            return new f.c((ByteBuffer) d.d().V0(), 0, 2, null);
        }
    }

    static {
        int a10 = i.a("BufferSize", 4096);
        f49458a = a10;
        int a11 = i.a("BufferPoolSize", 2048);
        f49459b = a11;
        int a12 = i.a("BufferObjectPoolSize", 1024);
        f49460c = a12;
        f49461d = new C5588d(a11, a10);
        f49462e = new b(a12);
        f49463f = new a();
    }

    public static final int a() {
        return f49458a;
    }

    public static final mh.f b() {
        return f49463f;
    }

    public static final mh.f c() {
        return f49462e;
    }

    public static final mh.f d() {
        return f49461d;
    }
}
