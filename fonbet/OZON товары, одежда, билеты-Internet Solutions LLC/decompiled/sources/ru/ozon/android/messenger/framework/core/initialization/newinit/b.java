package ru.ozon.android.messenger.framework.core.initialization.newinit;

import B0.A0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.r;
import Sc.s;
import androidx.fragment.app.C5400v;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.p;
import ru.ozon.android.messenger.framework.data.q;
import ru.ozon.android.messenger.framework.navigation.action.e;
import ru.ozon.android.messenger.framework.presentation.messenger.c;
import ru.ozon.android.messenger.framework.presentation.messenger.f;
import ru.ozon.android.messenger.framework.presentation.messenger.g;

/* loaded from: classes6.dex */
public final class b implements ru.ozon.android.messenger.framework.core.initialization.newinit.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87345a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.initialization.di.b f87346b;

    /* renamed from: c, reason: collision with root package name */
    private final String f87347c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f87348d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f87349e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f87350f;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.framework.core.initialization.di.c> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.framework.core.initialization.di.c invoke() {
            C6740b dependencyStorage = b.this.a().getDependencyStorage();
            if (ru.ozon.android.messenger.framework.core.initialization.di.c.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException(A0.b("Requested component ", ru.ozon.android.messenger.framework.core.initialization.di.c.class.getSimpleName(), " is not DiComponent"));
            }
            return (ru.ozon.android.messenger.framework.core.initialization.di.c) dependencyStorage.b(ru.ozon.android.messenger.framework.core.initialization.di.c.class);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.core.initialization.newinit.b$b, reason: collision with other inner class name */
    static final class C1562b extends AbstractC7737t implements Function0<e> {
        C1562b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final e invoke() {
            return new e(b.this.getComponent().A());
        }
    }

    static final class c extends AbstractC7737t implements Function0<C5400v> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f87353b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final C5400v invoke() {
            return new C5400v();
        }
    }

    public b(@NotNull String namespace, @NotNull ru.ozon.android.messenger.framework.core.initialization.di.b dependencyHolder, String str) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(dependencyHolder, "dependencyHolder");
        this.f87345a = namespace;
        this.f87346b = dependencyHolder;
        this.f87347c = str;
        this.f87348d = k.b(c.f87353b);
        this.f87349e = k.b(new C1562b());
        this.f87350f = k.b(new a());
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.newinit.c
    @NotNull
    public final ru.ozon.android.messenger.framework.core.initialization.di.b a() {
        return this.f87346b;
    }

    @Override // ru.ozon.android.messenger.api.a
    @NotNull
    public final e b() {
        return (e) this.f87349e.getValue();
    }

    @Override // ru.ozon.android.messenger.api.a
    @NotNull
    public final g c(@NotNull f launchType, @NotNull p socketMode) {
        Intrinsics.checkNotNullParameter(launchType, "launchType");
        Intrinsics.checkNotNullParameter(socketMode, "socketMode");
        int i11 = q.f87652c;
        q.c(getComponent());
        q.d(socketMode);
        return c.a.a(launchType, this.f87345a, this.f87347c);
    }

    @Override // ru.ozon.android.messenger.api.a
    public final void close() {
        try {
            r.Companion companion = r.INSTANCE;
            getComponent().A().closeConnection();
            Unit unit = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
        }
    }

    @NotNull
    public final String d() {
        return this.f87345a;
    }

    @Override // ru.ozon.android.messenger.framework.core.initialization.newinit.c
    @NotNull
    public final ru.ozon.android.messenger.framework.core.initialization.di.c getComponent() {
        return (ru.ozon.android.messenger.framework.core.initialization.di.c) this.f87350f.getValue();
    }
}
