package ru.ozon.app.android.abtool.data.network;

import Ak.C2436a;
import Am.C2438a;
import B0.C2454a;
import Bi.b;
import C.o0;
import G.g;
import N3.C3660k;
import T7.E;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/abtool/data/network/ConfigsResponse;", "", "configs", "", "Lru/ozon/app/android/abtool/data/network/ConfigsResponse$Config;", "experiment", "Lru/ozon/app/android/abtool/data/network/ConfigsResponse$Experiment;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getConfigs", "()Ljava/util/List;", "getExperiment", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Config", "Experiment", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConfigsResponse {

    @NotNull
    private final List<Config> configs;
    private final List<Experiment> experiment;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/abtool/data/network/ConfigsResponse$Config;", "", "attributes", "", "Lru/ozon/app/android/abtool/data/network/ConfigsResponse$Config$Attribute;", "serviceName", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getAttributes", "()Ljava/util/List;", "getServiceName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Attribute", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Config {

        @NotNull
        private final List<Attribute> attributes;

        @NotNull
        private final String serviceName;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0001HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/abtool/data/network/ConfigsResponse$Config$Attribute;", "", "type", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getType", "()Ljava/lang/String;", "getName", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Attribute {

            @NotNull
            private final String name;

            @NotNull
            private final String type;

            @NotNull
            private final Object value;

            public Attribute(@NotNull String type, @NotNull String name, @NotNull Object value) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                this.type = type;
                this.name = name;
                this.value = value;
            }

            public static /* synthetic */ Attribute copy$default(Attribute attribute, String str, String str2, Object obj, int i11, Object obj2) {
                if ((i11 & 1) != 0) {
                    str = attribute.type;
                }
                if ((i11 & 2) != 0) {
                    str2 = attribute.name;
                }
                if ((i11 & 4) != 0) {
                    obj = attribute.value;
                }
                return attribute.copy(str, str2, obj);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final Object getValue() {
                return this.value;
            }

            @NotNull
            public final Attribute copy(@NotNull String type, @NotNull String name, @NotNull Object value) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                return new Attribute(type, name, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Attribute)) {
                    return false;
                }
                Attribute attribute = (Attribute) other;
                return Intrinsics.d(this.type, attribute.type) && Intrinsics.d(this.name, attribute.name) && Intrinsics.d(this.value, attribute.value);
            }

            @NotNull
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }

            @NotNull
            public final Object getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() + g.a(this.type.hashCode() * 31, 31, this.name);
            }

            @NotNull
            public String toString() {
                return E.c(this.value, ")", C3660k.d("Attribute(type=", this.type, ", name=", this.name, ", value="));
            }
        }

        public Config(@NotNull List<Attribute> attributes, @NotNull String serviceName) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(serviceName, "serviceName");
            this.attributes = attributes;
            this.serviceName = serviceName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Config copy$default(Config config, List list, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = config.attributes;
            }
            if ((i11 & 2) != 0) {
                str = config.serviceName;
            }
            return config.copy(list, str);
        }

        @NotNull
        public final List<Attribute> component1() {
            return this.attributes;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getServiceName() {
            return this.serviceName;
        }

        @NotNull
        public final Config copy(@NotNull List<Attribute> attributes, @NotNull String serviceName) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            Intrinsics.checkNotNullParameter(serviceName, "serviceName");
            return new Config(attributes, serviceName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.d(this.attributes, config.attributes) && Intrinsics.d(this.serviceName, config.serviceName);
        }

        @NotNull
        public final List<Attribute> getAttributes() {
            return this.attributes;
        }

        @NotNull
        public final String getServiceName() {
            return this.serviceName;
        }

        public int hashCode() {
            return this.serviceName.hashCode() + (this.attributes.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return b.e("Config(attributes=", ", serviceName=", this.serviceName, ")", this.attributes);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/abtool/data/network/ConfigsResponse$Experiment;", "", "id", "", "variantId", "alias", "", "<init>", "(IILjava/lang/String;)V", "getId", "()I", "getVariantId", "getAlias", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Experiment {

        @NotNull
        private final String alias;
        private final int id;
        private final int variantId;

        public Experiment(@i(name = "ID") int i11, @i(name = "variantID") int i12, @NotNull String alias) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            this.id = i11;
            this.variantId = i12;
            this.alias = alias;
        }

        public static /* synthetic */ Experiment copy$default(Experiment experiment, int i11, int i12, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = experiment.id;
            }
            if ((i13 & 2) != 0) {
                i12 = experiment.variantId;
            }
            if ((i13 & 4) != 0) {
                str = experiment.alias;
            }
            return experiment.copy(i11, i12, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final int getVariantId() {
            return this.variantId;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getAlias() {
            return this.alias;
        }

        @NotNull
        public final Experiment copy(@i(name = "ID") int id2, @i(name = "variantID") int variantId, @NotNull String alias) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            return new Experiment(id2, variantId, alias);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Experiment)) {
                return false;
            }
            Experiment experiment = (Experiment) other;
            return this.id == experiment.id && this.variantId == experiment.variantId && Intrinsics.d(this.alias, experiment.alias);
        }

        @NotNull
        public final String getAlias() {
            return this.alias;
        }

        public final int getId() {
            return this.id;
        }

        public final int getVariantId() {
            return this.variantId;
        }

        public int hashCode() {
            return this.alias.hashCode() + C2454a.a(this.variantId, Integer.hashCode(this.id) * 31, 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            int i12 = this.variantId;
            return o0.c(C2438a.a("Experiment(id=", i11, ", variantId=", ", alias=", i12), this.alias, ")");
        }
    }

    public ConfigsResponse(@NotNull List<Config> configs, List<Experiment> list) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.configs = configs;
        this.experiment = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigsResponse copy$default(ConfigsResponse configsResponse, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = configsResponse.configs;
        }
        if ((i11 & 2) != 0) {
            list2 = configsResponse.experiment;
        }
        return configsResponse.copy(list, list2);
    }

    @NotNull
    public final List<Config> component1() {
        return this.configs;
    }

    public final List<Experiment> component2() {
        return this.experiment;
    }

    @NotNull
    public final ConfigsResponse copy(@NotNull List<Config> configs, List<Experiment> experiment) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new ConfigsResponse(configs, experiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigsResponse)) {
            return false;
        }
        ConfigsResponse configsResponse = (ConfigsResponse) other;
        return Intrinsics.d(this.configs, configsResponse.configs) && Intrinsics.d(this.experiment, configsResponse.experiment);
    }

    @NotNull
    public final List<Config> getConfigs() {
        return this.configs;
    }

    public final List<Experiment> getExperiment() {
        return this.experiment;
    }

    public int hashCode() {
        int hashCode = this.configs.hashCode() * 31;
        List<Experiment> list = this.experiment;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return C2436a.b("ConfigsResponse(configs=", this.configs, ", experiment=", ")", this.experiment);
    }
}
