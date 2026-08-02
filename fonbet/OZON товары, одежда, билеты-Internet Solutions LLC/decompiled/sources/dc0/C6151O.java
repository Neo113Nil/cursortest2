package dc0;

import Sc.InterfaceC4008j;
import Vb0.b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zb0.c;

/* renamed from: dc0.O, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6151O {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f61514a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f61515b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f61516c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: dc0.O$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DELETE;
        public static final a IGNORE;
        public static final a ONLY_NEW;

        static {
            a aVar = new a("ONLY_NEW", 0);
            ONLY_NEW = aVar;
            a aVar2 = new a("DELETE", 1);
            DELETE = aVar2;
            a aVar3 = new a("IGNORE", 2);
            IGNORE = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
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

    /* renamed from: dc0.O$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61517a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.IGNORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ONLY_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f61517a = iArr;
        }
    }

    public C6151O(@NotNull Fb0.f ozonIdConfig, @NotNull String appPackage, @NotNull InterfaceC4008j<C6157c> accountDataSource) {
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(accountDataSource, "accountDataSource");
        this.f61514a = appPackage;
        this.f61515b = ozonIdConfig.getAppName().a();
        this.f61516c = accountDataSource;
    }

    private final void e(C6154S c6154s, ArrayList arrayList, zb0.c cVar) {
        int i11 = b.f61517a[(cVar instanceof c.a ? a.DELETE : (cVar instanceof c.AbstractC2326c) || c6154s.j() ? a.ONLY_NEW : a.IGNORE).ordinal()];
        if (i11 != 1) {
            InterfaceC4008j interfaceC4008j = this.f61516c;
            if (i11 == 2) {
                ((C6157c) interfaceC4008j.getValue()).i(this.f61515b, this.f61514a, arrayList);
            } else {
                if (i11 != 3) {
                    throw new Sc.o();
                }
                ((C6157c) interfaceC4008j.getValue()).d();
            }
        }
    }

    public final void a() {
        ((C6157c) this.f61516c.getValue()).c();
    }

    @NotNull
    public final ArrayList b() {
        return ((C6157c) this.f61516c.getValue()).e();
    }

    @NotNull
    public final ArrayList c() {
        return ((C6157c) this.f61516c.getValue()).h();
    }

    public final void d(@NotNull C6154S newUserData, @NotNull ArrayList oldFormatAuthCookies, @NotNull zb0.c event) {
        Intrinsics.checkNotNullParameter(oldFormatAuthCookies, "oldFormatAuthCookies");
        Intrinsics.checkNotNullParameter(newUserData, "newUserData");
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            e(newUserData, oldFormatAuthCookies, event);
        } catch (SecurityException e11) {
            b.a.c(Vb0.b.f28514a, e11);
        }
    }
}
