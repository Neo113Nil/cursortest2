package ru.ozon.fintech.features.camera.scanners.mlkit.utils.bankcard;

import com.vk.id.onetap.compose.onetap.OneTapAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95031a;

    public /* synthetic */ a(int i11) {
        this.f95031a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence buildCandidate$lambda$3;
        Unit authError$lambda$18;
        switch (this.f95031a) {
            case 0:
                buildCandidate$lambda$3 = BankCardNumberDetector.buildCandidate$lambda$3((DetectedLine) obj);
                return buildCandidate$lambda$3;
            default:
                authError$lambda$18 = OneTapAnalytics.authError$lambda$18((Throwable) obj);
                return authError$lambda$18;
        }
    }
}
