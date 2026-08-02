package zi;

import Ae.x0;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenViewModel$takePhotoWithScreenFlash$1", f = "CameraScreenViewModel.kt", l = {217, 218, 219, 220}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class r extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    long f109278d;

    /* renamed from: e, reason: collision with root package name */
    Uri f109279e;

    /* renamed from: f, reason: collision with root package name */
    x0 f109280f;

    /* renamed from: g, reason: collision with root package name */
    m f109281g;

    /* renamed from: h, reason: collision with root package name */
    Object f109282h;

    /* renamed from: i, reason: collision with root package name */
    l f109283i;

    /* renamed from: j, reason: collision with root package name */
    int f109284j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ m f109285k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(m mVar, kotlin.coroutines.d<? super r> dVar) {
        super(2, dVar);
        this.f109285k = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new r(this.f109285k, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (xe.Y.b(r7, r26) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r2 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c2 -> B:8:0x00c3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        long j11;
        Object c11;
        Uri uri;
        Uri uri2;
        m mVar;
        x0 x0Var;
        Object m02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f109284j;
        m mVar2 = this.f109285k;
        if (i11 == 0) {
            Sc.s.b(obj);
            x0 x0Var2 = mVar2.f109221c;
            do {
                value = x0Var2.getValue();
            } while (!x0Var2.b(value, l.a((l) value, false, null, null, 0.0f, 0.0f, null, 0, false, 0, true, false, false, 0.0f, null, null, 32255)));
            this.f109278d = 150L;
            this.f109284j = 1;
            if (Y.b(150L, this) != aVar) {
                j11 = 150;
            }
            return aVar;
        }
        if (i11 == 1) {
            j11 = this.f109278d;
            Sc.s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    uri = this.f109279e;
                    Sc.s.b(obj);
                    uri2 = uri;
                    mVar = mVar2;
                    x0Var = mVar2.f109221c;
                    r4 = x0Var.getValue();
                    l lVar = (l) r4;
                    this.f109279e = uri2;
                    this.f109280f = x0Var;
                    this.f109281g = mVar;
                    this.f109282h = r4;
                    this.f109283i = lVar;
                    this.f109284j = 4;
                    m02 = m.m0(mVar, uri2, this);
                    if (m02 != aVar) {
                    }
                    return aVar;
                }
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l lVar2 = this.f109283i;
                Object value2 = this.f109282h;
                m mVar3 = this.f109281g;
                x0Var = this.f109280f;
                uri2 = this.f109279e;
                Sc.s.b(obj);
                m02 = obj;
                l lVar3 = lVar2;
                mVar = mVar3;
                if (x0Var.b(value2, l.a(lVar3, false, null, null, 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, (Hi.k) m02, 15871))) {
                    return Unit.f71690a;
                }
                value2 = x0Var.getValue();
                l lVar4 = (l) value2;
                this.f109279e = uri2;
                this.f109280f = x0Var;
                this.f109281g = mVar;
                this.f109282h = value2;
                this.f109283i = lVar4;
                this.f109284j = 4;
                m02 = m.m0(mVar, uri2, this);
                if (m02 != aVar) {
                    lVar3 = lVar4;
                    if (x0Var.b(value2, l.a(lVar3, false, null, null, 0.0f, 0.0f, null, 0, false, 0, false, false, false, 0.0f, null, (Hi.k) m02, 15871))) {
                    }
                    value2 = x0Var.getValue();
                    l lVar42 = (l) value2;
                    this.f109279e = uri2;
                    this.f109280f = x0Var;
                    this.f109281g = mVar;
                    this.f109282h = value2;
                    this.f109283i = lVar42;
                    this.f109284j = 4;
                    m02 = m.m0(mVar, uri2, this);
                    if (m02 != aVar) {
                    }
                }
                return aVar;
            }
            j11 = this.f109278d;
            Sc.s.b(obj);
            c11 = obj;
            uri = (Uri) c11;
            this.f109279e = uri;
            this.f109284j = 3;
        }
        yi.i iVar = mVar2.f109219a;
        this.f109278d = j11;
        this.f109284j = 2;
        c11 = iVar.c(this);
    }
}
