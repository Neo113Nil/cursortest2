package okio.internal;

import bg.j;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.e;
import mf.h;
import okio.FileSystem;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbg/j;", "Lokio/Path;", "", "<anonymous>", "(Lbg/j;)V"}, k = 3, mv = {2, 2, 0})
@e(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend", v = 1)
/* renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class FileSystem$commonListRecursively$1 extends h implements Function2<j, Continuation<? super Unit>, Object> {
    final /* synthetic */ Path $dir;
    final /* synthetic */ boolean $followSymlinks;
    final /* synthetic */ FileSystem $this_commonListRecursively;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonListRecursively$1(Path path, FileSystem fileSystem, boolean z5, Continuation<? super FileSystem$commonListRecursively$1> continuation) {
        super(2, continuation);
        this.$dir = path;
        this.$this_commonListRecursively = fileSystem;
        this.$followSymlinks = z5;
    }

    @Override // mf.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileSystem$commonListRecursively$1 fileSystem$commonListRecursively$1 = new FileSystem$commonListRecursively$1(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, continuation);
        fileSystem$commonListRecursively$1.L$0 = obj;
        return fileSystem$commonListRecursively$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(j jVar, Continuation<? super Unit> continuation) {
        return ((FileSystem$commonListRecursively$1) create(jVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Iterator<Path> it;
        l lVar;
        j jVar = (j) this.L$0;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.label;
        if (i5 == 0) {
            h8.b.B(obj);
            l lVar2 = new l();
            lVar2.addLast(this.$dir);
            it = this.$this_commonListRecursively.list(this.$dir).iterator();
            lVar = lVar2;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            lVar = (l) this.L$1;
            h8.b.B(obj);
        }
        Iterator<Path> it2 = it;
        while (it2.hasNext()) {
            Path next = it2.next();
            FileSystem fileSystem = this.$this_commonListRecursively;
            boolean z5 = this.$followSymlinks;
            this.L$0 = jVar;
            this.L$1 = lVar;
            this.L$2 = it2;
            this.L$3 = null;
            this.label = 1;
            if (FileSystem.collectRecursively(jVar, fileSystem, lVar, next, z5, false, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f19194a;
    }
}
