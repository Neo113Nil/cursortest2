package com.google.common.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k COLLECTED;
    public static final k EXPIRED;
    public static final k EXPLICIT;
    public static final k REPLACED;
    public static final k SIZE;

    static {
        k kVar = new k() { // from class: com.google.common.cache.k.a
            @Override // com.google.common.cache.k
            final boolean a() {
                return false;
            }
        };
        EXPLICIT = kVar;
        k kVar2 = new k() { // from class: com.google.common.cache.k.b
            @Override // com.google.common.cache.k
            final boolean a() {
                return false;
            }
        };
        REPLACED = kVar2;
        k kVar3 = new k() { // from class: com.google.common.cache.k.c
            @Override // com.google.common.cache.k
            final boolean a() {
                return true;
            }
        };
        COLLECTED = kVar3;
        k kVar4 = new k() { // from class: com.google.common.cache.k.d
            @Override // com.google.common.cache.k
            final boolean a() {
                return true;
            }
        };
        EXPIRED = kVar4;
        k kVar5 = new k() { // from class: com.google.common.cache.k.e
            @Override // com.google.common.cache.k
            final boolean a() {
                return true;
            }
        };
        SIZE = kVar5;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4, kVar5};
    }

    private k() {
        throw null;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    abstract boolean a();
}
