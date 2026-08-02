package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view;

import Sc.r;
import Wc.a;
import Wc.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.request.PikazonRequestBuilder;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner;
import xe.C10727i;
import xe.C10737n;
import xe.InterfaceC10733l;
import xe.M;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001%B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\nH\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/LoadImages;", "", "Lxe/M;", "scope", "Landroidx/appcompat/widget/AppCompatImageView;", "underImageView", "animationImageView", "overImageView", "<init>", "(Lxe/M;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;)V", "Landroid/content/Context;", "", "imageUrl", "", "isStatic", "Landroid/graphics/drawable/Drawable;", "suspendLoadImage", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "T", "Lxe/l;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "safeResume", "(Lxe/l;Ljava/lang/Object;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "context", "", "getResourceIdByName", "(Ljava/lang/String;Landroid/content/Context;)I", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Images;", "images", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rootView", "load", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner$Images;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Lxe/M;", "Landroidx/appcompat/widget/AppCompatImageView;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoadImages {

    @NotNull
    private final AppCompatImageView animationImageView;

    @NotNull
    private final AppCompatImageView overImageView;
    private final M scope;

    @NotNull
    private final AppCompatImageView underImageView;
    public static final int $stable = 8;

    public LoadImages(M m11, @NotNull AppCompatImageView underImageView, @NotNull AppCompatImageView animationImageView, @NotNull AppCompatImageView overImageView) {
        Intrinsics.checkNotNullParameter(underImageView, "underImageView");
        Intrinsics.checkNotNullParameter(animationImageView, "animationImageView");
        Intrinsics.checkNotNullParameter(overImageView, "overImageView");
        this.scope = m11;
        this.underImageView = underImageView;
        this.animationImageView = animationImageView;
        this.overImageView = overImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"DiscouragedApi"})
    public final int getResourceIdByName(String name, Context context) {
        return context.getResources().getIdentifier(name, "drawable", context.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void safeResume(InterfaceC10733l<? super T> interfaceC10733l, T t2) {
        if (interfaceC10733l.isActive()) {
            r.Companion companion = r.INSTANCE;
            interfaceC10733l.resumeWith(t2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Integer] */
    public final Object suspendLoadImage(Context context, String str, boolean z11, d<? super Drawable> frame) {
        final C10737n c10737n = new C10737n(1, b.b(frame));
        c10737n.o();
        if (!z11) {
            str = new Integer(getResourceIdByName(str, context));
        }
        new PikazonRequestBuilder(context, Drawable.class).source(str).target(context).addTransformation(ImageTransformation.CenterCrop.INSTANCE).callback(new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view.LoadImages$suspendLoadImage$2$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                LoadImages.this.safeResume(c10737n, null);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                LoadImages.this.safeResume(c10737n, resource);
            }
        }).build().load();
        Object n11 = c10737n.n();
        if (n11 == a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public final void load(@NotNull Banner.Images images, @NotNull ConstraintLayout rootView) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.underImageView.setVisibility(4);
        this.animationImageView.setVisibility(4);
        this.overImageView.setVisibility(4);
        M m11 = this.scope;
        if (m11 != null) {
            C10727i.c(m11, null, null, new LoadImages$load$1(images, this, rootView, null), 3);
        }
    }
}
