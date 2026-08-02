package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.q f90366a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.models.c f90367b;

    /* renamed from: c, reason: collision with root package name */
    private final String f90368c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f90369d;

    /* renamed from: e, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.domain.model.j f90370e;

    public v0(@NotNull ru.ozon.android.messenger.framework.presentation.models.q itemVO, @NotNull ru.ozon.android.messenger.framework.data.remote.models.c sendMessageModel, String str, boolean z11, ru.ozon.android.messenger.framework.domain.model.j jVar) {
        Intrinsics.checkNotNullParameter(itemVO, "itemVO");
        Intrinsics.checkNotNullParameter(sendMessageModel, "sendMessageModel");
        this.f90366a = itemVO;
        this.f90367b = sendMessageModel;
        this.f90368c = str;
        this.f90369d = z11;
        this.f90370e = jVar;
    }

    public static v0 a(v0 v0Var, ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.framework.data.remote.models.c cVar, String str, ru.ozon.android.messenger.framework.domain.model.j jVar, int i11) {
        if ((i11 & 1) != 0) {
            qVar = v0Var.f90366a;
        }
        ru.ozon.android.messenger.framework.presentation.models.q itemVO = qVar;
        if ((i11 & 2) != 0) {
            cVar = v0Var.f90367b;
        }
        ru.ozon.android.messenger.framework.data.remote.models.c sendMessageModel = cVar;
        if ((i11 & 4) != 0) {
            str = v0Var.f90368c;
        }
        String str2 = str;
        boolean z11 = (i11 & 8) != 0 ? v0Var.f90369d : true;
        if ((i11 & 16) != 0) {
            jVar = v0Var.f90370e;
        }
        Intrinsics.checkNotNullParameter(itemVO, "itemVO");
        Intrinsics.checkNotNullParameter(sendMessageModel, "sendMessageModel");
        return new v0(itemVO, sendMessageModel, str2, z11, jVar);
    }

    public final boolean b() {
        return this.f90369d;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.presentation.models.q c() {
        return this.f90366a;
    }

    public final String d() {
        return this.f90368c;
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.data.remote.models.c e() {
        return this.f90367b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f90366a, v0Var.f90366a) && Intrinsics.d(this.f90367b, v0Var.f90367b) && Intrinsics.d(this.f90368c, v0Var.f90368c) && this.f90369d == v0Var.f90369d && Intrinsics.d(this.f90370e, v0Var.f90370e);
    }

    public final ru.ozon.android.messenger.framework.domain.model.j f() {
        return this.f90370e;
    }

    public final int hashCode() {
        int hashCode = (this.f90367b.hashCode() + (this.f90366a.hashCode() * 31)) * 31;
        String str = this.f90368c;
        int a11 = C3532b.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f90369d);
        ru.ozon.android.messenger.framework.domain.model.j jVar = this.f90370e;
        return a11 + (jVar != null ? jVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "FailedMessage(itemVO=" + this.f90366a + ", sendMessageModel=" + this.f90367b + ", retryToken=" + this.f90368c + ", antibotCheckFailed=" + this.f90369d + ", updatePayload=" + this.f90370e + ")";
    }

    public /* synthetic */ v0(ru.ozon.android.messenger.framework.presentation.models.q qVar, ru.ozon.android.messenger.framework.data.remote.models.c cVar, ru.ozon.android.messenger.framework.domain.model.j jVar, int i11) {
        this(qVar, cVar, null, false, (i11 & 16) != 0 ? null : jVar);
    }
}
