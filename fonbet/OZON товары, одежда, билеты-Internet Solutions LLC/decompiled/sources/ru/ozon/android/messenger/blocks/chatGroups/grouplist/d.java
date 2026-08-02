package ru.ozon.android.messenger.blocks.chatGroups.grouplist;

import Sc.InterfaceC4008j;
import X4.a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

/* loaded from: classes10.dex */
public abstract class d<Binding extends X4.a> extends ru.ozon.android.messenger.framework.core.viewmapper.b<h, m, Binding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final JsonParser f84700b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Jb.c f84701c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f84702d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<String, h> f84703e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function2<h, ru.ozon.android.messenger.framework.presentation.models.c, List<m>> f84704f;

    public d(@NotNull JsonParser deserializer, @NotNull Jb.c blocksItemMapperProvider) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(blocksItemMapperProvider, "blocksItemMapperProvider");
        this.f84700b = deserializer;
        this.f84701c = blocksItemMapperProvider;
        this.f84702d = Sc.k.b(new a(this));
        this.f84703e = new c(this);
        this.f84704f = new b(this);
    }

    public static final ru.ozon.android.messenger.framework.data.remote.mapper.a n(d dVar) {
        return (ru.ozon.android.messenger.framework.data.remote.mapper.a) dVar.f84702d.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<h, ru.ozon.android.messenger.framework.presentation.models.c, List<m>> getMapper() {
        return this.f84704f;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, h> getParser() {
        return this.f84703e;
    }
}
