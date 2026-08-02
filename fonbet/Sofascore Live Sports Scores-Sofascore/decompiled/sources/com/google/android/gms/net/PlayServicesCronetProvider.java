package com.google.android.gms.net;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import defpackage.sw9;
import defpackage.vp2;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(@NonNull Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            CronetProviderInstaller.b(this.mContext);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException unused) {
        }
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        DynamiteModule dynamiteModule;
        try {
            CronetProviderInstaller.b(this.mContext);
            try {
                synchronized (CronetProviderInstaller.b) {
                    dynamiteModule = CronetProviderInstaller.c;
                }
                Preconditions.i(dynamiteModule);
                ClassLoader classLoader = dynamiteModule.a.getClassLoader();
                Preconditions.i(classLoader);
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
                e = null;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                e = e;
                builder = null;
            }
            if (e == null) {
                Preconditions.j(builder, "The value of the constructed builder should never be null");
                return builder;
            }
            vp2.e("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            return null;
        } catch (GooglePlayServicesNotAvailableException e2) {
            sw9.m("Google Play Services Cronet provider is unavailable on this device.", e2);
            return null;
        } catch (GooglePlayServicesRepairableException e3) {
            sw9.m("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    @NonNull
    @Keep
    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (CronetProviderInstaller.b) {
            str = CronetProviderInstaller.d;
        }
        return str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        DynamiteModule dynamiteModule;
        tryToInstallCronetProvider();
        synchronized (CronetProviderInstaller.b) {
            dynamiteModule = CronetProviderInstaller.c;
        }
        return dynamiteModule != null;
    }
}
