package com.facebook.react.shell;

import C7.C1056u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/shell/MainPackageConfig;", "", "LC7/u;", "frescoConfig", "<init>", "(LC7/u;)V", "LC7/u;", "getFrescoConfig", "()LC7/u;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MainPackageConfig {

    @NotNull
    private final C1056u frescoConfig;

    public MainPackageConfig(@NotNull C1056u frescoConfig) {
        Intrinsics.checkNotNullParameter(frescoConfig, "frescoConfig");
        this.frescoConfig = frescoConfig;
    }

    @NotNull
    public final C1056u getFrescoConfig() {
        return this.frescoConfig;
    }
}
