package javazoom.jl.player;

import javazoom.jl.decoder.JavaLayerException;

/* loaded from: classes9.dex */
public class JavaSoundAudioDeviceFactory extends AudioDeviceFactory {
    private static final String DEVICE_CLASS_NAME = "javazoom.jl.player.JavaSoundAudioDevice";
    private boolean tested = false;

    @Override // javazoom.jl.player.AudioDeviceFactory
    public synchronized AudioDevice createAudioDevice() throws JavaLayerException {
        if (!this.tested) {
            testAudioDevice();
            this.tested = true;
        }
        try {
        } catch (Exception e) {
            throw new JavaLayerException("unable to create JavaSound device: " + e);
        } catch (LinkageError e2) {
            throw new JavaLayerException("unable to create JavaSound device: " + e2);
        }
        return createAudioDeviceImpl();
    }

    protected JavaSoundAudioDevice createAudioDeviceImpl() throws JavaLayerException {
        try {
            return (JavaSoundAudioDevice) instantiate(getClass().getClassLoader(), DEVICE_CLASS_NAME);
        } catch (Exception e) {
            throw new JavaLayerException("Cannot create JavaSound device", e);
        } catch (LinkageError e2) {
            throw new JavaLayerException("Cannot create JavaSound device", e2);
        }
    }

    public void testAudioDevice() throws JavaLayerException {
        createAudioDeviceImpl().test();
    }
}
