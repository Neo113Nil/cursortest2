package com.google.gson;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class JsonObject extends JsonElement {
    private final com.google.gson.internal.l<String, JsonElement> members = new com.google.gson.internal.l<>(false);

    public void add(String str, JsonElement jsonElement) {
        com.google.gson.internal.l<String, JsonElement> lVar = this.members;
        if (jsonElement == null) {
            jsonElement = k.f60021a;
        }
        lVar.put(str, jsonElement);
    }

    public void addProperty(String str, String str2) {
        add(str, str2 == null ? k.f60021a : new JsonPrimitive(str2));
    }

    public Map<String, JsonElement> asMap() {
        return this.members;
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.members.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonObject) && ((JsonObject) obj).members.equals(this.members);
        }
        return true;
    }

    public JsonElement get(String str) {
        return this.members.get(str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.members.get(str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.members.get(str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.members.get(str);
    }

    public boolean has(String str) {
        return this.members.containsKey(str);
    }

    public int hashCode() {
        return this.members.hashCode();
    }

    public boolean isEmpty() {
        return this.members.isEmpty();
    }

    public Set<String> keySet() {
        return this.members.keySet();
    }

    public JsonElement remove(String str) {
        return this.members.remove(str);
    }

    public int size() {
        return this.members.size();
    }

    public void addProperty(String str, Number number) {
        add(str, number == null ? k.f60021a : new JsonPrimitive(number));
    }

    @Override // com.google.gson.JsonElement
    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<String, JsonElement> entry : this.members.entrySet()) {
            jsonObject.add(entry.getKey(), entry.getValue().deepCopy());
        }
        return jsonObject;
    }

    public void addProperty(String str, Boolean bool) {
        add(str, bool == null ? k.f60021a : new JsonPrimitive(bool));
    }

    public void addProperty(String str, Character ch2) {
        add(str, ch2 == null ? k.f60021a : new JsonPrimitive(ch2));
    }
}
