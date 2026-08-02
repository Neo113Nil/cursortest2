package rd;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import rd.AbstractC9252f;

/* renamed from: rd.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9253g {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C9253g f83309c = new C9253g(C7714v.b0(AbstractC9252f.a.f83305c, AbstractC9252f.d.f83308c, AbstractC9252f.b.f83306c, AbstractC9252f.c.f83307c));

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f83310d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<AbstractC9252f> f83311a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f83312b;

    /* renamed from: rd.g$a */
    public static final class a {
        @NotNull
        public static C9253g a() {
            return C9253g.f83309c;
        }
    }

    /* renamed from: rd.g$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final AbstractC9252f f83313a;

        /* renamed from: b, reason: collision with root package name */
        private final int f83314b;

        public b(@NotNull AbstractC9252f kind, int i11) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            this.f83313a = kind;
            this.f83314b = i11;
        }

        @NotNull
        public final AbstractC9252f a() {
            return this.f83313a;
        }

        public final int b() {
            return this.f83314b;
        }

        @NotNull
        public final AbstractC9252f c() {
            return this.f83313a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f83313a, bVar.f83313a) && this.f83314b == bVar.f83314b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f83314b) + (this.f83313a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
            sb2.append(this.f83313a);
            sb2.append(", arity=");
            return Ek.a.d(sb2, this.f83314b, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9253g(@NotNull List<? extends AbstractC9252f> kinds) {
        Intrinsics.checkNotNullParameter(kinds, "kinds");
        this.f83311a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            Sd.c b11 = ((AbstractC9252f) obj).b();
            Object obj2 = linkedHashMap.get(b11);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(b11, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f83312b = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b b(@NotNull Sd.c packageFqName, @NotNull String className) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(className, "className");
        List<AbstractC9252f> list = (List) this.f83312b.get(packageFqName);
        if (list != null) {
            for (AbstractC9252f abstractC9252f : list) {
                if (h.e0(className, abstractC9252f.a(), false)) {
                    String substring = className.substring(abstractC9252f.a().length());
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    if (substring.length() != 0) {
                        int length = substring.length();
                        int i11 = 0;
                        for (int i12 = 0; i12 < length; i12++) {
                            int charAt = substring.charAt(i12) - '0';
                            if (charAt >= 0 && charAt < 10) {
                                i11 = (i11 * 10) + charAt;
                            }
                        }
                        valueOf = Integer.valueOf(i11);
                        if (valueOf == null) {
                            return new b(abstractC9252f, valueOf.intValue());
                        }
                    }
                    valueOf = null;
                    if (valueOf == null) {
                    }
                }
            }
        }
        return null;
    }
}
