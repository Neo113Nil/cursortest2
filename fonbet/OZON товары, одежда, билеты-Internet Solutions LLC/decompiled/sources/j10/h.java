package j10;

import i10.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class h<I extends C7854a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC7238a<I> f68801a;

    public static final class a<I extends C7854a> extends h<I> {
        public a() {
            throw null;
        }

        @Override // j10.h
        public final ArrayList a(@NotNull Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            List<I> c11 = c();
            if (c11 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : c11) {
                if (((C7854a) obj).d().getClass().equals(clazz)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public static final class b<I extends C7854a> extends h<I> {
        public b() {
            throw null;
        }

        @Override // j10.h
        public final ArrayList a(@NotNull Class clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            List<I> b11 = b();
            if (b11 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : b11) {
                if (((C7854a) obj).d().getClass().equals(clazz)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public h(@NotNull InterfaceC7238a<I> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f68801a = store;
    }

    public abstract ArrayList a(@NotNull Class cls);

    public final List<I> b() {
        k.a<I> e11 = this.f68801a.b().e();
        if (e11 != null) {
            return e11.a();
        }
        return null;
    }

    public final List<I> c() {
        k.b<I> h11 = this.f68801a.b().h();
        if (h11 != null) {
            return h11.a();
        }
        return null;
    }
}
