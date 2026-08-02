package com.nimbusds.jose;

/* loaded from: classes8.dex */
public class KeyLengthException extends KeyException {
    private final Algorithm alg;
    private final int expectedLength;

    public KeyLengthException(String str) {
        super(str);
        this.expectedLength = 0;
        this.alg = null;
    }

    public KeyLengthException(Algorithm algorithm) {
        this(0, algorithm);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyLengthException(int i, Algorithm algorithm) {
        super(r0.toString());
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            str = "The expected key length is " + i + " bits";
        } else {
            str = "Unexpected key length";
        }
        sb.append(str);
        if (algorithm != null) {
            str2 = " (for " + algorithm + " algorithm)";
        } else {
            str2 = "";
        }
        sb.append(str2);
        this.expectedLength = i;
        this.alg = algorithm;
    }

    public int getExpectedKeyLength() {
        return this.expectedLength;
    }

    public Algorithm getAlgorithm() {
        return this.alg;
    }
}
