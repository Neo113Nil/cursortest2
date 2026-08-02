package Rf;

import Gb.c;
import com.twilio.voice.EventKeys;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b {

    @c(alternate = {"first"}, value = "time")
    private final long time;

    @c(alternate = {"second"}, value = EventKeys.VALUE_KEY)
    @NotNull
    private final String value;

    public b(long j10, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.time = j10;
        this.value = value;
    }

    public final String a() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.time == bVar.time && Intrinsics.areEqual(this.value, bVar.value);
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "EncryptedVisitorInfo(time=" + this.time + ", value=" + this.value + ')';
    }
}
