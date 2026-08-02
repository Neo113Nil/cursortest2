package com.google.gson;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum a extends h {
    public a() {
        super("IDENTITY", 0);
    }

    @Override // com.google.gson.h
    public final String b(Field field) {
        return field.getName();
    }
}
