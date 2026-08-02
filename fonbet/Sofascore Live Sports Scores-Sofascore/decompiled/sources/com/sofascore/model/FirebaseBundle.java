package com.sofascore.model;

import com.ironsource.U3;
import defpackage.iii;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007J\u0018\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0017J\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0017J\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0017R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n`\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/sofascore/model/FirebaseBundle;", "", "<init>", "()V", "longMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "doubleMap", "", "stringMap", "putBoolean", "", U3.i.W, U3.i.X, "", "putInt", "", "putLong", "putDouble", "putString", "getLongMap", "", "getDoubleMap", "getStringMap", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseBundle {

    @NotNull
    private final HashMap<String, Long> longMap = new HashMap<>();

    @NotNull
    private final HashMap<String, Double> doubleMap = new HashMap<>();

    @NotNull
    private final HashMap<String, String> stringMap = new HashMap<>();

    @NotNull
    public final Map<String, Double> getDoubleMap() {
        return this.doubleMap;
    }

    @NotNull
    public final Map<String, Long> getLongMap() {
        return this.longMap;
    }

    @NotNull
    public final Map<String, String> getStringMap() {
        return this.stringMap;
    }

    public final void putBoolean(@NotNull String key, boolean value) {
        key.getClass();
        putLong(key, value ? 1L : 0L);
    }

    public final void putDouble(@NotNull String key, double value) {
        key.getClass();
        this.doubleMap.put(key, Double.valueOf(value));
    }

    public final void putInt(@NotNull String key, int value) {
        key.getClass();
        putLong(key, value);
    }

    public final void putLong(@NotNull String key, long value) {
        key.getClass();
        this.longMap.put(key, Long.valueOf(value));
    }

    public final void putString(@NotNull String key, @Nullable String value) {
        key.getClass();
        if (value != null) {
            this.stringMap.put(key, iii.H(100, value));
        }
    }
}
