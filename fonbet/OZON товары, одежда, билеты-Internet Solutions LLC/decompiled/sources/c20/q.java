package c20;

import android.view.View;
import c20.m;
import d20.AbstractC6065b;
import e20.C6283a;
import n10.InterfaceC8418b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class q implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m.b.d f56434a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC6065b f56435b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.ui.widget.l f56436c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f56437d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f56438e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f56439f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f56440g;

    public q(m.b.d dVar, AbstractC6065b abstractC6065b, ru.ozon.composer.ui.widget.l lVar, long j11, long j12, long j13, long j14) {
        this.f56434a = dVar;
        this.f56435b = abstractC6065b;
        this.f56436c = lVar;
        this.f56437d = j11;
        this.f56438e = j12;
        this.f56439f = j13;
        this.f56440g = j14;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@NotNull View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        view.removeOnLayoutChangeListener(this);
        InterfaceC8418b interfaceC8418b = this.f56434a.c().f56406c;
        if (interfaceC8418b != null) {
            interfaceC8418b.onOverlayMetricsReady(this.f56435b, this.f56436c, new C6283a(this.f56438e - this.f56437d, this.f56439f, System.nanoTime() - this.f56440g));
        }
    }
}
