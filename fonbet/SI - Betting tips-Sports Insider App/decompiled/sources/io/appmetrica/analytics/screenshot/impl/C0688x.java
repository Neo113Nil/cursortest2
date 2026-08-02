package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688x implements U {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f15401a;

    public C0688x(@NotNull ClientContext clientContext) {
        this.f15401a = clientContext;
    }

    public final void a(@NotNull String str) {
        this.f15401a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.INSTANCE.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(kotlin.collections.m0.b(new Pair("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
