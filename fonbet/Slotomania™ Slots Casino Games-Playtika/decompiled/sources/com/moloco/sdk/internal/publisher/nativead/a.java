package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.moloco.sdk.internal.A;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class a implements NativeAd.Assets {
    public static final C0249a k = new C0249a(null);
    public static final int l = 8;
    public static final String m = "NativeAdAssetsProvider";
    public final Context a;
    public final Q b;
    public final A c;
    public final y d;
    public final Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> e;
    public Function0<Unit> f;
    public com.moloco.sdk.internal.publisher.nativead.model.d g;
    public final Uri h;
    public ViewGroup i;
    public com.moloco.sdk.internal.publisher.nativead.ui.d j;

    /* renamed from: com.moloco.sdk.internal.publisher.nativead.a$a, reason: collision with other inner class name */
    public static final class C0249a {
        public /* synthetic */ C0249a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0249a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, Q viewVisibilityTracker, A viewLifecycleOwner, y watermark, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> vastAdPlaylistController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(vastAdPlaylistController, "vastAdPlaylistController");
        this.a = context;
        this.b = viewVisibilityTracker;
        this.c = viewLifecycleOwner;
        this.d = watermark;
        this.e = vastAdPlaylistController;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        this.h = dVar != null ? dVar.b(1) : null;
    }

    public static /* synthetic */ void e() {
    }

    public final void a(Function0<Unit> function0) {
        this.f = function0;
    }

    public final Function0<Unit> b() {
        return this.f;
    }

    public final com.moloco.sdk.internal.publisher.nativead.model.d c() {
        return this.g;
    }

    public final com.moloco.sdk.internal.publisher.nativead.ui.d d() {
        return this.j;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getCallToActionText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar != null) {
            return dVar.a(7);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getDescription() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar != null) {
            return dVar.a(5);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Uri getIconUri() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar != null) {
            return dVar.b(0);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Uri getMainImageUri() {
        return this.h;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public View getMediaView() {
        Uri b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a d;
        com.moloco.sdk.internal.publisher.nativead.ui.d dVar = this.j;
        if (dVar != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, m, "Using cached video view", null, false, 12, null);
            a((ViewGroup) dVar);
            return dVar;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar2 = this.g;
        if (dVar2 != null && (d = dVar2.d(2)) != null) {
            com.moloco.sdk.internal.publisher.nativead.ui.d a = a(d);
            this.j = a;
            return a;
        }
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, m, "Using cached image view", null, false, 12, null);
            a(viewGroup);
            return viewGroup;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar3 = this.g;
        if (dVar3 == null || (b = dVar3.b(1)) == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, m, "Missing video and image asset", new Exception(), false, 8, null);
            return null;
        }
        ViewGroup a2 = a(b);
        this.i = a2;
        return a2;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public Float getRating() {
        String a;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar == null || (a = dVar.a(6)) == null) {
            return null;
        }
        return StringsKt.toFloatOrNull(a);
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getSponsorText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar != null) {
            return dVar.a(4);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public String getTitle() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.g;
        if (dVar != null) {
            return dVar.c(3);
        }
        return null;
    }

    public final void a(com.moloco.sdk.internal.publisher.nativead.model.d dVar) {
        this.g = dVar;
    }

    public final void a(com.moloco.sdk.internal.publisher.nativead.ui.d dVar) {
        this.j = dVar;
    }

    public final com.moloco.sdk.internal.publisher.nativead.ui.d a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a invoke = this.e.invoke(aVar);
        invoke.d();
        return new com.moloco.sdk.internal.publisher.nativead.ui.d(this.a, invoke, this.b, this.c, this.d, this.f);
    }

    public final ViewGroup a(Uri uri) {
        return new com.moloco.sdk.internal.publisher.nativead.ui.c(this.a, uri, this.d, this.f, null, null, 48, null);
    }

    public final void a() {
        com.moloco.sdk.internal.publisher.nativead.ui.d dVar = this.j;
        if (dVar != null) {
            dVar.a();
        }
        this.j = null;
    }

    public final void a(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, m, "Detaching view " + viewGroup.getClass().getSimpleName() + " from parent " + viewGroup2.getClass().getSimpleName(), null, false, 12, null);
            viewGroup2.removeView(viewGroup);
        }
    }
}
