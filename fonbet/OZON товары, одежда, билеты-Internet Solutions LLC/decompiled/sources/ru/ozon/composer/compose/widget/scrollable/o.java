package ru.ozon.composer.compose.widget.scrollable;

import java.util.ArrayList;
import java.util.Iterator;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/o;", "", "<init>", "()V", "Ljk0/q;", "info", "", "b", "(Ljk0/q;)V", "Lru/ozon/composer/compose/widget/scrollable/l;", "callback", "a", "(Lru/ozon/composer/compose/widget/scrollable/l;)V", "c", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final int f94780b = 8;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f94781a = new ArrayList();

    public final void a(@NotNull l callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f94781a.add(callback);
    }

    public final void b(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Iterator it = this.f94781a.iterator();
        while (it.hasNext()) {
            ((l) it.next()).c(info);
        }
    }

    public final void c(@NotNull l callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f94781a.remove(callback);
    }
}
