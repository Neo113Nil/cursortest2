package rf;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends kotlin.collections.b {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f22504c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f22505d;

    public h(j jVar) {
        this.f22505d = jVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f22504c = arrayDeque;
        File rootFile = jVar.f22507a;
        if (rootFile.isDirectory()) {
            arrayDeque.push(c(rootFile));
        } else if (!rootFile.isFile()) {
            this.f19197a = 2;
        } else {
            Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            arrayDeque.push(new e(rootFile));
        }
    }

    @Override // kotlin.collections.b
    public final void a() {
        File file;
        File a7;
        while (true) {
            ArrayDeque arrayDeque = this.f22504c;
            i iVar = (i) arrayDeque.peek();
            if (iVar == null) {
                file = null;
                break;
            }
            a7 = iVar.a();
            if (a7 == null) {
                arrayDeque.pop();
            } else if (Intrinsics.areEqual(a7, iVar.f22506a) || !a7.isDirectory() || arrayDeque.size() >= this.f22505d.f22512f) {
                break;
            } else {
                arrayDeque.push(c(a7));
            }
        }
        file = a7;
        if (file == null) {
            this.f19197a = 2;
        } else {
            this.f19198b = file;
            this.f19197a = 1;
        }
    }

    public final c c(File file) {
        int i5 = g.$EnumSwitchMapping$0[this.f22505d.f22508b.ordinal()];
        if (i5 == 1) {
            return new f(this, file);
        }
        if (i5 == 2) {
            return new d(this, file);
        }
        throw new gf.m();
    }
}
