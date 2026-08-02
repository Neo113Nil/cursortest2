package jd0;

import Sc.InterfaceC4008j;
import Vb0.b;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import jd0.C7352e;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import ob0.C8685A;
import org.jetbrains.annotations.NotNull;

/* renamed from: jd0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7349b extends AbstractC7348a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8685A> f69734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7349b(@NotNull InterfaceC4008j<C8685A> antibotRouter, @NotNull String link, @NotNull InterfaceC4008j<yc0.c> headersProvider) {
        super(headersProvider.getValue());
        Intrinsics.checkNotNullParameter(antibotRouter, "antibotRouter");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        this.f69734d = antibotRouter;
        g0(link);
    }

    private static void p0(Vb0.c cVar, C7352e.a aVar) {
        b.a aVar2 = Vb0.b.f28514a;
        String a11 = cVar.a();
        Map j11 = U.j(new Pair("data", aVar.b()), new Pair(ImagesContract.URL, aVar.c()), new Pair("error_code", aVar.a()), new Pair("trace_id", aVar.d()), new Pair("webview_type", Vb0.d.ANTIBOT));
        aVar2.getClass();
        b.a.a(a11, j11);
    }

    @Override // jd0.AbstractC7348a
    public final void h0(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (Intrinsics.d(Uri.parse(url).toString(), "ozon://back")) {
            this.f69734d.getValue().k();
        } else {
            g0(url);
        }
    }

    @Override // jd0.AbstractC7348a
    public final void j0(@NotNull C7352e.a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        p0(Vb0.c.NETWORK_ERROR, error);
    }

    @Override // jd0.AbstractC7348a
    public final void m0(@NotNull C7352e.a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        p0(Vb0.c.RENDER_ERROR, error);
    }
}
