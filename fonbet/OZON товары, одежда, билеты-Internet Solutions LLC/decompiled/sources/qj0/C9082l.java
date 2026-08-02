package qj0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qj0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9082l extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f82264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9082l(Context context) {
        super(0);
        this.f82264b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ComponentName component;
        Context context = this.f82264b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null && (component = launchIntentForPackage.getComponent()) != null) {
            Intent makeRestartActivityTask = Intent.makeRestartActivityTask(component);
            makeRestartActivityTask.setPackage(context.getPackageName());
            context.startActivity(makeRestartActivityTask);
            Runtime.getRuntime().exit(0);
        }
        return Unit.f71690a;
    }
}
