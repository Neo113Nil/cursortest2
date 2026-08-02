package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdjm;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r0a implements moh, b79, c79, g6h, zzdjm {
    public static final r0a c;
    public static final r0a d;
    public final /* synthetic */ int a;
    public boolean b;

    static {
        int i = 0;
        c = new r0a(true, i);
        d = new r0a(false, i);
    }

    public r0a(ykd ykdVar, xkd xkdVar) {
        this.a = 7;
        int i = xkdVar.a;
        ByteBuffer byteBuffer = xkdVar.b;
        z1a.s(i == 6 || i == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        nm2 nm2Var = new nm2(bArr, min, 3, (byte) 0);
        if (ykdVar.a) {
            throw new wkd();
        }
        if (nm2Var.h()) {
            this.b = false;
            return;
        }
        int i2 = nm2Var.i(2);
        boolean h = nm2Var.h();
        if (ykdVar.b) {
            throw new wkd();
        }
        if (!h) {
            this.b = true;
            return;
        }
        boolean h2 = (i2 == 3 || i2 == 0) ? true : nm2Var.h();
        nm2Var.s();
        if (!ykdVar.d) {
            throw new wkd();
        }
        if (nm2Var.h()) {
            if (!ykdVar.e) {
                throw new wkd();
            }
            nm2Var.s();
        }
        if (ykdVar.c) {
            throw new wkd();
        }
        if (i2 != 3) {
            nm2Var.s();
        }
        nm2Var.t(ykdVar.f);
        if (i2 != 2 && i2 != 0 && !h2) {
            nm2Var.t(3);
        }
        this.b = ((i2 == 3 || i2 == 0) ? 255 : nm2Var.i(8)) != 0;
    }

    @Override // defpackage.g6h
    public void a(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        mha kind = kSerializer.getDescriptor().getKind();
        if ((kind instanceof zze) || Intrinsics.c(kind, o5h.f)) {
            vp2.d("Serializer for ", kClass2.getSimpleName(), " can't be registered as a subclass for polymorphic serialization because its kind ", kind, " is not concrete. To work with multiple hierarchies, register it as a base class.");
            return;
        }
        if (this.b) {
            if (Intrinsics.c(kind, nii.g) || Intrinsics.c(kind, nii.h) || (kind instanceof d7f) || (kind instanceof p5h)) {
                vp2.d("Serializer for ", kClass2.getSimpleName(), " of kind ", kind, " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    @Override // defpackage.b79
    public boolean e() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.c79
    public boolean f(jjh jjhVar) {
        return this.b;
    }

    @Override // defpackage.b79
    public boolean g(kjh kjhVar) {
        return this.b;
    }

    @Override // defpackage.g6h
    public void h(KClass kClass, Function1 function1) {
        kClass.getClass();
    }

    public synchronized void i() {
        this.b = false;
    }

    public synchronized boolean j() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public void k(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return wt3.p(new StringBuilder("IncorrectFragmentation{expected="), !this.b, "}");
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        zzdjg zzdjgVar = (zzdjg) obj;
        switch (this.a) {
            case 11:
                zzdjgVar.b0(this.b);
                break;
            default:
                zzdjgVar.c0(this.b);
                break;
        }
    }

    @Override // defpackage.g6h
    public void b(KClass kClass, Function1 function1) {
    }

    @Override // defpackage.g6h
    public void d(KClass kClass, Function1 function1) {
    }

    public /* synthetic */ r0a(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public /* synthetic */ r0a(boolean z, z41 z41Var) {
        this.a = 2;
        this.b = z;
    }

    public r0a(gfa gfaVar) {
        this.a = 6;
        this.b = gfaVar.k != sv2.a;
    }

    public r0a(Context context, Looper looper) {
        this.a = 10;
        new u00(context.getApplicationContext(), (byte) 0);
        new zqi(new Handler(looper, null));
        new zqi(new Handler(Looper.getMainLooper(), null));
    }

    public /* synthetic */ r0a(int i) {
        this.a = i;
    }
}
