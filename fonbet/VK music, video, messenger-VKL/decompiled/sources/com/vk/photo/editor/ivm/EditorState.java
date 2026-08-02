package com.vk.photo.editor.ivm;

import com.vk.photo.editor.ivm.EditorMessage;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.asp;
import xsna.epx;
import xsna.f5p;
import xsna.fw3;
import xsna.g5p;
import xsna.i470;
import xsna.i4p;
import xsna.jgp;
import xsna.nwx;
import xsna.pn00;
import xsna.qoy;
import xsna.v11;
import xsna.zrp;

/* compiled from: EditorState.kt */
/* loaded from: classes4.dex */
public final class EditorState implements nwx {
    public final i4p a;
    public final Map<f5p, g5p> b;
    public final b c;
    public final List<b> d;
    public final EditorMessage.Source e;
    public final a f;
    public final ErrorType g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EditorState.kt */
    public static final class ErrorType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType LowMemoryError;
        public static final ErrorType RenderError;

        static {
            ErrorType errorType = new ErrorType("LowMemoryError", 0);
            LowMemoryError = errorType;
            ErrorType errorType2 = new ErrorType("RenderError", 1);
            RenderError = errorType2;
            ErrorType[] errorTypeArr = {errorType, errorType2};
            $VALUES = errorTypeArr;
            $ENTRIES = new asp(errorTypeArr);
        }

        public ErrorType() {
            throw null;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    /* compiled from: EditorState.kt */
    public static final class a {
        public final boolean a;
        public final b b;
        public final b c;

        public a(boolean z, b bVar, b bVar2) {
            this.a = z;
            this.b = bVar;
            this.c = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            return "HistoryEvent(isUndo=" + this.a + ", fromRecord=" + this.b + ", toRecord=" + this.c + ")";
        }
    }

    /* compiled from: EditorState.kt */
    public static final class b {
        public final i4p a;
        public final f5p b;
        public final Map<f5p, g5p> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(i4p i4pVar, f5p f5pVar, Map<f5p, ? extends g5p> map) {
            this.a = i4pVar;
            this.b = f5pVar;
            this.c = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            i4p i4pVar = this.a;
            return this.c.hashCode() + ((this.b.hashCode() + ((i4pVar == null ? 0 : i4pVar.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            return "HistoryRecord(imageState=" + this.a + ", contextToolId=" + this.b + ", params=" + this.c + ")";
        }
    }

    public EditorState() {
        this(null, null, null, 255);
    }

    public static EditorState a(EditorState editorState, i4p i4pVar, Map map, b bVar, List list, EditorMessage.Source source, a aVar, ErrorType errorType, int i) {
        if ((i & 1) != 0) {
            i4pVar = editorState.a;
        }
        i4p i4pVar2 = i4pVar;
        if ((i & 2) != 0) {
            map = editorState.b;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            bVar = editorState.c;
        }
        b bVar2 = bVar;
        if ((i & 8) != 0) {
            list = editorState.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            source = editorState.e;
        }
        EditorMessage.Source source2 = source;
        if ((i & 32) != 0) {
            aVar = editorState.f;
        }
        a aVar2 = aVar;
        editorState.getClass();
        if ((i & 128) != 0) {
            errorType = editorState.g;
        }
        editorState.getClass();
        return new EditorState(i4pVar2, map2, bVar2, list2, source2, aVar2, errorType);
    }

    public final int b() {
        Iterator<b> it = this.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() == this.c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean c() {
        return b() < this.d.size() - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorState)) {
            return false;
        }
        EditorState editorState = (EditorState) obj;
        return epx.f(this.a, editorState.a) && epx.f(this.b, editorState.b) && epx.f(this.c, editorState.c) && epx.f(this.d, editorState.d) && this.e == editorState.e && epx.f(this.f, editorState.f) && this.g == editorState.g;
    }

    public final int hashCode() {
        i4p i4pVar = this.a;
        int hashCode = (this.e.hashCode() + fw3.a((this.c.hashCode() + v11.a((i4pVar == null ? 0 : i4pVar.hashCode()) * 31, 31, this.b)) * 31, 31, this.d)) * 31;
        a aVar = this.f;
        int b2 = qoy.b((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, false);
        ErrorType errorType = this.g;
        return b2 + (errorType != null ? errorType.hashCode() : 0);
    }

    public final String toString() {
        return "EditorState(imageState=" + this.a + ", toolParams=" + this.b + ", currentHistoryRecord=" + this.c + ", history=" + this.d + ", messageSource=" + this.e + ", historyEvent=" + this.f + ", forceFlag=false, error=" + this.g + ")";
    }

    public EditorState(i4p i4pVar, Map map, b bVar, List list, EditorMessage.Source source, a aVar, ErrorType errorType) {
        this.a = i4pVar;
        this.b = map;
        this.c = bVar;
        this.d = list;
        this.e = source;
        this.f = aVar;
        this.g = errorType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditorState(i4p i4pVar, Map map, EditorMessage.Source source, int i) {
        this(r1, r2, r3, Collections.singletonList(r3), (i & 16) != 0 ? EditorMessage.Source.Synthetic : source, null, null);
        i4p i4pVar2 = (i & 1) != 0 ? null : i4pVar;
        Map map2 = (i & 2) != 0 ? jgp.b : map;
        b bVar = new b(i4pVar2, i470.a, pn00.t(map2));
    }
}
