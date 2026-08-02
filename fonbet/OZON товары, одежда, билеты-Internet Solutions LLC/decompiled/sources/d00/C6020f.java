package d00;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import n20.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "S", "", "vertical", "component", "", "Lru/ozon/composer/compose/widget/WidgetVersion;", "version", "Lkotlin/Function1;", "Ld00/d;", "", "init", "Ln20/i;", "a", "(Ljava/lang/String;Ljava/lang/String;[JLkotlin/jvm/functions/Function1;)Ln20/i;", "composer-compose-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: d00.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6020f {
    @NotNull
    public static final <S> i a(@NotNull String vertical, @NotNull String component, @NotNull long[] version, @NotNull Function1<? super C6018d<S>, Unit> init) {
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(init, "init");
        C6018d c6018d = new C6018d(vertical, component, version);
        init.invoke(c6018d);
        return c6018d.i();
    }

    public static /* synthetic */ i b(String str, String str2, long[] jArr, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            jArr = j.b();
        }
        return a(str, str2, jArr, function1);
    }
}
