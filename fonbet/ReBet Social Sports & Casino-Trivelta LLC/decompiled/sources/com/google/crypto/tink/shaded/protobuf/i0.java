package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public abstract class i0 {

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC3476h f37321a;

        public a(AbstractC3476h abstractC3476h) {
            this.f37321a = abstractC3476h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0.b
        public byte byteAt(int i10) {
            return this.f37321a.b(i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0.b
        public int size() {
            return this.f37321a.size();
        }
    }

    public interface b {
        byte byteAt(int i10);

        int size();
    }

    public static String a(AbstractC3476h abstractC3476h) {
        return b(new a(abstractC3476h));
    }

    public static String b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte byteAt = bVar.byteAt(i10);
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
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String c(String str) {
        return a(AbstractC3476h.h(str));
    }
}
