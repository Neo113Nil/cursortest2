package c1;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import java.lang.ref.WeakReference;
import java.net.InetSocketAddress;
import java.net.Socket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a1 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i5, Continuation continuation, int i10) {
        super(i5, continuation);
        this.f3334b = i10;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3334b) {
            case 0:
                return new a1(2, continuation, 0);
            case 1:
                return new a1(2, continuation, 1);
            case 2:
                return new a1(2, continuation, 2);
            case 3:
                return new a1(2, continuation, 3);
            case 4:
                return new a1(2, continuation, 4);
            case 5:
                return new a1(2, continuation, 5);
            case 6:
                return new a1(2, continuation, 6);
            case 7:
                return new a1(2, continuation, 7);
            default:
                return new a1(2, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3334b) {
            case 1:
                ((a1) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                break;
            case 6:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                break;
        }
        return ((a1) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        boolean a7;
        Typeface typeface = null;
        switch (this.f3334b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress("www.google.com", 80), 2000);
                socket.close();
                return Boolean.TRUE;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                fa.a aVar4 = (fa.a) y3.m(fa.a.class, null, 6);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter("CPEnableSupportParams", "key");
                SharedPreferences sharedPref = aVar4.f9542b;
                Intrinsics.checkNotNullParameter("CPEnableSupportParams", "key");
                Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
                return sharedPref.getString("CPEnableSupportParams", null);
            case 3:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    ((za.i) zc.k.e()).getClass();
                    ve.s c2 = za.i.c();
                    if (c2.f24830d == null) {
                        try {
                            typeface = f0.l.b(c2.f24827a, R.font.montserrat_black);
                        } catch (Exception unused) {
                        }
                        c2.f24830d = typeface;
                    }
                    zc.k.a();
                    return zc.k.c();
                } catch (Exception e7) {
                    zc.d.b(4, "initPreLoadFont", e7);
                    return Unit.f19194a;
                }
            case 4:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                return Unit.f19194a;
            case 5:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                return Unit.f19194a;
            case 6:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                return Unit.f19194a;
            case 7:
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                return Unit.f19194a;
            default:
                lf.a aVar10 = lf.a.f20034a;
                h8.b.B(obj);
                WeakReference weakReference = new WeakReference(null);
                if (Build.VERSION.SDK_INT < 33) {
                    a7 = true;
                } else {
                    if (((c0.h0) weakReference.get()) == null) {
                        weakReference = new WeakReference((c0.h0) y3.m(c0.h0.class, null, 6));
                    }
                    Object obj2 = weakReference.get();
                    Intrinsics.checkNotNull(obj2);
                    a7 = ((c0.h0) obj2).a();
                }
                return Boolean.valueOf(a7);
        }
    }
}
