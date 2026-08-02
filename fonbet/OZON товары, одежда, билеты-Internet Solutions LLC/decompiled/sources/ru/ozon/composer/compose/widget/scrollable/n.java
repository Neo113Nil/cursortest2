package ru.ozon.composer.compose.widget.scrollable;

import android.graphics.Rect;
import ed.InterfaceC6346b;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001b"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/n;", "", "Ljk0/q;", "info", "b", "(Ljk0/q;)Ljk0/q;", "", "i", "(Ljk0/q;)Ljava/lang/String;", "", "g", "(Ljk0/q;)I", "other", "", "c", "(Ljk0/q;Ljava/lang/Object;)Z", "h", "(Ljk0/q;)Z", "isVisible", "Landroid/graphics/Rect;", "f", "(Ljk0/q;)Landroid/graphics/Rect;", "widgetVisibleRect", "Ljk0/l;", "e", "(Ljk0/q;)Ljk0/l;", "overlapContainersPositionInfo", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q f94779a;

    private /* synthetic */ n(q qVar) {
        this.f94779a = qVar;
    }

    public static final /* synthetic */ n a(q qVar) {
        return new n(qVar);
    }

    @NotNull
    public static q b(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return info;
    }

    public static boolean c(q qVar, Object obj) {
        return (obj instanceof n) && Intrinsics.d(qVar, ((n) obj).getF94779a());
    }

    public static final boolean d(q qVar, q qVar2) {
        return Intrinsics.d(qVar, qVar2);
    }

    @NotNull
    public static final jk0.l e(q qVar) {
        return qVar.a();
    }

    @NotNull
    public static final Rect f(q qVar) {
        return qVar.b();
    }

    public static int g(q qVar) {
        return qVar.hashCode();
    }

    public static final boolean h(q qVar) {
        return qVar.c();
    }

    public static String i(q qVar) {
        return "WidgetPositionInfo(info=" + qVar + ")";
    }

    public boolean equals(Object obj) {
        return c(this.f94779a, obj);
    }

    public int hashCode() {
        return g(this.f94779a);
    }

    /* renamed from: j, reason: from getter */
    public final /* synthetic */ q getF94779a() {
        return this.f94779a;
    }

    public String toString() {
        return i(this.f94779a);
    }
}
