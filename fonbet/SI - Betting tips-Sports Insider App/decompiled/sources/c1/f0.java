package c1;

import com.google.android.gms.internal.measurement.d5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 extends mf.i implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3373b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f3374c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3375d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3376e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3378g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(i0 i0Var, CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.f3376e = i0Var;
        this.f3377f = coroutineContext;
        this.f3378g = (mf.i) function2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Continuation create(Continuation continuation) {
        switch (this.f3373b) {
            case 0:
                return new f0((i0) this.f3376e, (CoroutineContext) this.f3377f, (mf.i) this.f3378g, continuation);
            default:
                return new f0((r0) this.f3378g, this.f3375d, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f3373b) {
        }
        return ((f0) create(continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        Object obj2;
        FileOutputStream i5;
        FileOutputStream fileOutputStream;
        int i10 = this.f3373b;
        Object obj3 = this.f3378g;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) this.f3376e;
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f3374c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    this.f3374c = 1;
                    obj = i0.f(i0Var, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f3375d;
                            h8.b.B(obj);
                            return obj4;
                        }
                        dVar = (d) this.f3375d;
                        h8.b.B(obj);
                        obj2 = dVar.f3349b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == dVar.f3350c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!Intrinsics.areEqual(dVar.f3349b, obj)) {
                            this.f3375d = obj;
                            this.f3374c = 3;
                            if (i0Var.j(obj, true, this) == aVar) {
                                return aVar;
                            }
                        }
                        return obj;
                    }
                    h8.b.B(obj);
                }
                dVar = (d) obj;
                CoroutineContext coroutineContext = (CoroutineContext) this.f3377f;
                androidx.lifecycle.c cVar = new androidx.lifecycle.c((Function2) obj3, dVar, (Continuation) null);
                this.f3375d = dVar;
                this.f3374c = 2;
                obj = eg.c0.A(coroutineContext, cVar, this);
                if (obj == aVar) {
                    return aVar;
                }
                obj2 = dVar.f3349b;
                if ((obj2 == null ? obj2.hashCode() : 0) == dVar.f3350c) {
                }
            default:
                File file = ((r0) obj3).f3420a;
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f3374c;
                try {
                    if (i12 == 0) {
                        h8.b.B(obj);
                        i5 = a.a.i(new FileOutputStream(file), file);
                        Object obj5 = this.f3375d;
                        try {
                            g1.f fVar = g1.f.f9708a;
                            e1 e1Var = new e1(i5);
                            this.f3376e = i5;
                            this.f3377f = i5;
                            this.f3374c = 1;
                            if (fVar.b(obj5, e1Var) == aVar2) {
                                return aVar2;
                            }
                            fileOutputStream = i5;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = i5;
                            throw th;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = (FileOutputStream) this.f3377f;
                        fileOutputStream = (FileOutputStream) this.f3376e;
                        try {
                            h8.b.B(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                com.google.android.play.core.appupdate.b.g(fileOutputStream, th);
                                throw th4;
                            }
                        }
                    }
                    i5.getFD().sync();
                    Unit unit = Unit.f19194a;
                    com.google.android.play.core.appupdate.b.g(fileOutputStream, null);
                    return Unit.f19194a;
                } catch (Exception e7) {
                    if (e7 instanceof FileNotFoundException) {
                        throw d5.Y(file.getParent(), (FileNotFoundException) e7);
                    }
                    throw e7;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(r0 r0Var, Object obj, Continuation continuation) {
        super(1, continuation);
        this.f3378g = r0Var;
        this.f3375d = obj;
    }
}
