package com.vk.media.pipeline.stat;

import android.util.Size;
import com.vk.media.pipeline.model.stat.TranscodeType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import xsna.asp;
import xsna.j5g;
import xsna.ncl;
import xsna.uzf;
import xsna.zrp;
import xsna.zu10;

/* compiled from: ErrorStatBuilder.kt */
/* loaded from: classes3.dex */
public final class ErrorStatBuilder {
    public Object a;
    public String b;
    public String d;
    public ncl.a m;
    public ncl.b n;
    public String o;
    public String p;
    public String q;
    public final ArrayList<String> c = new ArrayList<>();
    public int e = -1;
    public Size f = new Size(0, 0);
    public int g = -1;
    public int h = -1;
    public final HashSet<String> i = new HashSet<>();
    public final ArrayList<Long> j = new ArrayList<>();
    public final HashSet<String> k = new HashSet<>();
    public TranscodeType l = TranscodeType.NONE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorStatBuilder.kt */
    public static final class EmptySampleDataOrigin {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EmptySampleDataOrigin[] $VALUES;
        public static final EmptySampleDataOrigin DECODER;
        public static final EmptySampleDataOrigin ENCODER;
        public static final EmptySampleDataOrigin EXTRACTOR;

        static {
            EmptySampleDataOrigin emptySampleDataOrigin = new EmptySampleDataOrigin("EXTRACTOR", 0);
            EXTRACTOR = emptySampleDataOrigin;
            EmptySampleDataOrigin emptySampleDataOrigin2 = new EmptySampleDataOrigin("DECODER", 1);
            DECODER = emptySampleDataOrigin2;
            EmptySampleDataOrigin emptySampleDataOrigin3 = new EmptySampleDataOrigin("ENCODER", 2);
            ENCODER = emptySampleDataOrigin3;
            EmptySampleDataOrigin[] emptySampleDataOriginArr = {emptySampleDataOrigin, emptySampleDataOrigin2, emptySampleDataOrigin3};
            $VALUES = emptySampleDataOriginArr;
            $ENTRIES = new asp(emptySampleDataOriginArr);
        }

        public EmptySampleDataOrigin() {
            throw null;
        }

        public static EmptySampleDataOrigin valueOf(String str) {
            return (EmptySampleDataOrigin) Enum.valueOf(EmptySampleDataOrigin.class, str);
        }

        public static EmptySampleDataOrigin[] values() {
            return (EmptySampleDataOrigin[]) $VALUES.clone();
        }
    }

    public final void a(String str, int i, Integer num, Integer num2, long j) {
        if (str != null) {
            this.i.add(str);
        }
        this.e = Math.max(this.e, i);
        if (num != null) {
            this.h = Math.max(this.h, num.intValue());
        }
        if (num2 != null) {
            this.g = Math.max(this.g, num2.intValue());
        }
        this.j.add(Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    public final zu10 b(Throwable th) {
        Object obj = this.a;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = Collections.EMPTY_LIST;
        }
        ?? r3 = obj2;
        String str = this.b;
        ncl.a aVar = this.m;
        String uzfVar = aVar != null ? ((uzf) aVar.invoke()).toString() : null;
        String str2 = this.d;
        ncl.b bVar = this.n;
        return new zu10(th, r3, str, uzfVar, this.c, str2, bVar != null ? ((uzf) bVar.invoke()).toString() : null, this.e, this.f.toString(), this.g, this.h, this.i, this.j, j5g.g0(this.k, ", ", null, null, 0, null, 62), this.l, this.o, this.p, this.q);
    }
}
