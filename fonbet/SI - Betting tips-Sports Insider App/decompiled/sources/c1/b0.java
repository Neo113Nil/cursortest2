package c1;

import com.google.android.gms.internal.measurement.d5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 extends mf.i implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3335b;

    /* renamed from: c, reason: collision with root package name */
    public int f3336c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Continuation continuation, int i5) {
        super(1, continuation);
        this.f3335b = i5;
        this.f3338e = obj;
    }

    @Override // mf.a
    public final Continuation create(Continuation continuation) {
        switch (this.f3335b) {
            case 0:
                return new b0((i0) this.f3338e, continuation, 0);
            default:
                return new b0((l0) this.f3338e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f3335b) {
        }
        return ((b0) create(continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable] */
    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        c1 c1Var;
        FileInputStream fileInputStream;
        Throwable th3;
        switch (this.f3335b) {
            case 0:
                i0 i0Var = (i0) this.f3338e;
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f3336c;
                try {
                } catch (Throwable th4) {
                    b1 g10 = i0Var.g();
                    this.f3337d = th4;
                    this.f3336c = 2;
                    Integer a7 = g10.a();
                    if (a7 == aVar) {
                        return aVar;
                    }
                    th2 = th4;
                    obj = a7;
                }
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f3336c = 1;
                    obj = i0.f(i0Var, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.f3337d;
                        h8.b.B(obj);
                        c1Var = new w0(th2, ((Number) obj).intValue());
                        return new Pair(c1Var, Boolean.TRUE);
                    }
                    h8.b.B(obj);
                }
                c1Var = (c1) obj;
                return new Pair(c1Var, Boolean.TRUE);
            default:
                l0 l0Var = (l0) this.f3338e;
                lf.a aVar2 = lf.a.f20034a;
                ?? r22 = this.f3336c;
                g1.f fVar = g1.f.f9708a;
                boolean z5 = true;
                try {
                    try {
                        try {
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                com.google.android.play.core.appupdate.b.g(r22, th5);
                                throw th6;
                            }
                        }
                    } catch (Exception e7) {
                        if (e7 instanceof FileNotFoundException) {
                            throw d5.Y(l0Var.f3420a.getParent(), (FileNotFoundException) e7);
                        }
                        throw e7;
                    }
                } catch (FileNotFoundException unused) {
                    if (l0Var.f3420a.exists()) {
                        File file = l0Var.f3420a;
                        FileInputStream m6 = y4.a.m(new FileInputStream(file), file);
                        try {
                            this.f3337d = m6;
                            this.f3336c = 2;
                            g1.a a10 = fVar.a(m6);
                            if (a10 == aVar2) {
                                return aVar2;
                            }
                            fileInputStream = m6;
                            obj = a10;
                        } catch (Throwable th7) {
                            fileInputStream = m6;
                            th3 = th7;
                            try {
                                throw th3;
                            } catch (Throwable th8) {
                                com.google.android.play.core.appupdate.b.g(fileInputStream, th3);
                                throw th8;
                            }
                        }
                    } else {
                        obj = new g1.a(z5);
                    }
                }
                if (r22 == 0) {
                    h8.b.B(obj);
                    File file2 = l0Var.f3420a;
                    FileInputStream m10 = y4.a.m(new FileInputStream(file2), file2);
                    this.f3337d = m10;
                    this.f3336c = 1;
                    obj = fVar.a(m10);
                    r22 = m10;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileInputStream = (FileInputStream) this.f3337d;
                        try {
                            h8.b.B(obj);
                            com.google.android.play.core.appupdate.b.g(fileInputStream, null);
                            return obj;
                        } catch (Throwable th9) {
                            th3 = th9;
                            throw th3;
                        }
                    }
                    FileInputStream fileInputStream2 = (FileInputStream) this.f3337d;
                    h8.b.B(obj);
                    r22 = fileInputStream2;
                }
                com.google.android.play.core.appupdate.b.g(r22, null);
                return obj;
        }
    }
}
