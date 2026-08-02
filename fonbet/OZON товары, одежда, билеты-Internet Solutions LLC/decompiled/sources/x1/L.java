package x1;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C10638m f104833a = new C10638m(kotlin.collections.K.f71697a, null);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f104834b = 0;

    @NotNull
    public static final androidx.compose.ui.e b(@NotNull androidx.compose.ui.e eVar, Object obj, @NotNull Function2<? super F, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return eVar.l0(new SuspendPointerInputElement(obj, null, null, function2, 6));
    }
}
