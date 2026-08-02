package ru.ozon.composer.compose.widget.overlay;

import S0.InterfaceC3967k;
import d00.InterfaceC6021g;
import d00.h;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.i;

@InterfaceC6021g
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR6\u0010\t\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Ll20/c;", "I", "", "<init>", "()V", "Lkotlin/Function1;", "Lru/ozon/composer/compose/widget/i;", "", "content", "a", "(Lfd/n;)V", "", "zIndex", "f", "(F)V", "Lfd/n;", "b", "()Lfd/n;", "d", "F", "c", "()F", "e", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f<I extends l20.c> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f94699c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC6511n<? super i<I>, ? super InterfaceC3967k, ? super Integer, Unit> content;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float zIndex;

    @h
    public final void a(@NotNull InterfaceC6511n<? super i<I>, ? super InterfaceC3967k, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    public final InterfaceC6511n<i<I>, InterfaceC3967k, Integer, Unit> b() {
        return this.content;
    }

    /* renamed from: c, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final void d(InterfaceC6511n<? super i<I>, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n) {
        this.content = interfaceC6511n;
    }

    public final void e(float f7) {
        this.zIndex = f7;
    }

    public final void f(float zIndex) {
        this.zIndex = zIndex;
    }
}
