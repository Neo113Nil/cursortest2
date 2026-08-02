package com.vk.im.engine.models.sync;

import android.net.Uri;
import java.util.Map;
import xsna.asp;
import xsna.jeq0;
import xsna.jgp;
import xsna.zrp;

/* compiled from: MaxEntryPointsConfig.kt */
/* loaded from: classes.dex */
public final class MaxEntryPointsConfig {
    public static final a d = new a();
    public static final MaxEntryPointsConfig e = new MaxEntryPointsConfig(false, jgp.b, jeq0.g("https://trk.mail.ru/c/vva9z7"));
    public final boolean a;
    public final Object b;
    public final Uri c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MaxEntryPointsConfig.kt */
    /* loaded from: classes2.dex */
    public static final class AvailableEntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AvailableEntryPoint[] $VALUES;
        public static final AvailableEntryPoint CallsLink;
        public static final AvailableEntryPoint StoreLink;
        private final String point;

        static {
            AvailableEntryPoint availableEntryPoint = new AvailableEntryPoint("StoreLink", 0, "store_link");
            StoreLink = availableEntryPoint;
            AvailableEntryPoint availableEntryPoint2 = new AvailableEntryPoint("CallsLink", 1, "calls_link");
            CallsLink = availableEntryPoint2;
            AvailableEntryPoint[] availableEntryPointArr = {availableEntryPoint, availableEntryPoint2};
            $VALUES = availableEntryPointArr;
            $ENTRIES = new asp(availableEntryPointArr);
        }

        public AvailableEntryPoint(String str, int i, String str2) {
            this.point = str2;
        }

        public static zrp<AvailableEntryPoint> h() {
            return $ENTRIES;
        }

        public static AvailableEntryPoint valueOf(String str) {
            return (AvailableEntryPoint) Enum.valueOf(AvailableEntryPoint.class, str);
        }

        public static AvailableEntryPoint[] values() {
            return (AvailableEntryPoint[]) $VALUES.clone();
        }

        public final String i() {
            return this.point;
        }
    }

    /* compiled from: MaxEntryPointsConfig.kt */
    public static final class a {
    }

    public MaxEntryPointsConfig(boolean z, Map<AvailableEntryPoint, ? extends Uri> map, Uri uri) {
        this.a = z;
        this.b = map;
        this.c = uri;
    }
}
