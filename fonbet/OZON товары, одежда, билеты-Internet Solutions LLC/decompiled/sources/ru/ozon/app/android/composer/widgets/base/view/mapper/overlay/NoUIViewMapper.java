package ru.ozon.app.android.composer.widgets.base.view.mapper.overlay;

import A00.a;
import Sc.InterfaceC3999a;
import c20.r;
import c20.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;

@InterfaceC3999a
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\t\b\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0016\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR6\u0010!\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010 8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u0007\u001a\u0004\b#\u0010$R,\u0010'\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006("}, d2 = {"Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/NoUIViewMapper;", "", "S", "Ll20/c;", "I", "Lc20/s;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Ll20/c;)Ll20/c;", "state", "Ll20/d;", "info", "", "map", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "", "onRefresh", "(Ll10/i;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Lkotlin/Function2;", "updateConsumer", "Lkotlin/jvm/functions/Function2;", "getUpdateConsumer", "()Lkotlin/jvm/functions/Function2;", "getUpdateConsumer$annotations", "getMapper", "mapper", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NoUIViewMapper<S, I extends c> extends s<S, I> {
    private final Function2<a.J.InterfaceC0007a, I, I> updateConsumer;

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    public abstract Function2<S, d, List<I>> getMapper();

    public Function2<a.J.InterfaceC0007a, I, I> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // c20.r
    @NotNull
    public final r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r, I00.d
    public I handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull I oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Function2<a.J.InterfaceC0007a, I, I> updateConsumer = getUpdateConsumer();
        if (updateConsumer != null) {
            return updateConsumer.invoke(update, oldItem);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<I> map(S state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }

    public void onRefresh(@NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(references, "references");
    }

    @Override // c20.s, c20.InterfaceC5736d
    public final void onRefresh(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        onRefresh((ComposerReferences) V11);
    }
}
