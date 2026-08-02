package p3;

import java.util.ArrayList;
import m3.N;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8842b implements InterfaceC8846f {
    private i dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<z> listeners = new ArrayList<>(1);

    protected AbstractC8842b(boolean z11) {
        this.isNetwork = z11;
    }

    @Override // p3.InterfaceC8846f
    public final void addTransferListener(z zVar) {
        zVar.getClass();
        if (this.listeners.contains(zVar)) {
            return;
        }
        this.listeners.add(zVar);
        this.listenerCount++;
    }

    protected final void bytesTransferred(int i11) {
        i iVar = this.dataSpec;
        int i12 = N.f74289a;
        for (int i13 = 0; i13 < this.listenerCount; i13++) {
            this.listeners.get(i13).onBytesTransferred(this, iVar, this.isNetwork, i11);
        }
    }

    protected final void transferEnded() {
        i iVar = this.dataSpec;
        int i11 = N.f74289a;
        for (int i12 = 0; i12 < this.listenerCount; i12++) {
            this.listeners.get(i12).onTransferEnd(this, iVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    protected final void transferInitializing(i iVar) {
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            this.listeners.get(i11).onTransferInitializing(this, iVar, this.isNetwork);
        }
    }

    protected final void transferStarted(i iVar) {
        this.dataSpec = iVar;
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            this.listeners.get(i11).onTransferStart(this, iVar, this.isNetwork);
        }
    }
}
