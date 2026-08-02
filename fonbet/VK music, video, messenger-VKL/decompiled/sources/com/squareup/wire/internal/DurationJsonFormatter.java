package com.squareup.wire.internal;

import io.jsonwebtoken.JwtParser;
import java.time.Duration;
import java.util.Arrays;
import xsna.brm0;
import xsna.drm0;

/* compiled from: DurationJsonFormatter.kt */
/* loaded from: classes14.dex */
public final class DurationJsonFormatter implements JsonFormatter<Duration> {
    public static final DurationJsonFormatter INSTANCE = new DurationJsonFormatter();

    private DurationJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Duration fromString(String str) {
        int i;
        int L = drm0.L(str, 's', 0, 6);
        if (L != str.length() - 1) {
            throw new NumberFormatException();
        }
        int L2 = drm0.L(str, JwtParser.SEPARATOR_CHAR, 0, 6);
        if (L2 == -1) {
            return Duration.ofSeconds(Long.parseLong(str.substring(0, L)));
        }
        long parseLong = Long.parseLong(str.substring(0, L2));
        int i2 = L2 + 1;
        long parseLong2 = Long.parseLong(str.substring(i2, L));
        if (brm0.B(str, "-", false)) {
            parseLong2 = -parseLong2;
        }
        int i3 = L - i2;
        int i4 = i3;
        while (true) {
            i = 9;
            if (i4 >= 9) {
                break;
            }
            i4++;
            parseLong2 *= 10;
        }
        while (i < i3) {
            i++;
            parseLong2 /= 10;
        }
        return Duration.ofSeconds(parseLong, parseLong2);
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public String toStringOrNumber(Duration duration) {
        String str;
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        if (seconds < 0) {
            if (seconds == Long.MIN_VALUE) {
                str = "-922337203685477580";
                seconds = 8;
            } else {
                seconds = -seconds;
                str = "-";
            }
            if (nano != 0) {
                seconds--;
                nano = 1000000000 - nano;
            }
        } else {
            str = "";
        }
        return nano == 0 ? String.format("%s%ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds)}, 2)) : nano % 1000000 == 0 ? String.format("%s%d.%03ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000000)}, 3)) : nano % 1000 == 0 ? String.format("%s%d.%06ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000)}, 3)) : String.format("%s%d.%09ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano)}, 3));
    }
}
