package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes3.dex */
public abstract class TypeAdapter {
    public final Object fromJson(Reader reader) {
        return read(new Jb.a(reader));
    }

    public final Object fromJsonTree(h hVar) {
        try {
            return read(new com.google.gson.internal.bind.a(hVar));
        } catch (IOException e10) {
            throw new i(e10);
        }
    }

    public final TypeAdapter nullSafe() {
        return new TypeAdapter() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public Object read(Jb.a aVar) {
                if (aVar.Y1() != Jb.b.NULL) {
                    return TypeAdapter.this.read(aVar);
                }
                aVar.n1();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(Jb.c cVar, Object obj) {
                if (obj == null) {
                    cVar.T1();
                } else {
                    TypeAdapter.this.write(cVar, obj);
                }
            }
        };
    }

    public abstract Object read(Jb.a aVar);

    public final void toJson(Writer writer, Object obj) {
        write(new Jb.c(writer), obj);
    }

    public final h toJsonTree(Object obj) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            write(bVar, obj);
            return bVar.n2();
        } catch (IOException e10) {
            throw new i(e10);
        }
    }

    public abstract void write(Jb.c cVar, Object obj);

    public final Object fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new i(e10);
        }
    }
}
