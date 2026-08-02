package com.socure.idplus.device.internal.input.manager.compose;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.socure.idplus.device.internal.behavior.model.InputChangeAction;
import com.socure.idplus.device.internal.behavior.model.InputChangeEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class d extends com.socure.idplus.device.internal.input.manager.b {
    public final com.socure.idplus.device.internal.input.c c;
    public final com.socure.idplus.device.internal.input.d d;
    public String e;
    public final Rect f;
    public String g;
    public String h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, com.socure.idplus.device.internal.input.c focusChangeProducer, com.socure.idplus.device.internal.input.d inputChangeProducer, com.socure.idplus.device.internal.input.manager.monitor.a actionModeMonitor) {
        super(context, actionModeMonitor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(focusChangeProducer, "focusChangeProducer");
        Intrinsics.checkNotNullParameter(inputChangeProducer, "inputChangeProducer");
        Intrinsics.checkNotNullParameter(actionModeMonitor, "actionModeMonitor");
        this.c = focusChangeProducer;
        this.d = inputChangeProducer;
        this.f = new Rect();
        this.g = "";
    }

    public final void a(String inputText, String targetId, InputChangeAction inputChangeAction) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(inputChangeAction, "inputChangeAction");
        this.h = inputText;
        com.socure.idplus.device.internal.input.d dVar = this.d;
        InputChangeEvent inputChangeEvent = new InputChangeEvent(SystemClock.uptimeMillis(), Intrinsics.areEqual(this.e, targetId), inputChangeAction);
        dVar.getClass();
        Intrinsics.checkNotNullParameter(inputChangeEvent, "inputChangeEvent");
        dVar.a(inputChangeEvent);
    }

    @Override // com.socure.idplus.device.internal.input.manager.b
    public final void b() {
        this.e = null;
        this.f.set(0, 0, 0, 0);
        this.g = "";
        this.h = null;
        this.i = false;
    }

    public final String a(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return this.g + "_" + rect.left + "_" + rect.top + "_" + rect.bottom + "_" + rect.right;
    }

    @Override // com.socure.idplus.device.internal.input.manager.b
    public final void b(ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.i = false;
        Intrinsics.checkNotNullParameter("SocureComposeViewManager", "tag");
        Intrinsics.checkNotNullParameter("onWindowRemoved", "msg");
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.f870a;
    }

    @Override // com.socure.idplus.device.internal.input.manager.b
    public final void a(View view, boolean z) {
        if (this.i || !(view instanceof ComposeView)) {
            return;
        }
        a(view);
    }

    @Override // com.socure.idplus.device.internal.input.manager.b
    public final void a(ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        a((View) contentView);
    }

    public final void a(View view) {
        Context context;
        String str;
        this.i = true;
        if (view != null) {
            try {
                context = view.getContext();
            } catch (Exception unused) {
            }
        } else {
            context = null;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                str = context.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(str, "getSimpleName(...)");
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        str = "unknown";
        this.g = str;
        AndroidComposeView_androidKt.setPlatformTextInputServiceInterceptor(new c(this));
    }
}
