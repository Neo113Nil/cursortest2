package ru.ozon.app.android.courieronmap.presentation.provider;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.core.content.a;
import androidx.core.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ)\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/provider/BitmapProcessor;", "Lxe/M;", "<init>", "()V", "Landroid/view/View;", "originalView", "Landroid/graphics/Bitmap;", "createBitmapWithShadow", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "view", "createBitmapFromView", "Lkotlin/Function1;", "", "onResult", "shadeBitmap", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "cancelProcessing", "Lxe/B0;", "job", "Lxe/B0;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Companion", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BitmapProcessor implements M {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int PIN_SHADOW_COLOR = UniColors.BG_DARK_KEY.getResId();
    private static final float PIN_SHADOW_RADIUS = ResourceExtKt.toPxF(8);
    private final /* synthetic */ M $$delegate_0 = N.a(C10720e0.a().plus(X0.b()));
    private B0 job;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/provider/BitmapProcessor$Companion;", "", "<init>", "()V", "", "SHADOW_COLOR_ALPHA", "F", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final Bitmap createBitmapFromView(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap createBitmapWithShadow(View originalView) {
        Bitmap createBitmapFromView = createBitmapFromView(originalView);
        Bitmap addShadow = ShadowUtilsKt.addShadow(createBitmapFromView, PIN_SHADOW_RADIUS, c.b(0.75f, a.getColor(originalView.getContext(), PIN_SHADOW_COLOR), 0));
        createBitmapFromView.recycle();
        return addShadow;
    }

    public final void cancelProcessing() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
    }

    @Override // xe.M
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final void shadeBitmap(@NotNull View view, @NotNull Function1<? super Bitmap, Unit> onResult) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.job = C10727i.c(this, null, null, new BitmapProcessor$shadeBitmap$1(this, view, onResult, null), 3);
    }
}
