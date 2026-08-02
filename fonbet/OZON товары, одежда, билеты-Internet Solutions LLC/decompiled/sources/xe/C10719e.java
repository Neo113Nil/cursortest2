package xe;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
/* renamed from: xe.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10719e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Iterator f105448d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f105449e;

    /* renamed from: f, reason: collision with root package name */
    int f105450f;

    C10719e() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f105449e = obj;
        this.f105450f |= LinearLayoutManager.INVALID_OFFSET;
        return C10721f.c(null, this);
    }
}
