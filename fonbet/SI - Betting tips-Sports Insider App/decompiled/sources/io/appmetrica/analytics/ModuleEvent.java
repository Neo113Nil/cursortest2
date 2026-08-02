package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.c1;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ModuleEvent {

    /* renamed from: a, reason: collision with root package name */
    private final int f11337a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11338b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11339c;

    /* renamed from: d, reason: collision with root package name */
    private final int f11340d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f11341e;

    /* renamed from: f, reason: collision with root package name */
    private final List f11342f;

    /* renamed from: g, reason: collision with root package name */
    private final List f11343g;

    /* renamed from: h, reason: collision with root package name */
    private final List f11344h;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f11345a;

        /* renamed from: b, reason: collision with root package name */
        private String f11346b;

        /* renamed from: c, reason: collision with root package name */
        private String f11347c;

        /* renamed from: d, reason: collision with root package name */
        private int f11348d;

        /* renamed from: e, reason: collision with root package name */
        private Category f11349e;

        /* renamed from: f, reason: collision with root package name */
        private HashMap f11350f;

        /* renamed from: g, reason: collision with root package name */
        private HashMap f11351g;

        /* renamed from: h, reason: collision with root package name */
        private HashMap f11352h;

        public /* synthetic */ Builder(int i5, int i10) {
            this(i5);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f11352h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f11349e = category;
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f11350f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f11351g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f11346b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i5) {
            this.f11348d = i5;
            return this;
        }

        public Builder withValue(String str) {
            this.f11347c = str;
            return this;
        }

        private Builder(int i5) {
            this.f11348d = 1;
            this.f11349e = Category.GENERAL;
            this.f11345a = i5;
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i5) {
        this(builder);
    }

    public static Builder newBuilder(int i5) {
        return new Builder(i5, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f11344h);
    }

    public Category getCategory() {
        return this.f11341e;
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f11342f);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f11343g);
    }

    public String getName() {
        return this.f11338b;
    }

    public int getServiceDataReporterType() {
        return this.f11340d;
    }

    public int getType() {
        return this.f11337a;
    }

    public String getValue() {
        return this.f11339c;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ModuleEvent{type=");
        sb2.append(this.f11337a);
        sb2.append(", name='");
        sb2.append(this.f11338b);
        sb2.append("', value='");
        sb2.append(this.f11339c);
        sb2.append("', serviceDataReporterType=");
        sb2.append(this.f11340d);
        sb2.append(", category=");
        sb2.append(this.f11341e);
        sb2.append(", environment=");
        sb2.append(this.f11342f);
        sb2.append(", extras=");
        sb2.append(this.f11343g);
        sb2.append(", attributes=");
        return c1.p(sb2, this.f11344h, '}');
    }

    private ModuleEvent(Builder builder) {
        this.f11337a = builder.f11345a;
        this.f11338b = builder.f11346b;
        this.f11339c = builder.f11347c;
        this.f11340d = builder.f11348d;
        this.f11341e = builder.f11349e;
        this.f11342f = CollectionUtils.getListFromMap(builder.f11350f);
        this.f11343g = CollectionUtils.getListFromMap(builder.f11351g);
        this.f11344h = CollectionUtils.getListFromMap(builder.f11352h);
    }
}
