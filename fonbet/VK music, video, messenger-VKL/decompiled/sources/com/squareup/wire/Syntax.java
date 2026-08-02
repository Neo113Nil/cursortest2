package com.squareup.wire;

import xsna.epx;
import xsna.zcl;

/* compiled from: Syntax.kt */
/* loaded from: classes14.dex */
public enum Syntax {
    PROTO_2("proto2"),
    PROTO_3("proto3");

    public static final Companion Companion = new Companion(null);
    private final String string;

    /* compiled from: Syntax.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Syntax get(String str) {
            Syntax[] values = Syntax.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                Syntax syntax = values[i];
                i++;
                if (epx.f(syntax.string, str)) {
                    return syntax;
                }
            }
            throw new IllegalArgumentException(epx.j(str, "unexpected syntax: "));
        }

        private Companion() {
        }
    }

    Syntax(String str) {
        this.string = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.string;
    }
}
