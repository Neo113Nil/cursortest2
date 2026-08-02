package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.SerializedString;
import java.io.Serializable;
import xsna.jmi0;

/* loaded from: classes12.dex */
public class DefaultPrettyPrinter implements Serializable {
    public static final SerializedString b = new SerializedString(" ");
    private static final long serialVersionUID = 1;
    protected a _arrayIndenter;
    protected String _objectFieldValueSeparatorWithSpaces;
    protected a _objectIndenter;
    protected final jmi0 _rootSeparator;
    protected Separators _separators;
    protected boolean _spacesInObjectEntries;

    public interface a {
    }
}
