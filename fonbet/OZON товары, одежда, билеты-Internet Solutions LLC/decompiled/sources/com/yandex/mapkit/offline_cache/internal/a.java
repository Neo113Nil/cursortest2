package com.yandex.mapkit.offline_cache.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.MorkovskTabbarVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter.IndicatorAnimationController;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60728c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f60726a = i11;
        this.f60727b = obj;
        this.f60728c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f60726a) {
            case 0:
                ((BackgroundDownloadJob) this.f60727b).lambda$doWork$0((BackgroundDownloadInitializer) this.f60728c);
                break;
            case 1:
                IndicatorAnimationController.bindAnimatedIndicator$lambda$1((MorkovskTabbarVO.MorkovskTabItemVO) this.f60727b, (IndicatorAnimationController) this.f60728c);
                break;
            default:
                ((Surface) this.f60727b).release();
                ((SurfaceTexture) this.f60728c).release();
                break;
        }
    }
}
