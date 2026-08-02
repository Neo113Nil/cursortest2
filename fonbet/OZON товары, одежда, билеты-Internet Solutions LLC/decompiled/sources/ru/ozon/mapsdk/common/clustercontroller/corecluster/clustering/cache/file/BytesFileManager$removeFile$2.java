package ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file;

import Sc.s;
import Wc.a;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.cache.file.BytesFileManager$removeFile$2", f = "BytesFileManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BytesFileManager$removeFile$2 extends j implements Function2<M, d<? super Boolean>, Object> {
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ BytesFileManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BytesFileManager$removeFile$2(BytesFileManager bytesFileManager, String str, d<? super BytesFileManager$removeFile$2> dVar) {
        super(2, dVar);
        this.this$0 = bytesFileManager;
        this.$fileName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BytesFileManager$removeFile$2(this.this$0, this.$fileName, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        File file;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        file = this.this$0.getFile(this.$fileName);
        return Boolean.valueOf(file.delete());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Boolean> dVar) {
        return ((BytesFileManager$removeFile$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
