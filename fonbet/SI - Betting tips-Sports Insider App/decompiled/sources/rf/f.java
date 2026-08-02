package rf;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f22500b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f22501c;

    /* renamed from: d, reason: collision with root package name */
    public int f22502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f22503e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f22503e = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r1.length == 0) goto L31;
     */
    @Override // rf.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File a() {
        Function2 function2;
        j jVar = this.f22503e.f22505d;
        boolean z5 = this.f22500b;
        File file = this.f22506a;
        if (z5) {
            File[] fileArr = this.f22501c;
            if (fileArr != null) {
                int i5 = this.f22502d;
                Intrinsics.checkNotNull(fileArr);
                if (i5 >= fileArr.length) {
                    Function1 function1 = jVar.f22510d;
                    if (function1 != null) {
                        function1.invoke(file);
                        return null;
                    }
                }
            }
            if (this.f22501c == null) {
                File[] listFiles = file.listFiles();
                this.f22501c = listFiles;
                if (listFiles == null && (function2 = jVar.f22511e) != null) {
                    function2.invoke(file, new a(this.f22506a, null, "Cannot list files in a directory", 2, null));
                }
                File[] fileArr2 = this.f22501c;
                if (fileArr2 != null) {
                    Intrinsics.checkNotNull(fileArr2);
                }
                Function1 function12 = jVar.f22510d;
                if (function12 != null) {
                    function12.invoke(file);
                }
            }
            File[] fileArr3 = this.f22501c;
            Intrinsics.checkNotNull(fileArr3);
            int i10 = this.f22502d;
            this.f22502d = i10 + 1;
            return fileArr3[i10];
        }
        Function1 function13 = jVar.f22509c;
        if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
            this.f22500b = true;
            return file;
        }
        return null;
    }
}
