package z7;

import G6.h;
import H7.k;
import K7.L;
import K7.w;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u7.C6528b;

/* renamed from: z7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6939c implements L6.a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f68623c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C6938b f68624a;

    /* renamed from: b, reason: collision with root package name */
    public final w f68625b;

    /* renamed from: z7.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BitmapFactory.Options b(int i10, Bitmap.Config config) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i10;
            options.inMutable = true;
            return options;
        }

        public a() {
        }
    }

    public C6939c(L poolFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        this.f68624a = new C6938b(poolFactory.h());
        w d10 = poolFactory.d();
        Intrinsics.checkNotNullExpressionValue(d10, "getFlexByteArrayPool(...)");
        this.f68625b = d10;
    }

    @Override // L6.a
    public Bitmap a(int i10, int i11, Bitmap.Config bitmapConfig) {
        k kVar;
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        H6.a a10 = this.f68624a.a((short) i10, (short) i11);
        Intrinsics.checkNotNullExpressionValue(a10, "generate(...)");
        try {
            kVar = new k(a10);
        } catch (Throwable th2) {
            th = th2;
            kVar = null;
        }
        try {
            kVar.j2(C6528b.f66196b);
            BitmapFactory.Options b10 = f68623c.b(kVar.n1(), bitmapConfig);
            int size = ((h) a10.z0()).size();
            Object z02 = a10.z0();
            Intrinsics.checkNotNullExpressionValue(z02, "get(...)");
            H6.a a11 = this.f68625b.a(size + 2);
            Object z03 = a11.z0();
            Intrinsics.checkNotNullExpressionValue(z03, "get(...)");
            byte[] bArr = (byte[]) z03;
            ((h) z02).i(0, bArr, 0, size);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, size, b10);
            if (decodeByteArray == null) {
                throw new IllegalStateException("Required value was null.");
            }
            decodeByteArray.setHasAlpha(true);
            decodeByteArray.eraseColor(0);
            H6.a.U(a11);
            k.r(kVar);
            H6.a.U(a10);
            return decodeByteArray;
        } catch (Throwable th3) {
            th = th3;
            H6.a.U(null);
            k.r(kVar);
            H6.a.U(a10);
            throw th;
        }
    }
}
