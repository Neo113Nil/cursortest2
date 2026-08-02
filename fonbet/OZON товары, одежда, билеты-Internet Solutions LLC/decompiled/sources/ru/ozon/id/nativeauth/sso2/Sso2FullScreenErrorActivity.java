package ru.ozon.id.nativeauth.sso2;

import Kb0.K;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.main.ErrorView;
import ru.ozon.id.nativeauth.main.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/id/nativeauth/sso2/Sso2FullScreenErrorActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Sso2FullScreenErrorActivity extends androidx.appcompat.app.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f97364i = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f97365h;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Sso2FullScreenErrorActivity sso2FullScreenErrorActivity = Sso2FullScreenErrorActivity.this;
            sso2FullScreenErrorActivity.f97365h = true;
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            k11.X().g().getValue().f();
            sso2FullScreenErrorActivity.finish();
            return Unit.f71690a;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Sso2FullScreenErrorActivity sso2FullScreenErrorActivity = Sso2FullScreenErrorActivity.this;
            sso2FullScreenErrorActivity.f97365h = true;
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            k11.X().g().getValue().i();
            sso2FullScreenErrorActivity.finish();
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ErrorView errorView = new ErrorView(this, null, 6, 0);
        errorView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        errorView.setId(View.generateViewId());
        errorView.setFitsSystemWindows(true);
        errorView.i(new a());
        errorView.g(new b());
        errorView.j(new b.c.C2137b(errorView.getContext().getString(R.string.ozonid_auth_error), getString(R.string.ozonid_error_failed_to_complete_operation_try_again_later), getString(R.string.ozonid_error_refresh), null, getIntent().getStringExtra("traceId"), 48));
        setContentView(errorView);
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        if (this.f97365h) {
            return;
        }
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        k11.X().g().getValue().f();
    }
}
