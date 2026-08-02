package com.moloco.sdk.publisher;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ddi;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.un0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/moloco/sdk/publisher/Banner;", "Landroid/widget/FrameLayout;", "Lcom/moloco/sdk/publisher/AdLoad;", "Lcom/moloco/sdk/publisher/Destroyable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "changedView", "", "visibility", "", "onVisibilityChanged", "(Landroid/view/View;I)V", "Lcom/moloco/sdk/publisher/BannerAdShowListener;", "adShowListener", "Lcom/moloco/sdk/publisher/BannerAdShowListener;", "getAdShowListener", "()Lcom/moloco/sdk/publisher/BannerAdShowListener;", "setAdShowListener", "(Lcom/moloco/sdk/publisher/BannerAdShowListener;)V", "Lf1d;", "", "_isViewShown", "Lf1d;", "Lddi;", "isViewShown", "Lddi;", "()Lddi;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Banner extends FrameLayout implements AdLoad, Destroyable {
    public static final int $stable = 8;

    @NotNull
    private final f1d _isViewShown;

    @Nullable
    private BannerAdShowListener adShowListener;

    @NotNull
    private final ddi isViewShown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(@NotNull Context context) {
        super(context);
        context.getClass();
        setTag("MolocoBannerView");
        fdi a = gdi.a(Boolean.FALSE);
        this._isViewShown = a;
        this.isViewShown = un0.u(a);
    }

    @Nullable
    public BannerAdShowListener getAdShowListener() {
        return this.adShowListener;
    }

    @NotNull
    /* renamed from: isViewShown, reason: from getter */
    public ddi getIsViewShown() {
        return this.isViewShown;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        changedView.getClass();
        f1d f1dVar = this._isViewShown;
        Boolean valueOf = Boolean.valueOf(changedView.isShown());
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, valueOf);
    }

    public void setAdShowListener(@Nullable BannerAdShowListener bannerAdShowListener) {
        this.adShowListener = bannerAdShowListener;
    }
}
