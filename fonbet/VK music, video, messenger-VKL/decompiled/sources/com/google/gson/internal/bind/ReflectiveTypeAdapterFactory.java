package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import xsna.btj0;
import xsna.gpf0;
import xsna.jp70;
import xsna.qaq;
import xsna.rtp0;
import xsna.u6j;
import xsna.w6q0;
import xsna.x2q;

/* loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements rtp0 {
    public final u6j b;
    public final FieldNamingStrategy c;
    public final Excluder d;
    public final List<ReflectionAccessFilter> e;

    public static final class Adapter<T> extends TypeAdapter<T> {
        public final jp70<T> a;
        public final LinkedHashMap b;

        public Adapter(jp70 jp70Var, LinkedHashMap linkedHashMap) {
            this.a = jp70Var;
            this.b = linkedHashMap;
        }

        @Override // com.google.gson.TypeAdapter
        public final T b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T h = this.a.h();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    a aVar = (a) this.b.get(jsonReader.nextName());
                    if (aVar != null && aVar.c) {
                        aVar.a(h, jsonReader);
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return h;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator it = this.b.values().iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b(jsonWriter, t);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.9.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            }
        }
    }

    public static abstract class a {
        public final String a;
        public final boolean b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public abstract void a(Object obj, JsonReader jsonReader) throws IOException, IllegalAccessException;

        public abstract void b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(u6j u6jVar, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<ReflectionAccessFilter> list) {
        this.b = u6jVar;
        this.c = fieldNamingStrategy;
        this.d = excluder;
        this.e = list;
    }

    public static void b(Object obj, Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            obj = null;
        }
        if (gpf0.a.a.a(field, obj)) {
            return;
        }
        throw new JsonIOException("Field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter.");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // xsna.rtp0
    public final <T> com.google.gson.TypeAdapter<T> a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public final boolean c(Field field, boolean z) {
        Class<?> type = field.getType();
        Excluder excluder = this.d;
        if (excluder.f(type) || excluder.g(type, z) || (excluder.c & field.getModifiers()) != 0) {
            return false;
        }
        if (excluder.b != -1.0d) {
            btj0 btj0Var = (btj0) field.getAnnotation(btj0.class);
            w6q0 w6q0Var = (w6q0) field.getAnnotation(w6q0.class);
            if (btj0Var != null && btj0Var.value() > excluder.b) {
                return false;
            }
            if (w6q0Var != null && w6q0Var.value() <= excluder.b) {
                return false;
            }
        }
        if (field.isSynthetic()) {
            return false;
        }
        if (excluder.e) {
            qaq qaqVar = (qaq) field.getAnnotation(qaq.class);
            if (qaqVar == null) {
                return false;
            }
            if (z) {
                if (!qaqVar.serialize()) {
                    return false;
                }
            } else if (!qaqVar.deserialize()) {
                return false;
            }
        }
        if (!excluder.d) {
            Class<?> type2 = field.getType();
            if (type2.isMemberClass() && (type2.getModifiers() & 8) == 0) {
                return false;
            }
        }
        if (Excluder.h(field.getType())) {
            return false;
        }
        List<x2q> list = z ? excluder.f : excluder.g;
        if (list.isEmpty()) {
            return true;
        }
        Iterator<x2q> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return false;
            }
        }
        return true;
    }
}
