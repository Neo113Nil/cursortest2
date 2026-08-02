package L0;

import I0.C1345j;
import I0.E;
import I0.InterfaceC1344i;
import I0.o;
import Ph.P;
import java.io.File;
import java.util.List;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f6748a = new e();

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f6749d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(0);
            this.f6749d = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) this.f6749d.invoke();
            if (Intrinsics.areEqual(FilesKt.getExtension(file), "preferences_pb")) {
                File absoluteFile = file.getAbsoluteFile();
                Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                return absoluteFile;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    public final InterfaceC1344i a(E storage, J0.b bVar, List migrations, P scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new d(C1345j.f5104a.a(storage, bVar, migrations, scope));
    }

    public final InterfaceC1344i b(J0.b bVar, List migrations, P scope, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new d(a(new o(h.f6751a, null, new a(produceFile), 2, null), bVar, migrations, scope));
    }
}
