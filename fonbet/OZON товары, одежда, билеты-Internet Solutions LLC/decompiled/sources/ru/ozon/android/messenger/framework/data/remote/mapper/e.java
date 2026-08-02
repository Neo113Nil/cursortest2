package ru.ozon.android.messenger.framework.data.remote.mapper;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.b;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.framework.presentation.models.t;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.android.messenger.framework.presentation.models.v;
import ru.ozon.app.android.messenger.R$string;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f87799a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.emptystate.e f87800b;

    public e(@NotNull ru.ozon.android.messenger.framework.data.b blockStore, @NotNull ru.ozon.android.messenger.blocks.emptystate.e emptyScreenStateBlockFactory) {
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(emptyScreenStateBlockFactory, "emptyScreenStateBlockFactory");
        this.f87799a = blockStore;
        this.f87800b = emptyScreenStateBlockFactory;
    }

    public final q a(@NotNull p itemInfo) {
        Object obj;
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        ru.ozon.android.messenger.blocks.emptystate.v2.g h11 = ru.ozon.android.messenger.blocks.emptystate.e.h(this.f87800b);
        String a11 = b.a.a("messenger", f.c.EMPTY_STATE.b());
        ru.ozon.android.messenger.framework.data.b bVar = this.f87799a;
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = bVar.c(a11);
        if (c11 != null) {
            Iterator<T> it = c11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ru.ozon.android.messenger.framework.core.viewmapper.d) obj) instanceof ru.ozon.android.messenger.blocks.emptystate.v2.b) {
                    break;
                }
            }
            ru.ozon.android.messenger.framework.core.viewmapper.d dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj;
            if (dVar != null) {
                return v.c(new u(h11, bVar.a(c11), dVar.getViewMapperType()), itemInfo);
            }
        }
        return null;
    }

    public final q b(@NotNull s itemInfo) {
        Object obj;
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        ru.ozon.android.messenger.blocks.error.b bVar = new ru.ozon.android.messenger.blocks.error.b(ru.ozon.android.messenger.framework.presentation.models.h.a(itemInfo.getId()), R$string.messenger_error_state_parsing);
        s d11 = s.d(itemInfo, null, new t.a(true), null, 0.0d, false, false, 0, null, 262139);
        String a11 = b.a.a("messenger", f.c.ERROR.b());
        ru.ozon.android.messenger.framework.data.b bVar2 = this.f87799a;
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<? extends Object, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = bVar2.c(a11);
        if (c11 != null) {
            Iterator<T> it = c11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ru.ozon.android.messenger.framework.core.viewmapper.d) obj) instanceof ru.ozon.android.messenger.blocks.error.d) {
                    break;
                }
            }
            ru.ozon.android.messenger.framework.core.viewmapper.d dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj;
            if (dVar != null) {
                return v.c(new u(bVar, bVar2.a(c11), dVar.getViewMapperType()), d11);
            }
        }
        return null;
    }
}
