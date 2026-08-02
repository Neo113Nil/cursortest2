package ru.ozon.fintech.features.camera.presentation.camera;

import W.A;
import com.vk.id.network.useragent.UserAgentProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f95028b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f95027a = i11;
        this.f95028b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        A qualitySelector_delegate$lambda$2;
        String userAgent_delegate$lambda$0;
        switch (this.f95027a) {
            case 0:
                qualitySelector_delegate$lambda$2 = CameraFragment.qualitySelector_delegate$lambda$2((CameraFragment) this.f95028b);
                return qualitySelector_delegate$lambda$2;
            default:
                userAgent_delegate$lambda$0 = UserAgentProvider.userAgent_delegate$lambda$0((UserAgentProvider) this.f95028b);
                return userAgent_delegate$lambda$0;
        }
    }
}
