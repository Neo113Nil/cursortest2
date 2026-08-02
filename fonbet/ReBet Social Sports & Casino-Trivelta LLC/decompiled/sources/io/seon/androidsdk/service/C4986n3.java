package io.seon.androidsdk.service;

import java.util.HashMap;

/* renamed from: io.seon.androidsdk.service.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4986n3 {

    /* renamed from: a, reason: collision with root package name */
    public C4954j3 f53448a = null;

    public final C4954j3 a() {
        if (this.f53448a == null) {
            C4954j3 c4954j3 = new C4954j3();
            c4954j3.f53398z = 3;
            c4954j3.f53372A = true;
            c4954j3.f53374b = new String[]{"noxd"};
            c4954j3.f53397y = new String[]{"goldfish", "Genymotion"};
            c4954j3.f53376d = new String[]{"goldfish"};
            HashMap hashMap = new HashMap();
            c4954j3.f53375c = hashMap;
            EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine = EmulatorDetectorConfigurator$Engine.LDPLAYER;
            hashMap.put("/system/priv-app/ldAppStore", String.valueOf(emulatorDetectorConfigurator$Engine));
            c4954j3.f53375c.put("/system/bin/ldinit", String.valueOf(emulatorDetectorConfigurator$Engine));
            c4954j3.f53375c.put("/system/etc/mumu-configs/device-prop-configs/mumu.config", String.valueOf(EmulatorDetectorConfigurator$Engine.MUMU));
            HashMap hashMap2 = c4954j3.f53375c;
            EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine2 = EmulatorDetectorConfigurator$Engine.NOX;
            hashMap2.put("fstab.nox", String.valueOf(emulatorDetectorConfigurator$Engine2));
            c4954j3.f53375c.put("init.nox.rc", String.valueOf(emulatorDetectorConfigurator$Engine2));
            c4954j3.f53375c.put("ueventd.nox.rc", String.valueOf(emulatorDetectorConfigurator$Engine2));
            c4954j3.f53375c.put("noxd", String.valueOf(emulatorDetectorConfigurator$Engine2));
            c4954j3.f53375c.put("/system/lib/libnoxspeedup.so", String.valueOf(emulatorDetectorConfigurator$Engine2));
            c4954j3.f53375c.put("/system/bin/nox-prop", String.valueOf(emulatorDetectorConfigurator$Engine2));
            c4954j3.f53375c.put("fstab.titan", String.valueOf(EmulatorDetectorConfigurator$Engine.TITAN_ENGINE));
            c4954j3.f53375c.put("/system/bin/windroyed", String.valueOf(EmulatorDetectorConfigurator$Engine.WINDROY));
            c4954j3.f53375c.put("/data/.bluestacks.prop", String.valueOf(EmulatorDetectorConfigurator$Engine.BLUESTACKS));
            HashMap hashMap3 = c4954j3.f53375c;
            EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine3 = EmulatorDetectorConfigurator$Engine.ANDY;
            hashMap3.put("fstab.andy", String.valueOf(emulatorDetectorConfigurator$Engine3));
            c4954j3.f53375c.put("ueventd.andy.rc", String.valueOf(emulatorDetectorConfigurator$Engine3));
            HashMap hashMap4 = c4954j3.f53375c;
            EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine4 = EmulatorDetectorConfigurator$Engine.GENYMOTION;
            hashMap4.put("/dev/socket/genyd", String.valueOf(emulatorDetectorConfigurator$Engine4));
            c4954j3.f53375c.put("/dev/socket/baseband_genyd", String.valueOf(emulatorDetectorConfigurator$Engine4));
            HashMap hashMap5 = c4954j3.f53375c;
            EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine5 = EmulatorDetectorConfigurator$Engine.QEMU;
            hashMap5.put("/dev/socket/qemud", String.valueOf(emulatorDetectorConfigurator$Engine5));
            c4954j3.f53375c.put("/dev/qemu_pipe", String.valueOf(emulatorDetectorConfigurator$Engine5));
            c4954j3.f53375c.put("/system/lib/libc_malloc_debug_qemu.so", String.valueOf(emulatorDetectorConfigurator$Engine5));
            c4954j3.f53375c.put("/system/bin/droid4x-prop", String.valueOf(EmulatorDetectorConfigurator$Engine.DROID4X));
            HashMap hashMap6 = c4954j3.f53375c;
            EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine6 = EmulatorDetectorConfigurator$Engine.VIRTUAL_BOX;
            hashMap6.put("ueventd.vbox86.rc", String.valueOf(emulatorDetectorConfigurator$Engine6));
            c4954j3.f53375c.put("fstab.vbox86", String.valueOf(emulatorDetectorConfigurator$Engine6));
            c4954j3.f53375c.put("init.vbox86.rc", String.valueOf(emulatorDetectorConfigurator$Engine6));
            HashMap hashMap7 = c4954j3.f53375c;
            EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine7 = EmulatorDetectorConfigurator$Engine.X86;
            hashMap7.put("x86.prop", String.valueOf(emulatorDetectorConfigurator$Engine7));
            c4954j3.f53375c.put("init.ttVM_x86.rc", String.valueOf(emulatorDetectorConfigurator$Engine7));
            c4954j3.f53375c.put("fstab.ttVM_x86", String.valueOf(emulatorDetectorConfigurator$Engine7));
            c4954j3.f53375c.put("ueventd.android_x86.rc", String.valueOf(emulatorDetectorConfigurator$Engine7));
            c4954j3.f53375c.put("ueventd.ttVM_x86.rc", String.valueOf(emulatorDetectorConfigurator$Engine7));
            HashMap hashMap8 = c4954j3.f53375c;
            EmulatorDetectorConfigurator$Engine emulatorDetectorConfigurator$Engine8 = EmulatorDetectorConfigurator$Engine.UNKNOWN;
            hashMap8.put("vmos.prop", String.valueOf(emulatorDetectorConfigurator$Engine8));
            c4954j3.f53375c.put("/system/bin/androVM-prop", String.valueOf(emulatorDetectorConfigurator$Engine8));
            c4954j3.f53375c.put("/system/etc/xxzs_prop.sh", String.valueOf(emulatorDetectorConfigurator$Engine8));
            c4954j3.f53375c.put("/system/bin/ttVM-prop", String.valueOf(emulatorDetectorConfigurator$Engine8));
            c4954j3.f53375c.put("/system/bin/microvirt-prop", String.valueOf(emulatorDetectorConfigurator$Engine8));
            c4954j3.f53375c.put("/system/app/AntStore", String.valueOf(emulatorDetectorConfigurator$Engine8));
            c4954j3.f53375c.put("/system/bin/duosconfig", String.valueOf(emulatorDetectorConfigurator$Engine8));
            c4954j3.f53375c.put("/system/lib/libdroid4x.so", String.valueOf(emulatorDetectorConfigurator$Engine8));
            HashMap hashMap9 = new HashMap();
            c4954j3.f53377e = hashMap9;
            hashMap9.put("ro.bootloader", "unknown");
            c4954j3.f53377e.put("ro.bootmode", "unknown");
            c4954j3.f53377e.put("ro.hardware", "goldfish");
            c4954j3.f53377e.put("ro.kernel.qemu", "1");
            c4954j3.f53377e.put("qemu.gles", "1");
            c4954j3.f53377e.put("ro.product.device", "generic");
            c4954j3.f53377e.put("ro.product.model", "sdk");
            c4954j3.f53377e.put("ro.product.name", "sdk");
            new HashMap();
            c4954j3.f53379g = new String[]{"10.0.2.15"};
            c4954j3.f53378f = new String[]{"com.bluestacks.", "com.android.emulator.radio.config", "com.google.android.overlay.emulatorgmsconfig", "com.bignox.", "com.kop.", "cn.itools.", "com.kaopu.", "me.haima.", "com.vphone.", "com.genymotion.", "com.google.android.launcher.layouts.genymotion"};
            c4954j3.f53381i = new String[]{"generic", "unknown"};
            c4954j3.f53382j = new String[]{"google_sdk", "droid4x", "Emulator", "Android SDK built for x86", "sdk_gphone64_arm64", "windroy", "tiantian", "genymotion", "amiduos", "duos", "ProjectTitan", "Subsystem for Android"};
            c4954j3.f53383k = new String[]{"VirtualBox", "vbox", "appplayer", "droid4x", "generic", "generic_x86", "emu64a", "virtual", "ProjectTitan", "motion_phone", "windows"};
            c4954j3.f53384l = new String[]{"Genymotion", "Genymobile", "Andy", "Oracle Corporation", "Appetize.io"};
            c4954j3.f53385m = new String[]{"vbox86", "sdk_gphone"};
            c4954j3.f53386n = new String[]{"goldfish", "vbox", "vbox86", "ttvm", "cancro", "intel", "android_x86", "ranchu"};
            c4954j3.f53387o = new String[]{"google_sdk", "sdk_google", "sdk_gphone64", "sdk_x86", "vbox86p", "simulator", "emulator", "andy", "iToolsAVM", "vbox86tp", "genymotion", "bluestacks", "droid4x", "ttvm_hdragon", "duos_native", "vbox", "android_x86"};
            c4954j3.f53388p = new String[]{"goldfish_arm64"};
            c4954j3.f53389q = new String[]{"bignox"};
            c4954j3.f53390r = new String[]{"Build2", "bliss-os"};
            c4954j3.f53391s = new String[]{"1.0.0.0"};
            c4954j3.f53392t = new String[]{"generic"};
            c4954j3.f53393u = new String[]{"vbox", "sdk_gphone"};
            c4954j3.f53380h = new String[]{"bluestacks"};
            c4954j3.f53394v = new String[]{"intel", "amd", "x86", "virtual"};
            c4954j3.f53395w = new String[]{"i686", "x86_64", "x86"};
            c4954j3.f53396x = new String[]{"genymotion", "xanmod", "-titan", ".lxc", ".xl0n"};
            c4954j3.f53373a = new String[]{"VirtualBox", "Redfinger", "Genymotion", "Game China", "virtio_input", "AT Translated Set", "qwerty2", "VMware", "Android_Input", "inputDev-1"};
            this.f53448a = c4954j3;
        }
        return this.f53448a;
    }
}
