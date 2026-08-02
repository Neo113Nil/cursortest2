package com.google.gson.stream;

import Am.C2438a;
import Ej.b;
import Ij.C3261b;
import com.google.gson.internal.bind.a;
import com.google.gson.internal.j;
import com.google.gson.internal.s;
import com.google.gson.q;
import g.C6594f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class JsonReader implements Closeable {
    static final int BUFFER_SIZE = 1024;
    static final int DEFAULT_NESTING_LIMIT = 255;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final Reader in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int[] stack;
    private q strictness = q.LEGACY_STRICT;
    private int nestingLimit = DEFAULT_NESTING_LIMIT;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    static {
        j.INSTANCE = new j() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.j
            public void promoteNameToValue(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof a) {
                    ((a) jsonReader).o();
                    return;
                }
                int i11 = jsonReader.peeked;
                if (i11 == 0) {
                    i11 = jsonReader.doPeek();
                }
                if (i11 == 13) {
                    jsonReader.peeked = 9;
                } else if (i11 == 12) {
                    jsonReader.peeked = 8;
                } else {
                    if (i11 != 14) {
                        throw jsonReader.unexpectedTokenError("a name");
                    }
                    jsonReader.peeked = 10;
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.in = reader;
    }

    private void checkLenient() throws MalformedJsonException {
        if (this.strictness != q.LENIENT) {
            throw syntaxError("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() throws IOException {
        nextNonWhitespace(true);
        int i11 = this.pos;
        this.pos = i11 - 1;
        if (i11 + 4 <= this.limit || fillBuffer(5)) {
            int i12 = this.pos;
            char[] cArr = this.buffer;
            if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                this.pos = i12 + 5;
            }
        }
    }

    private boolean fillBuffer(int i11) throws IOException {
        int i12;
        int i13;
        char[] cArr = this.buffer;
        int i14 = this.lineStart;
        int i15 = this.pos;
        this.lineStart = i14 - i15;
        int i16 = this.limit;
        if (i16 != i15) {
            int i17 = i16 - i15;
            this.limit = i17;
            System.arraycopy(cArr, i15, cArr, 0, i17);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.in;
            int i18 = this.limit;
            int read = reader.read(cArr, i18, cArr.length - i18);
            if (read == -1) {
                return false;
            }
            i12 = this.limit + read;
            this.limit = i12;
            if (this.lineNumber == 0 && (i13 = this.lineStart) == 0 && i12 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i13 + 1;
                i11++;
            }
        } while (i12 < i11);
        return true;
    }

    private String getPath(boolean z11) {
        StringBuilder sb2 = new StringBuilder("$");
        int i11 = 0;
        while (true) {
            int i12 = this.stackSize;
            if (i11 >= i12) {
                return sb2.toString();
            }
            int i13 = this.stack[i11];
            switch (i13) {
                case 1:
                case 2:
                    int i14 = this.pathIndices[i11];
                    if (z11 && i14 > 0 && i11 == i12 - 1) {
                        i14--;
                    }
                    sb2.append('[');
                    sb2.append(i14);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.pathNames[i11];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(b.a(i13, "Unknown scope value: "));
            }
            i11++;
        }
    }

    private boolean isLiteral(char c11) throws IOException {
        if (c11 == '\t' || c11 == '\n' || c11 == '\f' || c11 == '\r' || c11 == ' ') {
            return false;
        }
        if (c11 != '#') {
            if (c11 == ',') {
                return false;
            }
            if (c11 != '/' && c11 != '=') {
                if (c11 == '{' || c11 == '}' || c11 == ':') {
                    return false;
                }
                if (c11 != ';') {
                    switch (c11) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    private int nextNonWhitespace(boolean z11) throws IOException {
        char c11;
        char[] cArr = this.buffer;
        int i11 = this.pos;
        int i12 = this.limit;
        while (true) {
            if (i11 == i12) {
                this.pos = i11;
                if (!fillBuffer(1)) {
                    if (!z11) {
                        return -1;
                    }
                    throw new EOFException("End of input" + locationString());
                }
                i11 = this.pos;
                i12 = this.limit;
            }
            int i13 = i11 + 1;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.lineNumber++;
                this.lineStart = i13;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 == '/') {
                    this.pos = i13;
                    if (i13 == i12) {
                        this.pos = i11;
                        boolean fillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!fillBuffer) {
                            break;
                        }
                    }
                    checkLenient();
                    int i14 = this.pos;
                    char c12 = cArr[i14];
                    if (c12 == '*') {
                        this.pos = i14 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i11 = this.pos + 2;
                        i12 = this.limit;
                    } else {
                        if (c12 != '/') {
                            break;
                        }
                        this.pos = i14 + 1;
                        skipToEndOfLine();
                        i11 = this.pos;
                        i12 = this.limit;
                    }
                } else {
                    if (c11 != '#') {
                        this.pos = i13;
                        return c11;
                    }
                    this.pos = i13;
                    checkLenient();
                    skipToEndOfLine();
                    i11 = this.pos;
                    i12 = this.limit;
                }
            }
            i11 = i13;
        }
        return c11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.pos = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String nextQuotedValue(char c11) throws IOException {
        char[] cArr = this.buffer;
        StringBuilder sb2 = null;
        do {
            int i11 = this.pos;
            int i12 = this.limit;
            while (true) {
                int i13 = i12;
                int i14 = i11;
                while (i11 < i13) {
                    int i15 = i11 + 1;
                    char c12 = cArr[i11];
                    if (this.strictness == q.STRICT && c12 < ' ') {
                        throw syntaxError("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    }
                    if (c12 == c11) {
                        this.pos = i15;
                        int i16 = (i15 - i14) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i14, i16);
                        }
                        sb2.append(cArr, i14, i16);
                        return sb2.toString();
                    }
                    if (c12 == '\\') {
                        this.pos = i15;
                        int i17 = i15 - i14;
                        int i18 = i17 - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max(i17 * 2, 16));
                        }
                        sb2.append(cArr, i14, i18);
                        sb2.append(readEscapeCharacter());
                        i11 = this.pos;
                        i12 = this.limit;
                    } else {
                        if (c12 == '\n') {
                            this.lineNumber++;
                            this.lineStart = i15;
                        }
                        i11 = i15;
                    }
                }
                break;
            }
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        checkLenient();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String nextUnquotedValue() throws IOException {
        String sb2;
        StringBuilder sb3 = null;
        int i11 = 0;
        do {
            int i12 = 0;
            while (true) {
                int i13 = this.pos;
                if (i13 + i12 < this.limit) {
                    char c11 = this.buffer[i13 + i12];
                    if (c11 != '\t' && c11 != '\n' && c11 != '\f' && c11 != '\r' && c11 != ' ') {
                        if (c11 != '#') {
                            if (c11 != ',') {
                                if (c11 != '/' && c11 != '=') {
                                    if (c11 != '{' && c11 != '}' && c11 != ':') {
                                        if (c11 != ';') {
                                            switch (c11) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i12++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i12 >= this.buffer.length) {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i12, 16));
                    }
                    sb3.append(this.buffer, this.pos, i12);
                    this.pos += i12;
                } else if (fillBuffer(i12 + 1)) {
                }
            }
            i11 = i12;
            if (sb3 != null) {
                sb2 = new String(this.buffer, this.pos, i11);
            } else {
                sb3.append(this.buffer, this.pos, i11);
                sb2 = sb3.toString();
            }
            this.pos += i11;
            return sb2;
        } while (fillBuffer(1));
        if (sb3 != null) {
        }
        this.pos += i11;
        return sb2;
    }

    private int peekKeyword() throws IOException {
        String str;
        String str2;
        int i11;
        char c11 = this.buffer[this.pos];
        if (c11 == 't' || c11 == 'T') {
            str = "true";
            str2 = "TRUE";
            i11 = 5;
        } else if (c11 == 'f' || c11 == 'F') {
            str = "false";
            str2 = "FALSE";
            i11 = 6;
        } else {
            if (c11 != 'n' && c11 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i11 = 7;
        }
        boolean z11 = this.strictness != q.STRICT;
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (this.pos + i12 >= this.limit && !fillBuffer(i12 + 1)) {
                return 0;
            }
            char c12 = this.buffer[this.pos + i12];
            if (c12 != str.charAt(i12) && (!z11 || c12 != str2.charAt(i12))) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i11;
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r9 != 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        if (r10 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if (r11 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r13 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
    
        r19.peekedLong = r11;
        r19.pos += r8;
        r19.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r9 == 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r9 == 4) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r9 != 7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r19.peekedNumberLength = r8;
        r19.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0093, code lost:
    
        if (isLiteral(r14) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c8, code lost:
    
        return r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int peekNumber() throws IOException {
        int i11;
        char[] cArr = this.buffer;
        int i12 = this.pos;
        int i13 = this.limit;
        int i14 = 0;
        int i15 = 0;
        char c11 = 0;
        boolean z11 = false;
        int i16 = 1;
        long j11 = 0;
        while (true) {
            char c12 = 2;
            if (i12 + i15 == i13) {
                if (i15 == cArr.length) {
                    return i14;
                }
                if (!fillBuffer(i15 + 1)) {
                    i11 = i14;
                    break;
                }
                i12 = this.pos;
                i13 = this.limit;
            }
            char c13 = cArr[i12 + i15];
            i11 = i14;
            if (c13 != '+') {
                if (c13 == 'E' || c13 == 'e') {
                    if (c11 != 2 && c11 != 4) {
                        return i11;
                    }
                    c11 = 5;
                } else if (c13 == '-') {
                    c12 = 6;
                    if (c11 == 0) {
                        c11 = 1;
                        z11 = true;
                    } else if (c11 != 5) {
                        return i11;
                    }
                } else if (c13 != '.') {
                    if (c13 < '0' || c13 > '9') {
                        break;
                    }
                    if (c11 == 1 || c11 == 0) {
                        j11 = -(c13 - '0');
                    } else if (c11 == 2) {
                        if (j11 == 0) {
                            return i11;
                        }
                        long j12 = (10 * j11) - (c13 - '0');
                        i16 &= (j11 > MIN_INCOMPLETE_INTEGER || (j11 == MIN_INCOMPLETE_INTEGER && j12 < j11)) ? 1 : i11;
                        j11 = j12;
                    } else if (c11 == 3) {
                        c11 = 4;
                    } else if (c11 == 5 || c11 == 6) {
                        c11 = 7;
                    }
                } else {
                    if (c11 != 2) {
                        return i11;
                    }
                    c11 = 3;
                }
                i15++;
                i14 = i11;
            } else {
                c12 = 6;
                if (c11 != 5) {
                    return i11;
                }
            }
            c11 = c12;
            i15++;
            i14 = i11;
        }
    }

    private void push(int i11) throws MalformedJsonException {
        int i12 = this.stackSize;
        if (i12 - 1 >= this.nestingLimit) {
            throw new MalformedJsonException("Nesting limit " + this.nestingLimit + " reached" + locationString());
        }
        int[] iArr = this.stack;
        if (i12 == iArr.length) {
            int i13 = i12 * 2;
            this.stack = Arrays.copyOf(iArr, i13);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i13);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i13);
        }
        int[] iArr2 = this.stack;
        int i14 = this.stackSize;
        this.stackSize = i14 + 1;
        iArr2[i14] = i11;
    }

    private char readEscapeCharacter() throws IOException {
        int i11;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i12 = this.pos;
        int i13 = i12 + 1;
        this.pos = i13;
        char c11 = cArr[i12];
        if (c11 != '\n') {
            if (c11 != '\"') {
                if (c11 != '\'') {
                    if (c11 != '/' && c11 != '\\') {
                        if (c11 == 'b') {
                            return '\b';
                        }
                        if (c11 == 'f') {
                            return '\f';
                        }
                        if (c11 == 'n') {
                            return '\n';
                        }
                        if (c11 == 'r') {
                            return '\r';
                        }
                        if (c11 == 't') {
                            return '\t';
                        }
                        if (c11 != 'u') {
                            throw syntaxError("Invalid escape sequence");
                        }
                        if (i12 + 5 > this.limit && !fillBuffer(4)) {
                            throw syntaxError("Unterminated escape sequence");
                        }
                        int i14 = this.pos;
                        int i15 = i14 + 4;
                        int i16 = 0;
                        while (i14 < i15) {
                            char[] cArr2 = this.buffer;
                            char c12 = cArr2[i14];
                            int i17 = i16 << 4;
                            if (c12 >= '0' && c12 <= '9') {
                                i11 = c12 - '0';
                            } else if (c12 >= 'a' && c12 <= 'f') {
                                i11 = c12 - 'W';
                            } else {
                                if (c12 < 'A' || c12 > 'F') {
                                    throw syntaxError("Malformed Unicode escape \\u".concat(new String(cArr2, this.pos, 4)));
                                }
                                i11 = c12 - '7';
                            }
                            i16 = i11 + i17;
                            i14++;
                        }
                        this.pos += 4;
                        return (char) i16;
                    }
                }
            }
            return c11;
        }
        if (this.strictness == q.STRICT) {
            throw syntaxError("Cannot escape a newline character in strict mode");
        }
        this.lineNumber++;
        this.lineStart = i13;
        if (this.strictness == q.STRICT) {
            throw syntaxError("Invalid escaped character \"'\" in strict mode");
        }
        return c11;
    }

    private void skipQuotedValue(char c11) throws IOException {
        char[] cArr = this.buffer;
        do {
            int i11 = this.pos;
            int i12 = this.limit;
            while (i11 < i12) {
                int i13 = i11 + 1;
                char c12 = cArr[i11];
                if (c12 == c11) {
                    this.pos = i13;
                    return;
                }
                if (c12 == '\\') {
                    this.pos = i13;
                    readEscapeCharacter();
                    i11 = this.pos;
                    i12 = this.limit;
                } else {
                    if (c12 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i13;
                    }
                    i11 = i13;
                }
            }
            this.pos = i11;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i11 = this.pos;
            if (cArr[i11] != '\n') {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.buffer[this.pos + i12] != str.charAt(i12)) {
                        break;
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i11 + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() throws IOException {
        char c11;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i11 = this.pos;
            int i12 = i11 + 1;
            this.pos = i12;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.lineNumber++;
                this.lineStart = i12;
                return;
            }
        } while (c11 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        checkLenient();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void skipUnquotedValue() throws IOException {
        do {
            int i11 = 0;
            while (true) {
                int i12 = this.pos;
                if (i12 + i11 < this.limit) {
                    char c11 = this.buffer[i12 + i11];
                    if (c11 != '\t' && c11 != '\n' && c11 != '\f' && c11 != '\r' && c11 != ' ') {
                        if (c11 != '#') {
                            if (c11 != ',') {
                                if (c11 != '/' && c11 != '=') {
                                    if (c11 != '{' && c11 != '}' && c11 != ':') {
                                        if (c11 != ';') {
                                            switch (c11) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.pos = i12 + i11;
                }
            }
            this.pos += i11;
            return;
        } while (fillBuffer(1));
    }

    private MalformedJsonException syntaxError(String str) throws MalformedJsonException {
        StringBuilder e11 = C3261b.e(str);
        e11.append(locationString());
        e11.append("\nSee ");
        e11.append(s.a("malformed-json"));
        throw new MalformedJsonException(e11.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException unexpectedTokenError(String str) throws IOException {
        String str2 = peek() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder b11 = C6594f.b("Expected ", str, " but was ");
        b11.append(peek());
        b11.append(locationString());
        b11.append("\nSee ");
        b11.append(s.a(str2));
        return new IllegalStateException(b11.toString());
    }

    public void beginArray() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 != 3) {
            throw unexpectedTokenError("BEGIN_ARRAY");
        }
        push(1);
        this.pathIndices[this.stackSize - 1] = 0;
        this.peeked = 0;
    }

    public void beginObject() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 != 1) {
            throw unexpectedTokenError("BEGIN_OBJECT");
        }
        push(3);
        this.peeked = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    int doPeek() throws IOException {
        int nextNonWhitespace;
        int[] iArr = this.stack;
        int i11 = this.stackSize;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int nextNonWhitespace2 = nextNonWhitespace(true);
            if (nextNonWhitespace2 != 44) {
                if (nextNonWhitespace2 != 59) {
                    if (nextNonWhitespace2 != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5 && (nextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (nextNonWhitespace != 59) {
                        if (nextNonWhitespace != 125) {
                            throw syntaxError("Unterminated object");
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    checkLenient();
                }
                int nextNonWhitespace3 = nextNonWhitespace(true);
                if (nextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (nextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (nextNonWhitespace3 == 125) {
                    if (i12 == 5) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 2;
                    return 2;
                }
                checkLenient();
                this.pos--;
                if (!isLiteral((char) nextNonWhitespace3)) {
                    throw syntaxError("Expected name");
                }
                this.peeked = 14;
                return 14;
            }
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i13 = this.pos;
                        if (cArr[i13] == '>') {
                            this.pos = i13 + 1;
                        }
                    }
                }
            } else if (i12 == 6) {
                if (this.strictness == q.LENIENT) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i12 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (nextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
            if (nextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (nextNonWhitespace5 != 93) {
                if (nextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int peekKeyword = peekKeyword();
                if (peekKeyword != 0) {
                    return peekKeyword;
                }
                int peekNumber = peekNumber();
                if (peekNumber != 0) {
                    return peekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i12 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i12 != 1 && i12 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 != 4) {
            throw unexpectedTokenError("END_ARRAY");
        }
        int i12 = this.stackSize;
        this.stackSize = i12 - 1;
        int[] iArr = this.pathIndices;
        int i13 = i12 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.peeked = 0;
    }

    public void endObject() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 != 2) {
            throw unexpectedTokenError("END_OBJECT");
        }
        int i12 = this.stackSize;
        int i13 = i12 - 1;
        this.stackSize = i13;
        this.pathNames[i13] = null;
        int[] iArr = this.pathIndices;
        int i14 = i12 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.peeked = 0;
    }

    public final int getNestingLimit() {
        return this.nestingLimit;
    }

    public String getPreviousPath() {
        return getPath(true);
    }

    public final q getStrictness() {
        return this.strictness;
    }

    public boolean hasNext() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        return (i11 == 2 || i11 == 4 || i11 == 17) ? false : true;
    }

    public final boolean isLenient() {
        return this.strictness == q.LENIENT;
    }

    String locationString() {
        StringBuilder a11 = C2438a.a(" at line ", this.lineNumber + 1, " column ", " path ", (this.pos - this.lineStart) + 1);
        a11.append(getPath());
        return a11.toString();
    }

    public boolean nextBoolean() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i12 = this.stackSize - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        }
        if (i11 != 6) {
            throw unexpectedTokenError("a boolean");
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i13 = this.stackSize - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i12 = this.stackSize - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.peekedLong;
        }
        if (i11 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (i11 == 8 || i11 == 9) {
            this.peekedString = nextQuotedValue(i11 == 8 ? '\'' : '\"');
        } else if (i11 == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (i11 != 11) {
            throw unexpectedTokenError("a double");
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        if (this.strictness != q.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw syntaxError("JSON forbids NaN and infinities: " + parseDouble);
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i13 = this.stackSize - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return parseDouble;
    }

    public int nextInt() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 == 15) {
            long j11 = this.peekedLong;
            int i12 = (int) j11;
            if (j11 != i12) {
                throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i13 = this.stackSize - 1;
            iArr[i13] = iArr[i13] + 1;
            return i12;
        }
        if (i11 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i11 != 8 && i11 != 9 && i11 != 10) {
                throw unexpectedTokenError("an int");
            }
            if (i11 == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i11 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i14 = this.stackSize - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        int i15 = (int) parseDouble;
        if (i15 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i16 = this.stackSize - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return i15;
    }

    public long nextLong() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i12 = this.stackSize - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.peekedLong;
        }
        if (i11 == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i11 != 8 && i11 != 9 && i11 != 10) {
                throw unexpectedTokenError("a long");
            }
            if (i11 == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i11 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i13 = this.stackSize - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double parseDouble = Double.parseDouble(this.peekedString);
        long j11 = (long) parseDouble;
        if (j11 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i14 = this.stackSize - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return j11;
    }

    public String nextName() throws IOException {
        String nextQuotedValue;
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 == 14) {
            nextQuotedValue = nextUnquotedValue();
        } else if (i11 == 12) {
            nextQuotedValue = nextQuotedValue('\'');
        } else {
            if (i11 != 13) {
                throw unexpectedTokenError("a name");
            }
            nextQuotedValue = nextQuotedValue('\"');
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = nextQuotedValue;
        return nextQuotedValue;
    }

    public void nextNull() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 != 7) {
            throw unexpectedTokenError("null");
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i12 = this.stackSize - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public String nextString() throws IOException {
        String str;
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        if (i11 == 10) {
            str = nextUnquotedValue();
        } else if (i11 == 8) {
            str = nextQuotedValue('\'');
        } else if (i11 == 9) {
            str = nextQuotedValue('\"');
        } else if (i11 == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (i11 == 15) {
            str = Long.toString(this.peekedLong);
        } else {
            if (i11 != 16) {
                throw unexpectedTokenError("a string");
            }
            str = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i12 = this.stackSize - 1;
        iArr[i12] = iArr[i12] + 1;
        return str;
    }

    public JsonToken peek() throws IOException {
        int i11 = this.peeked;
        if (i11 == 0) {
            i11 = doPeek();
        }
        switch (i11) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Deprecated
    public final void setLenient(boolean z11) {
        setStrictness(z11 ? q.LENIENT : q.LEGACY_STRICT);
    }

    public final void setNestingLimit(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(b.a(i11, "Invalid nesting limit: "));
        }
        this.nestingLimit = i11;
    }

    public final void setStrictness(q qVar) {
        Objects.requireNonNull(qVar);
        this.strictness = qVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws IOException {
        int i11 = 0;
        do {
            int i12 = this.peeked;
            if (i12 == 0) {
                i12 = doPeek();
            }
            switch (i12) {
                case 1:
                    push(3);
                    i11++;
                    this.peeked = 0;
                    break;
                case 2:
                    if (i11 == 0) {
                        this.pathNames[this.stackSize - 1] = null;
                    }
                    this.stackSize--;
                    i11--;
                    this.peeked = 0;
                    break;
                case 3:
                    push(1);
                    i11++;
                    this.peeked = 0;
                    break;
                case 4:
                    this.stackSize--;
                    i11--;
                    this.peeked = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.peeked = 0;
                    break;
                case 8:
                    skipQuotedValue('\'');
                    this.peeked = 0;
                    break;
                case 9:
                    skipQuotedValue('\"');
                    this.peeked = 0;
                    break;
                case 10:
                    skipUnquotedValue();
                    this.peeked = 0;
                    break;
                case 12:
                    skipQuotedValue('\'');
                    if (i11 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 13:
                    skipQuotedValue('\"');
                    if (i11 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 14:
                    skipUnquotedValue();
                    if (i11 == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 16:
                    this.pos += this.peekedNumberLength;
                    this.peeked = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i11 > 0);
        int[] iArr = this.pathIndices;
        int i13 = this.stackSize - 1;
        iArr[i13] = iArr[i13] + 1;
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }

    public String getPath() {
        return getPath(false);
    }
}
