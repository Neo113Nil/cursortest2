package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    private static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final StringBuilder f59999a;

        /* renamed from: b, reason: collision with root package name */
        private final C0912a f60000b = new C0912a();

        /* renamed from: com.google.gson.internal.r$a$a, reason: collision with other inner class name */
        private static class C0912a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            private char[] f60001a;

            /* renamed from: b, reason: collision with root package name */
            private String f60002b;

            final void a(char[] cArr) {
                this.f60001a = cArr;
                this.f60002b = null;
            }

            @Override // java.lang.CharSequence
            public final char charAt(int i11) {
                return this.f60001a[i11];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.f60001a.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i11, int i12) {
                return new String(this.f60001a, i11, i12 - i11);
            }

            @Override // java.lang.CharSequence
            public final String toString() {
                if (this.f60002b == null) {
                    this.f60002b = new String(this.f60001a);
                }
                return this.f60002b;
            }
        }

        a(StringBuilder sb2) {
            this.f59999a = sb2;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence) throws IOException {
            this.f59999a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i11, int i12) throws IOException {
            C0912a c0912a = this.f60000b;
            c0912a.a(cArr);
            this.f59999a.append((CharSequence) c0912a, i11, i12 + i11);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            this.f59999a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Writer append(CharSequence charSequence, int i11, int i12) throws IOException {
            this.f59999a.append(charSequence, i11, i12);
            return this;
        }

        @Override // java.io.Writer
        public final void write(int i11) throws IOException {
            this.f59999a.append((char) i11);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i11, int i12) throws IOException {
            this.f59999a.append(charSequence, i11, i12);
            return this;
        }

        @Override // java.io.Writer
        public final void write(String str, int i11, int i12) throws IOException {
            Objects.requireNonNull(str);
            this.f59999a.append((CharSequence) str, i11, i12 + i11);
        }
    }

    public static JsonElement a(JsonReader jsonReader) throws com.google.gson.l {
        boolean z11;
        try {
            try {
                jsonReader.peek();
                z11 = false;
            } catch (EOFException e11) {
                e = e11;
                z11 = true;
            }
            try {
                return TypeAdapters.f59924z.read(jsonReader);
            } catch (EOFException e12) {
                e = e12;
                if (z11) {
                    return com.google.gson.k.f60021a;
                }
                throw new com.google.gson.n(e);
            }
        } catch (MalformedJsonException e13) {
            throw new com.google.gson.n(e13);
        } catch (IOException e14) {
            throw new com.google.gson.j(e14);
        } catch (NumberFormatException e15) {
            throw new com.google.gson.n(e15);
        }
    }

    public static void b(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.f59924z.write(jsonWriter, jsonElement);
    }

    public static Writer c(StringBuilder sb2) {
        return new a(sb2);
    }
}
