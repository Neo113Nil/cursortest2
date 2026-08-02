package com.facebook.soloader;

import com.facebook.soloader.observer.ObserverHolder;
import org.mp4parser.boxes.apple.TrackLoadSettingsAtom;

/* loaded from: classes6.dex */
public class InstrumentedSoFileLoader implements SoFileLoader {
    private final SoFileLoader mDelegate;

    public InstrumentedSoFileLoader(SoFileLoader soFileLoader) {
        this.mDelegate = soFileLoader;
    }

    @Override // com.facebook.soloader.SoFileLoader
    public void load(String str, int i) {
        ObserverHolder.onSoFileLoaderLoadStart(this.mDelegate, TrackLoadSettingsAtom.TYPE, i);
        try {
            this.mDelegate.load(str, i);
            ObserverHolder.onSoFileLoaderLoadEnd(null);
        } finally {
        }
    }

    @Override // com.facebook.soloader.SoFileLoader
    public void loadBytes(String str, ElfByteChannel elfByteChannel, int i) {
        ObserverHolder.onSoFileLoaderLoadStart(this.mDelegate, "loadBytes", i);
        try {
            this.mDelegate.loadBytes(str, elfByteChannel, i);
            ObserverHolder.onSoFileLoaderLoadEnd(null);
        } finally {
        }
    }
}
