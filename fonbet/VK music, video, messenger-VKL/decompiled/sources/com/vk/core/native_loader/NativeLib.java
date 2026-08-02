package com.vk.core.native_loader;

import com.vk.sqliteext.observer.SQLiteContentObserver;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.msy;
import xsna.on00;
import xsna.q57;
import xsna.zr;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NativeLib.kt */
/* loaded from: classes.dex */
public final class NativeLib {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NativeLib[] $VALUES;
    public static final NativeLib CONSCRYPT_DEDUP;
    public static final NativeLib CPP_SHARED;
    public static final NativeLib CRONET;
    public static final a Companion;
    public static final NativeLib GL_EFFECTS;
    public static final NativeLib JPEG_IMAGE_CODER;
    public static final NativeLib OK_NATIVE_NET;
    public static final NativeLib OK_NATIVE_TOOLS;
    public static final NativeLib OPENCV;
    public static final NativeLib SQLITE;
    public static final NativeLib SQLITE_OBSERVER;
    public static final NativeLib TFLITE;
    public static final NativeLib TFLITE_GPU_DELEGATE;
    public static final NativeLib TFLITE_NATIVE;
    public static final NativeLib VIDEO_MESSAGE_STENCIL_RENDERER;
    public static final NativeLib VK_CORE;
    public static final NativeLib VK_LAPLAYER;
    public static final NativeLib VK_MEDIA;
    public static final NativeLib VK_QR_CODE;
    public static final NativeLib VK_RLOTTIE;
    public static final NativeLib WEBRTC;
    public static final NativeLib ZSTD;
    private static final Lazy<Map<String, NativeLib>> artifacts$delegate;
    private final String fileName;
    private final String libName;
    private final String libraryName;

    /* compiled from: NativeLib.kt */
    public static final class a {
        public static NativeLib a(String str) {
            return (NativeLib) ((Map) NativeLib.artifacts$delegate.getValue()).get("lib" + str + ".so");
        }
    }

    static {
        NativeLib nativeLib = new NativeLib("CPP_SHARED", 0, "c++_shared");
        CPP_SHARED = nativeLib;
        NativeLib nativeLib2 = new NativeLib("SQLITE", 1, "sqlite3x");
        SQLITE = nativeLib2;
        NativeLib nativeLib3 = new NativeLib("SQLITE_OBSERVER", 2, SQLiteContentObserver.LIBRARY_NAME);
        SQLITE_OBSERVER = nativeLib3;
        NativeLib nativeLib4 = new NativeLib("VK_QR_CODE", 3, "vkqrcode");
        VK_QR_CODE = nativeLib4;
        NativeLib nativeLib5 = new NativeLib("VK_CORE", 4, "vkcore");
        VK_CORE = nativeLib5;
        NativeLib nativeLib6 = new NativeLib("VK_MEDIA", 5, "vkmedia");
        VK_MEDIA = nativeLib6;
        NativeLib nativeLib7 = new NativeLib("VK_LAPLAYER", 6, "laplayer");
        VK_LAPLAYER = nativeLib7;
        NativeLib nativeLib8 = new NativeLib("VK_RLOTTIE", 7, "vkrlottie");
        VK_RLOTTIE = nativeLib8;
        NativeLib nativeLib9 = new NativeLib("GL_EFFECTS", 8, "gl-effects");
        GL_EFFECTS = nativeLib9;
        NativeLib nativeLib10 = new NativeLib("VIDEO_MESSAGE_STENCIL_RENDERER", 9, "video-message-stencils");
        VIDEO_MESSAGE_STENCIL_RENDERER = nativeLib10;
        NativeLib nativeLib11 = new NativeLib("ZSTD", 10, "zstd-jni-1.5.7-4");
        ZSTD = nativeLib11;
        NativeLib nativeLib12 = new NativeLib("WEBRTC", 11, "jingle_peerconnection_so");
        WEBRTC = nativeLib12;
        NativeLib nativeLib13 = new NativeLib("CRONET", 12, "cronet.140.0.7339.52");
        CRONET = nativeLib13;
        NativeLib nativeLib14 = new NativeLib("OPENCV", 13, "opencv_java4");
        OPENCV = nativeLib14;
        NativeLib nativeLib15 = new NativeLib("TFLITE", 14, "tensorflowlite");
        TFLITE = nativeLib15;
        NativeLib nativeLib16 = new NativeLib("TFLITE_GPU_DELEGATE", 15, "tensorflowlite_gpu_delegate");
        TFLITE_GPU_DELEGATE = nativeLib16;
        NativeLib nativeLib17 = new NativeLib("TFLITE_NATIVE", 16, "native-tensorflow-core-lib");
        TFLITE_NATIVE = nativeLib17;
        NativeLib nativeLib18 = new NativeLib("OK_NATIVE_NET", 17, "native-net");
        OK_NATIVE_NET = nativeLib18;
        NativeLib nativeLib19 = new NativeLib("OK_NATIVE_TOOLS", 18, "native_tools");
        OK_NATIVE_TOOLS = nativeLib19;
        NativeLib nativeLib20 = new NativeLib("JPEG_IMAGE_CODER", 19, "vk-jpeg-coder");
        JPEG_IMAGE_CODER = nativeLib20;
        NativeLib nativeLib21 = new NativeLib("CONSCRYPT_DEDUP", 20, "conscrypt-dedup");
        CONSCRYPT_DEDUP = nativeLib21;
        NativeLib[] nativeLibArr = {nativeLib, nativeLib2, nativeLib3, nativeLib4, nativeLib5, nativeLib6, nativeLib7, nativeLib8, nativeLib9, nativeLib10, nativeLib11, nativeLib12, nativeLib13, nativeLib14, nativeLib15, nativeLib16, nativeLib17, nativeLib18, nativeLib19, nativeLib20, nativeLib21};
        $VALUES = nativeLibArr;
        $ENTRIES = new asp(nativeLibArr);
        Companion = new a();
        artifacts$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new q57(6));
    }

    public NativeLib(String str, int i, String str2) {
        this.libraryName = str2;
        this.libName = "lib".concat(str2);
        this.fileName = zr.a("lib", str2, ".so");
    }

    public static LinkedHashMap h() {
        NativeLib[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (NativeLib nativeLib : values) {
            linkedHashMap.put(nativeLib.fileName, nativeLib);
        }
        return linkedHashMap;
    }

    public static NativeLib valueOf(String str) {
        return (NativeLib) Enum.valueOf(NativeLib.class, str);
    }

    public static NativeLib[] values() {
        return (NativeLib[]) $VALUES.clone();
    }

    public final String j() {
        return this.fileName;
    }

    public final String k() {
        return this.libName;
    }

    public final String l() {
        return this.libraryName;
    }
}
