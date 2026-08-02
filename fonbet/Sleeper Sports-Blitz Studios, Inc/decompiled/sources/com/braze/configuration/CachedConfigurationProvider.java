package com.braze.configuration;

import android.content.Context;
import android.content.res.Resources;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\t\b\u0017\u0018\u0000 <2\u00020\u0001:\u0002\f=B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001d2\u0006\u0010\u0013\u001a\u00020\n2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eH\u0004¢\u0006\u0004\b \u0010\u001aJ+\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b$\u0010#J+\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b%\u0010#J+\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b&\u0010#J\u001f\u0010(\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u000eH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020*H\u0000¢\u0006\u0004\b+\u0010,R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010/R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R%\u00106\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/braze/configuration/CachedConfigurationProvider;", "", "Landroid/content/Context;", "context", "", "shouldUseConfigurationCache", "Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "runtimeAppConfigurationProvider", "<init>", "(Landroid/content/Context;ZLcom/braze/configuration/RuntimeAppConfigurationProvider;)V", "", SDKConstants.PARAM_KEY, "Lcom/braze/configuration/d;", "resourceType", "", "getResourceIdentifier", "(Ljava/lang/String;Lcom/braze/configuration/d;)I", "getFallbackConfigKey", "(Ljava/lang/String;)Ljava/lang/String;", "primaryKey", "defaultValue", "getBooleanValue", "(Ljava/lang/String;Z)Z", "getStringValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getIntValue", "(Ljava/lang/String;I)I", "getColorValue", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "getStringSetValue", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "getDrawableValue", "type", "getRuntimeConfigurationValue", "(Lcom/braze/configuration/d;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getResourceConfigurationValue", "getConfigurationValue", "readResourceValue", "resourceId", "getValueFromResources", "(Lcom/braze/configuration/d;I)Ljava/lang/Object;", "", "resetCache$android_sdk_base_release", "()V", "resetCache", "Landroid/content/Context;", "Z", "Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "getRuntimeAppConfigurationProvider", "()Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "setRuntimeAppConfigurationProvider", "(Lcom/braze/configuration/RuntimeAppConfigurationProvider;)V", "", "configurationCache", "Ljava/util/Map;", "getConfigurationCache", "()Ljava/util/Map;", "resourcePackageName", "Ljava/lang/String;", "Companion", "com/braze/configuration/c", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CachedConfigurationProvider {
    public static final c Companion = new c();
    private static final int MISSING_RESOURCE_IDENTIFIER = 0;
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private RuntimeAppConfigurationProvider runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context) {
        this(context, false, null, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final String getFallbackConfigKey(String key) {
        if (StringsKt.contains$default((CharSequence) key, (CharSequence) "braze", false, 2, (Object) null)) {
            return StringsKt.replace$default(key, "braze", "appboy", false, 4, (Object) null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getResourceConfigurationValue$lambda$1(String str, Object obj) {
        return "Using resources value for key: '" + str + "' and value: '" + obj + "'";
    }

    private final int getResourceIdentifier(String key, d resourceType) {
        if (key == null) {
            return 0;
        }
        return this.context.getResources().getIdentifier(key, resourceType.f487a, this.resourcePackageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRuntimeConfigurationValue$lambda$0(String str, Object obj) {
        return "Using runtime override value for key: '" + str + "' and value: '" + obj + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$2(String str, Object obj) {
        return "Primary key '" + str + "' had no identifier. No secondary key to read resource value. Returning default value: '" + obj + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$3() {
        return "Caught exception retrieving resource value";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readResourceValue$lambda$4(d dVar, String str, Object obj) {
        return "Unable to find the xml " + dVar + " configuration value with primary key '" + str + "'. Using default value '" + obj + "'.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetCache$lambda$5() {
        return "Resetting cached configuration";
    }

    public final boolean getBooleanValue(String primaryKey, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(d.d, primaryKey, Boolean.valueOf(defaultValue));
        Intrinsics.checkNotNull(configurationValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) configurationValue).booleanValue();
    }

    public final Integer getColorValue(String primaryKey) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        return (Integer) getConfigurationValue(d.c, primaryKey, null);
    }

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final Object getConfigurationValue(d type, String key, Object defaultValue) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        return (this.shouldUseConfigurationCache && this.configurationCache.containsKey(key)) ? this.configurationCache.get(key) : this.runtimeAppConfigurationProvider.containsKey(key) ? getRuntimeConfigurationValue(type, key, defaultValue) : getResourceConfigurationValue(type, key, defaultValue);
    }

    public final int getDrawableValue(String primaryKey, int defaultValue) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(d.f, primaryKey, Integer.valueOf(defaultValue));
        Intrinsics.checkNotNull(configurationValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) configurationValue).intValue();
    }

    public final int getIntValue(String primaryKey, int defaultValue) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(d.b, primaryKey, Integer.valueOf(defaultValue));
        Intrinsics.checkNotNull(configurationValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) configurationValue).intValue();
    }

    public final Object getResourceConfigurationValue(d type, final String key, Object defaultValue) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        final Object readResourceValue = readResourceValue(type, key, defaultValue);
        this.configurationCache.put(key, readResourceValue);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.CachedConfigurationProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resourceConfigurationValue$lambda$1;
                resourceConfigurationValue$lambda$1 = CachedConfigurationProvider.getResourceConfigurationValue$lambda$1(key, readResourceValue);
                return resourceConfigurationValue$lambda$1;
            }
        }, 7, (Object) null);
        return readResourceValue;
    }

    public final RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    public final Object getRuntimeConfigurationValue(d type, final String key, Object defaultValue) {
        final Object valueOf;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        int ordinal = type.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            valueOf = Integer.valueOf(defaultValue == null ? this.runtimeAppConfigurationProvider.getIntValue(key, 0) : this.runtimeAppConfigurationProvider.getIntValue(key, ((Integer) defaultValue).intValue()));
        } else if (ordinal == 2) {
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = this.runtimeAppConfigurationProvider;
            Intrinsics.checkNotNull(defaultValue, "null cannot be cast to non-null type kotlin.Boolean");
            valueOf = Boolean.valueOf(runtimeAppConfigurationProvider.getBooleanValue(key, ((Boolean) defaultValue).booleanValue()));
        } else if (ordinal == 3) {
            valueOf = this.runtimeAppConfigurationProvider.getStringValue(key, (String) defaultValue);
        } else if (ordinal == 4) {
            valueOf = Integer.valueOf(getResourceIdentifier(this.runtimeAppConfigurationProvider.getStringValue(key, ""), d.f));
        } else {
            if (ordinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = this.runtimeAppConfigurationProvider.getStringSetValue(key);
        }
        this.configurationCache.put(key, valueOf);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.CachedConfigurationProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String runtimeConfigurationValue$lambda$0;
                runtimeConfigurationValue$lambda$0 = CachedConfigurationProvider.getRuntimeConfigurationValue$lambda$0(key, valueOf);
                return runtimeConfigurationValue$lambda$0;
            }
        }, 7, (Object) null);
        return valueOf;
    }

    public final Set<String> getStringSetValue(String primaryKey, Set<String> defaultValue) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(d.g, primaryKey, defaultValue);
        return configurationValue == null ? defaultValue : (Set) configurationValue;
    }

    public final String getStringValue(String primaryKey, String defaultValue) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        return (String) getConfigurationValue(d.e, primaryKey, defaultValue);
    }

    public final Object getValueFromResources(d type, int resourceId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Resources resources = this.context.getResources();
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            return Integer.valueOf(resources.getInteger(resourceId));
        }
        if (ordinal == 1) {
            return Integer.valueOf(resources.getColor(resourceId));
        }
        if (ordinal == 2) {
            return Boolean.valueOf(resources.getBoolean(resourceId));
        }
        if (ordinal == 3) {
            String string = resources.getString(resourceId);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (ordinal == 4) {
            return Integer.valueOf(resourceId);
        }
        if (ordinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        String[] stringArray = resources.getStringArray(resourceId);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return new HashSet(CollectionsKt.listOf(Arrays.copyOf(stringArray, stringArray.length)));
    }

    public final Object readResourceValue(final d type, final String key, final Object defaultValue) {
        int resourceIdentifier;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            resourceIdentifier = getResourceIdentifier(key, type);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.configuration.CachedConfigurationProvider$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readResourceValue$lambda$3;
                    readResourceValue$lambda$3 = CachedConfigurationProvider.readResourceValue$lambda$3();
                    return readResourceValue$lambda$3;
                }
            }, 4, (Object) null);
        }
        if (resourceIdentifier != 0) {
            return getValueFromResources(type, resourceIdentifier);
        }
        String fallbackConfigKey = getFallbackConfigKey(key);
        if (fallbackConfigKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.CachedConfigurationProvider$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readResourceValue$lambda$2;
                    readResourceValue$lambda$2 = CachedConfigurationProvider.readResourceValue$lambda$2(key, defaultValue);
                    return readResourceValue$lambda$2;
                }
            }, 7, (Object) null);
            return defaultValue;
        }
        int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, type);
        if (resourceIdentifier2 != 0) {
            return getValueFromResources(type, resourceIdentifier2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.CachedConfigurationProvider$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String readResourceValue$lambda$4;
                readResourceValue$lambda$4 = CachedConfigurationProvider.readResourceValue$lambda$4(d.this, key, defaultValue);
                return readResourceValue$lambda$4;
            }
        }, 7, (Object) null);
        return defaultValue;
    }

    public final void resetCache$android_sdk_base_release() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.configuration.CachedConfigurationProvider$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String resetCache$lambda$5;
                resetCache$lambda$5 = CachedConfigurationProvider.resetCache$lambda$5();
                return resetCache$lambda$5;
            }
        }, 7, (Object) null);
        this.configurationCache.clear();
    }

    public final void setRuntimeAppConfigurationProvider(RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        Intrinsics.checkNotNullParameter(runtimeAppConfigurationProvider, "<set-?>");
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context, boolean z) {
        this(context, z, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public CachedConfigurationProvider(Context context, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runtimeAppConfigurationProvider, "runtimeAppConfigurationProvider");
        this.context = context;
        this.shouldUseConfigurationCache = z;
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(...)");
        this.configurationCache = synchronizedMap;
        this.resourcePackageName = PackageUtils.getResourcePackageName(this.context);
    }

    public /* synthetic */ CachedConfigurationProvider(Context context, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new RuntimeAppConfigurationProvider(context) : runtimeAppConfigurationProvider);
    }
}
