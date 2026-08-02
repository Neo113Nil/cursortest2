package javazoom.jl.player;

import javazoom.jl.decoder.JavaLayerException;

/* loaded from: classes9.dex */
public abstract class AudioDeviceFactory {
    public abstract AudioDevice createAudioDevice() throws JavaLayerException;

    protected AudioDevice instantiate(ClassLoader classLoader, String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> loadClass;
        if (classLoader == null) {
            loadClass = Class.forName(str);
        } else {
            loadClass = classLoader.loadClass(str);
        }
        return (AudioDevice) loadClass.newInstance();
    }
}
