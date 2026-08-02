package io.seon.androidsdk.service;

/* loaded from: classes3.dex */
enum EmulatorDetector$PayloadProps {
    CPU_TYPE("cpu_type"),
    KERNEL_ARCH("kernel_arch"),
    BATTERY_VOLTAGE("battery_voltage"),
    BATTERY_TEMPERATURE("battery_temperature"),
    KERNEL_VERSION("kernel_version"),
    WIFI_SSID("wifi_ssid"),
    IS_TABLET("is_tablet"),
    INPUT_DATA("input_device_data"),
    BATTERY_CAPACITY("battery_total_capacity"),
    CPU_COUNT("cpu_count"),
    DEVICE_ID("device_id");

    private String value;

    EmulatorDetector$PayloadProps(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getValue();
    }
}
