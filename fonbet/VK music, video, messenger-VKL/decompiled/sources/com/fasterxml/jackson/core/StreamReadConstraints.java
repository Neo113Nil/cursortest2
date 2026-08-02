package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.Serializable;

/* loaded from: classes12.dex */
public class StreamReadConstraints implements Serializable {
    public static final StreamReadConstraints b = new StreamReadConstraints();
    private static final long serialVersionUID = 1;
    protected final int _maxNestingDepth = 1000;
    protected final int _maxNumLen = 1000;
    protected final int _maxStringLen = 5000000;

    public final void a(int i) throws StreamConstraintsException {
        if (i > this._maxNumLen) {
            throw new StreamConstraintsException(String.format("Number length (%d) exceeds the maximum length (%d)", Integer.valueOf(i), Integer.valueOf(this._maxNumLen)));
        }
    }

    public final void b(int i) throws StreamConstraintsException {
        if (i > this._maxNumLen) {
            throw new StreamConstraintsException(String.format("Number length (%d) exceeds the maximum length (%d)", Integer.valueOf(i), Integer.valueOf(this._maxNumLen)));
        }
    }

    public final void c(int i) throws StreamConstraintsException {
        if (i > this._maxNestingDepth) {
            throw new StreamConstraintsException(String.format("Depth (%d) exceeds the maximum allowed nesting depth (%d)", Integer.valueOf(i), Integer.valueOf(this._maxNestingDepth)));
        }
    }

    public final void d(int i) throws StreamConstraintsException {
        if (i > this._maxStringLen) {
            throw new StreamConstraintsException(String.format("String length (%d) exceeds the maximum length (%d)", Integer.valueOf(i), Integer.valueOf(this._maxStringLen)));
        }
    }
}
