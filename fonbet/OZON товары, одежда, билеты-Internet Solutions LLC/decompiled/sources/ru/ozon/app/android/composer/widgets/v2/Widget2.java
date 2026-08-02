package ru.ozon.app.android.composer.widgets.v2;

import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012,\u0010\u000e\u001a(\u0012$\u0012\"\u0012\n\b\u0001\u0012\u00060\nj\u0002`\u000b\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\n\b\u0001\u0012\u00060\fj\u0002`\r0\t0\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0007\u0010\u0013J+\u0010\u000e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\f0\u00140\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000e\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR@\u0010\u000e\u001a(\u0012$\u0012\"\u0012\n\b\u0001\u0012\u00060\nj\u0002`\u000b\u0012\u0006\b\u0001\u0012\u00020\u0006\u0012\n\b\u0001\u0012\u00060\fj\u0002`\r0\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/Widget2;", "Ln20/i;", "", "vertical", "component", "Lj20/a;", "", "config", "", "Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "viewMappers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj20/a;[Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;)V", "Lk20/g;", "storage", "(Lk20/g;)Lj20/a;", "Lm20/a;", "(Lk20/g;)[Lm20/a;", "Lk20/c;", "widgetComponent", "(Lk20/g;)[Lk20/c;", "Lj20/a;", "getConfig$composer_prodGoogleAllVendorsRelease", "()Lj20/a;", "[Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "getViewMappers$composer_prodGoogleAllVendorsRelease", "()[Lru/ozon/app/android/composer/widgets/v2/ViewMapper2;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Widget2 extends i {

    @NotNull
    private final InterfaceC7243a<? extends Object> config;

    @NotNull
    private final ViewMapper2<? extends InterfaceC6958a, ? extends Object, ? extends c>[] viewMappers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Widget2(@NotNull String vertical, @NotNull String component, @NotNull InterfaceC7243a<? extends Object> config, @NotNull ViewMapper2<? extends InterfaceC6958a, ? extends Object, ? extends c>[] viewMappers) {
        super(vertical, component, config.getSupportedVersions());
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMappers, "viewMappers");
        this.config = config;
        this.viewMappers = viewMappers;
    }

    @Override // n20.i
    @NotNull
    public InterfaceC7243a<? extends Object> config(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return this.config;
    }

    @NotNull
    public final ViewMapper2<? extends InterfaceC6958a, ? extends Object, ? extends c>[] getViewMappers$composer_prodGoogleAllVendorsRelease() {
        return this.viewMappers;
    }

    @Override // n20.i
    @NotNull
    public InterfaceC8046a<?, ? extends c>[] viewMappers(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return this.viewMappers;
    }

    @Override // n20.i
    @NotNull
    public C7471c[] widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7471c[]{C7471c.f70357c};
    }
}
