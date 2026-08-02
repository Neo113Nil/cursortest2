package ru.ozon.app.android.composer.di;

import Sc.InterfaceC3999a;
import j20.InterfaceC7243a;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\"\b\u0002\u0010\u000b\u001a\u001c\u0012\u0016\b\u0001\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0007\u0010\u0010J+\u0010\u000b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\n0\t0\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000b\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R1\u0010\u000b\u001a\u001c\u0012\u0016\b\u0001\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/composer/di/Widget;", "Ln20/i;", "", "vertical", "component", "Lj20/a;", "", "config", "", "Lm20/a;", "Ll20/c;", "viewMappers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj20/a;[Lm20/a;)V", "Lk20/g;", "storage", "(Lk20/g;)Lj20/a;", "(Lk20/g;)[Lm20/a;", "Lk20/c;", "widgetComponent", "(Lk20/g;)[Lk20/c;", "Lj20/a;", "getConfig", "()Lj20/a;", "[Lm20/a;", "getViewMappers", "()[Lm20/a;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Widget extends i {

    @NotNull
    private final InterfaceC7243a<? extends Object> config;
    private final InterfaceC8046a<? extends Object, ? extends c>[] viewMappers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Widget(@NotNull String vertical, @NotNull String component, @NotNull InterfaceC7243a<? extends Object> config, InterfaceC8046a<? extends Object, ? extends c>[] interfaceC8046aArr) {
        super(vertical, component, config.getSupportedVersions());
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.viewMappers = interfaceC8046aArr;
    }

    @Override // n20.i
    @NotNull
    public InterfaceC7243a<? extends Object> config(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return this.config;
    }

    @Override // n20.i
    @NotNull
    public InterfaceC8046a<?, ? extends c>[] viewMappers(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        InterfaceC8046a<? extends Object, ? extends c>[] interfaceC8046aArr = this.viewMappers;
        return interfaceC8046aArr == null ? new InterfaceC8046a[0] : interfaceC8046aArr;
    }

    @Override // n20.i
    @NotNull
    public C7471c[] widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7471c[]{C7471c.f70357c};
    }
}
