package com.vk.im.engine.internal.longpoll.polling_tasks.socket;

import androidx.annotation.Keep;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.eventhub.api.di.EventHubComponent;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import org.chromium.net.NetError;
import xsna.asp;
import xsna.fpf0;
import xsna.k7m;
import xsna.l5m;
import xsna.m7m;
import xsna.w8i;
import xsna.zrp;

/* compiled from: ChannelMasterServiceReporter.kt */
/* loaded from: classes2.dex */
public final class ChannelMasterServiceReporter implements w8i {
    public static final ChannelMasterServiceReporter b = new ChannelMasterServiceReporter();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelMasterServiceReporter.kt */
    @Keep
    public static final class ErrorReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorReason[] $VALUES;
        public static final ErrorReason UNEXPECTED_DATA = new ErrorReason("UNEXPECTED_DATA", 0);
        public static final ErrorReason OFFSET_TOO_OLD_USER = new ErrorReason("OFFSET_TOO_OLD_USER", 1);
        public static final ErrorReason OFFSET_TOO_OLD_CHANNEL = new ErrorReason("OFFSET_TOO_OLD_CHANNEL", 2);
        public static final ErrorReason OLD_TS_MISMATCH_USER = new ErrorReason("OLD_TS_MISMATCH_USER", 3);
        public static final ErrorReason OLD_TS_MISMATCH_CHANNEL = new ErrorReason("OLD_TS_MISMATCH_CHANNEL", 4);
        public static final ErrorReason INTERNAL_ERROR = new ErrorReason("INTERNAL_ERROR", 5);
        public static final ErrorReason FLOOD_CONTROL = new ErrorReason("FLOOD_CONTROL", 6);
        public static final ErrorReason CHANNEL_UPDATE_OUTDATED = new ErrorReason("CHANNEL_UPDATE_OUTDATED", 7);
        public static final ErrorReason MSGS_UPDATE_OUTDATED = new ErrorReason("MSGS_UPDATE_OUTDATED", 8);
        public static final ErrorReason UNKNOWN = new ErrorReason(GrsBaseInfo.CountryCodeSource.UNKNOWN, 9);

        private static final /* synthetic */ ErrorReason[] $values() {
            return new ErrorReason[]{UNEXPECTED_DATA, OFFSET_TOO_OLD_USER, OFFSET_TOO_OLD_CHANNEL, OLD_TS_MISMATCH_USER, OLD_TS_MISMATCH_CHANNEL, INTERNAL_ERROR, FLOOD_CONTROL, CHANNEL_UPDATE_OUTDATED, MSGS_UPDATE_OUTDATED, UNKNOWN};
        }

        static {
            ErrorReason[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private ErrorReason(String str, int i) {
        }

        public static zrp<ErrorReason> getEntries() {
            return $ENTRIES;
        }

        public static ErrorReason valueOf(String str) {
            return (ErrorReason) Enum.valueOf(ErrorReason.class, str);
        }

        public static ErrorReason[] values() {
            return (ErrorReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelMasterServiceReporter.kt */
    @Keep
    public static final class ErrorSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorSource[] $VALUES;
        public static final ErrorSource WEBSOCKET = new ErrorSource("WEBSOCKET", 0);
        public static final ErrorSource API = new ErrorSource("API", 1);

        private static final /* synthetic */ ErrorSource[] $values() {
            return new ErrorSource[]{WEBSOCKET, API};
        }

        static {
            ErrorSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = new asp($values);
        }

        private ErrorSource(String str, int i) {
        }

        public static zrp<ErrorSource> getEntries() {
            return $ENTRIES;
        }

        public static ErrorSource valueOf(String str) {
            return (ErrorSource) Enum.valueOf(ErrorSource.class, str);
        }

        public static ErrorSource[] values() {
            return (ErrorSource[]) $VALUES.clone();
        }
    }

    public final void a(ErrorReason errorReason, ErrorSource errorSource) {
        l5m l5mVar = new l5m(null, null, 3);
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(DevNullEventKey.MASTER_SERVICE.h(), null, "channel_session_error", null, ((EventHubComponent) ((k7m) m7m.f(this)).a(fpf0.a(EventHubComponent.class))).getReporter().a(), null, errorReason.name(), null, errorSource.name(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS, 3, null);
        if (BuildInfo.h()) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"ChannelMasterServiceReporter", "Report " + schemeStat$TypeDevNullItem});
            }
        }
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
    }
}
