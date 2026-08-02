package c80;

import Sc.s;
import android.content.Context;
import androidx.lifecycle.x0;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SnackDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewViewModel$copyFileToDownloads$1", f = "SharingPreviewViewModel.kt", l = {584, 598}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56775d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ File f56776e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f56777f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewViewModel$copyFileToDownloads$1$1$1", f = "SharingPreviewViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f56778d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f56778d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f56778d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            K40.a aVar;
            Context context;
            K40.a aVar2;
            String str;
            Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            i iVar = this.f56778d;
            aVar = iVar.f56751h;
            K40.b creator = aVar.creator();
            context = iVar.f56744a;
            String string = context.getString(R.string.fintech_ui_download_file_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Cbottom2SnackDTO h11 = K40.b.h(creator, string, 0, 30);
            aVar2 = iVar.f56751h;
            CbottomType cbottomType = CbottomType.SNACK;
            str = iVar.f56740E;
            aVar2.g(h11, cbottomType, str, null);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewViewModel$copyFileToDownloads$1$2", f = "SharingPreviewViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f56779d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i iVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f56779d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f56779d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            K40.a aVar;
            Context context;
            K40.a aVar2;
            String str;
            Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            i iVar = this.f56779d;
            aVar = iVar.f56751h;
            K40.b creator = aVar.creator();
            context = iVar.f56744a;
            String string = context.getString(R.string.fintech_ui_error_download_file_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Cbottom2SnackDTO h11 = K40.b.h(creator, string, 0, 30);
            aVar2 = iVar.f56751h;
            CbottomType cbottomType = CbottomType.SNACK;
            str = iVar.f56740E;
            aVar2.g(h11, cbottomType, str, null);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(File file, i iVar, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f56776e = file;
        this.f56777f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f56776e, this.f56777f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
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
        int i11 = this.f56775d;
        if (i11 == 0) {
            s.b(obj);
            File file = this.f56776e;
            String name = file.getName();
            boolean exists = file.exists();
            i iVar = this.f56777f;
            if (exists) {
                aVar = iVar.f56748e;
                Intrinsics.f(name);
                if (aVar.l(name, bd.h.j(file)) != null) {
                    CoroutineContext coroutineContext = x0.a(iVar).getCoroutineContext();
                    a aVar3 = new a(iVar, null);
                    this.f56775d = 1;
                }
            } else {
                CoroutineContext coroutineContext2 = x0.a(iVar).getCoroutineContext();
                b bVar = new b(iVar, null);
                this.f56775d = 2;
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
