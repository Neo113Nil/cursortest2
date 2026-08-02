package ru.ozon.fintech.ui.input;

import com.vk.id.multibranding.OAuthListWidgetAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97060a;

    public /* synthetic */ a(int i11) {
        this.f97060a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit infoActionClickListener$lambda$12;
        Unit oauthAdded$lambda$0;
        switch (this.f97060a) {
            case 0:
                infoActionClickListener$lambda$12 = InputView.infoActionClickListener$lambda$12((InfoAction) obj);
                return infoActionClickListener$lambda$12;
            default:
                oauthAdded$lambda$0 = OAuthListWidgetAnalytics.oauthAdded$lambda$0((Throwable) obj);
                return oauthAdded$lambda$0;
        }
    }
}
