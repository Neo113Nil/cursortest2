package m6;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import i6.m;
import l6.InterfaceC7882e;

/* loaded from: classes.dex */
public interface h<R> extends m {
    InterfaceC7882e getRequest();

    void getSize(@NonNull g gVar);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(@NonNull R r11, n6.c<? super R> cVar);

    void removeCallback(@NonNull g gVar);

    void setRequest(InterfaceC7882e interfaceC7882e);
}
