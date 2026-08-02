package q5;

import A5.m;
import Sc.s;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l5.InterfaceC7874c;
import org.jetbrains.annotations.NotNull;
import q5.C8986a;
import v5.C10234h;
import v5.C10239m;
import w5.C10435g;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "coil.intercept.EngineInterceptor$transform$3", f = "EngineInterceptor.kt", l = {242}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super C8986a.C1375a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    List f81686d;

    /* renamed from: e, reason: collision with root package name */
    C10239m f81687e;

    /* renamed from: f, reason: collision with root package name */
    int f81688f;

    /* renamed from: g, reason: collision with root package name */
    int f81689g;

    /* renamed from: h, reason: collision with root package name */
    int f81690h;

    /* renamed from: i, reason: collision with root package name */
    private /* synthetic */ Object f81691i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C8986a f81692j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C8986a.C1375a f81693k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ C10239m f81694l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ List<y5.b> f81695m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ InterfaceC7874c f81696n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C10234h f81697o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    h(C8986a c8986a, C8986a.C1375a c1375a, C10239m c10239m, List<? extends y5.b> list, InterfaceC7874c interfaceC7874c, C10234h c10234h, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f81692j = c8986a;
        this.f81693k = c1375a;
        this.f81694l = c10239m;
        this.f81695m = list;
        this.f81696n = interfaceC7874c;
        this.f81697o = c10234h;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        h hVar = new h(this.f81692j, this.f81693k, this.f81694l, this.f81695m, this.f81696n, this.f81697o, dVar);
        hVar.f81691i = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super C8986a.C1375a> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (kotlin.collections.C7705l.m(A5.k.e(), r8) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0099 -> B:5:0x009c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        C10239m c10239m;
        Bitmap a11;
        M m11;
        Bitmap bitmap;
        int i11;
        List<y5.b> list;
        int size;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f81690h;
        C10234h c10234h = this.f81697o;
        C8986a.C1375a c1375a = this.f81693k;
        InterfaceC7874c interfaceC7874c = this.f81696n;
        if (i12 == 0) {
            s.b(obj);
            M m12 = (M) this.f81691i;
            Drawable d11 = c1375a.d();
            boolean z11 = d11 instanceof BitmapDrawable;
            c10239m = this.f81694l;
            if (z11) {
                a11 = ((BitmapDrawable) d11).getBitmap();
                Bitmap.Config config = a11.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
            }
            a11 = m.a(d11, c10239m.e(), c10239m.n(), c10239m.m(), c10239m.b());
            interfaceC7874c.getClass();
            List<y5.b> list2 = this.f81695m;
            m11 = m12;
            bitmap = a11;
            i11 = 0;
            list = list2;
            size = list2.size();
            if (i11 < size) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.f81689g;
            i11 = this.f81688f;
            c10239m = this.f81687e;
            list = this.f81686d;
            m11 = (M) this.f81691i;
            s.b(obj);
            bitmap = (Bitmap) obj;
            N.e(m11);
            i11++;
            if (i11 < size) {
                y5.b bVar = list.get(i11);
                C10435g n11 = c10239m.n();
                this.f81691i = m11;
                this.f81686d = list;
                this.f81687e = c10239m;
                this.f81688f = i11;
                this.f81689g = size;
                this.f81690h = 1;
                obj = bVar.transform(bitmap, n11, this);
                if (obj == aVar) {
                    return aVar;
                }
                bitmap = (Bitmap) obj;
                N.e(m11);
                i11++;
                if (i11 < size) {
                    interfaceC7874c.getClass();
                    return C8986a.C1375a.a(c1375a, new BitmapDrawable(c10234h.l().getResources(), bitmap));
                }
            }
        }
    }
}
