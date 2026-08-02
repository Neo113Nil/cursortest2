package td;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* renamed from: td.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC9836b extends InterfaceC9835a, InterfaceC9811B {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: td.b$a */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a DECLARATION;
        public static final a DELEGATION;
        public static final a FAKE_OVERRIDE;
        public static final a SYNTHESIZED;

        static {
            a aVar = new a("DECLARATION", 0);
            DECLARATION = aVar;
            a aVar2 = new a("FAKE_OVERRIDE", 1);
            FAKE_OVERRIDE = aVar2;
            a aVar3 = new a("DELEGATION", 2);
            DELEGATION = aVar3;
            a aVar4 = new a("SYNTHESIZED", 3);
            SYNTHESIZED = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    void S(@NotNull Collection<? extends InterfaceC9836b> collection);

    @Override // td.InterfaceC9835a, td.InterfaceC9845k
    @NotNull
    InterfaceC9836b a();

    @NotNull
    a getKind();

    @Override // td.InterfaceC9835a
    @NotNull
    Collection<? extends InterfaceC9836b> o();

    @NotNull
    InterfaceC9836b u(InterfaceC9839e interfaceC9839e, EnumC9812C enumC9812C, AbstractC9850p abstractC9850p, a aVar);
}
