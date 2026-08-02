package javazoom.jl.player;

import java.util.Enumeration;
import java.util.Hashtable;
import javazoom.jl.decoder.JavaLayerException;

/* loaded from: classes9.dex */
public class FactoryRegistry extends AudioDeviceFactory {
    private static FactoryRegistry instance;
    protected Hashtable factories = new Hashtable();

    public static synchronized FactoryRegistry systemRegistry() {
        FactoryRegistry factoryRegistry;
        synchronized (FactoryRegistry.class) {
            if (instance == null) {
                FactoryRegistry factoryRegistry2 = new FactoryRegistry();
                instance = factoryRegistry2;
                factoryRegistry2.registerDefaultFactories();
            }
            factoryRegistry = instance;
        }
        return factoryRegistry;
    }

    public void addFactory(AudioDeviceFactory audioDeviceFactory) {
        this.factories.put(audioDeviceFactory.getClass(), audioDeviceFactory);
    }

    public void removeFactoryType(Class cls) {
        this.factories.remove(cls);
    }

    public void removeFactory(AudioDeviceFactory audioDeviceFactory) {
        this.factories.remove(audioDeviceFactory.getClass());
    }

    @Override // javazoom.jl.player.AudioDeviceFactory
    public AudioDevice createAudioDevice() throws JavaLayerException {
        AudioDeviceFactory[] factoriesPriority = getFactoriesPriority();
        if (factoriesPriority == null) {
            throw new JavaLayerException(this + ": no factories registered");
        }
        AudioDevice audioDevice = null;
        JavaLayerException e = null;
        for (int i = 0; audioDevice == null && i < factoriesPriority.length; i++) {
            try {
                audioDevice = factoriesPriority[i].createAudioDevice();
            } catch (JavaLayerException e2) {
                e = e2;
            }
        }
        if (audioDevice != null || e == null) {
            return audioDevice;
        }
        throw new JavaLayerException("Cannot create AudioDevice", e);
    }

    protected AudioDeviceFactory[] getFactoriesPriority() {
        AudioDeviceFactory[] audioDeviceFactoryArr;
        synchronized (this.factories) {
            int size = this.factories.size();
            if (size != 0) {
                audioDeviceFactoryArr = new AudioDeviceFactory[size];
                Enumeration elements = this.factories.elements();
                int i = 0;
                while (elements.hasMoreElements()) {
                    audioDeviceFactoryArr[i] = (AudioDeviceFactory) elements.nextElement();
                    i++;
                }
            } else {
                audioDeviceFactoryArr = null;
            }
        }
        return audioDeviceFactoryArr;
    }

    protected void registerDefaultFactories() {
        addFactory(new JavaSoundAudioDeviceFactory());
    }
}
