package ru.ozon.app.android.pikazon.preload;

import android.graphics.drawable.Drawable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l6.InterfaceC7882e;
import m6.g;
import m6.h;
import n6.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ)\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00022\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR*\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/pikazon/preload/PreloadTarget;", "Lm6/h;", "", "<init>", "()V", "", "onStart", "onStop", "onDestroy", "Landroid/graphics/drawable/Drawable;", HammersV3BodyDTO.PLACEHOLDER, "onLoadStarted", "(Landroid/graphics/drawable/Drawable;)V", "errorDrawable", "onLoadFailed", "resource", "Ln6/c;", "transition", "onResourceReady", "(Ljava/lang/Object;Ln6/c;)V", "onLoadCleared", "Lm6/g;", "cb", "getSize", "(Lm6/g;)V", "removeCallback", "Ll6/e;", "request", "setRequest", "(Ll6/e;)V", "getRequest", "()Ll6/e;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "imageHeight", "I", "getImageHeight", "()I", "setImageHeight", "(I)V", "imageWidth", "getImageWidth", "setImageWidth", "Ll6/e;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadTarget implements h<Object> {
    private int imageHeight;
    private int imageWidth;
    private InterfaceC7882e request;

    @Override // m6.h
    public InterfaceC7882e getRequest() {
        return this.request;
    }

    @Override // m6.h
    public void getSize(@NotNull g cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        cb2.c(this.imageWidth, this.imageHeight);
    }

    @Override // i6.m
    public void onDestroy() {
    }

    @Override // m6.h
    public void onLoadCleared(Drawable placeholder) {
    }

    @Override // m6.h
    public void onLoadFailed(Drawable errorDrawable) {
    }

    @Override // m6.h
    public void onLoadStarted(Drawable placeholder) {
    }

    @Override // m6.h
    public void onResourceReady(@NotNull Object resource, c<? super Object> transition) {
        Intrinsics.checkNotNullParameter(resource, "resource");
    }

    @Override // i6.m
    public void onStart() {
    }

    @Override // i6.m
    public void onStop() {
    }

    @Override // m6.h
    public void removeCallback(@NotNull g cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
    }

    public final void setImageHeight(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Image height can't be less than zero.");
        }
        this.imageHeight = i11;
    }

    public final void setImageWidth(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Image width can't be less than zero.");
        }
        this.imageWidth = i11;
    }

    @Override // m6.h
    public void setRequest(InterfaceC7882e request) {
        this.request = request;
    }
}
