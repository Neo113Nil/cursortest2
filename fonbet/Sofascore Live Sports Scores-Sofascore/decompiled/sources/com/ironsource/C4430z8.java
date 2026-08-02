package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.z8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4430z8 extends FrameLayout {

    @NotNull
    private final String a;

    @Nullable
    private a b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.z8$a */
    public interface a {
        void a(@NotNull Dg dg);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4430z8(@NotNull Context context) {
        super(context);
        context.getClass();
        this.a = "ISNNativeAdContainer";
    }

    private final Dg a() {
        return new Dg(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    @Nullable
    public final a getListener$mediationsdk_release() {
        return this.b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View view, int i) {
        view.getClass();
        Logger.i(this.a, "onVisibilityChanged: " + i);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.i(this.a, "onWindowVisibilityChanged: " + i);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(@Nullable a aVar) {
        this.b = aVar;
    }
}
