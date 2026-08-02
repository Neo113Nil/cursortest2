package io.sentry.util.network;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes9.dex */
public final class NetworkBody {
    private final Object body;
    private final List<NetworkBodyWarning> warnings;

    public NetworkBody(Object obj) {
        this(obj, null);
    }

    public NetworkBody(Object obj, List<NetworkBodyWarning> list) {
        this.body = obj;
        this.warnings = list;
    }

    public Object getBody() {
        return this.body;
    }

    public List<NetworkBodyWarning> getWarnings() {
        return this.warnings;
    }

    public enum NetworkBodyWarning {
        JSON_TRUNCATED("JSON_TRUNCATED"),
        TEXT_TRUNCATED("TEXT_TRUNCATED"),
        INVALID_JSON("INVALID_JSON"),
        BODY_PARSE_ERROR("BODY_PARSE_ERROR");

        private final String value;

        NetworkBodyWarning(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public String toString() {
        return "NetworkBody{body=" + this.body + ", warnings=" + this.warnings + AbstractJsonLexerKt.END_OBJ;
    }
}
