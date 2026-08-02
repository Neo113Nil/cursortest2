package io.ably.lib.push;

/* loaded from: classes9.dex */
public interface Storage {
    void clear(String[] strArr);

    int get(String str, int i);

    String get(String str, String str2);

    void put(String str, int i);

    void put(String str, String str2);
}
