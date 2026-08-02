package com.margelo.nitro.mmkv;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: NitroMmkvOnLoad.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/margelo/nitro/mmkv/NitroMmkvOnLoad;", "", "<init>", "()V", "Companion", "react-native-mmkv_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroMmkvOnLoad {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "NitroMmkvOnLoad";
    private static boolean didLoad;

    @JvmStatic
    public static final void initializeNative() {
        INSTANCE.initializeNative();
    }

    /* compiled from: NitroMmkvOnLoad.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/margelo/nitro/mmkv/NitroMmkvOnLoad$Companion;", "", "<init>", "()V", "TAG", "", "didLoad", "", "initializeNative", "", "react-native-mmkv_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void initializeNative() {
            if (NitroMmkvOnLoad.didLoad) {
                return;
            }
            try {
                Log.i(NitroMmkvOnLoad.TAG, "Loading NitroMmkv C++ library...");
                System.loadLibrary("NitroMmkv");
                Log.i(NitroMmkvOnLoad.TAG, "Successfully loaded NitroMmkv C++ library!");
                NitroMmkvOnLoad.didLoad = true;
            } catch (Error e) {
                Log.e(NitroMmkvOnLoad.TAG, "Failed to load NitroMmkv C++ library! Is it properly installed and linked? Is the name correct? (see `CMakeLists.txt`, at `add_library(...)`)", e);
                throw e;
            }
        }
    }
}
