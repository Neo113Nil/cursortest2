package w20;

import Sc.o;
import Td0.d;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.debugMenu.internal.presentation.OzonDebugMenuActivity;
import s20.d;

/* renamed from: w20.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10421c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final H20.a f103386a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10420b f103387b;

    /* renamed from: w20.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103388a;

        static {
            int[] iArr = new int[EnumC10419a.values().length];
            try {
                iArr[EnumC10419a.DEBUG_LOCALIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10419a.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103388a = iArr;
        }
    }

    public C10421c(@NotNull H20.a entryPointsProvider, @NotNull C10420b router) {
        Intrinsics.checkNotNullParameter(entryPointsProvider, "entryPointsProvider");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f103386a = entryPointsProvider;
        this.f103387b = router;
    }

    public final void a(@NotNull OzonDebugMenuActivity context, Uri uri) {
        Function1<s20.c, Intent> intent;
        Function1<Td0.c, Intent> b11;
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            return;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) C7714v.Q(0, pathSegments);
        H20.a aVar = this.f103386a;
        Object obj = null;
        if (str != null) {
            aVar.getClass();
            for (s20.d dVar : H20.a.b()) {
                d.a aVar2 = dVar instanceof d.a ? (d.a) dVar : null;
                if (aVar2 != null && Intrinsics.d(aVar2.getId(), str)) {
                    intent = aVar2.getIntent();
                    break;
                }
            }
        }
        intent = null;
        if (intent != null) {
            context.startActivity(intent.invoke(new C10423e(uri)));
            return;
        }
        List<String> pathSegments2 = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        String str2 = (String) C7714v.Q(0, pathSegments2);
        if (str2 != null) {
            for (Td0.d dVar2 : aVar.a()) {
                d.a aVar3 = dVar2 instanceof d.a ? (d.a) dVar2 : null;
                if (aVar3 != null && Intrinsics.d(aVar3.a(), str2)) {
                    b11 = aVar3.b();
                    break;
                }
            }
        }
        b11 = null;
        if (b11 != null) {
            context.startActivity(b11.invoke(new C10422d(uri)));
            return;
        }
        List<String> pathSegments3 = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments3, "getPathSegments(...)");
        String pathToFind = (String) C7714v.M(pathSegments3);
        if (pathToFind == null) {
            return;
        }
        EnumC10419a.Companion.getClass();
        Intrinsics.checkNotNullParameter(pathToFind, "pathToFind");
        Iterator<E> it = EnumC10419a.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.d(((EnumC10419a) next).b(), pathToFind)) {
                obj = next;
                break;
            }
        }
        EnumC10419a enumC10419a = (EnumC10419a) obj;
        if (enumC10419a == null) {
            return;
        }
        int i11 = a.f103388a[enumC10419a.ordinal()];
        if (i11 == 1) {
            this.f103387b.c(g.DEBUG_LOCALIZATION);
        } else if (i11 != 2) {
            throw new o();
        }
    }
}
