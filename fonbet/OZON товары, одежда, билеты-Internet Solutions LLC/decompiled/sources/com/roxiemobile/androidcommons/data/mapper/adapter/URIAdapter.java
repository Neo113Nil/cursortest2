package com.roxiemobile.androidcommons.data.mapper.adapter;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;

/* loaded from: classes9.dex */
public class URIAdapter extends TypeAdapter<URI> {
    @Override // com.google.gson.TypeAdapter
    public final URI read(JsonReader jsonReader) throws IOException {
        return URI.create(jsonReader.nextString());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, URI uri) throws IOException {
        jsonWriter.value(uri.toString());
    }
}
