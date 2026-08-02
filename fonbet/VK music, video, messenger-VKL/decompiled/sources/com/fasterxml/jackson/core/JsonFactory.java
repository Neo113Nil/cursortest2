package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;
import xsna.byp0;
import xsna.cmb;
import xsna.cxx;
import xsna.dyp0;
import xsna.hu8;
import xsna.im8;
import xsna.ip70;
import xsna.jm8;
import xsna.jmi0;
import xsna.ju8;
import xsna.l9y;
import xsna.lj90;
import xsna.p3y0;
import xsna.tnv;
import xsna.tqo0;
import xsna.w7f0;

/* loaded from: classes12.dex */
public class JsonFactory extends TokenStreamFactory implements Serializable {
    public static final int d = Feature.j();
    public static final int e = JsonParser.Feature.h();
    public static final int f = JsonGenerator.Feature.h();
    public static final SerializedString g = DefaultPrettyPrinter.b;
    private static final long serialVersionUID = 2;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected int _maximumNonEscapedChar;
    protected ip70 _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final char _quoteChar;
    protected jmi0 _rootValueSeparator;
    protected StreamReadConstraints _streamReadConstraints;
    public final transient cmb b;
    public final transient hu8 c;

    public enum Feature implements cxx {
        INTERN_FIELD_NAMES,
        CANONICALIZE_FIELD_NAMES,
        FAIL_ON_SYMBOL_HASH_OVERFLOW,
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING,
        CHARSET_DETECTION;

        private final boolean _defaultState = true;

        Feature() {
        }

        public static int j() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature._defaultState) {
                    i |= feature.h();
                }
            }
            return i;
        }

        @Override // xsna.cxx
        public final int h() {
            return 1 << ordinal();
        }

        @Override // xsna.cxx
        public final boolean i() {
            return this._defaultState;
        }

        public final boolean k(int i) {
            return (i & h()) != 0;
        }
    }

    public JsonFactory() {
        long currentTimeMillis = System.currentTimeMillis();
        this.b = new cmb((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.c = new hu8((((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1);
        this._factoryFeatures = d;
        this._parserFeatures = e;
        this._generatorFeatures = f;
        this._rootValueSeparator = g;
        this._objectCodec = null;
        this._quoteChar = '\"';
        this._streamReadConstraints = StreamReadConstraints.b;
    }

    public final tnv a(ContentReference contentReference, boolean z) {
        im8 im8Var;
        SoftReference<im8> softReference;
        StreamReadConstraints streamReadConstraints = this._streamReadConstraints;
        if (Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.k(this._factoryFeatures)) {
            ThreadLocal<SoftReference<im8>> threadLocal = jm8.b;
            SoftReference<im8> softReference2 = threadLocal.get();
            im8Var = softReference2 == null ? null : softReference2.get();
            if (im8Var == null) {
                im8Var = new im8();
                tqo0 tqo0Var = jm8.a;
                if (tqo0Var != null) {
                    ReferenceQueue<im8> referenceQueue = tqo0Var.b;
                    softReference = new SoftReference<>(im8Var, referenceQueue);
                    ConcurrentHashMap concurrentHashMap = tqo0Var.a;
                    concurrentHashMap.put(softReference, Boolean.TRUE);
                    while (true) {
                        SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                        if (softReference3 == null) {
                            break;
                        }
                        concurrentHashMap.remove(softReference3);
                    }
                } else {
                    softReference = new SoftReference<>(im8Var);
                }
                threadLocal.set(softReference);
            }
        } else {
            im8Var = new im8();
        }
        return new tnv(streamReadConstraints, im8Var, contentReference, z);
    }

    public final p3y0 b(Writer writer, tnv tnvVar) throws IOException {
        p3y0 p3y0Var = new p3y0(tnvVar, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            if (i < 0) {
                i = 0;
            }
            p3y0Var.g = i;
        }
        jmi0 jmi0Var = this._rootValueSeparator;
        if (jmi0Var != g) {
            p3y0Var.h = jmi0Var;
        }
        return p3y0Var;
    }

    public final l9y c(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        tnv a = a(new ContentReference(true, outputStream), false);
        a.c = jsonEncoding;
        JsonEncoding jsonEncoding2 = JsonEncoding.UTF8;
        if (jsonEncoding != jsonEncoding2) {
            return b(jsonEncoding == jsonEncoding2 ? new dyp0(a, outputStream) : new OutputStreamWriter(outputStream, jsonEncoding.i()), a);
        }
        byp0 byp0Var = new byp0(a, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            byp0Var.g = i >= 0 ? i : 0;
        }
        jmi0 jmi0Var = this._rootValueSeparator;
        if (jmi0Var != g) {
            byp0Var.h = jmi0Var;
        }
        return byp0Var;
    }

    public final lj90 d(InputStream inputStream) throws IOException, JsonParseException {
        tnv a = a(new ContentReference(true, inputStream), false);
        try {
            return new ju8(a, inputStream).a(this._parserFeatures, this.c, this.b, this._factoryFeatures);
        } catch (IOException | RuntimeException e2) {
            if (a.d) {
                try {
                    inputStream.close();
                } catch (Exception e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    public final w7f0 e(Reader reader) throws IOException, JsonParseException {
        tnv a = a(new ContentReference(true, reader), false);
        int i = this._parserFeatures;
        int i2 = this._factoryFeatures;
        cmb cmbVar = this.b;
        return new w7f0(a, i, reader, new cmb(cmbVar, i2, cmbVar.c, cmbVar.b.get()));
    }

    public final w7f0 f(String str) throws IOException, JsonParseException {
        int length = str.length();
        if (length > 32768) {
            return e(new StringReader(str));
        }
        tnv a = a(new ContentReference(true, str), true);
        tnv.a(a.i);
        char[] a2 = a.e.a(0, length);
        a.i = a2;
        str.getChars(0, length, a2, 0);
        int i = this._parserFeatures;
        int i2 = this._factoryFeatures;
        cmb cmbVar = this.b;
        return new w7f0(a, i, new cmb(cmbVar, i2, cmbVar.c, cmbVar.b.get()), a2, length);
    }

    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public JsonFactory(JsonFactory jsonFactory, ip70 ip70Var) {
        long currentTimeMillis = System.currentTimeMillis();
        this.b = new cmb((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.c = new hu8((((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1);
        this._factoryFeatures = d;
        this._parserFeatures = e;
        this._generatorFeatures = f;
        this._rootValueSeparator = g;
        this._objectCodec = ip70Var;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        StreamReadConstraints streamReadConstraints = jsonFactory._streamReadConstraints;
        this._streamReadConstraints = streamReadConstraints == null ? StreamReadConstraints.b : streamReadConstraints;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
        this._quoteChar = jsonFactory._quoteChar;
    }
}
