package ru.ozon.app.android.pikazon.glide.targets;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l6.InterfaceC7882e;
import m6.g;
import m6.h;
import n6.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.request.PikazonRequestListener;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\u000f\b\u0001\u0010\u0010\u001a\t\u0018\u00010\n¢\u0006\u0002\b\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u000f\b\u0001\u0010\u0010\u001a\t\u0018\u00010\n¢\u0006\u0002\b\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u000eJE\u0010\u0016\u001a\u00020\f2\u000f\b\u0001\u0010\u0010\u001a\t\b\u00028\u0000¢\u0006\u0002\b\u000f2\u001f\b\u0001\u0010\u0015\u001a\u0019\u0012\u000e\b\u0000\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u0013¢\u0006\u0002\b\u000fH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\f2\r\b\u0001\u0010\u0010\u001a\u00070\u0018¢\u0006\u0002\b\u000fH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\f2\r\b\u0001\u0010\u0010\u001a\u00070\u0018¢\u0006\u0002\b\u000fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001aJ!\u0010\u001d\u001a\u00020\f2\u000f\b\u0001\u0010\u0010\u001a\t\u0018\u00010\u001c¢\u0006\u0002\b\u000fH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\t\u0018\u00010\u001c¢\u0006\u0002\b\u000fH\u0097\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b$\u0010\"R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+\u0082\u0002\u0004\n\u0002\b9¨\u0006,"}, d2 = {"Lru/ozon/app/android/pikazon/glide/targets/OzonMetricTarget;", "T", "Lm6/h;", "glideTarget", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "loadPriority", "", "source", "<init>", "(Lm6/h;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;Ljava/lang/Object;)V", "Landroid/graphics/drawable/Drawable;", HammersV3BodyDTO.PLACEHOLDER, "", "onLoadCleared", "(Landroid/graphics/drawable/Drawable;)V", "Lkotlin/jvm/internal/EnhancedNullability;", "p0", "onLoadStarted", "onLoadFailed", "Ln6/c;", "kotlin.jvm.PlatformType", "p1", "onResourceReady", "(Ljava/lang/Object;Ln6/c;)V", "Lm6/g;", "getSize", "(Lm6/g;)V", "removeCallback", "Ll6/e;", "setRequest", "(Ll6/e;)V", "getRequest", "()Ll6/e;", "onStart", "()V", "onStop", "onDestroy", "Lm6/h;", "getGlideTarget", "()Lm6/h;", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "getLoadPriority", "()Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "Ljava/lang/Object;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonMetricTarget<T> implements h<T> {

    @NotNull
    private final h<T> glideTarget;

    @NotNull
    private final LoadPriority loadPriority;
    private final Object source;

    public OzonMetricTarget(@NotNull h<T> glideTarget, @NotNull LoadPriority loadPriority, Object obj) {
        Intrinsics.checkNotNullParameter(glideTarget, "glideTarget");
        Intrinsics.checkNotNullParameter(loadPriority, "loadPriority");
        this.glideTarget = glideTarget;
        this.loadPriority = loadPriority;
        this.source = obj;
    }

    @NotNull
    public final h<T> getGlideTarget() {
        return this.glideTarget;
    }

    @NotNull
    public final LoadPriority getLoadPriority() {
        return this.loadPriority;
    }

    @Override // m6.h
    public InterfaceC7882e getRequest() {
        return this.glideTarget.getRequest();
    }

    @Override // m6.h
    public void getSize(@NonNull @NotNull g p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        this.glideTarget.getSize(p02);
    }

    @Override // i6.m
    public void onDestroy() {
        this.glideTarget.onDestroy();
    }

    @Override // m6.h
    public void onLoadCleared(Drawable placeholder) {
        this.glideTarget.onLoadCleared(placeholder);
        Pikazon companion = Pikazon.INSTANCE.getInstance();
        if (companion.getConfig().getPerformanceAvailabilityChecker().isLoadCancellingAnalyticsEnabled()) {
            Iterator<T> it = companion.getRequestListeners$lib_release().iterator();
            while (it.hasNext()) {
                PikazonRequestListener pikazonRequestListener = (PikazonRequestListener) it.next();
                Object obj = this.source;
                h<T> hVar = this.glideTarget;
                if (hVar == null) {
                    hVar = null;
                }
                pikazonRequestListener.onLoadCancelled(obj, hVar);
            }
        }
    }

    @Override // m6.h
    public void onLoadFailed(Drawable p02) {
        this.glideTarget.onLoadFailed(p02);
    }

    @Override // m6.h
    public void onLoadStarted(Drawable p02) {
        this.glideTarget.onLoadStarted(p02);
    }

    @Override // m6.h
    public void onResourceReady(@NonNull @NotNull T p02, c<? super T> p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        this.glideTarget.onResourceReady(p02, p12);
    }

    @Override // i6.m
    public void onStart() {
        this.glideTarget.onStart();
    }

    @Override // i6.m
    public void onStop() {
        this.glideTarget.onStop();
    }

    @Override // m6.h
    public void removeCallback(@NonNull @NotNull g p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        this.glideTarget.removeCallback(p02);
    }

    @Override // m6.h
    public void setRequest(InterfaceC7882e p02) {
        this.glideTarget.setRequest(p02);
    }
}
