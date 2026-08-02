package com.braze.configuration;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
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
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\f\b\u0017\u0018\u0000 02\u00020\u0001:\u000212B%\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b.\u0010/J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0004J$\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0004J$\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0004J$\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J$\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007J\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0006H\u0007R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/braze/configuration/CachedConfigurationProvider;", "", "", "key", "Lcom/braze/configuration/CachedConfigurationProvider$b;", "resourceType", "", "getResourceIdentifier", "getFallbackConfigKey", "primaryKey", "", "defaultValue", "getBooleanValue", "getStringValue", "getIntValue", "getColorValue", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "getStringSetValue", "getDrawableValue", "type", "getRuntimeConfigurationValue", "getResourceConfigurationValue", "getConfigurationValue", "readResourceValue", "resourceId", "getValueFromResources", "Landroid/content/Context;", "context", "Landroid/content/Context;", "shouldUseConfigurationCache", "Z", "Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "runtimeAppConfigurationProvider", "Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "getRuntimeAppConfigurationProvider", "()Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "setRuntimeAppConfigurationProvider", "(Lcom/braze/configuration/RuntimeAppConfigurationProvider;)V", "", "configurationCache", "Ljava/util/Map;", "getConfigurationCache", "()Ljava/util/Map;", "resourcePackageName", "Ljava/lang/String;", "<init>", "(Landroid/content/Context;ZLcom/braze/configuration/RuntimeAppConfigurationProvider;)V", k.M, Constants.BRAZE_PUSH_CONTENT_KEY, "b", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public class CachedConfigurationProvider {
    private static final int MISSING_RESOURCE_IDENTIFIER = 0;
    private final Map<String, Object> configurationCache;
    private Context context;
    private final String resourcePackageName;
    private RuntimeAppConfigurationProvider runtimeAppConfigurationProvider;
    private boolean shouldUseConfigurationCache;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/braze/configuration/CachedConfigurationProvider$b;", "", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "INTEGER", "COLOR", "BOOLEAN", "STRING", "DRAWABLE_IDENTIFIER", "STRING_ARRAY", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public enum b {
        INTEGER(TypedValues.Custom.S_INT),
        COLOR("color"),
        BOOLEAN("bool"),
        STRING("string"),
        DRAWABLE_IDENTIFIER("drawable"),
        STRING_ARRAY("array");


        /* renamed from: b, reason: from kotlin metadata */
        private final String type;

        b(String str) {
            this.type = str;
        }

        /* renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.BOOLEAN.ordinal()] = 1;
            iArr[b.STRING.ordinal()] = 2;
            iArr[b.STRING_ARRAY.ordinal()] = 3;
            iArr[b.INTEGER.ordinal()] = 4;
            iArr[b.COLOR.ordinal()] = 5;
            iArr[b.DRAWABLE_IDENTIFIER.ordinal()] = 6;
            a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Using resources value for key: '" + this.b + "' and value: '" + this.c + '\'';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Using runtime override value for key: '" + this.b + "' and value: '" + this.c + '\'';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Primary key '" + this.b + "' had no identifier. No secondary key to read resource value. Returning default value: '" + this.c + '\'';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        public static final g b = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Caught exception retrieving resource value";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ b b;
        final /* synthetic */ String c;
        final /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(b bVar, String str, Object obj) {
            super(0);
            this.b = bVar;
            this.c = str;
            this.d = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to find the xml " + this.b + " configuration value with primary key '" + this.c + "'. Using default value '" + this.d + "'.";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedConfigurationProvider(Context context) {
        this(context, false, null, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
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
        Intrinsics.checkNotNullExpressionValue(synchronizedMap, "synchronizedMap(HashMap())");
        this.configurationCache = synchronizedMap;
        this.resourcePackageName = PackageUtils.getResourcePackageName(this.context);
    }

    private final String getFallbackConfigKey(String key) {
        if (StringsKt.contains$default((CharSequence) key, (CharSequence) "braze", false, 2, (Object) null)) {
            return StringsKt.replace$default(key, "braze", "appboy", false, 4, (Object) null);
        }
        return null;
    }

    private final int getResourceIdentifier(String key, b resourceType) {
        if (key == null) {
            return 0;
        }
        return this.context.getResources().getIdentifier(key, resourceType.getType(), this.resourcePackageName);
    }

    public final boolean getBooleanValue(String primaryKey, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(b.BOOLEAN, primaryKey, Boolean.valueOf(defaultValue));
        if (configurationValue != null) {
            return ((Boolean) configurationValue).booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    public final Integer getColorValue(String primaryKey) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        return (Integer) getConfigurationValue(b.COLOR, primaryKey, null);
    }

    public final Map<String, Object> getConfigurationCache() {
        return this.configurationCache;
    }

    public final Object getConfigurationValue(b type, String key, Object defaultValue) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        return (this.shouldUseConfigurationCache && this.configurationCache.containsKey(key)) ? this.configurationCache.get(key) : this.runtimeAppConfigurationProvider.containsKey(key) ? getRuntimeConfigurationValue(type, key, defaultValue) : getResourceConfigurationValue(type, key, defaultValue);
    }

    protected final int getDrawableValue(String primaryKey, int defaultValue) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(b.DRAWABLE_IDENTIFIER, primaryKey, Integer.valueOf(defaultValue));
        if (configurationValue != null) {
            return ((Integer) configurationValue).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public final int getIntValue(String primaryKey, int defaultValue) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(b.INTEGER, primaryKey, Integer.valueOf(defaultValue));
        if (configurationValue != null) {
            return ((Integer) configurationValue).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    protected final Object getResourceConfigurationValue(b type, String key, Object defaultValue) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Object readResourceValue = readResourceValue(type, key, defaultValue);
        this.configurationCache.put(key, readResourceValue);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(key, readResourceValue), 3, (Object) null);
        return readResourceValue;
    }

    public final RuntimeAppConfigurationProvider getRuntimeAppConfigurationProvider() {
        return this.runtimeAppConfigurationProvider;
    }

    protected final Object getRuntimeConfigurationValue(b type, String key, Object defaultValue) {
        Object valueOf;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        switch (c.a[type.ordinal()]) {
            case 1:
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = this.runtimeAppConfigurationProvider;
                if (defaultValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                valueOf = Boolean.valueOf(runtimeAppConfigurationProvider.getBooleanValue(key, ((Boolean) defaultValue).booleanValue()));
                break;
            case 2:
                valueOf = this.runtimeAppConfigurationProvider.getStringValue(key, (String) defaultValue);
                break;
            case 3:
                RuntimeAppConfigurationProvider runtimeAppConfigurationProvider2 = this.runtimeAppConfigurationProvider;
                if (defaultValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String?>");
                }
                valueOf = runtimeAppConfigurationProvider2.getStringSetValue(key, (Set) defaultValue);
                break;
            case 4:
            case 5:
                valueOf = Integer.valueOf(defaultValue == null ? this.runtimeAppConfigurationProvider.getIntValue(key, 0) : this.runtimeAppConfigurationProvider.getIntValue(key, ((Integer) defaultValue).intValue()));
                break;
            case 6:
                valueOf = Integer.valueOf(getResourceIdentifier(this.runtimeAppConfigurationProvider.getStringValue(key, ""), b.DRAWABLE_IDENTIFIER));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.configurationCache.put(key, valueOf);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(key, valueOf), 3, (Object) null);
        return valueOf;
    }

    public final Set<String> getStringSetValue(String primaryKey, Set<String> defaultValue) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        Object configurationValue = getConfigurationValue(b.STRING_ARRAY, primaryKey, defaultValue);
        return configurationValue == null ? defaultValue : (Set) configurationValue;
    }

    public final String getStringValue(String primaryKey, String defaultValue) {
        Intrinsics.checkNotNullParameter(primaryKey, "primaryKey");
        return (String) getConfigurationValue(b.STRING, primaryKey, defaultValue);
    }

    public final Object getValueFromResources(b type, int resourceId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Resources resources = this.context.getResources();
        switch (c.a[type.ordinal()]) {
            case 1:
                return Boolean.valueOf(resources.getBoolean(resourceId));
            case 2:
                String string = resources.getString(resourceId);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(resourceId)");
                return string;
            case 3:
                String[] stringArray = resources.getStringArray(resourceId);
                Intrinsics.checkNotNullExpressionValue(stringArray, "resources.getStringArray(resourceId)");
                return new HashSet(CollectionsKt.listOf(Arrays.copyOf(stringArray, stringArray.length)));
            case 4:
                return Integer.valueOf(resources.getInteger(resourceId));
            case 5:
                return Integer.valueOf(resources.getColor(resourceId));
            case 6:
                return Integer.valueOf(resourceId);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Object readResourceValue(b type, String key, Object defaultValue) {
        int resourceIdentifier;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            resourceIdentifier = getResourceIdentifier(key, type);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, g.b);
        }
        if (resourceIdentifier != 0) {
            return getValueFromResources(type, resourceIdentifier);
        }
        String fallbackConfigKey = getFallbackConfigKey(key);
        if (fallbackConfigKey == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(key, defaultValue), 3, (Object) null);
            return defaultValue;
        }
        int resourceIdentifier2 = getResourceIdentifier(fallbackConfigKey, type);
        if (resourceIdentifier2 != 0) {
            return getValueFromResources(type, resourceIdentifier2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(type, key, defaultValue), 3, (Object) null);
        return defaultValue;
    }

    public final void setRuntimeAppConfigurationProvider(RuntimeAppConfigurationProvider runtimeAppConfigurationProvider) {
        Intrinsics.checkNotNullParameter(runtimeAppConfigurationProvider, "<set-?>");
        this.runtimeAppConfigurationProvider = runtimeAppConfigurationProvider;
    }

    public /* synthetic */ CachedConfigurationProvider(Context context, boolean z, RuntimeAppConfigurationProvider runtimeAppConfigurationProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? new RuntimeAppConfigurationProvider(context) : runtimeAppConfigurationProvider);
    }
}
