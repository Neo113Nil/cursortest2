package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface AppMetricaPlugins {
    void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str);

    void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails);

    void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails);
}
