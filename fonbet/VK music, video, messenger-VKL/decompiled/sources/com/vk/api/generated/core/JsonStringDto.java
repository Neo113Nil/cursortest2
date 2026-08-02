package com.vk.api.generated.core;

import xsna.a9y;
import xsna.b9y;
import xsna.bay;
import xsna.epx;
import xsna.hay;
import xsna.ho8;
import xsna.tay;
import xsna.uay;
import xsna.z8y;

/* compiled from: JsonStringDto.kt */
/* loaded from: classes.dex */
public final class JsonStringDto {
    public final String a;

    /* compiled from: JsonStringDto.kt */
    public static final class Deserializer implements a9y<JsonStringDto>, uay<JsonStringDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            return new JsonStringDto(b9yVar.k());
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            return new hay(((JsonStringDto) obj).a);
        }
    }

    public JsonStringDto(String str) {
        this.a = str;
        bay.e(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JsonStringDto) && epx.f(this.a, ((JsonStringDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("JsonStringDto(rawValue="), this.a, ')');
    }
}
