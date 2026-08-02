package org.chromium.net.telemetry;

/* loaded from: classes10.dex */
public final class SizeBuckets {
    private static boolean isInClosedOpenRange(double value, int lowerBound, int upperBound) {
        return value >= ((double) lowerBound) && value < ((double) upperBound);
    }

    public static int calcRequestHeadersSizeBucket(long sizeBytes) {
        checkSizeIsValid(sizeBytes, "Request header size is negative");
        double d = sizeBytes / 1024.0d;
        if (isInClosedOpenRange(d, 0, 1)) {
            return 1;
        }
        if (isInClosedOpenRange(d, 1, 10)) {
            return 2;
        }
        if (isInClosedOpenRange(d, 10, 25)) {
            return 3;
        }
        if (isInClosedOpenRange(d, 25, 50)) {
            return 4;
        }
        return isInClosedOpenRange(d, 50, 100) ? 5 : 6;
    }

    public static int calcResponseHeadersSizeBucket(long sizeBytes) {
        checkSizeIsValid(sizeBytes, "Response header size is negative");
        double d = sizeBytes / 1024.0d;
        if (isInClosedOpenRange(d, 0, 1)) {
            return 1;
        }
        if (isInClosedOpenRange(d, 1, 10)) {
            return 2;
        }
        if (isInClosedOpenRange(d, 10, 25)) {
            return 3;
        }
        if (isInClosedOpenRange(d, 25, 50)) {
            return 4;
        }
        return isInClosedOpenRange(d, 50, 100) ? 5 : 6;
    }

    public static int calcRequestBodySizeBucket(long sizeBytes) {
        checkSizeIsValid(sizeBytes, "Request body size is negative");
        double d = sizeBytes / 1024.0d;
        if (d == 0.0d) {
            return 1;
        }
        if (d > 0.0d && d < 10.0d) {
            return 2;
        }
        if (isInClosedOpenRange(d, 10, 50)) {
            return 3;
        }
        if (isInClosedOpenRange(d, 50, 200)) {
            return 4;
        }
        if (isInClosedOpenRange(d, 200, 500)) {
            return 5;
        }
        if (isInClosedOpenRange(d, 500, 1000)) {
            return 6;
        }
        return isInClosedOpenRange(d, 1000, 5000) ? 7 : 8;
    }

    public static int calcResponseBodySizeBucket(long sizeBytes) {
        checkSizeIsValid(sizeBytes, "Response body size is negative");
        double d = sizeBytes / 1024.0d;
        if (d == 0.0d) {
            return 1;
        }
        if (d > 0.0d && d < 10.0d) {
            return 2;
        }
        if (isInClosedOpenRange(d, 10, 50)) {
            return 3;
        }
        if (isInClosedOpenRange(d, 50, 200)) {
            return 4;
        }
        if (isInClosedOpenRange(d, 200, 500)) {
            return 5;
        }
        if (isInClosedOpenRange(d, 500, 1000)) {
            return 6;
        }
        return isInClosedOpenRange(d, 1000, 5000) ? 7 : 8;
    }

    private static void checkSizeIsValid(long sizeBytes, String errMessage) {
        if (sizeBytes < 0) {
            throw new IllegalArgumentException(errMessage);
        }
    }

    private SizeBuckets() {
    }
}
