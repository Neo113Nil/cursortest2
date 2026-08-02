package zendesk.core;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.q;
import ld.AbstractC5459a;

/* loaded from: classes5.dex */
class GsonSerializer implements Serializer {
    private static final String LOG_TAG = "GsonSerializer";
    private final Gson gson;

    public GsonSerializer(Gson gson) {
        this.gson = gson;
    }

    @Override // zendesk.core.Serializer
    public <E> E deserialize(Object obj, @NonNull Class<E> cls) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (!com.zendesk.util.d.a(str)) {
                return null;
            }
            try {
                return (E) this.gson.m(str, cls);
            } catch (q unused) {
                AbstractC5459a.b(LOG_TAG, "Unable to deserialize String into object of type %s", cls.getSimpleName());
                return null;
            }
        }
        if (!(obj instanceof h)) {
            AbstractC5459a.b(LOG_TAG, "Unable to deserialize the provided object into %s", cls.getSimpleName());
            return null;
        }
        try {
            return (E) this.gson.i((h) obj, cls);
        } catch (q e10) {
            AbstractC5459a.b(LOG_TAG, "Unable to deserialize JsonElement into object of type %s", cls.getSimpleName(), e10);
            return null;
        }
    }

    @Override // zendesk.core.Serializer
    public String serialize(Object obj) {
        return this.gson.v(obj);
    }
}
