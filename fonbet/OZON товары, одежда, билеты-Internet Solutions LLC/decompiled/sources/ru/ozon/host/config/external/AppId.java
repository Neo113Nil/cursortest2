package ru.ozon.host.config.external;

import Aa0.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lru/ozon/host/config/external/AppId;", "LAa0/a;", "BX", "SX", "PVZ", "Delivery", "Flex", "OzonBankB2C", "OzonBankB2B", "OzonBankPVZ", "Hire", "Shipping", "Travel", "Wire", "Fresh", "Select", "MPX", "Design", "Maple", "Netzone", "Profit", "TravelExtranetApp", "OzonLogista", "Test", "Lru/ozon/host/config/external/AppId$BX;", "Lru/ozon/host/config/external/AppId$Delivery;", "Lru/ozon/host/config/external/AppId$Design;", "Lru/ozon/host/config/external/AppId$Flex;", "Lru/ozon/host/config/external/AppId$Fresh;", "Lru/ozon/host/config/external/AppId$Hire;", "Lru/ozon/host/config/external/AppId$MPX;", "Lru/ozon/host/config/external/AppId$Maple;", "Lru/ozon/host/config/external/AppId$Netzone;", "Lru/ozon/host/config/external/AppId$OzonBankB2B;", "Lru/ozon/host/config/external/AppId$OzonBankB2C;", "Lru/ozon/host/config/external/AppId$OzonBankPVZ;", "Lru/ozon/host/config/external/AppId$OzonLogista;", "Lru/ozon/host/config/external/AppId$PVZ;", "Lru/ozon/host/config/external/AppId$Profit;", "Lru/ozon/host/config/external/AppId$SX;", "Lru/ozon/host/config/external/AppId$Select;", "Lru/ozon/host/config/external/AppId$Shipping;", "Lru/ozon/host/config/external/AppId$Test;", "Lru/ozon/host/config/external/AppId$Travel;", "Lru/ozon/host/config/external/AppId$TravelExtranetApp;", "Lru/ozon/host/config/external/AppId$Wire;", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AppId extends a {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$BX;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BX implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final BX INSTANCE = new BX();

        @NotNull
        private static final String appName = "ozonapp_android";

        private BX() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BX);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 1536809676;
        }

        @NotNull
        public String toString() {
            return "BX";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Delivery;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Delivery implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Delivery INSTANCE = new Delivery();

        @NotNull
        private static final String appName = "ozondeliveryapp_android";

        private Delivery() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Delivery);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -125623798;
        }

        @NotNull
        public String toString() {
            return "Delivery";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Design;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Design implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Design INSTANCE = new Design();

        @NotNull
        private static final String appName = "ozondsgnapp_android";

        private Design() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Design);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -156347052;
        }

        @NotNull
        public String toString() {
            return "Design";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Flex;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Flex implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Flex INSTANCE = new Flex();

        @NotNull
        private static final String appName = "ozonflexapp_android";

        private Flex() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Flex);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -594509553;
        }

        @NotNull
        public String toString() {
            return "Flex";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Fresh;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Fresh implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Fresh INSTANCE = new Fresh();

        @NotNull
        private static final String appName = "freshapp_android";

        private Fresh() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Fresh);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -1249748264;
        }

        @NotNull
        public String toString() {
            return "Fresh";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Hire;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Hire implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Hire INSTANCE = new Hire();

        @NotNull
        private static final String appName = "ozonhireapp_android";

        private Hire() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Hire);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -594452470;
        }

        @NotNull
        public String toString() {
            return "Hire";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$MPX;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MPX implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final MPX INSTANCE = new MPX();

        @NotNull
        private static final String appName = "mpxapp_android";

        private MPX() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MPX);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 396470111;
        }

        @NotNull
        public String toString() {
            return "MPX";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Maple;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Maple implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Maple INSTANCE = new Maple();

        @NotNull
        private static final String appName = "ozonmapleapp_android";

        private Maple() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Maple);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -1243779713;
        }

        @NotNull
        public String toString() {
            return "Maple";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Netzone;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Netzone implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Netzone INSTANCE = new Netzone();

        @NotNull
        private static final String appName = "netzone_android";

        private Netzone() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Netzone);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -265251341;
        }

        @NotNull
        public String toString() {
            return "Netzone";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$OzonBankB2B;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonBankB2B implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final OzonBankB2B INSTANCE = new OzonBankB2B();

        @NotNull
        private static final String appName = "ozonbanksme_android";

        private OzonBankB2B() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OzonBankB2B);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 307110934;
        }

        @NotNull
        public String toString() {
            return "OzonBankB2B";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$OzonBankB2C;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonBankB2C implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final OzonBankB2C INSTANCE = new OzonBankB2C();

        @NotNull
        private static final String appName = "ozonbankfinance_android";

        private OzonBankB2C() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OzonBankB2C);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 307110935;
        }

        @NotNull
        public String toString() {
            return "OzonBankB2C";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$OzonBankPVZ;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonBankPVZ implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final OzonBankPVZ INSTANCE = new OzonBankPVZ();

        @NotNull
        private static final String appName = "ozonbankapvz_android";

        private OzonBankPVZ() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OzonBankPVZ);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 307125528;
        }

        @NotNull
        public String toString() {
            return "OzonBankPVZ";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$OzonLogista;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonLogista implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final OzonLogista INSTANCE = new OzonLogista();

        @NotNull
        private static final String appName = "logistaapp_android";

        private OzonLogista() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof OzonLogista);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 986546203;
        }

        @NotNull
        public String toString() {
            return "OzonLogista";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$PVZ;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PVZ implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final PVZ INSTANCE = new PVZ();

        @NotNull
        private static final String appName = "ozonpvzapp_android";

        private PVZ() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof PVZ);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 396473182;
        }

        @NotNull
        public String toString() {
            return "PVZ";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Profit;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Profit implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Profit INSTANCE = new Profit();

        @NotNull
        private static final String appName = "profitapp_android";

        private Profit() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Profit);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 199086554;
        }

        @NotNull
        public String toString() {
            return "Profit";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$SX;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SX implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final SX INSTANCE = new SX();

        @NotNull
        private static final String appName = "sellerapp_android";

        private SX() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SX);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 1536810203;
        }

        @NotNull
        public String toString() {
            return "SX";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Select;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Select implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Select INSTANCE = new Select();

        @NotNull
        private static final String appName = "selectapp_android";

        private Select() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Select);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 272877714;
        }

        @NotNull
        public String toString() {
            return "Select";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Shipping;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Shipping implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Shipping INSTANCE = new Shipping();

        @NotNull
        private static final String appName = "ozonshippingapp_android";

        private Shipping() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Shipping);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -1465326652;
        }

        @NotNull
        public String toString() {
            return "Shipping";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Test;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Test implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Test INSTANCE = new Test();

        @NotNull
        private static final String appName = "testapp_android";

        private Test() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Test);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -594098776;
        }

        @NotNull
        public String toString() {
            return "Test";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Travel;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Travel implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Travel INSTANCE = new Travel();

        @NotNull
        private static final String appName = "travelapp_android";

        private Travel() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Travel);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return 313201328;
        }

        @NotNull
        public String toString() {
            return "Travel";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$TravelExtranetApp;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TravelExtranetApp implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final TravelExtranetApp INSTANCE = new TravelExtranetApp();

        @NotNull
        private static final String appName = "travelextranetapp_android";

        private TravelExtranetApp() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TravelExtranetApp);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -834181500;
        }

        @NotNull
        public String toString() {
            return "TravelExtranetApp";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/host/config/external/AppId$Wire;", "Lru/ozon/host/config/external/AppId;", "<init>", "()V", "appName", "", "getAppName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "host-config-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Wire implements AppId {
        public static final int $stable = 0;

        @NotNull
        public static final Wire INSTANCE = new Wire();

        @NotNull
        private static final String appName = "ozonwireapp_android";

        private Wire() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Wire);
        }

        @Override // ru.ozon.host.config.external.AppId, Aa0.a
        @NotNull
        public String getAppName() {
            return appName;
        }

        public int hashCode() {
            return -594005605;
        }

        @NotNull
        public String toString() {
            return "Wire";
        }
    }

    @Override // Aa0.a
    @NotNull
    /* synthetic */ String getAppName();
}
