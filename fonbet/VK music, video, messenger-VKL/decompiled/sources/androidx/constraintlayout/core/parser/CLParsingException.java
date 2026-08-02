package androidx.constraintlayout.core.parser;

import xsna.yu8;

/* loaded from: classes11.dex */
public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String str, yu8 yu8Var) {
        super(str);
        this.mReason = str;
        if (yu8Var != null) {
            this.mElementClass = yu8Var.l();
            this.mLineNumber = 0;
        } else {
            this.mElementClass = "unknown";
            this.mLineNumber = 0;
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.mReason + " (" + this.mElementClass + " at line " + this.mLineNumber + ")");
        return sb.toString();
    }
}
