package com.vk.libvideo.api.pip2;

import androidx.fragment.app.Fragment;
import xsna.asp;
import xsna.kds0;
import xsna.zrp;

/* compiled from: VideoContainerFragmentEntry.kt */
/* loaded from: classes2.dex */
public interface VideoContainerFragmentEntry {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoContainerFragmentEntry.kt */
    public static final class LaunchMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LaunchMode[] $VALUES;
        public static final LaunchMode OneShot;
        public static final LaunchMode SingleInstance;

        static {
            LaunchMode launchMode = new LaunchMode("OneShot", 0);
            OneShot = launchMode;
            LaunchMode launchMode2 = new LaunchMode("SingleInstance", 1);
            SingleInstance = launchMode2;
            LaunchMode[] launchModeArr = {launchMode, launchMode2};
            $VALUES = launchModeArr;
            $ENTRIES = new asp(launchModeArr);
        }

        public LaunchMode() {
            throw null;
        }

        public static LaunchMode valueOf(String str) {
            return (LaunchMode) Enum.valueOf(LaunchMode.class, str);
        }

        public static LaunchMode[] values() {
            return (LaunchMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoContainerFragmentEntry.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type Discovery;
        public static final Type Live;

        static {
            Type type = new Type("Discovery", 0);
            Discovery = type;
            Type type2 = new Type("Live", 1);
            Live = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    default boolean a0() {
        return false;
    }

    Fragment g();

    Type getType();

    LaunchMode h();

    void i(kds0 kds0Var);
}
