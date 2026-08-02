package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PluginErrorDetails {

    /* renamed from: a, reason: collision with root package name */
    private final String f15241a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15242b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f15243c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15244d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15245e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f15246f;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f15247a;

        /* renamed from: b, reason: collision with root package name */
        private String f15248b;

        /* renamed from: c, reason: collision with root package name */
        private List f15249c;

        /* renamed from: d, reason: collision with root package name */
        private String f15250d;

        /* renamed from: e, reason: collision with root package name */
        private String f15251e;

        /* renamed from: f, reason: collision with root package name */
        private Map f15252f;

        @NonNull
        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f15247a, this.f15248b, (List) WrapUtils.getOrDefault(this.f15249c, new ArrayList()), this.f15250d, this.f15251e, (Map) WrapUtils.getOrDefault(this.f15252f, new HashMap()), 0);
        }

        @NonNull
        public Builder withExceptionClass(String str) {
            this.f15247a = str;
            return this;
        }

        @NonNull
        public Builder withMessage(String str) {
            this.f15248b = str;
            return this;
        }

        @NonNull
        public Builder withPlatform(String str) {
            this.f15250d = str;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f15252f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f15249c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(String str) {
            this.f15251e = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i5) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f15241a;
    }

    public String getMessage() {
        return this.f15242b;
    }

    public String getPlatform() {
        return this.f15244d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f15246f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.f15243c;
    }

    public String getVirtualMachineVersion() {
        return this.f15245e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f15241a = str;
        this.f15242b = str2;
        this.f15243c = new ArrayList(list);
        this.f15244d = str3;
        this.f15245e = str4;
        this.f15246f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
