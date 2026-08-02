package ru.ozon.network.internal.debugMenu;

import Ef0.b;
import Ef0.c;
import android.os.Bundle;
import androidx.activity.t;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.app.g;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.Y;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/network/internal/debugMenu/ONDebugMenuActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "ozon-network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ONDebugMenuActivity extends g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f97613h = 0;

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        t.a(this);
        super.onCreate(bundle);
        AbstractC5051a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s("Ozon Network SDK");
        }
        ComposeView composeView = new ComposeView(this, null, 6, 0);
        Y.J(composeView, new c());
        composeView.a(b.f7972d);
        setContentView(composeView);
    }
}
