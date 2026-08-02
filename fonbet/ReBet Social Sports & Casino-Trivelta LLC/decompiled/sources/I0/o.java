package I0;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class o implements E {

    /* renamed from: d, reason: collision with root package name */
    public static final b f5264d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final Set f5265e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f5266f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final A f5267a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f5268b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f5269c;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f5270d = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return v.a(it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return o.f5265e;
        }

        public final Object b() {
            return o.f5266f;
        }

        public b() {
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ File f5271d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(0);
            this.f5271d = file;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() {
            b bVar = o.f5264d;
            Object b10 = bVar.b();
            File file = this.f5271d;
            synchronized (b10) {
                bVar.a().remove(file.getAbsolutePath());
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public o(A serializer, Function1 coordinatorProducer, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.f5267a = serializer;
        this.f5268b = coordinatorProducer;
        this.f5269c = produceFile;
    }

    @Override // I0.E
    public F a() {
        File file = ((File) this.f5269c.invoke()).getCanonicalFile();
        synchronized (f5266f) {
            String path = file.getAbsolutePath();
            Set set = f5265e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.checkNotNullExpressionValue(path, "path");
            set.add(path);
        }
        Intrinsics.checkNotNullExpressionValue(file, "file");
        return new p(file, this.f5267a, (t) this.f5268b.invoke(file), new c(file));
    }

    public /* synthetic */ o(A a10, Function1 function1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(a10, (i10 & 2) != 0 ? a.f5270d : function1, function0);
    }
}
