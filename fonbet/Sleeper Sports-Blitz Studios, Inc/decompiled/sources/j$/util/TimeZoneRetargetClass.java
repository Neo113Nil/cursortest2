package j$.util;

import j$.time.ZoneId;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class TimeZoneRetargetClass {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZoneId toZoneId(TimeZone timeZone) {
        return timeZone instanceof TimeZoneRetargetInterface ? ((TimeZoneRetargetInterface) timeZone).toZoneId() : DesugarTimeZone.toZoneId(timeZone);
    }
}
