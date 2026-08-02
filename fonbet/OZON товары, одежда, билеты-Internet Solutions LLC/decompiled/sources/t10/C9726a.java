package t10;

import D00.g;
import a00.C4911f;
import androidx.fragment.app.r;
import f00.InterfaceC6396b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.C8827c;
import q10.C8973a;
import ru.ozon.app.android.composer.view.ComposerNotificationController;
import x10.InterfaceC10645b;
import y00.AbstractC10819a;

/* renamed from: t10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9726a implements InterfaceC10645b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6396b f98965a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4911f f98966b;

    /* renamed from: c, reason: collision with root package name */
    private final ComposerNotificationController f98967c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C8973a f98968d;

    public C9726a(@NotNull InterfaceC6396b composerDebugFlagsManagerLibsApi, @NotNull C4911f ownerContainer, ComposerNotificationController composerNotificationController, @NotNull C8973a composerIncidentNotificationController) {
        Intrinsics.checkNotNullParameter(composerDebugFlagsManagerLibsApi, "composerDebugFlagsManagerLibsApi");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        Intrinsics.checkNotNullParameter(composerIncidentNotificationController, "composerIncidentNotificationController");
        this.f98965a = composerDebugFlagsManagerLibsApi;
        this.f98966b = ownerContainer;
        this.f98967c = composerNotificationController;
        this.f98968d = composerIncidentNotificationController;
    }

    @Override // x10.InterfaceC10645b
    public final void process(@NotNull AbstractC10819a.c effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        g b11 = effect.b();
        r a11 = this.f98966b.a();
        if (b11 != null && !b11.a().isEmpty() && a11 != null) {
            C8827c c8827c = C8827c.f80007b;
            InterfaceC6396b interfaceC6396b = this.f98965a;
            if (interfaceC6396b.E(c8827c) && interfaceC6396b.C()) {
                this.f98968d.a(b11);
            }
        }
        this.f98967c.process(effect);
    }

    @Override // x10.InterfaceC10645b
    public final void process(@NotNull AbstractC10819a.b effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (this.f98966b.a() != null) {
            InterfaceC6396b interfaceC6396b = this.f98965a;
            if (interfaceC6396b.k() && interfaceC6396b.C()) {
                this.f98968d.b("Страница " + effect.d() + " перезагрузилась несколько раз за " + (effect.a() / 1000.0f) + " сек, стоит обратить на это внимание.", effect.b());
            }
        }
        this.f98967c.process(effect);
    }
}
