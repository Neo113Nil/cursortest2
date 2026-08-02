package ru.ozon.fintech.features.camera.scanners.service;

import Sc.s;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.features.camera.scanners.service.SaluteQrService;
import xe.M;
import ze.w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.fintech.features.camera.scanners.service.SaluteQrService$onCreate$1", f = "SaluteQrService.kt", l = {130, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SaluteQrService$onCreate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SaluteQrService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaluteQrService$onCreate$1(SaluteQrService saluteQrService, d<? super SaluteQrService$onCreate$1> dVar) {
        super(2, dVar);
        this.this$0 = saluteQrService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaluteQrService$onCreate$1(this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0018, B:9:0x0046, B:15:0x0058, B:17:0x0060, B:19:0x0075, B:26:0x0033, B:28:0x0042), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:7:0x0018, B:9:0x0046, B:15:0x0058, B:17:0x0060, B:19:0x0075, B:26:0x0033, B:28:0x0042), top: B:2:0x0006 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0072 -> B:8:0x001b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w wVar;
        SaluteQrService saluteQrService;
        ze.j it;
        SaluteQrService saluteQrService2;
        Object process;
        Object b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                wVar = this.this$0.taskChannel;
                saluteQrService = this.this$0;
                it = wVar.iterator();
                this.L$0 = saluteQrService;
                this.L$1 = wVar;
                this.L$2 = it;
                this.label = 1;
                b11 = it.b(this);
                if (b11 != aVar) {
                }
            } else if (i11 == 1) {
                it = (ze.j) this.L$2;
                wVar = (w) this.L$1;
                saluteQrService2 = (SaluteQrService) this.L$0;
                s.b(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (ze.j) this.L$2;
                wVar = (w) this.L$1;
                saluteQrService2 = (SaluteQrService) this.L$0;
                s.b(obj);
                saluteQrService = saluteQrService2;
                this.L$0 = saluteQrService;
                this.L$1 = wVar;
                this.L$2 = it;
                this.label = 1;
                b11 = it.b(this);
                if (b11 != aVar) {
                    return aVar;
                }
                saluteQrService2 = saluteQrService;
                obj = b11;
                if (((Boolean) obj).booleanValue()) {
                    Unit unit = Unit.f71690a;
                    wVar.j(null);
                    return Unit.f71690a;
                }
                SaluteQrService.Task task = (SaluteQrService.Task) it.next();
                this.L$0 = saluteQrService2;
                this.L$1 = wVar;
                this.L$2 = it;
                this.label = 2;
                process = saluteQrService2.process(task, this);
            }
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SaluteQrService$onCreate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
