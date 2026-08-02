package org.objectweb.asm.signature;

/* loaded from: classes10.dex */
public class SignatureReader {
    private final String signatureValue;

    public SignatureReader(String str) {
        this.signatureValue = str;
    }

    public void accept(SignatureVisitor signatureVisitor) {
        char charAt;
        String str = this.signatureValue;
        int length = str.length();
        int i = 0;
        if (str.charAt(0) == '<') {
            i = 2;
            do {
                int indexOf = str.indexOf(58, i);
                signatureVisitor.visitFormalTypeParameter(str.substring(i - 1, indexOf));
                int i2 = indexOf + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'L' || charAt2 == '[' || charAt2 == 'T') {
                    i2 = parseType(str, i2, signatureVisitor.visitClassBound());
                }
                while (true) {
                    i = i2 + 1;
                    charAt = str.charAt(i2);
                    if (charAt != ':') {
                        break;
                    } else {
                        i2 = parseType(str, i, signatureVisitor.visitInterfaceBound());
                    }
                }
            } while (charAt != '>');
        }
        if (str.charAt(i) == '(') {
            int i3 = i + 1;
            while (str.charAt(i3) != ')') {
                i3 = parseType(str, i3, signatureVisitor.visitParameterType());
            }
            int parseType = parseType(str, i3 + 1, signatureVisitor.visitReturnType());
            while (parseType < length) {
                parseType = parseType(str, parseType + 1, signatureVisitor.visitExceptionType());
            }
            return;
        }
        int parseType2 = parseType(str, i, signatureVisitor.visitSuperclass());
        while (parseType2 < length) {
            parseType2 = parseType(str, parseType2, signatureVisitor.visitInterface());
        }
    }

    public void acceptType(SignatureVisitor signatureVisitor) {
        parseType(this.signatureValue, 0, signatureVisitor);
    }

    private static int parseType(String str, int i, SignatureVisitor signatureVisitor) {
        int i2;
        char charAt;
        int i3 = i + 1;
        char charAt2 = str.charAt(i);
        if (charAt2 != 'F') {
            if (charAt2 == 'L') {
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    int i4 = i3;
                    while (true) {
                        i2 = i3 + 1;
                        charAt = str.charAt(i3);
                        if (charAt == '.' || charAt == ';') {
                            break;
                        }
                        if (charAt == '<') {
                            String substring = str.substring(i4, i3);
                            if (z2) {
                                signatureVisitor.visitInnerClassType(substring);
                            } else {
                                signatureVisitor.visitClassType(substring);
                            }
                            i3 = i2;
                            while (true) {
                                char charAt3 = str.charAt(i3);
                                if (charAt3 == '>') {
                                    break;
                                }
                                if (charAt3 == '*') {
                                    i3++;
                                    signatureVisitor.visitTypeArgument();
                                } else if (charAt3 == '+' || charAt3 == '-') {
                                    i3 = parseType(str, i3 + 1, signatureVisitor.visitTypeArgument(charAt3));
                                } else {
                                    i3 = parseType(str, i3, signatureVisitor.visitTypeArgument(SignatureVisitor.INSTANCEOF));
                                }
                            }
                            z = true;
                        } else {
                            i3 = i2;
                        }
                    }
                    if (!z) {
                        String substring2 = str.substring(i4, i3);
                        if (z2) {
                            signatureVisitor.visitInnerClassType(substring2);
                        } else {
                            signatureVisitor.visitClassType(substring2);
                        }
                    }
                    if (charAt == ';') {
                        signatureVisitor.visitEnd();
                        return i2;
                    }
                    z = false;
                    z2 = true;
                    i3 = i2;
                }
            } else if (charAt2 != 'V' && charAt2 != 'I' && charAt2 != 'J' && charAt2 != 'S') {
                if (charAt2 == 'T') {
                    int indexOf = str.indexOf(59, i3);
                    signatureVisitor.visitTypeVariable(str.substring(i3, indexOf));
                    return indexOf + 1;
                }
                if (charAt2 != 'Z') {
                    if (charAt2 == '[') {
                        return parseType(str, i3, signatureVisitor.visitArrayType());
                    }
                    switch (charAt2) {
                        case 'B':
                        case 'C':
                        case 'D':
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        signatureVisitor.visitBaseType(charAt2);
        return i3;
    }
}
