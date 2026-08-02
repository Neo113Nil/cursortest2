package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation;

import A00.a;
import L00.i;
import QZ.g;
import android.content.Context;
import androidx.core.app.n;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsStateConfigurator;", "LQZ/g;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Li10/h;", "state", "onInit", "(Li10/h;)Li10/h;", "LA00/a;", "trigger", "interceptState", "(Li10/h;LA00/a;)Li10/h;", "Landroidx/core/app/n;", "notificationManager", "Landroidx/core/app/n;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationsSettingsStateConfigurator implements g {

    @NotNull
    private final n notificationManager;
    public static final int $stable = 8;

    public NotificationsSettingsStateConfigurator(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        n e11 = n.e(context);
        Intrinsics.checkNotNullExpressionValue(e11, "from(...)");
        this.notificationManager = e11;
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h hVar, @NotNull L00.g gVar, @NotNull i iVar) {
        g.a.a(hVar, gVar, iVar);
        return gVar;
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h state, @NotNull a trigger) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        state.f().put("isPushEnabled", Boolean.valueOf(this.notificationManager.a()));
        return state;
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return h.a(state, null, i10.g.POST, null, null, null, 61);
    }
}
