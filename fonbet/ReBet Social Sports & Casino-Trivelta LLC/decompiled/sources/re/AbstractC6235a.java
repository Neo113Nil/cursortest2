package re;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.C5582a;
import org.jetbrains.annotations.NotNull;

/* renamed from: re.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6235a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0891a f64111c = new C0891a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f64112a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64113b;

    /* renamed from: re.a$a, reason: collision with other inner class name */
    public static final class C0891a {

        /* renamed from: re.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0892a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.Conversations.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.Messages.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.Trigger.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.KnowledgeBase.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[c.General.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ C0891a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC6235a a(C5582a.b bVar, c module) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Intrinsics.checkNotNullParameter(module, "module");
            Integer b10 = bVar.b();
            int intValue = b10 != null ? b10.intValue() : b.f64114d.a();
            int i10 = C0892a.$EnumSwitchMapping$0[module.ordinal()];
            if (i10 == 1) {
                C6239e c6239e = C6239e.f64119d;
                if (intValue == c6239e.a()) {
                    return c6239e;
                }
                C6247m c6247m = C6247m.f64127d;
                if (intValue == c6247m.a()) {
                    return c6247m;
                }
                r rVar = r.f64132d;
                if (intValue == rVar.a()) {
                    return rVar;
                }
                C6236b c6236b = C6236b.f64116d;
                if (intValue == c6236b.a()) {
                    return c6236b;
                }
                C6240f c6240f = C6240f.f64120d;
                if (intValue == c6240f.a()) {
                    return c6240f;
                }
                C6250p c6250p = C6250p.f64130d;
                if (intValue == c6250p.a()) {
                    return c6250p;
                }
                C6244j c6244j = C6244j.f64124d;
                if (intValue == c6244j.a()) {
                    return c6244j;
                }
                C6248n c6248n = C6248n.f64128d;
                if (intValue == c6248n.a()) {
                    return c6248n;
                }
                C6249o c6249o = C6249o.f64129d;
                if (intValue == c6249o.a()) {
                    return c6249o;
                }
                C6251q c6251q = C6251q.f64131d;
                if (intValue == c6251q.a()) {
                    return c6251q;
                }
                C6243i c6243i = C6243i.f64123d;
                if (intValue == c6243i.a()) {
                    return c6243i;
                }
                C6237c c6237c = C6237c.f64117d;
                if (intValue == c6237c.a()) {
                    return c6237c;
                }
                C6252s c6252s = C6252s.f64133d;
                if (intValue == c6252s.a()) {
                    return c6252s;
                }
                C6242h c6242h = C6242h.f64122d;
                if (intValue == c6242h.a()) {
                    return c6242h;
                }
                C6241g c6241g = C6241g.f64121d;
                if (intValue == c6241g.a()) {
                    return c6241g;
                }
                C6246l c6246l = C6246l.f64126d;
                if (intValue == c6246l.a()) {
                    return c6246l;
                }
                t tVar = t.f64134d;
                return intValue == tVar.a() ? tVar : b(module, intValue);
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    S s10 = S.f64110d;
                    return intValue == s10.a() ? s10 : b(module, intValue);
                }
                if (i10 != 4) {
                    if (i10 == 5) {
                        return b(module, intValue);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                x xVar = x.f64138d;
                if (intValue == xVar.a()) {
                    return xVar;
                }
                y yVar = y.f64139d;
                if (intValue == yVar.a()) {
                    return yVar;
                }
                z zVar = z.f64140d;
                return intValue == zVar.a() ? zVar : b(module, intValue);
            }
            C6220B c6220b = C6220B.f64094d;
            if (intValue == c6220b.a()) {
                return c6220b;
            }
            C6222D c6222d = C6222D.f64096d;
            if (intValue == c6222d.a()) {
                return c6222d;
            }
            C6221C c6221c = C6221C.f64095d;
            if (intValue == c6221c.a()) {
                return c6221c;
            }
            C6230L c6230l = C6230L.f64104d;
            if (intValue == c6230l.a()) {
                return c6230l;
            }
            C6227I c6227i = C6227I.f64101d;
            if (intValue == c6227i.a()) {
                return c6227i;
            }
            C6234P c6234p = C6234P.f64108d;
            if (intValue == c6234p.a()) {
                return c6234p;
            }
            C6231M c6231m = C6231M.f64105d;
            if (intValue == c6231m.a()) {
                return c6231m;
            }
            C6223E c6223e = C6223E.f64097d;
            if (intValue == c6223e.a()) {
                return c6223e;
            }
            C6225G c6225g = C6225G.f64099d;
            if (intValue == c6225g.a()) {
                return c6225g;
            }
            C6233O c6233o = C6233O.f64107d;
            if (intValue == c6233o.a()) {
                return c6233o;
            }
            C6224F c6224f = C6224F.f64098d;
            if (intValue == c6224f.a()) {
                return c6224f;
            }
            C6232N c6232n = C6232N.f64106d;
            if (intValue == c6232n.a()) {
                return c6232n;
            }
            C6228J c6228j = C6228J.f64102d;
            return intValue == c6228j.a() ? c6228j : b(module, intValue);
        }

        public final AbstractC6235a b(c cVar, int i10) {
            d dVar = d.f64115d;
            if (i10 == dVar.a()) {
                return dVar;
            }
            int i11 = C0892a.$EnumSwitchMapping$0[cVar.ordinal()];
            if (i11 == 1) {
                return C6245k.f64125d;
            }
            if (i11 == 2) {
                return C6226H.f64100d;
            }
            if (i11 == 3) {
                return Q.f64109d;
            }
            if (i11 == 4) {
                return u.f64135d;
            }
            if (i11 == 5) {
                return b.f64114d;
            }
            throw new NoWhenBranchMatchedException();
        }

        public C0891a() {
        }
    }

    /* renamed from: re.a$b */
    public static final class b extends AbstractC6235a {

        /* renamed from: d, reason: collision with root package name */
        public static final b f64114d = new b();

        public b() {
            super(-1, od.t.f60968X2, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1385884657;
        }

        public String toString() {
            return "GeneralError";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: re.a$c */
    public static final class c {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c Conversations = new c("Conversations", 0);
        public static final c Messages = new c("Messages", 1);
        public static final c Trigger = new c("Trigger", 2);
        public static final c KnowledgeBase = new c("KnowledgeBase", 3);
        public static final c General = new c("General", 4);

        private static final /* synthetic */ c[] $values() {
            return new c[]{Conversations, Messages, Trigger, KnowledgeBase, General};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private c(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* renamed from: re.a$d */
    public static final class d extends AbstractC6235a {

        /* renamed from: d, reason: collision with root package name */
        public static final d f64115d = new d();

        public d() {
            super(1023, od.t.f61059k5, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1342551200;
        }

        public String toString() {
            return "TooManyRequestsError";
        }
    }

    public /* synthetic */ AbstractC6235a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    public final int a() {
        return this.f64112a;
    }

    public final int b() {
        return this.f64113b;
    }

    public AbstractC6235a(int i10, int i11) {
        this.f64112a = i10;
        this.f64113b = i11;
    }
}
