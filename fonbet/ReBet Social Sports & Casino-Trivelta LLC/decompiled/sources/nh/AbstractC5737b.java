package nh;

import Ph.InterfaceC1456i0;
import java.nio.ByteBuffer;
import kh.k;
import kh.l;
import kh.t;
import kh.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: nh.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5737b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58548a;

    /* renamed from: b, reason: collision with root package name */
    public final nh.d f58549b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1456i0 f58550c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f58551d;

    @NotNull
    private final byte[] data;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58552e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58553f;

    /* renamed from: g, reason: collision with root package name */
    public final ByteBuffer f58554g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f58547h = new c(null);

    @NotNull
    private static final byte[] Empty = new byte[0];

    /* renamed from: nh.b$a */
    public static final class a extends AbstractC5737b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, byte[] data, boolean z11, boolean z12, boolean z13) {
            super(z10, nh.d.BINARY, data, e.f58564a, z11, z12, z13, null);
            Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, byte[] data) {
            this(z10, data, false, false, false);
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    /* renamed from: nh.b$b, reason: collision with other inner class name */
    public static final class C0860b extends AbstractC5737b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0860b(byte[] data) {
            super(true, nh.d.CLOSE, data, e.f58564a, false, false, false, null);
            Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C0860b(l packet) {
            this(u.c(packet, 0, 1, null));
            Intrinsics.checkNotNullParameter(packet, "packet");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0860b(C5736a reason) {
            this(r1.h2());
            Intrinsics.checkNotNullParameter(reason, "reason");
            k kVar = new k(null, 1, 0 == true ? 1 : 0);
            try {
                t.a(kVar, reason.a());
                u.i(kVar, reason.c(), 0, 0, null, 14, null);
            } catch (Throwable th2) {
                kVar.b2();
                throw th2;
            }
        }
    }

    /* renamed from: nh.b$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    /* renamed from: nh.b$d */
    public static final class d extends AbstractC5737b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, byte[] data, boolean z11, boolean z12, boolean z13) {
            super(z10, nh.d.TEXT, data, e.f58564a, z11, z12, z13, null);
            Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(boolean z10, byte[] data) {
            this(z10, data, false, false, false);
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    public /* synthetic */ AbstractC5737b(boolean z10, nh.d dVar, byte[] bArr, InterfaceC1456i0 interfaceC1456i0, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, dVar, bArr, interfaceC1456i0, z11, z12, z13);
    }

    public final byte[] a() {
        return this.data;
    }

    public String toString() {
        return "Frame " + this.f58549b + " (fin=" + this.f58548a + ", buffer len = " + this.data.length + ')';
    }

    public AbstractC5737b(boolean z10, nh.d dVar, byte[] bArr, InterfaceC1456i0 interfaceC1456i0, boolean z11, boolean z12, boolean z13) {
        this.f58548a = z10;
        this.f58549b = dVar;
        this.data = bArr;
        this.f58550c = interfaceC1456i0;
        this.f58551d = z11;
        this.f58552e = z12;
        this.f58553f = z13;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(data)");
        this.f58554g = wrap;
    }
}
