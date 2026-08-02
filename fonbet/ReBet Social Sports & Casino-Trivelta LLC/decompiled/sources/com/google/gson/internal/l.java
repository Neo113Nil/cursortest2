package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.q;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class l {
    public static com.google.gson.h a(Jb.a aVar) {
        boolean z10;
        try {
            try {
                aVar.Y1();
                z10 = false;
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            try {
                return (com.google.gson.h) TypeAdapters.f38204V.read(aVar);
            } catch (EOFException e11) {
                e = e11;
                if (z10) {
                    return com.google.gson.j.f38328a;
                }
                throw new q(e);
            }
        } catch (Jb.d e12) {
            throw new q(e12);
        } catch (IOException e13) {
            throw new com.google.gson.i(e13);
        } catch (NumberFormatException e14) {
            throw new q(e14);
        }
    }

    public static void b(com.google.gson.h hVar, Jb.c cVar) {
        TypeAdapters.f38204V.write(cVar, hVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    public static final class b extends Writer {

        /* renamed from: a, reason: collision with root package name */
        public final Appendable f38307a;

        /* renamed from: b, reason: collision with root package name */
        public final a f38308b = new a();

        public static class a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            public String f38309a;
            private char[] chars;

            public a() {
            }

            public void a(char[] cArr) {
                this.chars = cArr;
                this.f38309a = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.chars[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.chars.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.chars, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f38309a == null) {
                    this.f38309a = new String(this.chars);
                }
                return this.f38309a;
            }
        }

        public b(Appendable appendable) {
            this.f38307a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            this.f38308b.a(cArr);
            this.f38307a.append(this.f38308b, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            this.f38307a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.f38307a.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) {
            this.f38307a.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) {
            Objects.requireNonNull(str);
            this.f38307a.append(str, i10, i11 + i10);
        }
    }
}
