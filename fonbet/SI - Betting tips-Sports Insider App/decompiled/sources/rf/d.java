package rf;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f22494b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f22495c;

    /* renamed from: d, reason: collision with root package name */
    public int f22496d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f22498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f22498f = hVar;
    }

    @Override // rf.i
    public final File a() {
        j jVar = this.f22498f.f22505d;
        boolean z5 = this.f22497e;
        File file = this.f22506a;
        if (!z5 && this.f22495c == null) {
            Function1 function1 = jVar.f22509c;
            if (function1 == null || ((Boolean) function1.invoke(file)).booleanValue()) {
                File[] listFiles = file.listFiles();
                this.f22495c = listFiles;
                if (listFiles == null) {
                    Function2 function2 = jVar.f22511e;
                    if (function2 != null) {
                        function2.invoke(file, new a(this.f22506a, null, "Cannot list files in a directory", 2, null));
                    }
                    this.f22497e = true;
                }
            }
            return null;
        }
        File[] fileArr = this.f22495c;
        if (fileArr != null) {
            int i5 = this.f22496d;
            Intrinsics.checkNotNull(fileArr);
            if (i5 < fileArr.length) {
                File[] fileArr2 = this.f22495c;
                Intrinsics.checkNotNull(fileArr2);
                int i10 = this.f22496d;
                this.f22496d = i10 + 1;
                return fileArr2[i10];
            }
        }
        if (!this.f22494b) {
            this.f22494b = true;
            return file;
        }
        Function1 function12 = jVar.f22510d;
        if (function12 != null) {
            function12.invoke(file);
        }
        return null;
    }
}
