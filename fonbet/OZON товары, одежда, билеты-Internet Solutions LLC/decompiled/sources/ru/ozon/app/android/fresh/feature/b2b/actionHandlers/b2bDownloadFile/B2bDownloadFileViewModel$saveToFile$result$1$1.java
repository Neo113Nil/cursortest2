package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile;

import Sc.s;
import Wc.a;
import We.C;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sf.F;
import sf.InterfaceC9683i;
import sf.z;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lxe/M;)Ljava/io/File;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile.B2bDownloadFileViewModel$saveToFile$result$1$1", f = "B2bDownloadFileViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bDownloadFileViewModel$saveToFile$result$1$1 extends j implements Function2<M, d<? super File>, Object> {
    final /* synthetic */ We.M $body;
    final /* synthetic */ File $cacheDir;
    final /* synthetic */ String $fileName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bDownloadFileViewModel$saveToFile$result$1$1(We.M m11, File file, String str, d<? super B2bDownloadFileViewModel$saveToFile$result$1$1> dVar) {
        super(2, dVar);
        this.$body = m11;
        this.$cacheDir = file;
        this.$fileName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bDownloadFileViewModel$saveToFile$result$1$1(this.$body, this.$cacheDir, this.$fileName, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        C contentType = this.$body.contentType();
        if (contentType == null || (str = contentType.d()) == null) {
            str = "tmp";
        }
        File file = new File(this.$cacheDir, "docs");
        File file2 = !file.exists() ? file : null;
        if (file2 != null) {
            file2.mkdir();
        }
        File createTempFile = File.createTempFile(this.$fileName, ".".concat(str), file);
        InterfaceC9683i source = this.$body.source();
        try {
            Intrinsics.f(createTempFile);
            F c11 = z.c(z.h(createTempFile));
            try {
                c11.y0(source);
                c11.flush();
                Unit unit = Unit.f71690a;
                c11.close();
                source.close();
                return createTempFile;
            } finally {
            }
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super File> dVar) {
        return ((B2bDownloadFileViewModel$saveToFile$result$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
