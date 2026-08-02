package com.google.protobuf;

/* loaded from: classes9.dex */
final class TextFormatEscaper {

    /* renamed from: com.google.protobuf.TextFormatEscaper$2, reason: invalid class name */
    class AnonymousClass2 implements a {
        final /* synthetic */ byte[] val$input;

        AnonymousClass2(byte[] bArr) {
            this.val$input = bArr;
        }

        @Override // com.google.protobuf.TextFormatEscaper.a
        public byte byteAt(int i11) {
            return this.val$input[i11];
        }

        @Override // com.google.protobuf.TextFormatEscaper.a
        public int size() {
            return this.val$input.length;
        }
    }

    private interface a {
        byte byteAt(int i11);

        int size();
    }

    static String a(final ByteString byteString) {
        a aVar = new a() { // from class: com.google.protobuf.TextFormatEscaper.1
            @Override // com.google.protobuf.TextFormatEscaper.a
            public byte byteAt(int i11) {
                return ByteString.this.byteAt(i11);
            }

            @Override // com.google.protobuf.TextFormatEscaper.a
            public int size() {
                return ByteString.this.size();
            }
        };
        StringBuilder sb2 = new StringBuilder(aVar.size());
        for (int i11 = 0; i11 < aVar.size(); i11++) {
            byte byteAt = aVar.byteAt(i11);
            if (byteAt == 34) {
                sb2.append("\\\"");
            } else if (byteAt == 39) {
                sb2.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (byteAt < 32 || byteAt > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((byteAt & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) byteAt);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
