package com.nimbusds.jose.shaded.gson;

import com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes8.dex */
public enum ToNumberPolicy implements ToNumberStrategy {
    DOUBLE { // from class: com.nimbusds.jose.shaded.gson.ToNumberPolicy.1
        @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
        public Double readNumber(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.nimbusds.jose.shaded.gson.ToNumberPolicy.2
        @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
        public Number readNumber(JsonReader jsonReader) throws IOException {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE { // from class: com.nimbusds.jose.shaded.gson.ToNumberPolicy.3
        @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
        public Number readNumber(JsonReader jsonReader) throws IOException, JsonParseException {
            String nextString = jsonReader.nextString();
            try {
                try {
                    return Long.valueOf(Long.parseLong(nextString));
                } catch (NumberFormatException unused) {
                    Double valueOf = Double.valueOf(nextString);
                    if ((!valueOf.isInfinite() && !valueOf.isNaN()) || jsonReader.isLenient()) {
                        return valueOf;
                    }
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                }
            } catch (NumberFormatException e) {
                throw new JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPreviousPath(), e);
            }
        }
    },
    BIG_DECIMAL { // from class: com.nimbusds.jose.shaded.gson.ToNumberPolicy.4
        @Override // com.nimbusds.jose.shaded.gson.ToNumberStrategy
        public BigDecimal readNumber(JsonReader jsonReader) throws IOException {
            String nextString = jsonReader.nextString();
            try {
                return new BigDecimal(nextString);
            } catch (NumberFormatException e) {
                throw new JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPreviousPath(), e);
            }
        }
    }
}
