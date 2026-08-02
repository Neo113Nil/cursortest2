package ru.ozon.android.messenger.framework.core.viewmapper;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.j;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.models.g;

/* loaded from: classes6.dex */
public abstract class d<State, VO extends g> {
    private final List<Class<? extends d.w.a>> supportedUpdateKeys;
    private final Function2<d.w.a, VO, VO> updateConsumer;

    @NotNull
    private final j viewedPool;

    public d() {
        j jVar = new j();
        new HashMap();
        this.viewedPool = jVar;
    }

    public boolean canMap(Object obj) {
        return true;
    }

    @NotNull
    public abstract Function2<State, ru.ozon.android.messenger.framework.presentation.models.c, List<VO>> getMapper();

    @NotNull
    public abstract Function1<String, State> getParser();

    public List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.supportedUpdateKeys;
    }

    @NotNull
    public long[] getSupportedVersions() {
        return new long[]{1};
    }

    public Function2<d.w.a, VO, VO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @NotNull
    public e getViewMapperType() {
        return e.b.f87375a;
    }
}
