package com.vk.clips.internal.nps.api.model;

import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.cjl0;
import xsna.epx;
import xsna.jgp;
import xsna.urd0;

/* compiled from: InternalNpsQuestions.kt */
/* loaded from: classes16.dex */
public final class InternalNpsQuestions extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<InternalNpsQuestions> CREATOR = new a();
    public final String b;
    public final String c;
    public final Map<String, InternalNpsQuestion> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<InternalNpsQuestions> {
        @Override // com.vk.core.serialize.Serializer.c
        public final InternalNpsQuestions a(Serializer serializer) {
            return new InternalNpsQuestions(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InternalNpsQuestions[i];
        }
    }

    public InternalNpsQuestions(String str, String str2, Map<String, InternalNpsQuestion> map) {
        this.b = str;
        this.c = str2;
        this.d = map;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        Map<String, InternalNpsQuestion> map = this.d;
        if (map == null) {
            serializer.S(-1);
            return;
        }
        Iterator c = n.c(serializer, map);
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            serializer.j0((String) entry.getKey());
            serializer.i0((Serializer.StreamParcelable) entry.getValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalNpsQuestions)) {
            return false;
        }
        InternalNpsQuestions internalNpsQuestions = (InternalNpsQuestions) obj;
        return epx.f(this.b, internalNpsQuestions.b) && epx.f(this.c, internalNpsQuestions.c) && epx.f(this.d, internalNpsQuestions.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalNpsQuestions(id=");
        sb.append(this.b);
        sb.append(", startQuestionCode=");
        sb.append(this.c);
        sb.append(", questions=");
        return cjl0.a(sb, this.d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InternalNpsQuestions(Serializer serializer) {
        this(r0, r1, r3);
        Map map;
        String H = serializer.H();
        String H2 = serializer.H();
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        try {
            int u = serializer.u();
            if (u >= 0) {
                map = new LinkedHashMap();
                for (int i = 0; i < u; i++) {
                    String H3 = serializer.H();
                    InternalNpsQuestion internalNpsQuestion = (InternalNpsQuestion) serializer.G(InternalNpsQuestion.class.getClassLoader());
                    if (H3 != null && internalNpsQuestion != null) {
                        map.put(H3, internalNpsQuestion);
                    }
                }
            } else {
                map = jgp.b;
            }
        } finally {
        }
    }
}
