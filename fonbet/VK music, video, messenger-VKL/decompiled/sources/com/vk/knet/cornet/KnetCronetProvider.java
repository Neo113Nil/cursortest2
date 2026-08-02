package com.vk.knet.cornet;

import android.content.Context;
import java.util.Arrays;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.impl.NativeCronetEngineBuilderWithLibraryLoaderImpl;
import org.chromium.net.impl.NativeCronetProvider;
import xsna.epx;
import xsna.qek;
import xsna.vek;

/* compiled from: KnetCronetProvider.kt */
/* loaded from: classes.dex */
public final class KnetCronetProvider extends NativeCronetProvider {
    public KnetCronetProvider(Context context) {
        super(context);
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_BUILDER;
        Object[] objArr = {"Initialization KnetCronetProvider"};
        qek qekVar = vek.a;
        if (qekVar != null) {
            qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
        }
    }

    @Override // org.chromium.net.impl.NativeCronetProvider
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof KnetCronetProvider) && epx.f(this.mContext, ((KnetCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.impl.NativeCronetProvider, org.chromium.net.CronetProvider
    public String getName() {
        return "Knet-App-Packaged-Cronet-Provider";
    }

    @Override // org.chromium.net.impl.NativeCronetProvider
    public int hashCode() {
        return Arrays.hashCode(new Object[]{KnetCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.impl.NativeCronetProvider, org.chromium.net.CronetProvider
    public boolean isEnabled() {
        return true;
    }

    @Override // org.chromium.net.impl.NativeCronetProvider, org.chromium.net.CronetProvider
    public ExperimentalCronetEngine.Builder createBuilder() {
        CronetHttpLogger$DebugType cronetHttpLogger$DebugType = CronetHttpLogger$DebugType.CLIENT_BUILDER;
        Object[] objArr = {"Create engine builder by KnetCronetProvider"};
        qek qekVar = vek.a;
        if (qekVar != null) {
            qekVar.a(cronetHttpLogger$DebugType, Arrays.copyOf(objArr, 1));
        }
        return new ExperimentalCronetEngine.Builder(new NativeCronetEngineBuilderWithLibraryLoaderImpl(this.mContext));
    }
}
