package org.maplibre.geojson;

import androidx.annotation.Keep;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

@Keep
/* loaded from: classes10.dex */
class ListOfDoublesCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Double>> {
    ListOfDoublesCoordinatesTypeAdapter() {
    }

    @Override // com.google.gson.TypeAdapter
    public List<Double> read(JsonReader jsonReader) throws IOException {
        return readPointList(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, List<Double> list) throws IOException {
        writePointList(jsonWriter, list);
    }
}
