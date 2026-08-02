package f50;

import Sc.s;
import android.content.Context;
import androidx.lifecycle.x0;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO;
import ru.ozon.fintech.ui.misc.FinIcons;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewViewModel$copyFileToDownloads$1", f = "CbottomPdfPreviewViewModel.kt", l = {568, 581}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f62904d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ File f62905e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f f62906f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewViewModel$copyFileToDownloads$1$1$1", f = "CbottomPdfPreviewViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f62907d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f62907d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f62907d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e50.f fVar;
            Context context;
            e50.f fVar2;
            String uuid;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            f fVar3 = this.f62907d;
            fVar = fVar3.f62879l;
            context = fVar3.f62871d;
            String string = context.getString(R.string.fintech_ui_download_file_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String drawableName = FinIcons.IC_M_CONFIRMED_FILLED.getDrawableName();
            fVar.getClass();
            Cbottom2SnackDTO b11 = e50.f.b(0, string, drawableName);
            fVar2 = fVar3.f62879l;
            uuid = fVar3.getUuid();
            fVar2.c(b11, uuid);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottompdf.presentation.CbottomPdfPreviewViewModel$copyFileToDownloads$1$2", f = "CbottomPdfPreviewViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f62908d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f62908d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f62908d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e50.f fVar;
            Context context;
            e50.f fVar2;
            String uuid;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            f fVar3 = this.f62908d;
            fVar = fVar3.f62879l;
            context = fVar3.f62871d;
            String string = context.getString(R.string.fintech_ui_error_download_file_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String drawableName = FinIcons.IC_M_EXCLAMATION_FILLED.getDrawableName();
            fVar.getClass();
            Cbottom2SnackDTO a11 = e50.f.a(0, string, drawableName);
            fVar2 = fVar3.f62879l;
            uuid = fVar3.getUuid();
            fVar2.c(a11, uuid);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(File file, f fVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f62905e = file;
        this.f62906f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f62905e, this.f62906f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (xe.C10727i.f(r8, r1, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (xe.C10727i.f(r8, r1, r7) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        U30.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f62904d;
        if (i11 == 0) {
            s.b(obj);
            File file = this.f62905e;
            String name = file.getName();
            boolean exists = file.exists();
            f fVar = this.f62906f;
            if (exists) {
                aVar = fVar.f62880m;
                Intrinsics.f(name);
                if (aVar.l(name, bd.h.j(file)) != null) {
                    CoroutineContext coroutineContext = x0.a(fVar).getCoroutineContext();
                    a aVar3 = new a(fVar, null);
                    this.f62904d = 1;
                }
            } else {
                CoroutineContext coroutineContext2 = x0.a(fVar).getCoroutineContext();
                b bVar = new b(fVar, null);
                this.f62904d = 2;
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
