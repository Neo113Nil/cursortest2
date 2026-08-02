package ru.ozon.id.antibot.callback.presentation;

import Kb0.K;
import Tb0.a;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.app.g;
import kotlin.Metadata;
import qb0.InterfaceC9018a;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/id/antibot/callback/presentation/FullScreenAntibotActivity;", "Landroidx/appcompat/app/g;", "Lqb0/a;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FullScreenAntibotActivity extends g implements InterfaceC9018a {

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f97151h;

    public FullScreenAntibotActivity() {
        super(R.layout.activity_antibot_full_screen);
    }

    public final void close() {
        this.f97151h = true;
        finish();
    }

    @Override // qb0.InterfaceC9018a
    public final ViewGroup getView() {
        return (ViewGroup) findViewById(R.id.container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected final void onDestroy() {
        if (!isChangingConfigurations() && !this.f97151h) {
            K k11 = a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            k11.l().n().getValue().d();
        }
        super.onDestroy();
    }
}
