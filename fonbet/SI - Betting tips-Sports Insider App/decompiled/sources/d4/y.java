package d4;

import android.graphics.ImageDecoder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ImageDecoder.Source f8165a;

    /* renamed from: b, reason: collision with root package name */
    public final AutoCloseable f8166b;

    /* renamed from: c, reason: collision with root package name */
    public final q4.n f8167c;

    /* renamed from: d, reason: collision with root package name */
    public final ng.i f8168d;

    public y(ImageDecoder.Source source, AutoCloseable autoCloseable, q4.n nVar, ng.i iVar) {
        this.f8165a = source;
        this.f8166b = autoCloseable;
        this.f8167c = nVar;
        this.f8168d = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // d4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        w wVar;
        int i5;
        ng.i iVar;
        try {
            try {
                if (continuation instanceof w) {
                    wVar = (w) continuation;
                    int i10 = wVar.f8161d;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        wVar.f8161d = i10 - Integer.MIN_VALUE;
                        Object obj = wVar.f8159b;
                        lf.a aVar = lf.a.f20034a;
                        i5 = wVar.f8161d;
                        if (i5 != 0) {
                            h8.b.B(obj);
                            ng.i iVar2 = this.f8168d;
                            wVar.f8158a = iVar2;
                            wVar.f8161d = 1;
                            if (iVar2.a(wVar) == aVar) {
                                return aVar;
                            }
                            iVar = iVar2;
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            iVar = wVar.f8158a;
                            h8.b.B(obj);
                        }
                        AutoCloseable autoCloseable = this.f8166b;
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        i iVar3 = new i(new c4.a(ImageDecoder.decodeBitmap(this.f8165a, new x(this, booleanRef, 0))), booleanRef.element);
                        u6.h.g(autoCloseable, null);
                        return iVar3;
                    }
                }
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                i iVar32 = new i(new c4.a(ImageDecoder.decodeBitmap(this.f8165a, new x(this, booleanRef2, 0))), booleanRef2.element);
                u6.h.g(autoCloseable, null);
                return iVar32;
            } finally {
            }
            AutoCloseable autoCloseable2 = this.f8166b;
        } finally {
            iVar.d();
        }
        wVar = new w(this, (mf.c) continuation);
        Object obj2 = wVar.f8159b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = wVar.f8161d;
        if (i5 != 0) {
        }
    }
}
