package m6;

import B0.A0;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import l6.InterfaceC7882e;
import p6.l;

/* renamed from: m6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8090c<T> implements h<T> {
    private final int height;
    private InterfaceC7882e request;
    private final int width;

    public AbstractC8090c() {
        this(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
    }

    @Override // m6.h
    public final InterfaceC7882e getRequest() {
        return this.request;
    }

    @Override // m6.h
    public final void getSize(@NonNull g gVar) {
        gVar.c(this.width, this.height);
    }

    @Override // i6.m
    public void onDestroy() {
    }

    @Override // m6.h
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // m6.h
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // i6.m
    public void onStart() {
    }

    @Override // i6.m
    public void onStop() {
    }

    @Override // m6.h
    public final void removeCallback(@NonNull g gVar) {
    }

    @Override // m6.h
    public final void setRequest(InterfaceC7882e interfaceC7882e) {
        this.request = interfaceC7882e;
    }

    public AbstractC8090c(int i11, int i12) {
        if (!l.i(i11, i12)) {
            throw new IllegalArgumentException(A0.a(i11, i12, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.width = i11;
        this.height = i12;
    }
}
