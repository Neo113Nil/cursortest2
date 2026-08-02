package ru.ozon.android.messenger.blocks.input.di;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.attachments.manager.d;
import ru.ozon.android.messenger.blocks.input.viewmodel.e;
import ru.ozon.android.messenger.blocks.input.viewmodel.f;
import ru.ozon.android.messenger.blocks.input.viewmodel.h;

/* loaded from: classes10.dex */
public final class c implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.initialization.di.c f85525a;

    /* renamed from: b, reason: collision with root package name */
    public a f85526b;

    /* renamed from: c, reason: collision with root package name */
    public ru.ozon.android.messenger.framework.navigation.controller.a f85527c;

    /* renamed from: d, reason: collision with root package name */
    public d f85528d;

    /* renamed from: e, reason: collision with root package name */
    public ru.ozon.android.messenger.blocks.input.pickerlauncher.b f85529e;

    /* renamed from: f, reason: collision with root package name */
    public ru.ozon.android.messenger.blocks.input.messagesender.b f85530f;

    /* renamed from: g, reason: collision with root package name */
    public e f85531g;

    /* renamed from: h, reason: collision with root package name */
    public f f85532h;

    public c(@NotNull ru.ozon.android.messenger.framework.core.initialization.di.c component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f85525a = component;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (!Intrinsics.d(modelClass, h.class)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f85525a.q(this);
        a aVar = this.f85526b;
        if (aVar == null) {
            Intrinsics.n("assistedFactory");
            throw null;
        }
        ru.ozon.android.messenger.framework.navigation.controller.a aVar2 = this.f85527c;
        if (aVar2 == null) {
            Intrinsics.n("messengerController");
            throw null;
        }
        d dVar = this.f85528d;
        if (dVar == null) {
            Intrinsics.n("inputAttachmentsManager");
            throw null;
        }
        ru.ozon.android.messenger.blocks.input.pickerlauncher.b bVar = this.f85529e;
        if (bVar == null) {
            Intrinsics.n("attachmentsPickerLauncher");
            throw null;
        }
        ru.ozon.android.messenger.blocks.input.messagesender.b bVar2 = this.f85530f;
        if (bVar2 == null) {
            Intrinsics.n("messageSender");
            throw null;
        }
        e eVar = this.f85531g;
        if (eVar == null) {
            Intrinsics.n("draftLoader");
            throw null;
        }
        f fVar = this.f85532h;
        if (fVar != null) {
            return aVar.a(aVar2, dVar, bVar, bVar2, eVar, fVar);
        }
        Intrinsics.n("draftSaver");
        throw null;
    }
}
