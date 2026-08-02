package c80;

import Sc.s;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewViewModel$onCreate$1", f = "SharingPreviewViewModel.kt", l = {194, 202}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56784d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f56785e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f56786f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f56787g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f56788h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f56789i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(boolean z11, i iVar, String str, String str2, String str3, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f56785e = z11;
        this.f56786f = iVar;
        this.f56787g = str;
        this.f56788h = str2;
        this.f56789i = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f56785e, this.f56786f, this.f56787g, this.f56788h, this.f56789i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (c80.i.y0(r4, r11.f56787g, r1, r11) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (c80.i.p0(r11.f56786f, r6, r11.f56789i, r8, r11) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        U30.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f56784d;
        if (i11 == 0) {
            s.b(obj);
            boolean z11 = this.f56785e;
            String str = this.f56788h;
            i iVar = this.f56786f;
            if (z11) {
                aVar = iVar.f56748e;
                File file = new File(aVar.h("downloads"), str);
                iVar.f56762s = str;
                iVar.f56760q = file.getAbsolutePath();
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                long length = file.length();
                this.f56784d = 2;
            } else {
                this.f56784d = 1;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
