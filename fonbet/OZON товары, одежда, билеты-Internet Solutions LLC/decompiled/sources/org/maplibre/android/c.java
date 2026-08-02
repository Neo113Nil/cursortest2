package org.maplibre.android;

/* loaded from: classes10.dex */
public final class c extends RuntimeException {
    c(String str) {
        super("Map detected an error that would fail silently otherwise: ".concat(str));
    }
}
