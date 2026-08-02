package ru.ozon.android.messenger.blocks.rateoperator.bottomsheet;

import Ae.M0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.n;
import ru.ozon.android.messenger.blocks.rateoperator.c;
import ru.ozon.android.messenger.blocks.rateoperator.message.c;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class h extends ru.ozon.android.messenger.framework.presentation.common.viewmodel.a<n> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.a f86211b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f86212c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f86213d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f86214e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull ru.ozon.android.messenger.framework.domain.repository.a actionRepository, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a controller, @NotNull ru.ozon.android.messenger.framework.domain.repository.b repository) {
        super(null);
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f86211b = actionRepository;
        this.f86212c = controller;
        this.f86213d = repository;
    }

    public static final void f0(h hVar) {
        hVar.f86214e = true;
        hVar.d0().setValue(n.c.f86231a);
    }

    public static final void h0(h hVar, String str) {
        if (str == null) {
            hVar.f86214e = true;
            hVar.d0().setValue(n.c.f86231a);
            return;
        }
        boolean z11 = hVar.f86214e;
        ru.ozon.android.messenger.framework.navigation.controller.a aVar = hVar.f86212c;
        if (z11) {
            aVar.o(null);
        } else {
            aVar.v(new c.a(new c.b(0), str));
        }
        hVar.d0().setValue(n.d.f86232a);
    }

    public final void handleAction(@NotNull AtomAction actionVO) {
        Intrinsics.checkNotNullParameter(actionVO, "actionVO");
        this.f86212c.q(ru.ozon.android.messenger.framework.navigation.action.b.e(actionVO, null, 3));
    }

    public final void i0(boolean z11) {
        if (z11) {
            if (this.f86214e) {
                d0().setValue(n.a.f86229a);
            }
        } else if (this.f86214e) {
            d0().setValue(n.c.f86231a);
        }
    }

    @NotNull
    public final M0<NetworkInfo> j0() {
        return this.f86213d.E();
    }

    public final void k0(AtomActionDTO atomActionDTO, @NotNull String comment, int i11, @NotNull ArrayList selectedReasons, String str) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        d0().setValue(n.b.f86230a);
        C10727i.c(x0.a(this), null, null, new g(atomActionDTO, comment, i11, selectedReasons, this, str, null), 3);
    }

    public final void l0(String str) {
        if (str != null) {
            this.f86212c.v(new c.a(new c.a(0), str));
        } else {
            this.f86214e = true;
            d0().setValue(n.c.f86231a);
        }
    }
}
