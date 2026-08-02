package com.nimbusds.jose.shaded.gson.internal.bind;

import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.JsonDeserializer;
import com.nimbusds.jose.shaded.gson.JsonSerializer;
import com.nimbusds.jose.shaded.gson.TypeAdapter;
import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.annotations.JsonAdapter;
import com.nimbusds.jose.shaded.gson.internal.ConstructorConstructor;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;

/* loaded from: classes8.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (TypeAdapter<T>) getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter);
    }

    TypeAdapter<?> getTypeAdapter(ConstructorConstructor constructorConstructor, Gson gson, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
        TypeAdapter<?> typeAdapter;
        Object construct = constructorConstructor.get(TypeToken.get((Class) jsonAdapter.value())).construct();
        boolean nullSafe = jsonAdapter.nullSafe();
        if (construct instanceof TypeAdapter) {
            typeAdapter = (TypeAdapter) construct;
        } else if (construct instanceof TypeAdapterFactory) {
            typeAdapter = ((TypeAdapterFactory) construct).create(gson, typeToken);
        } else {
            boolean z = construct instanceof JsonSerializer;
            if (z || (construct instanceof JsonDeserializer)) {
                TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z ? (JsonSerializer) construct : null, construct instanceof JsonDeserializer ? (JsonDeserializer) construct : null, gson, typeToken, null, nullSafe);
                nullSafe = false;
                typeAdapter = treeTypeAdapter;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + construct.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (typeAdapter == null || !nullSafe) ? typeAdapter : typeAdapter.nullSafe();
    }
}
