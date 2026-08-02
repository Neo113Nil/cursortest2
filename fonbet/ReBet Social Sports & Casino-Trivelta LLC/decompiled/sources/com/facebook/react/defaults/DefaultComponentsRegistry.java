package com.facebook.react.defaults;

import com.facebook.react.fabric.ComponentFactory;
import h8.InterfaceC4488a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@InterfaceC4488a
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 ¨\u0006\b"}, d2 = {"Lcom/facebook/react/defaults/DefaultComponentsRegistry;", "", "<init>", "()V", "register", "", "componentFactory", "Lcom/facebook/react/fabric/ComponentFactory;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultComponentsRegistry {

    @NotNull
    public static final DefaultComponentsRegistry INSTANCE = new DefaultComponentsRegistry();

    static {
        DefaultSoLoader.maybeLoadSoLibrary();
    }

    private DefaultComponentsRegistry() {
    }

    @JvmStatic
    @InterfaceC4488a
    public static final native void register(@NotNull ComponentFactory componentFactory);
}
