package y10;

import Am.C2438a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.r;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import i10.l;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l10.s;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import v10.C10183a;
import v10.j;
import z10.C10974b;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l10.i f105924a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.g f105925b;

    /* renamed from: c, reason: collision with root package name */
    private final SwipeRefreshLayout f105926c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10974b f105927d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f105928e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f105929f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ViewGroup f105930g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final T10.c f105931h;

    /* renamed from: i, reason: collision with root package name */
    private s f105932i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f105933j;

    /* renamed from: k, reason: collision with root package name */
    private long f105934k;

    public i(@NotNull l10.i container, @NotNull androidx.recyclerview.widget.g recyclerView, SwipeRefreshLayout swipeRefreshLayout, @NotNull C10974b fullComposerSnapshotDelegate) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(fullComposerSnapshotDelegate, "fullComposerSnapshotDelegate");
        this.f105924a = container;
        this.f105925b = recyclerView;
        this.f105926c = swipeRefreshLayout;
        this.f105927d = fullComposerSnapshotDelegate;
        this.f105928e = k.b(new c(this));
        ImageView imageView = (ImageView) container.Y().findViewById(R.id.snapshot);
        if (imageView != null) {
            imageView.setBackground(container.Y().getBackground());
            imageView.setOnClickListener(new ViewOnClickListenerC10823a());
        } else {
            imageView = null;
        }
        this.f105929f = imageView;
        ViewGroup h11 = C10183a.h(container.Y());
        if (h11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.f105930g = h11;
        this.f105931h = new T10.c(h11);
        this.f105933j = k.b(new C10824b(this));
    }

    public static final float a(i iVar) {
        Iterator it = ((List) iVar.f105933j.getValue()).iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            f7 += ((View) it.next()).getY();
        }
        if (f7 < 0.0f) {
            return 0.0f;
        }
        return f7;
    }

    public static final String d(i iVar) {
        return (String) iVar.f105928e.getValue();
    }

    public final void g() {
        if (this.f105924a.N()) {
            this.f105927d.d();
            return;
        }
        this.f105934k++;
        ImageView imageView = this.f105929f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void h(@NotNull s config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f105932i = config;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(@NotNull l loader) {
        int i11;
        int color;
        Intrinsics.checkNotNullParameter(loader, "loader");
        ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
        if (H00.b.c()) {
            H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", "loader=" + loader), "ComposerLoaderController", null, Boolean.TRUE);
        }
        l.a b11 = loader.b();
        Integer a11 = b11.a();
        l10.i iVar = this.f105924a;
        if (a11 == null) {
            s sVar = this.f105932i;
            a11 = sVar != null ? sVar.a() : null;
            if (a11 == null) {
                r i12 = iVar.Q().i();
                if (b11 instanceof l.a.C1079a) {
                    i11 = R$color.oz_semantic_bg_secondary;
                } else {
                    if (!(b11 instanceof l.a.b)) {
                        throw new o();
                    }
                    i11 = ThemeExtKt.isDarkThemeActive(i12) ? R$color.oz_dimming : R$color.oz_white_overlay_2;
                }
                color = androidx.core.content.a.getColor(i12, i11);
                long b12 = b11.b();
                T10.c cVar2 = this.f105931h;
                cVar2.d(b12);
                this.f105930g.setBackgroundColor(color);
                if (loader.c()) {
                    if (!loader.d()) {
                        g();
                    }
                    cVar2.c();
                    return;
                }
                if (loader.d()) {
                    if (iVar.N()) {
                        this.f105927d.e();
                    } else {
                        ImageView imageView = this.f105929f;
                        if (imageView != null && imageView.getVisibility() != 0) {
                            int width = iVar.e0().getWidth();
                            int height = iVar.e0().getHeight();
                            if (width > 0 && height > 0) {
                                long j11 = 1 + this.f105934k;
                                this.f105934k = j11;
                                if (H00.b.c()) {
                                    ru.ozon.android.ozonLogger.core.h b13 = H00.b.b();
                                    Thread currentThread = Thread.currentThread();
                                    StringBuilder a12 = C2438a.a("snapshot[width=", width, ", height=", "], generation=", height);
                                    a12.append(j11);
                                    b13.e(cVar, Pk0.g.c(currentThread, ": ", a12.toString()), "ComposerLoaderController", null, Boolean.TRUE);
                                }
                                if (iVar.g0()) {
                                    Kg0.e.d(iVar.e0(), new e(this, j11, width, height), f.f105920b);
                                } else {
                                    j.a(iVar.e0(), iVar.K(), new h(this, j11));
                                }
                                cVar2.e();
                                return;
                            }
                        }
                    }
                }
                cVar2.e();
                return;
            }
        }
        color = a11.intValue();
        long b122 = b11.b();
        T10.c cVar22 = this.f105931h;
        cVar22.d(b122);
        this.f105930g.setBackgroundColor(color);
        if (loader.c()) {
        }
    }

    public final void j(boolean z11) {
        SwipeRefreshLayout swipeRefreshLayout = this.f105926c;
        if (z11) {
            if ((swipeRefreshLayout == null || swipeRefreshLayout.isEnabled()) && swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
                return;
            }
            return;
        }
        if ((swipeRefreshLayout == null || swipeRefreshLayout.isEnabled()) && swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }
}
