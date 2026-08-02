package javazoom.jl.player;

import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.JavaLayerException;

/* loaded from: classes9.dex */
public abstract class AudioDeviceBase implements AudioDevice {
    private boolean open = false;
    private Decoder decoder = null;

    protected void closeImpl() {
    }

    protected void flushImpl() {
    }

    protected void openImpl() throws JavaLayerException {
    }

    protected void writeImpl(short[] sArr, int i, int i2) throws JavaLayerException {
    }

    @Override // javazoom.jl.player.AudioDevice
    public synchronized void open(Decoder decoder) throws JavaLayerException {
        if (!isOpen()) {
            this.decoder = decoder;
            openImpl();
            setOpen(true);
        }
    }

    protected void setOpen(boolean z) {
        this.open = z;
    }

    @Override // javazoom.jl.player.AudioDevice
    public synchronized boolean isOpen() {
        return this.open;
    }

    @Override // javazoom.jl.player.AudioDevice
    public synchronized void close() {
        if (isOpen()) {
            closeImpl();
            setOpen(false);
            this.decoder = null;
        }
    }

    @Override // javazoom.jl.player.AudioDevice
    public void write(short[] sArr, int i, int i2) throws JavaLayerException {
        if (isOpen()) {
            writeImpl(sArr, i, i2);
        }
    }

    @Override // javazoom.jl.player.AudioDevice
    public void flush() {
        if (isOpen()) {
            flushImpl();
        }
    }

    protected Decoder getDecoder() {
        return this.decoder;
    }
}
